package hedaox.ninjinentities.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class ModelNappaArmor extends ModelBase {
	private final ModelRenderer Head;
	private final ModelRenderer Body;
	private final ModelRenderer RArm;
	private final ModelRenderer RShoulderArmor;
	private final ModelRenderer LArm;
	private final ModelRenderer LShoulderArmor;
	private final ModelRenderer RLeg;
	private final ModelRenderer Belt;
	private final ModelRenderer Belt2;
	private final ModelRenderer LLeg;
	private final ModelRenderer FKusazuri;
	private final ModelRenderer RKusazuri;
	private final ModelRenderer LKusazuri;
	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelNappaArmor(float _scaleX, float _scaleY, float _scaleZ) {

		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;

		textureWidth = 64;
		textureHeight = 32;

		Head = new ModelRenderer(this);
		Head.setRotationPoint(0.0F, 0.0F, 0.0F);
		Head.cubeList.add(new ModelBox(Head, 0, 0, -4.0F, -8.0F, -4.0F, 8, 8, 8, 0.0F));

		Body = new ModelRenderer(this);
		Body.setRotationPoint(0.2F, 5.4F, -0.2F);
		Body.cubeList.add(new ModelBox(Body, 16, 16, -4.2F, -5.4F, -1.8F, 8, 12, 4, 0.0F));

		RArm = new ModelRenderer(this);
		RArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(RArm);
		RArm.cubeList.add(new ModelBox(RArm, 40, 16, -4.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		RShoulderArmor = new ModelRenderer(this);
		RShoulderArmor.setRotationPoint(-3.0F, -1.7F, 0.0F);
		setRotationAngle(RShoulderArmor, -1.5708F, 0.0F, 0.1047F);
		RArm.addChild(RShoulderArmor);
		RShoulderArmor.cubeList.add(new ModelBox(RShoulderArmor, 24, 0, -3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F));

		LArm = new ModelRenderer(this);
		LArm.setRotationPoint(-4.2F, -3.4F, 0.2F);
		Body.addChild(LArm);
		LArm.mirror = true;
		LArm.cubeList.add(new ModelBox(LArm, 40, 16, 8.0F, -2.0F, -2.0F, 4, 12, 4, 0.0F));

		LShoulderArmor = new ModelRenderer(this);
		LShoulderArmor.setRotationPoint(11.0F, -1.7F, 0.0F);
		setRotationAngle(LShoulderArmor, -1.5708F, 0.0F, -0.1047F);
		LArm.addChild(LShoulderArmor);
		LShoulderArmor.mirror = true;
		LShoulderArmor.cubeList.add(new ModelBox(LShoulderArmor, 24, 0, -3.0F, -3.0F, -1.0F, 6, 6, 2, 0.0F));

		RLeg = new ModelRenderer(this);
		RLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(RLeg);
		RLeg.cubeList.add(new ModelBox(RLeg, 0, 16, -2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		Belt = new ModelRenderer(this);
		Belt.setRotationPoint(-0.8F, -1.6F, -2.2F);
		setRotationAngle(Belt, -0.0698F, 0.0873F, 0.0F);
		RLeg.addChild(Belt);

		Belt2 = new ModelRenderer(this);
		Belt2.setRotationPoint(-0.8F, -1.6F, -2.2F);
		setRotationAngle(Belt2, -0.0698F, 1.2217F, 0.0F);
		RLeg.addChild(Belt2);

		LLeg = new ModelRenderer(this);
		LLeg.setRotationPoint(-2.2F, 6.6F, 0.2F);
		Body.addChild(LLeg);
		LLeg.mirror = true;
		LLeg.cubeList.add(new ModelBox(LLeg, 0, 16, 2.0F, 0.0F, -2.0F, 4, 12, 4, 0.0F));

		FKusazuri = new ModelRenderer(this);
		FKusazuri.setRotationPoint(-0.2F, 5.7F, -0.9F);
		setRotationAngle(FKusazuri, -0.0873F, 0.0F, 0.0F);
		Body.addChild(FKusazuri);
		FKusazuri.cubeList.add(new ModelBox(FKusazuri, 52, 0, -3.0F, -1.0F, -1.0F, 6, 9, 0, 0.0F));

		RKusazuri = new ModelRenderer(this);
		RKusazuri.setRotationPoint(-4.4F, 4.9F, 0.1F);
		setRotationAngle(RKusazuri, 0.0873F, -1.5708F, 0.0F);
		Body.addChild(RKusazuri);
		RKusazuri.cubeList.add(new ModelBox(RKusazuri, 52, 10, -2.0F, -0.3149F, -0.1781F, 4, 9, 0, 0.0F));

		LKusazuri = new ModelRenderer(this);
		LKusazuri.setRotationPoint(4.0F, 4.9F, 0.1F);
		setRotationAngle(LKusazuri, 0.0873F, 1.5708F, 0.0F);
		Body.addChild(LKusazuri);
		LKusazuri.mirror = true;
		LKusazuri.cubeList.add(new ModelBox(LKusazuri, 52, 10, -2.0F, -0.3149F, -0.1781F, 4, 9, 0, 0.0F));
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