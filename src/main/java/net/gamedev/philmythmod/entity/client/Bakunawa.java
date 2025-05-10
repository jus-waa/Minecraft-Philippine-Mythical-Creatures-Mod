package net.gamedev.philmythmod.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.gamedev.philmythmod.entity.animations.BakunawaAnimations;
import net.gamedev.philmythmod.entity.boss.BakunawaBoss;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.util.Mth;
import net.minecraft.world.entity.Entity;

public class Bakunawa<T extends Entity> extends HierarchicalModel<T>  {

	private final ModelPart bakunawa;
	private ModelPart head;
	private final ModelPart h_head;
	private final ModelPart maincheeks;
	private final ModelPart beak_like;
	private final ModelPart teeth;
	private final ModelPart teeth2;
	private final ModelPart tentupperface;
	private final ModelPart tentupperface2;
	private final ModelPart horn;
	private final ModelPart h_jaw;
	private final ModelPart tent;
	private final ModelPart teethjaw;
	private final ModelPart teethjaw2;
	private final ModelPart body;
	private final ModelPart spine0;
	private final ModelPart spine1;
	private final ModelPart spine2;
	private final ModelPart spine3;
	private final ModelPart spine4;
	private final ModelPart spine5;
	private final ModelPart spine6;
	private final ModelPart spine7;
	private final ModelPart spine8;
	private final ModelPart spine9;
	private final ModelPart spine10;
	private final ModelPart spine11;
	private final ModelPart spine12;
	private final ModelPart main_tail;
	private final ModelPart hitbox;

	public Bakunawa(ModelPart root) {
		this.bakunawa = root.getChild("bakunawa");
		this.head = this.bakunawa.getChild("head");
		this.h_head = this.head.getChild("h_head");
		this.maincheeks = this.h_head.getChild("maincheeks");
		this.beak_like = this.h_head.getChild("beak_like");
		this.teeth = this.h_head.getChild("teeth");
		this.teeth2 = this.h_head.getChild("teeth2");
		this.tentupperface = this.h_head.getChild("tentupperface");
		this.tentupperface2 = this.h_head.getChild("tentupperface2");
		this.horn = this.h_head.getChild("horn");
		this.h_jaw = this.head.getChild("h_jaw");
		this.tent = this.h_jaw.getChild("tent");
		this.teethjaw = this.h_jaw.getChild("teethjaw");
		this.teethjaw2 = this.h_jaw.getChild("teethjaw2");
		this.body = this.bakunawa.getChild("body");
		this.spine0 = this.body.getChild("spine0");
		this.spine1 = this.body.getChild("spine1");
		this.spine2 = this.body.getChild("spine2");
		this.spine3 = this.body.getChild("spine3");
		this.spine4 = this.body.getChild("spine4");
		this.spine5 = this.body.getChild("spine5");
		this.spine6 = this.body.getChild("spine6");
		this.spine7 = this.body.getChild("spine7");
		this.spine8 = this.body.getChild("spine8");
		this.spine9 = this.body.getChild("spine9");
		this.spine10 = this.body.getChild("spine10");
		this.spine11 = this.body.getChild("spine11");
		this.spine12 = this.body.getChild("spine12");
		this.main_tail = this.body.getChild("main_tail");
		this.hitbox = root.getChild("hitbox");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition bakunawa = partdefinition.addOrReplaceChild("bakunawa", CubeListBuilder.create(), PartPose.offset(0.0F, 4.0F, -591.0F));

		PartDefinition head = bakunawa.addOrReplaceChild("head", CubeListBuilder.create(), PartPose.offset(0.0F, -11.0456F, 6.6047F));

		PartDefinition h_head = head.addOrReplaceChild("h_head", CubeListBuilder.create().texOffs(1174, 1357).addBox(-9.3536F, 0.7857F, -91.4376F, 13.0F, 14.0F, 65.0F, new CubeDeformation(0.4F)), PartPose.offset(2.5053F, -6.6909F, 39.8818F));

		PartDefinition leftcheeksface_r1 = h_head.addOrReplaceChild("leftcheeksface_r1", CubeListBuilder.create().texOffs(489, 1588).mirror().addBox(-4.5654F, -9.4919F, -23.2833F, 9.0F, 20.0F, 50.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(-33.0791F, 7.8677F, 4.591F, 0.1332F, -0.2608F, -0.0117F));

		PartDefinition leftcheeksface_r2 = h_head.addOrReplaceChild("leftcheeksface_r2", CubeListBuilder.create().texOffs(160, 1368).mirror().addBox(-6.4399F, -16.7758F, -27.2884F, 12.0F, 32.0F, 30.0F, new CubeDeformation(0.4F)).mirror(false)
		.texOffs(160, 1369).addBox(38.5875F, -16.7758F, -27.2884F, 12.0F, 32.0F, 30.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-25.3291F, 34.8677F, -4.909F, -1.6581F, 0.0F, 0.0F));

		PartDefinition leftcheeksface_r3 = h_head.addOrReplaceChild("leftcheeksface_r3", CubeListBuilder.create().texOffs(696, 1511).mirror().addBox(-5.6504F, -16.4447F, -24.7092F, 9.0F, 23.0F, 53.0F, new CubeDeformation(0.4F)).mirror(false), PartPose.offsetAndRotation(-33.0791F, 7.8677F, 4.591F, 0.3077F, -0.2608F, -0.0117F));

		PartDefinition cube_r1 = h_head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-35.8753F, 9.6609F, -41.0518F, -0.0154F, 0.1739F, -1.6594F));

		PartDefinition cube_r2 = h_head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(30.8647F, 9.6609F, -41.0518F, -0.0154F, -0.1739F, 1.6594F));

		PartDefinition hornleft_r1 = h_head.addOrReplaceChild("hornleft_r1", CubeListBuilder.create().texOffs(684, 1256).addBox(-5.5F, -9.5F, -17.5F, 10.0F, 14.0F, 22.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-2.5896F, -5.5093F, -67.1002F, 0.829F, 0.0F, 0.0F));

		PartDefinition cube_r3 = h_head.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 52.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(-2.1353F, -8.3391F, -71.5518F, 0.6981F, 0.0F, 0.0F));

		PartDefinition cube_r4 = h_head.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(-2.1353F, -56.8391F, -26.0518F, 0.3491F, 0.0F, 0.0F));

		PartDefinition nose_r1 = h_head.addOrReplaceChild("nose_r1", CubeListBuilder.create().texOffs(1360, 343).addBox(0.0F, -4.0F, -1.0F, 0.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1586F, -18.1317F, -90.1628F, -0.2618F, 0.0F, 0.0F));

		PartDefinition nose_r2 = h_head.addOrReplaceChild("nose_r2", CubeListBuilder.create().texOffs(1360, 345).addBox(0.0F, -4.0F, -1.0F, 0.0F, 12.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1586F, -14.1317F, -91.9128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition nose_r3 = h_head.addOrReplaceChild("nose_r3", CubeListBuilder.create().texOffs(1361, 343).addBox(0.0F, -4.0F, -1.0F, 0.0F, 14.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1586F, -11.1317F, -93.9128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition nose_r4 = h_head.addOrReplaceChild("nose_r4", CubeListBuilder.create().texOffs(1360, 343).addBox(0.0F, -4.0F, -1.0F, 0.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.1586F, -6.1317F, -96.9128F, -0.2618F, 0.0F, 0.0F));

		PartDefinition uppernose_r1 = h_head.addOrReplaceChild("uppernose_r1", CubeListBuilder.create().texOffs(824, 1573).addBox(-11.0F, -6.0F, -29.5F, 19.0F, 12.0F, 46.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-1.67F, 4.9423F, -65.7364F, 0.2182F, 0.0F, 0.0F));

		PartDefinition nosebridge_r1 = h_head.addOrReplaceChild("nosebridge_r1", CubeListBuilder.create().texOffs(1072, 1637).addBox(-8.5F, -4.5F, -10.5F, 17.0F, 9.0F, 21.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-16.0906F, -22.1865F, -17.8753F, 0.5051F, -0.5086F, -0.263F));

		PartDefinition leftcheeksface_r4 = h_head.addOrReplaceChild("leftcheeksface_r4", CubeListBuilder.create().texOffs(1250, 1591).addBox(-5.6504F, -16.4447F, -24.7092F, 9.0F, 9.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-32.0791F, 1.8677F, 4.591F, 0.2717F, -0.2982F, 0.1188F));

		PartDefinition leftcheeksface_r5 = h_head.addOrReplaceChild("leftcheeksface_r5", CubeListBuilder.create().texOffs(1330, 1386).addBox(-26.5F, -5.5F, -22.5F, 19.0F, 14.0F, 61.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-1.6036F, -16.7143F, -3.1876F, 0.3087F, -0.1664F, -0.0528F));

		PartDefinition leftcheeksface_r6 = h_head.addOrReplaceChild("leftcheeksface_r6", CubeListBuilder.create().texOffs(1600, 1076).addBox(-9.5F, -6.5F, -21.5F, 19.0F, 13.0F, 43.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-10.5156F, -5.1984F, -30.7077F, 0.3112F, -0.208F, -0.0663F));

		PartDefinition leftinnerbrow_r1 = h_head.addOrReplaceChild("leftinnerbrow_r1", CubeListBuilder.create().texOffs(1608, 704).addBox(-3.5F, -3.5F, -17.5F, 7.0F, 7.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-19.571F, -15.2163F, -32.3485F, 0.4997F, -0.2605F, -0.1341F));

		PartDefinition leftinnerbrow_r2 = h_head.addOrReplaceChild("leftinnerbrow_r2", CubeListBuilder.create().texOffs(1622, 1600).addBox(-3.795F, -2.205F, -10.12F, 7.0F, 7.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.0233F, -7.2887F, -50.295F, 0.4903F, -0.1837F, -0.0916F));

		PartDefinition rightinnerbrow_r1 = h_head.addOrReplaceChild("rightinnerbrow_r1", CubeListBuilder.create().texOffs(1608, 704).addBox(-3.5F, -3.5F, -17.5F, 7.0F, 7.0F, 40.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0604F, -15.2163F, -32.3485F, 0.4997F, 0.2605F, 0.1341F));

		PartDefinition rightinnerbrow_r2 = h_head.addOrReplaceChild("rightinnerbrow_r2", CubeListBuilder.create().texOffs(1622, 1600).addBox(-3.205F, -2.205F, -10.12F, 7.0F, 7.0F, 35.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.5127F, -7.2887F, -50.295F, 0.4903F, 0.1837F, 0.0916F));

		PartDefinition nosebridge_r2 = h_head.addOrReplaceChild("nosebridge_r2", CubeListBuilder.create().texOffs(1072, 1637).addBox(-8.5F, -4.5F, -10.5F, 17.0F, 9.0F, 21.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(9.58F, -21.9865F, -17.8753F, 0.5051F, 0.5086F, 0.263F));

		PartDefinition nosebridge_r3 = h_head.addOrReplaceChild("nosebridge_r3", CubeListBuilder.create().texOffs(438, 1362).addBox(-4.0F, 3.0F, -24.0F, 8.0F, 5.0F, 72.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(-3.17F, -15.6831F, -52.4347F, 0.4363F, 0.0F, 0.0F));

		PartDefinition nosebridge_r4 = h_head.addOrReplaceChild("nosebridge_r4", CubeListBuilder.create().texOffs(1184, 376).addBox(-19.0F, -1.0F, -24.0F, 29.0F, 9.0F, 73.0F, new CubeDeformation(0.1F)), PartPose.offsetAndRotation(1.08F, -9.6831F, -52.4347F, 0.4363F, 0.0F, 0.0F));

		PartDefinition leftcheeksface_r7 = h_head.addOrReplaceChild("leftcheeksface_r7", CubeListBuilder.create().texOffs(1546, 1531).addBox(-4.5F, -8.0F, -26.5F, 9.0F, 16.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-29.102F, 32.8586F, -2.9148F, -0.2159F, -0.2608F, -0.0117F));

		PartDefinition leftcheeksface_r8 = h_head.addOrReplaceChild("leftcheeksface_r8", CubeListBuilder.create().texOffs(1126, 1568).addBox(-4.5F, -8.0F, -26.5F, 9.0F, 16.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-31.602F, 19.8586F, 2.5852F, -0.085F, -0.2608F, -0.0117F));

		PartDefinition leftcheeksface_r9 = h_head.addOrReplaceChild("leftcheeksface_r9", CubeListBuilder.create().texOffs(136, 1568).addBox(-3.4399F, -2.7758F, -27.2884F, 9.0F, 16.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-34.5791F, 7.8677F, 5.591F, -0.0413F, -0.2608F, -0.0117F));

		PartDefinition leftcheeksface_r10 = h_head.addOrReplaceChild("leftcheeksface_r10", CubeListBuilder.create().texOffs(500, 1587).addBox(-4.5654F, -9.4919F, -23.2833F, 9.0F, 20.0F, 50.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-34.5791F, 7.8677F, 4.591F, 0.1332F, -0.2608F, -0.0117F));

		PartDefinition leftcheeksface_r11 = h_head.addOrReplaceChild("leftcheeksface_r11", CubeListBuilder.create().texOffs(700, 1511).addBox(-5.6504F, -16.4447F, -24.7092F, 9.0F, 23.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-34.5791F, 7.8677F, 4.591F, 0.3077F, -0.2608F, -0.0117F));

		PartDefinition rightcheeksface_r1 = h_head.addOrReplaceChild("rightcheeksface_r1", CubeListBuilder.create().texOffs(1546, 1531).addBox(-4.5F, -8.0F, -26.5F, 9.0F, 16.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(22.5915F, 32.8586F, -2.9148F, -0.2159F, 0.2608F, 0.0117F));

		PartDefinition rightcheeksface_r2 = h_head.addOrReplaceChild("rightcheeksface_r2", CubeListBuilder.create().texOffs(1534, 312).addBox(-4.5F, -8.0F, -26.5F, 9.0F, 16.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(25.0915F, 19.8586F, 2.5852F, -0.085F, 0.2608F, 0.0117F));

		PartDefinition rightcheeksface_r3 = h_head.addOrReplaceChild("rightcheeksface_r3", CubeListBuilder.create().texOffs(1422, 1531).addBox(-5.5601F, -2.7758F, -27.2884F, 9.0F, 16.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(28.0685F, 7.8677F, 5.591F, -0.0413F, 0.2608F, 0.0117F));

		PartDefinition rightcheeksface_r4 = h_head.addOrReplaceChild("rightcheeksface_r4", CubeListBuilder.create().texOffs(500, 1587).addBox(-4.4346F, -9.4919F, -23.2833F, 9.0F, 20.0F, 50.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(28.0685F, 7.8677F, 4.591F, 0.1332F, 0.2608F, 0.0117F));

		PartDefinition rightcheeksface_r5 = h_head.addOrReplaceChild("rightcheeksface_r5", CubeListBuilder.create().texOffs(618, 1587).addBox(-3.3496F, -16.4447F, -24.7092F, 9.0F, 9.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(25.5685F, 1.8677F, 4.591F, 0.2717F, 0.2982F, -0.1188F));

		PartDefinition rightcheeksface_r6 = h_head.addOrReplaceChild("rightcheeksface_r6", CubeListBuilder.create().texOffs(700, 1511).addBox(-3.3496F, -16.4447F, -24.7092F, 9.0F, 23.0F, 53.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(28.0685F, 7.8677F, 4.591F, 0.3077F, 0.2608F, 0.0117F));

		PartDefinition rightcheeksface_r7 = h_head.addOrReplaceChild("rightcheeksface_r7", CubeListBuilder.create().texOffs(1600, 1076).addBox(-9.5F, -6.5F, -21.5F, 19.0F, 13.0F, 43.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(4.005F, -5.1984F, -30.7077F, 0.3112F, 0.208F, 0.0663F));

		PartDefinition rightcheeksface_r8 = h_head.addOrReplaceChild("rightcheeksface_r8", CubeListBuilder.create().texOffs(0, 1368).addBox(7.5F, -5.5F, -22.5F, 19.0F, 14.0F, 61.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-4.9069F, -16.7143F, -3.1876F, 0.3087F, 0.1664F, 0.0528F));

		PartDefinition rightcheeksface_r9 = h_head.addOrReplaceChild("rightcheeksface_r9", CubeListBuilder.create().texOffs(260, 1256).addBox(-20.5F, -4.5F, -32.5F, 33.0F, 13.0F, 93.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.8431F, 5.2857F, -29.9376F, 0.0861F, 0.0F, 0.0F));

		PartDefinition rightcheeksface_r10 = h_head.addOrReplaceChild("rightcheeksface_r10", CubeListBuilder.create().texOffs(748, 1228).addBox(-15.0F, -6.5F, -58.0F, 30.0F, 13.0F, 116.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-3.1569F, 10.3327F, -38.1175F, 0.0425F, 0.0F, 0.0F));

		PartDefinition maincheeks = h_head.addOrReplaceChild("maincheeks", CubeListBuilder.create(), PartPose.offset(-22.1206F, 5.5343F, -21.1244F));

		PartDefinition leftcheeksface_r12 = maincheeks.addOrReplaceChild("leftcheeksface_r12", CubeListBuilder.create().texOffs(1374, 1601).addBox(-10.5F, -7.0F, -32.5F, 21.0F, 14.0F, 41.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.217F, -0.131F, 0.0057F));

		PartDefinition leftcheeksface_r13 = maincheeks.addOrReplaceChild("leftcheeksface_r13", CubeListBuilder.create().texOffs(1279, 732).addBox(-10.5F, -5.5F, -32.5F, 21.0F, 14.0F, 65.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-0.7331F, -0.4986F, 3.6868F, 0.1298F, -0.131F, 0.0057F));

		PartDefinition rightcheeksface_r11 = maincheeks.addOrReplaceChild("rightcheeksface_r11", CubeListBuilder.create().texOffs(1374, 1601).addBox(-10.5F, -7.0F, -32.5F, 21.0F, 14.0F, 41.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(37.7306F, 0.0F, 0.0F, 0.217F, 0.131F, -0.0057F));

		PartDefinition rightcheeksface_r12 = maincheeks.addOrReplaceChild("rightcheeksface_r12", CubeListBuilder.create().texOffs(1280, 732).addBox(-10.5F, -5.5F, -32.5F, 21.0F, 14.0F, 65.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(38.4636F, -0.4986F, 3.6868F, 0.1298F, 0.131F, -0.0057F));

		PartDefinition leftcheeksface_r14 = maincheeks.addOrReplaceChild("leftcheeksface_r14", CubeListBuilder.create().texOffs(1330, 1228).addBox(-8.5F, -5.5F, -32.5F, 19.0F, 14.0F, 65.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(3.7669F, 3.5014F, -30.8132F, 0.0425F, -0.131F, 0.0057F));

		PartDefinition rightcheeksface_r13 = maincheeks.addOrReplaceChild("rightcheeksface_r13", CubeListBuilder.create().texOffs(1330, 1228).addBox(-10.5F, -5.5F, -32.5F, 19.0F, 14.0F, 65.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(33.9636F, 3.5014F, -30.8132F, 0.0425F, 0.131F, -0.0057F));

		PartDefinition beak_like = h_head.addOrReplaceChild("beak_like", CubeListBuilder.create(), PartPose.offset(0.5F, 0.0F, -111.0F));

		PartDefinition nose_r5 = beak_like.addOrReplaceChild("nose_r5", CubeListBuilder.create().texOffs(1404, 890).addBox(-5.0F, -5.0F, -1.0F, 10.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6586F, 22.1369F, 10.3337F, -0.1309F, 0.0F, 0.0F));

		PartDefinition nose_r6 = beak_like.addOrReplaceChild("nose_r6", CubeListBuilder.create().texOffs(784, 1470).addBox(-13.0F, -5.0F, -3.0F, 22.0F, 10.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6586F, 17.6369F, 14.0837F, -0.4363F, 0.0F, 0.0F));

		PartDefinition nose_r7 = beak_like.addOrReplaceChild("nose_r7", CubeListBuilder.create().texOffs(1652, 84).addBox(-8.0F, -5.0F, -1.0F, 16.0F, 10.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6586F, 18.1369F, 7.3337F, -0.1309F, 0.0F, 0.0F));

		PartDefinition nose_r8 = beak_like.addOrReplaceChild("nose_r8", CubeListBuilder.create().texOffs(1354, 348).addBox(-6.0F, -4.0F, -1.0F, 12.0F, 14.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-3.6586F, 3.8683F, 11.0872F, -0.2618F, 0.0F, 0.0F));

		PartDefinition lowernose_r1 = beak_like.addOrReplaceChild("lowernose_r1", CubeListBuilder.create().texOffs(1280, 348).addBox(-13.0F, -6.5F, -5.5F, 26.0F, 13.0F, 11.0F, new CubeDeformation(0.15F)), PartPose.offsetAndRotation(-3.7334F, 12.2139F, 15.7882F, -0.829F, 0.0F, 0.0F));

		PartDefinition teeth = h_head.addOrReplaceChild("teeth", CubeListBuilder.create().texOffs(1602, 1119).addBox(13.0F, 7.5F, 19.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).addBox(13.0F, 7.5F, 24.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).addBox(6.0F, 11.5F, 13.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).mirror().addBox(-10.0106F, 11.5F, 13.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-1.0F, 10.5F, -114.5F));

		PartDefinition cube_r5 = teeth.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.0F, 9.75F, 59.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r6 = teeth.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.0F, 9.75F, 59.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r7 = teeth.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.75F, 9.75F, 66.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r8 = teeth.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(21.75F, 9.75F, 66.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r9 = teeth.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.0F, 9.75F, 73.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r10 = teeth.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.0F, 9.75F, 73.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r11 = teeth.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.75F, 9.75F, 80.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r12 = teeth.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(23.75F, 9.75F, 80.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r13 = teeth.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 9.75F, 45.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r14 = teeth.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.0F, 9.75F, 45.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r15 = teeth.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.75F, 9.75F, 52.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r16 = teeth.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(19.75F, 9.75F, 52.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r17 = teeth.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.75F, 9.75F, 38.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r18 = teeth.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.75F, 9.75F, 38.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r19 = teeth.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 9.75F, 31.5F, -1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r20 = teeth.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.0F, 9.75F, 31.5F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r21 = teeth.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).addBox(16.0106F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0106F, 13.0F, 16.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r22 = teeth.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, 9.0F, 27.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r23 = teeth.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0F, 9.0F, 22.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition teeth2 = h_head.addOrReplaceChild("teeth2", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(-13.0F, 7.5F, 19.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).mirror().addBox(-13.0F, 7.5F, 24.5F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offset(-6.0106F, 10.5F, -114.5F));

		PartDefinition cube_r24 = teeth2.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.0F, 9.75F, 59.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r25 = teeth2.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.0F, 9.75F, 59.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r26 = teeth2.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.75F, 9.75F, 66.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r27 = teeth2.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-21.75F, 9.75F, 66.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r28 = teeth2.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-23.0F, 9.75F, 73.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r29 = teeth2.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-23.0F, 9.75F, 73.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r30 = teeth2.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-23.75F, 9.75F, 80.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r31 = teeth2.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-23.75F, 9.75F, 80.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r32 = teeth2.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.0F, 9.75F, 45.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r33 = teeth2.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.0F, 9.75F, 45.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r34 = teeth2.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.75F, 9.75F, 52.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r35 = teeth2.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-19.75F, 9.75F, 52.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r36 = teeth2.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.75F, 9.75F, 38.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r37 = teeth2.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.75F, 9.75F, 38.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r38 = teeth2.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.0F, 9.75F, 31.5F, -1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r39 = teeth2.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.25F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.0F, 9.75F, 31.5F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r40 = teeth2.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-13.0F, 9.0F, 27.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r41 = teeth2.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-13.0F, 9.0F, 22.0F, -1.5708F, 0.0F, 0.0F));

		PartDefinition tentupperface = h_head.addOrReplaceChild("tentupperface", CubeListBuilder.create(), PartPose.offset(46.1959F, 19.1582F, -30.8973F));

		PartDefinition lowerlip_r1 = tentupperface.addOrReplaceChild("lowerlip_r1", CubeListBuilder.create().texOffs(809, 1505).addBox(-2.6651F, -97.7802F, -16.4039F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-1.0F))
		.texOffs(809, 1505).addBox(-2.7441F, -49.2104F, -16.5561F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2576F, 0.2316F, 1.4256F));

		PartDefinition lowerlip_r2 = tentupperface.addOrReplaceChild("lowerlip_r2", CubeListBuilder.create().texOffs(809, 1505).addBox(-2.5515F, -2.4444F, -16.7405F, 3.0F, 35.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1267F, 0.2316F, 1.4256F));

		PartDefinition lowerlip_r3 = tentupperface.addOrReplaceChild("lowerlip_r3", CubeListBuilder.create().texOffs(825, 1502).addBox(-2.895F, 25.8041F, -24.3231F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8649F, 0.2316F, 1.4256F));

		PartDefinition lowerlip_r4 = tentupperface.addOrReplaceChild("lowerlip_r4", CubeListBuilder.create().texOffs(825, 1502).addBox(-2.4757F, 44.4229F, -39.8979F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5594F, 0.2316F, 1.4256F));

		PartDefinition lowerlip_r5 = tentupperface.addOrReplaceChild("lowerlip_r5", CubeListBuilder.create().texOffs(1126, 1551).addBox(-22.6121F, 36.466F, -55.1302F, 4.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, 1.1781F));

		PartDefinition tentupperface2 = h_head.addOrReplaceChild("tentupperface2", CubeListBuilder.create(), PartPose.offset(-51.2065F, 19.1582F, -30.8973F));

		PartDefinition lowerlip_r6 = tentupperface2.addOrReplaceChild("lowerlip_r6", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-0.3349F, -97.7802F, -16.4039F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-1.0F)).mirror(false)
		.texOffs(809, 1505).mirror().addBox(-0.2559F, -49.2104F, -16.5561F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.2576F, -0.2316F, -1.4256F));

		PartDefinition lowerlip_r7 = tentupperface2.addOrReplaceChild("lowerlip_r7", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-0.4485F, -2.4444F, -16.7405F, 3.0F, 35.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -1.1267F, -0.2316F, -1.4256F));

		PartDefinition lowerlip_r8 = tentupperface2.addOrReplaceChild("lowerlip_r8", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-0.105F, 25.8041F, -24.3231F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.8649F, -0.2316F, -1.4256F));

		PartDefinition lowerlip_r9 = tentupperface2.addOrReplaceChild("lowerlip_r9", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-0.5243F, 44.4229F, -39.8979F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.5594F, -0.2316F, -1.4256F));

		PartDefinition lowerlip_r10 = tentupperface2.addOrReplaceChild("lowerlip_r10", CubeListBuilder.create().texOffs(1126, 1551).mirror().addBox(18.6121F, 36.466F, -55.1302F, 4.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, -0.2618F, 0.0F, -1.1781F));

		PartDefinition horn = h_head.addOrReplaceChild("horn", CubeListBuilder.create(), PartPose.offset(0.1958F, -3.3978F, 27.0769F));

		PartDefinition hornleft8_r1 = horn.addOrReplaceChild("hornleft8_r1", CubeListBuilder.create().texOffs(1644, 523).addBox(8.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-38.1409F, 3.2332F, -15.9349F, -0.4883F, 1.1461F, 0.859F));

		PartDefinition hornleft_r2 = horn.addOrReplaceChild("hornleft_r2", CubeListBuilder.create().texOffs(684, 1322).addBox(-9.5F, -9.5F, -5.5F, 19.0F, 19.0F, 11.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-22.0354F, -28.6115F, -35.1771F, -0.2014F, 0.6596F, 1.1615F));

		PartDefinition hornleft4_r1 = horn.addOrReplaceChild("hornleft4_r1", CubeListBuilder.create().texOffs(812, 1631).addBox(-16.5F, -10.5F, -7.5F, 32.0F, 15.0F, 15.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-27.9031F, -37.336F, -22.5162F, -0.279F, 0.9571F, 1.0572F));

		PartDefinition hornleft5_r1 = horn.addOrReplaceChild("hornleft5_r1", CubeListBuilder.create().texOffs(116, 1637).addBox(-16.5F, -10.5F, -7.5F, 32.0F, 15.0F, 15.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(-30.9031F, -37.336F, -17.7662F, -0.2631F, 0.915F, 1.0769F));

		PartDefinition hornleft7_r1 = horn.addOrReplaceChild("hornleft7_r1", CubeListBuilder.create().texOffs(1649, 452).addBox(-10.0F, -3.0F, -3.0F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-25.8286F, -48.5314F, -1.4155F, -0.3747F, 1.1226F, 0.9466F));

		PartDefinition hornleft5_r2 = horn.addOrReplaceChild("hornleft5_r2", CubeListBuilder.create().texOffs(1642, 1484).addBox(-29.9112F, -8.7475F, -6.8764F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-30.807F, -36.3214F, -28.2963F, -0.3189F, 1.0405F, 1.0097F));

		PartDefinition hornleft6_r1 = horn.addOrReplaceChild("hornleft6_r1", CubeListBuilder.create().texOffs(1622, 1642).addBox(-29.9112F, -8.7475F, -6.8764F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-35.557F, -36.3214F, -27.0463F, -0.3189F, 1.0405F, 1.0097F));

		PartDefinition hornleft6_r2 = horn.addOrReplaceChild("hornleft6_r2", CubeListBuilder.create().texOffs(1498, 1368).addBox(-15.0F, -3.0F, -3.0F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-35.3286F, -54.0314F, -0.9155F, -0.3444F, 1.0817F, 0.9806F));

		PartDefinition hornleft6_r3 = horn.addOrReplaceChild("hornleft6_r3", CubeListBuilder.create().texOffs(1646, 1218).addBox(-29.9112F, -10.7475F, -6.8764F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-46.557F, -44.5714F, -7.7963F, -0.3876F, 1.0254F, 0.9298F));

		PartDefinition hornleft7_r2 = horn.addOrReplaceChild("hornleft7_r2", CubeListBuilder.create().texOffs(1651, 424).addBox(-10.0F, -3.0F, -3.0F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-59.0786F, -57.2814F, 14.5845F, -0.3189F, 1.0405F, 1.0097F));

		PartDefinition hornleft7_r3 = horn.addOrReplaceChild("hornleft7_r3", CubeListBuilder.create().texOffs(1646, 1343).addBox(-10.0F, -3.0F, -3.0F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-55.3286F, -63.2814F, 23.0845F, -0.3189F, 1.0405F, 1.0097F));

		PartDefinition hornleft8_r2 = horn.addOrReplaceChild("hornleft8_r2", CubeListBuilder.create().texOffs(1560, 1368).addBox(-6.6377F, -13.2524F, -3.5079F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-47.1409F, -23.5168F, 5.0651F, -0.5382F, 1.1841F, 0.8047F));

		PartDefinition hornleft7_r4 = horn.addOrReplaceChild("hornleft7_r4", CubeListBuilder.create().texOffs(1514, 872).addBox(-6.6377F, -13.2524F, -3.5079F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-47.1409F, -5.7668F, 5.0651F, -0.5382F, 1.1841F, 0.8047F));

		PartDefinition hornleft8_r3 = horn.addOrReplaceChild("hornleft8_r3", CubeListBuilder.create().texOffs(500, 1571).addBox(-6.6377F, -13.2524F, -3.5079F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-47.1409F, 24.2332F, 0.0651F, -1.1291F, 1.298F, 0.2431F));

		PartDefinition hornleft9_r1 = horn.addOrReplaceChild("hornleft9_r1", CubeListBuilder.create().texOffs(1646, 1318).addBox(-14.8074F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-32.3909F, 45.4832F, -19.1849F, -1.9736F, 1.1981F, -0.5508F));

		PartDefinition hornleft10_r1 = horn.addOrReplaceChild("hornleft10_r1", CubeListBuilder.create().texOffs(1654, 536).addBox(-22.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1622, 1368).addBox(-31.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-32.3909F, 45.4832F, -19.1849F, -2.0227F, 1.2379F, -0.6032F));

		PartDefinition hornleft9_r2 = horn.addOrReplaceChild("hornleft9_r2", CubeListBuilder.create().texOffs(1646, 1398).addBox(-31.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(618, 1649).addBox(-22.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1644, 607).addBox(10.8423F, -14.0507F, -4.8915F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F))
		.texOffs(1644, 635).addBox(8.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-47.1409F, 24.2332F, 0.0651F, -0.998F, 1.2768F, 0.3796F));

		PartDefinition hornleft8_r4 = horn.addOrReplaceChild("hornleft8_r4", CubeListBuilder.create().texOffs(1646, 1293).addBox(-14.8074F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-47.1409F, 24.2332F, 0.0651F, -1.0672F, 1.2393F, 0.3069F));

		PartDefinition hornleft6_r4 = horn.addOrReplaceChild("hornleft6_r4", CubeListBuilder.create().texOffs(1644, 551).addBox(10.8423F, -14.0507F, -4.8915F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F))
		.texOffs(1644, 579).addBox(8.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F))
		.texOffs(1653, 507).addBox(-22.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1646, 1428).addBox(-31.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-47.1409F, -5.7668F, 5.0651F, -0.4883F, 1.1461F, 0.859F));

		PartDefinition hornleft7_r5 = horn.addOrReplaceChild("hornleft7_r5", CubeListBuilder.create().texOffs(1646, 1268).addBox(-14.8074F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-47.1409F, -5.7668F, 5.0651F, -0.5693F, 1.1241F, 0.7697F));

		PartDefinition hornleft9_r3 = horn.addOrReplaceChild("hornleft9_r3", CubeListBuilder.create().texOffs(1646, 1383).addBox(-31.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(52, 1648).addBox(-22.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-47.1409F, -23.5168F, -0.9349F, -0.4883F, 1.1461F, 0.859F));

		PartDefinition hornleft8_r5 = horn.addOrReplaceChild("hornleft8_r5", CubeListBuilder.create().texOffs(1646, 1243).addBox(-14.8074F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-47.1409F, -23.5168F, -3.9349F, -0.5693F, 1.1241F, 0.7697F));

		PartDefinition hornleft8_r6 = horn.addOrReplaceChild("hornleft8_r6", CubeListBuilder.create().texOffs(1644, 495).addBox(8.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-47.1409F, -25.5168F, 5.0651F, -0.4883F, 1.1461F, 0.859F));

		PartDefinition hornleft7_r6 = horn.addOrReplaceChild("hornleft7_r6", CubeListBuilder.create().texOffs(976, 1643).addBox(10.8423F, -14.0507F, -4.8915F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-47.1409F, -23.5168F, 5.0651F, -0.4883F, 1.1461F, 0.859F));

		PartDefinition hornleft9_r4 = horn.addOrReplaceChild("hornleft9_r4", CubeListBuilder.create().texOffs(906, 1643).addBox(8.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(-33.1409F, -14.5168F, -15.9349F, -0.4883F, 1.1461F, 0.859F));

		PartDefinition hornright8_r1 = horn.addOrReplaceChild("hornright8_r1", CubeListBuilder.create().texOffs(1642, 1512).addBox(11.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1646, 1443).addBox(2.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(40.2386F, -23.5168F, -0.9349F, -0.4883F, -1.1461F, -0.859F));

		PartDefinition hornright7_r1 = horn.addOrReplaceChild("hornright7_r1", CubeListBuilder.create().texOffs(598, 1424).addBox(-18.3623F, -13.2524F, -3.5079F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(40.2386F, -23.5168F, 5.0651F, -0.5382F, -1.1841F, -0.8047F));

		PartDefinition hornright6_r1 = horn.addOrReplaceChild("hornright6_r1", CubeListBuilder.create().texOffs(1642, 168).addBox(-33.8423F, -14.0507F, -4.8915F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(40.2386F, -23.5168F, 5.0651F, -0.4883F, -1.1461F, -0.859F));

		PartDefinition hornright7_r2 = horn.addOrReplaceChild("hornright7_r2", CubeListBuilder.create().texOffs(414, 1646).addBox(-8.1926F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(40.2386F, -23.5168F, -3.9349F, -0.5693F, -1.1241F, -0.7697F));

		PartDefinition hornright7_r3 = horn.addOrReplaceChild("hornright7_r3", CubeListBuilder.create().texOffs(1642, 411).addBox(-31.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(40.2386F, -25.5168F, 5.0651F, -0.4883F, -1.1461F, -0.859F));

		PartDefinition hornright8_r2 = horn.addOrReplaceChild("hornright8_r2", CubeListBuilder.create().texOffs(1642, 439).addBox(-31.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(26.2386F, -14.5168F, -15.9349F, -0.4883F, -1.1461F, -0.859F));

		PartDefinition hornright7_r4 = horn.addOrReplaceChild("hornright7_r4", CubeListBuilder.create().texOffs(1452, 872).addBox(-18.3623F, -13.2524F, -3.5079F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(40.2386F, 24.2332F, 0.0651F, -1.1291F, -1.298F, -0.2431F));

		PartDefinition hornright9_r1 = horn.addOrReplaceChild("hornright9_r1", CubeListBuilder.create().texOffs(784, 1486).addBox(11.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1651, 649).addBox(2.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(25.4886F, 45.4832F, -19.1849F, -2.0227F, -1.2379F, 0.6032F));

		PartDefinition hornright8_r3 = horn.addOrReplaceChild("hornright8_r3", CubeListBuilder.create().texOffs(1646, 1193).addBox(-8.1926F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(25.4886F, 45.4832F, -19.1849F, -1.9736F, -1.1981F, 0.5508F));

		PartDefinition hornright8_r4 = horn.addOrReplaceChild("hornright8_r4", CubeListBuilder.create().texOffs(1644, 688).addBox(11.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(0, 1648).addBox(2.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1642, 467).addBox(-33.8423F, -14.0507F, -4.8915F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F))
		.texOffs(1642, 1456).addBox(-31.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(40.2386F, 24.2332F, 0.0651F, -0.998F, -1.2768F, -0.3796F));

		PartDefinition hornright7_r5 = horn.addOrReplaceChild("hornright7_r5", CubeListBuilder.create().texOffs(1646, 1168).addBox(-8.1926F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(40.2386F, 24.2332F, 0.0651F, -1.0672F, -1.2393F, -0.3069F));

		PartDefinition hornright7_r6 = horn.addOrReplaceChild("hornright7_r6", CubeListBuilder.create().texOffs(1652, 178).addBox(2.823F, 5.9042F, -3.271F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(1646, 1413).addBox(11.7157F, -0.6562F, -3.7118F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F))
		.texOffs(210, 1640).addBox(-33.8423F, -14.0507F, -4.8915F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F))
		.texOffs(280, 1640).addBox(-31.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(40.2386F, -5.7668F, 5.0651F, -0.4883F, -1.1461F, -0.859F));

		PartDefinition hornright6_r2 = horn.addOrReplaceChild("hornright6_r2", CubeListBuilder.create().texOffs(1342, 890).addBox(-18.3623F, -13.2524F, -3.5079F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(40.2386F, -5.7668F, 5.0651F, -0.5382F, -1.1841F, -0.8047F));

		PartDefinition hornright6_r3 = horn.addOrReplaceChild("hornright6_r3", CubeListBuilder.create().texOffs(350, 1646).addBox(-8.1926F, -5.9883F, -4.8275F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(40.2386F, -5.7668F, 5.0651F, -0.5693F, -1.1241F, -0.7697F));

		PartDefinition hornright7_r7 = horn.addOrReplaceChild("hornright7_r7", CubeListBuilder.create().texOffs(1642, 140).addBox(-31.4855F, -9.7464F, -5.1005F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(31.2387F, 3.2332F, -15.9349F, -0.4883F, -1.1461F, -0.859F));

		PartDefinition hornright6_r4 = horn.addOrReplaceChild("hornright6_r4", CubeListBuilder.create().texOffs(670, 1649).addBox(-10.0F, -3.0F, -3.0F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(18.9264F, -48.5314F, -1.4155F, -0.3747F, -1.1226F, -0.9466F));

		PartDefinition hornright6_r5 = horn.addOrReplaceChild("hornright6_r5", CubeListBuilder.create().texOffs(1642, 196).addBox(-10.0F, -3.0F, -3.0F, 20.0F, 9.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(48.4264F, -63.2814F, 23.0845F, -0.3189F, -1.0405F, -1.0097F));

		PartDefinition hornright6_r6 = horn.addOrReplaceChild("hornright6_r6", CubeListBuilder.create().texOffs(1652, 152).addBox(-10.0F, -3.0F, -3.0F, 20.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(52.1764F, -57.2814F, 14.5845F, -0.3189F, -1.0405F, -1.0097F));

		PartDefinition hornright5_r1 = horn.addOrReplaceChild("hornright5_r1", CubeListBuilder.create().texOffs(1280, 890).addBox(-10.0F, -3.0F, -3.0F, 25.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(28.4264F, -54.0314F, -0.9155F, -0.3444F, -1.0817F, -0.9806F));

		PartDefinition hornright5_r2 = horn.addOrReplaceChild("hornright5_r2", CubeListBuilder.create().texOffs(1644, 663).addBox(6.9112F, -10.7475F, -6.8764F, 23.0F, 16.0F, 9.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(39.6548F, -44.5714F, -7.7963F, -0.3876F, -1.0254F, -0.9298F));

		PartDefinition hornright5_r3 = horn.addOrReplaceChild("hornright5_r3", CubeListBuilder.create().texOffs(1496, 704).addBox(6.9112F, -8.7475F, -6.8764F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(28.6548F, -36.3214F, -27.0463F, -0.3189F, -1.0405F, -1.0097F));

		PartDefinition hornright4_r1 = horn.addOrReplaceChild("hornright4_r1", CubeListBuilder.create().texOffs(1460, 312).addBox(6.9112F, -8.7475F, -6.8764F, 23.0F, 16.0F, 12.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(23.9048F, -36.3214F, -28.2963F, -0.3189F, -1.0405F, -1.0097F));

		PartDefinition hornright4_r2 = horn.addOrReplaceChild("hornright4_r2", CubeListBuilder.create().texOffs(116, 1637).addBox(-15.5F, -10.5F, -7.5F, 32.0F, 15.0F, 15.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(24.0008F, -37.336F, -17.7662F, -0.2631F, -0.915F, -1.0769F));

		PartDefinition hornright3_r1 = horn.addOrReplaceChild("hornright3_r1", CubeListBuilder.create().texOffs(812, 1631).addBox(-15.5F, -10.5F, -7.5F, 32.0F, 15.0F, 15.0F, new CubeDeformation(0.5F)), PartPose.offsetAndRotation(21.0008F, -37.336F, -22.5162F, -0.279F, -0.9571F, -1.0572F));

		PartDefinition hornright_r1 = horn.addOrReplaceChild("hornright_r1", CubeListBuilder.create().texOffs(684, 1322).addBox(-9.5F, -9.5F, -5.5F, 19.0F, 19.0F, 11.0F, new CubeDeformation(0.3F)), PartPose.offsetAndRotation(15.1332F, -28.6115F, -35.1771F, -0.2014F, -0.6596F, -1.1615F));

		PartDefinition h_jaw = head.addOrReplaceChild("h_jaw", CubeListBuilder.create(), PartPose.offsetAndRotation(-0.8239F, 31.863F, -7.3848F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r42 = h_jaw.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -38.5F, -61.5F, 3.0F, 48.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-14.5461F, 2.607F, 26.2148F, 0.0F, 0.0F, -2.8798F));

		PartDefinition cube_r43 = h_jaw.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(14.1939F, 2.607F, 26.2148F, 0.0F, 0.0F, 2.8798F));

		PartDefinition cube_r44 = h_jaw.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 54.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(1.1939F, 12.607F, 13.2148F, 0.0F, 0.0F, -3.1416F));

		PartDefinition lowermouth_r1 = h_jaw.addOrReplaceChild("lowermouth_r1", CubeListBuilder.create().texOffs(1600, 1132).addBox(-15.574F, -4.634F, -12.956F, 25.0F, 10.0F, 26.0F, new CubeDeformation(0.2F)), PartPose.offsetAndRotation(3.1063F, -1.1375F, -33.3517F, 0.0436F, 0.0F, 0.0F));

		PartDefinition leftcheeksface_r15 = h_jaw.addOrReplaceChild("leftcheeksface_r15", CubeListBuilder.create().texOffs(1496, 430).addBox(-7.5F, -5.5F, -26.5F, 14.0F, 17.0F, 59.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-18.0245F, -3.7682F, 21.079F, 0.0425F, -0.131F, 0.0057F));

		PartDefinition leftcheeksface_r16 = h_jaw.addOrReplaceChild("leftcheeksface_r16", CubeListBuilder.create().texOffs(1608, 821).addBox(-5.5F, -3.5F, -31.5F, 12.0F, 15.0F, 32.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-16.0245F, -3.7682F, -1.921F, 0.0425F, -0.131F, 0.0057F));

		PartDefinition rightcheeksface_r14 = h_jaw.addOrReplaceChild("rightcheeksface_r14", CubeListBuilder.create().texOffs(1608, 821).addBox(-6.5F, -3.5F, -31.5F, 12.0F, 15.0F, 32.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(16.1722F, -3.7682F, -1.921F, 0.0425F, 0.131F, -0.0057F));

		PartDefinition rightcheeksface_r15 = h_jaw.addOrReplaceChild("rightcheeksface_r15", CubeListBuilder.create().texOffs(1496, 430).addBox(-6.5F, -5.5F, -26.5F, 14.0F, 17.0F, 59.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(18.1722F, -3.7682F, 21.079F, 0.0425F, 0.131F, -0.0057F));

		PartDefinition rightcheeksface_r16 = h_jaw.addOrReplaceChild("rightcheeksface_r16", CubeListBuilder.create().texOffs(1040, 1228).addBox(-11.5F, -4.5F, -41.5F, 29.0F, 13.0F, 116.0F, new CubeDeformation(0.4F)), PartPose.offsetAndRotation(-3.3278F, -0.5182F, 2.579F, 0.0425F, 0.0F, 0.0F));

		PartDefinition tent = h_jaw.addOrReplaceChild("tent", CubeListBuilder.create(), PartPose.offset(-4.0847F, -19.6652F, 568.0205F));

		PartDefinition lowerlip_r11 = tent.addOrReplaceChild("lowerlip_r11", CubeListBuilder.create().texOffs(1126, 1551).addBox(-5.5023F, -136.2087F, -599.8565F, 4.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1126, 1551).addBox(9.9977F, -136.2087F, -599.8565F, 4.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerlip_r12 = tent.addOrReplaceChild("lowerlip_r12", CubeListBuilder.create().texOffs(1112, 1573).addBox(-1.0F, -3.5F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-23.6805F, 26.757F, -550.1079F, 0.5594F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r13 = tent.addOrReplaceChild("lowerlip_r13", CubeListBuilder.create().texOffs(1250, 1568).addBox(-7.0F, -4.5F, -3.0F, 9.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-17.6805F, 26.757F, -550.6079F, 0.1231F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r14 = tent.addOrReplaceChild("lowerlip_r14", CubeListBuilder.create().texOffs(562, 1571).addBox(-1.0F, -3.5F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-18.6805F, 26.757F, -575.1079F, 0.5594F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r15 = tent.addOrReplaceChild("lowerlip_r15", CubeListBuilder.create().texOffs(960, 1558).addBox(-7.0F, -4.5F, -3.0F, 9.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-12.6805F, 26.757F, -575.6079F, 0.1231F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r16 = tent.addOrReplaceChild("lowerlip_r16", CubeListBuilder.create().texOffs(1652, 113).addBox(-7.0F, -4.5F, -3.0F, 9.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-12.6805F, 24.757F, -594.6079F, 0.1231F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r17 = tent.addOrReplaceChild("lowerlip_r17", CubeListBuilder.create().texOffs(136, 1553).addBox(-1.0F, -3.5F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(-18.6805F, 24.757F, -594.1079F, 0.5594F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r18 = tent.addOrReplaceChild("lowerlip_r18", CubeListBuilder.create().texOffs(960, 1543).addBox(-2.0F, -4.5F, -3.0F, 9.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(25.9977F, 26.757F, -550.6079F, 0.1231F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r19 = tent.addOrReplaceChild("lowerlip_r19", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.0F, -3.5F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-27.1805F, 28.757F, -546.1079F, 0.5594F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r20 = tent.addOrReplaceChild("lowerlip_r20", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.5F, -5.0F, -1.5F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-34.5929F, 32.0892F, -539.6307F, 0.8649F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r21 = tent.addOrReplaceChild("lowerlip_r21", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-58.7981F, 34.7869F, -499.6767F, 1.2576F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r22 = tent.addOrReplaceChild("lowerlip_r22", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-73.0481F, 30.0369F, -452.9267F, 1.4757F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r23 = tent.addOrReplaceChild("lowerlip_r23", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-68.0481F, 34.2869F, -496.9267F, 1.2576F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r24 = tent.addOrReplaceChild("lowerlip_r24", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.5F, -17.5F, -1.5F, 3.0F, 35.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-51.3711F, 35.0122F, -534.0151F, 1.1267F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r25 = tent.addOrReplaceChild("lowerlip_r25", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.3189F, -22.8128F, -7.5577F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-36.1955F, 30.9456F, -548.6537F, 0.8649F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r26 = tent.addOrReplaceChild("lowerlip_r26", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.7382F, -28.9538F, -14.2885F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-36.1955F, 30.9456F, -548.6537F, 0.5594F, -0.2316F, 1.0765F));

		PartDefinition lowerlip_r27 = tent.addOrReplaceChild("lowerlip_r27", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.7317F, -25.416F, -10.7561F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-34.6786F, 29.6413F, -571.6465F, 0.6622F, -0.3761F, 0.8275F));

		PartDefinition lowerlip_r28 = tent.addOrReplaceChild("lowerlip_r28", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.5221F, -27.5656F, -4.7206F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-40.513F, 33.8942F, -564.8118F, 0.9676F, -0.3761F, 0.6966F));

		PartDefinition lowerlip_r29 = tent.addOrReplaceChild("lowerlip_r29", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.5F, -15.5F, -1.5F, 3.0F, 31.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-46.5972F, 40.0919F, -554.5967F, 1.1057F, -0.1595F, 0.6696F));

		PartDefinition lowerlip_r30 = tent.addOrReplaceChild("lowerlip_r30", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-59.0481F, 45.7869F, -519.1767F, 1.2644F, -0.107F, 1.036F));

		PartDefinition lowerlip_r31 = tent.addOrReplaceChild("lowerlip_r31", CubeListBuilder.create().texOffs(825, 1502).addBox(-1.2683F, -25.416F, -10.7561F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(44.4959F, 29.6413F, -571.6465F, 0.6622F, 0.3761F, -0.8275F));

		PartDefinition lowerlip_r32 = tent.addOrReplaceChild("lowerlip_r32", CubeListBuilder.create().texOffs(825, 1502).addBox(-1.4779F, -27.5656F, -4.7206F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(50.3302F, 33.8942F, -564.8118F, 0.9676F, 0.3761F, -0.6966F));

		PartDefinition lowerlip_r33 = tent.addOrReplaceChild("lowerlip_r33", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.5F, -15.5F, -1.5F, 3.0F, 31.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(56.4144F, 40.0919F, -554.5967F, 1.1057F, 0.1595F, -0.6696F));

		PartDefinition lowerlip_r34 = tent.addOrReplaceChild("lowerlip_r34", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.9449F, -43.7389F, -22.399F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-18.9455F, 55.0507F, -569.2787F, 0.5594F, -0.2316F, 0.2475F));

		PartDefinition lowerlip_r35 = tent.addOrReplaceChild("lowerlip_r35", CubeListBuilder.create().texOffs(825, 1502).mirror().addBox(-1.5256F, -39.3526F, -10.8469F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)).mirror(false), PartPose.offsetAndRotation(-18.9455F, 55.0507F, -569.2787F, 0.8649F, -0.2316F, 0.2475F));

		PartDefinition lowerlip_r36 = tent.addOrReplaceChild("lowerlip_r36", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.8691F, -14.1427F, -7.7226F, 3.0F, 35.0F, 3.0F, new CubeDeformation(-0.5F)).mirror(false), PartPose.offsetAndRotation(-18.9455F, 55.0507F, -569.2787F, 1.1267F, -0.2316F, 0.2475F));

		PartDefinition lowerlip_r37 = tent.addOrReplaceChild("lowerlip_r37", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.6765F, 17.6428F, -10.0188F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-18.9455F, 55.0507F, -569.2787F, 1.2576F, -0.2316F, 0.2475F));

		PartDefinition lowerlip_r38 = tent.addOrReplaceChild("lowerlip_r38", CubeListBuilder.create().texOffs(809, 1505).mirror().addBox(-1.6765F, 17.6428F, -10.0188F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-1.0F)).mirror(false), PartPose.offsetAndRotation(-32.9455F, 66.8007F, -524.2787F, 1.2576F, -0.2316F, 0.2475F));

		PartDefinition lowerlip_r39 = tent.addOrReplaceChild("lowerlip_r39", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.3235F, 17.6428F, -10.0188F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(40.7627F, 66.8007F, -524.2787F, 1.2576F, 0.2316F, -0.2475F));

		PartDefinition lowerlip_r40 = tent.addOrReplaceChild("lowerlip_r40", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.3235F, 17.6428F, -10.0188F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(26.7627F, 55.0507F, -569.2787F, 1.2576F, 0.2316F, -0.2475F));

		PartDefinition lowerlip_r41 = tent.addOrReplaceChild("lowerlip_r41", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.1309F, -14.1427F, -7.7226F, 3.0F, 35.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(26.7627F, 55.0507F, -569.2787F, 1.1267F, 0.2316F, -0.2475F));

		PartDefinition lowerlip_r42 = tent.addOrReplaceChild("lowerlip_r42", CubeListBuilder.create().texOffs(825, 1502).addBox(-1.4744F, -39.3526F, -10.8469F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(26.7627F, 55.0507F, -569.2787F, 0.8649F, 0.2316F, -0.2475F));

		PartDefinition lowerlip_r43 = tent.addOrReplaceChild("lowerlip_r43", CubeListBuilder.create().texOffs(825, 1502).addBox(-1.0551F, -43.7389F, -22.399F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(26.7627F, 55.0507F, -569.2787F, 0.5594F, 0.2316F, -0.2475F));

		PartDefinition lowerlip_r44 = tent.addOrReplaceChild("lowerlip_r44", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.5F, -17.5F, -1.5F, 3.0F, 35.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(61.1883F, 35.0122F, -534.0151F, 1.1267F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r45 = tent.addOrReplaceChild("lowerlip_r45", CubeListBuilder.create().texOffs(825, 1502).addBox(-1.6811F, -22.8128F, -7.5577F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(46.0127F, 30.9456F, -548.6537F, 0.8649F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r46 = tent.addOrReplaceChild("lowerlip_r46", CubeListBuilder.create().texOffs(825, 1502).addBox(-1.2618F, -28.9538F, -14.2885F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(46.0127F, 30.9456F, -548.6537F, 0.5594F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r47 = tent.addOrReplaceChild("lowerlip_r47", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(68.8654F, 45.7869F, -519.1767F, 1.2644F, 0.107F, -1.036F));

		PartDefinition lowerlip_r48 = tent.addOrReplaceChild("lowerlip_r48", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(77.8654F, 34.2869F, -496.9267F, 1.2576F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r49 = tent.addOrReplaceChild("lowerlip_r49", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(82.8654F, 30.0369F, -452.9267F, 1.4757F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r50 = tent.addOrReplaceChild("lowerlip_r50", CubeListBuilder.create().texOffs(809, 1505).addBox(-1.5F, -25.5F, -1.5F, 3.0F, 51.0F, 3.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(68.6154F, 34.7869F, -499.6767F, 1.2576F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r51 = tent.addOrReplaceChild("lowerlip_r51", CubeListBuilder.create().texOffs(825, 1502).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 29.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(44.4101F, 32.0892F, -539.6307F, 0.8649F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r52 = tent.addOrReplaceChild("lowerlip_r52", CubeListBuilder.create().texOffs(825, 1502).addBox(-2.0F, -3.5F, -2.0F, 3.0F, 10.0F, 3.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(36.9977F, 28.757F, -546.1079F, 0.5594F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r53 = tent.addOrReplaceChild("lowerlip_r53", CubeListBuilder.create().texOffs(824, 1501).addBox(-2.0F, -3.5F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(31.9977F, 26.757F, -550.1079F, 0.5594F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r54 = tent.addOrReplaceChild("lowerlip_r54", CubeListBuilder.create().texOffs(960, 1528).addBox(-2.0F, -4.5F, -3.0F, 9.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(20.9977F, 26.757F, -575.6079F, 0.1231F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r55 = tent.addOrReplaceChild("lowerlip_r55", CubeListBuilder.create().texOffs(1482, 442).addBox(-2.0F, -3.5F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(26.9977F, 26.757F, -575.1079F, 0.5594F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r56 = tent.addOrReplaceChild("lowerlip_r56", CubeListBuilder.create().texOffs(1482, 430).addBox(-2.0F, -3.5F, -2.0F, 3.0F, 8.0F, 4.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(26.9977F, 24.757F, -594.1079F, 0.5594F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r57 = tent.addOrReplaceChild("lowerlip_r57", CubeListBuilder.create().texOffs(1652, 98).addBox(-2.0F, -4.5F, -3.0F, 9.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(20.9977F, 24.757F, -594.6079F, 0.1231F, 0.2316F, -1.0765F));

		PartDefinition lowerlip_r58 = tent.addOrReplaceChild("lowerlip_r58", CubeListBuilder.create().texOffs(960, 1513).addBox(-5.5023F, -136.2087F, -599.8565F, 9.0F, 9.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.25F, 0.0F, -1.0F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerlip_r59 = tent.addOrReplaceChild("lowerlip_r59", CubeListBuilder.create().texOffs(1146, 1460).addBox(-8.5023F, -140.2087F, -599.8565F, 8.0F, 13.0F, 6.0F, new CubeDeformation(-0.1F))
		.texOffs(1146, 1460).addBox(-21.2023F, -140.2087F, -599.8565F, 8.0F, 13.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(15.0F, -4.0F, -1.25F, 0.2618F, 0.0F, 0.0F));

		PartDefinition lowerlip_r60 = tent.addOrReplaceChild("lowerlip_r60", CubeListBuilder.create().texOffs(1286, 1506).addBox(-8.5023F, -140.2087F, -599.8565F, 15.0F, 13.0F, 6.0F, new CubeDeformation(-0.1F)), PartPose.offsetAndRotation(5.0F, -4.0F, -2.25F, 0.2618F, 0.0F, 0.0F));

		PartDefinition teethjaw = h_jaw.addOrReplaceChild("teethjaw", CubeListBuilder.create().texOffs(1602, 1119).addBox(-6.7F, -3.75F, -25.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).addBox(-6.7F, -3.75F, -30.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).addBox(-9.7F, -4.75F, -31.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).addBox(-9.7F, -4.75F, -36.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).addBox(-13.7F, -4.75F, -32.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).addBox(-13.7F, -4.75F, -37.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F))
		.texOffs(1602, 1119).mirror().addBox(-23.7106F, -4.75F, -32.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).mirror().addBox(-23.7106F, -4.75F, -37.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).mirror().addBox(-27.7106F, -4.75F, -36.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).mirror().addBox(-27.7106F, -4.75F, -31.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(19.0292F, -8.4222F, -12.6333F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r45 = teethjaw.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 0.0F, 9.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r46 = teethjaw.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.3F, 0.0F, 9.9F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r47 = teethjaw.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.05F, 0.0F, 16.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r48 = teethjaw.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.05F, 0.0F, 16.9F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r49 = teethjaw.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3F, 0.0F, 23.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r50 = teethjaw.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.3F, 0.0F, 23.9F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r51 = teethjaw.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.05F, 0.0F, 30.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r52 = teethjaw.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(5.05F, 0.0F, 30.9F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r53 = teethjaw.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, -4.1F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r54 = teethjaw.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3F, 0.0F, -4.1F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r55 = teethjaw.addOrReplaceChild("cube_r55", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, 0.0F, 2.9F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r56 = teethjaw.addOrReplaceChild("cube_r56", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.05F, 0.0F, 2.9F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r57 = teethjaw.addOrReplaceChild("cube_r57", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 0.0F, -11.1F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r58 = teethjaw.addOrReplaceChild("cube_r58", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.95F, 0.0F, -11.1F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r59 = teethjaw.addOrReplaceChild("cube_r59", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.0F, -18.1F, 1.5708F, 0.1309F, 0.0F));

		PartDefinition cube_r60 = teethjaw.addOrReplaceChild("cube_r60", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.7F, 0.0F, -18.1F, 0.0F, 0.1309F, 0.0F));

		PartDefinition cube_r61 = teethjaw.addOrReplaceChild("cube_r61", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).addBox(18.0106F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.7106F, -0.25F, -28.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r62 = teethjaw.addOrReplaceChild("cube_r62", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).addBox(18.0106F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-27.7106F, -0.25F, -33.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r63 = teethjaw.addOrReplaceChild("cube_r63", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).addBox(10.0106F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.7106F, -0.25F, -34.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r64 = teethjaw.addOrReplaceChild("cube_r64", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).addBox(10.0106F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-23.7106F, -0.25F, -29.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r65 = teethjaw.addOrReplaceChild("cube_r65", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.7F, 0.75F, -27.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r66 = teethjaw.addOrReplaceChild("cube_r66", CubeListBuilder.create().texOffs(1602, 1119).addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.7F, 0.75F, -22.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition teethjaw2 = h_jaw.addOrReplaceChild("teethjaw2", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(6.7F, -3.75F, -25.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false)
		.texOffs(1602, 1119).mirror().addBox(6.7F, -3.75F, -30.1F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-17.3814F, -8.4222F, -12.6333F, 0.0873F, 0.0F, 0.0F));

		PartDefinition cube_r67 = teethjaw2.addOrReplaceChild("cube_r67", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.0F, 9.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r68 = teethjaw2.addOrReplaceChild("cube_r68", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-2.3F, 0.0F, 9.9F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r69 = teethjaw2.addOrReplaceChild("cube_r69", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.05F, 0.0F, 16.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r70 = teethjaw2.addOrReplaceChild("cube_r70", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-3.05F, 0.0F, 16.9F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r71 = teethjaw2.addOrReplaceChild("cube_r71", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.0F, 23.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r72 = teethjaw2.addOrReplaceChild("cube_r72", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-4.3F, 0.0F, 23.9F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r73 = teethjaw2.addOrReplaceChild("cube_r73", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.05F, 0.0F, 30.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r74 = teethjaw2.addOrReplaceChild("cube_r74", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-5.05F, 0.0F, 30.9F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r75 = teethjaw2.addOrReplaceChild("cube_r75", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, -4.1F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r76 = teethjaw2.addOrReplaceChild("cube_r76", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-0.3F, 0.0F, -4.1F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r77 = teethjaw2.addOrReplaceChild("cube_r77", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.0F, 2.9F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r78 = teethjaw2.addOrReplaceChild("cube_r78", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(-1.05F, 0.0F, 2.9F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r79 = teethjaw2.addOrReplaceChild("cube_r79", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.95F, 0.0F, -11.1F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r80 = teethjaw2.addOrReplaceChild("cube_r80", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(0.95F, 0.0F, -11.1F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r81 = teethjaw2.addOrReplaceChild("cube_r81", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.0F, -2.25F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 0.0F, -18.1F, 1.5708F, -0.1309F, 0.0F));

		PartDefinition cube_r82 = teethjaw2.addOrReplaceChild("cube_r82", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -3.75F, -2.0F, 0.0F, 6.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(1.7F, 0.0F, -18.1F, 0.0F, -0.1309F, 0.0F));

		PartDefinition cube_r83 = teethjaw2.addOrReplaceChild("cube_r83", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.7F, 0.75F, -27.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition cube_r84 = teethjaw2.addOrReplaceChild("cube_r84", CubeListBuilder.create().texOffs(1602, 1119).mirror().addBox(0.0F, -2.5F, -1.5F, 0.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)).mirror(false), PartPose.offsetAndRotation(6.7F, 0.75F, -22.6F, 1.5708F, 0.0F, 0.0F));

		PartDefinition body = bakunawa.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offset(0.0F, 43.9544F, 232.6048F));

		PartDefinition spine0 = body.addOrReplaceChild("spine0", CubeListBuilder.create().texOffs(242, 1144).addBox(-26.894F, -7.4343F, -38.0356F, 54.0F, 34.0F, 78.0F, new CubeDeformation(0.0F))
		.texOffs(1496, 216).addBox(-19.694F, -11.4343F, -41.4357F, 40.0F, 4.0F, 20.0F, new CubeDeformation(0.0F))
		.texOffs(990, 1511).addBox(-19.694F, -7.4343F, -48.2357F, 40.0F, 34.0F, 28.0F, new CubeDeformation(0.0F))
		.texOffs(1007, 1161).addBox(-14.494F, -13.4343F, -21.0357F, 28.0F, 6.0F, 61.0F, new CubeDeformation(0.0F)), PartPose.offset(0.094F, -67.3657F, -125.1644F));

		PartDefinition cube_r85 = spine0.addOrReplaceChild("cube_r85", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.276F, -43.6643F, 0.9943F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r86 = spine0.addOrReplaceChild("cube_r86", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-25.464F, -25.6643F, 25.9943F, 0.1642F, 0.0594F, -0.3442F));

		PartDefinition cube_r87 = spine0.addOrReplaceChild("cube_r87", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(25.276F, -25.6643F, 25.9943F, 0.1642F, -0.0594F, 0.3442F));

		PartDefinition cube_r88 = spine0.addOrReplaceChild("cube_r88", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.276F, 42.8357F, 7.9943F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r89 = spine0.addOrReplaceChild("cube_r89", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.331F, 13.9685F, 301.6144F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r90 = spine0.addOrReplaceChild("cube_r90", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.331F, 13.9685F, 343.6144F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine1 = body.addOrReplaceChild("spine1", CubeListBuilder.create().texOffs(197, 1099).addBox(-26.8388F, -11.0568F, -67.1993F, 54.0F, 34.0F, 123.0F, new CubeDeformation(0.0F))
		.texOffs(945, 1099).addBox(-14.4388F, -17.0568F, -67.1993F, 28.0F, 6.0F, 123.0F, new CubeDeformation(0.0F))
		.texOffs(749, 35).addBox(-1.1687F, -70.2868F, -0.6693F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F))
		.texOffs(749, 35).addBox(-1.1687F, -93.2868F, -63.6693F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offset(0.0387F, -63.7432F, -18.0007F));

		PartDefinition cube_r91 = spine1.addOrReplaceChild("cube_r91", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3862F, 10.346F, 278.4507F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r92 = spine1.addOrReplaceChild("cube_r92", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.3312F, 26.2132F, -32.1693F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r93 = spine1.addOrReplaceChild("cube_r93", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3862F, 10.346F, 362.4507F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r94 = spine1.addOrReplaceChild("cube_r94", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3862F, 10.346F, 320.4507F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine2 = body.addOrReplaceChild("spine2", CubeListBuilder.create().texOffs(197, 1099).addBox(-22.2727F, -28.103F, -62.6659F, 54.0F, 34.0F, 123.0F, new CubeDeformation(0.0F))
		.texOffs(945, 1099).addBox(-9.8727F, -34.103F, -62.6659F, 28.0F, 6.0F, 123.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.8037F, -46.6542F, 100.5381F));

		PartDefinition cube_r95 = spine2.addOrReplaceChild("cube_r95", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-36.8427F, 35.167F, 40.3641F, 0.0F, 0.0F, -2.618F));

		PartDefinition cube_r96 = spine2.addOrReplaceChild("cube_r96", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(45.8973F, 35.167F, 40.3641F, 0.0F, 0.0F, 2.618F));

		PartDefinition cube_r97 = spine2.addOrReplaceChild("cube_r97", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(4.8973F, -37.333F, 14.3641F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r98 = spine2.addOrReplaceChild("cube_r98", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9523F, -6.7002F, 282.9841F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r99 = spine2.addOrReplaceChild("cube_r99", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9523F, -6.7002F, 324.9841F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r100 = spine2.addOrReplaceChild("cube_r100", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.9523F, -6.7002F, 366.9841F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine3 = body.addOrReplaceChild("spine3", CubeListBuilder.create().texOffs(197, 1099).addBox(-15.1795F, -28.7358F, -47.7904F, 54.0F, 34.0F, 123.0F, new CubeDeformation(0.0F))
		.texOffs(945, 1099).addBox(-2.7795F, -34.7358F, -47.7904F, 28.0F, 6.0F, 123.0F, new CubeDeformation(0.0F)), PartPose.offset(-11.8874F, -46.0642F, 208.4861F));

		PartDefinition cube_r101 = spine3.addOrReplaceChild("cube_r101", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(11.9905F, -37.9658F, 29.2396F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r102 = spine3.addOrReplaceChild("cube_r102", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0455F, -7.333F, 297.8596F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r103 = spine3.addOrReplaceChild("cube_r103", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0455F, -7.333F, 339.8596F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r104 = spine3.addOrReplaceChild("cube_r104", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.0455F, -7.333F, 381.8596F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine4 = body.addOrReplaceChild("spine4", CubeListBuilder.create().texOffs(197, 1099).addBox(-27.17F, -3.77F, -20.03F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-0.5F))
		.texOffs(946, 1100).addBox(-14.77F, -8.77F, -19.03F, 28.0F, 6.0F, 122.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.37F, -71.03F, 302.83F));

		PartDefinition cube_r105 = spine4.addOrReplaceChild("cube_r105", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 46.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r106 = spine4.addOrReplaceChild("cube_r106", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.055F, 17.6328F, 408.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r107 = spine4.addOrReplaceChild("cube_r107", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.055F, 17.6328F, 366.87F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r108 = spine4.addOrReplaceChild("cube_r108", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.055F, 17.6328F, 325.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine5 = body.addOrReplaceChild("spine5", CubeListBuilder.create().texOffs(197, 1099).addBox(-27.0942F, -3.77F, -62.4056F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-0.5F))
		.texOffs(945, 1099).addBox(-14.6942F, -8.77F, -62.4056F, 28.0F, 6.0F, 123.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.37F, -71.03F, 466.83F));

		PartDefinition cube_r109 = spine5.addOrReplaceChild("cube_r109", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 46.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0758F, 0.0F, -42.3756F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r110 = spine5.addOrReplaceChild("cube_r110", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.1308F, 17.6328F, 366.2444F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r111 = spine5.addOrReplaceChild("cube_r111", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.1308F, 17.6328F, 324.4944F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r112 = spine5.addOrReplaceChild("cube_r112", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.1308F, 17.6328F, 283.2444F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine6 = body.addOrReplaceChild("spine6", CubeListBuilder.create().texOffs(197, 1099).addBox(-27.4F, -31.3455F, -70.0226F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-0.5F))
		.texOffs(749, 35).addBox(-1.73F, -90.5755F, -64.4926F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F))
		.texOffs(945, 1099).addBox(-15.0F, -36.3455F, -70.0226F, 28.0F, 6.0F, 123.0F, new CubeDeformation(-0.5F)), PartPose.offset(0.6F, -43.3F, 596.8F));

		PartDefinition cube_r113 = spine6.addOrReplaceChild("cube_r113", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.175F, -9.9427F, 357.6274F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r114 = spine6.addOrReplaceChild("cube_r114", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.175F, -9.9427F, 316.6274F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r115 = spine6.addOrReplaceChild("cube_r115", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(-0.175F, -9.9427F, 275.6274F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine7 = body.addOrReplaceChild("spine7", CubeListBuilder.create().texOffs(197, 1099).addBox(-27.17F, -14.27F, -64.03F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-0.5F))
		.texOffs(945, 1099).addBox(-14.77F, -19.27F, -64.03F, 28.0F, 6.0F, 123.0F, new CubeDeformation(-0.5F))
		.texOffs(749, 35).addBox(-1.5F, -73.5F, -25.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offset(0.37F, -60.53F, 712.83F));

		PartDefinition cube_r116 = spine7.addOrReplaceChild("cube_r116", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-28.74F, 29.0F, 10.0F, 0.0F, 0.0F, -2.618F));

		PartDefinition cube_r117 = spine7.addOrReplaceChild("cube_r117", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(28.0F, 29.0F, 10.0F, 0.0F, 0.0F, 2.618F));

		PartDefinition cube_r118 = spine7.addOrReplaceChild("cube_r118", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 69.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -15.5F, -49.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r119 = spine7.addOrReplaceChild("cube_r119", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.055F, 7.1328F, 363.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r120 = spine7.addOrReplaceChild("cube_r120", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.055F, 7.1328F, 322.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r121 = spine7.addOrReplaceChild("cube_r121", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.055F, 7.1328F, 281.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine8 = body.addOrReplaceChild("spine8", CubeListBuilder.create().texOffs(197, 1099).addBox(-26.4F, -19.2628F, -54.739F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-0.5F))
		.texOffs(945, 1099).addBox(-14.0F, -24.2628F, -54.739F, 28.0F, 6.0F, 123.0F, new CubeDeformation(-0.5F)), PartPose.offset(-0.4F, -55.55F, 825.3F));

		PartDefinition cube_r122 = spine8.addOrReplaceChild("cube_r122", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 74.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.77F, -20.4928F, 19.291F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r123 = spine8.addOrReplaceChild("cube_r123", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.825F, 2.14F, 290.911F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r124 = spine8.addOrReplaceChild("cube_r124", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.825F, 2.14F, 331.911F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r125 = spine8.addOrReplaceChild("cube_r125", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-0.5F)), PartPose.offsetAndRotation(0.825F, 2.14F, 372.911F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine9 = body.addOrReplaceChild("spine9", CubeListBuilder.create().texOffs(1087, 115).addBox(-12.5F, -25.5F, -66.45F, 25.0F, 5.0F, 122.0F, new CubeDeformation(-0.7F))
		.texOffs(197, 1099).addBox(-27.17F, -22.27F, -67.03F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-1.0F))
		.texOffs(749, 35).addBox(-1.5F, -68.5F, -78.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offset(0.37F, -52.53F, 958.83F));

		PartDefinition cube_r126 = spine9.addOrReplaceChild("cube_r126", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, -0.8672F, 359.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r127 = spine9.addOrReplaceChild("cube_r127", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, -0.8672F, 319.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r128 = spine9.addOrReplaceChild("cube_r128", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, -0.8672F, 279.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine10 = body.addOrReplaceChild("spine10", CubeListBuilder.create().texOffs(1087, 115).addBox(-12.5F, -10.5F, -56.45F, 25.0F, 5.0F, 122.0F, new CubeDeformation(-0.7F))
		.texOffs(197, 1099).addBox(-27.17F, -7.27F, -57.03F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-1.0F))
		.texOffs(749, 35).addBox(-1.5F, -53.5F, -68.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offset(0.37F, -67.53F, 1069.83F));

		PartDefinition cube_r129 = spine10.addOrReplaceChild("cube_r129", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, 14.1328F, 368.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r130 = spine10.addOrReplaceChild("cube_r130", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, 14.1328F, 328.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r131 = spine10.addOrReplaceChild("cube_r131", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, 14.1328F, 288.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine11 = body.addOrReplaceChild("spine11", CubeListBuilder.create().texOffs(1087, 115).addBox(-12.5F, -23.0F, -71.95F, 25.0F, 5.0F, 122.0F, new CubeDeformation(-0.7F))
		.texOffs(197, 1099).addBox(-27.17F, -19.77F, -72.03F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-1.0F)), PartPose.offset(0.37F, -55.03F, 1205.83F));

		PartDefinition cube_r132 = spine11.addOrReplaceChild("cube_r132", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r133 = spine11.addOrReplaceChild("cube_r133", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.0F, -8.0F, -71.0F, 0.1745F, 0.0F, 0.0F));

		PartDefinition cube_r134 = spine11.addOrReplaceChild("cube_r134", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(28.0F, 23.5F, 25.0F, 0.0F, 0.0F, 2.618F));

		PartDefinition cube_r135 = spine11.addOrReplaceChild("cube_r135", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, 1.6328F, 312.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r136 = spine11.addOrReplaceChild("cube_r136", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, 1.6328F, 352.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r137 = spine11.addOrReplaceChild("cube_r137", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-28.74F, 23.5F, 25.0F, 0.0F, 0.0F, -2.618F));

		PartDefinition cube_r138 = spine11.addOrReplaceChild("cube_r138", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-1.0F)), PartPose.offsetAndRotation(0.055F, 1.6328F, 272.62F, 1.2217F, 0.0F, 0.0F));

		PartDefinition spine12 = body.addOrReplaceChild("spine12", CubeListBuilder.create().texOffs(197, 1099).addBox(-27.225F, -21.4028F, -63.65F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-2.0F))
		.texOffs(1086, 114).addBox(-12.555F, -23.6328F, -63.32F, 25.0F, 5.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offset(0.425F, -53.3972F, 1317.45F));

		PartDefinition cube_r139 = spine12.addOrReplaceChild("cube_r139", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-2.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 319.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r140 = spine12.addOrReplaceChild("cube_r140", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-2.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 357.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r141 = spine12.addOrReplaceChild("cube_r141", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-2.0F)), PartPose.offsetAndRotation(0.0F, 0.0F, 281.0F, 1.2217F, 0.0F, 0.0F));

		PartDefinition main_tail = body.addOrReplaceChild("main_tail", CubeListBuilder.create().texOffs(1086, 114).addBox(-12.2081F, -14.2722F, -74.7722F, 25.0F, 5.0F, 123.0F, new CubeDeformation(-0.9F))
		.texOffs(749, 35).addBox(-1.2081F, -58.2722F, -16.5722F, 3.0F, 54.0F, 123.0F, new CubeDeformation(-0.9F))
		.texOffs(197, 1099).addBox(-26.8781F, -12.0422F, -75.1022F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-2.0F))
		.texOffs(197, 1099).mirror().addBox(-27.2781F, -12.0422F, -75.1022F, 54.0F, 34.0F, 123.0F, new CubeDeformation(-2.0F)).mirror(false), PartPose.offset(0.0781F, -62.7578F, 1447.9022F));

		PartDefinition cube_r142 = main_tail.addOrReplaceChild("cube_r142", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-2.0F)), PartPose.offsetAndRotation(0.3469F, 9.3606F, 264.5478F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r143 = main_tail.addOrReplaceChild("cube_r143", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-2.0F)), PartPose.offsetAndRotation(0.3469F, 9.3606F, 302.5478F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r144 = main_tail.addOrReplaceChild("cube_r144", CubeListBuilder.create().texOffs(1174, 1436).addBox(-24.625F, -321.5848F, -138.0475F, 48.0F, 40.0F, 30.0F, new CubeDeformation(-2.0F)), PartPose.offsetAndRotation(0.3469F, 9.3606F, 340.5478F, 1.2217F, 0.0F, 0.0F));

		PartDefinition cube_r145 = main_tail.addOrReplaceChild("cube_r145", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -25.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-27.4481F, -32.7722F, -64.0722F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r146 = main_tail.addOrReplaceChild("cube_r146", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -25.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-27.4481F, -21.7722F, -6.0722F, 0.0F, 0.0F, -0.3927F));

		PartDefinition cube_r147 = main_tail.addOrReplaceChild("cube_r147", CubeListBuilder.create().texOffs(749, 35).mirror().addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)).mirror(false), PartPose.offsetAndRotation(-35.4481F, 20.2278F, -39.0722F, 0.0F, 0.0F, -2.3998F));

		PartDefinition cube_r148 = main_tail.addOrReplaceChild("cube_r148", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -25.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(27.2919F, -21.7722F, -6.0722F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r149 = main_tail.addOrReplaceChild("cube_r149", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -25.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(27.2919F, -32.7722F, -64.0722F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r150 = main_tail.addOrReplaceChild("cube_r150", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -25.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(-47.7081F, 6.2878F, 44.9278F, 0.0F, 0.0F, -1.5708F));

		PartDefinition cube_r151 = main_tail.addOrReplaceChild("cube_r151", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -25.5F, -61.5F, 3.0F, 51.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(48.2919F, 6.2278F, 44.9278F, 0.0F, 0.0F, 1.5708F));

		PartDefinition cube_r152 = main_tail.addOrReplaceChild("cube_r152", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(0.2919F, 25.2278F, 17.9278F, 0.0F, 0.0F, -3.1416F));

		PartDefinition cube_r153 = main_tail.addOrReplaceChild("cube_r153", CubeListBuilder.create().texOffs(749, 35).addBox(-1.5F, -38.5F, -61.5F, 3.0F, 77.0F, 123.0F, new CubeDeformation(-0.9F)), PartPose.offsetAndRotation(35.2919F, 20.2278F, -39.0722F, 0.0F, 0.0F, 2.3998F));

		PartDefinition hitbox = partdefinition.addOrReplaceChild("hitbox", CubeListBuilder.create().texOffs(-19, 234).addBox(-50.4F, -125.0F, -452.6F, 100.0F, 100.0F, 1800.0F, new CubeDeformation(0.0F)), PartPose.offset(0.4F, 37.0F, -200.4F));

		return LayerDefinition.create(meshdefinition, 2048, 2048);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(netHeadYaw, headPitch, ageInTicks);

		// animations
		this.animate(((BakunawaBoss) entity).idleAnimationState, BakunawaAnimations.idle, ageInTicks, 1f);
		this.animate(((BakunawaBoss) entity).swimAnimationState, BakunawaAnimations.swim, ageInTicks, 2f);
		this.animate(((BakunawaBoss) entity).deathAnimationState, BakunawaAnimations.death, ageInTicks, 0f);
	}

	private void applyHeadRotation(float pNetHeadYaw, float pHeadPitch, float pAgeInTicks) {
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0F, 30.0F);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0F, 45.0F);

		this.head.yRot = pNetHeadYaw * ((float)Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float)Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		bakunawa.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		hitbox.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return bakunawa;
	}
}