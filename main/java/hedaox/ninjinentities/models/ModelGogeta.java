package hedaox.ninjinentities.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelGogeta extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Hair4;
	private final ModelRenderer Hair5;
	private final ModelRenderer Hair6;
	private final ModelRenderer Hair7;
	private final ModelRenderer Hair8;
	private final ModelRenderer Hair9;
	private final ModelRenderer Hair10;
	private final ModelRenderer Hair11;
	private final ModelRenderer Strand2;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer Belt;
	private final ModelRenderer Belt2;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelGogeta(float _scale) {
		textureWidth = 64;
		textureHeight = 32;
		
		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-1.0F, -9.0F, 0.0F);
		setRotationAngle(Hair1, -0.0873F, 0.0F, -0.1745F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 42, 2, -0.5133F, -5.474F, -2.0714F, 4, 8, 4, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-3.0F, -10.0F, 0.0F);
		setRotationAngle(Hair2, 0.0F, 0.0F, 0.2618F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 45, 2, 0.0603F, -2.658F, -3.0F, 3, 6, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(Hair3, 0.0F, 0.0F, -0.0873F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 45, 2, 0.0603F, -3.342F, -3.0F, 3, 6, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(2.0F, -7.0F, 0.0F);
		setRotationAngle(Hair4, 0.0F, 0.0873F, 0.2618F);
		Head.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 45, 2, 1.0603F, -4.342F, -3.0F, 2, 7, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-5.0F, -6.0F, -2.0F);
		setRotationAngle(Hair5, 2.7925F, 0.0873F, -0.6109F);
		Head.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 8, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair6, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 45, 2, 1.8099F, -4.1257F, -3.2188F, 3, 7, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(Hair7, -0.3491F, 0.0F, 0.5236F);
		Head.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 45, 2, 1.8099F, -2.4417F, -5.0982F, 3, 6, 5, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(-5.0F, -7.0F, 2.0F);
		setRotationAngle(Hair8, 2.7925F, 0.0873F, -0.4363F);
		Head.addChild(Hair8);
		Hair8.cubeList.add(new ModelBox(Hair8, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(3.0F, -8.0F, 2.0F);
		setRotationAngle(Hair9, 2.7925F, 0.0873F, 0.5236F);
		Head.addChild(Hair9);
		Hair9.cubeList.add(new ModelBox(Hair9, 45, 2, -0.0028F, -3.971F, -3.2188F, 3, 6, 3, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(0.0F, -2.0F, 6.0F);
		setRotationAngle(Hair10, -0.5236F, 0.3491F, 0.0F);
		Head.addChild(Hair10);
		Hair10.cubeList.add(new ModelBox(Hair10, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(-4.0F, -2.0F, 4.0F);
		setRotationAngle(Hair11, -0.5236F, -0.2618F, 0.0F);
		Head.addChild(Hair11);
		Hair11.cubeList.add(new ModelBox(Hair11, 38, 2, 0.9972F, -4.6289F, -4.1585F, 3, 7, 3, 0.0F));

		Strand2 = new ModelRenderer(this);
		Strand2.setRotationPoint(0.0F, -5.0F, -2.0F);
		setRotationAngle(Strand2, -0.3491F, 0.0F, -0.4363F);
		Head.addChild(Strand2);
		Strand2.cubeList.add(new ModelBox(Strand2, 38, 2, 1.9972F, -1.971F, -3.2188F, 2, 4, 2, 0.0F));
		
		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
		
		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(-0.8F, -1.6F, -2.2F);
		setRotationAngle(Belt, -0.0698F, 0.0873F, 0.0F);
		RLeg.addChild(Belt);
		Belt.cubeList.add(new ModelBox(Belt, 56, 20, -1.2857F, -1.145F, -0.1004F, 2, 8, 0, 0.0F));

		Belt2 = new ModelRenderer(this);
		Belt2.setRotationPoint(-0.8F, -1.6F, -2.2F);
		setRotationAngle(Belt2, -0.0698F, 1.2217F, 0.0F);
		RLeg.addChild(Belt2);
		Belt2.cubeList.add(new ModelBox(Belt2, 56, 20, -2.2857F, -1.145F, -1.1004F, 2, 8, 0, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scale, this.scale, this.scale);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scale/0.45F,1.88F)))), 0.0F);
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
