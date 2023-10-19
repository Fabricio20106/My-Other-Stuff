package com.junethewoods.myotherstuff.data.client;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
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
        simpleBlock(OTBlocks.RAW_NETHER_BLOCK.get());
        simpleBlock(OTBlocks.CHISELED_BLUE_TILES.get(), models().cubeTop("chiseled_blue_tiles", modLoc("block/chiseled_blue_tiles"), modLoc("block/blue_block")));
        simpleBlock(OTBlocks.DEEPSLATE_DIAEMERALD_ORE.get());
        stairsBlock((StairsBlock) OTBlocks.BLUE_TILE_STAIRS.get(), modLoc("block/blue_block"));
    }
}
