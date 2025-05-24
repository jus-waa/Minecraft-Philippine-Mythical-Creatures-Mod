package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.boss.BabaylanEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BabaylanRenderer extends MobRenderer<BabaylanEntity, BabaylanModel<BabaylanEntity>> {
    public BabaylanRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BabaylanModel<>(pContext.bakeLayer(ModModelLayers.BABAYLAN_LAYER)), 0.5f);
    }

    @Override
    public ResourceLocation getTextureLocation(BabaylanEntity entity) {
        return new ResourceLocation(PhilippineMythMod.MOD_ID, "textures/entity/mobs/babaylan.png");
    }

    @Override
    public void render(BabaylanEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.pushPose();

        // Offset the model relative to the hitbox (e.g., shift it forward or upward)
        poseStack.translate(0.0D, 0.0D, 0.0D); // X, Y, Z offsets in blocks

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);

        poseStack.popPose();
    }

}
