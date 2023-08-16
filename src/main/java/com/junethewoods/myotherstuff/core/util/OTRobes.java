package com.junethewoods.myotherstuff.core.util;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public class OTRobes implements IArmorMaterial {
    private static final int[] MAX_DAMAGE_ARRAY = new int[] {13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] defensePerSlot;
    private final int enchantmentValue;
    private final SoundEvent equipSound;
    private final float toughness;
    private final float knockbackRes;
    private final LazyValue<Ingredient> repairIngredient;

    public OTRobes(String name, int maxDamageFactor, int[] defensePerSlot, int enchantmentValue, SoundEvent equipSound, float toughness, float knockbackRes, Supplier<Ingredient> repairIngredient) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.defensePerSlot = defensePerSlot;
        this.enchantmentValue = enchantmentValue;
        this.equipSound = equipSound;
        this.toughness = toughness;
        this.knockbackRes = knockbackRes;
        this.repairIngredient = new LazyValue<>(repairIngredient);
    }

    public int getDurabilityForSlot(EquipmentSlotType slot) {
        return MAX_DAMAGE_ARRAY[slot.getIndex()] * this.maxDamageFactor;
    }

    public int getDefenseForSlot(EquipmentSlotType slot) {
        return this.defensePerSlot[slot.getIndex()];
    }

    public int getEnchantmentValue() {
        return this.enchantmentValue;
    }

    public SoundEvent getEquipSound() {
        return this.equipSound;
    }

    public Ingredient getRepairIngredient() {
        return this.repairIngredient.get();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    // Gets the percentage of knockback resistance provided by armor of the material.
    public float getKnockbackResistance() {
        return this.knockbackRes;
    }
}
