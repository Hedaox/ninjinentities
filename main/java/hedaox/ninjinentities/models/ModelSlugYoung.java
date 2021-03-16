package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelSlugYoung extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Helmet;
	private final ModelRenderer Body;
	private final ModelRenderer Ba;
	private final ModelRenderer bodyChild_6;
	private final ModelRenderer RArm;
	private final ModelRenderer rightarmshoulder;
	private final ModelRenderer LArm;
	private final ModelRenderer leftarmshoulder;
	private final ModelRenderer RLeg;
	private final ModelRenderer LLeg;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelSlugYoung(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 128;
		textureHeight = 128;


		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 20, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Helmet = new ModelRenderer(this);
		Helmet.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.addChild(Helmet);
		Helmet.cubeList.add(new ModelBox(Helmet, 24, 12, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.5F));
		Helmet.cubeList.add(new ModelBox(Helmet, 32, 28, -1.0F, -9.0F, -5.0F, 2, 2, 1, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 16, 56, 4.0F, -5.0F, -3.0F, 1, 3, 4, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 48, 12, -5.0F, -5.0F, -3.0F, 1, 3, 4, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 26, 56, 4.0F, -2.0F, -4.0F, 1, 1, 4, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 55, 40, -5.0F, -2.0F, -4.0F, 1, 1, 4, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 28, 3, 4.0F, -1.0F, -5.0F, 1, 1, 2, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 28, 0, -5.0F, -1.0F, -5.0F, 1, 1, 2, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 23, 4.0F, -6.0F, -2.0F, 1, 1, 2, 0.0F));
		Helmet.cubeList.add(new ModelBox(Helmet, 0, 20, -5.0F, -6.0F, -2.0F, 1, 1, 2, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.0F, 0.0F, 0.0F);
		Body.cubeList.add(new ModelBox(Body, 0, 36, -4.0F, 0.0F, -2.0F, 8, 12, 4, 0.0F));

		Ba = new ModelRenderer(this);
		Ba.setRotationPoint(3.5F, 18.4F, -3.2F);
		Body.addChild(Ba);
		Ba.cubeList.add(new ModelBox(Ba, 27, 31, -8.0F, -7.0F, 0.8F, 9, 10, 5, 0.0F));

		bodyChild_6 = new ModelRenderer(this);
		bodyChild_6.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(bodyChild_6, 0.1571F, 0.0F, 0.0F);
		Body.addChild(bodyChild_6);

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-5.0F, 2.0F, 0.0F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 55, 24, -3.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		rightarmshoulder = new ModelRenderer(this);
		rightarmshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(rightarmshoulder, 0.0F, 0.0F, 0.1F);
		RArm.addChild(rightarmshoulder);

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(5.0F, 2.0F, 0.0F);
		Body.addChild(LArm);
		LArm.cubeList.add(new ModelBox(LArm, 0, 52, -1.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		leftarmshoulder = new ModelRenderer(this);
		leftarmshoulder.setRotationPoint(0.0F, 0.0F, 0.0F);
		setRotationAngle(leftarmshoulder, 0.0F, 0.0F, -0.1F);
		LArm.addChild(leftarmshoulder);

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-1.9F, 12.0F, 0.1F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 44, 46, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(1.9F, 12.0F, 0.1F);
		Body.addChild(LLeg);
		LLeg.cubeList.add(new ModelBox(LLeg, 54, 0, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));
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