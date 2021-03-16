package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelHirudegarnPost extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer bone3;
	private final ModelRenderer globl_horns;
	private final ModelRenderer globl_horns2;
	private final ModelRenderer horns3;
	private final ModelRenderer horns4;
	private final ModelRenderer globl_horns4;
	private final ModelRenderer horns2;
	private final ModelRenderer horns7;
	private final ModelRenderer globl_horns3;
	private final ModelRenderer horns6_r1;
	private final ModelRenderer horns5_r1;
	private final ModelRenderer horns5;
	private final ModelRenderer horns6;
	private final ModelRenderer Body;
	private final ModelRenderer bone;
	private final ModelRenderer bodyChild_7;
	private final ModelRenderer bodyChild_8;
	private final ModelRenderer bodyChildChild;
	private final ModelRenderer bodyChild_5;
	private final ModelRenderer bodyChild_2;
	private final ModelRenderer bodyChild_4;
	private final ModelRenderer bodyChild_3;
	private final ModelRenderer RArm;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer RightLeg3;
	private final ModelRenderer LLeg;
	private final ModelRenderer LeftLeg3;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelHirudegarnPost(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 256;
		textureHeight = 256;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(2.0F, -30.0F, -4.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -9.0F, -12.0F, -7.0F, 14, 15, 14, -1.0F));

		bone3 = new ModelRenderer(this);
		bone3.setRotationPoint(-2.0F, 57.0F, 4.0F);
		Head.addChild(bone3);
		bone3.cubeList.add(new ModelBox(bone3, 41, 127, -2.0F, -69.0F, -11.0F, 4, 4, 8, 0.0F));

		globl_horns = new ModelRenderer(this);
		globl_horns.setRotationPoint(-2.0F, -13.0F, -10.0F);
		Head.addChild(globl_horns);
		globl_horns.cubeList.add(new ModelBox(globl_horns, 18, 128, 3.0F, -3.0F, 6.0F, 3, 3, 4, 0.0F));
		globl_horns.cubeList.add(new ModelBox(globl_horns, 19, 129, -6.0F, -3.0F, 6.0F, 3, 3, 3, 0.0F));
		globl_horns.cubeList.add(new ModelBox(globl_horns, 69, 64, 2.0F, 0.0F, 6.0F, 5, 4, 4, 0.0F));
		globl_horns.cubeList.add(new ModelBox(globl_horns, 68, 64, -7.0F, 0.0F, 6.0F, 5, 4, 4, 0.0F));

		globl_horns2 = new ModelRenderer(this);
		globl_horns2.setRotationPoint(10.0F, -17.0F, -12.0F);
		Head.addChild(globl_horns2);

		horns3 = new ModelRenderer(this);
		horns3.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns3, -0.3054F, 0.0F, 0.0F);
		globl_horns2.addChild(horns3);
		horns3.cubeList.add(new ModelBox(horns3, 18, 128, -2.5F, 1.7456F, 2.1603F, 3, 5, 2, 0.0F));

		horns4 = new ModelRenderer(this);
		horns4.setRotationPoint(-6.5F, -6.0F, 11.5F);
		setRotationAngle(horns4, -0.829F, 0.0F, 0.0F);
		globl_horns2.addChild(horns4);
		horns4.cubeList.add(new ModelBox(horns4, 16, 125, -2.5F, -1.7373F, 3.4756F, 3, 9, 2, 0.0F));

		globl_horns4 = new ModelRenderer(this);
		globl_horns4.setRotationPoint(1.0F, -17.0F, -12.0F);
		Head.addChild(globl_horns4);

		horns2 = new ModelRenderer(this);
		horns2.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns2, -0.3054F, 0.0F, 0.0F);
		globl_horns4.addChild(horns2);
		horns2.cubeList.add(new ModelBox(horns2, 23, 128, -2.5F, 1.7456F, 2.1603F, 3, 5, 2, 0.0F));

		horns7 = new ModelRenderer(this);
		horns7.setRotationPoint(-6.5F, -6.0F, 11.5F);
		setRotationAngle(horns7, -0.829F, 0.0F, 0.0F);
		globl_horns4.addChild(horns7);
		horns7.cubeList.add(new ModelBox(horns7, 20, 126, -2.5F, -1.7373F, 3.4756F, 3, 9, 2, 0.0F));

		globl_horns3 = new ModelRenderer(this);
		globl_horns3.setRotationPoint(-3.0F, -17.0F, -12.0F);
		Head.addChild(globl_horns3);

		horns6_r1 = new ModelRenderer(this);
		horns6_r1.setRotationPoint(-6.5F, -9.0F, 11.5F);
		setRotationAngle(horns6_r1, -0.829F, 0.0F, 0.0F);
		globl_horns3.addChild(horns6_r1);

		horns5_r1 = new ModelRenderer(this);
		horns5_r1.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns5_r1, -0.3054F, 0.0F, 0.0F);
		globl_horns3.addChild(horns5_r1);

		horns5 = new ModelRenderer(this);
		horns5.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns5, -0.3054F, 0.0F, 0.0F);
		globl_horns3.addChild(horns5);

		horns6 = new ModelRenderer(this);
		horns6.setRotationPoint(-6.5F, -9.0F, 11.5F);
		setRotationAngle(horns6, -0.829F, 0.0F, 0.0F);
		globl_horns3.addChild(horns6);

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 15.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 60, 0, -8.0F, -46.0F, -4.0F, 16, 12, 8, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 9.0F, 0.0F);
		Body.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 56, 24, -7.0F, -43.0F, -4.0F, 14, 5, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 56, 64, -6.0F, -38.0F, -4.0F, 12, 7, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 134, 0, -2.0F, -32.0F, -4.0F, 4, 3, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 95, 71, -3.0F, -29.0F, -4.0F, 6, 3, 8, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 0, 80, -9.0F, -35.0F, -5.0F, 7, 7, 10, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 70, 79, 2.0F, -35.0F, -5.0F, 7, 7, 10, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 92, 149, -7.0F, -52.0F, 3.0F, 13, 4, 2, 0.0F));

		bodyChild_7 = new ModelRenderer(this);
		bodyChild_7.setRotationPoint(0.0F, -24.0F, 0.0F);
		setRotationAngle(bodyChild_7, -0.3491F, 0.0F, 0.0F);
		bone.addChild(bodyChild_7);
		bodyChild_7.cubeList.add(new ModelBox(bodyChild_7, 210, 54, -3.0F, -10.0611F, 1.3468F, 6, 5, 17, 0.0F));

		bodyChild_8 = new ModelRenderer(this);
		bodyChild_8.setRotationPoint(0.0F, -26.0F, 0.0F);
		setRotationAngle(bodyChild_8, 0.5236F, 0.0F, 0.0F);
		bone.addChild(bodyChild_8);
		bodyChild_8.cubeList.add(new ModelBox(bodyChild_8, 204, 0, -3.0F, 7.5096F, 14.4904F, 6, 5, 20, 0.0F));

		bodyChildChild = new ModelRenderer(this);
		bodyChildChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		bodyChild_8.addChild(bodyChildChild);
		bodyChildChild.cubeList.add(new ModelBox(bodyChildChild, 227, 56, -2.0F, 9.1436F, 33.9904F, 4, 2, 6, 0.0F));

		bodyChild_5 = new ModelRenderer(this);
		bodyChild_5.setRotationPoint(-4.0F, -13.0F, 0.0F);
		setRotationAngle(bodyChild_5, 0.1571F, -0.0349F, 0.3665F);
		Body.addChild(bodyChild_5);
		bodyChild_5.mirror = true;
		bodyChild_5.cubeList.add(new ModelBox(bodyChild_5, 118, 223, -16.4177F, -25.9507F, 8.6613F, 11, 33, 0, 0.0F));

		bodyChild_2 = new ModelRenderer(this);
		bodyChild_2.setRotationPoint(-21.0F, -13.0F, 0.0F);
		setRotationAngle(bodyChild_2, 0.1571F, -0.0349F, 0.8901F);
		Body.addChild(bodyChild_2);
		bodyChild_2.mirror = true;
		bodyChild_2.cubeList.add(new ModelBox(bodyChild_2, 0, 223, -16.4493F, -30.0006F, 10.3169F, 11, 33, 0, 0.0F));

		bodyChild_4 = new ModelRenderer(this);
		bodyChild_4.setRotationPoint(0.0F, -15.0F, 0.0F);
		setRotationAngle(bodyChild_4, 0.1571F, 0.0349F, -0.3665F);
		Body.addChild(bodyChild_4);
		bodyChild_4.cubeList.add(new ModelBox(bodyChild_4, 52, 223, 6.9702F, -23.0333F, 8.2728F, 12, 33, 0, 0.0F));

		bodyChild_3 = new ModelRenderer(this);
		bodyChild_3.setRotationPoint(20.0F, -18.0F, 0.0F);
		setRotationAngle(bodyChild_3, 0.1571F, 0.0349F, -0.8901F);
		Body.addChild(bodyChild_3);
		bodyChild_3.cubeList.add(new ModelBox(bodyChild_3, 175, 223, 1.5696F, -27.0346F, 9.7288F, 12, 33, 0, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-9.0F, -43.0F, 0.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.0873F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 32, 32, -6.1364F, -2.6492F, -4.0F, 7, 30, 8, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(8.7802F, 32.4418F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		RArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 0, 163, -24.0175F, -35.2881F, -4.0F, 15, 6, 11, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(8.0F, -43.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.0873F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 31, 0.1402F, -2.7364F, -4.0F, 7, 30, 8, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(-7.7802F, 32.4418F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 0, 183, 8.3714F, -35.5608F, -4.0F, 15, 6, 11, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-6.0F, -19.0F, -2.0F);
		setRotationAngle(RLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 34, 89, -4.0F, -0.8394F, -1.4501F, 6, 15, 6, 0.0F));

		RightLeg3 = new ModelRenderer(this);
		RightLeg3.setRotationPoint(-7.0F, 28.0129F, 8.8024F);
		setRotationAngle(RightLeg3, 0.1745F, 0.0F, 0.0F);
		RLeg.addChild(RightLeg3);
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 0, 29, 5.0F, -2.9738F, -7.771F, 2, 2, 7, 0.0F));
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 58, 96, 3.0F, -15.4166F, -7.637F, 6, 14, 6, 0.0F));
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 96, 129, 7.0F, -2.0607F, -9.7634F, 3, 1, 7, 0.0F));
		RightLeg3.cubeList.add(new ModelBox(RightLeg3, 96, 129, 2.0F, -2.0607F, -9.7634F, 3, 1, 7, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(7.0F, -19.0F, -2.0F);
		setRotationAngle(LLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 92, 39, -3.0F, -0.5271F, -1.2162F, 6, 15, 6, 0.0F));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(-6.0F, 28.274F, 7.8195F);
		setRotationAngle(LeftLeg3, 0.1745F, 0.0F, 0.0F);
		LLeg.addChild(LeftLeg3);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 82, 96, 3.0F, -16.2601F, -6.6395F, 6, 15, 6, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 96, 129, 2.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 96, 129, 7.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 238, 159, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 0, 29, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
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