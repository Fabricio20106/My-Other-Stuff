package com.junethewoods.myotherstuff.block.tree;

import com.junethewoods.myotherstuff.world.OTFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;

import javax.annotation.Nullable;
import java.util.Random;

public class SwampOakTree extends Tree {
    @Nullable
    @Override
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getConfiguredFeature(Random rand, boolean beehive) {
        return OTFeatures.SWAMP_OAK_TREE;
    }
}
