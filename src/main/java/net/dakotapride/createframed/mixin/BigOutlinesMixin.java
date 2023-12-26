package net.dakotapride.createframed.mixin;

import com.simibubi.create.content.trains.track.TrackBlock;
import com.simibubi.create.foundation.block.BigOutlines;
import com.simibubi.create.foundation.utility.AnimationTickHolder;
import com.simibubi.create.foundation.utility.RaycastHelper;
import com.simibubi.create.foundation.utility.VecHelper;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorBlock;
import net.minecraft.client.Minecraft;
import net.minecraft.client.player.LocalPlayer;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.ai.attributes.AttributeInstance;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.Vec3;
import net.minecraftforge.common.ForgeMod;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value = BigOutlines.class, remap = false)
public class BigOutlinesMixin {
    @Shadow
    static BlockHitResult result = null;

    @Inject(method = "pick", at = @At("HEAD"))
    private static void pick(CallbackInfo ci) {
        Minecraft mc = Minecraft.getInstance();
        if (!(mc.cameraEntity instanceof LocalPlayer player))
            return;
        if (mc.level == null)
            return;

        result = null;

        Vec3 origin = player.getEyePosition(AnimationTickHolder.getPartialTicks(mc.level));

        double maxRange = mc.hitResult == null ? Double.MAX_VALUE
                : mc.hitResult.getLocation()
                .distanceToSqr(origin);

        AttributeInstance range = player.getAttribute(ForgeMod.BLOCK_REACH.get());
        Vec3 target = RaycastHelper.getTraceTarget(player, Math.min(maxRange, range.getValue()) + 1, origin);

        RaycastHelper.rayTraceUntil(origin, target, pos -> {
            BlockPos.MutableBlockPos p = BlockPos.ZERO.mutable();

            for (int x = -1; x <= 1; x++) {
                for (int z = -1; z <= 1; z++) {
                    p.set(pos.getX() + x, pos.getY(), pos.getZ() + z);
                    BlockState blockState = mc.level.getBlockState(p);

                    // Could be a dedicated interface for big blocks
                    if (!(blockState.getBlock() instanceof TrackBlock)
                            && !(blockState.getBlock() instanceof FramedGlassSlidingDoorBlock))
                        continue;

                    BlockHitResult hit = blockState.getInteractionShape(mc.level, p)
                            .clip(origin, target, p.immutable());
                    if (hit == null)
                        continue;

                    if (result != null && Vec3.atCenterOf(p)
                            .distanceToSqr(origin) >= Vec3.atCenterOf(result.getBlockPos())
                            .distanceToSqr(origin))
                        continue;

                    Vec3 vec = hit.getLocation();
                    double interactionDist = vec.distanceToSqr(origin);
                    if (interactionDist >= maxRange)
                        continue;

                    BlockPos hitPos = hit.getBlockPos();

                    // pacifies ServerGamePacketListenerImpl.handleUseItemOn
                    vec = vec.subtract(Vec3.atCenterOf(hitPos));
                    vec = VecHelper.clampComponentWise(vec, 1);
                    vec = vec.add(Vec3.atCenterOf(hitPos));

                    result = new BlockHitResult(vec, hit.getDirection(), hitPos, hit.isInside());
                }
            }

            return result != null;
        });

        if (result != null)
            mc.hitResult = result;
    }

}
