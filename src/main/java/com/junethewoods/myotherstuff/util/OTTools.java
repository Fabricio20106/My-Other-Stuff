package com.junethewoods.myotherstuff.util;

import com.junethewoods.myotherstuff.item.OTItems;
import net.minecraft.block.Blocks;
import net.minecraft.item.IItemTier;
import net.minecraft.item.crafting.Ingredient;
import net.minecraftforge.common.Tags;

import java.util.function.Supplier;

public enum OTTools implements IItemTier {
    DIAEMERALD(3, 725, 7, 3.5F, 10, () -> Ingredient.of(OTTags.Items.GEMS_DIAEMERALD)),
    MAGENTIC_CRYSTAL(2, 861, 7, 2.5F, 12, () -> Ingredient.of(OTTags.Items.GEMS_MAGENTIC)),
    PLASTEEL(4, 450, 15, 5, 50, () -> Ingredient.EMPTY),
    ARTIFICIAL(4, 600, 15, 5, 50, () -> Ingredient.of(OTTags.Items.DUSTS_COAL)),
    WOVEN_GOLD(2, 600, 15, 5, 50, () -> Ingredient.of(Tags.Items.INGOTS_GOLD)),
    NETHER(3, 750, 15, 5, 50, () -> Ingredient.of(OTTags.Items.INGOTS_NETHER)),
    INNO(3, 750, 15, 5, 50, () -> Ingredient.of(OTTags.Items.INGOTS_INNO)),
    LEGO(2, 450, 15, 5, 20, () -> Ingredient.of(OTItems.LEGO_PIECES.get())),
    ANCHOR(4, 2031, 9, 4, 50, () -> Ingredient.of(Blocks.CRYING_OBSIDIAN)),
    V1SWORDS(3, 1025, 6, 2, 12, () -> Ingredient.EMPTY);

    private final int harvestLevel;
    private final int durability;
    private final float miningSpeed;
    private final float attackDamage;
    private final int enchantmentValue;
    private final Supplier<Ingredient> repairIngredient;

    OTTools(int harvestLevel, int durability, float miningSpeed, float attackDamage, int enchantmentValue, Supplier<Ingredient> repairIngredient) {
        this.harvestLevel = harvestLevel;
        this.durability = durability;
        this.miningSpeed = miningSpeed;
        this.attackDamage = attackDamage;
        this.enchantmentValue = enchantmentValue;
        this.repairIngredient = repairIngredient;
    }

    public int getUses() {
        return this.durability;
    }

    public float getSpeed() {
        return this.miningSpeed;
    }

    public float getAttackDamageBonus() {
        return this.attackDamage;
    }

    public int getLevel() {
        return this.harvestLevel;
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }
}
