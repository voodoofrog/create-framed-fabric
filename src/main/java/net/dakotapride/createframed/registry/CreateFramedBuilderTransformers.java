package net.dakotapride.createframed.registry;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.content.decoration.encasing.EncasedCTBehaviour;
import com.simibubi.create.content.decoration.palettes.ConnectedGlassBlock;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.ConnectedTextureBehaviour;
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.builders.BlockBuilder;
import com.tterrag.registrate.util.entry.BlockEntry;
import com.tterrag.registrate.util.nullness.NonNullUnaryOperator;
import net.dakotapride.createframed.CreateFramedMod;
import net.dakotapride.createframed.block.TintedConnectedGlassBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.BlockState;

import java.util.function.Supplier;

import static com.simibubi.create.foundation.data.CreateRegistrate.casingConnectivity;
import static com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures;

@SuppressWarnings({"unused","removal"})
public class CreateFramedBuilderTransformers {
    private static final CreateRegistrate REGISTRATE = CreateFramedMod.REGISTRATE.creativeModeTab(() -> AllCreativeModeTabs.PALETTES_CREATIVE_TAB);

    public static BlockEntry<ConnectedGlassBlock> colouredFramedGlass(String name,
                                                                      Supplier<ConnectedTextureBehaviour> behaviour,
                                                                      Block stainedBlock) {
        return REGISTRATE.block(name, ConnectedGlassBlock::new)
                .onRegister(connectedTextures(behaviour))
                .addLayer(() -> RenderType::translucent)
                .initialProperties(() -> stainedBlock)
                .properties((p) -> p.isValidSpawn(CreateFramedBuilderTransformers::never)
                        .isRedstoneConductor(CreateFramedBuilderTransformers::never)
                        .isSuffocating(CreateFramedBuilderTransformers::never)
                        .isViewBlocking(CreateFramedBuilderTransformers::never)
                        .noOcclusion())
                .item()
                .build()
                .register();
    }

    public static BlockEntry<TintedConnectedGlassBlock> tintedFramedGlass() {
        return REGISTRATE.block("tinted_framed_glass", TintedConnectedGlassBlock::new)
                .onRegister(connectedTextures(() -> new SimpleCTBehaviour(CreateFramedSpriteShifts.TINTED_FRAMED_GLASS)))
                .addLayer(() -> RenderType::translucent)
                .initialProperties(() -> Blocks.TINTED_GLASS)
                .properties((p) -> p.isValidSpawn(CreateFramedBuilderTransformers::never)
                        .isRedstoneConductor(CreateFramedBuilderTransformers::never)
                        .isSuffocating(CreateFramedBuilderTransformers::never)
                        .isViewBlocking(CreateFramedBuilderTransformers::never)
                        .noOcclusion())
                .item()
                .build()
                .register();
    }

    private static boolean never(BlockState p_235436_0_, BlockGetter p_235436_1_, BlockPos p_235436_2_) {
        return false;
    }

    private static Boolean never(BlockState p_235427_0_, BlockGetter p_235427_1_, BlockPos p_235427_2_,
                                 EntityType<?> p_235427_3_) {
        return false;
    }
}
