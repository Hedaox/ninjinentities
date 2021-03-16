package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelTambourine extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer field_78114_d;
	private final ModelRenderer bone2;
	private final ModelRenderer HeadChild_3;
	private final ModelRenderer HeadChild_1;
	private final ModelRenderer Body;
	private final ModelRenderer bone;
	private final ModelRenderer bb_main;
	private final ModelRenderer LeftWing;
	private final ModelRenderer RightWing;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelTambourine(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;
		textureWidth = 105;
		textureHeight = 100;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 20, 34, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		field_78114_d = new ModelRenderer(this);
		field_78114_d.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(field_78114_d);

		bone2 = new ModelRenderer(this);
		bone2.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(bone2);
		bone2.cubeList.add(new ModelBox(bone2, 0, 0, -0.25F, -10.0F, -4.0F, 0, 2, 8, 0.0F));
		bone2.cubeList.add(new ModelBox(bone2, 0, 12, 0.0F, -9.0F, 4.0F, 0, 9, 2, 0.0F));

		HeadChild_3 = new ModelRenderer(this);
		HeadChild_3.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_3, 0.0F, 0.5236F, 0.0F);
		Head.addChild(HeadChild_3);
		HeadChild_3.cubeList.add(new ModelBox(HeadChild_3, 93, 90, 4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		HeadChild_1 = new ModelRenderer(this);
		HeadChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_1, 0.0F, -0.5236F, 0.0F);
		Head.addChild(HeadChild_1);
		HeadChild_1.cubeList.add(new ModelBox(HeadChild_1, 93, 90, -4.0F, -6.0F, -1.0F, 0, 4, 6, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 36, 50, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 0, 25, 0.0F, -24.0F, 2.0F, 0, 10, 2, 0.0F));

		bb_main = new ModelRenderer(this);
		bb_main.setRotationPoint(0.0F, 24.0F, 0.0F);
		Body.addChild(bb_main);
		bb_main.cubeList.add(new ModelBox(bb_main, 20, 67, -4.5F, -13.6F, -2.4F, 9, 7, 5, 0.0F));

		LeftWing = new ModelRenderer(this);
		LeftWing.setRotationPoint(2.3F, 2.2F, 0.8F);
		setRotationAngle(LeftWing, 0.4098F, -0.0911F, -0.4098F);
		Body.addChild(LeftWing);
		LeftWing.cubeList.add(new ModelBox(LeftWing, 81, 0, 0.0F, 0.0F, 0.0F, 1, 16, 11, 0.0F));

		RightWing = new ModelRenderer(this);
		RightWing.setRotationPoint(-2.3F, 2.2F, 0.8F);
		setRotationAngle(RightWing, 0.4098F, 0.0911F, 0.4098F);
		Body.addChild(RightWing);
		RightWing.mirror = true;
		RightWing.cubeList.add(new ModelBox(RightWing, 81, 0, -1.0F, 0.0F, 0.0F, 1, 16, 11, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 60, 50, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(4.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 60, 50, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 20, 50, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 20, 50, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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