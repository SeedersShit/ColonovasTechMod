package net.colonova.colonovastechmod.item.armor;

import net.colonova.colonovascore.api.energy.item.PoweredArmorItem;
import net.colonova.colonovastechmod.handler.EnumHandler;
import net.colonova.colonovastechmod.handler.registry.EffectRegistry;
import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.*;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.Nullable;

import java.util.List;

public class ItemRadiationSuitBase extends PoweredArmorItem
{
    public ItemRadiationSuitBase(EquipmentSlot slot)
    {

        super(EnumHandler.PlasticArmorMaterial.PLASTIC, slot, Reference.CREATIVE_TAB_ITEMS, 5000);
    }

    public ItemRadiationSuitBase()
    {
        super(EnumHandler.PlasticArmorMaterial.PLASTIC, EquipmentSlot.HEAD, Reference.CREATIVE_TAB_ITEMS, 5000);
    }

    @Override
    public ArmorMaterial getMaterial()
    {
        return super.getMaterial();
    }

    @Override
    public int getEnchantmentValue()
    {
        return 0;
    }

    @Override
    public boolean isValidRepairItem(ItemStack itemStack, ItemStack itemStack2)
    {
        return false;
    }

    @Override
    public void inventoryTick(ItemStack itemStack, Level level, Entity entity, int i, boolean bl)
    {
        if(entity instanceof final Player player && !level.isClientSide)
        {

            /* 0 is boots, 1 is leggings, 2 is chestplate and 3 is helmet */


            if(player.getInventory().armor.get(0).getItem().equals(ItemRegistry.RADIATION_SUIT_BOOTS.get()) && player.getInventory().armor.get(1).getItem().equals(ItemRegistry.RADIATION_SUIT_LEGGINGS.get()) && player.getInventory().armor.get(2).getItem().equals(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get()) && player.getInventory().armor.get(3).getItem().equals(ItemRegistry.RADIATION_SUIT_HELMET.get()))
            {
                if(player.hasEffect(EffectRegistry.ANTI_RADIATION.get()))
                {
                    return;
                }

                player.addEffect(new MobEffectInstance(EffectRegistry.ANTI_RADIATION.get(), Integer.MAX_VALUE, 0));
            }
        }
    }

    @Override
    public boolean isBarVisible(ItemStack itemStack)
    {
        return true;
    }

    @Override
    public double getMaxInput(ItemStack itemStack)
    {
        return 10D;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag options)
    {
        tooltip.add(Component.translatable("messages.colonovastechmod.radiation_suit")
                .withStyle(ChatFormatting.AQUA));
    }
}