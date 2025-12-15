package me.pajic.coalnuggets.platform.neoforge;

//? neoforge {

/*import me.pajic.coalnuggets.CoalNuggets;
import me.pajic.coalnuggets.platform.Platform;
import net.minecraft.network.chat.Component;
import net.minecraft.server.packs.PackType;
import net.minecraft.server.packs.repository.Pack;
import net.minecraft.server.packs.repository.PackSource;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.AddPackFindersEvent;

@EventBusSubscriber(modid = CoalNuggets.MOD_ID, value = Dist.CLIENT)
public class NeoforgeClientEventSubscriber {

	@SubscribeEvent
	private static void initClientResources(AddPackFindersEvent event) {
		event.addPackFinders(
				CoalNuggets.id(CoalNuggets.xplat().packPath(Platform.VersionedPackType.ASSETS)),
				PackType.CLIENT_RESOURCES,
				Component.literal("Mod " + CoalNuggets.xplat().mcVersion() + " Resource Pack"),
				PackSource.BUILT_IN,
				true,
				Pack.Position.TOP
		);
	}
}
*///?}
