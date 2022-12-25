package net.colonova.colonovastechmod.blockentity.generator.tnt;

import net.colonova.colonovastechmod.handler.registry.BlockEntityRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;

public class BlockEntityIntermediateTNTGenerator extends BlockEntity
{
    public BlockEntityIntermediateTNTGenerator(BlockPos pos, BlockState state)
    {
        super(BlockEntityRegistry.INTERMEDIATE_TNT_GENERATOR.get(), pos, state);
    }
}
