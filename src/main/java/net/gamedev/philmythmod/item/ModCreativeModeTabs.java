package net.gamedev.philmythmod.item;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.block.ModBlocks;
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
                        // item drops
                        pOutput.accept(ModItems.TOTEM_OF_CONFUSION.get());
                        pOutput.accept(ModItems.WINGED_HEART.get());
                        pOutput.accept(ModItems.CURSED_FANG.get());
                        pOutput.accept(ModItems.ANITO_STONE.get());
                        pOutput.accept(ModItems.FLOODGEM_HEART.get());
                        pOutput.accept(ModItems.MOONCORE_SCALE.get());
                        pOutput.accept(ModItems.CIGARETTE.get());

                        // spawn eggs
                        pOutput.accept(ModItems.BAKUNAWA_SPAWN_EGG.get());
                        pOutput.accept(ModItems.ASWANG_SPAWN_EGG.get());
                        pOutput.accept(ModItems.MANANANGGAL_SPAWN_EGG.get());
                        pOutput.accept(ModItems.KAPRE_SPAWN_EGG.get());
                        pOutput.accept(ModItems.MANGKUKULAM_SPAWN_EGG.get());
                        pOutput.accept(ModItems.BABAYLAN_SPAWN_EGG.get());
                        pOutput.accept(ModItems.BERBEROKA_SPAWN_EGG.get());
                        pOutput.accept(ModItems.DIWATA_SPAWN_EGG.get());
                        pOutput.accept(ModItems.NUNO_SPAWN_EGG.get());
                        pOutput.accept(ModItems.TIKBALANG_SPAWN_EGG.get());
                        pOutput.accept(ModItems.SARIMANOK_SPAWN_EGG.get());

                        // weapons
                        pOutput.accept(ModItems.KARAMBIT.get());
                        pOutput.accept(ModItems.ARNIS.get());
                        pOutput.accept(ModItems.BOLO.get());
                        pOutput.accept(ModItems.KRISS.get());
                        pOutput.accept(ModItems.SIBAT.get());
                        pOutput.accept(ModItems.KAMPILAN.get());
                        pOutput.accept(ModItems.KALASAG.get());

                        // func blocks
                        pOutput.accept(ModBlocks.INCENSE_TABLE_BLOCK.get());
                        pOutput.accept(ModBlocks.SKYMIRROR_KEYSTONE.get());

                    })
                    .build());
    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
