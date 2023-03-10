package net.colonova.colonovastechmod.inventory.container;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.handler.registry.ContainerRegistry;
import net.colonova.colonovastechmod.util.EnergyUtil;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ContainerLevelAccess;
import net.minecraft.world.inventory.DataSlot;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.crafting.RecipeType;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.energy.CapabilityEnergy;
import net.minecraftforge.energy.IEnergyStorage;
import net.minecraftforge.items.IItemHandler;
import net.minecraftforge.items.SlotItemHandler;
import net.minecraftforge.items.wrapper.InvWrapper;

public class ContainerHealer extends AbstractContainerMenu
{
    private BlockEntity blockEntity;
    private Player playerEntity;
    private IItemHandler playerInventory;

    public ContainerHealer(int windowId, BlockPos pos, Inventory playerInventory, Player player)
    {
        super(ContainerRegistry.HEALER.get(), windowId);
        blockEntity = player.getCommandSenderWorld().getBlockEntity(pos);
        this.playerEntity = player;
        this.playerInventory = new InvWrapper(playerInventory);

        layoutPlayerInventorySlots(10, 70);
        trackPower();
    }

    private void trackPower()
    {
        addDataSlot(new DataSlot()
        {
            @Override
            public int get()
            {
                return getEnergy() & 0xffff;
            }

            @Override
            public void set(int value)
            {
                blockEntity.getCapability(CapabilityEnergy.ENERGY).ifPresent(h ->
                {
                    int energyStored = h.getEnergyStored() & 0xffff0000;
                    ((EnergyUtil)h).setEnergy(energyStored + (value & 0xffff));
                });
            }
        });
        addDataSlot(new DataSlot()
        {
            @Override
            public int get()
            {
                return (getEnergy() >> 16) & 0xffff;
            }

            @Override
            public void set(int value)
            {
                blockEntity.getCapability(CapabilityEnergy.ENERGY).ifPresent(h ->
                {
                    int energyStored = h.getEnergyStored() & 0x0000ffff;
                    ((EnergyUtil)h).setEnergy(energyStored | (value << 16));
                });
            }
        });
    }

    public int getEnergy()
    {
        return blockEntity.getCapability(CapabilityEnergy.ENERGY).map(IEnergyStorage::getEnergyStored).orElse(0);
    }

    @Override
    public boolean stillValid(Player playerIn)
    {
        return stillValid(ContainerLevelAccess.create(blockEntity.getLevel(), blockEntity.getBlockPos()), playerEntity, BlockRegistry.HEALER.get());
    }

    @Override
    public ItemStack quickMoveStack(Player playerIn, int index)
    {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);

        if (slot != null && slot.hasItem())
        {
            ItemStack stack = slot.getItem();
            itemstack = stack.copy();
            if (index == 0)
            {
                if (!this.moveItemStackTo(stack, 1, 37, true))
                {
                    return ItemStack.EMPTY;
                }

                slot.onQuickCraft(stack, itemstack);
            }

            else
            {
                if (ForgeHooks.getBurnTime(stack, RecipeType.SMELTING) > 0)
                {
                    if (!this.moveItemStackTo(stack, 0, 1, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }

                else if (index < 28)
                {
                    if (!this.moveItemStackTo(stack, 28, 37, false))
                    {
                        return ItemStack.EMPTY;
                    }
                }

                else if (index < 37 && !this.moveItemStackTo(stack, 1, 28, false))
                {
                    return ItemStack.EMPTY;
                }
            }

            if (stack.isEmpty())
            {
                slot.set(ItemStack.EMPTY);
            }

            else
            {
                slot.setChanged();
            }

            if (stack.getCount() == itemstack.getCount())
            {
                return ItemStack.EMPTY;
            }

            slot.onTake(playerIn, stack);
        }

        return itemstack;
    }



    private int addSlotRange(IItemHandler handler, int index, int x, int y, int amount, int dx)
    {
        for (int i = 0 ; i < amount ; i++)
        {
            addSlot(new SlotItemHandler(handler, index, x, y));
            x += dx;
            index++;
        }
        return index;
    }

    private int addSlotBox(IItemHandler handler, int index, int x, int y, int horAmount, int dx, int verAmount, int dy)
    {
        for (int j = 0 ; j < verAmount ; j++)
        {
            index = addSlotRange(handler, index, x, y, horAmount, dx);
            y += dy;
        }

        return index;
    }

    private void layoutPlayerInventorySlots(int leftCol, int topRow)
    {
        // Player inventory
        addSlotBox(playerInventory, 9, leftCol, topRow, 9, 18, 3, 18);

        // Hotbar
        topRow += 58;
        addSlotRange(playerInventory, 0, leftCol, topRow, 9, 18);
    }
}
