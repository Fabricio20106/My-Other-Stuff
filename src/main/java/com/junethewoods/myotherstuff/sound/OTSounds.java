package com.junethewoods.myotherstuff.sound;

import com.junethewoods.myotherstuff.MyOtherStuff;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class OTSounds {
    public static SoundEvent MUSIC_DISC_BLOCKADES;
    public static SoundEvent MUSIC_DISC_FIRST_DATE;
    public static SoundEvent MUSIC_DISC_OMAE_WA_MU;
    public static SoundEvent MUSIC_DISC_A_SKY_FULL_OF_STARS;
    public static SoundEvent MUSIC_DISC_TRACES;
    public static SoundEvent MUSIC_DISC_OTHERSIDE;
    public static SoundEvent MUSIC_DISC_RELIC;
    public static SoundEvent BLOCK_DEEPSLATE_BREAK;

    public static void registerSounds() {
        MUSIC_DISC_BLOCKADES = registerSound("music_disc.blockades");
        MUSIC_DISC_FIRST_DATE = registerSound("music_disc.first_date");
        MUSIC_DISC_OMAE_WA_MU = registerSound("music_disc.omae_wa_mu");
        MUSIC_DISC_A_SKY_FULL_OF_STARS = registerSound("music_disc.sfos");
        MUSIC_DISC_TRACES = registerSound("music_disc.traces");
        MUSIC_DISC_OTHERSIDE = registerSound("music_disc.otherside");
        MUSIC_DISC_RELIC = registerSound("music_disc.relic");
        BLOCK_DEEPSLATE_BREAK = registerSound("block.deepslate.break");
    }

    private static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(MyOtherStuff.MOD_ID, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
