package net.dakotapride.createframed.mixin;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.content.contraptions.*;
import com.simibubi.create.content.contraptions.glue.SuperGlueEntity;
import com.simibubi.create.content.contraptions.pulley.PulleyBlock;
import com.simibubi.create.content.contraptions.pulley.PulleyBlockEntity;
import com.simibubi.create.content.fluids.tank.FluidTankBlockEntity;
import com.simibubi.create.content.kinetics.simpleRelays.ShaftBlock;
import com.simibubi.create.content.logistics.vault.ItemVaultBlockEntity;
import com.simibubi.create.foundation.blockEntity.IMultiBlockEntityContainer;
import com.simibubi.create.foundation.utility.Iterate;
import com.simibubi.create.foundation.utility.NBTProcessors;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.nbt.NbtUtils;
import net.minecraft.world.entity.ai.village.poi.PoiTypes;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.Rotation;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.phys.Vec3;
import org.apache.commons.lang3.tuple.Pair;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

import javax.annotation.Nullable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Mixin(value = Contraption.class, remap = false)
public class ContraptionMixin {
    @Shadow
    public BlockPos anchor;
    @Shadow
    public boolean disassembled;
    @Shadow
    protected Map<BlockPos, StructureTemplate.StructureBlockInfo> blocks;
    @Shadow
    protected List<AABB> superglue;
    @Shadow
    protected MountedStorageManager storage;
    @Shadow
    protected ContraptionWorld world;

    public ContraptionMixin() {
        blocks = new HashMap<>();
        superglue = new ArrayList<>();
        storage = new MountedStorageManager();
    }

    @Inject(method = "capture", at = @At("RETURN"), cancellable = true)
    private void capture(Level world, BlockPos pos, CallbackInfoReturnable<Pair<StructureTemplate.StructureBlockInfo, BlockEntity>> cir) {
        BlockState blockstate = world.getBlockState(pos);

        if (blockstate.hasProperty(FramedGlassSlidingDoorBlock.VISIBLE))
            blockstate = blockstate.setValue(FramedGlassSlidingDoorBlock.VISIBLE, false);

        CompoundTag compoundnbt = getBlockEntityNBT(world, pos);
        BlockEntity blockEntity = world.getBlockEntity(pos);

        cir.setReturnValue(Pair.of(new StructureTemplate.StructureBlockInfo(pos, blockstate, compoundnbt), blockEntity));
    }

    @Inject(method = "addBlocksToWorld", at = @At("HEAD"))
    private void addBlocksToWorld(Level world, StructureTransform transform, CallbackInfo ci) {
        if (disassembled)
            return;
        disassembled = true;

        for (boolean nonBrittles : Iterate.trueAndFalse) {
            for (StructureTemplate.StructureBlockInfo block : blocks.values()) {
                if (nonBrittles == BlockMovementChecks.isBrittle(block.state()))
                    continue;

                BlockPos targetPos = transform.apply(block.pos());
                BlockState state = transform.apply(block.state());

                if (customBlockPlacement(world, targetPos, state))
                    continue;

                if (nonBrittles)
                    for (Direction face : Iterate.directions)
                        state = state.updateShape(face, world.getBlockState(targetPos.relative(face)), world, targetPos,
                                targetPos.relative(face));

                BlockState blockState = world.getBlockState(targetPos);
                if (blockState.getDestroySpeed(world, targetPos) == -1 || (state.getCollisionShape(world, targetPos)
                        .isEmpty()
                        && !blockState.getCollisionShape(world, targetPos)
                        .isEmpty())) {
                    if (targetPos.getY() == world.getMinBuildHeight())
                        targetPos = targetPos.above();
                    world.levelEvent(2001, targetPos, Block.getId(state));
                    Block.dropResources(state, world, targetPos, null);
                    continue;
                }
                if (state.getBlock() instanceof SimpleWaterloggedBlock
                        && state.hasProperty(BlockStateProperties.WATERLOGGED)) {
                    FluidState FluidState = world.getFluidState(targetPos);
                    state = state.setValue(BlockStateProperties.WATERLOGGED, FluidState.getType() == Fluids.WATER);
                }

                world.destroyBlock(targetPos, true);

                if (AllBlocks.SHAFT.has(state))
                    state = ShaftBlock.pickCorrectShaftType(state, world, targetPos);
                if (state.hasProperty(FramedGlassSlidingDoorBlock.VISIBLE))
                    state = state.setValue(FramedGlassSlidingDoorBlock.VISIBLE, !state.getValue(FramedGlassSlidingDoorBlock.OPEN))
                            .setValue(FramedGlassSlidingDoorBlock.POWERED, false);

                world.setBlock(targetPos, state, Block.UPDATE_MOVE_BY_PISTON | Block.UPDATE_ALL);

                boolean verticalRotation = transform.rotationAxis == null || transform.rotationAxis.isHorizontal();
                verticalRotation = verticalRotation && transform.rotation != Rotation.NONE;
                if (verticalRotation) {
                    if (state.getBlock() instanceof PulleyBlock.RopeBlock || state.getBlock() instanceof PulleyBlock.MagnetBlock
                            || state.getBlock() instanceof DoorBlock)
                        world.destroyBlock(targetPos, true);
                }

                BlockEntity blockEntity = world.getBlockEntity(targetPos);

                CompoundTag tag = block.nbt();

                if (blockEntity != null)
                    tag = NBTProcessors.process(blockEntity, tag, false);
                if (blockEntity != null && tag != null) {
                    tag.putInt("x", targetPos.getX());
                    tag.putInt("y", targetPos.getY());
                    tag.putInt("z", targetPos.getZ());

                    if (verticalRotation && blockEntity instanceof PulleyBlockEntity) {
                        tag.remove("Offset");
                        tag.remove("InitialOffset");
                    }

                    if (blockEntity instanceof IMultiBlockEntityContainer && tag.contains("LastKnownPos"))
                        tag.put("LastKnownPos", NbtUtils.writeBlockPos(BlockPos.ZERO.below(Integer.MAX_VALUE - 1)));

                    blockEntity.load(tag);
                    storage.addStorageToWorld(block, blockEntity);
                }

                transform.apply(blockEntity);
            }
        }

        for (AABB box : superglue) {
            box = new AABB(transform.apply(new Vec3(box.minX, box.minY, box.minZ)),
                    transform.apply(new Vec3(box.maxX, box.maxY, box.maxZ)));
            if (!world.isClientSide)
                world.addFreshEntity(new SuperGlueEntity(world, box));
        }

        storage.clear();
    }

    @Inject(method = "shouldUpdateAfterMovement", at = @At("RETURN"), cancellable = true)
    private void shouldUpdateAfterMovement(StructureTemplate.StructureBlockInfo info, CallbackInfoReturnable<Boolean> cir) {
        if (PoiTypes.forState(info.state())
                .isPresent())
            cir.setReturnValue(false);
        if (info.state().getBlock() instanceof FramedGlassSlidingDoorBlock)
            cir.setReturnValue(false);
        cir.setReturnValue(true);
    }

    @Unique
    protected boolean customBlockPlacement(LevelAccessor world, BlockPos pos, BlockState state) {
        return false;
    }

    @Unique
    @Nullable
    protected CompoundTag getBlockEntityNBT(Level world, BlockPos pos) {
        BlockEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity == null)
            return null;
        CompoundTag nbt = blockEntity.saveWithFullMetadata();
        nbt.remove("x");
        nbt.remove("y");
        nbt.remove("z");

        if ((blockEntity instanceof FluidTankBlockEntity || blockEntity instanceof ItemVaultBlockEntity)
                && nbt.contains("Controller"))
            nbt.put("Controller",
                    NbtUtils.writeBlockPos(toLocalPos(NbtUtils.readBlockPos(nbt.getCompound("Controller")))));

        return nbt;
    }

    @Unique
    protected BlockPos toLocalPos(BlockPos globalPos) {
        return globalPos.subtract(anchor);
    }

}
