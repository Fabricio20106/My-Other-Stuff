package com.junethewoods.myotherstuff.common.block;

import com.junethewoods.myotherstuff.core.tileentity.GoldenBeaconTileEntity;
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
    public GoldenBeaconBlock(Properties builder) {
        super(builder);
    }

    @Override
    public DyeColor getColor() {
        return DyeColor.YELLOW;
    }

    @Nullable
    @Override
    public TileEntity newBlockEntity(IBlockReader worldIn) {
        return new GoldenBeaconTileEntity();
    }

    public ActionResultType use(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            TileEntity tileentity = worldIn.getBlockEntity(pos);
            if (tileentity instanceof BeaconTileEntity) {
                player.openMenu((BeaconTileEntity)tileentity);
                player.awardStat(Stats.INTERACT_WITH_BEACON);
            }
            return ActionResultType.CONSUME;
        }
    }

    public BlockRenderType getRenderShape(BlockState state) {
        return BlockRenderType.MODEL;
    }

    /**
     * Called by ItemBlocks after a block is set in the world, to allow post-place logic
     */
    public void setPlacedBy(World worldIn, BlockPos pos, BlockState state, LivingEntity placer, ItemStack stack) {
        if (stack.hasCustomHoverName()) {
            TileEntity tileentity = worldIn.getBlockEntity(pos);
            if (tileentity instanceof GoldenBeaconTileEntity) {
                ((GoldenBeaconTileEntity)tileentity).setCustomName(stack.getDisplayName());
            }
        }
    }
}
