package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBrolyZBio extends ModelBase {
	private final ModelRenderer Body;
	private final ModelRenderer Head;
	private final ModelRenderer Hair_1;
	private final ModelRenderer Hair_18;
	private final ModelRenderer Hair_3;
	private final ModelRenderer Hair_19;
	private final ModelRenderer Hair_2;
	private final ModelRenderer Hair_16;
	private final ModelRenderer Hair_12;
	private final ModelRenderer Hair_17;
	private final ModelRenderer Hair_13;
	private final ModelRenderer Hair_9;
	private final ModelRenderer Hair_14;
	private final ModelRenderer Hair_5;
	private final ModelRenderer Hair_8;
	private final ModelRenderer Hair_6;
	private final ModelRenderer Hair_7;
	private final ModelRenderer Hair;
	private final ModelRenderer Hair_10;
	private final ModelRenderer Hair_11;
	private final ModelRenderer Hair_15;
	private final ModelRenderer Hair_4;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelBrolyZBio(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair_1 = new ModelRenderer(this);
		Hair_1.setRotationPoint(-4.0F, -11.0F, 0.0F);
		setRotationAngle(Hair_1, -0.7854F, 0.0F, 1.6581F);
		Head.addChild(Hair_1);

		Hair_18 = new ModelRenderer(this);
		Hair_18.setRotationPoint(0.0F, -5.0F, -2.5F);
		setRotationAngle(Hair_18, -0.3491F, -0.1745F, -0.7854F);
		Head.addChild(Hair_18);

		Hair_3 = new ModelRenderer(this);
		Hair_3.setRotationPoint(3.0F, -7.0F, 2.0F);
		setRotationAngle(Hair_3, -0.5236F, 0.0873F, 0.2618F);
		Head.addChild(Hair_3);

		Hair_19 = new ModelRenderer(this);
		Hair_19.setRotationPoint(-5.0F, -10.0F, -2.5F);
		setRotationAngle(Hair_19, -0.3491F, -0.1745F, 0.6981F);
		Head.addChild(Hair_19);

		Hair_2 = new ModelRenderer(this);
		Hair_2.setRotationPoint(4.0F, -11.0F, -1.0F);
		setRotationAngle(Hair_2, -0.6981F, 0.2618F, -1.9199F);
		Head.addChild(Hair_2);

		Hair_16 = new ModelRenderer(this);
		Hair_16.setRotationPoint(0.5F, 0.8F, 7.4F);
		setRotationAngle(Hair_16, 0.3491F, 0.0F, -0.5236F);
		Head.addChild(Hair_16);
		Hair_16.cubeList.add(new ModelBox(Hair_16, 40, 3, 1.9972F, -6.6289F, -4.1585F, 3, 7, 3, 0.0F));

		Hair_12 = new ModelRenderer(this);
		Hair_12.setRotationPoint(7.5F, -8.2F, 2.4F);
		setRotationAngle(Hair_12, -0.2618F, -0.2618F, 2.8798F);
		Head.addChild(Hair_12);
		Hair_12.cubeList.add(new ModelBox(Hair_12, 40, 3, 3.4302F, -6.1456F, -4.9624F, 2, 7, 3, 0.0F));

		Hair_17 = new ModelRenderer(this);
		Hair_17.setRotationPoint(-2.0F, -8.0F, -2.0F);
		setRotationAngle(Hair_17, -0.3491F, -0.0873F, 0.2618F);
		Head.addChild(Hair_17);

		Hair_13 = new ModelRenderer(this);
		Hair_13.setRotationPoint(-7.5F, -8.2F, 2.4F);
		setRotationAngle(Hair_13, -0.2618F, 0.2618F, -2.8798F);
		Head.addChild(Hair_13);
		Hair_13.cubeList.add(new ModelBox(Hair_13, 41, 3, -5.4302F, -6.1456F, -4.9624F, 2, 7, 3, 0.0F));

		Hair_9 = new ModelRenderer(this);
		Hair_9.setRotationPoint(-4.0F, -7.0F, 2.0F);
		setRotationAngle(Hair_9, 2.7925F, -0.0873F, -1.2217F);
		Head.addChild(Hair_9);

		Hair_14 = new ModelRenderer(this);
		Hair_14.setRotationPoint(3.5F, -3.2F, 7.4F);
		setRotationAngle(Hair_14, 0.3491F, 0.0F, 0.0F);
		Head.addChild(Hair_14);
		Hair_14.cubeList.add(new ModelBox(Hair_14, 40, 2, -4.9972F, -4.7495F, -4.8426F, 3, 9, 3, 0.0F));

		Hair_5 = new ModelRenderer(this);
		Hair_5.setRotationPoint(2.0F, -7.0F, 1.0F);
		setRotationAngle(Hair_5, 2.7925F, -0.0873F, 1.4836F);
		Head.addChild(Hair_5);

		Hair_8 = new ModelRenderer(this);
		Hair_8.setRotationPoint(4.0F, -7.0F, 2.0F);
		setRotationAngle(Hair_8, 2.7925F, 0.0873F, 1.2217F);
		Head.addChild(Hair_8);

		Hair_6 = new ModelRenderer(this);
		Hair_6.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(Hair_6, -0.3491F, 0.0F, 0.5236F);
		Head.addChild(Hair_6);

		Hair_7 = new ModelRenderer(this);
		Hair_7.setRotationPoint(1.0F, -10.0F, 4.0F);
		setRotationAngle(Hair_7, -0.3491F, 0.0F, -0.5236F);
		Head.addChild(Hair_7);

		Hair = new ModelRenderer(this);
		Hair.setRotationPoint(0.0F, -11.0F, 1.0F);
		setRotationAngle(Hair, 0.5236F, 0.4363F, 0.6109F);
		Head.addChild(Hair);

		Hair_10 = new ModelRenderer(this);
		Hair_10.setRotationPoint(-3.0F, -5.0F, 1.0F);
		setRotationAngle(Hair_10, -2.3562F, -0.5236F, 0.0F);
		Head.addChild(Hair_10);
		Hair_10.cubeList.add(new ModelBox(Hair_10, 40, 2, 0.9972F, -7.0431F, -2.7443F, 3, 8, 3, 0.0F));
		Hair_10.cubeList.add(new ModelBox(Hair_10, 41, 2, -0.0028F, -5.8184F, -1.5195F, 3, 8, 3, 0.0F));

		Hair_11 = new ModelRenderer(this);
		Hair_11.setRotationPoint(4.0F, -5.0F, 1.0F);
		setRotationAngle(Hair_11, -2.5307F, 0.2618F, 0.0F);
		Head.addChild(Hair_11);
		Hair_11.cubeList.add(new ModelBox(Hair_11, 41, 2, -3.9972F, -7.2672F, -3.0113F, 3, 8, 3, 0.0F));

		Hair_15 = new ModelRenderer(this);
		Hair_15.setRotationPoint(-0.5F, 0.8F, 7.4F);
		setRotationAngle(Hair_15, 0.3491F, 0.0F, 0.5236F);
		Head.addChild(Hair_15);
		Hair_15.cubeList.add(new ModelBox(Hair_15, 41, 3, -4.9972F, -6.6289F, -4.1585F, 3, 7, 3, 0.0F));

		Hair_4 = new ModelRenderer(this);
		Hair_4.setRotationPoint(-2.0F, -7.0F, 1.0F);
		setRotationAngle(Hair_4, 2.7925F, 0.0873F, -1.4836F);
		Head.addChild(Hair_4);

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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