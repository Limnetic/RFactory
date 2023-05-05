
package com.lyrarmastudio.rfactory.fluid;

import net.minecraftforge.fluids.ForgeFlowingFluid;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.LiquidBlock;

import com.lyrarmastudio.rfactory.init.RfactoryModItems;
import com.lyrarmastudio.rfactory.init.RfactoryModFluids;
import com.lyrarmastudio.rfactory.init.RfactoryModFluidTypes;
import com.lyrarmastudio.rfactory.init.RfactoryModBlocks;

public abstract class OilFluid extends ForgeFlowingFluid {
	public static final ForgeFlowingFluid.Properties PROPERTIES = new ForgeFlowingFluid.Properties(() -> RfactoryModFluidTypes.OIL_TYPE.get(), () -> RfactoryModFluids.OIL.get(), () -> RfactoryModFluids.FLOWING_OIL.get()).explosionResistance(100f)
			.tickRate(20).slopeFindDistance(2).bucket(() -> RfactoryModItems.OIL_BUCKET.get()).block(() -> (LiquidBlock) RfactoryModBlocks.OIL.get());

	private OilFluid() {
		super(PROPERTIES);
	}

	public static class Source extends OilFluid {
		public int getAmount(FluidState state) {
			return 8;
		}

		public boolean isSource(FluidState state) {
			return true;
		}
	}

	public static class Flowing extends OilFluid {
		protected void createFluidStateDefinition(StateDefinition.Builder<Fluid, FluidState> builder) {
			super.createFluidStateDefinition(builder);
			builder.add(LEVEL);
		}

		public int getAmount(FluidState state) {
			return state.getValue(LEVEL);
		}

		public boolean isSource(FluidState state) {
			return false;
		}
	}
}
