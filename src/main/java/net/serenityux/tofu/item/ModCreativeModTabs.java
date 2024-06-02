package net.serenityux.tofu.item;

import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraft.core.registries.Registries;
import net.minecraftforge.registries.RegistryObject;
import net.serenityux.tofu.Tofu;

public class ModCreativeModTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Tofu.MOD_ID);

    public static final RegistryObject<CreativeModeTab> TOFU_TAB = CREATIVE_MODE_TABS.register("tofu_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.SOYBEANS.get()))
                    .title(Component.translatable("creativetab.tofu_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.SOYBEANS.get());
                        pOutput.accept(ModItems.TOFU.get());
                        pOutput.accept(ModItems.COOKEDTOFU.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
