package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelDrWheelo extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer bone2;
	private final ModelRenderer Body;
	private final ModelRenderer bone4;
	private final ModelRenderer bone5;
	private final ModelRenderer Spikes;
	private final ModelRenderer bone;
	private final ModelRenderer RArm;
	private final ModelRenderer right_glove;
	private final ModelRenderer right_gloove_addon;
	private final ModelRenderer right_glove2;
	private final ModelRenderer right_gloove_addon2;
	private final ModelRenderer LArm;
	private final ModelRenderer left_gloove;
	private final ModelRenderer right_gloove_addon3;
	private final ModelRenderer Left_glove3;
	private final ModelRenderer Left_gloove_addon4;
	private final ModelRenderer RLeg;
	private final ModelRenderer RightLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer LeftLeg2;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelDrWheelo(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 256;
		textureHeight = 256;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(2.0F, 2.0F, -4.0F);
		Head.cubeList.add(new ModelBox(Head, 47, 50, -10.0F, -34.0F, -11.0F, 16, 17, 11, 0.0F));

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(-2.0F, 22.0F, 4.0F);
		Head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 60, 109, -7.0F, -55.0F, -14.0F, 14, 16, 1, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 70, 25, -9.0F, -48.0F, -12.0F, 18, 13, 8, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 0, 61, -6.0F, -35.0F, -10.0F, 12, 3, 6, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 70, -8.0F, -48.0F, -4.0F, 16, 20, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 93, 63, -6.0F, -48.0F, 4.0F, 12, 10, 8, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 101, 0, -4.0F, -38.0F, 4.0F, 9, 5, 7, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 0, -9.0F, -60.0F, -12.0F, 18, 12, 21, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 34, 37, -7.0F, -57.0F, 9.0F, 14, 9, 4, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 57, 0, -7.0F, -64.0F, -9.0F, 14, 4, 16, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 15, 48, -3.0F, -26.0F, 3.0F, 5, 4, 9, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 0, 53, -3.0F, -44.0F, -16.0F, 5, 2, 1, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 48, 98, -7.0F, -28.0F, -3.0F, 13, 5, 6, 0.0F));
		Body.cubeList.add(new ModelBox(Body, 109, 88, -6.0F, -23.0F, -2.0F, 11, 3, 4, 0.0F));

		bone4 = new ModelRenderer(this);
		bone4.setRotationPoint(-0.5F, -22.0F, 28.0F);
		setRotationAngle(bone4, 0.6981F, 0.0F, 0.0F);
		Body.addChild(bone4);
		bone4.cubeList.add(new ModelBox(bone4, 8, 41, -2.5F, -14.2846F, -12.2567F, 5, 4, 16, 0.0F));

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.0F, -16.7014F, 6.0371F);
		setRotationAngle(bone5, 0.5236F, 0.0F, 0.0F);
		bone4.addChild(bone5);
		bone5.cubeList.add(new ModelBox(bone5, 0, 14, -1.5F, 1.0F, 17.0F, 3, 2, 5, 0.0F));
		bone5.cubeList.add(new ModelBox(bone5, 42, 50, 0.5F, 1.0F, 21.0F, 1, 2, 5, 0.0F));
		bone5.cubeList.add(new ModelBox(bone5, 0, 33, -2.5F, 0.0F, -6.0F, 5, 4, 24, 0.0F));

		Spikes = new ModelRenderer(this);
		Spikes.setRotationPoint(-6.0F, -52.0F, 15.0F);
		Body.addChild(Spikes);
		Spikes.cubeList.add(new ModelBox(Spikes, 34, 17, 1.0F, -14.0F, -24.0F, 0, 2, 16, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 0, 67, 1.0F, -21.0F, -24.0F, 0, 7, 3, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 12, 50, 1.0F, -24.0F, -22.0F, 0, 3, 3, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 0, 0, 1.0F, -19.0F, -19.0F, 0, 5, 3, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 49, 49, 1.0F, -22.0F, -17.0F, 0, 3, 3, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 0, 12, 1.0F, -17.0F, -14.0F, 0, 3, 2, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 10, 0, 1.0F, -19.0F, -13.0F, 0, 2, 2, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 0, 0, 1.0F, -16.0F, -10.0F, 0, 2, 1, 0.0F));
		Spikes.cubeList.add(new ModelBox(Spikes, 4, 0, 1.0F, -17.0F, -9.0F, 0, 1, 1, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(10.0F, 0.0F, 0.0F);
		Spikes.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 34, 19, 1.0F, -14.0F, -24.0F, 0, 2, 16, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 40, 67, 1.0F, -21.0F, -24.0F, 0, 7, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 0, 58, 1.0F, -24.0F, -22.0F, 0, 3, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 11, 11, 1.0F, -19.0F, -19.0F, 0, 5, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 18, 50, 1.0F, -22.0F, -17.0F, 0, 3, 3, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 17, 12, 1.0F, -17.0F, -14.0F, 0, 3, 2, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 0, 15, 1.0F, -19.0F, -13.0F, 0, 2, 2, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 2, 0, 1.0F, -16.0F, -10.0F, 0, 2, 1, 0.0F));
		bone.cubeList.add(new ModelBox(bone, 4, 1, 1.0F, -17.0F, -9.0F, 0, 1, 1, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-9.0F, -48.0F, -2.0F);
		setRotationAngle(RArm, 0.0F, 0.0F, 0.1309F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 86, 86, -6.9914F, 1.1305F, -2.0F, 6, 28, 7, 0.0F));
		RArm.cubeList.add(new ModelBox(RArm, 63, 110, -5.0F, -7.0F, -4.0F, 5, 10, 12, 0.0F));

		right_glove = new ModelRenderer(this);
		right_glove.setRotationPoint(-4.0513F, 3.1139F, 6.0F);
		setRotationAngle(right_glove, -1.5707F, 1.5272F, -1.5707F);
		RArm.addChild(right_glove);
		right_glove.cubeList.add(new ModelBox(right_glove, 134, 21, -1.0F, 22.0F, -2.0F, 1, 4, 4, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 20, 132, 0.0F, 22.0F, -3.0F, 1, 4, 6, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 116, 116, -1.0F, 11.8861F, -3.0F, 1, 11, 6, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 34, 46, -0.9487F, 5.0F, -2.0F, 0, 7, 4, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 142, 16, -1.0F, 0.0F, -1.0F, 1, 5, 2, 0.0F));
		right_glove.cubeList.add(new ModelBox(right_glove, 0, 0, 0.0F, 16.0F, -4.0F, 1, 6, 8, 0.0F));

		right_gloove_addon = new ModelRenderer(this);
		right_gloove_addon.setRotationPoint(0.0F, 0.0F, 1.0F);
		setRotationAngle(right_gloove_addon, 0.0F, 0.0F, -0.3491F);
		right_glove.addChild(right_gloove_addon);
		right_gloove_addon.cubeList.add(new ModelBox(right_gloove_addon, 16, 33, -10.0F, 24.0F, -2.0F, 1, 4, 2, 0.0F));
		right_gloove_addon.cubeList.add(new ModelBox(right_gloove_addon, 100, 46, -9.0F, 24.0F, -3.0F, 1, 4, 4, 0.0F));

		right_glove2 = new ModelRenderer(this);
		right_glove2.setRotationPoint(-4.6233F, 28.4135F, -3.0F);
		setRotationAngle(right_glove2, -1.5707F, -1.5272F, 1.5707F);
		RArm.addChild(right_glove2);
		right_glove2.cubeList.add(new ModelBox(right_glove2, 124, 95, -1.0F, -3.0F, -2.0F, 1, 2, 4, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 132, 124, 0.0F, -3.0F, -3.0F, 1, 2, 6, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 127, 6, -1.0F, -12.0F, -3.0F, 1, 9, 6, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 26, 120, 0.0F, -7.0F, -4.0F, 1, 4, 8, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 52, 126, 1.0F, -7.0F, -4.0F, 1, 3, 8, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 123, 48, 1.6319F, -7.0F, -3.0F, 4, 3, 6, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 114, 133, -1.0F, -17.0F, -2.0F, 1, 5, 4, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 122, 125, 6.0F, -7.0F, -4.0F, 1, 3, 8, 0.0F));
		right_glove2.cubeList.add(new ModelBox(right_glove2, 72, 78, -1.0F, -22.0F, -1.0F, 1, 5, 2, 0.0F));

		right_gloove_addon2 = new ModelRenderer(this);
		right_gloove_addon2.setRotationPoint(0.0F, 0.0F, -1.0F);
		setRotationAngle(right_gloove_addon2, 0.0F, 0.0F, -0.3491F);
		right_glove2.addChild(right_gloove_addon2);
		right_gloove_addon2.cubeList.add(new ModelBox(right_gloove_addon2, 0, 43, -1.0F, -1.0F, 0.0F, 1, 4, 2, 0.0F));
		right_gloove_addon2.cubeList.add(new ModelBox(right_gloove_addon2, 139, 87, 0.0F, -1.0F, -1.0F, 1, 4, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(9.0F, -48.0F, 0.0F);
		setRotationAngle(LArm, 0.0F, 0.0F, -0.1309F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 98, 1.0F, 0.0F, -4.0F, 6, 28, 7, 0.0F));
		LArm.cubeList.add(new ModelBox(LArm, 101, 46, 0.0F, -7.0F, -6.0F, 5, 10, 12, 0.0F));

		left_gloove = new ModelRenderer(this);
		left_gloove.setRotationPoint(4.6335F, 27.7738F, -4.0F);
		setRotationAngle(left_gloove, 3.1416F, -1.5272F, -3.1416F);
		LArm.addChild(left_gloove);
		left_gloove.cubeList.add(new ModelBox(left_gloove, 80, 98, -1.0F, -2.0F, -2.0F, 1, 2, 4, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 62, 126, 0.0F, -2.0F, -3.0F, 1, 2, 6, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 100, 125, -1.0F, -11.0F, -3.0F, 1, 9, 6, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 36, 61, -1.0F, -16.0F, -2.0F, 1, 5, 4, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 72, 78, -1.0F, -21.0F, -1.0F, 1, 5, 2, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 90, 46, 0.0F, -6.0F, -4.0F, 1, 4, 8, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 82, 125, 1.0F, -6.0F, -4.0F, 1, 3, 8, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 123, 39, 1.3665F, -6.0F, -3.0F, 4, 3, 6, 0.0F));
		left_gloove.cubeList.add(new ModelBox(left_gloove, 122, 104, 6.0F, -6.0F, -4.0F, 1, 3, 8, 0.0F));

		right_gloove_addon3 = new ModelRenderer(this);
		right_gloove_addon3.setRotationPoint(0.0F, 0.0F, -1.0F);
		setRotationAngle(right_gloove_addon3, 0.0F, 0.0F, -0.3491F);
		left_gloove.addChild(right_gloove_addon3);
		right_gloove_addon3.cubeList.add(new ModelBox(right_gloove_addon3, 0, 33, -1.8776F, -0.6835F, 0.0872F, 1, 4, 2, 0.0F));
		right_gloove_addon3.cubeList.add(new ModelBox(right_gloove_addon3, 10, 0, -0.9629F, -0.5756F, -0.9034F, 1, 4, 4, 0.0F));

		Left_glove3 = new ModelRenderer(this);
		Left_glove3.setRotationPoint(4.0257F, 26.2751F, 4.0F);
		setRotationAngle(Left_glove3, -1.5708F, 1.5708F, -1.5708F);
		LArm.addChild(Left_glove3);
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 135, 57, -1.0F, -1.6667F, -2.0F, 1, 4, 4, 0.0F));
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 0, 133, 0.0F, -1.6667F, -3.0F, 1, 4, 6, 0.0F));
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 116, 95, -1.0F, -12.6667F, -3.0F, 1, 11, 6, 0.0F));
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 26, 98, -1.0F, -18.6667F, -2.0F, 1, 6, 4, 0.0F));
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 135, 0, 1.0F, 0.0F, -3.0F, 1, 4, 4, 0.0F));
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 16, 43, 0.0F, 0.0F, -2.0F, 1, 4, 2, 0.0F));
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 90, 46, -1.0F, -24.0F, -1.0F, 1, 5, 2, 0.0F));
		Left_glove3.cubeList.add(new ModelBox(Left_glove3, 74, 78, 0.0F, -8.0F, -4.0F, 1, 6, 8, 0.0F));

		Left_gloove_addon4 = new ModelRenderer(this);
		Left_gloove_addon4.setRotationPoint(1.7997F, -0.1305F, 33.4451F);
		setRotationAngle(Left_gloove_addon4, 0.0436F, 0.0F, -2.9671F);
		Left_glove3.addChild(Left_gloove_addon4);
		
		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-7.0F, -20.0F, -1.0F);
		setRotationAngle(RLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 150, 0, -3.0F, -1.5185F, -2.3466F, 4, 10, 4, 0.0F));
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 33, -2.0F, -4.649F, -1.3552F, 5, 4, 6, 0.0F));

		RightLeg = new ModelRenderer(this);
		RightLeg.setRotationPoint(-8.0F, 19.351F, 6.6448F);
		setRotationAngle(RightLeg, 0.1309F, 0.0F, 0.0F);
		RLeg.addChild(RightLeg);
		RightLeg.cubeList.add(new ModelBox(RightLeg, 57, 0, 5.0F, -11.8609F, -7.878F, 4, 10, 4, 0.0F));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 70, 129, 4.0F, -2.0F, -10.0F, 2, 2, 7, 0.0F));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 34, 132, 6.0F, -1.8695F, -8.0086F, 2, 2, 6, 0.0F));
		RightLeg.cubeList.add(new ModelBox(RightLeg, 125, 68, 8.0F, -2.2611F, -9.9829F, 2, 2, 7, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(6.0F, -20.0F, -1.0F);
		setRotationAngle(LLeg, -0.1309F, 0.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 122, 24, -1.0F, -1.5185F, -2.3466F, 4, 10, 4, 0.0F));
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 43, -3.0F, -4.649F, -1.3552F, 5, 4, 6, 0.0F));

		LeftLeg2 = new ModelRenderer(this);
		LeftLeg2.setRotationPoint(-6.0F, 19.351F, 6.6448F);
		setRotationAngle(LeftLeg2, 0.1309F, 0.0F, 0.0F);
		LLeg.addChild(LeftLeg2);
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 57, 0, 5.0F, -11.8609F, -7.878F, 4, 10, 4, 0.0F));
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 130, 115, 4.0F, -2.0F, -10.0F, 2, 2, 7, 0.0F));
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 132, 104, 6.0F, -1.8695F, -8.0086F, 2, 2, 6, 0.0F));
		LeftLeg2.cubeList.add(new ModelBox(LeftLeg2, 130, 95, 8.0F, -2.2611F, -9.9829F, 2, 2, 7, 0.0F));
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