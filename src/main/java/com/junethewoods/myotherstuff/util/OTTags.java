package com.junethewoods.myotherstuff.util;

import com.junethewoods.myotherstuff.MyOtherStuff;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class OTTags {
    public static class Items {
        public static final ITag.INamedTag<Item> ORES_DIAEMERALD = forge("ores/diaemerald");
        public static final ITag.INamedTag<Item> ORES_MAGENTIC = forge("ores/magentic");
        public static final ITag.INamedTag<Item> ORES_INNO = forge("ores/inno");
        public static final ITag.INamedTag<Item> ORES_NETHER = forge("ores/nether");

        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_DIAEMERALD = forge("storage_blocks/diaemerald");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_MAGENTIC = forge("storage_blocks/magentic");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_BRIGHT_FIRST = forge("storage_blocks/bright_first");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_FIRST = forge("storage_blocks/first");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_RAW_FIRST = forge("storage_blocks/raw_first");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_DARK_FIRST = forge("storage_blocks/dark_first");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_INNO = forge("storage_blocks/inno");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_INNO_CORE = forge("storage_blocks/inno_core");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_RAW_INNO = forge("storage_blocks/raw_inno");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_NETHER = forge("storage_blocks/nether");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_NETHER_CORE = forge("storage_blocks/nether_core");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_RAW_NETHER = forge("storage_blocks/raw_nether");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_PLASTEEL = forge("storage_blocks/plasteel");
        public static final ITag.INamedTag<Item> STORAGE_BLOCKS_PHOENIX = forge("storage_blocks/phoenix");

        public static final ITag.INamedTag<Item> INGOTS_MAGENTIC = forge("ingots/magentic");
        public static final ITag.INamedTag<Item> INGOTS_BRIGHT_FIRST = forge("ingots/bright_first");
        public static final ITag.INamedTag<Item> INGOTS_FIRST = forge("ingots/first");
        public static final ITag.INamedTag<Item> INGOTS_DARK_FIRST = forge("ingots/dark_first");
        public static final ITag.INamedTag<Item> INGOTS_INNO = forge("ingots/inno");
        public static final ITag.INamedTag<Item> INGOTS_NETHER = forge("ingots/nether");

        public static final ITag.INamedTag<Item> GEMS_DIAEMERALD = forge("gems/diaemerald");
        public static final ITag.INamedTag<Item> GEMS_MAGENTIC = forge("gems/magentic");
        public static final ITag.INamedTag<Item> GEMS_RUBY = forge("gems/ruby");
        public static final ITag.INamedTag<Item> GEMS_PHOENIX = forge("gems/phoenix");

        public static final ITag.INamedTag<Item> NUGGETS_DIAEMERALD = forge("nuggets/diaemerald");
        public static final ITag.INamedTag<Item> NUGGETS_MAGENTIC = forge("nuggets/magentic");
        public static final ITag.INamedTag<Item> NUGGETS_BRIGHT_FIRST = forge("nuggets/bright_first");
        public static final ITag.INamedTag<Item> NUGGETS_FIRST = forge("nuggets/first");
        public static final ITag.INamedTag<Item> NUGGETS_DARK_FIRST = forge("nuggets/dark_first");
        public static final ITag.INamedTag<Item> NUGGETS_INNO = forge("nuggets/inno");
        public static final ITag.INamedTag<Item> NUGGETS_NETHER = forge("nuggets/nether");

        // From Variants
        public static final ITag.INamedTag<Item> RODS_SOUL_BLAZE = forge("rods/soul_blaze");

        // From F10 Elements
        public static final ITag.INamedTag<Item> CORES = forge("cores");
        public static final ITag.INamedTag<Item> CORES_INNO = forge("cores/inno");
        public static final ITag.INamedTag<Item> CORES_NETHER = forge("cores/nether");

        public static final ITag.INamedTag<Item> DYES_INNO = forge("dyes/inno");

        // From Fabricio2010's Pack
        public static final ITag.INamedTag<Item> CROPS_BLUE_CARROTS = forge("crops/blue_carrots");

        public static final ITag.INamedTag<Item> DUSTS_COAL = forge("dusts/coal");
        public static final ITag.INamedTag<Item> DUSTS_DIAMOND = forge("dusts/diamond");
        public static final ITag.INamedTag<Item> DUSTS_EMERALD = forge("dusts/emerald");
        public static final ITag.INamedTag<Item> DUSTS_GOLD = forge("dusts/gold");
        public static final ITag.INamedTag<Item> DUSTS_IRON = forge("dusts/iron");
        public static final ITag.INamedTag<Item> DUSTS_COPPER = forge("dusts/copper");
        public static final ITag.INamedTag<Item> DUSTS_LAPIS = forge("dusts/lapis");
        public static final ITag.INamedTag<Item> DUSTS_NETHERITE = forge("dusts/netherite");
        public static final ITag.INamedTag<Item> DUSTS_NETHERITE_SCRAP = forge("dusts/netherite_scrap");
        public static final ITag.INamedTag<Item> DUSTS_QUARTZ = forge("dusts/quartz");

        public static final ITag.INamedTag<Item> RAW_MATERIALS = forge("raw_materials");
        public static final ITag.INamedTag<Item> RAW_MATERIALS_FIRST = forge("raw_materials/first");
        public static final ITag.INamedTag<Item> RAW_MATERIALS_INNO = forge("raw_materials/inno");
        public static final ITag.INamedTag<Item> RAW_MATERIALS_NETHER = forge("raw_materials/nether");

        public static final ITag.INamedTag<Item> ARMORS_BOOTS = forge("armors/boots");
        public static final ITag.INamedTag<Item> ELYTRA = forge("elytra");

        // Tags from My Other Stuff
        public static final ITag.INamedTag<Item> MINIFIGURES = mod("minifigures");
        public static final ITag.INamedTag<Item> SUITS = mod("suits");

        public static final ITag.INamedTag<Item> BELONGS_TO = mod("belongs_to");
        public static final ITag.INamedTag<Item> BELONGS_TO_VARIANTS = mod("belongs_to/variants");
        public static final ITag.INamedTag<Item> BELONGS_TO_MOB_TAKER = mod("belongs_to/mob_taker");
        public static final ITag.INamedTag<Item> BELONGS_TO_GACHA_LIFE = mod("belongs_to/gacha_life");
        public static final ITag.INamedTag<Item> BELONGS_TO_F10_ELEMENTS = mod("belongs_to/f10elements");
        public static final ITag.INamedTag<Item> BELONGS_TO_F10_PACK = mod("belongs_to/fabricio2010pack");
        public static final ITag.INamedTag<Item> BELONGS_TO_RIMCRAFT = mod("belongs_to/rimcraft");

        public static final ITag.INamedTag<Item> CAVES_AND_CLIFFS_CONTENT = mod("caves_and_cliffs_content");
        public static final ITag.INamedTag<Item> MONITORS = mod("monitors");

        // Tags from other mods
        // In Real Life - Sophie Clothes
        public static final ITag.INamedTag<Item> CLOTHS = otherMod("cloths", "inreallife");
        public static final ITag.INamedTag<Item> CLOTHS_REINFORCED = otherMod("cloths/reinforced", "inreallife");
        public static final ITag.INamedTag<Item> CLOTHS_GALAXY = otherMod("cloths/galaxy", "inreallife");

        // Project Alcook
        public static final ITag.INamedTag<Item> MINI_PEOPLE = otherMod("mini_people", "project_alcook");

        // Melony
        public static final ITag.INamedTag<Item> CRAFTING_TABLES = melony("crafting_tables");
        public static final ITag.INamedTag<Item> SMITHING_TABLES = melony("smithing_tables");
        public static final ITag.INamedTag<Item> BOWS = melony("bows");
        public static final ITag.INamedTag<Item> CROSSBOWS = melony("crossbows");

        // Curios
        public static final ITag.INamedTag<Item> BACK_ITEMS = otherMod("back", "curios");

        public static ITag.INamedTag<Item> forge(String name) {
            return ItemTags.bind(new ResourceLocation("forge", name).toString());
        }

        public static ITag.INamedTag<Item> melony(String name) {
            return ItemTags.bind(new ResourceLocation("melony", name).toString());
        }

        public static ITag.INamedTag<Item> mod(String name) {
            return ItemTags.bind(MyOtherStuff.resourceLoc(name).toString());
        }

        public static ITag.INamedTag<Item> otherMod(String name, String modID) {
            return ItemTags.bind(new ResourceLocation(modID, name).toString());
        }
    }

    public static class Blocks {
        public static final ITag.INamedTag<Block> ORES_DIAEMERALD = forge("ores/diaemerald");
        public static final ITag.INamedTag<Block> ORES_MAGENTIC = forge("ores/magentic");
        public static final ITag.INamedTag<Block> ORES_INNO = forge("ores/inno");
        public static final ITag.INamedTag<Block> ORES_NETHER = forge("ores/nether");

        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_DIAEMERALD = forge("storage_blocks/diaemerald");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_MAGENTIC = forge("storage_blocks/magentic");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_BRIGHT_FIRST = forge("storage_blocks/bright_first");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_FIRST = forge("storage_blocks/first");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_RAW_FIRST = forge("storage_blocks/raw_first");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_DARK_FIRST = forge("storage_blocks/dark_first");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_INNO = forge("storage_blocks/inno");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_INNO_CORE = forge("storage_blocks/inno_core");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_RAW_INNO = forge("storage_blocks/raw_inno");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_NETHER = forge("storage_blocks/nether");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_NETHER_CORE = forge("storage_blocks/nether_core");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_RAW_NETHER = forge("storage_blocks/raw_nether");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_PLASTEEL = forge("storage_blocks/plasteel");
        public static final ITag.INamedTag<Block> STORAGE_BLOCKS_PHOENIX = forge("storage_blocks/phoenix");

        // From Fabricio2010's Pack
        public static final ITag.INamedTag<Block> CROPS_BLUE_CARROTS = forge("crops/blue_carrots");

        public static final ITag.INamedTag<Block> BELONGS_TO = mod("belongs_to");
        public static final ITag.INamedTag<Block> BELONGS_TO_VARIANTS = mod("belongs_to/variants");
        public static final ITag.INamedTag<Block> BELONGS_TO_MOB_TAKER = mod("belongs_to/mob_taker");
        public static final ITag.INamedTag<Block> BELONGS_TO_GACHA_LIFE = mod("belongs_to/gacha_life");
        public static final ITag.INamedTag<Block> BELONGS_TO_F10_ELEMENTS = mod("belongs_to/f10elements");
        public static final ITag.INamedTag<Block> BELONGS_TO_F10_PACK = mod("belongs_to/fabricio2010pack");
        public static final ITag.INamedTag<Block> BELONGS_TO_RIMCRAFT = mod("belongs_to/rimcraft");

        public static final ITag.INamedTag<Block> CAVES_AND_CLIFFS_CONTENT = mod("caves_and_cliffs_content");
        public static final ITag.INamedTag<Block> AZALEA_PLACEABLE_ON = mod("azalea_placeable_on");
        public static final ITag.INamedTag<Block> BLUE_CARROTS_PLANTABLE_ON = mod("blue_carrots_plantable_on");

        // Melony Tags
        public static final ITag.INamedTag<Block> DEEPSLATE_REPLACEABLES = melony("deepslate_replaceables");
        public static final ITag.INamedTag<Block> FARMLAND = melony("farmland");
        public static final ITag.INamedTag<Block> CRAFTING_TABLES = melony("crafting_tables");
        public static final ITag.INamedTag<Block> SMITHING_TABLES = melony("smithing_tables");

        // Other Mods
        public static final ITag.INamedTag<Block> INFINIBURN_ALJAN = otherMod("infiniburn_aljan", "backmath");

        public static ITag.INamedTag<Block> forge(String name) {
            return BlockTags.bind(new ResourceLocation("forge", name).toString());
        }

        public static ITag.INamedTag<Block> melony(String name) {
            return BlockTags.bind(new ResourceLocation("melony", name).toString());
        }

        public static ITag.INamedTag<Block> mod(String name) {
            return BlockTags.bind(MyOtherStuff.resourceLoc(name).toString());
        }

        public static ITag.INamedTag<Block> otherMod(String name, String modID) {
            return BlockTags.bind(new ResourceLocation(modID, name).toString());
        }
    }
}
