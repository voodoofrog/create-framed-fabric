package net.dakotapride.createframed.registry;

import com.simibubi.create.foundation.utility.Components;
import net.dakotapride.createframed.CreateFramedMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings("unused")
public class CreateFramedTabs {
    private static final DeferredRegister<CreativeModeTab> REGISTER =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, CreateFramedMod.ID);
    
    public static final RegistryObject<CreativeModeTab> CREATE_FRAMED = REGISTER.register("create_framed",
            () -> CreativeModeTab.builder()
                    .title(Components.translatable("itemGroup.createframed.create_framed"))
                    .withTabsBefore(CreativeModeTabs.SPAWN_EGGS)
                    .icon(CreateFramedBlocks.RED_STAINED_TILED_GLASS_PANE::asStack)
                    .displayItems(new ItemsGenerator())
                    .build());
    
    public static class ItemsGenerator implements CreativeModeTab.DisplayItemsGenerator {
        
        @Override
        public void accept(CreativeModeTab.@NotNull ItemDisplayParameters p, CreativeModeTab.Output o) {
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.RED_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.RED_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.RED_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_RED_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_RED_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_RED_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_RED_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.ORANGE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_ORANGE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_ORANGE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_ORANGE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_ORANGE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.YELLOW_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_YELLOW_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_YELLOW_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_YELLOW_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_YELLOW_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.GREEN_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.GREEN_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.GREEN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_GREEN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_GREEN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_GREEN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_GREEN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.LIME_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.LIME_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.LIME_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIME_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIME_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_LIME_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_LIME_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.BLUE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.BLUE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_BLUE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_BLUE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.CYAN_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.CYAN_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.CYAN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_CYAN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_CYAN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_CYAN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_CYAN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.PURPLE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_PURPLE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_PURPLE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_PURPLE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_PURPLE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.MAGENTA_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_MAGENTA_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_MAGENTA_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_MAGENTA_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_MAGENTA_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.PINK_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.PINK_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.PINK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_PINK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_PINK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_PINK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_PINK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.BLACK_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.BLACK_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.BLACK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLACK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_BLACK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_BLACK_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_BLACK_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.GRAY_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.GRAY_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.LIGHT_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_LIGHT_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_GRAY_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_LIGHT_GRAY_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.WHITE_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.WHITE_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.WHITE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_WHITE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_WHITE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_WHITE_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_WHITE_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.BROWN_STAINED_TILED_GLASS);
            o.accept(CreateFramedBlocks.BROWN_STAINED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.BROWN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_BROWN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_BROWN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_BROWN_STAINED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_BROWN_STAINED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS_DOOR);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS_TRAPDOOR);
            o.accept(CreateFramedBlocks.TINTED_TILED_GLASS);
            o.accept(CreateFramedBlocks.TINTED_TILED_GLASS_PANE);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.TINTED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.HORIZONTAL_TINTED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.HORIZONTAL_TINTED_FRAMED_GLASS_PANE);
            o.accept(CreateFramedBlocks.VERTICAL_TINTED_FRAMED_GLASS);
            o.accept(CreateFramedBlocks.VERTICAL_TINTED_FRAMED_GLASS_PANE);
        }
    }

    public static void register(IEventBus bus) {
        REGISTER.register(bus);
    }
}
