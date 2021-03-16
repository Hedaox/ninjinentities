package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelMisokatsun extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer HeadChild_2;
	private final ModelRenderer HeadChild_1;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelMisokatsun(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 64;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 18, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		HeadChild_2 = new ModelRenderer(this);
		HeadChild_2.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_2, 0.0F, 0.5236F, 0.0F);
		Head.addChild(HeadChild_2);
		HeadChild_2.cubeList.add(new ModelBox(HeadChild_2, 0, 52, 4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

		HeadChild_1 = new ModelRenderer(this);
		HeadChild_1.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(HeadChild_1, 0.0F, -0.5236F, 0.0F);
		Head.addChild(HeadChild_1);
		HeadChild_1.cubeList.add(new ModelBox(HeadChild_1, 0, 52, -4.0F, -7.0F, -1.0F, 0, 6, 6, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 0, -6.0F, 0.0F, -3.0F, 12, 12, 6, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		setRotationAngle(RArm, -0.0086F, 0.0F, 0.2212F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 38, 42, -5.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		setRotationAngle(LArm, 0.0086F, 0.0F, -0.2212F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 22, 42, 1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.0F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 34, -3.0F, 0.0F, -3.0F, 5, 12, 6, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.0F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 36, 0, -1.9F, 0.0F, -3.0F, 5, 12, 6, 0.0F));
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
