package com.junethewoods.myotherstuff.event;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.data.client.OTBlockStateProvider;
import com.junethewoods.myotherstuff.data.client.OTItemModelProvider;
import com.junethewoods.myotherstuff.data.lang.OTEnglishLanguageProvider;
import com.junethewoods.myotherstuff.data.tag.OTBlockTagsProvider;
import com.junethewoods.myotherstuff.data.tag.OTItemTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = MyOtherStuff.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class OTEventBusEvents {
    @SubscribeEvent
    public static void gatherData(GatherDataEvent event) {
        DataGenerator generator = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        generator.addProvider(new OTBlockStateProvider(generator, fileHelper));
        generator.addProvider(new OTItemModelProvider(generator, fileHelper));
        generator.addProvider(new OTEnglishLanguageProvider(generator));

        OTBlockTagsProvider blockTagsProvider = new OTBlockTagsProvider(generator, fileHelper);
        generator.addProvider(blockTagsProvider);
        generator.addProvider(new OTItemTagsProvider(generator, blockTagsProvider, fileHelper));
    }
}
