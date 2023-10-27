package com.junethewoods.myotherstuff.data.client;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
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

        simpleBlock(OTBlocks.ROOTED_DIRT.get());
        simpleBlock(OTBlocks.HANGING_ROOTS.get(), models().cross("hanging_roots", modLoc("block/hanging_roots")));
        simpleBlock(OTBlocks.MOSS_BLOCK.get());
        simpleBlock(OTBlocks.MOSS_CARPET.get(), models().carpet("moss_carpet", modLoc("block/moss_block")));
        simpleBlock(OTBlocks.AZALEA_LEAVES.get());
        simpleBlock(OTBlocks.FLOWERING_AZALEA_LEAVES.get());

        simpleBlock(OTBlocks.BRIGHT_BLUE_TILES.get());
        stairsBlock((StairsBlock) OTBlocks.BRIGHT_BLUE_TILE_STAIRS.get(), modLoc("block/bright_blue_tiles"));
        slabBlock((SlabBlock) OTBlocks.BRIGHT_BLUE_TILE_SLAB.get(), modLoc("block/bright_blue_tiles"), modLoc("block/bright_blue_tiles"));
        wallBlock((WallBlock) OTBlocks.BRIGHT_BLUE_TILE_WALL.get(), modLoc("block/bright_blue_tiles"));
        simpleBlock(OTBlocks.DARK_BLUE_TILES.get());
        stairsBlock((StairsBlock) OTBlocks.DARK_BLUE_TILE_STAIRS.get(), modLoc("block/dark_blue_tiles"));
        slabBlock((SlabBlock) OTBlocks.DARK_BLUE_TILE_SLAB.get(), modLoc("block/dark_blue_tiles"), modLoc("block/dark_blue_tiles"));
        wallBlock((WallBlock) OTBlocks.DARK_BLUE_TILE_WALL.get(), modLoc("block/dark_blue_tiles"));
        simpleBlock(OTBlocks.INNO_TILES.get());
        stairsBlock((StairsBlock) OTBlocks.INNO_TILE_STAIRS.get(), modLoc("block/inno_tiles"));
        slabBlock((SlabBlock) OTBlocks.INNO_TILE_SLAB.get(), modLoc("block/inno_tiles"), modLoc("block/inno_tiles"));
        wallBlock((WallBlock) OTBlocks.INNO_TILE_WALL.get(), modLoc("block/inno_tiles"));
        simpleBlock(OTBlocks.NETHER_TILES.get());
        stairsBlock((StairsBlock) OTBlocks.NETHER_TILE_STAIRS.get(), modLoc("block/nether_tiles"));
        slabBlock((SlabBlock) OTBlocks.NETHER_TILE_SLAB.get(), modLoc("block/nether_tiles"), modLoc("block/nether_tiles"));
        wallBlock((WallBlock) OTBlocks.NETHER_TILE_WALL.get(), modLoc("block/nether_tiles"));
    }
}
