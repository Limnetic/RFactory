
package com.lyrarmastudio.rfactory.item;

import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.Item;
import net.minecraft.world.InteractionResult;

import com.lyrarmastudio.rfactory.procedures.EnergyMetrRightclickedOnBlockProcedure;
import com.lyrarmastudio.rfactory.init.RfactoryModTabs;

public class EnergyMetrItem extends Item {
	public EnergyMetrItem() {
		super(new Item.Properties().tab(RfactoryModTabs.TAB_R_FACTORY).stacksTo(1).rarity(Rarity.COMMON));
	}

	@Override
	public InteractionResult useOn(UseOnContext context) {
		super.useOn(context);
		EnergyMetrRightclickedOnBlockProcedure.execute(context.getLevel(), context.getClickedPos().getX(), context.getClickedPos().getY(), context.getClickedPos().getZ(), context.getClickedFace(), context.getPlayer());
		return InteractionResult.SUCCESS;
	}
}
