package com.junethewoods.myotherstuff.common.item;

import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.IItemTier;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;

public class HoneyBottleSwordItem extends SwordItem {
    public HoneyBottleSwordItem(IItemTier tier, int attackDamage, float attackSpeed, Properties builder) {
        super(tier, attackDamage, attackSpeed, builder);
    }

    @Override
    public boolean onLeftClickEntity(ItemStack stack, PlayerEntity player, Entity entity) {
        if (entity instanceof LivingEntity) {
            LivingEntity entityLiving = (LivingEntity) entity;
            entityLiving.addPotionEffect(new EffectInstance(Effects.SLOWNESS, 200));
        }
        return super.onLeftClickEntity(stack, player, entity);
    }
}
