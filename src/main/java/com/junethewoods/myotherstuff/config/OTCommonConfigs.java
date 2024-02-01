package com.junethewoods.myotherstuff.config;

import net.minecraftforge.common.ForgeConfigSpec;

public class OTCommonConfigs {
    public final ForgeConfigSpec.BooleanValue diaemeraldOreGeneration;
    public final ForgeConfigSpec.BooleanValue magenticCrystalOreGeneration;
    public final ForgeConfigSpec.BooleanValue innoOreGeneration;
    public final ForgeConfigSpec.BooleanValue netherOreGeneration;
    public final ForgeConfigSpec.BooleanValue azaleaTreeGeneration;

    public final ForgeConfigSpec.BooleanValue enableObtainingDiscontinuedItems;

    public OTCommonConfigs(ForgeConfigSpec.Builder builder) {
        builder.comment("Welcome to Other's (or My Other Stuff's) config file. This was made on 01/02/2024");

        builder.push("worldGeneration");
        this.diaemeraldOreGeneration = builder.comment("Should diaemerald ores generate in the Overworld.").define("diaemeraldOreGeneration", true);
        this.magenticCrystalOreGeneration = builder.comment("Should magentic crystal ores generate in the Overworld.").define("magenticCrystalOreGeneration", true);
        this.innoOreGeneration = builder.comment("Should inno ores generate in the Overworld.").define("innoOreGeneration", false);
        this.netherOreGeneration = builder.comment("Should nether ores generate in the Nether.").define("netherOreGeneration", false);
        this.azaleaTreeGeneration = builder.comment("Should (flowering) azalea trees spawn in biomes categorized as Forests.").define("azaleaTreeGeneration", true);
        builder.pop();

        builder.push("items");
        this.enableObtainingDiscontinuedItems = builder.comment("Enables obtaining discontinued items, such as finding Inno Flowers naturally").define("enableObtainingDiscontinuedItems", false);
        builder.pop();
    }
}
