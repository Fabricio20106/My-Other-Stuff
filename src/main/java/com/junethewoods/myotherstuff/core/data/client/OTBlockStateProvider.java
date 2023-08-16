package com.junethewoods.myotherstuff.core.data.client;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.OTBlocks;
import net.minecraft.block.StairsBlock;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OTBlockStateProvider extends BlockStateProvider {
    public OTBlockStateProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, MyOtherStuff.MOD_ID, fileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        simpleBlock(OTBlocks.RAW_FIRST_BLOCK.get());
        simpleBlock(OTBlocks.RAW_INNO_BLOCK.get());
        simpleBlock(OTBlocks.RAW_PURPLE_BLOCK.get());
        stairsBlock((StairsBlock) OTBlocks.BLUE_STAIRS.get(), modLoc("block/blue_block"));
    }
}
