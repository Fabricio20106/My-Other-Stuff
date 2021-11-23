package com.junethewoods.myotherstuff.core.datagen;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(DataGenerator dataGenerator, ExistingFileHelper existingFileHelper) {
        super(dataGenerator, MyOtherStuff.mod_id, existingFileHelper);
    }

    protected void registerModels() {
        withExistingParent("raw_inno_block", modLoc("block/raw_inno_block"));
        withExistingParent("raw_purple_block", modLoc("block/raw_purple_block"));
        withExistingParent("raw_first_block", modLoc("block/raw_first_block"));
        withExistingParent("blue_stairs", modLoc("block/blue_stairs"));

        ModelFile itemGenerated = getExistingFile(mcLoc("item/generated"));
    }

    private ItemModelBuilder builder(ModelFile itemGenerated, String name) {
        return getBuilder(name).parent(itemGenerated).texture("layer0", "item/" + name);
    }
}
