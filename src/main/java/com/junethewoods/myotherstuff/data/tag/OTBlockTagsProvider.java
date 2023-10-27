package com.junethewoods.myotherstuff.data.tag;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.block.Blocks;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class OTBlockTagsProvider extends BlockTagsProvider {
    public OTBlockTagsProvider(DataGenerator generator, @Nullable ExistingFileHelper fileHelper) {
        super(generator, MyOtherStuff.MOD_ID, fileHelper);
    }

    @Override
    protected void addTags() {
        // Adding items to tags from OTTags.
        this.tag(OTTags.Blocks.ORES_DIAEMERALD).add(OTBlocks.DIAEMERALD_ORE.get()).add(OTBlocks.DEEPSLATE_DIAEMERALD_ORE.get());
        this.tag(OTTags.Blocks.ORES_MAGENTIC).add(OTBlocks.MAGENTIC_CRYSTAL_ORE.get()).add(OTBlocks.DEEPSLATE_MAGENTIC_CRYSTAL_ORE.get());
        this.tag(OTTags.Blocks.ORES_INNO).add(OTBlocks.INNO_ORE.get());
        this.tag(OTTags.Blocks.ORES_NETHER).add(OTBlocks.NETHER_ORE.get());

        this.tag(OTTags.Blocks.STORAGE_BLOCKS_DIAEMERALD).add(OTBlocks.DIAEMERALD_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_MAGENTIC).add(OTBlocks.MAGENTIC_CRYSTAL_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_BRIGHT_FIRST).add(OTBlocks.BRIGHT_FIRST_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_FIRST).add(OTBlocks.FIRST_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_RAW_FIRST).add(OTBlocks.RAW_FIRST_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_DARK_FIRST).add(OTBlocks.DARK_FIRST_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_INNO).add(OTBlocks.INNO_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_INNO_CORE).add(OTBlocks.INNO_CORE_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_RAW_INNO).add(OTBlocks.RAW_INNO_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_NETHER).add(OTBlocks.NETHER_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_NETHER_CORE).add(OTBlocks.NETHER_CORE_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_RAW_NETHER).add(OTBlocks.RAW_NETHER_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_PLASTEEL).add(OTBlocks.PLASTEEL_BLOCK.get());
        this.tag(OTTags.Blocks.STORAGE_BLOCKS_PHOENIX).add(OTBlocks.PHOENIX_GEM_BLOCK.get());

        this.tag(OTTags.Blocks.CROPS_BLUE_CARROTS).add(OTBlocks.BLUE_CARROTS.get());

        this.tag(OTTags.Blocks.BELONGS_TO_VARIANTS).add(OTBlocks.GOLDEN_BEACON.get()).add(OTBlocks.GOLDEN_CAULDRON.get());
        this.tag(OTTags.Blocks.BELONGS_TO_MOB_TAKER).add(OTBlocks.BORDERED_BEDROCK.get()).add(OTBlocks.BORDERED_BEDROCK_SLAB.get()).add(OTBlocks.BEACON_BEAM_BLOCK.get())
                .add(OTBlocks.BEACON_BEAM_SLAB.get()).add(OTBlocks.FUR_BLOCK.get()).add(OTBlocks.END_CRYSTAL_GLASS.get()).add(OTBlocks.END_CRYSTAL_GLASS_PANE.get());
        this.tag(OTTags.Blocks.BELONGS_TO_GACHA_LIFE);
        this.tag(OTTags.Blocks.BELONGS_TO_F10_ELEMENTS).add(OTBlocks.INNO_ORE.get()).add(OTBlocks.INNO_BLOCK.get()).add(OTBlocks.INNO_CORE_BLOCK.get()).add(OTBlocks.RAW_INNO_BLOCK.get())
                .add(OTBlocks.NETHER_ORE.get()).add(OTBlocks.NETHER_BLOCK.get()).add(OTBlocks.NETHER_CORE_BLOCK.get()).add(OTBlocks.RAW_NETHER_BLOCK.get()).add(OTBlocks.BRIGHT_FIRST_BLOCK.get())
                .add(OTBlocks.FIRST_BLOCK.get()).add(OTBlocks.DARK_FIRST_BLOCK.get()).add(OTBlocks.RAW_FIRST_BLOCK.get()).add(OTBlocks.INNO_FLOWER.get()).add(OTBlocks.POTTED_INNO_FLOWER.get())
                .add(OTBlocks.DECORATED_POTTED_INNO_FLOWER.get());
        this.tag(OTTags.Blocks.BELONGS_TO_F10_PACK).add(OTBlocks.BLUE_CARROTS.get());
        this.tag(OTTags.Blocks.BELONGS_TO_RIMCRAFT).add(OTBlocks.GRANITE_BRICKS.get()).add(OTBlocks.SLATE_BRICKS.get()).add(OTBlocks.PLASTEEL_BLOCK.get());

        // Adding tags from OTTags to Forge tags.
        this.tag(Tags.Blocks.ORES).addTag(OTTags.Blocks.ORES_DIAEMERALD).addTag(OTTags.Blocks.ORES_MAGENTIC).addTag(OTTags.Blocks.ORES_INNO).addTag(OTTags.Blocks.ORES_NETHER);
        this.tag(Tags.Blocks.STORAGE_BLOCKS).addTag(OTTags.Blocks.STORAGE_BLOCKS_DIAEMERALD).addTag(OTTags.Blocks.STORAGE_BLOCKS_MAGENTIC)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_BRIGHT_FIRST).addTag(OTTags.Blocks.STORAGE_BLOCKS_FIRST).addTag(OTTags.Blocks.STORAGE_BLOCKS_RAW_FIRST)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_DARK_FIRST).addTag(OTTags.Blocks.STORAGE_BLOCKS_INNO).addTag(OTTags.Blocks.STORAGE_BLOCKS_INNO_CORE)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_RAW_INNO).addTag(OTTags.Blocks.STORAGE_BLOCKS_NETHER).addTag(OTTags.Blocks.STORAGE_BLOCKS_NETHER_CORE)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_RAW_NETHER).addTag(OTTags.Blocks.STORAGE_BLOCKS_PLASTEEL).addTag(OTTags.Blocks.STORAGE_BLOCKS_PHOENIX);
        this.tag(Tags.Blocks.GLASS_COLORLESS).add(OTBlocks.BLUE_GLASS.get()).add(OTBlocks.CYAN_GLASS.get());
        this.tag(Tags.Blocks.GLASS_PANES_COLORLESS).add(OTBlocks.BLUE_GLASS_PANE.get()).add(OTBlocks.CYAN_GLASS_PANE.get());
        this.tag(Tags.Blocks.DIRT).add(OTBlocks.ROOTED_DIRT.get()).add(OTBlocks.MOSS_BLOCK.get());

        // Adding tags from OTTags to Minecraft tags.
        this.tag(BlockTags.CROPS).addTag(OTTags.Blocks.CROPS_BLUE_CARROTS);

        // Adding items from Others to Minecraft tags.
        this.tag(BlockTags.BEACON_BASE_BLOCKS).addTag(OTTags.Blocks.STORAGE_BLOCKS_DIAEMERALD).addTag(OTTags.Blocks.STORAGE_BLOCKS_MAGENTIC)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_BRIGHT_FIRST).addTag(OTTags.Blocks.STORAGE_BLOCKS_FIRST).addTag(OTTags.Blocks.STORAGE_BLOCKS_RAW_FIRST)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_DARK_FIRST).addTag(OTTags.Blocks.STORAGE_BLOCKS_INNO).addTag(OTTags.Blocks.STORAGE_BLOCKS_INNO_CORE)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_RAW_INNO).addTag(OTTags.Blocks.STORAGE_BLOCKS_NETHER).addTag(OTTags.Blocks.STORAGE_BLOCKS_NETHER_CORE)
                .addTag(OTTags.Blocks.STORAGE_BLOCKS_RAW_NETHER).addTag(OTTags.Blocks.STORAGE_BLOCKS_PLASTEEL).addTag(OTTags.Blocks.STORAGE_BLOCKS_PHOENIX);
        this.tag(BlockTags.FLOWER_POTS).add(OTBlocks.DECORATED_FLOWER_POT.get()).add(OTBlocks.STRIPED_DECORATED_FLOWER_POT.get()).add(OTBlocks.POTTED_INNO_FLOWER.get())
                .add(OTBlocks.DECORATED_POTTED_INNO_FLOWER.get()).add(OTBlocks.POTTED_SWAMP_OAK_SAPLING.get()).add(OTBlocks.POTTED_TALL_BIRCH_SAPLING.get())
                .add(OTBlocks.POTTED_JUNGLE_BUSH_SAPLING.get()).add(OTBlocks.POTTED_GRASS.get()).add(OTBlocks.POTTED_AZALEA.get()).add(OTBlocks.POTTED_FLOWERING_AZALEA.get());
        this.tag(BlockTags.GUARDED_BY_PIGLINS).add(OTBlocks.GOLDEN_BEACON.get()).add(OTBlocks.GOLDEN_CAULDRON.get());
        this.tag(BlockTags.LEAVES).add(OTBlocks.AZALEA_LEAVES.get()).add(OTBlocks.FLOWERING_AZALEA_LEAVES.get()).add(OTBlocks.DRAWN_ACACIA_LEAVES.get());
        this.tag(BlockTags.SAPLINGS).add(OTBlocks.SWAMP_OAK_SAPLING.get()).add(OTBlocks.TALL_BIRCH_SAPLING.get()).add(OTBlocks.JUNGLE_BUSH_SAPLING.get()).add(OTBlocks.AZALEA.get())
                .add(OTBlocks.FLOWERING_AZALEA.get());
        this.tag(BlockTags.STAIRS).add(OTBlocks.BRIGHT_BLUE_TILE_STAIRS.get()).add(OTBlocks.BLUE_TILE_STAIRS.get()).add(OTBlocks.DARK_BLUE_TILE_STAIRS.get()).add(OTBlocks.INNO_TILE_STAIRS.get())
                .add(OTBlocks.NETHER_TILE_STAIRS.get());
        this.tag(BlockTags.SLABS).add(OTBlocks.BRIGHT_BLUE_TILE_SLAB.get()).add(OTBlocks.BLUE_TILE_SLAB.get()).add(OTBlocks.DARK_BLUE_TILE_SLAB.get()).add(OTBlocks.INNO_TILE_SLAB.get())
                .add(OTBlocks.NETHER_TILE_SLAB.get()).add(OTBlocks.BORDERED_BEDROCK_SLAB.get()).add(OTBlocks.BEACON_BEAM_SLAB.get());
        this.tag(BlockTags.WALLS).add(OTBlocks.BRIGHT_BLUE_TILE_WALL.get()).add(OTBlocks.BLUE_TILE_WALL.get()).add(OTBlocks.DARK_BLUE_TILE_WALL.get()).add(OTBlocks.INNO_TILE_WALL.get())
                .add(OTBlocks.NETHER_TILE_WALL.get());
        this.tag(BlockTags.SMALL_FLOWERS).add(OTBlocks.INNO_FLOWER.get()).add(OTBlocks.FLOWERING_AZALEA.get());
        this.tag(BlockTags.FLOWERS).add(OTBlocks.FLOWERING_AZALEA_LEAVES.get());
        this.tag(BlockTags.WITHER_IMMUNE).add(OTBlocks.DRAWN_COMMAND_BLOCK.get()).add(OTBlocks.BORDERED_BEDROCK.get()).add(OTBlocks.BORDERED_BEDROCK_SLAB.get());
        this.tag(BlockTags.DRAGON_IMMUNE).add(OTBlocks.DRAWN_COMMAND_BLOCK.get()).add(OTBlocks.BORDERED_BEDROCK.get()).add(OTBlocks.BORDERED_BEDROCK_SLAB.get());
        this.tag(BlockTags.WOOL).add(OTBlocks.FUR_BLOCK.get());
        this.tag(BlockTags.CARPETS).add(OTBlocks.MOSS_CARPET.get());
        this.tag(BlockTags.ENDERMAN_HOLDABLE).add(OTBlocks.ROOTED_DIRT.get());
        this.tag(BlockTags.BAMBOO_PLANTABLE_ON).add(OTBlocks.ROOTED_DIRT.get());

        // Adding tags from OTTags to Others' tags.
        this.tag(OTTags.Blocks.BELONGS_TO).addTag(OTTags.Blocks.BELONGS_TO_VARIANTS).addTag(OTTags.Blocks.BELONGS_TO_MOB_TAKER).addTag(OTTags.Blocks.BELONGS_TO_GACHA_LIFE)
                .addTag(OTTags.Blocks.BELONGS_TO_F10_ELEMENTS).addTag(OTTags.Blocks.BELONGS_TO_F10_PACK).addTag(OTTags.Blocks.BELONGS_TO_RIMCRAFT);
        this.tag(OTTags.Blocks.CAVES_AND_CLIFFS_CONTENT).add(OTBlocks.AZALEA_LEAVES.get()).add(OTBlocks.FLOWERING_AZALEA_LEAVES.get()).add(OTBlocks.AZALEA.get())
                .add(OTBlocks.FLOWERING_AZALEA.get()).add(OTBlocks.POTTED_AZALEA.get()).add(OTBlocks.POTTED_FLOWERING_AZALEA.get()).add(OTBlocks.MOSS_BLOCK.get())
                .add(OTBlocks.MOSS_CARPET.get()).add(OTBlocks.ROOTED_DIRT.get()).add(OTBlocks.HANGING_ROOTS.get());
        this.tag(OTTags.Blocks.CRAFTING_TABLES).add(Blocks.CRAFTING_TABLE).add(OTBlocks.CRAFTER.get()).add(OTBlocks.DRAWN_CRAFTING_TABLE.get());
        this.tag(OTTags.Blocks.SMITHING_TABLES).add(Blocks.SMITHING_TABLE).add(OTBlocks.DRAWN_SMITHING_TABLE.get());
    }
}
