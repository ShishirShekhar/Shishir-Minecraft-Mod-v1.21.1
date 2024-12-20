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

    public static final RegistryObject<CreativeModeTab> SHISHIRMITE_ITEMS_TABS = CREATIVE_MODE_TABS
            .register("shishirmite_items_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.SHISHIRMITE.get()))
                            .title(Component.translatable("creativetab.shishirmod.shishirmite_items"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModItems.SHISHIRMITE.get());
                                output.accept(ModItems.RAW_SHISHIRMITE.get());
                            })
                            .build());

    public static final RegistryObject<CreativeModeTab> SHISHIRMITE_BLOCKS_TABS = CREATIVE_MODE_TABS
            .register("shishirmite_blocks_tab",
                    () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.SHISHIRMITE_BLOCK.get()))
                    .withTabsBefore(SHISHIRMITE_ITEMS_TABS.getId())
                            .title(Component.translatable("creativetab.shishirmod.shishirmite_blocks"))
                            .displayItems((itemDisplayParameters, output) -> {
                                output.accept(ModBlocks.SHISHIRMITE_BLOCK.get());
                                output.accept(ModBlocks.RAW_SHISHIRMITE_BLOCK.get());
                                output.accept(ModBlocks.SHISHIRMITE_ORE.get());
                                output.accept(ModBlocks.SHISHIRMITE_DEEPSLATE_ORE.get());
                            })
                            .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
