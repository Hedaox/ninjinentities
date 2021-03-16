package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelHirudegarnPre extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer Bone;
	private final ModelRenderer globl_horns;
	private final ModelRenderer horns2_r1;
	private final ModelRenderer horns_r1;
	private final ModelRenderer horns;
	private final ModelRenderer horns2;
	private final ModelRenderer globl_horns2;
	private final ModelRenderer horns4_r1;
	private final ModelRenderer horns3_r1;
	private final ModelRenderer horns3;
	private final ModelRenderer horns4;
	private final ModelRenderer globl_horns3;
	private final ModelRenderer horns6_r1;
	private final ModelRenderer horns5_r1;
	private final ModelRenderer horns5;
	private final ModelRenderer horns6;
	private final ModelRenderer right_sleeve;
	private final ModelRenderer left_sleeve;
	private final ModelRenderer Tail;
	private final ModelRenderer Tail2;
	private final ModelRenderer bodyChildChild;
	private final ModelRenderer RArm;
	private final ModelRenderer RightGauntlet;
	private final ModelRenderer LArm;
	private final ModelRenderer bone;
	private final ModelRenderer RLeg;
	private final ModelRenderer RLeg2;
	private final ModelRenderer LLeg;
	private final ModelRenderer LeftLeg3;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelHirudegarnPre(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 256;
		textureHeight = 256;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 12.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 57, -5.0F, -52.0F, -13.0F, 10, 11, 13, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 15.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 66, 0, -8.0F, -49.0F, -4.0F, 16, 15, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 102, 29, -7.0F, -34.0F, -4.0F, 14, 5, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 98, 106, -6.0F, -29.0F, -4.0F, 12, 7, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 137, -2.0F, -23.0F, -4.0F, 4, 3, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 58, 131, -3.0F, -20.0F, -4.0F, 6, 3, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -8.0F, -57.0F, -8.0F, 16, 14, 17, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 120, -9.0F, -26.0F, -5.0F, 7, 7, 10, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 117, 42, 2.0F, -26.0F, -5.0F, 7, 7, 10, 0.0F));

		Bone = new ModelRenderer(this);
		Bone.setRotationPoint(2.0F, -48.0F, -4.0F);
		Body.addChild(Bone);
		Bone.cubeList.add(new ModelBox(Bone, 4, 3, -9.0F, -12.0F, -7.0F, 14, 15, 14, 0.0F));

		globl_horns = new ModelRenderer(this);
		globl_horns.setRotationPoint(-2.0F, -13.0F, -10.0F);
		Bone.addChild(globl_horns);

		horns2_r1 = new ModelRenderer(this);
		horns2_r1.setRotationPoint(-6.5F, -9.0F, 11.5F);
		setRotationAngle(horns2_r1, -0.829F, 0.0F, 0.0F);
		globl_horns.addChild(horns2_r1);

		horns_r1 = new ModelRenderer(this);
		horns_r1.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns_r1, -0.3054F, 0.0F, 0.0F);
		globl_horns.addChild(horns_r1);

		horns = new ModelRenderer(this);
		horns.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns, -0.3054F, 0.0F, 0.0F);
		globl_horns.addChild(horns);

		horns2 = new ModelRenderer(this);
		horns2.setRotationPoint(-6.5F, -9.0F, 11.5F);
		setRotationAngle(horns2, -0.829F, 0.0F, 0.0F);
		globl_horns.addChild(horns2);

		globl_horns2 = new ModelRenderer(this);
		globl_horns2.setRotationPoint(10.0F, -17.0F, -12.0F);
		Bone.addChild(globl_horns2);

		horns4_r1 = new ModelRenderer(this);
		horns4_r1.setRotationPoint(-6.5F, -6.0F, 11.5F);
		setRotationAngle(horns4_r1, -0.829F, 0.0F, 0.0F);
		globl_horns2.addChild(horns4_r1);

		horns3_r1 = new ModelRenderer(this);
		horns3_r1.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns3_r1, -0.3054F, 0.0F, 0.0F);
		globl_horns2.addChild(horns3_r1);

		horns3 = new ModelRenderer(this);
		horns3.setRotationPoint(-6.5F, -11.0F, 14.5F);
		setRotationAngle(horns3, -0.3054F, 0.0F, 0.0F);
		globl_horns2.addChild(horns3);

		horns4 = new ModelRenderer(this);
		horns4.setRotationPoint(-6.5F, -6.0F, 11.5F);
		setRotationAngle(horns4, -0.829F, 0.0F, 0.0F);
		globl_horns2.addChild(horns4);

		globl_horns3 = new ModelRenderer(this);
		globl_horns3.setRotationPoint(-3.0F, -17.0F, -12.0F);
		Bone.addChild(globl_horns3);

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

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(0.0F, -15.0F, 0.0F);
		setRotationAngle(Tail, -0.3491F, 0.0F, 0.0F);
		Body.addChild(Tail);
		Tail.cubeList.add(new ModelBox(Tail, 210, 54, -3.0F, -10.0611F, 1.3468F, 6, 5, 17, 0.0F));

		Tail2 = new ModelRenderer(this);
		Tail2.setRotationPoint(0.0F, -17.0F, 0.0F);
		setRotationAngle(Tail2, 0.5236F, 0.0F, 0.0F);
		Body.addChild(Tail2);
		Tail2.cubeList.add(new ModelBox(Tail2, 204, 0, -3.0F, 7.5096F, 14.4904F, 6, 5, 20, 0.0F));

		bodyChildChild = new ModelRenderer(this);
		bodyChildChild.setRotationPoint(0.0F, 0.0F, 0.0F);
		Tail2.addChild(bodyChildChild);
		bodyChildChild.cubeList.add(new ModelBox(bodyChildChild, 227, 56, -2.0F, 9.6436F, 34.8564F, 4, 2, 6, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-9.0F, -48.0F, 0.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.0873F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 46, 71, -8.0417F, -1.4786F, -4.0F, 7, 30, 8, 0.0F));

		RightGauntlet = new ModelRenderer(this);
		RightGauntlet.setRotationPoint(15.4237F, 50.2827F, 0.0F);
		RArm.addChild(RightGauntlet);
		RightGauntlet.cubeList.add(new ModelBox(RightGauntlet, 0, 174, -24.5785F, -33.9166F, -5.0F, 9, 11, 10, 0.0F));

		right_sleeve = new ModelRenderer(this);
		right_sleeve.setRotationPoint(5.9774F, 56.9573F, 0.0F);
		setRotationAngle(right_sleeve, 0.0F, 0.0F, 0.0436F);
		RArm.addChild(right_sleeve);
		right_sleeve.cubeList.add(new ModelBox(right_sleeve, 106, 94, -20.0F, -64.0F, 7.0F, 14, 5, 0, 0.0F));
		right_sleeve.cubeList.add(new ModelBox(right_sleeve, 106, 92, -20.0F, -64.0F, -7.0F, 14, 5, 0, 0.0F));
		right_sleeve.cubeList.add(new ModelBox(right_sleeve, 106, 81, -20.0F, -64.0F, -7.0F, 0, 5, 14, 0.0F));
		right_sleeve.cubeList.add(new ModelBox(right_sleeve, 36, 31, -20.0F, -64.0F, -7.0F, 14, 0, 14, 0.0F));
		right_sleeve.cubeList.add(new ModelBox(right_sleeve, 38, 45, -19.0F, -64.0F, -6.0F, 13, 14, 12, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(8.0F, -48.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.0873F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 76, 76, 2.0455F, -1.5658F, -4.0F, 7, 30, 8, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(-12.9545F, 56.4342F, 0.0F);
		LArm.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 174, 14.0F, -40.5671F, -5.0F, 9, 11, 10, 0.0F));

		left_sleeve = new ModelRenderer(this);
		left_sleeve.setRotationPoint(22.0264F, 54.8701F, 0.0F);
		setRotationAngle(left_sleeve, 0.0F, 0.0F, -0.0436F);
		LArm.addChild(left_sleeve);
		left_sleeve.cubeList.add(new ModelBox(left_sleeve, 106, 92, -22.0F, -63.0F, 7.0F, 14, 5, 0, 0.0F));
		left_sleeve.cubeList.add(new ModelBox(left_sleeve, 105, 92, -22.0F, -63.0F, -7.0F, 14, 5, 0, 0.0F));
		left_sleeve.cubeList.add(new ModelBox(left_sleeve, 66, 0, -22.0F, -63.0F, -7.0F, 0, 5, 14, 0.0F));
		left_sleeve.cubeList.add(new ModelBox(left_sleeve, 35, 31, -22.0F, -63.0F, -7.0F, 14, 0, 14, 0.0F));
		left_sleeve.cubeList.add(new ModelBox(left_sleeve, 36, 45, -21.0F, -63.0F, -6.0F, 13, 14, 12, 0.0F));
		left_sleeve.cubeList.add(new ModelBox(left_sleeve, 106, 80, -7.9111F, -63.0794F, -7.0F, 0, 5, 14, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-7.0F, -19.0F, -2.0F);
		setRotationAngle(RLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 97, 121, -3.0F, -0.5271F, -1.2162F, 6, 15, 6, 0.0F));

		RLeg2 = new ModelRenderer(this);
		RLeg2.setRotationPoint(-6.0F, 28.274F, 7.8195F);
		setRotationAngle(RLeg2, 0.1745F, 0.0F, 0.0F);
		RLeg.addChild(RLeg2);
		RLeg2.cubeList.add(new ModelBox(RLeg2, 129, 60, 3.0F, -16.2611F, -6.6831F, 6, 15, 6, 0.0F));
		RLeg2.cubeList.add(new ModelBox(RLeg2, 140, 120, 2.0F, -1.9051F, -8.8096F, 3, 1, 8, 0.0F));
		RLeg2.cubeList.add(new ModelBox(RLeg2, 26, 71, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
		RLeg2.cubeList.add(new ModelBox(RLeg2, 141, 121, 7.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(7.0F, -19.0F, -1.0F);
		setRotationAngle(LLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 97, 121, -3.0F, -0.3965F, -2.2076F, 6, 15, 6, 0.0F));

		LeftLeg3 = new ModelRenderer(this);
		LeftLeg3.setRotationPoint(-6.0F, 28.4046F, 6.8281F);
		setRotationAngle(LeftLeg3, 0.1745F, 0.0F, 0.0F);
		LLeg.addChild(LeftLeg3);
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 129, 60, 3.0F, -16.2611F, -6.6831F, 6, 15, 6, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 140, 120, 2.0F, -1.9051F, -8.8096F, 3, 1, 8, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 26, 71, 5.0F, -2.8182F, -6.8171F, 2, 2, 7, 0.0F));
		LeftLeg3.cubeList.add(new ModelBox(LeftLeg3, 141, 121, 7.0F, -1.9051F, -8.8096F, 3, 1, 7, 0.0F));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		Head.render(f5);
		Body.render(f5);
		GL11.glPopMatrix();
		//this.Head.rotateAngleY = f3 / (180F / (float)Math.PI);
		//this.Head.rotateAngleX = f4 / (180F / (float)Math.PI);
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