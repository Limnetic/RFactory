
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.lyrarmastudio.rfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;

import net.minecraft.world.level.block.entity.BlockEntityType;
import net.minecraft.world.level.block.Block;

import com.lyrarmastudio.rfactory.block.entity.SmallBatteryBlockEntity;
import com.lyrarmastudio.rfactory.block.entity.ChemicalplantBlockEntity;
import com.lyrarmastudio.rfactory.RfactoryMod;

public class RfactoryModBlockEntities {
	public static final DeferredRegister<BlockEntityType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCK_ENTITY_TYPES, RfactoryMod.MODID);
	public static final RegistryObject<BlockEntityType<?>> CHEMICALPLANT = register("chemicalplant", RfactoryModBlocks.CHEMICALPLANT, ChemicalplantBlockEntity::new);
	public static final RegistryObject<BlockEntityType<?>> SMALL_BATTERY = register("small_battery", RfactoryModBlocks.SMALL_BATTERY, SmallBatteryBlockEntity::new);

	private static RegistryObject<BlockEntityType<?>> register(String registryname, RegistryObject<Block> block, BlockEntityType.BlockEntitySupplier<?> supplier) {
		return REGISTRY.register(registryname, () -> BlockEntityType.Builder.of(supplier, block.get()).build(null));
	}
}
