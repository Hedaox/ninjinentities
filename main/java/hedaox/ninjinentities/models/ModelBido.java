package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelBido extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer headhair;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair3;
	private final ModelRenderer Body;
	private final ModelRenderer bb_main;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer LLeg;
	private final ModelRenderer RLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelBido(float _scaleX, float _scaleY, float _scaleZ) {
		textureWidth = 64;
		textureHeight = 64;

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 30, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarR, 0.0F, -0.5236F, 0.0F);
		Head.addChild(EarR);
		EarR.mirror = true;
		EarR.cubeList.add(new ModelBox(EarR, 25, 19, -4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(EarL, 0.0F, 0.5236F, 0.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 25, 19, 4.0F, -8.0F, -1.0F, 0, 6, 6, 0.0F));

		headhair = new ModelRenderer(this);
		headhair.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headhair);
		headhair.cubeList.add(new ModelBox(headhair, 0, 0, -5.0F, -9.0F, -5.0F, 10, 9, 10, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(1.0F, -8.0F, 0.0F);
		setRotationAngle(Hair1, 0.7854F, 0.3491F, -0.6109F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 0, 0, -2.0F, -4.0F, 0.0F, 2, 5, 2, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(0.0F, -7.0F, -2.0F);
		setRotationAngle(Hair2, 1.3963F, 0.5236F, 0.3491F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 0, 0, -2.0F, -4.0F, 0.0F, 2, 5, 2, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(1.0F, -7.0F, 3.0F);
		setRotationAngle(Hair3, 0.7854F, 0.3491F, -0.0873F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 0, 0, -1.658F, -4.6645F, -1.6645F, 2, 4, 3, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 32, 32, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(-0.2F, 18.6F, 0.2F);
		Body.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 34, 49, -4.5F, -14.6F, -2.4F, 9, 7, 5, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 0, 46, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 16, 46, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 40, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 40, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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
