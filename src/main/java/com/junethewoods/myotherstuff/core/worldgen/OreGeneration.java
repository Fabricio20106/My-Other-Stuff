package com.junethewoods.myotherstuff.core.worldgen;

import com.junethewoods.myotherstuff.core.init.BlockInit;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OreGeneration {
    public static void genDiaemeraldOre(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.diaemerald_ore.get().defaultBlockState(), 5, 0, 16, 2);
        }
    }

    public static void genInnoOre(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.inno_ore.get().defaultBlockState(), 8, 20, 64, 4);
        }
    }

    public static void genPurpleOre(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, BlockInit.purple_ore.get().defaultBlockState(), 8, 32, 72, 4);
        }
    }

    public static void genCrystalOre(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, BlockInit.crystal_ore.get().defaultBlockState(), 6, 8, 36, 7);
        }
    }

    public static void genOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(
                new OreFeatureConfig(fillerType, state, veinSize)).decorated(Placement.RANGE.configured(
                new TopSolidRangeConfig(minHeight, 0, maxHeight))).squared().count(amount));
    }
}
