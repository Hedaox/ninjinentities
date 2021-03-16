package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelCooler extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer EarR;
	private final ModelRenderer EarL;
	private final ModelRenderer Body;
	private final ModelRenderer Tail1;
	private final ModelRenderer Tail2;
	private final ModelRenderer Breasts;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelCooler(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		EarR = new ModelRenderer(this);
		EarR.setRotationPoint(-4.0F, -4.0F, -1.0F);
		Head.addChild(EarR);
		EarR.cubeList.add(new ModelBox(EarR, 0, 0, -1.0F, -1.0F, -1.0F, 1, 3, 2, 0.0F));

		EarL = new ModelRenderer(this);
		EarL.setRotationPoint(5.0F, -4.0F, -1.0F);
		Head.addChild(EarL);
		EarL.cubeList.add(new ModelBox(EarL, 0, 0, -1.0F, -1.0F, -1.0F, 1, 3, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		Tail1 = new ModelRenderer(this);
		Tail1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Tail1, -0.3491F, 0.0F, 0.0F);
		Body.addChild(Tail1);
		Tail1.cubeList.add(new ModelBox(Tail1, 32, 48, -2.0F, 7.0F, 4.0F, 4, 4, 12, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, 0.3125F, 0.0F);
		setRotationAngle(Tail2, 0.5236F, 0.0F, 0.0F);
		Body.addChild(Tail2);
		Tail2.cubeList.add(new ModelBox(Tail2, 32, 48, -2.0F, 15.0F, 2.0F, 4, 4, 12, 0.0F));

		Breasts = new ModelRenderer(this);
		Breasts.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(Breasts, -0.1745F, 0.0F, 0.0F);
		Body.addChild(Breasts);
		Breasts.cubeList.add(new ModelBox(Breasts, 64, 12, -3.5F, 0.9566F, -1.6871F, 7, 4, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.0F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(2.0F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
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