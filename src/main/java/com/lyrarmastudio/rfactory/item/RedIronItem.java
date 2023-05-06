
package com.lyrarmastudio.rfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;

import com.lyrarmastudio.rfactory.init.RfactoryModTabs;

public class RedIronItem extends Item {
	public RedIronItem() {
		super(new Item.Properties().tab(RfactoryModTabs.TAB_R_FACTORY).stacksTo(64).rarity(Rarity.COMMON));
	}
}
