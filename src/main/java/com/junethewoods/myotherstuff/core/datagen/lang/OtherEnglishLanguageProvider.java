package com.junethewoods.myotherstuff.core.datagen.lang;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.BlockInit;
import com.junethewoods.myotherstuff.core.init.StuffInit;
import com.junethewoods.myotherstuff.core.init.WeaponryInit;
import net.minecraft.block.Block;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.Item;
import net.minecraftforge.common.data.LanguageProvider;

import java.util.function.Supplier;

public class OtherEnglishLanguageProvider extends LanguageProvider {
    public OtherEnglishLanguageProvider(DataGenerator gen) {
        super(gen, MyOtherStuff.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        addBlock(BlockInit.blue_block, "Blue Block");
        addBlock(BlockInit.blue_stairs, "Blue Stairs");
        addBlock(BlockInit.blue_wall, "Blue Wall");
        addBlock(BlockInit.blue_slab, "Blue Slab");
        addBlock(BlockInit.blue_carrots, "Blue Carrots");
        addBlock(BlockInit.screen_monitor, "Screen Monitor");
        addBlock(BlockInit.monitor, "Monitor");
        add(BlockInit.acacia_leaves, "Acacia Leaves (1)");
        add(BlockInit.azalea, "Azalea");
        add(BlockInit.granite_bricks, "Granite Bricks");
        add(BlockInit.slate_bricks, "Slate Bricks");
        add(BlockInit.fur_block, "Fur Block");
        add(BlockInit.lined_bedrock, "Lined Bedrock");
        add(BlockInit.lined_bedrock_slab, "Lined Bedrock Slab");
        add(BlockInit.beacon_laser_block, "Beacon Laser Block");
        add(BlockInit.beacon_laser_slab, "Beacon Laser Slab");
        add(BlockInit.blue_glass, "Blue Glass");
        add(BlockInit.bluewhite_glass, "Bluewhite Glass");
        add(BlockInit.end_crystal_glass, "End Crystal Glass");
        add(BlockInit.end_crystal_glass_pane, "End Crystal Glass Pane");
        add(BlockInit.bluewhite_glass_pane, "Bluewhite Glass Pane");
        add(BlockInit.blue_glass_pane, "Blue Glass Pane");
        add(BlockInit.command_block, "Command Block (1)");
        add(BlockInit.crafting_table, "Crafting Table (1)");
        add(BlockInit.smithing_table, "Smithing Table (1)");
        add(BlockInit.golden_cauldron, "Golden Cauldron");
        add(BlockInit.golden_beacon, "Golden Beacon");
        add(BlockInit.energy_cube, "Energy Cube");
        add(BlockInit.cpu, "CPU");
        add(BlockInit.autocrafter, "Autocrafter");
        add(BlockInit.lego_furnace, "LEGO Furnace");
        add(BlockInit.oak_bush_sapling, "Oak Bush Sapling");
        add(BlockInit.swamp_oak_sapling, "Swamp Oak Sapling");
        add(BlockInit.tall_birch_sapling, "Tall Birch Sapling");
        add(BlockInit.inno_flower, "Inno Flower");
        add(BlockInit.orange_flower_pot, "Orange Flower Pot");
        add(BlockInit.orange_flower_pot_1, "Lined Orange Flower Pot");
        add(BlockInit.orange_potted_inno_flower, "Potted Inno Flower (Orange Flower Pot)");
        add(BlockInit.potted_inno_flower, "Potted Inno Flower");
        add(BlockInit.potted_tall_birch_sapling, "Potted Tall Birch Sapling");
        add(BlockInit.potted_swamp_oak_sapling, "Potted Swamp Oak Sapling");
        add(BlockInit.potted_oak_bush_sapling, "Potted Oak Bush Sapling");
        add(BlockInit.potted_grass, "Potted Grass");
        add(BlockInit.diaemerald_ore, "Diaemerald Ore");
        add(BlockInit.diaemerald_block, "Block of Diaemerald");
        add(BlockInit.crystal_ore, "Crystal Ore");
        add(BlockInit.deepslate_crystal_ore, "Deepslate Crystal Ore");
        add(BlockInit.crystal_block, "Block of Crystal");
        add(BlockInit.inno_ore, "Inno Ore");
        add(BlockInit.inno_block, "Block of Inno");
        add(BlockInit.raw_inno_block, "Block of Raw Inno");
        add(BlockInit.purple_ore, "Purple Ore");
        add(BlockInit.purple_block, "Block of Purple");
        add(BlockInit.raw_purple_block, "Block of Raw Purple");
        add(BlockInit.bright_first_block, "Block of Bright First");
        add(BlockInit.dark_first_block, "Block of Dark First");
        add(BlockInit.first_block, "Block of First");
        add(BlockInit.raw_first_block, "Block of Raw First");
        add(BlockInit.phoenix_gem_block, "Block of Phoenix Gem");
        add(BlockInit.plasteel_block, "Block of Plasteel");
        add(BlockInit.inno_core_block, "Block of Inno Core");
        add(BlockInit.nether_core_block, "Block of Nether Core");

        add("container.lego_furnace", "LEGO Smelting");
        add("itemGroup.others", "MyOtherStuff");
        add("itemGroup.others.weapons", "MyOtherStuff - Revived");

        item(StuffInit.tab, "Tab");
        item(StuffInit.alan, "Alan");
        item(StuffInit.alex_0, "Steve-Like Alex");
        item(StuffInit.alex_1, "Alex");
        item(StuffInit.alice_0, "Alice");
        item(StuffInit.alice_1, "Creeper-Arms Alice");
        item(StuffInit.alice_2, "Inno Alice");
        item(StuffInit.creeper_0, "Creeper");
        item(StuffInit.finn_0, "Finn");
        item(StuffInit.innovator_0, "Innovator");
        item(StuffInit.innovator_1, "Origins Innovator");
        item(StuffInit.innovator_2, "Space Innovator");
        item(StuffInit.malena_0, "Malena");
        item(StuffInit.nicolas_0, "Magma Cube Head Nicolas");
        item(StuffInit.steve_0, "Steve");
        item(StuffInit.steve_1, "Wither Skeleton Skull Steve");
        item(StuffInit.tyler_0, "Tyler");
        item(StuffInit.villager_alan_0, "Villager (or FAKE Alan)");
        item(StuffInit.zombie_0, "Zombie");
        item(StuffInit.charged_creeper_suit, "Charged Creeper Suit");
        item(StuffInit.creeper_suit, "Creeper Suit");
        item(StuffInit.evoker_suit, "Evoker Suit");
        item(StuffInit.ghast, "Ghast");
        item(StuffInit.illusioner_suit, "Illusioner Suit");
        item(StuffInit.piglin_brute_suit, "Piglin Brute Suit");
        item(StuffInit.piglin_suit, "Piglin Suit");
        item(StuffInit.pillager_suit, "Pillager Suit");
        item(StuffInit.vindicator_suit, "Vindicator Suit");
        item(StuffInit.zombified_piglin_suit, "Zombified Piglin Suit");
        item(StuffInit.ultra_ball, "Ultra Ball");
        item(StuffInit.master_ball, "Master Ball");
        item(StuffInit.mini_cloud, "Mini Cloud");
        item(StuffInit.green_bag, "Green Bag");
        item(StuffInit.cup, "Cup");
        item(StuffInit.cup_water, "Water Cup");
        item(StuffInit.cup_milk, "Milk Cup");
        item(StuffInit.sem_titulo, "Without Title");
        item(StuffInit.milk_1, "Milk (1)");
        item(StuffInit.milk_cup, "Milk Cup");
        item(StuffInit.green_tea, "Green Tea");
        item(StuffInit.mini_lipstick, "Mini Lipstick");
        item(StuffInit.dark_base, "Dark Base");
        item(StuffInit.glass_casing, "Glass Casing");
        item(StuffInit.red_lipstick, "Red Lipstick");
        item(StuffInit.golden_water_bucket, "Golden Water Bucket");
        item(StuffInit.magma_bucket, "Magma Bucket");
        item(StuffInit.mirror, "Mirror");
        item(StuffInit.heroes_emerald, "Heroes Emerald");
        item(StuffInit.slow_fall_feathers, "Slow Fall Feathers");
        item(StuffInit.levitation, "Levitating Cloud");
        item(StuffInit.mining_fatigue, "Mining Spoon");
        item(StuffInit.fa_skin, "Fa Skin");
        item(StuffInit.base_angel_ring, "Base Angel Ring");
        item(StuffInit.bat_angel_ring, "Bat Angel Ring");
        item(StuffInit.bee_angel_ring, "Bee Angel Ring");
        item(StuffInit.elytra_angel_ring, "Elytra Angel Ring");
        item(StuffInit.vex_angel_ring, "Vex Angel Ring");
        item(StuffInit.bell, "Bell");
        item(StuffInit.blaze_rods, "Blaze Rods");
        item(StuffInit.dragon_fireball, "Dragon Fireball");
        item(StuffInit.end_rod, "End Rod");
        add("item.others.banner_1", "Banner (1)");
        item(StuffInit.armor_stand, "Armor Stand");
        item(StuffInit.abu_tunes, "Abu Tunes");
        item(StuffInit.music_disc_rubedo, "Music Disc");
        add(StuffInit.music_disc_rubedo.get().getDescriptionId() + ".desc", "Lena Raine - Rubedo");
        item(StuffInit.music_disc_chrysopoeia, "Music Disc");
        add(StuffInit.music_disc_chrysopoeia.get().getDescriptionId() + ".desc", "Lena Raine - Chrysopoeia");
        item(StuffInit.music_disc_so_below, "Music Disc");
        add(StuffInit.music_disc_so_below.get().getDescriptionId() + ".desc", "Lena Raine - So Below");
        item(StuffInit.music_disc_creative, "Music Disc");
        add(StuffInit.music_disc_creative.get().getDescriptionId() + ".desc", "C418 - Creative Tracks");
        item(StuffInit.music_disc_end_high, "Music Disc");
        add(StuffInit.music_disc_end_high.get().getDescriptionId() + ".desc", "C418 - Outer End");
        item(StuffInit.music_disc_underwater, "Music Disc");
        add(StuffInit.music_disc_underwater.get().getDescriptionId() + ".desc", "C418 - Underwater Tracks");
        item(StuffInit.music_disc_blockades, "Music Disc");
        add(StuffInit.music_disc_blockades.get().getDescriptionId() + ".desc", "Muse - Blockades");
        item(StuffInit.music_disc_first_date, "Music Disc");
        add(StuffInit.music_disc_first_date.get().getDescriptionId() + ".desc", "Frad - First Date");
        item(StuffInit.music_disc_omae_wa_mu, "Music Disc");
        add(StuffInit.music_disc_omae_wa_mu.get().getDescriptionId() + ".desc", "Omae wa Mu");
        item(StuffInit.music_disc_sfos, "Music Disc");
        add(StuffInit.music_disc_sfos.get().getDescriptionId() + ".desc", "Coldplay - A Sky Full of Stars");
        item(StuffInit.music_disc_traces, "Music Disc");
        add(StuffInit.music_disc_traces.get().getDescriptionId() + ".desc", "Alistair Lindsay - Traces");
        item(StuffInit.antique_diamond_powder, "Antique Diamond Powder");
        item(StuffInit.antique_emerald_powder, "Antique Emerald Powder");
        item(StuffInit.antique_gold_powder, "Antique Gold Powder");
        item(StuffInit.antique_iron_powder, "Antique Iron Powder");
        item(StuffInit.antique_redstone_powder, "Antique Redstone Powder");
        item(StuffInit.diamond_powder, "Diamond Powder");
        item(StuffInit.emerald_powder, "Emerald Powder");
        item(StuffInit.quartz_powder, "Quartz Powder");
        item(StuffInit.coal_powder, "Coal Powder");
        item(StuffInit.redstone_powder, "Redstone Powder");
        item(StuffInit.gold_powder, "Gold Powder");
        item(StuffInit.iron_powder, "Iron Powder");
        item(StuffInit.lapis_lazuli_powder, "Lapis Lazuli Powder");
        item(StuffInit.netherite_powder, "Netherite Powder");
        item(StuffInit.netherite_scrap_powder, "Netherite Scrap Powder");
        item(StuffInit.pink_lemonade, "Pink Lemonade");
        item(StuffInit.enchanting_table_book, "Enchantment Table's Book");
        item(StuffInit.phoenix_wand, "Phoenix Wand");
        item(StuffInit.phoenix_gem, "Phoenix Gem");
        item(StuffInit.bat_wing, "Bat Wings");
        item(StuffInit.bee_wing, "Bee Wings");
        item(StuffInit.dragon_wing, "Ender Dragon Wings");
        item(StuffInit.red_parrot_wing, "Red Parrot Wings");
        item(StuffInit.vex_wing, "Vex Wings");
        item(StuffInit.badminton_set, "Badminton Set");
        item(StuffInit.sprinkled_donut, "Sprinkled Donut");
        item(StuffInit.sugar_cookie, "Sugar Cookie");
        item(StuffInit.g_cookie, "Cookie");
        item(StuffInit.diaemerald_pickaxe, "Diaemerald Pickaxe");
        item(StuffInit.haste_pickaxe, "Haste Pickaxe");
        item(StuffInit.lego_hammer, "LEGO Hammer");
        item(StuffInit.hammer, "FTF Hammer");
        item(StuffInit.farmer_hoe, "Farmer Fabricio2010's Hoe");
        item(StuffInit.blaze_shears, "Blaze Shears");
        item(StuffInit.bamboo_fishing_rod, "Bamboo Fishing Rod");
        item(StuffInit.warped_fungus_on_a_bamboo, "Warped Fungus on a Bamboo");
        item(StuffInit.carrot_on_a_bamboo, "Carrot on a Bamboo");
        item(StuffInit.blaze_elytra, "Blaze Elytra");
        item(StuffInit.fast_elytra, "Fast Elytra");
        item(StuffInit.blaze_and_gold, "Blaze and Gold");
        item(StuffInit.bamboo_bow, "Bamboo Bow");
        item(StuffInit.bamboo_crossbow, "Bamboo Crossbow");
        item(StuffInit.blaze_bow, "Blaze Bow");
        item(StuffInit.blaze_crossbow, "Blaze Crossbow");
        item(StuffInit.diamond_crossbow, "Diamond Crossbow");
        item(StuffInit.ender_crossbow, "Ender Crossbow");
        item(StuffInit.minecart_with_spawner, "Minecart with Spawner");
        item(StuffInit.heart_yo_yo, "Heart Yo-yo");
        item(StuffInit.multilaser_speakers, "Multilaser Speakers");
        item(StuffInit.green_apple, "Green Apple");
        item(StuffInit.cupcake, "Cupcake");
        item(StuffInit.blue_carrot, "Blue Carrot");
        item(StuffInit.blaze_arrow, "Blaze Arrow");
        item(StuffInit.bamboo_arrow, "Bamboo Arrow");
        item(StuffInit.circuit_piece_speaker, "Circuit Piece (Speaker)");
        item(StuffInit.melon_cape, "Melonniers Cape");
        item(StuffInit.tulip, "Tulip");
        item(StuffInit.lego_pieces, "LEGO Pieces");
        item(StuffInit.blue_leather, "Blue Leather");
        item(StuffInit.galaxy_cloth, "Galaxy Cloth");
        item(StuffInit.reinforced_cloth, "Reinforced Cloth");
        item(StuffInit.inno_dye, "Inno Dye");
        item(StuffInit.emerald_sword, "Emerald Sword");
        item(StuffInit.rainbow_sword, "Rainbow Sword");
        item(StuffInit.strength_sword, "Strength Iron Sword");
        item(StuffInit.weak_sword, "Weakened Iron Sword");
        item(StuffInit.inno_sword, "Inno Sword");
        item(StuffInit.inno_sword_2, "Inno Sword");
        item(StuffInit.nether_sword, "Nether Sword");
        item(StuffInit.alan_ai_sword, "Alan's AI Sword");
        item(StuffInit.alice_ai_sword, "Alice's AI Sword");
        item(StuffInit.innovator_ai_sword, "Innovator's AI Sword");
        item(StuffInit.nicolas_ai_sword, "Nicolas AI Sword");
        item(StuffInit.anchor_sword, "Anchor Sword");
        item(StuffInit.anchor_pickaxe, "Anchor Pickaxe");
        item(StuffInit.anchor_shovel, "Anchor Shovel");
        item(StuffInit.anchor_axe, "Anchor Axe");
        item(StuffInit.anchor_hoe, "Anchor Hoe");
        item(StuffInit.anchor_helmet, "Anchor Helmet");
        item(StuffInit.anchor_chestplate, "Anchor Chestplate");
        item(StuffInit.anchor_leggings, "Anchor Leggings");
        item(StuffInit.anchor_boots, "Anchor Boots");
        item(StuffInit.crystal, "Crystal");
        item(StuffInit.crystal_nugget, "Crystal Nugget");
        item(StuffInit.diaemerald, "Diaemerald");
        item(StuffInit.diaemerald_nugget, "Diaemerald Nugget");
        item(StuffInit.bright_first_ingot, "Bright First Ingot");
        item(StuffInit.bright_first_nugget, "Bright First Nugget");
        item(StuffInit.dark_first_ingot, "Dark First Ingot");
        item(StuffInit.dark_first_nugget, "Dark First Nugget");
        item(StuffInit.first_ingot, "First Ingot");
        item(StuffInit.first_nugget, "First Nugget");
        item(StuffInit.purple_ingot, "Nether Ingot");
        item(StuffInit.purple_nugget, "Nether Nugget");
        item(StuffInit.inno_ingot, "Inno Ingot");
        item(StuffInit.inno_nugget, "Inno Nugget");
        item(StuffInit.raw_first, "Raw First");
        item(StuffInit.raw_purple, "Raw Nether");
        item(StuffInit.raw_inno, "Raw Inno");
        item(StuffInit.light_magenta_ingot, "Light Magenta Iron Ingot");
        item(StuffInit.light_magenta_nugget, "Light Magenta Iron Nugget");
        item(StuffInit.inno_core, "Inno Core");
        item(StuffInit.nether_core, "Nether Core");
        item(StuffInit.ruby, "Ruby");
        item(StuffInit.knowledge_enchanted_book, "Enchanted Knowledge Book");
        item(StuffInit.soul_blaze_powder, "Soul Blaze Powder");
        item(StuffInit.soul_blaze_rod, "Soul Blaze Rod");
        item(StuffInit.soul_fire_charge, "Soul o' Charge");
        item(StuffInit.illusioner_spawn_egg, "Illusioner Spawn Egg");
        item(StuffInit.iron_golem_spawn_egg, "Iron Golem Spawn Egg");
        item(StuffInit.snow_golem_spawn_egg, "Snow Golem Spawn Egg");
        item(StuffInit.ender_dragon_spawn_egg, "Ender Dragon Spawn Egg");
        item(StuffInit.wither_spawn_egg, "Wither Spawn Egg");
        item(StuffInit.giant_spawn_egg, "Giant Spawn Egg");
        item(StuffInit.fireball_spawn_egg, "Fireball Spawn Egg");
        item(StuffInit.today_wireless_monitor, "Today Wireless Monitor");
        item(StuffInit.cute_phone, "Cute Phone");
        item(StuffInit.fire_phone, "Fire Phone");
        item(StuffInit.sprite, "Sprite");
        item(StuffInit.azalea_helm, "Azalea Helm");
        item(StuffInit.soph_h, "Sophryst Accessories Nicolas Hat");
        item(StuffInit.soph_c, "Sophryst Accessories Nicolas Blouse");
        item(StuffInit.soph_l, "Sophryst Accessories Nicolas Shorts");
        item(StuffInit.soph_b, "Sophryst Accessories Nicolas Boots");
        item(StuffInit.fast_helm, "Fast Helmet");
        item(StuffInit.fast_chest, "Fast Chestplate");
        item(StuffInit.fast_legs, "Fast Leggings");
        item(StuffInit.fast_boots, "Fast Boots");
        item(StuffInit.shulk_h, "Shulker Helmet");
        item(StuffInit.shulk_c, "Shulker Chestplate");
        item(StuffInit.shulk_l, "Shulker Leggings");
        item(StuffInit.shulk_b, "Shulker Boots");
        item(StuffInit.blup_chestplate, "Blup Chestplate");
        item(StuffInit.b, "B Leggings");
        item(StuffInit.crystal_chestplate, "Crystal Chestplate");
        item(StuffInit.empresary_robe, "Empresary2's Robe");
        item(StuffInit.galaxy_chestplate, "Galaxy Chestplate");
        item(StuffInit.green_chestplate, "Green Chestplate");
        item(StuffInit.leather_leggings, "Leather Pants");
        item(StuffInit.magenta_short, "Magenta Shorts");
        item(StuffInit.number_1, "Number 1 Blouse");
        item(StuffInit.orange_chestplate, "Orange Chestplate");
        item(StuffInit.orange_leggings, "Orange Leggings");
        item(StuffInit.robe_with_pales, "Paled Robe");
        item(StuffInit.speed_boots, "Speed Boots");
        item(StuffInit.birch_sword, "Birch Sword");
        item(StuffInit.honeycomb_sword, "Honeycomb Sword");
        item(WeaponryInit.AMETHYST_SWORD, "Amethyst Sword");
        item(WeaponryInit.ENCHANTING_SWORD, "Enchanting Sword");
        item(WeaponryInit.END_ROD_SWORD, "End Rod Sword");
        item(WeaponryInit.FIREWORK_SWORD, "Firework Sword");
        item(WeaponryInit.GLASS_SWORD, "Glass Sword");
        item(WeaponryInit.HONEY_BOTTLE_SWORD, "Honey Bottle Sword");
        item(WeaponryInit.LEVER_SWORD, "Lever Sword");
        item(WeaponryInit.LIGHTNING_SWORD, "Lightning Sword");
        item(WeaponryInit.SHEARS_IRON_SWORD, "Shears Iron Sword");
        item(WeaponryInit.STRIDER_SWORD, "Strider Sword");
        item(WeaponryInit.TRIDENT_PICKAXE, "Trident Pickaxe");
        item(WeaponryInit.UNDYING_SWORD, "Undying Sword");
        item(WeaponryInit.WEAK_ENCHANTING_SWORD, "Weak Undying Sword");
        item(WeaponryInit.WITCH_SWORD, "Witch Sword");
    }

    public void add(Supplier<? extends Block> blockSupplier, String name) {
        add(blockSupplier.get(), name);
    }

    public void item(Supplier<? extends Item> itemSupplier, String name) {
        add(itemSupplier.get(), name);
    }
}