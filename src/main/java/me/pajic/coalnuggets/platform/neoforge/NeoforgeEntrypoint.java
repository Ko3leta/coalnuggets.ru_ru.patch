package me.pajic.coalnuggets.platform.neoforge;

//? neoforge {

/*import me.pajic.coalnuggets.CoalNuggets;
import me.pajic.coalnuggets.ModItems;
import me.pajic.coalnuggets.ModKeys;
import me.pajic.coalnuggets.platform.Platform;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.AddPackFindersEvent;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import net.neoforged.neoforge.registries.RegisterEvent;

@Mod(CoalNuggets.MOD_ID)
@EventBusSubscriber(modid = CoalNuggets.MOD_ID)
public class NeoforgeEntrypoint {

	@SubscribeEvent
	private static void initCommonResources(AddPackFindersEvent event) {
		event.addPackFinders(
				CoalNuggets.id(CoalNuggets.xplat().packPath(Platform.VersionedPackType.DATA)),
				PackType.SERVER_DATA,
				Component.literal("Mod " + CoalNuggets.xplat().mcVersion() + " Data Pack"),
				PackSource.BUILT_IN,
				true,
				Pack.Position.TOP
		);
	}

	@SubscribeEvent
	private static void initItemRegistry(RegisterEvent event) {
		event.register(
				Registries.ITEM,
				registry -> {
					registry.register(ModKeys.COAL_NUGGET_KEY, ModItems.COAL_NUGGET);
					registry.register(ModKeys.CHARCOAL_NUGGET_KEY, ModItems.CHARCOAL_NUGGET);
				}
		);
	}

	@SubscribeEvent
	private static void initCreativeTabs(BuildCreativeModeTabContentsEvent event) {
		if (event.getTabKey() == CreativeModeTabs.INGREDIENTS) {
			event.insertAfter(Items.COAL.getDefaultInstance(), ModItems.COAL_NUGGET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
			event.insertAfter(Items.CHARCOAL.getDefaultInstance(), ModItems.CHARCOAL_NUGGET.getDefaultInstance(), CreativeModeTab.TabVisibility.PARENT_AND_SEARCH_TABS);
		}
	}
}
*///?}
