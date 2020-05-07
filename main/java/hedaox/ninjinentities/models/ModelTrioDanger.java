package hedaox.ninjinentities.models;

import org.lwjgl.opengl.GL11;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelTrioDanger extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Snout;
	private final ModelRenderer REar;
	private final ModelRenderer LEar;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer LArm;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private final ModelRenderer Tail;
	private float scale = 1.0F;

	@SuppressWarnings("unchecked")
	public ModelTrioDanger(float _scale) {
		textureWidth = 64;
		textureHeight = 32;
		
		scale = _scale;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -7.0F, -4.0F, 8, 7, 8, 0.0F));

		Snout = new ModelRenderer(this);
		Snout.setRotationPoint(1.0F, -5.0F, -2.0F);
		Head.addChild(Snout);
		Snout.cubeList.add(new ModelBox(Snout, 50, 2, -3.0F, 2.0F, -5.0F, 4, 3, 3, 0.0F));

		REar = new ModelRenderer(this);
		REar.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(REar, 0.0F, -0.5236F, 0.0F);
		Head.addChild(REar);
		REar.cubeList.add(new ModelBox(REar, 32, 0, -4.0F, -10.0F, -1.0F, 0, 6, 6, 0.0F));

		LEar = new ModelRenderer(this);
		LEar.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(LEar, 0.0F, 0.5236F, 0.0F);
		Head.addChild(LEar);
		LEar.cubeList.add(new ModelBox(LEar, 32, 0, 4.0F, -10.0F, -1.0F, 0, 6, 6, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(-3.8F, 5.4F, 3.8F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -0.2F, -5.4F, -5.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-0.2F, -3.4F, -3.8F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(7.8F, -3.4F, -3.8F);
		LArm.mirror = true;
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 0.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(1.8F, 6.6F, -3.8F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(5.8F, 6.6F, -3.8F);
		LLeg.mirror = true;
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Tail = new ModelRenderer(this);
		Tail.setRotationPoint(4.0F, 6.0F, -2.0F);
		setRotationAngle(Tail, -0.7854F, 0.0F, 0.0F);
		Body.addChild(Tail);
		Tail.cubeList.add(new ModelBox(Tail, 32, 0, -1.7F, -2.4F, -0.8F, 3, 3, 12, 0.0F));
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
