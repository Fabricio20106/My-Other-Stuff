package com.junethewoods.myotherstuff.world;

import com.google.common.collect.ImmutableList;
import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import net.minecraft.block.Blocks;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.BlobFoliagePlacer;
import net.minecraft.world.gen.foliageplacer.BushFoliagePlacer;
import net.minecraft.world.gen.treedecorator.LeaveVineTreeDecorator;
import net.minecraft.world.gen.trunkplacer.StraightTrunkPlacer;

public class OTFeatures {
    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> AZALEA_TREE = register("azalea_tree", Feature.TREE.configured(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                    new SimpleBlockStateProvider(OTBlocks.AZALEA_LEAVES.get().defaultBlockState()),
                    new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)).ignoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> FLOWERING_AZALEA_TREE = register("flowering_azalea_tree", Feature.TREE.configured(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                    new SimpleBlockStateProvider(OTBlocks.FLOWERING_AZALEA_LEAVES.get().defaultBlockState()),
                    new BlobFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(0), 3),
                    new StraightTrunkPlacer(4, 2, 0),
                    new TwoLayerFeature(1, 0, 1)).ignoreVines().build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> JUNGLE_BUSH = register("jungle_bush", Feature.TREE.configured(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.JUNGLE_LOG.defaultBlockState()),
                    new SimpleBlockStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                    new BushFoliagePlacer(FeatureSpread.fixed(2), FeatureSpread.fixed(1), 2),
                    new StraightTrunkPlacer(1, 0, 0),
                    new TwoLayerFeature(0, 0, 0)).build()));

    public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> SWAMP_OAK_TREE = register("swamp_oak_tree", Feature.TREE.configured(
            new BaseTreeFeatureConfig.Builder(
                    new SimpleBlockStateProvider(Blocks.OAK_LOG.defaultBlockState()),
                    new SimpleBlockStateProvider(Blocks.OAK_LEAVES.defaultBlockState()),
                    new BlobFoliagePlacer(FeatureSpread.fixed(3), FeatureSpread.fixed(0), 3),
                    new StraightTrunkPlacer(5, 3, 0),
                    new TwoLayerFeature(1, 0, 1))
                    .maxWaterDepth(1).decorators(ImmutableList.of(LeaveVineTreeDecorator.INSTANCE)).build()));

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String name, ConfiguredFeature<FC, ?> feature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, MyOtherStuff.resourceLoc(name), feature);
    }
}
