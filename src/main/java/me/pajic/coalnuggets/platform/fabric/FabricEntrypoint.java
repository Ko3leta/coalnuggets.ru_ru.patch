package me.pajic.coalnuggets.platform.fabric;

//? fabric {

import me.pajic.coalnuggets.CoalNuggets;
import me.pajic.coalnuggets.ModItems;
import me.pajic.coalnuggets.ModKeys;
import me.pajic.coalnuggets.platform.Platform;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
//? if <= 1.21.1
/*import net.fabricmc.fabric.api.registry.FuelRegistry;*/
//? if > 1.21.1
import net.fabricmc.fabric.api.registry.FuelRegistryEvents;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Items;

@SuppressWarnings("unused")
public class FabricEntrypoint implements ModInitializer {

	@Override
	public void onInitialize() {
		initConditionalCommonResources();
		initItemRegistry();
		initFuelRegistry();
		initCreativeTabs();
	}

	private static void initConditionalCommonResources() {
		FabricLoader.getInstance().getModContainer(CoalNuggets.MOD_ID).ifPresent(modContainer ->
				ResourceManagerHelper.registerBuiltinResourcePack(
						CoalNuggets.id(CoalNuggets.xplat().packPath(Platform.VersionedPackType.DATA)),
						modContainer,
						ResourcePackActivationType.ALWAYS_ENABLED
				)
		);
	}

	private static void initItemRegistry() {
		Registry.register(
				BuiltInRegistries.ITEM,
				ModKeys.COAL_NUGGET_KEY.identifier(),
				ModItems.COAL_NUGGET
		);
		Registry.register(
				BuiltInRegistries.ITEM,
				ModKeys.CHARCOAL_NUGGET_KEY.identifier(),
				ModItems.CHARCOAL_NUGGET
		);
	}

	private static void initFuelRegistry() {
		//? if <= 1.21.1 {
        /*FuelRegistry.INSTANCE.add(ModItems.COAL_NUGGET, 200);
        FuelRegistry.INSTANCE.add(ModItems.CHARCOAL_NUGGET, 200);
        *///?} else {
		FuelRegistryEvents.BUILD.register((builder, context) -> {
			builder.add(ModItems.COAL_NUGGET, 200);
			builder.add(ModItems.CHARCOAL_NUGGET, 200);
		});
		//?}
	}

	private static void initCreativeTabs() {
		ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
			entries.addAfter(Items.COAL, ModItems.COAL_NUGGET);
			entries.addAfter(Items.CHARCOAL, ModItems.CHARCOAL_NUGGET);
		});
	}
}
//?}
