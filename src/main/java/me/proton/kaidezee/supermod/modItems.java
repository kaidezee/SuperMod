package me.proton.kaidezee.supermod.items

import me.proton.kaidezee.supermod.SuperMod
import net.minecraft.world.item.Item
import net.neoforged.neoforge.registries.DefferedItem
import net.neoforged.neoforge.registries.DefferedRegister

public static final DefferedRegister.Items ITEMS = DefferedRegister.createItems(SuperMod.MODID);

public static final DefferedItem<Item> ORANGE = ITEMS.register("orange", () -> new Item(new Item.properties()
	.stacksTo(60)
	.fireResistant()
	));
