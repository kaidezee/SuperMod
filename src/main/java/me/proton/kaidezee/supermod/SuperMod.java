package me.proton.kaidezee.supermod;

//import org.slf4j.Logger;

//import com.mojang.logging.LogUtils;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.ModContainer;
import net.neoforged.fml.common.Mod;

@Mod(SuperMod.MODID)
public class SuperMod
{
	public static final String MODID = "supermod";

//	private static final Logger LOGGER = LogUtils.getLogger();

	public SuperMod(IEventBus modEventBus, ModContainer modContainer)
	{
		ModItems.ITEMS.register(modEventBus);
		ModTabs.CREATIVE_TABS.register(modEventBus);
	}
}
