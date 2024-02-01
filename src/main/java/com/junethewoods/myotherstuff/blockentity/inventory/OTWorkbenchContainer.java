package com.junethewoods.myotherstuff.blockentity.inventory;

import com.junethewoods.myotherstuff.util.OTTags;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.inventory.container.WorkbenchContainer;
import net.minecraft.util.IWorldPosCallable;

public class OTWorkbenchContainer extends WorkbenchContainer {
    private final IWorldPosCallable access;

    public OTWorkbenchContainer(int containerId, PlayerInventory inventory, IWorldPosCallable worldAccess) {
        super(containerId, inventory, worldAccess);
        this.access = worldAccess;
    }

    protected static boolean stillValid(IWorldPosCallable access, PlayerEntity player) {
        return access.evaluate((world, pos) -> world.getBlockState(pos).is(OTTags.Blocks.CRAFTING_TABLES) && player.distanceToSqr((double) pos.getX() + 0.5d,
                (double) pos.getY() + 0.5d, (double) pos.getZ() + 0.5d) <= 64, true);
    }

    @Override
    public boolean stillValid(PlayerEntity player) {
        return stillValid(this.access, player);
    }
}
