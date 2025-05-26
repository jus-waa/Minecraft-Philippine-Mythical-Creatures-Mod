package net.gamedev.philmythmod.item;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.ModEntities;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
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
            () -> new TotemOfConfusion(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
                    .setNoRepair()
            )
    );
    // dropped by manananggal gives levitation
    public static final RegistryObject<Item> WINGED_HEART = ITEMS.register("winged_heart",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(-3)
                            .saturationMod(-5f)
                            .alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.LEVITATION, 50, 0), 1.0f) //1.0f = 100% chance
                            .build()
                    )
            )
    );
    // dropped by aswang used for potion
    public static final RegistryObject<Item> CURSED_FANG = ITEMS.register("cursed_fang",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(-3)
                            .saturationMod(-5f)
                            .alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.POISON, 50, 0), 1.0f) //1.0f = 100% chance
                            .build()
                    )
            )
    );
    // dropped from diwata (gives buff)
    public static final RegistryObject<Item> FLOODGEM_HEART = ITEMS.register("floodgem_heart",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(0)
                            .saturationMod(0)
                            .alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.HEAL, 200, 0), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 200, 0), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 200, 0), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.LUCK, 200, 0), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 200, 0), 1.0f)
                            .effect(() -> new MobEffectInstance(MobEffects.GLOWING, 200, 0), 1.0f)
                            .build()
                    )
            )
    );
    // dropped by nuno sa punso traded to diwata
    public static final RegistryObject<Item> ANITO_STONE = ITEMS.register("anito_stone",
            () -> new AnitoStone(new Item.Properties()
                    .stacksTo(1)
                    .rarity(Rarity.UNCOMMON)
                    .setNoRepair()
            )
    );
    //  decided yet (potentially dropped by bakunawa for final weapon)
    public static final RegistryObject<Item> MOONCORE_SCALE = ITEMS.register("mooncore_scale",
            () -> new Item(new Item.Properties()));
    public static final RegistryObject<Item> CIGARETTE = ITEMS.register("cigarette",
            () -> new Item(new Item.Properties()
                    .food(new FoodProperties.Builder()
                            .nutrition(-3)
                            .saturationMod(-5f)
                            .alwaysEat()
                            .effect(() -> new MobEffectInstance(MobEffects.HARM, 10, 0), 1.0f) //1.0f = 100% chance
                            .build()
                    )
            )
    );
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
    public static final RegistryObject<Item> BABAYLAN_SPAWN_EGG = ITEMS.register("babaylan_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BABAYLAN, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> BERBEROKA_SPAWN_EGG = ITEMS.register("berberoka_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.BERBEROKA, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> DIWATA_SPAWN_EGG = ITEMS.register("diwata_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.DIWATA, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> NUNO_SPAWN_EGG = ITEMS.register("nuno_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.NUNO, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> TIKBALANG_SPAWN_EGG = ITEMS.register("tikbalang_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.TIKBALANG, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    public static final RegistryObject<Item> SARIMANOK_SPAWN_EGG = ITEMS.register("sarimanok_spawn_egg",
            () -> new ForgeSpawnEggItem(ModEntities.SARIMANOK, 0x7e9680, 0xc5d1c5,
                    new Item.Properties()));
    // mooncore weapons
    public static final RegistryObject<Item> KARAMBIT = ITEMS.register("karambit",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 2, -1F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> SIBAT = ITEMS.register("sibat",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 7, -3.4F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> KRISS = ITEMS.register("kriss",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 6, -2.4F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> ARNIS = ITEMS.register("arnis",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 5, -2.8F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> BOLO = ITEMS.register("bolo",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 6, -3F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> KAMPILAN = ITEMS.register("kampilan",
            () -> new SwordItem(ModToolTiers.MOONCORE_SCALE, 6, -2.4F, new Item.Properties().fireResistant().setNoRepair()));
    public static final RegistryObject<Item> KALASAG = ITEMS.register("kalasag",
            () -> new ShieldItem(new Item.Properties().durability(1008).fireResistant().setNoRepair()));
    // reminder:
    // haliyas/' sword, shield, sarimanok spawn egg, and (all other spawn eggs)
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
