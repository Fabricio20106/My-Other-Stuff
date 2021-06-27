package com.others.misc;

import com.others.MyOtherStuff;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.registries.ForgeRegistries;

public class OtherSounds {
    public static SoundEvent music_disc_blockades;
    public static SoundEvent music_disc_first_date;
    public static SoundEvent music_disc_omae_wa_mu;
    public static SoundEvent music_disc_sfos;
    public static SoundEvent music_disc_traces;
    public static SoundEvent deepslate_break;

    public static void registerSounds() {
        music_disc_blockades = registerSound("music_disc.blockades");
        music_disc_first_date = registerSound("music_disc.first_date");
        music_disc_omae_wa_mu = registerSound("music_disc.omae_wa_mu");
        music_disc_sfos = registerSound("music_disc.sfos");
        music_disc_traces = registerSound("music_disc.traces");
        deepslate_break = registerSound("block.deepslate_break");
    }

    public static void register() {}

    static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(MyOtherStuff.mod_id, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }
}
