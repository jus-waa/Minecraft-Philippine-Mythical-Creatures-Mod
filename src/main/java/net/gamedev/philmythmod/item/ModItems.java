package net.gamedev.philmythmod.item;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, PhilippineMythMod.MOD_ID);
    // dropped by tikbalang
    public static final RegistryObject<Item> TOTEM_OF_CONFUSION = ITEMS.register("totem_of_confusion",
            () -> new Item(new Item.Properties().stacksTo(1).rarity(Rarity.UNCOMMON)));
    // dropped by manananggal used for potion
    public static final RegistryObject<Item> WINGED_HEART = ITEMS.register("winged_heart",
            () -> new Item(new Item.Properties()));
    // dropped by aswang used for potion
    public static final RegistryObject<Item> CURSED_FANG = ITEMS.register("cursed_fang",
            () -> new Item(new Item.Properties()));
    // traded from diwata (gives buff)
    public static final RegistryObject<Item> FLOODGEM_HEART = ITEMS.register("floodgem_heart",
            () -> new Item(new Item.Properties()));
    // dropped by nuno sa punso traded to diwata
    public static final RegistryObject<Item> ANITO_STONE = ITEMS.register("anito_stone",
            () -> new Item(new Item.Properties()));
    //  decided yet (potentially dropped by bakunawa for final weapon)
    public static final RegistryObject<Item> MOONCORE_SCALE = ITEMS.register("mooncore_scale",
            () -> new Item(new Item.Properties()));

    // reminder:
    // haliyas' sword, shield, sarimanok spawn egg, and (all other spawn eggs)
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
