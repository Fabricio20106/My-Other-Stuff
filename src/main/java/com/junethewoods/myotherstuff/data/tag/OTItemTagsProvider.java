package com.junethewoods.myotherstuff.data.tag;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.item.OTItems;
import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraft.item.Items;
import net.minecraft.tags.ItemTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class OTItemTagsProvider extends ItemTagsProvider {
    public OTItemTagsProvider(DataGenerator generator, BlockTagsProvider blockTagsProvider, @Nullable ExistingFileHelper fileHelper) {
        super(generator, blockTagsProvider, MyOtherStuff.MOD_ID, fileHelper);
    }

    @Override
    public String getName() {
        return "My Other Stuff - Item Tags";
    }

    @Override
    protected void addTags() {
        // Adding items to tags from OTTags.
        this.tag(OTTags.Items.ORES_DIAEMERALD).add(OTItems.DIAEMERALD_ORE.get()).add(OTItems.DEEPSLATE_DIAEMERALD_ORE.get());
        this.tag(OTTags.Items.ORES_MAGENTIC).add(OTItems.MAGENTIC_CRYSTAL_ORE.get()).add(OTItems.DEEPSLATE_MAGENTIC_CRYSTAL_ORE.get());
        this.tag(OTTags.Items.ORES_INNO).add(OTItems.INNO_ORE.get()).addTag(OTTags.Items.RAW_MATERIALS_INNO);
        this.tag(OTTags.Items.ORES_NETHER).add(OTItems.NETHER_ORE.get()).addTag(OTTags.Items.RAW_MATERIALS_NETHER);

        this.tag(OTTags.Items.RAW_MATERIALS_FIRST).add(OTItems.RAW_FIRST.get());
        this.tag(OTTags.Items.RAW_MATERIALS_INNO).add(OTItems.RAW_INNO.get());
        this.tag(OTTags.Items.RAW_MATERIALS_NETHER).add(OTItems.RAW_NETHER.get());

        this.tag(OTTags.Items.INGOTS_MAGENTIC).add(OTItems.MAGENTIC_INGOT.get());
        this.tag(OTTags.Items.INGOTS_BRIGHT_FIRST).add(OTItems.BRIGHT_FIRST_INGOT.get());
        this.tag(OTTags.Items.INGOTS_FIRST).add(OTItems.FIRST_INGOT.get());
        this.tag(OTTags.Items.INGOTS_DARK_FIRST).add(OTItems.DARK_FIRST_INGOT.get());
        this.tag(OTTags.Items.INGOTS_INNO).add(OTItems.INNO_INGOT.get());
        this.tag(OTTags.Items.INGOTS_NETHER).add(OTItems.NETHER_INGOT.get());

        this.tag(OTTags.Items.GEMS_DIAEMERALD).add(OTItems.DIAEMERALD.get());
        this.tag(OTTags.Items.GEMS_MAGENTIC).add(OTItems.MAGENTIC_CRYSTAL.get());
        this.tag(OTTags.Items.GEMS_RUBY).add(OTItems.RUBY.get());
        this.tag(OTTags.Items.GEMS_PHOENIX).add(OTItems.PHOENIX_GEM.get());

        this.tag(OTTags.Items.NUGGETS_DIAEMERALD).add(OTItems.DIAEMERALD_NUGGET.get());
        this.tag(OTTags.Items.NUGGETS_MAGENTIC).add(OTItems.MAGENTIC_NUGGET.get()).add(OTItems.MAGENTIC_CRYSTAL_NUGGET.get());
        this.tag(OTTags.Items.NUGGETS_BRIGHT_FIRST).add(OTItems.BRIGHT_FIRST_NUGGET.get());
        this.tag(OTTags.Items.NUGGETS_FIRST).add(OTItems.FIRST_NUGGET.get());
        this.tag(OTTags.Items.NUGGETS_DARK_FIRST).add(OTItems.DARK_FIRST_NUGGET.get());
        this.tag(OTTags.Items.NUGGETS_INNO).add(OTItems.INNO_NUGGET.get());
        this.tag(OTTags.Items.NUGGETS_NETHER).add(OTItems.NETHER_NUGGET.get());

        this.tag(OTTags.Items.DUSTS_COAL).add(OTItems.COAL_DUST.get());
        this.tag(OTTags.Items.DUSTS_DIAMOND).add(OTItems.DIAMOND_DUST.get()).add(OTItems.ANTIQUE_DIAMOND_DUST.get());
        this.tag(OTTags.Items.DUSTS_EMERALD).add(OTItems.EMERALD_DUST.get()).add(OTItems.ANTIQUE_EMERALD_DUST.get());
        this.tag(OTTags.Items.DUSTS_GOLD).add(OTItems.GOLD_DUST.get()).add(OTItems.ANTIQUE_GOLD_DUST.get());
        this.tag(OTTags.Items.DUSTS_IRON).add(OTItems.IRON_DUST.get()).add(OTItems.ANTIQUE_IRON_DUST.get());
        this.tag(OTTags.Items.DUSTS_COPPER).add(OTItems.COPPER_DUST.get());
        this.tag(OTTags.Items.DUSTS_LAPIS).add(OTItems.LAPIS_LAZULI_DUST.get());
        this.tag(OTTags.Items.DUSTS_NETHERITE).add(OTItems.NETHERITE_DUST.get());
        this.tag(OTTags.Items.DUSTS_NETHERITE_SCRAP).add(OTItems.NETHERITE_SCRAP_DUST.get());
        this.tag(OTTags.Items.DUSTS_QUARTZ).add(OTItems.QUARTZ_DUST.get());
        this.tag(Tags.Items.DUSTS_REDSTONE).add(OTItems.REDSTONE_DUST.get()).add(OTItems.ANTIQUE_REDSTONE_DUST.get());

        this.tag(OTTags.Items.CORES_INNO).add(OTItems.INNO_CORE.get());
        this.tag(OTTags.Items.CORES_NETHER).add(OTItems.NETHER_CORE.get());

        this.tag(OTTags.Items.RODS_SOUL_BLAZE).add(OTItems.SOUL_BLAZE_ROD.get());
        this.tag(OTTags.Items.CLOTHS_REINFORCED).add(OTItems.REINFORCED_CLOTH.get());
        this.tag(OTTags.Items.DYES_INNO).add(OTItems.INNO_DYE.get());

        this.tag(OTTags.Items.STORAGE_BLOCKS_DIAEMERALD).add(OTItems.DIAEMERALD_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_MAGENTIC).add(OTItems.MAGENTIC_CRYSTAL_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_BRIGHT_FIRST).add(OTItems.BRIGHT_FIRST_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_FIRST).add(OTItems.FIRST_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_RAW_FIRST).add(OTItems.RAW_FIRST_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_DARK_FIRST).add(OTItems.DARK_FIRST_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_INNO).add(OTItems.INNO_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_INNO_CORE).add(OTItems.INNO_CORE_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_RAW_INNO).add(OTItems.RAW_INNO_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_NETHER).add(OTItems.NETHER_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_NETHER_CORE).add(OTItems.NETHER_CORE_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_RAW_NETHER).add(OTItems.RAW_NETHER_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_PLASTEEL).add(OTItems.PLASTEEL_BLOCK.get());
        this.tag(OTTags.Items.STORAGE_BLOCKS_PHOENIX).add(OTItems.PHOENIX_GEM_BLOCK.get());

        this.tag(OTTags.Items.CROPS_BLUE_CARROTS).add(OTItems.BLUE_CARROT.get());

        this.tag(OTTags.Items.BELONGS_TO_VARIANTS).add(OTItems.GOLDEN_BEACON.get()).add(OTItems.GOLDEN_CAULDRON.get());
        this.tag(OTTags.Items.BELONGS_TO_MOB_TAKER).add(OTItems.BORDERED_BEDROCK.get()).add(OTItems.BORDERED_BEDROCK_SLAB.get()).add(OTItems.BEACON_BEAM_BLOCK.get())
                .add(OTItems.BEACON_BEAM_SLAB.get()).add(OTItems.FUR_BLOCK.get()).add(OTItems.END_CRYSTAL_GLASS.get()).add(OTItems.END_CRYSTAL_GLASS_PANE.get());
        this.tag(OTTags.Items.BELONGS_TO_GACHA_LIFE);
        this.tag(OTTags.Items.BELONGS_TO_F10_ELEMENTS).add(OTItems.INNO_ORE.get()).add(OTItems.INNO_BLOCK.get()).add(OTItems.INNO_CORE_BLOCK.get()).add(OTItems.RAW_INNO_BLOCK.get())
                .add(OTItems.NETHER_ORE.get()).add(OTItems.NETHER_BLOCK.get()).add(OTItems.NETHER_CORE_BLOCK.get()).add(OTItems.RAW_NETHER_BLOCK.get()).add(OTItems.BRIGHT_FIRST_BLOCK.get())
                .add(OTItems.FIRST_BLOCK.get()).add(OTItems.DARK_FIRST_BLOCK.get()).add(OTItems.RAW_FIRST_BLOCK.get()).add(OTItems.INNO_FLOWER.get());
        this.tag(OTTags.Items.BELONGS_TO_F10_PACK).add(OTItems.BLUE_CARROT.get());
        this.tag(OTTags.Items.BELONGS_TO_RIMCRAFT).add(OTItems.GRANITE_BRICKS.get()).add(OTItems.SLATE_BRICKS.get()).add(OTItems.PLASTEEL_BLOCK.get());

        this.tag(OTTags.Items.MINIFIGURES).add(OTItems.ALAN.get()).add(OTItems.YELLOW_ARMS_ALICE.get()).add(OTItems.CREEPER_ARMS_ALICE.get()).add(OTItems.INNO_ALICE.get()).add(OTItems.RED_ARMS_INNOVATOR.get())
                .add(OTItems.WHITE_ARMS_INNOVATOR.get()).add(OTItems.SPACER_INNOVATOR.get()).add(OTItems.TYLER.get()).add(OTItems.MALENA.get()).add(OTItems.MAGMA_HEAD_NICOLAS.get())
                .add(OTItems.LOUISE.get()).add(OTItems.ALEX.get()).add(OTItems.STEVE.get()).add(OTItems.WITHER_STEVE.get()).add(OTItems.ZOMBIE.get()).add(OTItems.CREEPER.get())
                .add(OTItems.VILLAREN.get()).add(OTItems.FINN.get());
        this.tag(OTTags.Items.SUITS).add(OTItems.PILLAGER_SUIT.get()).add(OTItems.VINDICATOR_SUIT.get()).add(OTItems.EVOKER_SUIT.get()).add(OTItems.ILLUSIONER_SUIT.get()).add(OTItems.PIGLIN_SUIT.get())
                .add(OTItems.PIGLIN_BRUTE_SUIT.get()).add(OTItems.ZOMBIFIED_PIGLIN_SUIT.get()).add(OTItems.CREEPER_SUIT.get()).add(OTItems.CHARGED_CREEPER_SUIT.get());

        // Adding tags from OTTags to Forge tags.
        this.tag(Tags.Items.ORES).addTag(OTTags.Items.ORES_DIAEMERALD).addTag(OTTags.Items.ORES_MAGENTIC).addTag(OTTags.Items.ORES_INNO).addTag(OTTags.Items.ORES_NETHER);
        this.tag(Tags.Items.STORAGE_BLOCKS).addTag(OTTags.Items.STORAGE_BLOCKS_DIAEMERALD).addTag(OTTags.Items.STORAGE_BLOCKS_MAGENTIC)
                .addTag(OTTags.Items.STORAGE_BLOCKS_BRIGHT_FIRST).addTag(OTTags.Items.STORAGE_BLOCKS_FIRST).addTag(OTTags.Items.STORAGE_BLOCKS_RAW_FIRST)
                .addTag(OTTags.Items.STORAGE_BLOCKS_DARK_FIRST).addTag(OTTags.Items.STORAGE_BLOCKS_INNO).addTag(OTTags.Items.STORAGE_BLOCKS_INNO_CORE)
                .addTag(OTTags.Items.STORAGE_BLOCKS_RAW_INNO).addTag(OTTags.Items.STORAGE_BLOCKS_NETHER).addTag(OTTags.Items.STORAGE_BLOCKS_NETHER_CORE)
                .addTag(OTTags.Items.STORAGE_BLOCKS_RAW_NETHER).addTag(OTTags.Items.STORAGE_BLOCKS_PLASTEEL).addTag(OTTags.Items.STORAGE_BLOCKS_PHOENIX);
        this.tag(Tags.Items.INGOTS).addTag(OTTags.Items.INGOTS_MAGENTIC).addTag(OTTags.Items.INGOTS_BRIGHT_FIRST).addTag(OTTags.Items.INGOTS_FIRST).addTag(OTTags.Items.INGOTS_DARK_FIRST)
                .addTag(OTTags.Items.INGOTS_INNO).addTag(OTTags.Items.INGOTS_NETHER);
        this.tag(Tags.Items.GEMS).addTag(OTTags.Items.GEMS_DIAEMERALD).addTag(OTTags.Items.GEMS_MAGENTIC).addTag(OTTags.Items.GEMS_RUBY).addTag(OTTags.Items.GEMS_PHOENIX);
        this.tag(Tags.Items.NUGGETS).addTag(OTTags.Items.NUGGETS_DIAEMERALD).addTag(OTTags.Items.NUGGETS_MAGENTIC).addTag(OTTags.Items.NUGGETS_BRIGHT_FIRST).addTag(OTTags.Items.NUGGETS_FIRST)
                .addTag(OTTags.Items.NUGGETS_DARK_FIRST).addTag(OTTags.Items.NUGGETS_INNO).addTag(OTTags.Items.NUGGETS_NETHER);
        this.tag(OTTags.Items.RAW_MATERIALS).addTag(OTTags.Items.RAW_MATERIALS_FIRST).addTag(OTTags.Items.RAW_MATERIALS_INNO).addTag(OTTags.Items.RAW_MATERIALS_NETHER);
        this.tag(Tags.Items.DUSTS).addTag(OTTags.Items.DUSTS_COAL).addTag(OTTags.Items.DUSTS_DIAMOND).addTag(OTTags.Items.DUSTS_EMERALD).addTag(OTTags.Items.DUSTS_GOLD)
                .addTag(OTTags.Items.DUSTS_IRON).addTag(OTTags.Items.DUSTS_COPPER).addTag(OTTags.Items.DUSTS_LAPIS).addTag(OTTags.Items.DUSTS_NETHERITE)
                .addTag(OTTags.Items.DUSTS_NETHERITE_SCRAP).addTag(OTTags.Items.DUSTS_QUARTZ);
        this.tag(Tags.Items.RODS).addTag(OTTags.Items.RODS_SOUL_BLAZE);
        this.tag(OTTags.Items.CLOTHS).addTag(OTTags.Items.CLOTHS_REINFORCED);
        this.tag(Tags.Items.DYES).addTag(OTTags.Items.DYES_INNO);

        // Adding items from OTTags to Minecraft tags.

        // Adding items from Others to Minecraft tags.
        this.tag(ItemTags.PIGLIN_LOVED).add(OTItems.GOLDEN_BEACON.get()).add(OTItems.GOLDEN_CAULDRON.get()).add(OTItems.MIRROR.get()).add(OTItems.GOLDEN_WATER_BUCKET.get())
                .add(OTItems.ANGEL_RING.get()).add(OTItems.BELL.get()).add(OTItems.ANTIQUE_GOLD_DUST.get()).add(OTItems.GOLD_DUST.get()).add(OTItems.ALICE_AI_SWORD.get())
                .add(OTItems.HASTE_PICKAXE.get());
        this.tag(ItemTags.LEAVES).add(OTItems.AZALEA_LEAVES.get()).add(OTItems.FLOWERING_AZALEA_LEAVES.get()).add(OTItems.DRAWN_ACACIA_LEAVES.get());
        this.tag(ItemTags.SAPLINGS).add(OTItems.SWAMP_OAK_SAPLING.get()).add(OTItems.TALL_BIRCH_SAPLING.get()).add(OTItems.JUNGLE_BUSH_SAPLING.get()).add(OTItems.AZALEA.get())
                .add(OTItems.FLOWERING_AZALEA.get());
        this.tag(ItemTags.STAIRS).add(OTItems.BRIGHT_BLUE_TILE_STAIRS.get()).add(OTItems.BLUE_TILE_STAIRS.get()).add(OTItems.DARK_BLUE_TILE_STAIRS.get()).add(OTItems.INNO_TILE_STAIRS.get())
                .add(OTItems.NETHER_TILE_STAIRS.get());
        this.tag(ItemTags.SLABS).add(OTItems.BRIGHT_BLUE_TILE_SLAB.get()).add(OTItems.BLUE_TILE_SLAB.get()).add(OTItems.DARK_BLUE_TILE_SLAB.get()).add(OTItems.INNO_TILE_SLAB.get())
                .add(OTItems.NETHER_TILE_SLAB.get()).add(OTItems.BORDERED_BEDROCK_SLAB.get()).add(OTItems.BEACON_BEAM_SLAB.get());
        this.tag(ItemTags.WALLS).add(OTItems.BRIGHT_BLUE_TILE_WALL.get()).add(OTItems.BLUE_TILE_WALL.get()).add(OTItems.DARK_BLUE_TILE_WALL.get()).add(OTItems.INNO_TILE_WALL.get())
                .add(OTItems.NETHER_TILE_WALL.get());
        this.tag(ItemTags.SMALL_FLOWERS).add(OTItems.INNO_FLOWER.get()).add(OTItems.FLOWERING_AZALEA.get());
        this.tag(ItemTags.FLOWERS).add(OTItems.FLOWERING_AZALEA_LEAVES.get());
        this.tag(ItemTags.WOOL).add(OTItems.FUR_BLOCK.get());
        this.tag(ItemTags.CARPETS).add(OTItems.MOSS_CARPET.get());
        this.tag(ItemTags.CREEPER_DROP_MUSIC_DISCS).add(OTItems.MUSIC_DISC_FIRST_DATE.get()).add(OTItems.MUSIC_DISC_OMAE_WA_MU.get()).add(OTItems.MUSIC_DISC_A_SKY_FULL_OF_STARS.get())
                .add(OTItems.MUSIC_DISC_TRACES.get()).add(OTItems.MUSIC_DISC_UNDERWATER_TRACKS.get()).add(OTItems.MUSIC_DISC_CREATIVE_TRACKS.get()).add(OTItems.MUSIC_DISC_BLOCKADES.get());
        this.tag(ItemTags.MUSIC_DISCS).add(OTItems.MUSIC_DISC_RUBEDO.get()).add(OTItems.MUSIC_DISC_CHRYSOPOEIA.get()).add(OTItems.MUSIC_DISC_SO_BELOW.get()).add(OTItems.ABU_TUNES.get());
        this.tag(ItemTags.ARROWS).add(OTItems.BAMBOO_ARROW.get()).add(OTItems.BLAZE_ARROW.get());

        // Adding tags from OTTags to Others' tags.
        this.tag(OTTags.Items.BELONGS_TO).addTag(OTTags.Items.BELONGS_TO_VARIANTS).addTag(OTTags.Items.BELONGS_TO_MOB_TAKER).addTag(OTTags.Items.BELONGS_TO_GACHA_LIFE)
                .addTag(OTTags.Items.BELONGS_TO_F10_ELEMENTS).addTag(OTTags.Items.BELONGS_TO_F10_PACK).addTag(OTTags.Items.BELONGS_TO_RIMCRAFT);
        this.tag(OTTags.Items.CORES).addTag(OTTags.Items.CORES_INNO).addTag(OTTags.Items.CORES_NETHER);
        this.tag(OTTags.Items.CAVES_AND_CLIFFS_CONTENT).add(OTItems.AZALEA_LEAVES.get()).add(OTItems.FLOWERING_AZALEA_LEAVES.get()).add(OTItems.AZALEA.get())
                .add(OTItems.FLOWERING_AZALEA.get()).add(OTItems.MOSS_BLOCK.get()).add(OTItems.MOSS_CARPET.get()).add(OTItems.ROOTED_DIRT.get()).add(OTItems.HANGING_ROOTS.get())
                .add(OTItems.AZALEA_HELM.get()).add(OTItems.AMETHYST_SWORD.get()).add(OTItems.LIGHTNING_SWORD.get()).add(OTItems.COPPER_DUST.get());
        this.tag(OTTags.Items.MONITORS).add(OTItems.MONITOR.get()).add(OTItems.SCREEN_MONITOR.get());
        this.tag(OTTags.Items.CRAFTING_TABLES).add(Items.CRAFTING_TABLE).add(OTItems.CRAFTER.get()).add(OTItems.DRAWN_CRAFTING_TABLE.get());
        this.tag(OTTags.Items.SMITHING_TABLES).add(Items.SMITHING_TABLE).add(OTItems.DRAWN_SMITHING_TABLE.get());
    }
}
