package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

import org.lwjgl.opengl.GL11;

public class ModelBroly extends ModelBase {
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
	private final ModelRenderer Hair12;
	private final ModelRenderer Hair13;
	private final ModelRenderer Hair14;
	private final ModelRenderer Hair15;
	private final ModelRenderer Hair16;
	private final ModelRenderer Hair17;
	private final ModelRenderer Strand1;
	private final ModelRenderer Strand2;
	private final ModelRenderer Strand3;
	private final ModelRenderer Body;
	private final ModelRenderer Ba;
	private final ModelRenderer BaKnot1;
	private final ModelRenderer BaKnot2;
	private final ModelRenderer RArm;
	private final ModelRenderer RShoulderArmor;
	private final ModelRenderer LArm;
	private final ModelRenderer LShoulderArmor;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelBroly(float _scale) {
		textureWidth = 128;
		textureHeight = 64;

		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Hair1 = new ModelRenderer(this);
		Hair1.setRotationPoint(0.0F, -11.0F, 1.0F);
		setRotationAngle(Hair1, 0.5236F, 0.4363F, 0.6109F);
		Head.addChild(Hair1);
		Hair1.cubeList.add(new ModelBox(Hair1, 45, 2, 0.0603F, -3.658F, -3.0F, 3, 7, 3, 0.0F));

		Hair2 = new ModelRenderer(this);
		Hair2.setRotationPoint(-5.0F, -10.0F, 0.0F);
		setRotationAngle(Hair2, -0.7854F, 0.0F, 1.1345F);
		Head.addChild(Hair2);
		Hair2.cubeList.add(new ModelBox(Hair2, 45, 2, 1.0603F, -3.658F, -3.0F, 2, 7, 3, 0.0F));

		Hair3 = new ModelRenderer(this);
		Hair3.setRotationPoint(5.0F, -10.0F, 0.0F);
		setRotationAngle(Hair3, -0.7854F, 0.0F, -1.1345F);
		Head.addChild(Hair3);
		Hair3.cubeList.add(new ModelBox(Hair3, 45, 2, -3.0603F, -3.658F, -3.0F, 2, 7, 3, 0.0F));

		Hair4 = new ModelRenderer(this);
		Hair4.setRotationPoint(2.0F, -7.0F, 4.0F);
		setRotationAngle(Hair4, 0.1745F, 0.0873F, 0.2618F);
		Head.addChild(Hair4);
		Hair4.cubeList.add(new ModelBox(Hair4, 45, 2, -3.82F, -7.1704F, -3.4271F, 2, 7, 3, 0.0F));

		Hair5 = new ModelRenderer(this);
		Hair5.setRotationPoint(-2.0F, -7.0F, 1.0F);
		setRotationAngle(Hair5, 2.7925F, 0.0873F, -2.0072F);
		Head.addChild(Hair5);
		Hair5.cubeList.add(new ModelBox(Hair5, 45, 2, 0.1736F, -2.8054F, -2.4469F, 3, 7, 3, 0.0F));

		Hair6 = new ModelRenderer(this);
		Hair6.setRotationPoint(2.0F, -7.0F, 1.0F);
		setRotationAngle(Hair6, 2.7925F, -0.0873F, 2.0072F);
		Head.addChild(Hair6);
		Hair6.cubeList.add(new ModelBox(Hair6, 45, 2, -3.1736F, -2.8054F, -2.4469F, 3, 7, 3, 0.0F));

		Hair7 = new ModelRenderer(this);
		Hair7.setRotationPoint(-1.0F, -10.0F, 4.0F);
		setRotationAngle(Hair7, -0.3491F, 0.0F, 0.5236F);
		Head.addChild(Hair7);
		Hair7.cubeList.add(new ModelBox(Hair7, 45, 2, 1.8099F, -3.4417F, -5.0982F, 3, 7, 3, 0.0F));

		Hair8 = new ModelRenderer(this);
		Hair8.setRotationPoint(1.0F, -10.0F, 4.0F);
		setRotationAngle(Hair8, -0.3491F, 0.0F, -0.5236F);
		Head.addChild(Hair8);
		Hair8.cubeList.add(new ModelBox(Hair8, 45, 2, -4.8099F, -3.4417F, -5.0982F, 3, 7, 3, 0.0F));

		Hair9 = new ModelRenderer(this);
		Hair9.setRotationPoint(6.0F, -7.0F, 2.0F);
		setRotationAngle(Hair9, 2.7925F, 0.0873F, 2.4435F);
		Head.addChild(Hair9);
		Hair9.cubeList.add(new ModelBox(Hair9, 45, 2, 0.3618F, -3.6765F, -2.7815F, 3, 7, 3, 0.0F));

		Hair10 = new ModelRenderer(this);
		Hair10.setRotationPoint(-6.0F, -7.0F, 2.0F);
		setRotationAngle(Hair10, 2.7925F, -0.0873F, -2.4435F);
		Head.addChild(Hair10);
		Hair10.cubeList.add(new ModelBox(Hair10, 45, 2, -3.3618F, -3.6765F, -2.7815F, 3, 7, 3, 0.0F));

		Hair11 = new ModelRenderer(this);
		Hair11.setRotationPoint(-3.0F, -5.0F, 1.0F);
		setRotationAngle(Hair11, -2.3562F, -0.5236F, 0.0F);
		Head.addChild(Hair11);
		Hair11.cubeList.add(new ModelBox(Hair11, 38, 2, 0.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

		Hair12 = new ModelRenderer(this);
		Hair12.setRotationPoint(4.0F, -5.0F, 1.0F);
		setRotationAngle(Hair12, -2.5307F, 0.2618F, 0.0F);
		Head.addChild(Hair12);
		Hair12.cubeList.add(new ModelBox(Hair12, 38, 2, -3.9972F, -5.6289F, -4.1585F, 3, 8, 3, 0.0F));

		Hair13 = new ModelRenderer(this);
		Hair13.setRotationPoint(7.5F, -8.2F, 2.4F);
		setRotationAngle(Hair13, -0.2618F, -0.2618F, 2.8798F);
		Head.addChild(Hair13);
		Hair13.cubeList.add(new ModelBox(Hair13, 38, 2, 1.9972F, -4.6289F, -4.1585F, 2, 7, 3, 0.0F));

		Hair14 = new ModelRenderer(this);
		Hair14.setRotationPoint(-7.5F, -8.2F, 2.4F);
		setRotationAngle(Hair14, -0.2618F, 0.2618F, -2.8798F);
		Head.addChild(Hair14);
		Hair14.cubeList.add(new ModelBox(Hair14, 38, 2, -3.9972F, -4.6289F, -4.1585F, 2, 7, 3, 0.0F));

		Hair15 = new ModelRenderer(this);
		Hair15.setRotationPoint(3.5F, -3.2F, 7.4F);
		setRotationAngle(Hair15, 0.3491F, 0.0F, 0.0F);
		Head.addChild(Hair15);
		Hair15.cubeList.add(new ModelBox(Hair15, 38, 2, -4.9972F, -6.6289F, -4.1585F, 3, 9, 3, 0.0F));

		Hair16 = new ModelRenderer(this);
		Hair16.setRotationPoint(-0.5F, 0.8F, 7.4F);
		setRotationAngle(Hair16, 0.3491F, 0.0F, 0.5236F);
		Head.addChild(Hair16);
		Hair16.cubeList.add(new ModelBox(Hair16, 38, 2, -4.9972F, -6.6289F, -4.1585F, 3, 7, 3, 0.0F));

		Hair17 = new ModelRenderer(this);
		Hair17.setRotationPoint(0.5F, 0.8F, 7.4F);
		setRotationAngle(Hair17, 0.3491F, 0.0F, -0.5236F);
		Head.addChild(Hair17);
		Hair17.cubeList.add(new ModelBox(Hair17, 38, 2, 1.9972F, -6.6289F, -4.1585F, 3, 7, 3, 0.0F));

		Strand1 = new ModelRenderer(this);
		Strand1.setRotationPoint(-2.0F, -8.0F, -2.0F);
		setRotationAngle(Strand1, -0.3491F, -0.0873F, 0.2618F);
		Head.addChild(Strand1);
		Strand1.cubeList.add(new ModelBox(Strand1, 38, 2, 0.583F, -0.6421F, -2.7351F, 2, 4, 2, 0.0F));

		Strand2 = new ModelRenderer(this);
		Strand2.setRotationPoint(0.0F, -5.0F, -2.5F);
		setRotationAngle(Strand2, -0.3491F, -0.1745F, -0.7854F);
		Head.addChild(Strand2);
		Strand2.cubeList.add(new ModelBox(Strand2, 38, 2, 1.9972F, -1.6421F, -2.7351F, 2, 5, 2, 0.0F));

		Strand3 = new ModelRenderer(this);
		Strand3.setRotationPoint(-5.0F, -10.0F, -2.5F);
		setRotationAngle(Strand3, -0.3491F, -0.1745F, 0.6981F);
		Head.addChild(Strand3);
		Strand3.cubeList.add(new ModelBox(Strand3, 38, 2, 1.9972F, -0.6421F, -2.7351F, 2, 4, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		Ba = new ModelRenderer(this);
		Ba.setRotationPoint(7.3F, 13.0F, -7.0F);
		Body.addChild(Ba);
		Ba.cubeList.add(new ModelBox(Ba, 63, 16, -8.0F, -10.0F, 0.8F, 9, 10, 5, 0.0F));
		
		BaKnot1 = new ModelRenderer(this);
		BaKnot1.setRotationPoint(2.3F, 5.4F, -6.7F);
		setRotationAngle(BaKnot1, -0.2618F, 3.1416F, -2.0071F);
		Body.addChild(BaKnot1);
		BaKnot1.cubeList.add(new ModelBox(BaKnot1, 57, 20, -2.0F, -2.0F, -0.1F, 2, 4, 0, 0.0F));

		BaKnot2 = new ModelRenderer(this);
		BaKnot2.setRotationPoint(5.5F, 4.5F, -6.5F);
		setRotationAngle(BaKnot2, -0.2618F, 0.0F, -0.9599F);
		Body.addChild(BaKnot2);
		BaKnot2.cubeList.add(new ModelBox(BaKnot2, 58, 20, -1.6723F, -2.2216F, -0.1594F, 2, 4, 0, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RShoulderArmor = new ModelRenderer(this);
		RShoulderArmor.setRotationPoint(-7.0F, -1.7F, 4.0F);
		setRotationAngle(RShoulderArmor, -1.5708F, 0.0F, 0.1047F);
		RArm.addChild(RShoulderArmor);
		RShoulderArmor.cubeList.add(new ModelBox(RShoulderArmor, 24, 0, 0.9781F, 1.0F, -1.418F, 6, 6, 2, 0.0F));
		
		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LShoulderArmor = new ModelRenderer(this);
		LShoulderArmor.setRotationPoint(7.0F, -1.7F, 4.0F);
		LShoulderArmor.mirror = true;
		setRotationAngle(LShoulderArmor, -1.5708F, 0.0F, -0.1047F);
		LArm.addChild(LShoulderArmor);
		LShoulderArmor.cubeList.add(new ModelBox(LShoulderArmor, 24, 0, -6.9781F, 1.0F, -1.418F, 6, 6, 2, 0.0F));
		
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
