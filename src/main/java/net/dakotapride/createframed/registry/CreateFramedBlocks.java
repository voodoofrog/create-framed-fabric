package net.dakotapride.createframed.registry;

import com.simibubi.create.AllCreativeModeTabs;
import com.simibubi.create.content.decoration.palettes.ConnectedGlassBlock;
import com.simibubi.create.foundation.block.connected.SimpleCTBehaviour;
import com.simibubi.create.foundation.data.CreateRegistrate;
import com.tterrag.registrate.util.entry.BlockEntry;
import net.dakotapride.createframed.CreateFramedMod;
import net.dakotapride.createframed.block.TintedConnectedGlassBlock;
import net.minecraft.world.level.block.Blocks;

@SuppressWarnings({"unused"})
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

    public static void register() {}

}
