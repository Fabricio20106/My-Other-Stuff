package com.junethewoods.myotherstuff.core.util;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.StuffInit;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.function.Supplier;

public enum OtherRobes implements IArmorMaterial {
    blup(MyOtherStuff.mod_id + ":blup", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.blue_leather.get());}),
    crystal(MyOtherStuff.mod_id + ":crystal", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.crystal.get()); }),
    empresary(MyOtherStuff.mod_id + ":empresary2", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.blue_leather.get()); }),
    galaxy(MyOtherStuff.mod_id + ":galaxy", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.galaxy_cloth.get()); }),
    green(MyOtherStuff.mod_id + ":green", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.GREEN_WOOL); }),
    number(MyOtherStuff.mod_id + ":number", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.BLUE_WOOL); }),
    orange(MyOtherStuff.mod_id + ":orange", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.ORANGE_WOOL); }),
    pales(MyOtherStuff.mod_id + ":pales", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.BLUE_DYE); }),
    speed(MyOtherStuff.mod_id + ":speed", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.REDSTONE); }),
    husk(MyOtherStuff.mod_id + ":husk", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_TURTLE, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.YELLOW_WOOL); }),
    abu(MyOtherStuff.mod_id + ":abu", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.blue_leather.get()); }),
    kimono(MyOtherStuff.mod_id + ":kimono", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_GENERIC, 0.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.blue_leather.get()); });

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    OtherRobes(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
        this.name = name;
        this.maxDamageFactor = maxDamageFactor;
        this.damageReductionAmountArray = damageReductionAmountArray;
        this.enchantability = enchantability;
        this.soundEvent = soundEvent;
        this.toughness = toughness;
        this.knockbackResistance = knockbackResistance;
        this.repairMaterial = new LazyValue<>(repairMaterial);
    }

    public int getDurability(EquipmentSlotType slotIn) {
        return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
    }

    public int getDamageReductionAmount(EquipmentSlotType slotIn) {
        return this.damageReductionAmountArray[slotIn.getIndex()];
    }

    public int getEnchantability() {
        return this.enchantability;
    }

    public SoundEvent getSoundEvent() {
        return this.soundEvent;
    }

    public Ingredient getRepairMaterial() {
        return this.repairMaterial.getValue();
    }

    @OnlyIn(Dist.CLIENT)
    public String getName() {
        return this.name;
    }

    public float getToughness() {
        return this.toughness;
    }

    /**
     * Gets the percentage of knockback resistance provided by armor of the material.
     */
    public float getKnockbackResistance() {
        return this.knockbackResistance;
    }
}