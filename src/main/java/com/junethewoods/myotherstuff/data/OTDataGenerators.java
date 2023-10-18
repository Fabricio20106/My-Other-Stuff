package com.junethewoods.myotherstuff.data;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.data.client.OTBlockStateProvider;
import com.junethewoods.myotherstuff.data.client.OTItemModelProvider;
import com.junethewoods.myotherstuff.data.lang.OTEnglishLanguageProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MyOtherStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public final class OTDataGenerators {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(new OTBlockStateProvider(generator, fileHelper));
        generator.addProvider(new OTItemModelProvider(generator, fileHelper));
        generator.addProvider(new OTEnglishLanguageProvider(generator));
    }
}
