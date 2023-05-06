
/*
 *    MCreator note: This file will be REGENERATED on each build.
 */
package com.lyrarmastudio.rfactory.init;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.CreativeModeTab;

public class RfactoryModTabs {
	public static CreativeModeTab TAB_R_FACTORY;

	public static void load() {
		TAB_R_FACTORY = new CreativeModeTab("tabr_factory") {
			@Override
			public ItemStack makeIcon() {
				return new ItemStack(RfactoryModBlocks.REDSTONE_IRON_BLOCK.get());
			}

			@Override
			public boolean hasSearchBar() {
				return false;
			}
		};
	}
}
