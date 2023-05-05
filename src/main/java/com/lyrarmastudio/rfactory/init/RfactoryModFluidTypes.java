
/*
 * MCreator note: This file will be REGENERATED on each build.
 */
package com.lyrarmastudio.rfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.fluids.FluidType;

import com.lyrarmastudio.rfactory.fluid.types.OilFluidType;
import com.lyrarmastudio.rfactory.RfactoryMod;

public class RfactoryModFluidTypes {
	public static final DeferredRegister<FluidType> REGISTRY = DeferredRegister.create(ForgeRegistries.Keys.FLUID_TYPES, RfactoryMod.MODID);
	public static final RegistryObject<FluidType> OIL_TYPE = REGISTRY.register("oil", () -> new OilFluidType());
}
