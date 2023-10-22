package com.junethewoods.myotherstuff.data.client;

import com.junethewoods.myotherstuff.MyOtherStuff;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class OTItemModelProvider extends ItemModelProvider {
    public OTItemModelProvider(DataGenerator generator, ExistingFileHelper fileHelper) {
        super(generator, MyOtherStuff.MOD_ID, fileHelper);
    }

    protected void registerModels() {
        withExistingParent("raw_inno_block");
        withExistingParent("raw_purple_block");
        withExistingParent("raw_first_block");
        withExistingParent("chiseled_blue_tiles");
        withExistingParent("deepslate_diaemerald_ore");
        withExistingParent("blue_stairs");
        withExistingParent("bright_blue_tiles");
        withExistingParent("bright_blue_tile_stairs");
        withExistingParent("bright_blue_tile_slab");
        withExistingParent("bright_blue_tile_wall", modLoc("block/bright_blue_tile_wall_inventory"));
        withExistingParent("dark_blue_tiles");
        withExistingParent("dark_blue_tile_stairs");
        withExistingParent("dark_blue_tile_slab");
        withExistingParent("dark_blue_tile_wall", modLoc("block/dark_blue_tile_wall_inventory"));
        withExistingParent("inno_tiles");
        withExistingParent("inno_tile_stairs");
        withExistingParent("inno_tile_slab");
        withExistingParent("inno_tile_wall", modLoc("block/inno_tile_wall_inventory"));
        withExistingParent("nether_tiles");
        withExistingParent("nether_tile_stairs");
        withExistingParent("nether_tile_slab");
        withExistingParent("nether_tile_wall", modLoc("block/nether_tile_wall_inventory"));
        withExistingParent("flowering_azalea");

        ModelFile generated = getExistingFile(mcLoc("item/generated"));
        ModelFile handheld = getExistingFile(mcLoc("item/handheld"));
        ModelFile handheldRod = getExistingFile(mcLoc("item/handheld_rod"));

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
        standard(generated, "glistering_pumpkin_pie");
        standard(generated, "soul_firework_rocket");
    }

    private ItemModelBuilder standard(ModelFile parent, String name) {
        return getBuilder(name).parent(parent).texture("layer0", "item/" + name);
    }

    private ItemModelBuilder withExistingParent(String name) {
        return withExistingParent(name, modLoc("block/" + name));
    }
}
