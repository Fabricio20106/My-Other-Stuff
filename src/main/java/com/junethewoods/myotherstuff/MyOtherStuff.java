package com.junethewoods.myotherstuff;

import com.junethewoods.myotherstuff.entity.renderer.OTElytraLayer;
import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.item.OTItems;
import com.junethewoods.myotherstuff.world.ore.OTOreGeneration;
import com.junethewoods.myotherstuff.sound.OTSounds;
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
    public static final Logger LOGGER = LogManager.getLogManager().getLogger(MyOtherStuff.MOD_ID);
    public static final String MOD_ID = "others";

    public MyOtherStuff() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        OTItems.ITEMS.register(modEventBus);
        OTBlocks.BLOCKS.register(modEventBus);
        OTSounds.registerSounds();

        forgeEventBus.register(this);
        forgeEventBus.addListener(EventPriority.HIGH, OTOreGeneration::generateMagenticCrystalOres);
        forgeEventBus.addListener(EventPriority.HIGH, OTOreGeneration::generateDiaemeraldOres);
    }

    public static ResourceLocation resourceLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap().values().forEach(player -> player.addLayer(new OTElytraLayer<>(player)));

        ItemModelsProperties.register(OTItems.BLAZE_ELYTRA.get(), new ResourceLocation("broken"), (stack, world, livEntity) -> ElytraItem.isFlyEnabled(stack) ? 0 : 1);
    }

    public void clientSetup(final FMLClientSetupEvent event) {
        RenderTypeLookup.setRenderLayer(OTBlocks.DRAWN_ACACIA_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.BLUE_GLASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.CYAN_GLASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.END_CRYSTAL_GLASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.BLUE_GLASS_PANE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.CYAN_GLASS_PANE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.END_CRYSTAL_GLASS_PANE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.GOLDEN_BEACON.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.HANGING_ROOTS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.AZALEA_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.FLOWERING_AZALEA_LEAVES.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.AZALEA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.FLOWERING_AZALEA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.POTTED_AZALEA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.POTTED_FLOWERING_AZALEA.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.SWAMP_OAK_SAPLING.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.TALL_BIRCH_SAPLING.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.JUNGLE_BUSH_SAPLING.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.POTTED_TALL_BIRCH_SAPLING.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.POTTED_SWAMP_OAK_SAPLING.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.POTTED_JUNGLE_BUSH_SAPLING.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.POTTED_GRASS.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.POTTED_INNO_FLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.DECORATED_POTTED_INNO_FLOWER.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.DECORATED_FLOWER_POT.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.STRIPED_DECORATED_FLOWER_POT.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.BLUE_CARROTS.get(), RenderType.cutout());
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}
}
