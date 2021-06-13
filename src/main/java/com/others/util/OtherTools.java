package com.others.util;

import com.others.init.StuffInit;
import net.minecraft.block.Blocks;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum OtherTools implements IItemTier {
    diaemerald(3,725,15.0F,5,50, () ->{return Ingredient.fromItems(StuffInit.diaemerald.get());}),
    plasteel(4,450,15.0F,5,50, () ->{return Ingredient.fromItems(StuffInit.plasteel.get());}),
    artificial(4,600,15.0F,5,50, () ->{return Ingredient.fromItems(StuffInit.coal_powder.get());}),
    alt_gold(2,600,15.0F,5,50, () ->{return Ingredient.fromItems(Items.GOLD_INGOT);}),
    purple(3,750,15.0F,5,50, () ->{return Ingredient.fromItems(StuffInit.purple_ingot.get());}),
    inno(3,750,15.0F,5,50, () ->{return Ingredient.fromItems(StuffInit.inno_ingot.get());}),
    lego(2,450,15.0F,5,20, () ->{return Ingredient.fromItems(StuffInit.lego_pieces.get());}),
    respawn_anchor(4,2031,9.0F,4.0F,50, () ->{return Ingredient.fromItems(Blocks.CRYING_OBSIDIAN);});

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    OtherTools(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
        this.harvestLevel = harvestLevelIn;
        this.maxUses = maxUsesIn;
        this.efficiency = efficiencyIn;
        this.attackDamage = attackDamageIn;
        this.enchantability = enchantabilityIn;
        this.repairMaterial = new LazyValue<>(repairMaterialIn);
    }

    public int getMaxUses() {
        return this.maxUses;
    }

    public float getEfficiency() {
        return this.efficiency;
    }

    public float getAttackDamage() {
        return this.attackDamage;
    }

    public int getHarvestLevel() {
        return this.harvestLevel;
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }
}
