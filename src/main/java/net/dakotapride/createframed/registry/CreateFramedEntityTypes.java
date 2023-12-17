package net.dakotapride.createframed.registry;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorBlockEntity;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorRenderer;

import static net.dakotapride.createframed.CreateFramedMod.REGISTRATE;

public class CreateFramedEntityTypes {

    public static final BlockEntityEntry<FramedGlassSlidingDoorBlockEntity> SLIDING_DOOR =
            REGISTRATE.blockEntity("sliding_door", FramedGlassSlidingDoorBlockEntity::new)
                    .renderer(() -> FramedGlassSlidingDoorRenderer::new)
                    .validBlocks(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS_DOOR,
                            CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS_DOOR,
                            CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS_DOOR,
                            CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS_DOOR,
                            CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS_DOOR,
                            CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS_DOOR, CreateFramedBlocks.TINTED_FRAMED_GLASS_DOOR)
                    .register();

    public static void register() {}
}
