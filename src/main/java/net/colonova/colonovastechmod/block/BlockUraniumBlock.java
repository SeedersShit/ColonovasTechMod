package net.colonova.colonovastechmod.block;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockUraniumBlock extends Block
{
    public BlockUraniumBlock()
    {
        super(Block.Properties.of(Material.METAL)
                .strength(10.0F, 100.0F)
                .sound(SoundType.METAL)
                .requiresCorrectToolForDrops());
    }
}