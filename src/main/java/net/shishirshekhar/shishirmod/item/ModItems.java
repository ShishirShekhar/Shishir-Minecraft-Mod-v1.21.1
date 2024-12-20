package net.shishirshekhar.shishirmod.item;

import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.shishirshekhar.shishirmod.ShishirMod;

public class ModItems {
        // Create a Deferred Register to hold Items which will all be registered under
        // the "shishirmod" namespace
        public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,
                        ShishirMod.MODID);

        public static final RegistryObject<Item> SHISHIRMITE = ITEMS.register("shishirmite",
                        () -> new Item(new Item.Properties()));

        public static final RegistryObject<Item> RAW_SHISHIRMITE = ITEMS.register("raw_shishirmite",
                        () -> new Item(new Item.Properties()));

        public static void register(IEventBus eventBus) {
                ITEMS.register(eventBus);
        }
}
