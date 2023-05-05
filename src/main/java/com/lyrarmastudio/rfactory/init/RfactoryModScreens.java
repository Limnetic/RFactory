
/*
 *	MCreator note: This file will be REGENERATED on each build.
 */
package com.lyrarmastudio.rfactory.init;

import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.api.distmarker.Dist;

import net.minecraft.client.gui.screens.MenuScreens;

import com.lyrarmastudio.rfactory.client.gui.HimicalguiScreen;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
public class RfactoryModScreens {
	@SubscribeEvent
	public static void clientLoad(FMLClientSetupEvent event) {
		event.enqueueWork(() -> {
			MenuScreens.register(RfactoryModMenus.HIMICALGUI.get(), HimicalguiScreen::new);
		});
	}
}
