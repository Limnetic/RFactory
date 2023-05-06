
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.lyrarmastudio.rfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.Block;

import com.lyrarmastudio.rfactory.block.SolarPanelBlock;
import com.lyrarmastudio.rfactory.block.SmallBatteryBlock;
import com.lyrarmastudio.rfactory.block.RedstonetechblockBlock;
import com.lyrarmastudio.rfactory.block.RedstoneIronBlockBlock;
import com.lyrarmastudio.rfactory.block.OilBlock;
import com.lyrarmastudio.rfactory.block.ChemicalplantBlock;
import com.lyrarmastudio.rfactory.RfactoryMod;

public class RfactoryModBlocks {
	public static final DeferredRegister<Block> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, RfactoryMod.MODID);
	public static final RegistryObject<Block> REDSTONETECHBLOCK = REGISTRY.register("redstonetechblock", () -> new RedstonetechblockBlock());
	public static final RegistryObject<Block> CHEMICALPLANT = REGISTRY.register("chemicalplant", () -> new ChemicalplantBlock());
	public static final RegistryObject<Block> OIL = REGISTRY.register("oil", () -> new OilBlock());
	public static final RegistryObject<Block> REDSTONE_IRON_BLOCK = REGISTRY.register("redstone_iron_block", () -> new RedstoneIronBlockBlock());
	public static final RegistryObject<Block> SOLAR_PANEL = REGISTRY.register("solar_panel", () -> new SolarPanelBlock());
	public static final RegistryObject<Block> SMALL_BATTERY = REGISTRY.register("small_battery", () -> new SmallBatteryBlock());
}
