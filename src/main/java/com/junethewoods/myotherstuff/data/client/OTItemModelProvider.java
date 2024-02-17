package com.junethewoods.myotherstuff.data.client;

import com.junethewoods.myotherstuff.MyOtherStuff;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nonnull;

public class OTItemModelProvider extends ItemModelProvider {
    public OTItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, MyOtherStuff.MOD_ID, fileHelper);
    }

    @Nonnull
    @Override
    public String getName() {
        return "My Other Stuff - Item Models";
    }

    protected void registerModels() {
        // Pre-Transition Models
        blockItem("raw_inno_block");
        blockItem("raw_purple_block");
        blockItem("raw_first_block");
        blockItem("chiseled_blue_tiles");
        blockItem("deepslate_diaemerald_ore");
        blockItem("blue_stairs");
        blockItem("bright_blue_tiles");
        blockItem("bright_blue_tile_stairs");
        blockItem("bright_blue_tile_slab");
        withExistingParent("bright_blue_tile_wall", modLoc("block/bright_blue_tile_wall_inventory"));
        blockItem("dark_blue_tiles");
        blockItem("dark_blue_tile_stairs");
        blockItem("dark_blue_tile_slab");
        withExistingParent("dark_blue_tile_wall", modLoc("block/dark_blue_tile_wall_inventory"));
        blockItem("inno_tiles");
        blockItem("inno_tile_stairs");
        blockItem("inno_tile_slab");
        withExistingParent("inno_tile_wall", modLoc("block/inno_tile_wall_inventory"));
        blockItem("nether_tiles");
        blockItem("nether_tile_stairs");
        blockItem("nether_tile_slab");
        withExistingParent("nether_tile_wall", modLoc("block/nether_tile_wall_inventory"));
        blockItem("flowering_azalea");
        blockItem("rooted_dirt");
        blockItem("moss_block");
        blockItem("moss_carpet");
        blockItem("azalea_leaves");
        blockItem("flowering_azalea_leaves");

        ModelFile generated = getExistingFile(mcLoc("item/generated"));
        ModelFile handheld = getExistingFile(mcLoc("item/handheld"));
        ModelFile handheldRod = getExistingFile(mcLoc("item/handheld_rod"));
        ModelFile templateBow = getExistingFile(modLoc("item/template_bow"));

        // Transition Models
        // Blocks
        standard(generated, "banner_1");
        standard(generated, "end_rod");
        standard(generated, "orange_flower_pot");
        standard(generated, "orange_flower_pot_1");
        standard(generated, "golden_cauldron");
        getBuilder("oak_bush_sapling").parent(generated).texture("layer0", "block/jungle_bush_sapling");
        getBuilder("swamp_oak_sapling").parent(generated).texture("layer0", "block/swamp_oak_sapling");
        getBuilder("tall_birch_sapling").parent(generated).texture("layer0", "block/tall_birch_sapling");
        getBuilder("inno_flower").parent(generated).texture("layer0", "block/inno_flower");
        getBuilder("blue_glass_pane").parent(generated).texture("layer0", "block/blue_glass");
        getBuilder("bluewhite_glass_pane").parent(generated).texture("layer0", "block/bluewhite_glass");
        getBuilder("end_crystal_glass_pane").parent(generated).texture("layer0", "block/end_crystal_glass");
        blockItem("blue_block");
        blockItem("blue_slab");
        withExistingParent("blue_wall", modLoc("block/blue_tile_wall_inventory"));
        blockItem("fur_block");
        blockItem("beacon_laser_block");
        blockItem("beacon_laser_slab");
        blockItem("lined_bedrock");
        blockItem("lined_bedrock_slab");
        blockItem("blue_glass");
        blockItem("bluewhite_glass");
        blockItem("end_crystal_glass");
        blockItem("command_block_1");
        blockItem("energy_cube");
        blockItem("acacia_leaves_1");
        blockItem("granite_bricks");
        blockItem("slate_bricks");
        blockItem("diaemerald_ore");
        blockItem("diaemerald_block");
        blockItem("crystal_ore");
        blockItem("deepslate_crystal_ore");
        blockItem("crystal_block");
        blockItem("inno_ore");
        blockItem("inno_block");
        blockItem("purple_ore");
        blockItem("purple_block");
        blockItem("bright_first_block");
        blockItem("dark_first_block");
        blockItem("first_block");
        blockItem("phoenix_gem_block");
        blockItem("plasteel_block");
        blockItem("inno_core_block");
        blockItem("nether_core_block");
        blockItem("azalea");
        blockItem("cpu");
        blockItem("monitor");
        blockItem("screen_monitor");
        blockItem("crafting_table_1");
        blockItem("smithing_table_1");
        blockItem("autocrafter");
        blockItem("lego_furnace");
        blockItem("golden_beacon");

        // Materials
        standard(generated, "raw_first");
        standard(generated, "bright_first_ingot");
        standard(generated, "bright_first_nugget");
        standard(generated, "first_ingot");
        standard(generated, "first_nugget");
        standard(generated, "dark_first_ingot");
        standard(generated, "dark_first_nugget");
        standard(generated, "raw_inno");
        standard(generated, "inno_ingot");
        standard(generated, "inno_nugget");
        standard(generated, "raw_purple");
        standard(generated, "purple_ingot");
        standard(generated, "purple_nugget");
        standard(generated, "light_magenta_ingot");
        standard(generated, "light_magenta_nugget");
        standard(generated, "crystal");
        standard(generated, "crystal_nugget");
        standard(generated, "diaemerald");
        standard(generated, "diaemerald_nugget");
        standard(generated, "ruby");
        standard(generated, "phoenix_gem");
        standard(generated, "inno_core");
        standard(generated, "nether_core");

        // Dusts
        standard(generated, "coal_powder");
        standard(generated, "diamond_powder");
        standard(generated, "antique_diamond_powder");
        standard(generated, "emerald_powder");
        standard(generated, "antique_emerald_powder");
        standard(generated, "gold_powder");
        standard(generated, "antique_gold_powder");
        standard(generated, "iron_powder");
        standard(generated, "antique_iron_powder");
        standard(generated, "lapis_lazuli_powder");
        standard(generated, "netherite_powder");
        standard(generated, "netherite_scrap_powder");
        standard(generated, "quartz_powder");
        standard(generated, "redstone_powder");
        standard(generated, "antique_redstone_powder");

        // Gacha Life
        standard(generated, "galaxy_cloth");
        standard(generated, "green_tea");
        standard(generated, "abu_tunes");
        standard(generated, "pink_lemonade");
        standard(handheld, "badminton_set");
        standard(generated, "sugar_cookie");
        standard(generated, "g_cookie");
        standard(generated, "sprinkled_donut");
        standard(generated, "heart_yo_yo");
        standard(generated, "green_apple");
        standard(generated, "cupcake");
        standard(generated, "tulip");
        standard(generated, "cute_phone");
        standard(generated, "fire_phone");

        // Variants
        standard(generated, "enchanting_table_book");
        standard(generated, "minecart_with_spawner");
        standard(generated, "knowledge_enchanted_book");
        standard(handheld, "soul_blaze_rod");
        standard(generated, "soul_blaze_powder");
        standard(generated, "soul_fire_charge");

        // Fabricio2010 Elements / Fabricio2010's Pack
        standard(generated, "inno_dye");
        standard(generated, "blue_leather");
        standard(generated, "blue_carrot");
        standard(handheld, "farmer_hoe");

        // Miscellaneous
        standard(generated, "reinforced_cloth");
        standard(generated, "lego_pieces");
        standard(generated, "slow_fall_feathers");
        standard(generated, "heroes_emerald");
        standard(generated, "mirror");
        standard(generated, "levitation");
        standard(generated, "armor_stand");
        standard(generated, "bell");
        standard(generated, "blaze_rods");
        standard(generated, "dragon_fireball");
        standard(generated, "ultra_ball");
        standard(generated, "master_ball");
        standard(generated, "green_bag");
        standard(generated, "mini_cloud");
        standard(generated, "glass_casing");
        standard(generated, "dark_base");
        standard(generated, "red_lipstick");
        standard(generated, "mini_lipstick");
        standard(generated, "golden_water_bucket");
        standard(generated, "magma_bucket");
        standard(generated, "milk_cup");
        standard(generated, "cup");
        standard(generated, "cup_water");
        standard(generated, "cup_milk");
        standard(generated, "sem_titulo");
        standard(generated, "milk_1");
        standard(generated, "multilaser_speakers");
        standard(generated, "circuit_piece_speaker");
        standard(generated, "today_wireless_monitor");
        standard(generated, "base_angel_ring");
        standard(generated, "bat_angel_ring");
        standard(generated, "bee_angel_ring");
        standard(generated, "vex_angel_ring");
        standard(generated, "elytra_angel_ring");
        standard(generated, "fa_skin");
        standard(generated, "sprite");
        standard(generated, "tab");
        standard(generated, "bamboo_arrow");
        standard(generated, "blaze_arrow");
        standard(generated, "blaze_and_gold");
        standard(generated, "blaze_shears");
        standard(handheldRod, "bamboo_fishing_rod_cast");
        standard(handheldRod, "carrot_on_a_bamboo");
        standard(handheldRod, "warped_fungus_on_a_bamboo");
        standard(generated, "melon_cape");
        standard(generated, "bat_wing");
        standard(generated, "bee_wing");
        standard(generated, "dragon_wing");
        standard(generated, "red_parrot_wing");
        standard(generated, "vex_wing");
        standard(generated, "broken_blaze_elytra");
        standard(generated, "fast_elytra");

        // Minifigures
        standard(generated, "alan");
        standard(generated, "alice_0");
        standard(generated, "alice_1");
        standard(generated, "alice_2");
        standard(generated, "innovator_0");
        standard(generated, "innovator_1");
        standard(generated, "innovator_2");
        standard(generated, "tyler_0");
        standard(generated, "malena_0");
        standard(generated, "nicolas_0");
        standard(generated, "alex_0");
        standard(generated, "alex_1");
        standard(generated, "steve_0");
        standard(generated, "steve_1");
        standard(generated, "mini_beekeeper");
        standard(generated, "mini_baker");
        standard(generated, "mini_diver");
        standard(generated, "mini_miner");
        standard(generated, "zombie_0");
        standard(generated, "creeper_0");
        standard(generated, "villager_alan_0");
        standard(generated, "finn_0");
        standard(generated, "ghast");

        // Suits
        standard(generated, "pillager_suit");
        standard(generated, "vindicator_suit");
        standard(generated, "evoker_suit");
        standard(generated, "illusioner_suit");
        standard(generated, "piglin_suit");
        standard(generated, "piglin_brute_suit");
        standard(generated, "zombified_piglin_suit");
        standard(generated, "creeper_suit");
        standard(generated, "charged_creeper_suit");

        // Music Discs
        standard(generated, "music_disc_first_date");
        standard(generated, "music_disc_omae_wa_mu");
        standard(generated, "music_disc_traces");
        standard(generated, "music_disc_sfos");
        standard(generated, "music_disc_blockades");
        standard(generated, "music_disc_underwater");
        standard(generated, "music_disc_creative");
        standard(generated, "music_disc_end_high");
        standard(generated, "music_disc_rubedo");
        standard(generated, "music_disc_chrysopoeia");
        standard(generated, "music_disc_so_below");
        standard(generated, "music_disc_otherside");
        standard(generated, "music_disc_relic");

        // Tools & Weapons
        standard(handheld, "coal_sword");
        standard(handheld, "charcoal_sword");
        standard(handheld, "emerald_sword");
        standard(handheld, "lapis_lazuli_sword");
        standard(handheld, "quartz_sword");
        standard(handheld, "netherite_scrap_sword");
        standard(handheld, "redstone_sword");
        standard(handheld, "glowstone_sword");
        standard(handheld, "gunpowder_sword");
        standard(handheld, "nether_star_sword");
        standard(handheld, "sea_heart_sword");
        standard(handheld, "nautilus_sword");
        standard(handheld, "inno_sword");
        standard(handheld, "inno_sword_2");
        standard(handheld, "nether_sword");
        standard(handheld, "birch_sword");
        standard(handheld, "ender_sword");
        standard(handheld, "ender_eye_sword");
        standard(handheld, "evoker_sword");
        standard(handheld, "piglin_sword");
        standard(handheld, "zombified_piglin_sword");
        standard(handheld, "bamboo_sword");
        standard(handheld, "blaze_sword");
        standard(handheld, "lantern_sword");
        standard(handheld, "kelp_sword");
        standard(handheld, "cake_sword");
        standard(handheld, "raw_rabbit_sword");
        standard(handheld, "cooked_beef_sword");
        standard(handheld, "honeycomb_sword");
        standard(handheld, "item_frame_sword");
        standard(handheld, "strength_sword");
        standard(handheld, "weak_sword");
        standard(handheld, "alan_ai_sword");
        standard(handheld, "alice_ai_sword");
        standard(handheld, "innovator_ai_sword");
        standard(handheld, "nicolas_ai_sword");
        standard(handheld, "rainbow_sword");
        standard(handheld, "haste_pickaxe");
        standard(handheld, "lego_hammer");
        standard(handheld, "hammer");
        standard(handheld, "phoenix_wand");
        standard(handheld, "mining_fatigue");

        toolSet(handheld, "anchor");
        toolSet(handheld, "magentic_crystal");
        toolSet(handheld, "diaemerald");

        bow("blaze_bow");
        bow("bamboo_bow");
        crossbow("blaze_crossbow");
        crossbow("bamboo_crossbow");
        crossbow("diamond_crossbow");
        crossbow("ender_crossbow");

        // Armors
        armorSet(generated, "anchor", false);
        armorSet(generated, "shulker", false);
        armorSet(generated, "sophryst", false); // Sophryst Nicolas Armor
        armorSet(generated, "baby_demon", false);
        armorSet(generated, "finn", false);
        armorSet(generated, "mario", false);
        armorSet(generated, "gacha", true);
        armorSet(generated, "pajama", true);
        armorSet(generated, "spring", true);
        armorSet(generated, "empresary", true);
        armorSet(generated, "farmer", true);
        armorSet(generated, "corona", false);
        armorSet(generated, "first", true);
        armorSet(generated, "nether", false);
        armorSet(generated, "inno", false);
        armorSet(generated, "empresary2", true);
        standard(generated, "magentic_crystal_helmet");
        standard(generated, "crystal_chestplate");
        standard(generated, "magentic_crystal_leggings");
        standard(generated, "magentic_crystal_boots");
        standard(generated, "fast_helm");
        standard(generated, "fast_chest");
        standard(generated, "fast_legs");
        standard(generated, "fast_boots");
        standard(generated, "han_chestplate");
        standard(generated, "han_leggings");
        standard(generated, "han_boots");
        standard(generated, "ian_chestplate");
        standard(generated, "pony_thing"); // It's a tiara, 2021 Fabrício.
        standard(generated, "pony_chestplate");
        standard(generated, "pony_leggings");
        standard(generated, "pony_boots");
        standard(generated, "azalea_helm");
        standard(generated, "blup_chestplate");
        standard(generated, "empresary_robe");
        standard(generated, "galaxy_chestplate");
        standard(generated, "number_1");
        standard(generated, "robe_with_pales");
        standard(generated, "green_chestplate");
        standard(generated, "orange_chestplate");
        standard(generated, "orange_leggings");
        standard(generated, "b");
        standard(generated, "leather_leggings_1");
        standard(generated, "magenta_short");
        standard(generated, "speed_boots");
        standard(generated, "headset");
        standard(generated, "bard_hat");
        standard(generated, "bard_sweatchest");
        standard(generated, "bard_pants");
        standard(generated, "bard_boots");

        // Pre-Transition Models
        standard(generated, "magentic_crystal_helmet");
        standard(generated, "magentic_crystal_leggings");
        standard(generated, "magentic_crystal_boots");
        standard(handheld, "magentic_crystal_sword");
        standard(handheld, "magentic_crystal_pickaxe");
        standard(handheld, "magentic_crystal_shovel");
        standard(handheld, "magentic_crystal_axe");
        standard(handheld, "magentic_crystal_hoe");
        standard(handheld, "diaemerald_sword");
        standard(handheld, "diaemerald_shovel");
        standard(handheld, "diaemerald_axe");
        standard(handheld, "diaemerald_hoe");
        standard(handheld, "soul_lantern_sword");
        standard(handheld, "amethyst_sword");
        standard(handheld, "enchanting_sword");
        standard(handheld, "end_rod_sword");
        standard(handheld, "firework_sword");
        standard(handheld, "glass_sword");
        standard(handheld, "honey_bottle_sword");
        standard(handheld, "lever_sword");
        standard(handheld, "lightning_sword");
        standard(handheld, "shears_iron_sword");
        standard(handheld, "strider_sword");
        standard(handheld, "trident_pickaxe");
        standard(handheld, "undying_sword");
        standard(handheld, "weak_enchanting_sword");
        standard(handheld, "witch_sword");
        standard(handheldRod, "wooden_fishing_sword");
        standard(generated, "copper_dust");

        getBuilder("hanging_roots").parent(generated).texture("layer0", "block/hanging_roots");
        getBuilder("ender_dragon_spawn_egg").parent(getExistingFile(mcLoc("item/template_spawn_egg")));
        getBuilder("wither_spawn_egg").parent(getExistingFile(mcLoc("item/template_spawn_egg")));
        getBuilder("giant_spawn_egg").parent(getExistingFile(mcLoc("item/template_spawn_egg")));
        getBuilder("illusioner_spawn_egg").parent(getExistingFile(mcLoc("item/template_spawn_egg")));
        getBuilder("iron_golem_spawn_egg").parent(getExistingFile(mcLoc("item/template_spawn_egg")));
        getBuilder("snow_golem_spawn_egg").parent(getExistingFile(mcLoc("item/template_spawn_egg")));
        getBuilder("fireball_spawn_egg").parent(getExistingFile(mcLoc("item/template_spawn_egg")));
        getBuilder("bamboo_fishing_rod").parent(handheldRod).texture("layer0", modLoc("item/bamboo_fishing_rod")).override().predicate(new ResourceLocation("cast"), 1)
                .model(getExistingFile(modLoc("item/bamboo_fishing_rod_cast"))).end();
        getBuilder("blaze_elytra").parent(generated).texture("layer0", modLoc("item/blaze_elytra")).override().predicate(new ResourceLocation("broken"), 1)
                .model(getExistingFile(modLoc("item/broken_blaze_elytra"))).end();
    }

    private void standard(ModelFile parent, String name) {
        getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }

    private void blockItem(String name) {
        withExistingParent(name, modLoc("block/" + name));
    }

    private void toolSet(ModelFile parent, String name) {
        getBuilder(name + "_sword").parent(parent).texture("layer0", "item/" + name + "_sword");
        getBuilder(name + "_pickaxe").parent(parent).texture("layer0", "item/" + name + "_pickaxe");
        getBuilder(name + "_shovel").parent(parent).texture("layer0", "item/" + name + "_shovel");
        getBuilder(name + "_axe").parent(parent).texture("layer0", "item/" + name + "_axe");
        getBuilder(name + "_hoe").parent(parent).texture("layer0", "item/" + name + "_hoe");
    }

    private void armorSet(ModelFile parent, String name, boolean sweatchest) {
        getBuilder(name + "_helmet").parent(parent).texture("layer0", "item/" + name + "_helmet");
        if (sweatchest) {
            getBuilder(name + "_sweatchest").parent(parent).texture("layer0", "item/" + name + "_sweatchest");
        } else {
            getBuilder(name + "_chestplate").parent(parent).texture("layer0", "item/" + name + "_chestplate");
        }
        getBuilder(name + "_leggings").parent(parent).texture("layer0", "item/" + name + "_leggings");
        getBuilder(name + "_boots").parent(parent).texture("layer0", "item/" + name + "_boots");
    }

    private void bow(String name) {
        ModelFile templateBow = getExistingFile(modLoc("item/template_bow"));

        // Pulling States
        standard(templateBow, name + "_pulling_0");
        standard(templateBow, name + "_pulling_1");
        standard(templateBow, name + "_pulling_2");

        // Main Bow
        getBuilder(name).parent(templateBow).texture("layer0", modLoc("item/" + name)).override().predicate(new ResourceLocation("pulling"), 1)
                .model(getExistingFile(modLoc("item/" + name + "_pulling_0"))).end().override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 0.65f)
                .model(getExistingFile(modLoc("item/" + name + "_pulling_1"))).end().override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 0.9f)
                .model(getExistingFile(modLoc("item/" + name + "_pulling_2"))).end();
    }

    private void crossbow(String name) {
        ModelFile templateCrossbow = getExistingFile(modLoc("item/template_crossbow"));

        // Pulling States
        standard(templateCrossbow, name + "_pulling_0"); // pulling=1
        standard(templateCrossbow, name + "_pulling_1"); // pulling=1, pull=0.58
        standard(templateCrossbow, name + "_pulling_2"); // pulling=1, pull=1
        standard(templateCrossbow, name + "_arrow"); // charged=1
        standard(templateCrossbow, name + "_firework"); // charged=1, firework=1

        getBuilder(name).parent(templateCrossbow).texture("layer0", modLoc("item/" + name + "_standby"))
                .override().predicate(new ResourceLocation("pulling"), 1).model(getExistingFile(modLoc("item/" + name + "_pulling_0"))).end()
                .override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 0.58f).model(getExistingFile(modLoc("item/" + name + "_pulling_1"))).end()
                .override().predicate(new ResourceLocation("pulling"), 1).predicate(new ResourceLocation("pull"), 1).model(getExistingFile(modLoc("item/" + name + "_pulling_2"))).end()
                .override().predicate(new ResourceLocation("charged"), 1).model(getExistingFile(modLoc("item/" + name + "_arrow"))).end()
                .override().predicate(new ResourceLocation("charged"), 1).predicate(new ResourceLocation("firework"), 1).model(getExistingFile(modLoc("item/" + name + "_firework"))).end();
    }
}
