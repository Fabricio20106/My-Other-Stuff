package com.junethewoods.myotherstuff.block.custom;

import com.junethewoods.myotherstuff.block.entity.custom.LegoFurnaceBlockEntity;
import net.minecraft.block.AbstractFurnaceBlock;
import net.minecraft.block.ITileEntityProvider;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class LegoFurnaceBlock extends AbstractFurnaceBlock implements ITileEntityProvider {
    public LegoFurnaceBlock(Properties properties) {
        super(properties);
    }

    @Override
    protected void openContainer(World world, BlockPos pos, PlayerEntity player) {
        TileEntity blockEntity = world.getBlockEntity(pos);
        if (blockEntity instanceof LegoFurnaceBlockEntity) {
            player.openMenu((INamedContainerProvider) blockEntity);
            player.awardStat(Stats.INTERACT_WITH_FURNACE);
        }
    }

    @Nullable
    @Override
    public TileEntity newBlockEntity(IBlockReader world) {
        return new LegoFurnaceBlockEntity();
    }
}
