package com.others.misc;

import com.others.init.BlockInit;
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
    /*public static void genOres(final BiomeLoadingEvent event) {
        if (!(event.getCategory().equals(Biome.Category.NETHER) || event.getCategory().equals(Biome.Category.THEEND))) {
            Methods.genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.inno_ore.get().getDefaultState(), 8, 20, 64, 4);
            Methods.genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.diaemerald_ore.get().getDefaultState(), 8, 0, 16, 4);
            Methods.genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_NETHER, BlockInit.purple_ore.get().getDefaultState(), 8, 32, 72, 4);
            Methods.genOre(event.getGeneration(), OreFeatureConfig.FillerBlockType.BASE_STONE_OVERWORLD, BlockInit.crystal_ore.get().getDefaultState(), 8, 8, 16, 10);
        }
    }*/
}
