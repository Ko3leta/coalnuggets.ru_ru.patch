package me.pajic.coalnuggets;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
//? if <= 1.21.1
import net.fabricmc.fabric.api.registry.FuelRegistry;
//? if > 1.21.1
/*import net.fabricmc.fabric.api.registry.FuelRegistryEvents;*/

public class Main implements ModInitializer {
    private static final String MOD_ID = "coalnuggets";
    private static final ResourceKey<Item> COAL_NUGGET_KEY = ResourceKey.create(
            Registries.ITEM, withModNamespace("coal_nugget")
    );
    private static final ResourceKey<Item> CHARCOAL_NUGGET_KEY = ResourceKey.create(
            Registries.ITEM, withModNamespace("charcoal_nugget")
    );
    public static final TagKey<Item> COAL_NUGGETS = TagKey.create(
            Registries.ITEM, withModNamespace("coal_nuggets")
    );

    public static final Item COAL_NUGGET = Registry.register(
            BuiltInRegistries.ITEM,
            COAL_NUGGET_KEY.location(),
            new Item(
                    new Item.Properties()
                    //? if > 1.21.1
                    /*.setId(COAL_NUGGET_KEY)*/
            )
    );
    public static final Item CHARCOAL_NUGGET = Registry.register(
            BuiltInRegistries.ITEM,
            CHARCOAL_NUGGET_KEY.location(),
            new Item(
                    new Item.Properties()
                    //? if > 1.21.1
                    /*.setId(CHARCOAL_NUGGET_KEY)*/
            )
    );

    @Override
    public void onInitialize() {
        //? if <= 1.21.1 {
        FuelRegistry.INSTANCE.add(COAL_NUGGET, 200);
        FuelRegistry.INSTANCE.add(CHARCOAL_NUGGET, 200);
        //?} else {
        /*FuelRegistryEvents.BUILD.register((builder, context) -> {
            builder.add(COAL_NUGGET, 200);
            builder.add(CHARCOAL_NUGGET, 200);
        });
        *///?}
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.INGREDIENTS).register(entries -> {
            entries.addAfter(Items.COAL, COAL_NUGGET);
            entries.addAfter(Items.CHARCOAL, CHARCOAL_NUGGET);
        });
    }

    public static ResourceLocation withModNamespace(String path) {
        return ResourceLocation.fromNamespaceAndPath(MOD_ID, path);
    }
}
