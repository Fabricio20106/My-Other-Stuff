package com.junethewoods.myotherstuff;

import com.junethewoods.myotherstuff.block.OTBlocks;
import com.junethewoods.myotherstuff.blockentity.OTBlockEntities;
import com.junethewoods.myotherstuff.config.OTConfigs;
import com.junethewoods.myotherstuff.container.OTContainerTypes;
import com.junethewoods.myotherstuff.crafting.OTRecipeSerializers;
import com.junethewoods.myotherstuff.crafting.custom.TailoringRecipe;
import com.junethewoods.myotherstuff.entity.renderer.OTElytraLayer;
import com.junethewoods.myotherstuff.item.OTItems;
import com.junethewoods.myotherstuff.screen.TailoringBenchScreen;
import com.junethewoods.myotherstuff.sound.OTSounds;
import com.junethewoods.myotherstuff.util.OTStats;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.ScreenManager;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.client.renderer.tileentity.BeaconTileEntityRenderer;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ElytraItem;
import net.minecraft.item.FishingRodItem;
import net.minecraft.item.ItemModelsProperties;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.server.FMLServerStartingEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import static com.junethewoods.myotherstuff.util.OTItemPredicateProvider.addBowPredicates;
import static com.junethewoods.myotherstuff.util.OTItemPredicateProvider.addCrossbowPredicates;

@Mod(MyOtherStuff.MOD_ID)
public class MyOtherStuff {
    public static final Logger LOGGER = LogManager.getLogger(MyOtherStuff.MOD_ID);
    public static final String MOD_ID = "others";

    public MyOtherStuff() {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();
        IEventBus forgeEventBus = MinecraftForge.EVENT_BUS;
        modEventBus.addListener(this::commonSetup);
        modEventBus.addListener(this::clientSetup);

        OTItems.ITEMS.register(modEventBus);
        OTBlocks.BLOCKS.register(modEventBus);
        OTBlockEntities.BLOCK_ENTITIES.register(modEventBus);
        OTContainerTypes.CONTAINERS.register(modEventBus);
        OTRecipeSerializers.RECIPE_SERIALIZERS.register(modEventBus);

        OTSounds.registerSounds();
        OTStats.init();

        forgeEventBus.register(this);

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, OTConfigs.COMMON_SPEC, "jtw-mods/others-common.toml");
    }

    public static ResourceLocation resourceLoc(String name) {
        return new ResourceLocation(MOD_ID, name);
    }

    public void commonSetup(final FMLCommonSetupEvent event) {
        Minecraft.getInstance().getEntityRenderDispatcher().getSkinMap().values().forEach(player -> player.addLayer(new OTElytraLayer<>(player)));

        Registry.register(Registry.RECIPE_TYPE, TailoringRecipe.TYPE_ID, OTRecipeSerializers.TAILORING_RECIPE);

        addBowPredicates(OTItems.BLAZE_BOW.get());
        addBowPredicates(OTItems.BAMBOO_BOW.get());
        addCrossbowPredicates(OTItems.BLAZE_CROSSBOW.get());
        addCrossbowPredicates(OTItems.BAMBOO_CROSSBOW.get());
        addCrossbowPredicates(OTItems.DIAMOND_CROSSBOW.get());
        addCrossbowPredicates(OTItems.ENDER_CROSSBOW.get());
        ItemModelsProperties.register(OTItems.BLAZE_ELYTRA.get(), new ResourceLocation("broken"), (stack, world, livEntity) -> ElytraItem.isFlyEnabled(stack) ? 0 : 1);
        ItemModelsProperties.register(OTItems.BAMBOO_FISHING_ROD.get(), new ResourceLocation("cast"), (stack, world, livEntity) -> {
            if (livEntity == null) {
                return 0;
            } else {
                boolean isMainHand = livEntity.getMainHandItem() == stack;
                boolean isOffHand = livEntity.getOffhandItem() == stack;

                if (livEntity.getMainHandItem().getItem() instanceof FishingRodItem) isOffHand = false;
                return (isMainHand || isOffHand) && livEntity instanceof PlayerEntity && ((PlayerEntity) livEntity).fishing != null ? 1 : 0;
            }
        });

        // Will probably be added in the next release.
        // OTVanillaCompatibilities.registerCompatibilities();
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
        RenderTypeLookup.setRenderLayer(OTBlocks.DRAWN_COMMAND_BLOCK.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.DRAWN_CREATIVE_ENERGY_CUBE.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.GOLDEN_CAULDRON.get(), RenderType.cutout());
        RenderTypeLookup.setRenderLayer(OTBlocks.INNO_FLOWER.get(), RenderType.cutout());

        ClientRegistry.bindTileEntityRenderer(OTBlockEntities.GOLDEN_BEACON.get(), BeaconTileEntityRenderer::new);

        ScreenManager.register(OTContainerTypes.TAILORING_BENCH.get(), TailoringBenchScreen::new);
    }

    @SubscribeEvent
    public void onServerStarting(FMLServerStartingEvent event) {}
}
