
package com.lyrarmastudio.rfactory.block;

import net.minecraft.world.level.material.MaterialColor;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.LiquidBlock;

import com.lyrarmastudio.rfactory.init.RfactoryModFluids;

public class OilBlock extends LiquidBlock {
	public OilBlock() {
		super(() -> RfactoryModFluids.OIL.get(), BlockBehaviour.Properties.of(Material.WATER, MaterialColor.COLOR_BLACK).strength(100f).noCollission().noLootTable());
	}
}
