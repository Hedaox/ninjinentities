package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelCyclopianGuard extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer bone;
	private final ModelRenderer field_78176_b1;
	private final ModelRenderer RArm;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelCyclopianGuard(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, -7.0F, -2.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 38, -4.0F, -11.0F, -5.5F, 8, 9, 9, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, -7.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -9.0F, -2.0F, -6.0F, 18, 12, 11, 0.0F));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 66, 41, -4.0F, -1.0F, -9.0F, 8, 8, 3, 0.0F));

		field_78176_b1 = new ModelRenderer(this);
		field_78176_b1.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(field_78176_b1);
		field_78176_b1.cubeList.add(new ModelBox(field_78176_b1, 58, 21, -4.5F, 10.0F, -3.0F, 9, 5, 6, 0.5F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 34, 44, -13.0F, -2.5F, -3.0F, 4, 24, 6, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(-5.0F, 9.0F, -0.6F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		RArm.addChild(rightarmshoulder);
		rightarmshoulder.cubeList.add(new ModelBox(rightarmshoulder, 0, 23, -10.01F, -11.8552F, -5.0F, 9, 4, 11, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 54, 54, 9.0F, -2.5F, -3.0F, 4, 24, 6, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(5.0F, 9.0F, -0.5F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);
		leftarmshoulder.cubeList.add(new ModelBox(leftarmshoulder, 29, 29, 1.0F, -11.5557F, -5.0F, 9, 4, 11, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-4.0F, 18.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 58, 0, -3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(5.0F, 18.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 56, -3.5F, -3.0F, -3.0F, 6, 16, 5, 0.0F));
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