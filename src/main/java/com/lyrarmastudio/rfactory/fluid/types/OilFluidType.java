
package com.lyrarmastudio.rfactory.fluid.types;

import net.minecraftforge.fluids.FluidType;
import net.minecraftforge.common.SoundActions;
import net.minecraftforge.client.extensions.common.IClientFluidTypeExtensions;

import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.BlockAndTintGetter;
import net.minecraft.world.item.Rarity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.BiomeColors;

import java.util.function.Consumer;

public class OilFluidType extends FluidType {
	public OilFluidType() {
		super(FluidType.Properties.create().fallDistanceModifier(0F).canExtinguish(true).supportsBoating(true).canHydrate(true).motionScale(0.0028D).lightLevel(5).density(800).viscosity(2000).temperature(305).rarity(Rarity.UNCOMMON)
				.sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL).sound(SoundActions.BUCKET_EMPTY, SoundEvents.BUCKET_EMPTY).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@Override
	public void initializeClient(Consumer<IClientFluidTypeExtensions> consumer) {
		consumer.accept(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = new ResourceLocation("rfactory:blocks/oil_block"), FLOWING_TEXTURE = new ResourceLocation("rfactory:blocks/oil_block");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public int getTintColor() {
				return -6506636;
			}

			@Override
			public int getTintColor(FluidState state, BlockAndTintGetter world, BlockPos pos) {
				return BiomeColors.getAverageGrassColor(world, pos) | 0xFF000000;
			}
		});
	}
}
