package com.junethewoods.myotherstuff.config;

import net.minecraftforge.common.ForgeConfigSpec;
import org.apache.commons.lang3.tuple.Pair;

public class OTConfigs {
    private static final Pair<OTCommonConfigs, ForgeConfigSpec> COMMON_CONFIG_PAIR = new ForgeConfigSpec.Builder().configure(OTCommonConfigs::new);
    public static final OTCommonConfigs COMMON_CONFIGS = COMMON_CONFIG_PAIR.getLeft();
    public static final ForgeConfigSpec COMMON_SPEC = COMMON_CONFIG_PAIR.getRight();
}
