package com.junethewoods.myotherstuff.block.custom;

import com.junethewoods.myotherstuff.block.entity.inventory.OTSmithingTableContainer;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class SmithingTable1Block extends BaseTableBlock {
    public SmithingTable1Block(Properties properties) {
        super(properties, new TranslationTextComponent("container.purplier_smithing"));
    }

    @Override
    public ActionResultType use(BlockState state, World world, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTraceResult) {
        if (world.isClientSide) {
            return ActionResultType.SUCCESS;
        } else {
            player.openMenu(state.getMenuProvider(world, pos));
            player.awardStat(Stats.INTERACT_WITH_SMITHING_TABLE);
            return ActionResultType.CONSUME;
        }
    }

    public INamedContainerProvider getMenuProvider(BlockState state, World world, BlockPos pos) {
        return new SimpleNamedContainerProvider((id, inventory, player) -> new OTSmithingTableContainer(id, inventory, IWorldPosCallable.create(world, pos)), this.containerName);
    }
}
