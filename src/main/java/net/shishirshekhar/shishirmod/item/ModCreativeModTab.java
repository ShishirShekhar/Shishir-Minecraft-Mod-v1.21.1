package net.shishirshekhar.shishirmod.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;
import net.shishirshekhar.shishirmod.ShishirMod;
import net.shishirshekhar.shishirmod.block.ModBlocks; 

public class ModCreativeModTab {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister
            .create(Registries.CREATIVE_MODE_TAB, ShishirMod.MODID);

    public static final RegistryObject<CreativeModeTab> SHISHIRRITE_ITEMS_TABS = CREATIVE_MODE_TABS
            .register("shishirrite_items_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHISHIRRITE.get()))
                            .title(Component.translatable("creativetab.shishirmod.shishirrite_items"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.SHISHIRRITE.get());
                                output.accept(ModItems.RAW_SHISHIRRITE.get());
                            })
                            .build());

    public static final RegistryObject<CreativeModeTab> SHISHIRRITE_BLOCKS_TABS = CREATIVE_MODE_TABS
            .register("shishirrite_blocks_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SHISHIRRITE_BLOCK.get()))
                    .withTabsBefore(SHISHIRRITE_ITEMS_TABS.getId())
                            .title(Component.translatable("creativetab.shishirmod.shishirrite_blocks"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.SHISHIRRITE_BLOCK.get());
                                output.accept(ModBlocks.RAW_SHISHIRRITE_BLOCK.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
