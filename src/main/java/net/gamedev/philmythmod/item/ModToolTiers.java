package net.gamedev.philmythmod.item;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier MOONCORE_SCALE = TierSortingRegistry.registerTier(
            new ForgeTier(5, 2031, 5f, 4f, 25,
                    ModTags.Blocks.NEEDS_MOONCORE, () ->  Ingredient.of(ModItems.MOONCORE_SCALE.get())),
            new ResourceLocation(PhilippineMythMod.MOD_ID, "mooncore_scale"), List.of(Tiers.NETHERITE), List.of());
}
