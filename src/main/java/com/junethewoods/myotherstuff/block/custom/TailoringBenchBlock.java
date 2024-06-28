package com.junethewoods.myotherstuff.block.custom;

import com.junethewoods.myotherstuff.container.custom.TailoringBenchContainer;
import com.junethewoods.myotherstuff.util.OTStats;
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
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;

public class TailoringBenchBlock extends Block {
    public static final ITextComponent CONTAINER_TITLE = new TranslationTextComponent("container.others.tailoring_bench");

    public TailoringBenchBlock(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult hitResult) {
        if (world.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(world, pos));
            player.awardStat(OTStats.INTERACT_WITH_TAILORING_BENCH);
            return ActionResultType.CONSUME;
        }
    }

    @Nullable
    @Override
    public INamedContainerProvider getMenuProvider(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedContainerProvider((id, inventory, player) -> new TailoringBenchContainer(id, inventory, IWorldPosCallable.create(world, pos)), CONTAINER_TITLE);
    }
}
