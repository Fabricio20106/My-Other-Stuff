package com.junethewoods.myotherstuff.container.custom;

import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.SmithingTableContainer;
import net.minecraft.util.IWorldPosCallable;

public class OTSmithingTableContainer extends SmithingTableContainer {
    private final IWorldPosCallable access;

    public OTSmithingTableContainer(int containerId, PlayerInventory inventory, IWorldPosCallable worldAccess) {
        super(containerId, inventory, worldAccess);
        this.access = worldAccess;
    }

    protected static boolean stillValid(IWorldPosCallable access, PlayerEntity player) {
        return access.evaluate((world, pos) -> world.getBlockState(pos).is(OTTags.Blocks.SMITHING_TABLES) && player.distanceToSqr((double) pos.getX() + 0.5D,
                (double) pos.getY() + 0.5D, (double) pos.getZ() + 0.5D) <= 64, true);
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return stillValid(this.access, player);
    }
}
