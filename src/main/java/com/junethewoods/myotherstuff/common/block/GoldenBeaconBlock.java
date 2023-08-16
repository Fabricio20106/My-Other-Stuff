package com.junethewoods.myotherstuff.common.block;

import com.junethewoods.myotherstuff.core.blockentity.GoldenBeaconBlockEntity;
import net.minecraft.block.BlockRenderType;
import net.minecraft.block.BlockState;
import net.minecraft.block.ContainerBlock;
import net.minecraft.block.IBeaconBeamColorProvider;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.DyeColor;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.Stats;
import net.minecraft.tileentity.BeaconTileEntity;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class GoldenBeaconBlock extends ContainerBlock implements IBeaconBeamColorProvider {
    public GoldenBeaconBlock(Properties properties) {
        super(properties);
    }

    @Override
    public DyeColor getColor() {
        return DyeColor.YELLOW;
    }

    @Nullable
    @Override
    public TileEntity newBlockEntity(IBlockReader reader) {
        return new GoldenBeaconBlockEntity();
    }

    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTraceResult) {
        if (world.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            TileEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof BeaconTileEntity) {
                player.openMenu((BeaconTileEntity) blockEntity);
                player.awardStat(Stats.INTERACT_WITH_BEACON);
            }
            return ActionResultType.CONSUME;
        }
    }

    public BlockRenderType getRenderShape(BlockState state) {
        return BlockRenderType.MODEL;
    }

    // Called by ItemBlocks after a block is set in the world, to allow post-place logic.
    public void setPlacedBy(World world, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        if (stack.hasCustomHoverName()) {
            TileEntity blockEntity = world.getBlockEntity(pos);
            if (blockEntity instanceof GoldenBeaconBlockEntity) {
                ((GoldenBeaconBlockEntity) blockEntity).setCustomName(stack.getDisplayName());
            }
        }
    }
}
