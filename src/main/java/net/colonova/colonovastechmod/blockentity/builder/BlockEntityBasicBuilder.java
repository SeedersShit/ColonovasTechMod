package net.colonova.colonovastechmod.blockentity.builder;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityBasicBuilder extends BlockEntity
{
    public BlockEntityBasicBuilder(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.BASIC_BUILDER.get(), pos, state);
    }
}
