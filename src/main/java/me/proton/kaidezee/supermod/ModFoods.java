package me.proton.kaidezee.supermod;

import net.minecraft.world.food.FoodProperties;

public class ModFoods
{
	public static final FoodProperties ORANGE = new FoodProperties.Builder()
		.nutrition(4)
		.saturationModifier(0.3f)
		.alwaysEdible()
		.build();
}
