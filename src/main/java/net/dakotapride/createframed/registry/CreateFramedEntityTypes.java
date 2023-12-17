package net.dakotapride.createframed.registry;

import com.tterrag.registrate.util.entry.BlockEntityEntry;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorBlockEntity;
import net.dakotapride.createframed.block.door.FramedGlassSlidingDoorRenderer;

import static net.dakotapride.createframed.CreateFramedMod.REGISTRATE;

public class CreateFramedEntityTypes {

    public static final BlockEntityEntry<FramedGlassSlidingDoorBlockEntity> SLIDING_DOOR =
            REGISTRATE.blockEntity("sliding_door", FramedGlassSlidingDoorBlockEntity::new)
                    .renderer(() -> FramedGlassSlidingDoorRenderer::new)
                    .validBlocks(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_DOOR)
                    .register();

    public static void register() {}
}
