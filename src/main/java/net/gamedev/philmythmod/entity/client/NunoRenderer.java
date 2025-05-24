package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.boss.NunoEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class NunoRenderer extends MobRenderer<NunoEntity, NunoModel<NunoEntity>> {
    public NunoRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new NunoModel<>(pContext.bakeLayer(ModModelLayers.NUNO_LAYER)), 0.25f);
    }

    @Override
    public ResourceLocation getTextureLocation(NunoEntity entity) {
        return new ResourceLocation(PhilippineMythMod.MOD_ID, "textures/entity/mobs/nuno.png");
    }

    @Override
    public void render(NunoEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.pushPose();

        // Offset the model relative to the hitbox (e.g., shift it forward or upward)
        poseStack.translate(0.0D, 0.0D, 0.0D); // X, Y, Z offsets in blocks

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);

        poseStack.popPose();
    }

}
