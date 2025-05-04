package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.boss.BakunawaBoss;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BakunawaRenderer extends MobRenderer<BakunawaBoss, Bakunawa<BakunawaBoss>> {
    public BakunawaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new Bakunawa<>(pContext.bakeLayer(ModModelLayers.BAKUNAWA_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(BakunawaBoss entity) {
        return new ResourceLocation(PhilippineMythMod.MOD_ID, "textures/entity/boss/bakunawa.png");
    }

    @Override
    public void render(BakunawaBoss entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.pushPose();

        // Offset the model relative to the hitbox (e.g., shift it forward or upward)
        poseStack.translate(0.0D, 0.0D, 33.5D); // X, Y, Z offsets in blocks

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);

        poseStack.popPose();
    }

}
