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
        withExistingParent("blue_stairs");

        ModelFile generated = getExistingFile(mcLoc("item/generated"));
        ModelFile handheld = getExistingFile(mcLoc("item/handheld"));
        ModelFile handheldRod = getExistingFile(mcLoc("item/handheld_rod"));

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