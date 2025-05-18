package net.gamedev.philmythmod.util;

import net.gamedev.philmythmod.PhilippineMythMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> NEEDS_MOONCORE = tag("needs_mooncore");

    }
    private static TagKey<Block> tag(String name) {
        return BlockTags.create(new ResourceLocation(PhilippineMythMod.MOD_ID, name));
    }
}
