package com.junethewoods.myotherstuff.core.datagen;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.datagen.client.OthersBlockStateProvider;
import com.junethewoods.myotherstuff.core.datagen.client.OthersItemModelProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MyOtherStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class DataGenerators {

    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        ExistingFileHelper existingFileHelper = event.getExistingFileHelper();

        dataGenerator.addProvider(new OthersBlockStateProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new OthersItemModelProvider(dataGenerator, existingFileHelper));
        dataGenerator.addProvider(new OtherEnglishLanguageProvider(dataGenerator));
    }
}
