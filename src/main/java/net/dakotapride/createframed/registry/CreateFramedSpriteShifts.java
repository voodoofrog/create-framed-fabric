package net.dakotapride.createframed.registry;

import com.simibubi.create.foundation.block.connected.AllCTTypes;
import com.simibubi.create.foundation.block.connected.CTSpriteShiftEntry;
import com.simibubi.create.foundation.block.connected.CTSpriteShifter;
import com.simibubi.create.foundation.block.connected.CTType;
import net.dakotapride.createframed.CreateFramedMod;

public class CreateFramedSpriteShifts {
    public static final CTSpriteShiftEntry
        RED_STAINED_FRAMED_GLASS = omni("red_stained_framed_glass"),
        ORANGE_STAINED_FRAMED_GLASS = omni("orange_stained_framed_glass"),
        YELLOW_STAINED_FRAMED_GLASS = omni("yellow_stained_framed_glass"),
        GREEN_STAINED_FRAMED_GLASS = omni("green_stained_framed_glass"),
        LIME_STAINED_FRAMED_GLASS = omni("lime_stained_framed_glass"),
        BLUE_STAINED_FRAMED_GLASS = omni("blue_stained_framed_glass"),
        LIGHT_BLUE_STAINED_FRAMED_GLASS = omni("light_blue_stained_framed_glass"),
        CYAN_STAINED_FRAMED_GLASS = omni("cyan_stained_framed_glass"),
        PURPLE_STAINED_FRAMED_GLASS = omni("purple_stained_framed_glass"),
        MAGENTA_STAINED_FRAMED_GLASS = omni("magenta_stained_framed_glass"),
        PINK_STAINED_FRAMED_GLASS = omni("pink_stained_framed_glass"),
        BLACK_STAINED_FRAMED_GLASS = omni("black_stained_framed_glass"),
        GRAY_STAINED_FRAMED_GLASS = omni("gray_stained_framed_glass"),
        LIGHT_GRAY_STAINED_FRAMED_GLASS = omni("light_gray_stained_framed_glass"),
        WHITE_STAINED_FRAMED_GLASS = omni("white_stained_framed_glass"),
        BROWN_STAINED_FRAMED_GLASS = omni("brown_stained_framed_glass"),
        TINTED_FRAMED_GLASS = omni("tinted_framed_glass");


    private static CTSpriteShiftEntry omni(String name) {
        return getCT(AllCTTypes.OMNIDIRECTIONAL, name);
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName, String connectedTextureName) {
        return CTSpriteShifter.getCT(type, CreateFramedMod.asResource("block/" + blockTextureName), CreateFramedMod.asResource("block/" + connectedTextureName + "_connected"));
    }

    private static CTSpriteShiftEntry getCT(CTType type, String blockTextureName) {
        return getCT(type, blockTextureName, blockTextureName);
    }
}
