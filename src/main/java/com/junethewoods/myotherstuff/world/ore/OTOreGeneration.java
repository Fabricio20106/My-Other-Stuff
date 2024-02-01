package com.junethewoods.myotherstuff.world.ore;

import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.config.OTConfigs;
import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Feature;
import net.minecraft.world.gen.feature.OreFeatureConfig;
import net.minecraft.world.gen.feature.template.RuleTest;
import net.minecraft.world.gen.feature.template.TagMatchRuleTest;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.placement.TopSolidRangeConfig;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;

public class OTOreGeneration {
    public static final RuleTest DEEPSLATE_REPLACEABLES = new TagMatchRuleTest(OTTags.Blocks.DEEPSLATE_REPLACEABLES);

    public static void generateDiaemeraldOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, OTBlocks.DIAEMERALD_ORE.get().defaultBlockState(), 3, 0, 8, 2);
            generateOre(event.getGeneration(), DEEPSLATE_REPLACEABLES, OTBlocks.DEEPSLATE_DIAEMERALD_ORE.get().defaultBlockState(), 3, 0, 8, 2);
        }
    }

    public static void generateMagenticCrystalOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, OTBlocks.MAGENTIC_CRYSTAL_ORE.get().defaultBlockState(), 5, 8, 36, 6);
            generateOre(event.getGeneration(), DEEPSLATE_REPLACEABLES, OTBlocks.DEEPSLATE_MAGENTIC_CRYSTAL_ORE.get().defaultBlockState(), 5, 8, 36, 6);
        }
    }

    public static void generateInnoOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory() == Biome.Category.NETHER || event.getCategory() == Biome.Category.THEEND)) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NATURAL_STONE, OTBlocks.INNO_ORE.get().defaultBlockState(), 9, 0, 32, 2);
        }
    }

    public static void generateNetherOres(final BiomeLoadingEvent event) {
        if (event.getCategory() == Biome.Category.NETHER) {
            generateOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.NETHER_ORE_REPLACEABLES, OTBlocks.NETHER_ORE.get().defaultBlockState(), 6, 32, 80, 10);
        }
    }

    public static void generateOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.addFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.configured(new OreFeatureConfig(fillerType, state, veinSize)).decorated(Placement.RANGE.configured(new TopSolidRangeConfig(minHeight, 0, maxHeight))).squared()
                .count(amount));
    }
}
