package com.junethewoods.myotherstuff.core.misc;

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
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.diaemerald_ore.get().getDefaultState(), 5, 0, 16, 2);
        }
    }
    public static void genInnoOre(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.inno_ore.get().getDefaultState(), 8, 20, 64, 4);
        }
    }
    public static void genPurpleOre(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockInit.purple_ore.get().getDefaultState(), 8, 32, 72, 4);
        }
    }
    public static void genCrystalOre(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.crystal_ore.get().getDefaultState(), 6, 8, 36, 7);
        }
    }
    public static void genOre(BiomeGenerationSettingsBuilder settings, RuleTest fillerType, BlockState state, int veinSize, int minHeight, int maxHeight, int amount) {
        settings.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Feature.ORE.withConfiguration(
                new OreFeatureConfig(fillerType, state, veinSize)).withPlacement(Placement.RANGE.configure(
                new TopSolidRangeConfig(minHeight, 0, maxHeight))).square().func_242731_b(amount));
    }
}
