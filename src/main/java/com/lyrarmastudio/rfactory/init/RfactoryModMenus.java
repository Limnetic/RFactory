
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.lyrarmastudio.rfactory.init;

import net.minecraftforge.registries.RegistryObject;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.common.extensions.IForgeMenuType;

import net.minecraft.world.inventory.MenuType;

import com.lyrarmastudio.rfactory.world.inventory.HimicalguiMenu;
import com.lyrarmastudio.rfactory.RfactoryMod;

public class RfactoryModMenus {
	public static final DeferredRegister<MenuType<?>> REGISTRY = DeferredRegister.create(ForgeRegistries.MENU_TYPES, RfactoryMod.MODID);
	public static final RegistryObject<MenuType<HimicalguiMenu>> HIMICALGUI = REGISTRY.register("himicalgui", () -> IForgeMenuType.create(HimicalguiMenu::new));
}
