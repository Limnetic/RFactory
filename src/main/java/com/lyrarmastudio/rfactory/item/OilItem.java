
package com.lyrarmastudio.rfactory.item;

import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.BucketItem;

import com.lyrarmastudio.rfactory.init.RfactoryModFluids;

public class OilItem extends BucketItem {
	public OilItem() {
		super(RfactoryModFluids.OIL, new Item.Properties().craftRemainder(Items.BUCKET).stacksTo(1).rarity(Rarity.UNCOMMON).tab(CreativeModeTab.TAB_MISC));
	}
}
