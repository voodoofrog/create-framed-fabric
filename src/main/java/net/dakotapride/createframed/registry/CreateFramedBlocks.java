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
import net.dakotapride.createframed.block.TintedFramedGlassTrapdoorBlock;
import net.dakotapride.createframed.block.behaviour.FramedGlassTrapdoorCTBehaviour;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorBlock;
import net.dakotapride.createframed.block.door.TintedFramedGlassSlidingDoorBlock;
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
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("red_stained_framed_glass", MaterialColor.TERRACOTTA_RED);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> ORANGE_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("orange_stained_framed_glass", MaterialColor.TERRACOTTA_ORANGE);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> YELLOW_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("yellow_stained_framed_glass", MaterialColor.TERRACOTTA_YELLOW);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> GREEN_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("green_stained_framed_glass", MaterialColor.TERRACOTTA_GREEN);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> LIME_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("lime_stained_framed_glass", MaterialColor.TERRACOTTA_LIGHT_GREEN);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> BLUE_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("blue_stained_framed_glass", MaterialColor.TERRACOTTA_BLUE);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> LIGHT_BLUE_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("light_blue_stained_framed_glass", MaterialColor.TERRACOTTA_LIGHT_BLUE);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> CYAN_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("cyan_stained_framed_glass", MaterialColor.TERRACOTTA_CYAN);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> PURPLE_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("purple_stained_framed_glass", MaterialColor.TERRACOTTA_PURPLE);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> MAGENTA_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("magenta_stained_framed_glass", MaterialColor.TERRACOTTA_MAGENTA);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> PINK_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("pink_stained_framed_glass", MaterialColor.TERRACOTTA_PINK);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> BLACK_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("black_stained_framed_glass", MaterialColor.TERRACOTTA_BLACK);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> GRAY_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("gray_stained_framed_glass", MaterialColor.TERRACOTTA_GRAY);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> LIGHT_GRAY_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("light_gray_stained_framed_glass", MaterialColor.TERRACOTTA_LIGHT_GRAY);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> WHITE_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("white_stained_framed_glass", MaterialColor.TERRACOTTA_WHITE);
    public static final BlockEntry<FramedGlassSlidingDoorBlock> BROWN_STAINED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.framedGlassSlidingDoor("brown_stained_framed_glass", MaterialColor.TERRACOTTA_BROWN);
    public static final BlockEntry<TintedFramedGlassSlidingDoorBlock> TINTED_FRAMED_GLASS_DOOR =
            CreateFramedBuilderTransformers.tintedFramedGlassSlidingDoor("tinted_framed_glass", MaterialColor.COLOR_BLACK);

    public static final BlockEntry<TrainTrapdoorBlock> RED_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("red_stained_framed_glass",
                    MaterialColor.TERRACOTTA_RED, CreateFramedSpriteShifts.RED_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> ORANGE_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("orange_stained_framed_glass",
                    MaterialColor.TERRACOTTA_ORANGE, CreateFramedSpriteShifts.ORANGE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> YELLOW_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("yellow_stained_framed_glass",
                    MaterialColor.TERRACOTTA_YELLOW, CreateFramedSpriteShifts.YELLOW_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> GREEN_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("green_stained_framed_glass",
                    MaterialColor.TERRACOTTA_GREEN, CreateFramedSpriteShifts.GREEN_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> LIME_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("lime_stained_framed_glass",
                    MaterialColor.TERRACOTTA_LIGHT_GREEN, CreateFramedSpriteShifts.LIME_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> BLUE_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("blue_stained_framed_glass",
                    MaterialColor.TERRACOTTA_BLUE, CreateFramedSpriteShifts.BLUE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> LIGHT_BLUE_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("light_blue_stained_framed_glass",
                    MaterialColor.TERRACOTTA_LIGHT_BLUE, CreateFramedSpriteShifts.LIGHT_BLUE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> CYAN_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("cyan_stained_framed_glass",
                    MaterialColor.TERRACOTTA_CYAN, CreateFramedSpriteShifts.CYAN_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> PURPLE_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("purple_stained_framed_glass",
                    MaterialColor.TERRACOTTA_PURPLE, CreateFramedSpriteShifts.PURPLE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> MAGENTA_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("magenta_stained_framed_glass",
                    MaterialColor.TERRACOTTA_MAGENTA, CreateFramedSpriteShifts.MAGENTA_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> PINK_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("pink_stained_framed_glass",
                    MaterialColor.TERRACOTTA_PINK, CreateFramedSpriteShifts.PINK_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> BLACK_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("black_stained_framed_glass",
                    MaterialColor.TERRACOTTA_BLACK, CreateFramedSpriteShifts.BLACK_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> GRAY_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("gray_stained_framed_glass",
                    MaterialColor.TERRACOTTA_GRAY, CreateFramedSpriteShifts.GRAY_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> LIGHT_GRAY_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("light_gray_stained_framed_glass",
                    MaterialColor.TERRACOTTA_LIGHT_GRAY, CreateFramedSpriteShifts.LIGHT_GRAY_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> WHITE_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("white_stained_framed_glass",
                    MaterialColor.TERRACOTTA_WHITE, CreateFramedSpriteShifts.WHITE_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TrainTrapdoorBlock> BROWN_STAINED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.framedGlassTrapdoor("brown_stained_framed_glass",
                    MaterialColor.TERRACOTTA_BROWN, CreateFramedSpriteShifts.BROWN_STAINED_FRAMED_GLASS);
    public static final BlockEntry<TintedFramedGlassTrapdoorBlock> TINTED_FRAMED_GLASS_TRAPDOOR =
            CreateFramedBuilderTransformers.tintedFramedGlassTrapdoor("tinted_framed_glass",
                    MaterialColor.COLOR_BLACK, CreateFramedSpriteShifts.TINTED_FRAMED_GLASS);

    public static void register() {}

}
