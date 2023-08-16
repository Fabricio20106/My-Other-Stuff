package com.junethewoods.myotherstuff.core.util;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class OTSounds {
    public static SoundEvent musicDiscBlockades;
    public static SoundEvent musicDiscFirstDate;
    public static SoundEvent musicDiscOmaeWaMu;
    public static SoundEvent musicDiscASkyFullOfStars;
    public static SoundEvent musicDiscTraces;
    public static SoundEvent blockDeepslateBreak;

    public static void registerSounds() {
        musicDiscBlockades = registerSound("music_disc.blockades");
        musicDiscFirstDate = registerSound("music_disc.first_date");
        musicDiscOmaeWaMu = registerSound("music_disc.omae_wa_mu");
        musicDiscASkyFullOfStars = registerSound("music_disc.sfos");
        musicDiscTraces = registerSound("music_disc.traces");
        blockDeepslateBreak = registerSound("block.deepslate.break");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(MyOtherStuff.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
