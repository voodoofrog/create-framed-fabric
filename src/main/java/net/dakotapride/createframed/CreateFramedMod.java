package net.dakotapride.createframed;

import com.mojang.logging.LogUtils;
import com.simibubi.create.foundation.data.CreateRegistrate;
import net.dakotapride.createframed.registry.CreateFramedBlocks;
import net.dakotapride.createframed.registry.CreateFramedEntityTypes;
import net.dakotapride.createframed.registry.CreateFramedTabs;
import net.fabricmc.api.ModInitializer;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

public class CreateFramedMod implements ModInitializer {
    // Directly reference a slf4j logger
    public static final String ID = "createframed";
    private static final Logger LOGGER = LogUtils.getLogger();
    public static final CreateRegistrate REGISTRATE = CreateRegistrate.create(ID);

    public static ResourceLocation asResource(String path) {
        return new ResourceLocation(ID, path);
    }

    @Override
    public void onInitialize() {
        CreateFramedBlocks.register();
        CreateFramedEntityTypes.register();
        CreateFramedTabs.register();
        REGISTRATE.register();
    }
}
