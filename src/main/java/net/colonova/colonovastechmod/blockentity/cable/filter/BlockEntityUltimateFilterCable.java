package net.colonova.colonovastechmod.blockentity.cable.filter;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityUltimateFilterCable extends BlockEntity
{
    public BlockEntityUltimateFilterCable(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.ULTIMATE_FILTER_CABLE.get(), pos, state);
    }

    public void tick(Level level, BlockPos pos)
    {

    }
}
