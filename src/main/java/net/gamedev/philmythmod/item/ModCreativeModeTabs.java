package net.gamedev.philmythmod.item;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, PhilippineMythMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> PHILIPPINE_MYTHICAL_MOD_TAB = CREATIVE_MODE_TABS.register("philippine_mythical_mod",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.TOTEM_OF_CONFUSION.get()))
                    .title(Component.translatable("creativetab.philippine_mythical_mod_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.TOTEM_OF_CONFUSION.get());
                        pOutput.accept(ModItems.WINGED_HEART.get());
                        pOutput.accept(ModItems.CURSED_FANG.get());
                        pOutput.accept(ModItems.ANITO_STONE.get());
                        pOutput.accept(ModItems.FLOODGEM_HEART.get());
                        pOutput.accept(ModItems.MOONCORE_SCALE.get());
                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
