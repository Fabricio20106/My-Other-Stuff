package com.junethewoods.myotherstuff.block.custom;

import com.junethewoods.myotherstuff.block.entity.inventory.OTWorkbenchContainer;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.world.World;

public abstract class BaseTableBlock extends Block {
    public final ITextComponent containerName;

    public BaseTableBlock(Properties properties, ITextComponent containerName) {
        super(properties);
        this.containerName = containerName;
    }

    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTraceResult) {
        if (world.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(world, pos));
            return ActionResultType.CONSUME;
        }
    }

    public INamedContainerProvider getMenuProvider(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedContainerProvider((id, inventory, player) -> new OTWorkbenchContainer(id, inventory, IWorldPosCallable.create(world, pos)), containerName);
    }
}
