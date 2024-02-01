package com.junethewoods.myotherstuff.data.client;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import net.minecraft.block.*;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class OTBlockStateProvider extends BlockStateProvider {
    public OTBlockStateProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, MyOtherStuff.MOD_ID, fileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "My Other Stuff - Block States & Models";
    }

    @Override
    protected void registerStatesAndModels() {
        // Transition Blocks
        simpleBlock(OTBlocks.BLUE_TILES.get(), models().cubeAll("blue_block", modLoc("block/blue_tiles")));
        slabBlock((SlabBlock) OTBlocks.BLUE_TILE_SLAB.get(), modLoc("block/blue_block"), modLoc("block/blue_tiles"));
        wallBlock((WallBlock) OTBlocks.BLUE_TILE_WALL.get(), modLoc("block/blue_tiles"));

        simpleBlock(OTBlocks.FUR_BLOCK.get());
        simpleBlock(OTBlocks.BORDERED_BEDROCK.get());
        slabBlock((SlabBlock) OTBlocks.BORDERED_BEDROCK_SLAB.get(), modLoc("block/lined_bedrock"), modLoc("block/lined_bedrock"));
        simpleBlock(OTBlocks.BEACON_BEAM_BLOCK.get());
        slabBlock((SlabBlock) OTBlocks.BEACON_BEAM_SLAB.get(), modLoc("block/beacon_laser_block"), modLoc("block/beacon_laser_block"));
        simpleBlock(OTBlocks.BLUE_GLASS.get());
        simpleBlock(OTBlocks.CYAN_GLASS.get());
        simpleBlock(OTBlocks.END_CRYSTAL_GLASS.get());
        paneBlock((PaneBlock) OTBlocks.BLUE_GLASS_PANE.get(), modLoc("block/blue_glass"), modLoc("block/blue_glass_pane_top"));
        paneBlock((PaneBlock) OTBlocks.CYAN_GLASS_PANE.get(), modLoc("block/bluewhite_glass"), modLoc("block/bluewhite_glass_pane_top"));
        paneBlock((PaneBlock) OTBlocks.END_CRYSTAL_GLASS_PANE.get(), modLoc("block/end_crystal_glass"), modLoc("block/end_crystal_glass_pane_top"));
        simpleBlock(OTBlocks.DRAWN_COMMAND_BLOCK.get());
        simpleBlock(OTBlocks.DRAWN_CREATIVE_ENERGY_CUBE.get());
        simpleBlock(OTBlocks.DRAWN_ACACIA_LEAVES.get());
        simpleBlock(OTBlocks.GRANITE_BRICKS.get());
        simpleBlock(OTBlocks.SLATE_BRICKS.get());
        simpleBlock(OTBlocks.DIAEMERALD_ORE.get());
        simpleBlock(OTBlocks.DIAEMERALD_BLOCK.get());
        simpleBlock(OTBlocks.MAGENTIC_CRYSTAL_ORE.get());
        simpleBlock(OTBlocks.DEEPSLATE_MAGENTIC_CRYSTAL_ORE.get());
        simpleBlock(OTBlocks.MAGENTIC_CRYSTAL_BLOCK.get());
        simpleBlock(OTBlocks.INNO_ORE.get());
        simpleBlock(OTBlocks.INNO_BLOCK.get());
        simpleBlock(OTBlocks.NETHER_ORE.get());
        simpleBlock(OTBlocks.NETHER_BLOCK.get());
        simpleBlock(OTBlocks.BRIGHT_FIRST_BLOCK.get());
        simpleBlock((OTBlocks.DARK_FIRST_BLOCK.get()));
        simpleBlock(OTBlocks.FIRST_BLOCK.get());
        simpleBlock(OTBlocks.PHOENIX_GEM_BLOCK.get());
        simpleBlock(OTBlocks.PLASTEEL_BLOCK.get());
        simpleBlock(OTBlocks.INNO_CORE_BLOCK.get());
        simpleBlock(OTBlocks.NETHER_CORE_BLOCK.get());
        simpleBlock(OTBlocks.JUNGLE_BUSH_SAPLING.get(), models().cross("oak_bush_sapling", modLoc("block/jungle_bush_sapling")));
        simpleBlock(OTBlocks.SWAMP_OAK_SAPLING.get(), models().cross("swamp_oak_sapling", modLoc("block/swamp_oak_sapling")));
        simpleBlock(OTBlocks.TALL_BIRCH_SAPLING.get(), models().cross("tall_birch_sapling", modLoc("block/tall_birch_sapling")));
        simpleBlock(OTBlocks.POTTED_JUNGLE_BUSH_SAPLING.get(), models().withExistingParent("potted_oak_bush_sapling", mcLoc("flower_pot_cross")).texture("plant", modLoc("block/jungle_bush_sapling")));
        simpleBlock(OTBlocks.POTTED_SWAMP_OAK_SAPLING.get(), models().withExistingParent("potted_swamp_oak_sapling", mcLoc("flower_pot_cross")).texture("plant", modLoc("block/swamp_oak_sapling")));
        simpleBlock(OTBlocks.POTTED_TALL_BIRCH_SAPLING.get(), models().withExistingParent("potted_tall_birch_sapling", mcLoc("flower_pot_cross")).texture("plant", modLoc("block/tall_birch_sapling")));
        simpleBlock(OTBlocks.INNO_FLOWER.get(), models().cross("inno_flower", modLoc("block/inno_flower")));
        simpleBlock(OTBlocks.POTTED_INNO_FLOWER.get(), models().withExistingParent("potted_inno_flower", mcLoc("flower_pot_cross")).texture("plant", modLoc("block/inno_flower")));
        simpleBlock(OTBlocks.POTTED_GRASS.get(), models().withExistingParent("potted_grass", mcLoc("flower_pot_cross")).texture("plant", modLoc("block/grass_pot")));
        simpleBlock(OTBlocks.POTTED_AZALEA.get(), models().withExistingParent("potted_azalea_bush", modLoc("template_potted_azalea_bush")).texture("top", modLoc("block/potted_azalea_bush_top"))
                .texture("side", modLoc("block/potted_azalea_bush_side")).texture("azalea_plant", modLoc("block/potted_azalea_bush_plant")));
        simpleBlock(OTBlocks.POTTED_FLOWERING_AZALEA.get(), models().withExistingParent("potted_flowering_azalea_bush", modLoc("template_potted_azalea_bush")).texture("top", modLoc("block/potted_flowering_azalea_bush_top"))
                .texture("side", modLoc("block/potted_flowering_azalea_bush_side")).texture("azalea_plant", modLoc("block/potted_flowering_azalea_bush_plant")));

        horizontalBlock(OTBlocks.SCREEN_MONITOR.get(), modLoc("block/screen_monitor_side"), modLoc("block/screen_monitor_front"), modLoc("block/screen_monitor_side"));
        horizontalBlock(OTBlocks.MONITOR.get(), modLoc("block/monitor_side"), modLoc("block/monitor_front"), modLoc("block/monitor_side"));

        // Pre-Transition Blocks
        simpleBlock(OTBlocks.RAW_FIRST_BLOCK.get());
        simpleBlock(OTBlocks.RAW_INNO_BLOCK.get());
        simpleBlock(OTBlocks.RAW_NETHER_BLOCK.get());
        simpleBlock(OTBlocks.CHISELED_BLUE_TILES.get(), models().cubeTop("chiseled_blue_tiles", modLoc("block/chiseled_blue_tiles"), modLoc("block/blue_tiles")));
        simpleBlock(OTBlocks.DEEPSLATE_DIAEMERALD_ORE.get());
        stairsBlock((StairsBlock) OTBlocks.BLUE_TILE_STAIRS.get(), modLoc("block/blue_tiles"));

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

        // Caves & Cliffs Content
        simpleBlock(OTBlocks.ROOTED_DIRT.get());
        simpleBlock(OTBlocks.HANGING_ROOTS.get(), models().cross("hanging_roots", modLoc("block/hanging_roots")));
        simpleBlock(OTBlocks.MOSS_CARPET.get(), models().carpet("moss_carpet", modLoc("block/moss_block")));
        simpleBlock(OTBlocks.MOSS_BLOCK.get());
        simpleBlock(OTBlocks.AZALEA_LEAVES.get());
        simpleBlock(OTBlocks.FLOWERING_AZALEA_LEAVES.get());
        simpleBlock(OTBlocks.AZALEA.get(), models().withExistingParent("azalea", modLoc("block/template_azalea")).texture("top", modLoc("block/azalea_top")).texture("side", modLoc("block/azalea_side")));
        simpleBlock(OTBlocks.FLOWERING_AZALEA.get(), models().withExistingParent("flowering_azalea", modLoc("block/template_azalea")).texture("top", modLoc("block/flowering_azalea_top")).texture("side",
                modLoc("block/flowering_azalea_side")));

        // More Complex Blocks
        simpleBlock(OTBlocks.DRAWN_CRAFTING_TABLE.get(), models().cube("crafting_table_1",
                modLoc("block/crafting_table_bottom"), modLoc("block/crafting_table_top"),
                modLoc("block/crafting_table_side"), modLoc("block/crafting_table_side"),
                modLoc("block/crafting_table_side"), modLoc("block/crafting_table_side")));
        simpleBlock(OTBlocks.DRAWN_SMITHING_TABLE.get(), models().cube("smithing_table_1",
                modLoc("block/smithing_table_bottom"), modLoc("block/smithing_table_top"),
                modLoc("block/smithing_table"), modLoc("block/smithing_table"),
                modLoc("block/smithing_table"), modLoc("block/smithing_table")));
        simpleBlock(OTBlocks.CRAFTER.get(), models().cube("autocrafter",
                mcLoc("block/gray_concrete"), modLoc("block/autocrafter_top"),
                modLoc("block/autocrafter_front"), modLoc("block/autocrafter_front"),
                modLoc("block/autocrafter_front"), modLoc("block/autocrafter_front")));

        getVariantBuilder(OTBlocks.BLUE_CARROTS.get()).forAllStates(state -> {
            int cropAgeIndex = potatoAgeIndex(state.getValue(CropsBlock.AGE));
            return ConfiguredModel.builder().modelFile(models().crop("blue_carrots_stage" + cropAgeIndex, modLoc("block/blue_carrots_stage" + cropAgeIndex))).build();
        });
    }

    public static int potatoAgeIndex(int age) {
        if (age > 6) return 3;
        if (age > 3) return 2;
        if (age > 1) return 1;
        return 0;
    }
}
