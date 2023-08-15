package com.junethewoods.myotherstuff.core.util;

import com.junethewoods.myotherstuff.core.init.StuffInit;
import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;

import java.util.function.Supplier;

public enum OtherTools implements IItemTier {
    diaemerald(3,725,15.0F,5,50, () -> Ingredient.fromItems(StuffInit.diaemerald.get())),
    plasteel(4,450,15.0F,5,50, () -> Ingredient.EMPTY),
    artificial(4,600,15.0F,5,50, () -> Ingredient.fromItems(StuffInit.coal_powder.get())),
    alt_gold(2,600,15.0F,5,50, () -> Ingredient.fromItems(Items.GOLD_INGOT)),
    purple(3,750,15.0F,5,50, () -> Ingredient.fromItems(StuffInit.purple_ingot.get())),
    inno(3,750,15.0F,5,50, () -> Ingredient.fromItems(StuffInit.inno_ingot.get())),
    lego(2,450,15.0F,5,20, () -> Ingredient.fromItems(StuffInit.lego_pieces.get())),
    ANCHOR(4,2031,9.0F,4.0F,50, () -> Ingredient.fromItems(Blocks.CRYING_OBSIDIAN)),
    V1SWORDS(3, 1025, 6.0f, 2.0f, 12, () -> Ingredient.EMPTY);

    private final int harvestLevel;
    private final int maxUses;
    private final float efficiency;
    private final float attackDamage;
    private final int enchantability;
    private final LazyValue<Ingredient> repairMaterial;

    OtherTools(int harvestLevel, int durability, float miningSpeed, float attackDamage, int enchantmentValue, Supplier<Ingredient> repairMaterial) {
        this.harvestLevel = harvestLevel;
        this.maxUses = durability;
        this.efficiency = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantability = enchantmentValue;
        this.repairMaterial = new LazyValue<>(repairMaterial);
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
