package com.junethewoods.myotherstuff.core.datagen.client;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.BlockInit;
import net.minecraft.block.StairsBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OthersBlockStateProvider extends BlockStateProvider {
    public OthersBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, MyOtherStuff.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(BlockInit.raw_first_block.get());
        simpleBlock(BlockInit.raw_inno_block.get());
        simpleBlock(BlockInit.raw_purple_block.get());
        stairsBlock((StairsBlock) BlockInit.blue_stairs.get(), modLoc("block/blue_block"));
    }
}
