package com.junethewoods.myotherstuff.util;

import com.junethewoods.myotherstuff.MyOtherStuff;
import net.minecraft.stats.IStatFormatter;
import net.minecraft.stats.Stats;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;

public class OTStats {
    public static final ResourceLocation INTERACT_WITH_TAILORING_BENCH = register("interact_with_tailoring_bench", IStatFormatter.DEFAULT);

    private static ResourceLocation register(String name, IStatFormatter statFormatter) {
        ResourceLocation registryName = MyOtherStuff.resourceLoc(name);
        Registry.register(Registry.CUSTOM_STAT, name, registryName);
        Stats.CUSTOM.get(registryName, statFormatter);
        return registryName;
    }

    public static void init() {}
}
