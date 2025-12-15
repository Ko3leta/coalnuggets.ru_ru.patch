package me.pajic.coalnuggets.platform.fabric;

//? fabric {

import me.pajic.coalnuggets.CoalNuggets;
import me.pajic.coalnuggets.platform.Platform;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.resource.ResourceManagerHelper;
import net.fabricmc.fabric.api.resource.ResourcePackActivationType;
import net.fabricmc.loader.api.FabricLoader;

@SuppressWarnings("unused")
public class FabricClientEntrypoint implements ClientModInitializer {

	@Override
	public void onInitializeClient() {
		initConditionalClientResources();
	}

	private static void initConditionalClientResources() {
		FabricLoader.getInstance().getModContainer(CoalNuggets.MOD_ID).ifPresent(modContainer ->
				ResourceManagerHelper.registerBuiltinResourcePack(
						CoalNuggets.id(CoalNuggets.xplat().packPath(Platform.VersionedPackType.ASSETS)),
						modContainer,
						ResourcePackActivationType.ALWAYS_ENABLED
				)
		);
	}
}
//?}
