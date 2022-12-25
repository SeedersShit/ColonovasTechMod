package net.colonova.colonovastechmod.block.machine;

import net.colonova.colonovascore.api.block.BlockBase;
import net.colonova.colonovastechmod.util.MachineType;

import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

public class BlockMelter extends BlockBase
{
    public BlockMelter(Material material, float hardness, float resistance, SoundType soundType, MachineType machineType)
    {
        super(material, hardness, resistance, soundType);

        //this.machineType = machineType;
    }
}
