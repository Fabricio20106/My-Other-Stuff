package com.junethewoods.myotherstuff.data.lang;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.item.OTItems;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.function.Supplier;

public class OTEnglishLanguageProvider extends LanguageProvider {
    public OTEnglishLanguageProvider(DataGenerator generator) {
        super(generator, MyOtherStuff.MOD_ID, "en_us");
    }

    @Override
    public String getName() {
        return "My Other Stuff - Language Provider (en_us)";
    }

    @Override
    protected void addTranslations() {
        add(OTBlocks.BRIGHT_BLUE_TILES, "Bright Blue Tiles");
        add(OTBlocks.BRIGHT_BLUE_TILE_STAIRS, "Bright Blue Tile Stairs");
        add(OTBlocks.BRIGHT_BLUE_TILE_SLAB, "Bright Blue Tile Slab");
        add(OTBlocks.BRIGHT_BLUE_TILE_WALL, "Bright Blue Tile Wall");
        add(OTBlocks.BLUE_TILES, "Blue Tiles");
        add(OTBlocks.CHISELED_BLUE_TILES, "Chiseled Blue Tiles");
        add(OTBlocks.BLUE_TILE_STAIRS, "Blue Tile Stairs");
        add(OTBlocks.BLUE_TILE_SLAB, "Blue Tile Slab");
        add(OTBlocks.BLUE_TILE_WALL, "Blue Tile Wall");
        add(OTBlocks.DARK_BLUE_TILES, "Dark Blue Tiles");
        add(OTBlocks.DARK_BLUE_TILE_STAIRS, "Dark Blue Tile Stairs");
        add(OTBlocks.DARK_BLUE_TILE_SLAB, "Dark Blue Tile Slab");
        add(OTBlocks.DARK_BLUE_TILE_WALL, "Dark Blue Tile Wall");
        add(OTBlocks.INNO_TILES, "Inno Tiles");
        add(OTBlocks.INNO_TILE_STAIRS, "Inno Tile Stairs");
        add(OTBlocks.INNO_TILE_SLAB, "Inno Tile Slab");
        add(OTBlocks.INNO_TILE_WALL, "Inno Tile Wall");
        add(OTBlocks.NETHER_TILES, "Nether Tiles");
        add(OTBlocks.NETHER_TILE_STAIRS, "Nether Tile Stairs");
        add(OTBlocks.NETHER_TILE_SLAB, "Nether Tile Slab");
        add(OTBlocks.NETHER_TILE_WALL, "Nether Tile Wall");
        add(OTBlocks.BLUE_CARROTS, "Blue Carrot");
        add(OTBlocks.SCREEN_MONITOR, "Screen Monitor");
        add(OTBlocks.MONITOR, "Monitor");
        add(OTBlocks.DRAWN_ACACIA_LEAVES, "Drawn Acacia Leaves");
        add(OTBlocks.ROOTED_DIRT, "Rooted Dirt");
        add(OTBlocks.HANGING_ROOTS, "Hanging Roots");
        add(OTBlocks.MOSS_CARPET, "Moss Carpet");
        add(OTBlocks.MOSS_BLOCK, "Moss Block");
        add(OTBlocks.AZALEA_LEAVES, "Azalea Leaves");
        add(OTBlocks.FLOWERING_AZALEA_LEAVES, "Flowering Azalea Leaves");
        add(OTBlocks.AZALEA, "Azalea");
        add(OTBlocks.FLOWERING_AZALEA, "Flowering Azalea");
        add(OTBlocks.GRANITE_BRICKS, "Granite Bricks");
        add(OTBlocks.SLATE_BRICKS, "Slate Bricks");
        add(OTBlocks.FUR_BLOCK, "Fur Block");
        add(OTBlocks.BORDERED_BEDROCK, "Bordered Bedrock");
        add(OTBlocks.BORDERED_BEDROCK_SLAB, "Bordered Bedrock Slab");
        add(OTBlocks.BEACON_BEAM_BLOCK, "Beacon Beam Block");
        add(OTBlocks.BEACON_BEAM_SLAB, "Beacon Beam Slab");
        add(OTBlocks.BLUE_GLASS, "Blue Glass");
        add(OTBlocks.CYAN_GLASS, "Cyan Glass");
        add(OTBlocks.END_CRYSTAL_GLASS, "End Crystal Glass");
        add(OTBlocks.END_CRYSTAL_GLASS_PANE, "End Crystal Glass Pane");
        add(OTBlocks.CYAN_GLASS_PANE, "Cyan Glass Pane");
        add(OTBlocks.BLUE_GLASS_PANE, "Blue Glass Pane");
        add(OTBlocks.DRAWN_COMMAND_BLOCK, "Drawn Command Block");
        add(OTBlocks.DRAWN_CRAFTING_TABLE, "Drawn Crafting Table");
        add(OTBlocks.DRAWN_SMITHING_TABLE, "Drawn Smithing Table");
        add(OTBlocks.GOLDEN_CAULDRON, "Golden Cauldron");
        add(OTBlocks.GOLDEN_BEACON, "Golden Beacon");
        add(OTBlocks.DRAWN_CREATIVE_ENERGY_CUBE, "Drawn Creative Energy Cube");
        add(OTBlocks.CPU, "CPU");
        add(OTBlocks.CRAFTER, "Crafter");
        add(OTBlocks.DRAWN_FURNACE, "Drawn Furnace");
        add(OTBlocks.JUNGLE_BUSH_SAPLING, "Jungle Bush Sapling");
        add(OTBlocks.SWAMP_OAK_SAPLING, "Swamp Oak Sapling");
        add(OTBlocks.TALL_BIRCH_SAPLING, "Tall Birch Sapling");
        add(OTBlocks.INNO_FLOWER, "Inno Flower");
        add(OTBlocks.DECORATED_FLOWER_POT, "Decorated Flower Pot");
        add(OTBlocks.STRIPED_DECORATED_FLOWER_POT, "Decorated Flower Pot (Striped)");
        add(OTBlocks.DECORATED_POTTED_INNO_FLOWER, "Potted Inno Flower (Decorated Flower Pot)");
        add(OTBlocks.POTTED_INNO_FLOWER, "Potted Inno Flower");
        add(OTBlocks.POTTED_TALL_BIRCH_SAPLING, "Potted Tall Birch Sapling");
        add(OTBlocks.POTTED_SWAMP_OAK_SAPLING, "Potted Swamp Oak Sapling");
        add(OTBlocks.POTTED_JUNGLE_BUSH_SAPLING, "Potted Jungle Bush Sapling");
        add(OTBlocks.POTTED_GRASS, "Potted Grass");
        add(OTBlocks.POTTED_AZALEA, "Potted Azalea");
        add(OTBlocks.POTTED_FLOWERING_AZALEA, "Potted Flowering Azalea");
        add(OTBlocks.DIAEMERALD_ORE, "Diaemerald Ore");
        add(OTBlocks.DEEPSLATE_DIAEMERALD_ORE, "Deepslate Diaemerald Ore");
        add(OTBlocks.DIAEMERALD_BLOCK, "Block of Diaemerald");
        add(OTBlocks.MAGENTIC_CRYSTAL_ORE, "Magentic Crystal Ore");
        add(OTBlocks.DEEPSLATE_MAGENTIC_CRYSTAL_ORE, "Deepslate Magentic Crystal Ore");
        add(OTBlocks.MAGENTIC_CRYSTAL_BLOCK, "Block of Magentic Crystal");
        add(OTBlocks.INNO_ORE, "Inno Ore");
        add(OTBlocks.INNO_BLOCK, "Block of Inno");
        add(OTBlocks.RAW_INNO_BLOCK, "Block of Raw Inno");
        add(OTBlocks.NETHER_ORE, "Nether Ore");
        add(OTBlocks.NETHER_BLOCK, "Block of Nether");
        add(OTBlocks.RAW_NETHER_BLOCK, "Block of Raw Nether");
        add(OTBlocks.BRIGHT_FIRST_BLOCK, "Block of Bright First");
        add(OTBlocks.DARK_FIRST_BLOCK, "Block of Dark First");
        add(OTBlocks.FIRST_BLOCK, "Block of First");
        add(OTBlocks.RAW_FIRST_BLOCK, "Block of Raw First");
        add(OTBlocks.PHOENIX_GEM_BLOCK, "Block of Phoenix Gem");
        add(OTBlocks.PLASTEEL_BLOCK, "Block of Plasteel");
        add(OTBlocks.INNO_CORE_BLOCK, "Block of Inno Core");
        add(OTBlocks.NETHER_CORE_BLOCK, "Block of Nether Core");

        add("container.lego_furnace", "Drawn Smelting");
        add("container.purplier_smithing", "Drawn Smithing");
        add("container.crafting_one", "Drawn Crafting");
        add("container.autocrafter", "Auto Crafting");

        add("itemGroup.others.items", "My Other Stuff - Items");
        add("itemGroup.others.weapons", "My Other Stuff - Weapons");
        add("itemGroup.others.blocks", "My Other Stuff - Blocks");

        item(OTItems.TAB, "Tab");
        item(OTItems.ALAN, "Alan");
        item(OTItems.LOUISE, "Steve-Like Alex");
        item(OTItems.ALEX, "Alex");
        item(OTItems.YELLOW_ARMS_ALICE, "Alice");
        item(OTItems.CREEPER_ARMS_ALICE, "Creeper-Arms Alice");
        item(OTItems.INNO_ALICE, "Inno Alice");
        item(OTItems.CREEPER, "Creeper");
        item(OTItems.FINN, "Finn");
        item(OTItems.RED_ARMS_INNOVATOR, "Innovator");
        item(OTItems.WHITE_ARMS_INNOVATOR, "Origins Innovator");
        item(OTItems.SPACER_INNOVATOR, "Space Innovator");
        item(OTItems.MALENA, "Malena");
        item(OTItems.MAGMA_HEAD_NICOLAS, "Magma Cube Head Nicolas");
        item(OTItems.STEVE, "Steve");
        item(OTItems.WITHER_STEVE, "Wither Skeleton Skull Steve");
        item(OTItems.TYLER, "Tyler");
        item(OTItems.VILLAREN, "Villager (or FAKE Alan)");
        item(OTItems.ZOMBIE, "Zombie");
        item(OTItems.CHARGED_CREEPER_SUIT, "Charged Creeper Suit");
        item(OTItems.CREEPER_SUIT, "Creeper Suit");
        item(OTItems.EVOKER_SUIT, "Evoker Suit");
        item(OTItems.GHAST, "Ghast");
        item(OTItems.ILLUSIONER_SUIT, "Illusioner Suit");
        item(OTItems.PIGLIN_BRUTE_SUIT, "Piglin Brute Suit");
        item(OTItems.PIGLIN_SUIT, "Piglin Suit");
        item(OTItems.PILLAGER_SUIT, "Pillager Suit");
        item(OTItems.VINDICATOR_SUIT, "Vindicator Suit");
        item(OTItems.ZOMBIFIED_PIGLIN_SUIT, "Zombified Piglin Suit");
        item(OTItems.ULTRA_BALL, "Ultra Ball");
        item(OTItems.MASTER_BALL, "Master Ball");
        item(OTItems.MINI_CLOUD, "Mini Cloud");
        item(OTItems.GREEN_BAG, "Green Bag");
        item(OTItems.CUP, "Cup");
        item(OTItems.WATER_CUP, "Water Cup");
        item(OTItems.MILK_CUP, "Milk Cup");
        item(OTItems.WITHOUT_TITLE, "Without Title");
        item(OTItems.MILK_CUP_ALT, "Milk (1)");
        item(OTItems.MILK_MUG, "Milk Cup");
        item(OTItems.GREEN_TEA, "Green Tea");
        item(OTItems.MINI_LIPSTICK, "Mini Lipstick");
        item(OTItems.CARBON_BASE, "Dark Base");
        item(OTItems.GLASS_CASING, "Glass Casing");
        item(OTItems.REDSTONE_LIPSTICK, "Red Lipstick");
        item(OTItems.GOLDEN_WATER_BUCKET, "Golden Water Bucket");
        item(OTItems.MAGMA_BUCKET, "Magma Bucket");
        item(OTItems.MIRROR, "Mirror");
        item(OTItems.HEROES_EMERALD, "Heroes Emerald");
        item(OTItems.SLOW_FALL_FEATHERS, "Slow Fall Feathers");
        item(OTItems.LEVITATING_CLOUD, "Levitating Cloud");
        item(OTItems.MINING_SPOON, "Mining Spoon");
        item(OTItems.FA_SKIN, "Fa Skin");
        item(OTItems.ANGEL_RING, "Base Angel Ring");
        item(OTItems.BAT_ANGEL_RING, "Bat Angel Ring");
        item(OTItems.BEE_ANGEL_RING, "Bee Angel Ring");
        item(OTItems.ELYTRA_ANGEL_RING, "Elytra Angel Ring");
        item(OTItems.VEX_ANGEL_RING, "Vex Angel Ring");
        item(OTItems.BELL, "Bell");
        item(OTItems.BLAZE_RODS, "Blaze Rods");
        item(OTItems.DRAGON_FIREBALL, "Dragon Fireball");
        item(OTItems.END_ROD, "End Rod");
        add("item.others.banner_1", "Banner (1)");
        item(OTItems.ARMOR_STAND, "Armor Stand");
        item(OTItems.ABU_TUNES, "Abu Tunes");
        item(OTItems.MUSIC_DISC_RUBEDO, "Music Disc");
        add(OTItems.MUSIC_DISC_RUBEDO.get().getDescriptionId() + ".desc", "Lena Raine - Rubedo");
        item(OTItems.MUSIC_DISC_CHRYSOPOEIA, "Music Disc");
        add(OTItems.MUSIC_DISC_CHRYSOPOEIA.get().getDescriptionId() + ".desc", "Lena Raine - Chrysopoeia");
        item(OTItems.MUSIC_DISC_SO_BELOW, "Music Disc");
        add(OTItems.MUSIC_DISC_SO_BELOW.get().getDescriptionId() + ".desc", "Lena Raine - So Below");
        item(OTItems.MUSIC_DISC_CREATIVE_TRACKS, "Music Disc");
        add(OTItems.MUSIC_DISC_CREATIVE_TRACKS.get().getDescriptionId() + ".desc", "C418 - Creative Tracks");
        item(OTItems.MUSIC_DISC_THE_END, "Music Disc");
        add(OTItems.MUSIC_DISC_THE_END.get().getDescriptionId() + ".desc", "C418 - Outer End");
        item(OTItems.MUSIC_DISC_UNDERWATER_TRACKS, "Music Disc");
        add(OTItems.MUSIC_DISC_UNDERWATER_TRACKS.get().getDescriptionId() + ".desc", "C418 - Underwater Tracks");
        item(OTItems.MUSIC_DISC_BLOCKADES, "Music Disc");
        add(OTItems.MUSIC_DISC_BLOCKADES.get().getDescriptionId() + ".desc", "Muse - Blockades");
        item(OTItems.MUSIC_DISC_FIRST_DATE, "Music Disc");
        add(OTItems.MUSIC_DISC_FIRST_DATE.get().getDescriptionId() + ".desc", "Frad - First Date");
        item(OTItems.MUSIC_DISC_OMAE_WA_MU, "Music Disc");
        add(OTItems.MUSIC_DISC_OMAE_WA_MU.get().getDescriptionId() + ".desc", "Omae wa Mu");
        item(OTItems.MUSIC_DISC_A_SKY_FULL_OF_STARS, "Music Disc");
        add(OTItems.MUSIC_DISC_A_SKY_FULL_OF_STARS.get().getDescriptionId() + ".desc", "Coldplay - A Sky Full of Stars");
        item(OTItems.MUSIC_DISC_TRACES, "Music Disc");
        add(OTItems.MUSIC_DISC_TRACES.get().getDescriptionId() + ".desc", "Alistair Lindsay - Traces");
        item(OTItems.ANTIQUE_DIAMOND_DUST, "Antique Diamond Dust");
        item(OTItems.ANTIQUE_EMERALD_DUST, "Antique Emerald Dust");
        item(OTItems.ANTIQUE_GOLD_DUST, "Antique Gold Dust");
        item(OTItems.ANTIQUE_IRON_DUST, "Antique Iron Dust");
        item(OTItems.ANTIQUE_REDSTONE_DUST, "Antique Redstone Dust");
        item(OTItems.DIAMOND_DUST, "Diamond Dust");
        item(OTItems.EMERALD_DUST, "Emerald Dust");
        item(OTItems.QUARTZ_DUST, "Quartz Dust");
        item(OTItems.COAL_DUST, "Coal Dust");
        item(OTItems.REDSTONE_DUST, "Redstone Dust");
        item(OTItems.GOLD_DUST, "Gold Dust");
        item(OTItems.IRON_DUST, "Iron Dust");
        item(OTItems.COPPER_DUST, "Copper Dust");
        item(OTItems.LAPIS_LAZULI_DUST, "Lapis Lazuli Dust");
        item(OTItems.NETHERITE_DUST, "Netherite Dust");
        item(OTItems.NETHERITE_SCRAP_DUST, "Netherite Scrap Dust");
        item(OTItems.PINK_LEMONADE, "Pink Lemonade");
        item(OTItems.ENCHANTING_TABLE_BOOK, "Enchantment Table's Book");
        item(OTItems.PHOENIX_STAFF, "Phoenix Wand");
        item(OTItems.PHOENIX_GEM, "Phoenix Gem");
        item(OTItems.BAT_WINGS, "Bat Wings");
        item(OTItems.BEE_WINGS, "Bee Wings");
        item(OTItems.ENDER_DRAGON_WINGS, "Ender Dragon Wings");
        item(OTItems.RED_PARROT_WINGS, "Red Parrot Wings");
        item(OTItems.VEX_WINGS, "Vex Wings");
        item(OTItems.BADMINTON_SET, "Badminton Set");
        item(OTItems.SPRINKLED_DONUT, "Sprinkled Donut");
        item(OTItems.SUGAR_COOKIE, "Sugar Cookie");
        item(OTItems.COOKIE, "Cookie");
        item(OTItems.MAGENTIC_CRYSTAL_SWORD, "Magentic Crystal Sword");
        item(OTItems.MAGENTIC_CRYSTAL_PICKAXE, "Magentic Crystal Pickaxe");
        item(OTItems.MAGENTIC_CRYSTAL_SHOVEL, "Magentic Crystal Shovel");
        item(OTItems.MAGENTIC_CRYSTAL_AXE, "Magentic Crystal Axe");
        item(OTItems.MAGENTIC_CRYSTAL_HOE, "Magentic Crystal Hoe");
        item(OTItems.DIAEMERALD_SWORD, "Diaemerald Sword");
        item(OTItems.DIAEMERALD_PICKAXE, "Diaemerald Pickaxe");
        item(OTItems.DIAEMERALD_SHOVEL, "Diaemerald Shovel");
        item(OTItems.DIAEMERALD_AXE, "Diaemerald Axe");
        item(OTItems.DIAEMERALD_HOE, "Diaemerald Hoe");
        item(OTItems.HASTE_PICKAXE, "Haste Pickaxe");
        item(OTItems.LEGO_HAMMER, "LEGO Hammer");
        item(OTItems.FTF_HAMMER, "FTF Hammer");
        item(OTItems.FARMER_HOE, "Farmer Fabricio2010's Hoe");
        item(OTItems.BLAZE_SHEARS, "Blaze Shears");
        item(OTItems.BAMBOO_FISHING_ROD, "Bamboo Fishing Rod");
        item(OTItems.WARPED_FUNGUS_ON_A_BAMBOO, "Warped Fungus on a Bamboo");
        item(OTItems.CARROT_ON_A_BAMBOO, "Carrot on a Bamboo");
        item(OTItems.BLAZE_ELYTRA, "Blaze Elytra");
        item(OTItems.FAST_ELYTRA, "Fast Elytra");
        item(OTItems.BLAZE_AND_GOLD, "Blaze and Gold");
        item(OTItems.BAMBOO_BOW, "Bamboo Bow");
        item(OTItems.BAMBOO_CROSSBOW, "Bamboo Crossbow");
        item(OTItems.BLAZE_BOW, "Blaze Bow");
        item(OTItems.BLAZE_CROSSBOW, "Blaze Crossbow");
        item(OTItems.DIAMOND_CROSSBOW, "Diamond Crossbow");
        item(OTItems.ENDER_CROSSBOW, "Ender Crossbow");
        item(OTItems.SPAWNER_MINECART, "Minecart with Spawner");
        item(OTItems.HEART_YO_YO, "Heart Yo-yo");
        item(OTItems.MULTILASER_SPEAKERS, "Multilaser Speakers");
        item(OTItems.GREEN_APPLE, "Green Apple");
        item(OTItems.CUPCAKE, "Cupcake");
        item(OTItems.BLAZE_ARROW, "Blaze Arrow");
        item(OTItems.BAMBOO_ARROW, "Bamboo Arrow");
        item(OTItems.SPEAKER_CIRCUIT_PIECE, "Circuit Piece (Speaker)");
        item(OTItems.MELONNIERS_CAPE, "Melonniers Cape");
        item(OTItems.TULIP, "Tulip");
        item(OTItems.LEGO_PIECES, "LEGO Pieces");
        item(OTItems.BLUE_LEATHER, "Blue Leather");
        item(OTItems.GALAXY_CLOTH, "Galaxy Cloth");
        item(OTItems.REINFORCED_CLOTH, "Reinforced Cloth");
        item(OTItems.INNO_DYE, "Inno Dye");
        item(OTItems.EMERALD_SWORD, "Emerald Sword");
        item(OTItems.RAINBOW_SWORD, "Rainbow Sword");
        item(OTItems.STRENGTH_IRON_SWORD, "Strength Iron Sword");
        item(OTItems.WEAKENED_IRON_SWORD, "Weakened Iron Sword");
        item(OTItems.INNO_SWORD, "Inno Sword");
        item(OTItems.INNO_SWORD_2, "Inno Sword");
        item(OTItems.NETHER_SWORD, "Nether Sword");
        item(OTItems.ALAN_AI_SWORD, "Alan's AI Sword");
        item(OTItems.ALICE_AI_SWORD, "Alice's AI Sword");
        item(OTItems.INNOVATOR_AI_SWORD, "Innovator's AI Sword");
        item(OTItems.NICOLAS_AI_SWORD, "Nicolas AI Sword");
        item(OTItems.ANCHOR_SWORD, "Anchor Sword");
        item(OTItems.ANCHOR_PICKAXE, "Anchor Pickaxe");
        item(OTItems.ANCHOR_SHOVEL, "Anchor Shovel");
        item(OTItems.ANCHOR_AXE, "Anchor Axe");
        item(OTItems.ANCHOR_HOE, "Anchor Hoe");
        item(OTItems.ANCHOR_HELMET, "Anchor Helmet");
        item(OTItems.ANCHOR_CHESTPLATE, "Anchor Chestplate");
        item(OTItems.ANCHOR_LEGGINGS, "Anchor Leggings");
        item(OTItems.ANCHOR_BOOTS, "Anchor Boots");
        item(OTItems.MAGENTIC_CRYSTAL, "Magentic Crystal");
        item(OTItems.MAGENTIC_CRYSTAL_NUGGET, "Magentic Crystal Nugget");
        item(OTItems.DIAEMERALD, "Diaemerald");
        item(OTItems.DIAEMERALD_NUGGET, "Diaemerald Nugget");
        item(OTItems.BRIGHT_FIRST_INGOT, "Bright First Ingot");
        item(OTItems.BRIGHT_FIRST_NUGGET, "Bright First Nugget");
        item(OTItems.DARK_FIRST_INGOT, "Dark First Ingot");
        item(OTItems.DARK_FIRST_NUGGET, "Dark First Nugget");
        item(OTItems.FIRST_INGOT, "First Ingot");
        item(OTItems.FIRST_NUGGET, "First Nugget");
        item(OTItems.NETHER_INGOT, "Nether Ingot");
        item(OTItems.NETHER_NUGGET, "Nether Nugget");
        item(OTItems.INNO_INGOT, "Inno Ingot");
        item(OTItems.INNO_NUGGET, "Inno Nugget");
        item(OTItems.RAW_FIRST, "Raw First");
        item(OTItems.RAW_NETHER, "Raw Nether");
        item(OTItems.RAW_INNO, "Raw Inno");
        item(OTItems.MAGENTIC_INGOT, "Magentic Ingot");
        item(OTItems.MAGENTIC_NUGGET, "Magentic Nugget");
        item(OTItems.INNO_CORE, "Inno Core");
        item(OTItems.NETHER_CORE, "Nether Core");
        item(OTItems.RUBY, "Ruby");
        item(OTItems.ENCHANTED_KNOWLEDGE_BOOK, "Enchanted Knowledge Book");
        item(OTItems.SOUL_BLAZE_POWDER, "Soul Blaze Dust");
        item(OTItems.SOUL_BLAZE_ROD, "Soul Blaze Rod");
        item(OTItems.SOUL_FIRE_CHARGE, "Soul o' Charge");
        item(OTItems.ILLUSIONER_SPAWN_EGG, "Illusioner Spawn Egg");
        item(OTItems.IRON_GOLEM_SPAWN_EGG, "Iron Golem Spawn Egg");
        item(OTItems.SNOW_GOLEM_SPAWN_EGG, "Snow Golem Spawn Egg");
        item(OTItems.ENDER_DRAGON_SPAWN_EGG, "Ender Dragon Spawn Egg");
        item(OTItems.WITHER_SPAWN_EGG, "Wither Spawn Egg");
        item(OTItems.GIANT_SPAWN_EGG, "Giant Spawn Egg");
        item(OTItems.FIREBALL_SPAWN_EGG, "Fireball Spawn Egg");
        item(OTItems.TODAY_WIRELESS_MONITOR, "Today Wireless Monitor");
        item(OTItems.CUTE_PHONE, "Cute Phone");
        item(OTItems.FIRE_PHONE, "Fire Phone");
        item(OTItems.SPRITE, "Sprite");
        item(OTItems.AZALEA_HELM, "Azalea Helm");
        item(OTItems.SOPHRYST_ACCESSORIES_NICOLAS_HAT, "Sophryst Accessories Nicolas Hat");
        item(OTItems.SOPHRYST_ACCESSORIES_NICOLAS_BLOUSE, "Sophryst Accessories Nicolas Blouse");
        item(OTItems.SOPHRYST_ACCESSORIES_NICOLAS_SHORTS, "Sophryst Accessories Nicolas Shorts");
        item(OTItems.SOPHRYST_ACCESSORIES_NICOLAS_BOOTS, "Sophryst Accessories Nicolas Boots");
        item(OTItems.FAST_HELMET, "Fast Helmet");
        item(OTItems.FAST_CHESTPLATE, "Fast Chestplate");
        item(OTItems.FAST_LEGGINGS, "Fast Leggings");
        item(OTItems.FAST_BOOTS, "Fast Boots");
        item(OTItems.SHULKER_HELMET, "Shulker Helmet");
        item(OTItems.SHULKER_CHESTPLATE, "Shulker Chestplate");
        item(OTItems.SHULKER_LEGGINGS, "Shulker Leggings");
        item(OTItems.SHULKER_BOOTS, "Shulker Boots");
        item(OTItems.BLUP_SHIRT, "Blup Shirt");
        item(OTItems.YELLOW_KNEEPAD_PANTS, "Yellow Kneepad Pants");
        item(OTItems.MAGENTIC_CRYSTAL_HELMET, "Magentic Crystal Helmet");
        item(OTItems.MAGENTIC_CRYSTAL_CHESTPLATE, "Magentic Crystal Chestplate");
        item(OTItems.MAGENTIC_CRYSTAL_LEGGINGS, "Magentic Crystal Leggings");
        item(OTItems.MAGENTIC_CRYSTAL_BOOTS, "Magentic Crystal Boots");
        item(OTItems.EMPRESARY_2_ROBE, "Empresary 2's Robe");
        item(OTItems.GALAXY_SHIRT, "Galaxy Shirt");
        item(OTItems.LIME_SHIRT, "Green Chestplate");
        item(OTItems.STRIPED_PURPLE_PANTS, "Striped Purple Pants");
        item(OTItems.PURPLE_SHORTS, "Purple Shorts");
        item(OTItems.NUMBER_1_BLOUSE, "Number 1 Blouse");
        item(OTItems.ORANGE_SHIRT, "Orange Shirt");
        item(OTItems.ORANGE_PANTS, "Orange Pants");
        item(OTItems.STRIPED_RED_SHIRT, "Striped Red Shirt");
        item(OTItems.RUNNING_SHOES, "Running Shoes");
        item(OTItems.BIRCH_SWORD, "Birch Sword");
        item(OTItems.HONEYCOMB_SWORD, "Honeycomb Sword");
        item(OTItems.COAL_SWORD, "Coal Sword");
        item(OTItems.CHARCOAL_SWORD, "Charcoal Sword");
        item(OTItems.CAKE_SWORD, "Cake Sword");
        item(OTItems.BAMBOO_SWORD, "Bamboo Sword");
        item(OTItems.BLAZE_SWORD, "Blaze Sword");
        item(OTItems.COOKED_BEEF_SWORD, "Steak Sword");
        item(OTItems.ENDER_EYE_SWORD, "Eye of Ender Sword");
        item(OTItems.ENDER_SWORD, "Ender Sword");
        item(OTItems.EVOKER_SWORD, "Evoker Sword");
        item(OTItems.GLOWSTONE_SWORD, "Glowstone Sword");
        item(OTItems.GUNPOWDER_SWORD, "Gunpowder Sword");
        item(OTItems.FRAME_SWORD, "Frame Sword");
        item(OTItems.KELP_SWORD, "Kelp Sword");
        item(OTItems.LANTERN_SWORD, "Lantern Sword");
        item(OTItems.SOUL_LANTERN_SWORD, "Soul Lantern Sword");
        item(OTItems.LAPIS_LAZULI_SWORD, "Lapis Lazuli Sword");
        item(OTItems.NAUTILUS_SWORD, "Nautilus Shell Sword");
        item(OTItems.NETHER_STAR_SWORD, "Nether Star Sword");
        item(OTItems.NETHERITE_SCRAP_SWORD, "Netherite Scrap Sword");
        item(OTItems.PIGLIN_SWORD, "Piglin Sword");
        item(OTItems.QUARTZ_SWORD, "Nether Quartz Sword");
        item(OTItems.RAW_RABBIT_SWORD, "Raw Rabbit Sword");
        item(OTItems.REDSTONE_SWORD, "Redstone Sword");
        item(OTItems.SEA_HEART_SWORD, "Heart of the Sea Sword");
        item(OTItems.ZOMBIFIED_PIGLIN_SWORD, "Zombified Piglin Sword");
        item(OTItems.AMETHYST_SWORD, "Amethyst Sword");
        item(OTItems.ENCHANTING_SWORD, "Enchanting Sword");
        item(OTItems.END_ROD_SWORD, "End Rod Sword");
        item(OTItems.FIREWORK_SWORD, "Firework Sword");
        item(OTItems.GLASS_SWORD, "Glass Sword");
        item(OTItems.HONEY_BOTTLE_SWORD, "Honey Bottle Sword");
        item(OTItems.LEVER_SWORD, "Lever Sword");
        item(OTItems.LIGHTNING_SWORD, "Lightning Sword");
        item(OTItems.SHEARS_IRON_SWORD, "Shears Iron Sword");
        item(OTItems.STRIDER_SWORD, "Strider Sword");
        item(OTItems.TRIDENT_PICKAXE, "Trident Pickaxe");
        item(OTItems.UNDYING_SWORD, "Undying Sword");
        item(OTItems.WEAK_ENCHANTING_SWORD, "Weak Undying Sword");
        item(OTItems.WITCH_SWORD, "Witch Sword");

        add("tooltip.others.discontinuation.block.main", "This block is from %s and it's being removed from My Other Stuff.");
        add("tooltip.others.discontinuation.item.main", "This item is from %s and it's being removed from My Other Stuff.");
        add("tooltip.others.discontinuation.safety", "You should keep this in a museum, as you will never see this in Survival again.");

        add("tooltip.others.mod.variants", "%s\u00A77 (Variants)");
        add("tooltip.others.mod.f10elements", "%s\u00A77 (F10 Elements)");
        add("tooltip.others.mod.fabricio2010spack", "%s\u00A77 (Fabricio2010's Pack)");
        add("tooltip.others.mod.rimcraft", "%s\u00A77 (Rimcraft)");
        add("tooltip.others.mod.gachalife", "%s\u00A77 (Gacha Life)");
        add("tooltip.others.mod.mobtaker", "%s\u00A77 (Mob Taker)");

        add("tooltip.others.can_be_worn.azalea", "Azalea Bushes can be worn on your head slot.");
    }

    public void add(Supplier<? extends Block> blockSupplier, String name) {
        add(blockSupplier.get(), name);
    }

    public void item(Supplier<? extends Item> itemSupplier, String name) {
        add(itemSupplier.get(), name);
    }
}
