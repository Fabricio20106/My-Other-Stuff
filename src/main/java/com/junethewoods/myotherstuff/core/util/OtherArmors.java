package com.junethewoods.myotherstuff.core.util;

import com.junethewoods.myotherstuff.core.MyOtherStuff;
import com.junethewoods.myotherstuff.core.init.StuffInit;
import net.minecraft.block.Blocks;
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

public enum OtherArmors implements IArmorMaterial {
    alex(MyOtherStuff.MOD_ID + ":alex", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.GREEN_WOOL); }),
    shulker(MyOtherStuff.MOD_ID + ":shulker", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.SHULKER_SHELL); }),
    sophryst(MyOtherStuff.MOD_ID + ":sophryst", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.coal_powder.get()); }),
    piglin(MyOtherStuff.MOD_ID + ":piglin", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.LEATHER); }),
    fast(MyOtherStuff.MOD_ID + ":fast", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.WHITE_CONCRETE); }),
    respawn_anchor(MyOtherStuff.MOD_ID + ":anchor", 37, new int[]{3, 6, 8, 3}, 50, SoundEvents.ITEM_ARMOR_EQUIP_NETHERITE, 3.0F, 0.2F, () -> {return Ingredient.fromItems(Blocks.CRYING_OBSIDIAN); }),
    baby_demon(MyOtherStuff.MOD_ID + ":baby_demon", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F,0.0F, () -> {return Ingredient.fromItems(Blocks.PINK_WOOL); }),
    finn(MyOtherStuff.MOD_ID + ":finn", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F,0.0F, () -> {return Ingredient.fromItems(StuffInit.redstone_powder.get()); }),
    han(MyOtherStuff.MOD_ID + ":han", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F,0.0F, () -> {return Ingredient.fromItems(StuffInit.reinforced_cloth.get()); }),
    ian(MyOtherStuff.MOD_ID + ":ian", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F,0.0F, () -> {return Ingredient.fromItems(Blocks.RED_WOOL); }),
    mario(MyOtherStuff.MOD_ID + ":mario", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F,0.0F, () -> {return Ingredient.fromItems(StuffInit.reinforced_cloth.get()); }),
    pony(MyOtherStuff.MOD_ID + ":pony", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F,0.0F, () -> {return Ingredient.fromItems(StuffInit.galaxy_cloth.get()); }),
    INNO(MyOtherStuff.MOD_ID + ":inno", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.inno_ingot.get());}),
    NETHER(MyOtherStuff.MOD_ID + ":nether.json", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.purple_ingot.get());}),
    FIRST(MyOtherStuff.MOD_ID + ":first", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.first_ingot.get());}),
    HEADSET(MyOtherStuff.MOD_ID + ":headset", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.IRON_INGOT);}),
    EMPRESARY2(MyOtherStuff.MOD_ID + ":empresary2", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.first_ingot.get());}),
    bard(MyOtherStuff.MOD_ID + ":bard", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.BROWN_WOOL);}),
    gacha(MyOtherStuff.MOD_ID + ":gacha", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_CHAIN, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.first_ingot.get());}),
    pajama(MyOtherStuff.MOD_ID + ":pajama", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_LEATHER, 3.0F, 0.0F, () -> {return Ingredient.fromItems(Items.WHITE_WOOL);}),
    spring(MyOtherStuff.MOD_ID + ":spring", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.first_ingot.get());}),
    empresary(MyOtherStuff.MOD_ID + ":empresary", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.first_ingot.get());}),
    farmer(MyOtherStuff.MOD_ID + ":farmer", 15, new int[]{2, 5, 6, 2}, 50, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.first_ingot.get());}),
    corona(MyOtherStuff.MOD_ID + ":corona", 15, new int[]{2, 5, 6, 2}, 50,SoundEvents.ITEM_ARMOR_EQUIP_IRON, 3.0F, 0.0F, () -> {return Ingredient.fromItems(StuffInit.first_ingot.get());});

    private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
    private final String name;
    private final int maxDamageFactor;
    private final int[] damageReductionAmountArray;
    private final int enchantability;
    private final SoundEvent soundEvent;
    private final float toughness;
    private final float knockbackResistance;
    private final LazyValue<Ingredient> repairMaterial;

    OtherArmors(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
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