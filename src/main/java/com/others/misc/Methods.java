package com.others.misc;

import com.others.MyOtherStuff;
import com.others.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;

/**
 * The Methods for my stuff in "others".
 */
@Mod(MyOtherStuff.mod_id)
public class Methods {
    /**
     * This is generating all the ores in the other mod, being used in {@link OreGeneration} with the ores being in {@link BlockInit}
     */
    static void genOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(Placement.RANGE.configure(
                new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().func_242731_b(amount));
    }

    /**
     * For registring sounds, it's being used in {@link OtherSounds}
     */
    static SoundEvent registerSound(String name) {
        ResourceLocation location = new ResourceLocation(MyOtherStuff.mod_id, name);
        SoundEvent event = new SoundEvent(location);
        event.setRegistryName(name);
        ForgeRegistries.SOUND_EVENTS.register(event);
        return event;
    }

    /**
     * Registering / generating ores
     */
    //public Methods() {
    //    MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::genOres);
    //}
}
