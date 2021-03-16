package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSansho extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer HeadChild_6;
	private final ModelRenderer HeadChild_14;
	private final ModelRenderer HeadChild_3;
	private final ModelRenderer HeadChild;
	private final ModelRenderer HeadChild_5;
	private final ModelRenderer HeadChild_7;
	private final ModelRenderer HeadChild_4;
	private final ModelRenderer HeadChild_13;
	private final ModelRenderer HeadChild_12;
	private final ModelRenderer HeadChild_2;
	private final ModelRenderer HeadChild_9;
	private final ModelRenderer HeadChild_10;
	private final ModelRenderer HeadChild_1;
	private final ModelRenderer HeadChild_8;
	private final ModelRenderer HeadChild_11;
	private final ModelRenderer HeadChild_15;
	private final ModelRenderer HeadChild_16;
	private final ModelRenderer Body;
	private final ModelRenderer Cape;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer bone;
	private final ModelRenderer LLeg;
	private final ModelRenderer bone2;
	private final ModelRenderer bone3;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelSansho(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 2, 0, 4.0F, -1.0F, -4.0F, 0, 7, 1, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -1.0F, -4.0F, 0, 7, 1, 0.0F));

		HeadChild_6 = new ModelRenderer(this);
		HeadChild_6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(HeadChild_6, -0.3491F, 0.0F, 0.6982F);
		Head.addChild(HeadChild_6);

		HeadChild_14 = new ModelRenderer(this);
		HeadChild_14.setRotationPoint(-6.0F, -7.5F, -0.9F);
		setRotationAngle(HeadChild_14, -0.3491F, 0.0F, 0.4363F);
		Head.addChild(HeadChild_14);

		HeadChild_3 = new ModelRenderer(this);
		HeadChild_3.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(HeadChild_3, 0.0F, 0.0873F, 0.7854F);
		Head.addChild(HeadChild_3);

		HeadChild = new ModelRenderer(this);
		HeadChild.setRotationPoint(-1.0F, -8.7F, 0.0F);
		setRotationAngle(HeadChild, -0.0873F, 0.0F, -0.6108F);
		Head.addChild(HeadChild);

		HeadChild_5 = new ModelRenderer(this);
		HeadChild_5.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(HeadChild_5, -0.3491F, 0.0F, -0.7854F);
		Head.addChild(HeadChild_5);

		HeadChild_7 = new ModelRenderer(this);
		HeadChild_7.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(HeadChild_7, 2.7925F, 0.0873F, -1.309F);
		Head.addChild(HeadChild_7);

		HeadChild_4 = new ModelRenderer(this);
		HeadChild_4.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(HeadChild_4, 2.7925F, 0.0873F, -1.1345F);
		Head.addChild(HeadChild_4);

		HeadChild_13 = new ModelRenderer(this);
		HeadChild_13.setRotationPoint(2.0F, -5.0F, -1.0F);
		setRotationAngle(HeadChild_13, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(HeadChild_13);

		HeadChild_12 = new ModelRenderer(this);
		HeadChild_12.setRotationPoint(0.0F, -5.0F, -2.0F);
		setRotationAngle(HeadChild_12, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(HeadChild_12);

		HeadChild_2 = new ModelRenderer(this);
		HeadChild_2.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(HeadChild_2, 0.0F, 0.0F, 0.6981F);
		Head.addChild(HeadChild_2);

		HeadChild_9 = new ModelRenderer(this);
		HeadChild_9.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(HeadChild_9, -0.5236F, 0.3491F, 0.0F);
		Head.addChild(HeadChild_9);

		HeadChild_10 = new ModelRenderer(this);
		HeadChild_10.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(HeadChild_10, -0.5236F, -0.2618F, 0.0F);
		Head.addChild(HeadChild_10);

		HeadChild_1 = new ModelRenderer(this);
		HeadChild_1.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(HeadChild_1, 0.0F, 0.0F, -0.6981F);
		Head.addChild(HeadChild_1);

		HeadChild_8 = new ModelRenderer(this);
		HeadChild_8.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(HeadChild_8, 2.7925F, 0.0873F, 0.9599F);
		Head.addChild(HeadChild_8);

		HeadChild_11 = new ModelRenderer(this);
		HeadChild_11.setRotationPoint(-4.0F, -8.0F, -2.0F);
		setRotationAngle(HeadChild_11, -0.3491F, 0.0F, 0.3491F);
		Head.addChild(HeadChild_11);

		HeadChild_15 = new ModelRenderer(this);
		HeadChild_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_15, 0.0F, 0.5236F, 0.0F);
		Head.addChild(HeadChild_15);
		HeadChild_15.cubeList.add(new ModelBox(HeadChild_15, 12, 26, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		HeadChild_16 = new ModelRenderer(this);
		HeadChild_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_16, 0.0F, -0.5236F, 0.0F);
		Head.addChild(HeadChild_16);
		HeadChild_16.cubeList.add(new ModelBox(HeadChild_16, 24, 14, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 0, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		Cape = new ModelRenderer(this);
		Cape.setRotationPoint(0.0F, -1.0F, 0.0F);
		setRotationAngle(Cape, 0.1745F, 0.0F, 0.0F);
		Body.addChild(Cape);
		Cape.cubeList.add(new ModelBox(Cape, 24, 24, -4.2F, -5.0F, 3.0F, 8, 23, 0, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(4.8F, -3.4F, -0.3F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		Body.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 26, 10, -1.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 24, 4, 4.2745F, -5.4858F, -2.0F, 1, 3, 1, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 16, 1.2895F, -5.7853F, 0.0F, 1, 3, 1, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(-5.2F, -3.4F, -0.4F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		Body.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 32, 0, -6.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 4, 0, -5.2795F, -5.5857F, -2.0F, 1, 3, 1, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 4, 4, -2.2945F, -5.8852F, 0.0F, 1, 3, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.0873F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 40, -3.9128F, -1.0038F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.0873F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 12, 44, 7.9128F, -1.0038F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 32, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 32, 0, -2.5F, 0.4F, -2.4F, 4, 5, 5, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.0873F);
		RLeg.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 24, 2, -3.091F, 8.9166F, 0.0F, 2, 1, 1, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 24, 0, -3.2653F, 6.9243F, 0.0F, 2, 1, 1, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 40, 20, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 32, 0, 2.5F, 0.4F, -2.4F, 4, 5, 5, 0.0F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(2.0F, 12.0F, 0.0F);
		setRotationAngle(bone2, 0.0F, 0.0F, -0.0873F);
		LLeg.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 20, 18, 4.0F, -3.0F, 0.0F, 2, 1, 1, 0.0F));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(2.0F, 10.0F, 0.0F);
		setRotationAngle(bone3, 0.0F, 0.0F, -0.0873F);
		LLeg.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 20, 16, 4.0F, -3.0F, 0.0F, 2, 1, 1, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
		this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
		this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
		this.RArm.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
		this.LArm.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
		this.RArm.rotateAngleZ = 0.0F;
		this.LArm.rotateAngleZ = 0.0F;
		this.RLeg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.LLeg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.RLeg.rotateAngleY = 0.0F;
		this.LLeg.rotateAngleY = 0.0F;
	}
	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}