package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelAndroid15 extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer headhair;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer SkiltR;
	private final ModelRenderer LLeg;
	private final ModelRenderer SkiltL;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelAndroid15(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 30, -4.0F, -4.0F, -4.0F, 8, 8, 8, 0.0F));

		headhair = new ModelRenderer(this);
		headhair.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(headhair);
		headhair.cubeList.add(new ModelBox(headhair, 0, 1, -5.0F, -5.0F, -5.0F, 10, 3, 10, 0.0F));
		headhair.cubeList.add(new ModelBox(headhair, 0, 24, -2.0F, -6.0F, -2.0F, 4, 1, 4, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 32, 32, -4.2F, -1.4F, -1.8F, 8, 10, 4, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -4.2F, 0.0F, -2.0F, 8, 3, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 0, 46, -4.0F, 2.0F, -2.0F, 4, 10, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 16, 46, 8.0F, 2.0F, -2.0F, 4, 10, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 40, 0, -2.0F, 2.0F, -2.0F, 4, 10, 4, 0.0F));

		SkiltR = new ModelRenderer(this);
		SkiltR.setRotationPoint(2.0F, 12.0F, 0.0F);
		RLeg.addChild(SkiltR);
		SkiltR.cubeList.add(new ModelBox(SkiltR, 34, 49, -4.5F, -10.6F, -2.4F, 5, 9, 5, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 40, 16, 2.0F, 2.0F, -2.0F, 4, 10, 4, 0.0F));

		SkiltL = new ModelRenderer(this);
		SkiltL.setRotationPoint(2.0F, 12.0F, 0.0F);
		LLeg.addChild(SkiltL);
		SkiltL.mirror = true;
		SkiltL.cubeList.add(new ModelBox(SkiltL, 34, 49, -1.0F, -10.6F, -2.4F, 5, 9, 5, 0.0F));
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