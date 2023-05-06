
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.lyrarmastudio.rfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BlockItem;

import com.lyrarmastudio.rfactory.item.RedIronItem;
import com.lyrarmastudio.rfactory.item.OilItem;
import com.lyrarmastudio.rfactory.item.GunItem;
import com.lyrarmastudio.rfactory.item.EnergyMetrItem;
import com.lyrarmastudio.rfactory.RfactoryMod;

public class RfactoryModItems {
	public static final DeferredRegister<Item> REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, RfactoryMod.MODID);
	public static final RegistryObject<Item> REDSTONETECHBLOCK = block(RfactoryModBlocks.REDSTONETECHBLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> CHEMICALPLANT = block(RfactoryModBlocks.CHEMICALPLANT, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> GUN = REGISTRY.register("gun", () -> new GunItem());
	public static final RegistryObject<Item> RED_IRON = REGISTRY.register("red_iron", () -> new RedIronItem());
	public static final RegistryObject<Item> OIL_BUCKET = REGISTRY.register("oil_bucket", () -> new OilItem());
	public static final RegistryObject<Item> REDSTONE_IRON_BLOCK = block(RfactoryModBlocks.REDSTONE_IRON_BLOCK, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> SOLAR_PANEL = block(RfactoryModBlocks.SOLAR_PANEL, CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Item> ENERGY_METR = REGISTRY.register("energy_metr", () -> new EnergyMetrItem());
	public static final RegistryObject<Item> SMALL_BATTERY = block(RfactoryModBlocks.SMALL_BATTERY, CreativeModeTab.TAB_BUILDING_BLOCKS);

	private static RegistryObject<Item> block(RegistryObject<Block> block, CreativeModeTab tab) {
		return REGISTRY.register(block.getId().getPath(), () -> new BlockItem(block.get(), new Item.Properties().tab(tab)));
	}
}
