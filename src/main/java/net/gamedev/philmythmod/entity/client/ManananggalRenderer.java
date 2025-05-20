package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.gamedev.philmythmod.PhilippineMythMod;
import net.gamedev.philmythmod.entity.boss.ManananggalEntity;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class ManananggalRenderer extends MobRenderer<ManananggalEntity, ManananggalModel<ManananggalEntity>> {
    public ManananggalRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new ManananggalModel<>(pContext.bakeLayer(ModModelLayers.MANANANGGAL_LAYER)), 1f);
    }

    @Override
    public ResourceLocation getTextureLocation(ManananggalEntity entity) {
        return new ResourceLocation(PhilippineMythMod.MOD_ID, "textures/entity/mobs/manananggal.png");
    }

    @Override
    public void render(ManananggalEntity entity, float entityYaw, float partialTicks, PoseStack poseStack, MultiBufferSource buffer, int packedLight) {
        poseStack.pushPose();

        // Offset the model relative to the hitbox (e.g., shift it forward or upward)
        poseStack.translate(0.0D, 0.0D, 0.0D); // X, Y, Z offsets in blocks

        super.render(entity, entityYaw, partialTicks, poseStack, buffer, packedLight);

        poseStack.popPose();
    }

}
