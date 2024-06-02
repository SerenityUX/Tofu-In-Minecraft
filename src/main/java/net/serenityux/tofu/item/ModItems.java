package net.serenityux.tofu.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.serenityux.tofu.Tofu;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, Tofu.MOD_ID);

    public static final RegistryObject<Item> SOYBEANS = ITEMS.register("soybeans",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> TOFU = ITEMS.register("tofu",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> COOKEDTOFU = ITEMS.register("cookedtofu",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
