package net.dakotapride.createframed.registry;

import com.simibubi.create.AllBlocks;
import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.content.decoration.TrainTrapdoorBlock;
import com.simibubi.create.content.decoration.palettes.ConnectedGlassBlock;
import com.simibubi.create.content.decoration.palettes.ConnectedGlassPaneBlock;
import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour;
import com.simibubi.create.foundation.data.BuilderTransformers;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.simibubi.create.foundation.data.SharedProperties;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.dakotapride.createframed.CreateFramedMod;
import net.dakotapride.createframed.block.TintedConnectedGlassBlock;
import net.dakotapride.createframed.block.TintedConnectedGlassPaneBlock;
import net.dakotapride.createframed.block.behaviour.FramedGlassTrapdoorCTBehaviour;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorBlock;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.common.util.ForgeSoundType;

import static com.simibubi.create.Create.REGISTRATE;
import static com.simibubi.create.foundation.data.CreateRegistrate.connectedTextures;

@SuppressWarnings({"unused","removal"})
public class CreateFramedBlocks {
    private static final CreateRegistrate REGISTRATE = CreateFramedMod.REGISTRATE.creativeModeTab(() -> AllCreativeModeTabs.PALETTES_CREATIVE_TAB);

    public static final BlockEntry<ConnectedGlassBlock> RED_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "red_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.RED_STAINED_FRAMED_GLASS), Blocks.RED_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> ORANGE_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "orange_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.ORANGE_STAINED_FRAMED_GLASS), Blocks.ORANGE_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> YELLOW_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "yellow_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.YELLOW_STAINED_FRAMED_GLASS), Blocks.YELLOW_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> GREEN_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "green_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.GREEN_STAINED_FRAMED_GLASS), Blocks.GREEN_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> LIME_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "lime_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.LIME_STAINED_FRAMED_GLASS), Blocks.LIME_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> BLUE_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "blue_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.BLUE_STAINED_FRAMED_GLASS), Blocks.BLUE_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> LIGHT_BLUE_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "light_blue_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.LIGHT_BLUE_STAINED_FRAMED_GLASS), Blocks.LIGHT_BLUE_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> CYAN_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "cyan_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.CYAN_STAINED_FRAMED_GLASS), Blocks.CYAN_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> PURPLE_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "purple_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.PURPLE_STAINED_FRAMED_GLASS), Blocks.PURPLE_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> MAGENTA_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "magenta_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.MAGENTA_STAINED_FRAMED_GLASS), Blocks.MAGENTA_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> PINK_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "pink_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.PINK_STAINED_FRAMED_GLASS), Blocks.PINK_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> BLACK_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "black_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.BLACK_STAINED_FRAMED_GLASS), Blocks.BLACK_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> GRAY_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "gray_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.GRAY_STAINED_FRAMED_GLASS), Blocks.GRAY_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> LIGHT_GRAY_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "light_gray_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.LIGHT_GRAY_STAINED_FRAMED_GLASS), Blocks.LIGHT_GRAY_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> WHITE_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "white_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.WHITE_STAINED_FRAMED_GLASS), Blocks.WHITE_STAINED_GLASS);
    public static final BlockEntry<ConnectedGlassBlock> BROWN_STAINED_FRAMED_GLASS = CreateFramedBuilderTransformers.colouredFramedGlass(
            "brown_stained_framed_glass", () -> new SimpleCTBehaviour(CreateFramedSpriteShifts.BROWN_STAINED_FRAMED_GLASS), Blocks.BROWN_STAINED_GLASS);
    public static final BlockEntry<TintedConnectedGlassBlock> TINTED_FRAMED_GLASS = CreateFramedBuilderTransformers.tintedFramedGlass();

    public static final BlockEntry<ConnectedGlassPaneBlock> RED_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "red_stained_framed_glass", CreateFramedBlocks.RED_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.RED_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> ORANGE_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "orange_stained_framed_glass", CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.ORANGE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> YELLOW_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "yellow_stained_framed_glass", CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.YELLOW_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> GREEN_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "green_stained_framed_glass", CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.GREEN_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> LIME_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "lime_stained_framed_glass", CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.LIME_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> BLUE_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "blue_stained_framed_glass", CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.BLUE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> LIGHT_BLUE_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "light_blue_stained_framed_glass", CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.LIGHT_BLUE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> CYAN_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "cyan_stained_framed_glass", CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.CYAN_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> PURPLE_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "purple_stained_framed_glass", CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.PURPLE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> MAGENTA_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "magenta_stained_framed_glass", CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.MAGENTA_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> PINK_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "pink_stained_framed_glass", CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.PINK_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> BLACK_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "black_stained_framed_glass", CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.BLACK_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> GRAY_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "gray_stained_framed_glass", CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.GRAY_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> LIGHT_GRAY_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "light_gray_stained_framed_glass", CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.LIGHT_GRAY_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> WHITE_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "white_stained_framed_glass", CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.WHITE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<ConnectedGlassPaneBlock> BROWN_STAINED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.colouredFramedGlassPane(
            "brown_stained_framed_glass", CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.BROWN_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TintedConnectedGlassPaneBlock> TINTED_FRAMED_GLASS_PANE = CreateFramedBuilderTransformers.tintedFramedGlassPane(
            "tinted_framed_glass", CreateFramedBlocks.TINTED_FRAMED_GLASS, () -> CreateFramedSpriteShifts.TINTED_FRAMED_GLASS);

    public static final BlockEntry<FramedGlassSlidingDoorBlock> RED_STAINED_FRAMED_GLASS_DOOR =
            REGISTRATE.block("red_stained_framed_glass_door", FramedGlassSlidingDoorBlock::new)
                    .initialProperties(AllBlocks.FRAMED_GLASS_DOOR)
                    .properties(p -> p.sound(new ForgeSoundType(1, .7f, () -> SoundEvents.GLASS_BREAK,
                            () -> SoundEvents.GLASS_STEP, () -> SoundEvents.GLASS_PLACE,
                            () -> SoundEvents.GLASS_HIT, () -> SoundEvents.GLASS_FALL)))
                    .transform(CreateFramedBuilderTransformers.slidingDoor("red_stained_framed_glass"))
                    .properties(p -> p.color(MaterialColor.TERRACOTTA_RED).noOcclusion())
                    .register();

    public static final BlockEntry<TrainTrapdoorBlock> RED_STAINED_FRAMED_GLASS_TRAPDOOR =
            REGISTRATE.block("red_stained_framed_glass_trapdoor", TrainTrapdoorBlock::new)
                    .initialProperties(SharedProperties::softMetal)
                    .transform(BuilderTransformers.trapdoor(false))
                    .properties(p -> p.color(MaterialColor.COLOR_RED)
                            .sound(SoundType.GLASS)
                            .noOcclusion())
                    .onRegister(connectedTextures(() -> new FramedGlassTrapdoorCTBehaviour(CreateFramedSpriteShifts.RED_STAINED_FRAMED_GLASS)))
                    .addLayer(() -> RenderType::translucent)
                    .register();

    public static void register() {}

}
