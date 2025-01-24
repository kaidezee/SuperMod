package me.proton.kaidezee.supermod;

import me.proton.kaidezee.supermod.SuperMod;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems
{
	public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperMod.MODID);
	
	public static final DeferredItem<Item> ORANGE = ITEMS.registerItem("orange", Item::new, new Item.Properties()
	.stacksTo(16)
	.fireResistant()
	);
}
