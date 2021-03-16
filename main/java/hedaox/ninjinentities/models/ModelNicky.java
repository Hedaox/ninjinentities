package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelNicky extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer HeadChild_15;
	private final ModelRenderer HeadChild_16;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Body;
	private final ModelRenderer bone4;
	private final ModelRenderer RArm;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer bone;
	private final ModelRenderer LLeg;
	private final ModelRenderer bone5;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelNicky(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));
		Head.cubeList.add(new ModelBox(Head, 0, 86, -4.0F, -10.0F, -4.0F, 8, 10, 8, 0.5F));

		HeadChild_15 = new ModelRenderer(this);
		HeadChild_15.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_15, 0.0F, 0.5236F, 0.0F);
		Head.addChild(HeadChild_15);
		HeadChild_15.cubeList.add(new ModelBox(HeadChild_15, 12, 39, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		HeadChild_16 = new ModelRenderer(this);
		HeadChild_16.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_16, 0.0F, -0.5236F, 0.0F);
		Head.addChild(HeadChild_16);
		HeadChild_16.cubeList.add(new ModelBox(HeadChild_16, 32, 16, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(0.0F, -8.0F, -4.0F);
		setRotationAngle(Hair1, -0.1745F, 0.0F, 0.0F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 51, 83, -3.0F, -4.0F, 0.0F, 6, 4, 8, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-2.6875F, -7.0F, -4.0F);
		setRotationAngle(Hair2, -0.1745F, 0.0F, -0.733F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 51, 83, -2.0F, -3.0F, 0.0F, 5, 3, 8, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(2.6875F, -7.0F, -4.0F);
		setRotationAngle(Hair3, -0.1745F, 0.0F, 0.733F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 51, 83, -3.0F, -3.0F, 0.0F, 5, 3, 8, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 0, 29, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 27, 27, -4.7F, -6.0F, -2.2F, 9, 11, 5, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 27, 11, -4.7F, 4.6875F, -2.2F, 9, 5, 5, 0.0F));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bone4, 0.1745F, 0.0F, 0.0F);
		Body.addChild(bone4);

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 16, 53, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));
		RArm.cubeList.add(new ModelBox(RArm, 44, 44, -4.7512F, 0.8794F, -2.4F, 5, 8, 5, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(-1.0F, 0.0F, -0.6F);
		RArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 18, 43, -6.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 3, 3, -5.2795F, -5.5857F, -2.0F, 1, 3, 1, 0.0F));
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 0, 0, -2.2945F, -5.8852F, 0.0F, 1, 3, 1, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 55, 6, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(9.0F, 0.0F, -0.5F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 32, 0, -1.0F, -3.0F, -3.0F, 7, 4, 6, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 4, 16, 4.2745F, -5.4858F, -2.0F, 1, 3, 1, 0.0F));
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 16, 1.2895F, -5.7853F, 0.0F, 1, 3, 1, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 45, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0F, 0.0F, 0.0F);
		setRotationAngle(bone, 0.0F, 0.0F, 0.2618F);
		RLeg.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 0, -3.0F, 6.2805F, -1.0F, 2, 1, 1, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 32, 53, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(-2.0F, 1.0F, 0.0F);
		setRotationAngle(bone5, 0.0F, 0.0F, -0.1745F);
		LLeg.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 0, 6.0F, 6.0F, -1.0F, 3, 1, 1, 0.0F));
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