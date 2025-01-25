package me.proton.kaidezee.supermod;

import static me.proton.kaidezee.supermod.SuperMod.MODID;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModTabs {
        public static final DeferredRegister<CreativeModeTab> CREATIVE_TABS = DeferredRegister
                        .create(Registries.CREATIVE_MODE_TAB, MODID);

        public static final DeferredHolder<CreativeModeTab, CreativeModeTab> COOL_STUFF = CREATIVE_TABS
                        .register("stuff", () -> CreativeModeTab.builder()
                                        .title(Component.translatable("ItemGroup.supermod"))
                                        .withTabsBefore(CreativeModeTabs.COMBAT)
                                        .icon(() -> ModItems.ORANGE.get().getDefaultInstance())
                                        .displayItems((parameters, output) -> {
                                                output.accept(ModItems.ORANGE.get());
                                                output.accept(ModItems.CHECKERED_TILE_BLOCK.get());
                                        }).build());
}
