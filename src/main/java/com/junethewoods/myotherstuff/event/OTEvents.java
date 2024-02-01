package com.junethewoods.myotherstuff.event;

import com.junethewoods.myotherstuff.MyOtherStuff;
import com.junethewoods.myotherstuff.config.OTConfigs;
import com.junethewoods.myotherstuff.item.OTItems;
import com.junethewoods.myotherstuff.world.OTFeatures;
import com.junethewoods.myotherstuff.world.ore.OTOreGeneration;
import net.minecraft.entity.merchant.villager.VillagerTrades;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.MerchantOffer;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.GenerationStage;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.village.WandererTradesEvent;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

import java.util.List;

@Mod.EventBusSubscriber(modid = MyOtherStuff.MOD_ID)
public class OTEvents {
    @SubscribeEvent(priority = EventPriority.HIGH)
    public static void onBiomeLoading(final BiomeLoadingEvent event) {
        BiomeGenerationSettingsBuilder settings = event.getGeneration();

        // World Generation
        if (event.getCategory() == Biome.Category.PLAINS || event.getCategory() == Biome.Category.FOREST && OTConfigs.COMMON_CONFIGS.enableObtainingDiscontinuedItems.get()) {
            settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OTFeatures.INNO_FLOWER_PATCH);
        }
        if (event.getCategory() == Biome.Category.FOREST && OTConfigs.COMMON_CONFIGS.azaleaTreeGeneration.get()) {
            settings.addFeature(GenerationStage.Decoration.VEGETAL_DECORATION, OTFeatures.AZALEA_TREES);
        }
        if (OTConfigs.COMMON_CONFIGS.diaemeraldOreGeneration.get()) OTOreGeneration.generateDiaemeraldOres(event);
        if (OTConfigs.COMMON_CONFIGS.magenticCrystalOreGeneration.get()) OTOreGeneration.generateMagenticCrystalOres(event);
        if (OTConfigs.COMMON_CONFIGS.innoOreGeneration.get()) OTOreGeneration.generateInnoOres(event);
        if (OTConfigs.COMMON_CONFIGS.netherOreGeneration.get()) OTOreGeneration.generateNetherOres(event);
    }

    @SubscribeEvent
    public static void addWanderingTraderTrades(WandererTradesEvent event) {
        List<VillagerTrades.ITrade> genericTrades = event.getGenericTrades();

        genericTrades.add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(OTItems.TALL_BIRCH_SAPLING.get(), 1),
                // Max Trades, XP, Price Multiplier
                8, 1, 0.05f));
        genericTrades.add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(OTItems.SWAMP_OAK_SAPLING.get(), 1), 8, 1, 0.05f));
        genericTrades.add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 5), new ItemStack(OTItems.JUNGLE_BUSH_SAPLING.get(), 1), 8, 1, 0.05f));
        genericTrades.add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(OTItems.MOSS_BLOCK.get(), 2), 5, 1, 0.05f));
        genericTrades.add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(OTItems.ROOTED_DIRT.get(), 2), 5, 1, 0.05f));

        if (OTConfigs.COMMON_CONFIGS.enableObtainingDiscontinuedItems.get()) {
            genericTrades.add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(OTItems.INNO_FLOWER.get(), 1), 12, 1, 0.05f));
            genericTrades.add((trader, rand) -> new MerchantOffer(new ItemStack(Items.EMERALD, 1), new ItemStack(OTItems.INNO_DYE.get(), 3), 12, 1, 0.05f));
        }
    }
}
