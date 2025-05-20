package net.gamedev.philmythmod.item;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.ModEntities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Rarity;
import net.minecraft.world.item.ShieldItem;
import net.minecraft.world.item.SwordItem;
import net.minecraftforge.common.ForgeSpawnEggItem;
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
    // mob spawn eggs
    public static final RegistryObject<Item> BAKUNAWA_SPAWN_EGG = ITEMS.register("bakunawa_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BAKUNAWA, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> ASWANG_SPAWN_EGG = ITEMS.register("aswang_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.ASWANG, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> MANANANGGAL_SPAWN_EGG = ITEMS.register("manananggal_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MANANANGGAL, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> KAPRE_SPAWN_EGG = ITEMS.register("kapre_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.KAPRE, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> MANGKUKULAM_SPAWN_EGG = ITEMS.register("mangkukulam_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.MANGKUKULAM, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    // mooncore weapons
    public static final RegistryObject<Item> KARAMBIT = ITEMS.register("karambit",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 1, -1F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> SIBAT = ITEMS.register("sibat",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 5, -3.4F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> KRISS = ITEMS.register("kriss",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 4, -2.4F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> ARNIS = ITEMS.register("arnis",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 3, -2.8F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> BOLO = ITEMS.register("bolo",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 4, -3F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> KALASAG = ITEMS.register("kalasag",
            () -> new ShieldItem(new Item.Properties().durability(1008).fireResistant().setNoRepair()));
    // reminder:
    // haliyas/' sword, shield, sarimanok spawn egg, and (all other spawn eggs)
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
