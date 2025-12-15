package me.pajic.coalnuggets;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class ModKeys {
	public static final ResourceKey<Item> COAL_NUGGET_KEY = ResourceKey.create(
			Registries.ITEM, CoalNuggets.id("coal_nugget")
	);
	public static final ResourceKey<Item> CHARCOAL_NUGGET_KEY = ResourceKey.create(
			Registries.ITEM, CoalNuggets.id("charcoal_nugget")
	);
	public static final TagKey<Item> COAL_NUGGETS = TagKey.create(
			Registries.ITEM, CoalNuggets.id("coal_nuggets")
	);
}
