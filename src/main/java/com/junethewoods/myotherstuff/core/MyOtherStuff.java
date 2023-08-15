package com.junethewoods.myotherstuff.core;

import com.junethewoods.myotherstuff.client.renderer.entity.layer.OthersElytraLayer;
import com.junethewoods.myotherstuff.core.init.BlockInit;
import com.junethewoods.myotherstuff.core.init.StuffInit;
import com.junethewoods.myotherstuff.core.init.WeaponryInit;
import com.junethewoods.myotherstuff.core.misc.OreGeneration;
import com.junethewoods.myotherstuff.core.misc.OtherSounds;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import java.util.logging.LogManager;
import java.util.logging.Logger;

@Mod(MyOtherStuff.MOD_ID)
public class MyOtherStuff {
    // 16773874 <- inno decimal color fff2f2 <- inno hexadecimal color
    // WeaponryInit.weapons.register(Registring);
    // .maxStackSize(1)

    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MyOtherStuff.MOD_ID);

    public static final String MOD_ID = "others";

    public static final String PREFIX = MOD_ID + ":";

    public MyOtherStuff() {
        IEventBus registering = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus eventBus = MinecraftForge.EVENT_BUS;
        registering.addListener(this::commonSetup);
        registering.addListener(this::clientSetup);
        eventBus.register(this);
        eventBus.addListener(EventPriority.HIGH, OreGeneration::genCrystalOre);
        eventBus.addListener(EventPriority.HIGH, OreGeneration::genInnoOre);
        eventBus.addListener(EventPriority.HIGH, OreGeneration::genDiaemeraldOre);
        eventBus.addListener(EventPriority.HIGH, OreGeneration::genPurpleOre);
        /*Some Other Stuff*/
        register();

        StuffInit.ITEMS.register(registering);
        WeaponryInit.ITEMS.register(registering);
        BlockInit.BLOCKS.register(registering);
        StuffInit.classLoad();
        BlockInit.classLoad();
        OtherSounds.classLoad();
        OtherSounds.registerSounds();
    }

    public static ResourceLocation resourceLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public static void register() {}

    public void commonSetup(final FMLCommonSetupEvent event) {
        Minecraft.getInstance().getRenderManager().getSkinMap().values().forEach(player -> player.addLayer(new OthersElytraLayer<>(player)));

        ItemModelsProperties.registerProperty(StuffInit.blaze_elytra.get(), new ResourceLocation("broken"), (itemStack, clientWorld, livingEntity) ->
                ElytraItem.isUsable(itemStack) ? 0.0F : 1.0F);
    }

    public void clientSetup(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(BlockInit.acacia_leaves.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.blue_glass.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.bluewhite_glass.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.end_crystal_glass.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.blue_glass_pane.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.bluewhite_glass_pane.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.end_crystal_glass_pane.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.golden_beacon.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.azalea.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.swamp_oak_sapling.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.tall_birch_sapling.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.oak_bush_sapling.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.potted_tall_birch_sapling.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.potted_swamp_oak_sapling.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.potted_oak_bush_sapling.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.potted_grass.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.potted_inno_flower.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.orange_potted_inno_flower.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.orange_flower_pot.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.orange_flower_pot_1.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.blue_carrots.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(BlockInit.blue_wall.get(), RenderType.getCutout());
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}
}
