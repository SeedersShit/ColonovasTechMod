package net.colonova.colonovastechmod.data;

import net.colonova.colonovastechmod.handler.registry.BlockRegistry;
import net.colonova.colonovastechmod.handler.registry.ItemRegistry;
import net.colonova.colonovastechmod.util.Reference;

import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class LanguageGenerator extends LanguageProvider
{
    public LanguageGenerator(DataGenerator gen, String locale)
    {
        super(gen, Reference.MOD_ID, locale);
    }

    @Override
    protected void addTranslations()
    {
        add("itemGroup." + Reference.MOD_ID + ".tab.blocks", "ColonovasTechMod: Blocks");
        add("itemGroup." + Reference.MOD_ID + ".tab.items", "ColonovasTechMod: Items");

        add(BlockRegistry.ALUMINIUM_ORE.get(), "Aluminium Ore");
        add(BlockRegistry.COPPER_ORE.get(), "Copper Ore");
        add(BlockRegistry.IRIDIUM_ORE.get(), "Iridium Ore");
        add(BlockRegistry.LEAD_ORE.get(), "Lead Ore");
        add(BlockRegistry.NICKEL_ORE.get(), "Nickel Ore");
        add(BlockRegistry.PLATINUM_ORE.get(), "Platinum Ore");
        add(BlockRegistry.SILVER_ORE.get(), "Silver Ore");
        add(BlockRegistry.TIN_ORE.get(), "Tin Ore");
        add(BlockRegistry.URANIUM_ORE.get(),  "Uranium Ore");
        add(BlockRegistry.DEEP_SLATE_ALUMINIUM_ORE.get(), "Deepslate Aluminium Ore");
        add(BlockRegistry.DEEP_SLATE_COPPER_ORE.get(), "Deepslate Copper Ore");
        add(BlockRegistry.DEEP_SLATE_IRIDIUM_ORE.get(), "Deepslate Iridium Ore");
        add(BlockRegistry.DEEP_SLATE_LEAD_ORE.get(), "Deepslate Lead Ore");
        add(BlockRegistry.DEEP_SLATE_NICKEL_ORE.get(), "Deepslate Nickel Ore");
        add(BlockRegistry.DEEP_SLATE_PLATINUM_ORE.get(), "Deepslate Platinum Ore");
        add(BlockRegistry.DEEP_SLATE_SILVER_ORE.get(), "Deepslate Silver Ore");
        add(BlockRegistry.DEEP_SLATE_TIN_ORE.get(), "Deepslate Tin Ore");
        add(BlockRegistry.DEEP_SLATE_URANIUM_ORE.get(), "Deepslate Uranium Ore");

        add(BlockRegistry.ALUMINIUM_BLOCK.get(), "Aluminium Block");
        add(BlockRegistry.COPPER_BLOCK.get(), "Copper Block");
        add(BlockRegistry.IRIDIUM_BLOCK.get(), "Iridium Block");
        add(BlockRegistry.LEAD_BLOCK.get(), "Lead Block");
        add(BlockRegistry.NICKEL_BLOCK.get(), "Nickel Block");
        add(BlockRegistry.PLATINUM_BLOCK.get(), "Platinum Block");
        add(BlockRegistry.SILVER_BLOCK.get(), "Silver Block");
        add(BlockRegistry.TIN_BLOCK.get(), "Tin Block");
        add(BlockRegistry.URANIUM_BLOCK.get(), "Uranium Block");

        add(ItemRegistry.ALUMINIUM_GEAR.get(), "Aluminium Gear");
        add(ItemRegistry.COPPER_GEAR.get(), "Copper Gear");
        add(ItemRegistry.IRIDIUM_GEAR.get(), "Iridium Gear");
        add(ItemRegistry.LEAD_GEAR.get(), "Lead Gear");
        add(ItemRegistry.NICKEL_GEAR.get(), "Nickel Gear");
        add(ItemRegistry.PLATINUM_GEAR.get(), "Platinum Gear");
        add(ItemRegistry.SILVER_GEAR.get(), "Silver Gear");
        add(ItemRegistry.TIN_GEAR.get(), "Tin Gear");
        add(ItemRegistry.URANIUM_GEAR.get(), "Uranium Gear");

        add(ItemRegistry.ALUMINIUM_INGOT.get(), "Aluminium Ingot");
        add(ItemRegistry.COPPER_INGOT.get(), "Copper Ingot");
        add(ItemRegistry.IRIDIUM_INGOT.get(), "Iridium Ingot");
        add(ItemRegistry.LEAD_INGOT.get(), "Lead Ingot");
        add(ItemRegistry.NICKEL_INGOT.get(), "Nickel Ingot");
        add(ItemRegistry.PLATINUM_INGOT.get(), "Platinum Ingot");
        add(ItemRegistry.SILVER_INGOT.get(), "Silver Ingot");
        add(ItemRegistry.TIN_INGOT.get(), "Tin Ingot");
        add(ItemRegistry.URANIUM_INGOT.get(), "Uranium Ingot");

        add(ItemRegistry.ALUMINIUM_NUGGET.get(), "Aluminium Nugget");
        add(ItemRegistry.COPPER_NUGGET.get(), "Copper Nugget");
        add(ItemRegistry.IRIDIUM_NUGGET.get(), "Iridium Nugget");
        add(ItemRegistry.LEAD_NUGGET.get(), "Lead Nugget");
        add(ItemRegistry.NICKEL_NUGGET.get(), "Nickel Nugget");
        add(ItemRegistry.PLATINUM_NUGGET.get(), "Platinum Nugget");
        add(ItemRegistry.SILVER_NUGGET.get(), "Silver Nugget");
        add(ItemRegistry.TIN_NUGGET.get(), "Tin Nugget");
        add(ItemRegistry.URANIUM_NUGGET.get(), "Uranium Nugget");

        add(ItemRegistry.RADIATION_SUIT_HELMET.get(), "Radiation Suit Helmet");
        add(ItemRegistry.RADIATION_SUIT_CHESTPLATE.get(), "Radiation Suit Chestplate");
        add(ItemRegistry.RADIATION_SUIT_LEGGINGS.get(), "Radiation Suit Leggings");
        add(ItemRegistry.RADIATION_SUIT_BOOTS.get(), "Radiation Suit Boots");

        add(ItemRegistry.WRENCH.get(), "Electric Wrench");

        add(ItemRegistry.MOLTEN_ALUMINIUM_BUCKET.get(), "Aluminium Bucket");
        add(ItemRegistry.MOLTEN_COPPER_BUCKET.get(), "Copper Bucket");
        add(ItemRegistry.MOLTEN_IRIDIUM_BUCKET.get(), "Iridium Bucket");
        add(ItemRegistry.MOLTEN_LEAD_BUCKET.get(), "Lead Bucket");
        add(ItemRegistry.MOLTEN_NICKEL_BUCKET.get(), "Nickel Bucket");
        add(ItemRegistry.MOLTEN_PLATINUM_BUCKET.get(), "Platinum Bucket");
        add(ItemRegistry.MOLTEN_SILVER_BUCKET.get(), "Silver Bucket");
        add(ItemRegistry.MOLTEN_TIN_BUCKET.get(), "Tin Bucket");
        add(ItemRegistry.MOLTEN_URANIUM_BUCKET.get(), "Uranium Bucket");

        add("enchantment.colonovastechmod.soul_binding", "Soul Binding");
        add("messages.colonovastechmod.aluminium", "Yes it is spelled correctly. Colonova is British and they spell it this way!");

        add(ItemRegistry.RUBBER.get(), "Raw Rubber");
        add(ItemRegistry.PLASTIC.get(), "Plastic");

        add("effect.colonovastechmods.anti_radiation", "Radiation Resistance");
        add("messages.colonovastechmod.radiation_suit", "Wearing a full suit of this armor grants you radiation resistance! (WIP)");

        add(ItemRegistry.RADIATION_SUIT_HELMET_BROKEN.get(), "Broken Radiation Suit Helmet");
        add(ItemRegistry.RADIATION_SUIT_CHESTPLATE_BROKEN.get(), "Broken Radiation Suit Chestplate");
        add(ItemRegistry.RADIATION_SUIT_LEGGINGS_BROKEN.get(), "Broken Radiation Suit Leggings");
        add(ItemRegistry.RADIATION_SUIT_BOOTS_BROKEN.get(), "Broken Radiation Suit Boots");

        add(BlockRegistry.BASIC_MACHINE_FRAME.get(), "Basic Machine Frame (WIP)");
        add(BlockRegistry.INTERMEDIATE_MACHINE_FRAME.get(), "Intermediate Machine Frame (WIP)");
        add(BlockRegistry.ADVANCED_MACHINE_FRAME.get(), "Advanced Machine Frame (WIP)");
        add(BlockRegistry.ULTIMATE_MACHINE_FRAME.get(), "Ultimate Machine Frame (WIP)");

        add(BlockRegistry.HEALER.get(), "Healer (WIP)");

        add(ItemRegistry.LIQUID_EXPERIENCE_BUCKET.get(), "Liquid Experience Bucket");

         add(BlockRegistry.BASIC_ENERGY_CABLE.get(),"Basic Energy Cable");
         add(BlockRegistry.INTERMEDIATE_ENERGY_CABLE.get(),"Intermediate Energy Cable");
         add(BlockRegistry.ADVANCED_ENERGY_CABLE.get(),"Advanced Energy Cable");
         add(BlockRegistry.ULTIMATE_ENERGY_CABLE.get(),"Ultimate Energy Cable");
         add(BlockRegistry.BASIC_FILTER_CABLE.get(),"Basic Filter Cable");
         add(BlockRegistry.INTERMEDIATE_FILTER_CABLE.get(),"Intermediate Filter Cable");
         add(BlockRegistry.ADVANCED_FILTER_CABLE.get(),"Advanced Filter Cable");
         add(BlockRegistry.ULTIMATE_FILTER_CABLE.get(),"Ultimate Filter Cable");
         add(BlockRegistry.BASIC_FLUID_CABLE.get(),"Basic Fluid Cable");
         add(BlockRegistry.INTERMEDIATE_FLUID_CABLE.get(),"Intermediate Fluid Cable");
         add(BlockRegistry.ADVANCED_FLUID_CABLE.get(),"Advanced Fluid Cable");
         add(BlockRegistry.ULTIMATE_FLUID_CABLE.get(),"Ultimate Fluid Cable");
         add(BlockRegistry.BASIC_GAS_CABLE.get(),"Basic Gas Cable");
         add(BlockRegistry.INTERMEDIATE_GAS_CABLE.get(),"Intermediate Gas Cable");
         add(BlockRegistry.ADVANCED_GAS_CABLE.get(),"Advanced Gas Cable");
         add(BlockRegistry.ULTIMATE_GAS_CABLE.get(),"Ultimate Gas Cable");
         add(BlockRegistry.BASIC_ITEM_CABLE.get(),"Basic Item Cable");
         add(BlockRegistry.INTERMEDIATE_ITEM_CABLE.get(),"Intermediate Item Cable");
         add(BlockRegistry.ADVANCED_ITEM_CABLE.get(),"Advanced Item Cable");
         add(BlockRegistry.ULTIMATE_ITEM_CABLE.get(),"Ultimate Item Cable");
         add(BlockRegistry.BASIC_VOID_CABLE.get(),"Basic Void Cable");
         add(BlockRegistry.INTERMEDIATE_VOID_CABLE.get(),"Intermediate Void Cable");
         add(BlockRegistry.ADVANCED_VOID_CABLE.get(),"Advanced Void Cable");
         add(BlockRegistry.ULTIMATE_VOID_CABLE.get(),"Ultimate Void Cable");
         add(BlockRegistry.PORTAL.get(),"Portal");
         add(BlockRegistry.PORTAL_CONTROLLER.get(),"Portal Controller");
         add(BlockRegistry.PORTAL_FRAME.get(),"Portal Frame");
         add(BlockRegistry.PORTAL_INTERFACE.get(),"Portal Interface");
         add(BlockRegistry.PORTAL_STABILIZER.get()," Portal Stabilizer");
         add(BlockRegistry.PORTAL_PROGRAMMER.get(),"Portal Programmer");
         add(BlockRegistry.ANGEL_BLOCK.get(),"Angel Block");
         add(BlockRegistry.AUTOMATIC_ANVIL.get(),"Automatic Anvil");
         add(BlockRegistry.BASIC_BOTTLER.get()," Basic Bottler");
         add(BlockRegistry.INTERMEDIATE_BOTTLER.get(),"Intermediate Bottler");
         add(BlockRegistry.ADVANCED_BOTTLER.get(),"Advanced Bottler");
         add(BlockRegistry.ULTIMATE_BOTTLER.get(),"Ultimate Bottler");
         add(BlockRegistry.BREAKER.get(),"Breaker");
         add(BlockRegistry.BASIC_ENERGY_BUFFER.get(),"Basic Energy Buffer");
         add(BlockRegistry.INTERMEDIATE_ENERGY_BUFFER.get(),"Energy Buffer");
         add(BlockRegistry.ADVANCED_ENERGY_BUFFER.get(),"Energy Buffer");
         add(BlockRegistry.ULTIMATE_ENERGY_BUFFER.get(),"Energy Buffer");
         add(BlockRegistry.BASIC_FLUID_BUFFER.get(),"Fluid Buffer");
         add(BlockRegistry.INTERMEDIATE_FLUID_BUFFER.get(),"Fluid Buffer");
         add(BlockRegistry.ADVANCED_FLUID_BUFFER.get(),"Fluid Buffer");
         add(BlockRegistry.ULTIMATE_FLUID_BUFFER.get(),"Fluid Buffer");
         add(BlockRegistry.BASIC_BUILDER.get(),"Builder");
         add(BlockRegistry.INTERMEDIATE_BUILDER.get(),"Builder");
         add(BlockRegistry.ADVANCED_BUILDER.get(),"Builder");
         add(BlockRegistry.ULTIMATE_BUILDER.get(),"Builder");
         add(BlockRegistry.ITEM_CANNON.get(),"Item Cannon");
         add(BlockRegistry.BASIC_CHARGER.get(),"Charger");
         add(BlockRegistry.INTERMEDIATE_CHARGER.get(),"Charger");
         add(BlockRegistry.ADVANCED_CHARGER.get(),"Charger");
         add(BlockRegistry.ULTIMATE_CHARGER.get(),"Charger");
         add(BlockRegistry.CLOCK.get(),"Clock");
         add(BlockRegistry.BASIC_CRAFTER.get(),"Crafter");
         add(BlockRegistry.INTERMEDIATE_CRAFTER.get(),"Crafter");
         add(BlockRegistry.ADVANCED_CRAFTER.get(),"Crafter");
         add(BlockRegistry.ULTIMATE_CRAFTER.get(),"Crafter");
         add(BlockRegistry.BASIC_CRATE.get(),"Crate");
         add(BlockRegistry.INTERMEDIATE_CRATE.get(),"Crate");
         add(BlockRegistry.ADVANCED_CRATE.get(),"Crate");
         add(BlockRegistry.ULTIMATE_CRATE.get(),"Crate");
         add(BlockRegistry.DRAIN.get(),"Drain");
         add(BlockRegistry.DROPPER.get(),"Dropper");
         add(BlockRegistry.BASIC_DRUM.get(),"Drum");
         add(BlockRegistry.INTERMEDIATE_DRUM.get(),"Drum");
         add(BlockRegistry.ADVANCED_DRUM.get(),"Drum");
         add(BlockRegistry.ULTIMATE_DRUM.get(),"Drum");
         add(BlockRegistry.MAGIC_EGG.get(),"Magic Egg");
         add(BlockRegistry.ELEVATOR.get(),"Elevator");
         add(BlockRegistry.ENCHANTER.get(),"Enchanter");
         add(BlockRegistry.BASIC_ENDER_GENERATOR.get(),"Ender Generator");
         add(BlockRegistry.INTERMEDIATE_ENDER_GENERATOR.get(),"Ender Generator");
         add(BlockRegistry.ADVANCED_ENDER_GENERATOR.get(),"Ender Generator");
         add(BlockRegistry.ULTIMATE_ENDER_GENERATOR.get(),"Ender Generator");
         add(BlockRegistry.FLAG.get(),"Flag");
         add(BlockRegistry.BASIC_ENERGY_STORAGE.get(),"Energy Storage");
         add(BlockRegistry.INTERMEDIATE_ENERGY_STORAGE.get(),"Energy Storage");
         add(BlockRegistry.ADVANCED_ENERGY_STORAGE.get(),"Energy Storage");
         add(BlockRegistry.ULTIMATE_ENERGY_STORAGE.get(),"Energy Storage");
         add(BlockRegistry.BASIC_FURNACE.get(),"Furnace");
         add(BlockRegistry.INTERMEDIATE_FURNACE.get(),"Furnace");
         add(BlockRegistry.ADVANCED_FURNACE.get(),"Furnace");
         add(BlockRegistry.ULTIMATE_FURNACE.get(),"Furnace");
         add(BlockRegistry.MOB_GLASS.get(),"Mob Glass");
         add(BlockRegistry.GRINDER.get(),"Grinder");
         add(BlockRegistry.BASIC_INFUSER.get(),"Infuser");
         add(BlockRegistry.INTERMEDIATE_INFUSER.get(),"Infuser");
         add(BlockRegistry.ADVANCED_INFUSER.get(),"Infuser");
         add(BlockRegistry.ULTIMATE_INFUSER.get(),"Infuser");
         add(BlockRegistry.BASIC_LAVA_GENERATOR.get(),"Lava Generator");
         add(BlockRegistry.INTERMEDIATE_LAVA_GENERATOR.get(),"Lava Generator");
         add(BlockRegistry.ADVANCED_LAVA_GENERATOR.get(),"Lava Generator");
         add(BlockRegistry.ULTIMATE_LAVA_GENERATOR.get(),"Lava Generator");
         add(BlockRegistry.MELTER.get(),"Melter");
         add(BlockRegistry.BASIC_NETHER_STAR_GENERATOR.get(),"Nether Star Generator");
         add(BlockRegistry.INTERMEDIATE_NETHER_STAR_GENERATOR.get(),"Nether Star Generator");
         add(BlockRegistry.ADVANCED_NETHER_STAR_GENERATOR.get(),"Nether Star Generator");
         add(BlockRegistry.ULTIMATE_NETHER_STAR_GENERATOR.get(),"Nether Star Generator");
         add(BlockRegistry.PAINT_CAN.get(),"Paint Can");
         add(BlockRegistry.PAINTER.get(),"Painter");
         add(BlockRegistry.PLACER.get(),"Block Placer");
         add(BlockRegistry.POWER_MONITOR.get(),"Power Monitor");
         add(BlockRegistry.BASIC_PROJECTOR.get(),"Projector");
         add(BlockRegistry.INTERMEDIATE_PROJECTOR.get(),"Projector");
         add(BlockRegistry.ADVANCED_PROJECTOR.get(),"Projector");
         add(BlockRegistry.ULTIMATE_PROJECTOR.get(),"Projector");
         add(BlockRegistry.QUARRY.get(),"Quarry");
         add(BlockRegistry.QUARRY_SPEED_UPGRADE.get(),"Quarry Speed Upgrade");
         add(BlockRegistry.QUARRY_SILK_UPGRADE.get(),"Quarry Silk Upgrade");
         add(BlockRegistry.QUARRY_FORTUNE_UPGRADE.get(),"Quarry Fortune Upgrade");
         add(BlockRegistry.QUARRY_VOID_UPGRADE.get(),"Quarry Void Upgrade");
         add(BlockRegistry.SHOWER.get(),"Shower");
         add(BlockRegistry.BASIC_SOLAR_PANEL.get(),"Solar Panel");
         add(BlockRegistry.INTERMEDIATE_SOLAR_PANEL.get(),"Solar Panel");
         add(BlockRegistry.ADVANCED_SOLAR_PANEL.get(),"Solar Panel");
         add(BlockRegistry.ULTIMATE_SOLAR_PANEL.get(),"Solar Panel");
         add(BlockRegistry.SOUND_MUFFLER.get(),"Sound Muffler");
         add(BlockRegistry.SPAWNER.get(),"Spawner");
         add(BlockRegistry.BASIC_SPIKES.get(),"Spikes");
         add(BlockRegistry.INTERMEDIATE_SPIKES.get(),"Spikes");
         add(BlockRegistry.ADVANCED_SPIKES.get(),"Spikes");
         add(BlockRegistry.ULTIMATE_SPIKES.get(),"Spikes");
         add(BlockRegistry.BASIC_STEAM_GENERATOR.get(),"Steam Generator");
         add(BlockRegistry.INTERMEDIATE_STEAM_GENERATOR.get(),"Steam Generator");
         add(BlockRegistry.ADVANCED_STEAM_GENERATOR.get(),"Steam Generator");
         add(BlockRegistry.ULTIMATE_STEAM_GENERATOR.get(),"Steam Generator");
         add(BlockRegistry.BASIC_STIRLING_GENERATOR.get(),"Stirling Generator");
         add(BlockRegistry.INTERMEDIATE_STIRLING_GENERATOR.get(),"Stirling Generator");
         add(BlockRegistry.ADVANCED_STIRLING_GENERATOR.get(),"Stirling Generator");
         add(BlockRegistry.ULTIMATE_STIRLING_GENERATOR.get(),"Stirling Generator");
         add(BlockRegistry.TANK.get(),"Tank");
         add(BlockRegistry.TIME_CONTROLLER.get(),"Time Controller");
         add(BlockRegistry.WEATHER_CONTROLLER.get(),"Weather Controller");
         add(BlockRegistry.TRANSCEIVER.get(),"Transceiver");
         add(BlockRegistry.UNCRAFTER.get(),"Uncrafter");
         add(BlockRegistry.VACUUM_HOPPER.get(),"Vacuum Hopper");
         add(BlockRegistry.VILLAGE_LOCATOR.get(),"Village Locator");
         add(BlockRegistry.VOID_PORTAL.get(),"Void Portal");
         add(BlockRegistry.BASIC_WATER_WHEEL.get(),"Water Wheel");
         add(BlockRegistry.INTERMEDIATE_WATER_WHEEL.get(),"Water Wheel");
         add(BlockRegistry.ADVANCED_WATER_WHEEL.get(),"Water Wheel");
         add(BlockRegistry.ULTIMATE_WATER_WHEEL.get(),"Water Wheel");
         add(BlockRegistry.WEATHER_MUFFLER.get(),"Weather Muffler");
         add(BlockRegistry.BASIC_WINDMILL.get(),"Basic Windmill");
         add(BlockRegistry.INTERMEDIATE_WINDMILL.get(),"Basic Windmill");
         add(BlockRegistry.ADVANCED_WINDMILL.get(),"Basic Windmill");
         add(BlockRegistry.ULTIMATE_WINDMILL.get(),"Basic Windmill");
         add(BlockRegistry.WIRELESS_CHARGER.get(),"Wireless Charger");
         add(BlockRegistry.WITHER_BUILDER.get(),"Wither Builder");
         add(BlockRegistry.WITHER_GLASS.get(),"Wither Glass");
         add(BlockRegistry.WITHER_STONE.get(),"Wither Stone");
         add(BlockRegistry.BASIC_FLUID_TANK.get(),"Fluid Tank");
         add(BlockRegistry.INTERMEDIATE_FLUID_TANK.get(),"Fluid Tank");
         add(BlockRegistry.ADVANCED_FLUID_TANK.get(),"Fluid Tank");
         add(BlockRegistry.ULTIMATE_FLUID_TANK.get(),"Fluid Tank");
         add(BlockRegistry.BASIC_GAS_TANK.get(),"Gas Tank");
         add(BlockRegistry.INTERMEDIATE_GAS_TANK.get(),"Gas Tank");
         add(BlockRegistry.ADVANCED_GAS_TANK.get(),"Gas Tank");
         add(BlockRegistry.ULTIMATE_GAS_TANK.get(),"Gas Tank");
         add(BlockRegistry.PUMP.get(),"Pump");
         add(BlockRegistry.REPAIRER.get(),"Repairer");
         add(BlockRegistry.BASIC_TNT_GENERATOR.get(),"TNT Generator");
         add(BlockRegistry.INTERMEDIATE_TNT_GENERATOR.get(),"TNT Generator");
         add(BlockRegistry.ADVANCED_TNT_GENERATOR.get(),"TNT Generator");
         add(BlockRegistry.ULTIMATE_TNT_GENERATOR.get(),"TNT Generator");
         add(BlockRegistry.TRADER.get(),"Trader");
    }
}
