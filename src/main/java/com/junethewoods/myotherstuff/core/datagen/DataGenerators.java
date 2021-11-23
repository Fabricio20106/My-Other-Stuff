package com.junethewoods.myotherstuff.core.datagen;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MyOtherStuff.mod_id, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        dataGenerator.addProvider(new OtherBlockStateProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new ModItemModelProvider(dataGenerator, existingFileHelper));
    }
}
