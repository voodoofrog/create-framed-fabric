package net.dakotapride.createframed.mixin;

import com.simibubi.create.content.contraptions.AbstractContraptionEntity;
import com.simibubi.create.content.contraptions.Contraption;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = AbstractContraptionEntity.class, remap = false)
public class AbstractContraptionEntityMixin {
    @Shadow
    protected Contraption contraption;

    @OnlyIn(Dist.CLIENT)
    @Inject(method = "handleBlockChange", at = @At("HEAD"))
    private void handleBlockChange(BlockPos localPos, BlockState newState, CallbackInfo ci) {
        if (contraption == null || !contraption.getBlocks().containsKey(localPos))
            return;
        StructureTemplate.StructureBlockInfo info = contraption.getBlocks().get(localPos);
        contraption.getBlocks().put(localPos, new StructureTemplate.StructureBlockInfo(info.pos(), newState, info.nbt()));
        if (info.state() != newState && !(newState.getBlock() instanceof SlidingDoorBlock))
            contraption.deferInvalidate = true;
        contraption.invalidateColliders();
    }
}
