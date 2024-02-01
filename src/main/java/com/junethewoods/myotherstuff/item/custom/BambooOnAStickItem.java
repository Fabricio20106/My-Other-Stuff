package com.junethewoods.myotherstuff.item.custom;

import com.junethewoods.myotherstuff.item.OTItems;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.IRideable;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class BambooOnAStickItem<T extends Entity & IRideable> extends Item {
    private final EntityType<T> canInteractWith;
    private final int consumeItemDamage;

    public BambooOnAStickItem(EntityType<T> mount, int damageAmount, Properties properties) {
        super(properties);
        this.canInteractWith = mount;
        this.consumeItemDamage = damageAmount;
    }

    public ActionResult<ItemStack> use(World world, PlayerEntity player, Hand hand) {
        ItemStack handStack = player.getItemInHand(hand);
        if (world.isClientSide) {
            return ActionResult.pass(handStack);
        } else {
            Entity mount = player.getVehicle();
            if (player.isPassenger() && mount instanceof IRideable && mount.getType() == this.canInteractWith) {
                IRideable rideableEntity = (IRideable) mount;
                if (rideableEntity.boost()) {
                    handStack.hurtAndBreak(this.consumeItemDamage, player, (player1) -> player1.broadcastBreakEvent(hand));
                    if (handStack.isEmpty()) {
                        ItemStack emptyRod = new ItemStack(OTItems.BAMBOO_FISHING_ROD.get());
                        emptyRod.setTag(handStack.getTag());
                        return ActionResult.success(emptyRod);
                    }

                    return ActionResult.success(handStack);
                }
            }

            player.awardStat(Stats.ITEM_USED.get(this));
            return ActionResult.pass(handStack);
        }
    }
}
