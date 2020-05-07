package hedaox.ninjinentities.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelZamasu extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Hair1;
	private final ModelRenderer Hair2;
	private final ModelRenderer Hair6;
	private final ModelRenderer Strand1;
	private final ModelRenderer REar;
	private final ModelRenderer LEar;
	private final ModelRenderer REarring;
	private final ModelRenderer LEarring;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelZamasu(float _scale) {
		textureWidth = 64;
		textureHeight = 32;
		
		scale = _scale;
		Head = new ModelRenderer(this);
		Head.setRotationPoint(1.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -5.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(-1.0F, -11.0F, 3.0F);
		setRotationAngle(Hair1, -0.3491F, 0.0F, -0.7854F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 45, 2, -3.9397F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-3.0F, -9.0F, 1.0F);
		setRotationAngle(Hair2, -0.4363F, 0.0F, -0.2618F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 45, 2, 0.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(-5.0F, -7.0F, 4.0F);
		setRotationAngle(Hair6, -0.6109F, 0.0F, -0.4363F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 45, 2, 1.8099F, -4.1257F, -2.2188F, 3, 7, 3, 0.0F));

		Strand1 = new ModelRenderer(this);
		Strand1.setRotationPoint(-2.0F, -10.0F, -2.0F);
		setRotationAngle(Strand1, -1.1345F, -1.2218F, 1.5708F);
		Head.addChild(Strand1);
		Strand1.cubeList.add(new ModelBox(Strand1, 38, 2, -2.417F, 1.3579F, -1.7351F, 2, 7, 2, 0.0F));

		REar = new ModelRenderer(this);
		REar.setRotationPoint(-5.0F, -4.0F, 0.0F);
		setRotationAngle(REar, 0.1745F, -0.5236F, 0.0F);
		Head.addChild(REar);
		REar.cubeList.add(new ModelBox(REar, 0, 0, -0.2F, -2.0F, -1.0F, 0, 4, 4, 0.0F));

		LEar = new ModelRenderer(this);
		LEar.setRotationPoint(3.0F, -4.0F, 0.0F);
		LEar.mirror = true;
		setRotationAngle(LEar, 0.1745F, 0.5236F, 0.0F);
		Head.addChild(LEar);
		LEar.cubeList.add(new ModelBox(LEar, 0, 0, 0.2F, -2.0F, -1.0F, 0, 4, 4, 0.0F));

		REarring = new ModelRenderer(this);
		REarring.setRotationPoint(-5.0F, -4.0F, 0.0F);
		setRotationAngle(REarring, 0.1745F, -0.5236F, 0.0F);
		Head.addChild(REarring);
		REarring.cubeList.add(new ModelBox(REarring, 50, 10, -0.5F, 1.0F, -1.0F, 0, 2, 2, 0.0F));

		LEarring = new ModelRenderer(this);
		LEarring.setRotationPoint(3.0F, -4.0F, 0.0F);
		LEarring.mirror = true;
		setRotationAngle(LEarring, 0.1745F, 0.5236F, 0.0F);
		Head.addChild(LEarring);
		LEarring.cubeList.add(new ModelBox(LEarring, 50, 10, 0.5F, 1.0F, -1.0F, 0, 2, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 41, 16, -3.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 41, 16, 0.0F, -2.0F, -2.0F, 3, 12, 4, 0.0F));

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
