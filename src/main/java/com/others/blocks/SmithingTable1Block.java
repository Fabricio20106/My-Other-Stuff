package com.others.blocks;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.inventory.container.INamedContainerProvider;
import net.minecraft.inventory.container.SimpleNamedContainerProvider;
import net.minecraft.inventory.container.SmithingTableContainer;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Hand;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

public class SmithingTable1Block extends BaseTableBlock {
    private static final ITextComponent container_name = new TranslationTextComponent("container.purplier_smithing");

    public SmithingTable1Block(AbstractBlock.Properties properties) {
        super(properties);
    }

    public INamedContainerProvider getContainer(BlockState state, World worldIn, BlockPos pos) {
        return new SimpleNamedContainerProvider((id, inventory, player) -> new SmithingTableContainer(id, inventory, IWorldPosCallable.of(worldIn, pos)), container_name);
    }

    public ActionResultType onBlockActivated(BlockState state, World worldIn, BlockPos pos, PlayerEntity player, Hand handIn, BlockRayTraceResult hit) {
        if (worldIn.isRemote) {
            return ActionResultType.SUCCESS;
        } else {
            player.openContainer(state.getContainer(worldIn, pos));
            player.addStat(Stats.field_232864_aE_);
            return ActionResultType.CONSUME;
        }
    }
}
