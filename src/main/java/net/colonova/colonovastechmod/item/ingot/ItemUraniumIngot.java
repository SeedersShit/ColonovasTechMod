package net.colonova.colonovastechmod.item.ingot;


import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.world.item.Item;

public class ItemUraniumIngot extends Item
{
    public ItemUraniumIngot()
    {
        super(new Item.Properties()
                .tab(Reference.CREATIVE_TAB_ITEMS)
                .stacksTo(64));
    }
}