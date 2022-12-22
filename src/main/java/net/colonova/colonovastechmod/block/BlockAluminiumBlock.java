package net.colonova.colonovastechmod.block;

import net.colonova.colonovascore.api.block.BlockBase;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.Material;

import org.jetbrains.annotations.Nullable;

import java.util.List;

public class BlockAluminiumBlock extends BlockBase
{
    public BlockAluminiumBlock(Material material, float hardness, float resistance, SoundType soundType)
    {
        super(material, hardness, resistance, soundType);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable BlockGetter world, List<Component> tooltip, TooltipFlag options)
    {
        tooltip.add(Component.translatable("messages.colonovastechmod.aluminium")
                .withStyle(ChatFormatting.BOLD)
                .withStyle(ChatFormatting.DARK_RED));
    }
}