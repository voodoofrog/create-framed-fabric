package net.dakotapride.createframed.block.door;

import com.simibubi.create.content.decoration.slidingDoor.SlidingDoorBlock;
import net.dakotapride.createframed.registry.CreateFramedEntityTypes;
import net.minecraft.world.level.block.entity.BlockEntityType;

public class FramedGlassSlidingDoorBlock extends SlidingDoorBlock {
    public FramedGlassSlidingDoorBlock(Properties properties) {
        super(properties, false);
    }

    @Override
    public BlockEntityType<? extends FramedGlassSlidingDoorBlockEntity> getBlockEntityType() {
        return CreateFramedEntityTypes.SLIDING_DOOR.get();
    }
}
