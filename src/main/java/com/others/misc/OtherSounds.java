package com.others.misc;

import net.minecraft.util.SoundEvent;

public class OtherSounds {
    public static SoundEvent music_disc_blockades;
    public static SoundEvent music_disc_first_date;
    public static SoundEvent music_disc_omae_wa_mu;
    public static SoundEvent music_disc_sfos;
    public static SoundEvent music_disc_traces;
    public static SoundEvent deepslate_break;

    public static void registerSounds() {
        music_disc_blockades = Methods.registerSound("music_disc.blockades");
        music_disc_first_date = Methods.registerSound("music_disc.first_date");
        music_disc_omae_wa_mu = Methods.registerSound("music_disc.omae_wa_mu");
        music_disc_sfos = Methods.registerSound("music_disc.sfos");
        music_disc_traces = Methods.registerSound("music_disc.traces");
        deepslate_break = Methods.registerSound("block.deepslate_break");
    }
    public static void register() {}
}
