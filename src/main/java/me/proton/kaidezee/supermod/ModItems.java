package me.proton.kaidezee.supermod;

import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModItems {
        public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(SuperMod.MODID);

        public static final DeferredItem<Item> ORANGE = ITEMS.registerItem("orange", Item::new, new Item.Properties()
                        .stacksTo(16)
                        .fireResistant()
                        .food(ModFoods.ORANGE));

        public static final DeferredItem<BlockItem> CHECKERED_TILE_BLOCK = ITEMS
                        .registerSimpleBlockItem("checkered_tile_block", ModBlocks.CHECKERED_TILE_BLOCK);
}
