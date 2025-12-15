package me.pajic.coalnuggets;

import me.pajic.coalnuggets.platform.Platform;
import net.minecraft.resources.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//? fabric {
import me.pajic.coalnuggets.platform.fabric.FabricPlatform;
//?} neoforge {
/*import me.pajic.coalnuggets.platform.neoforge.NeoforgePlatform;
*///?}

@SuppressWarnings("LoggingSimilarMessage")
public class CoalNuggets {

	public static final String MOD_ID = /*$ mod_id*/ "coalnuggets";
	public static final String MOD_VERSION = /*$ mod_version*/ "1.0.3";
	public static final String MOD_FRIENDLY_NAME = /*$ mod_name*/ "Coal Nuggets";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
	private static final Platform PLATFORM = createPlatformInstance();

	public static Platform xplat() {
		return PLATFORM;
	}

	private static Platform createPlatformInstance() {
		//? fabric {
		return new FabricPlatform();
		//?} neoforge {
		/*return new NeoforgePlatform();
		*///?}
	}

	public static Identifier id(String path) {
		return Identifier.fromNamespaceAndPath(MOD_ID, path);
	}

	public static void debugLog(String message, Object ... args) {
		if (PLATFORM.isDebug()) LOGGER.info(message, args);
	}
}
