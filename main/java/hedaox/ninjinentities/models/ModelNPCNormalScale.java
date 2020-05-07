package hedaox.ninjinentities.models;

import net.minecraft.entity.Entity;

import org.lwjgl.opengl.GL11;

import JinRyuu.DragonBC.common.Npcs.ModelNPCNormal;

public class ModelNPCNormalScale extends ModelNPCNormal {

	private float scaleX = 1.0F;
	private float scaleY = 1.0F;
	private float scaleZ = 1.0F;

	public ModelNPCNormalScale(float _scaleX, float _scaleY, float _scaleZ) {
		
		super();
		scaleX = _scaleX;
		scaleY = _scaleY;
		scaleZ = _scaleZ;
	}
	
	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3,
			float f4, float f5) {
		this.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
		GL11.glPushMatrix();
		GL11.glScalef(this.scaleX, this.scaleY, this.scaleZ);
		GL11.glTranslatef(0.0F, (float) (-1.04F+(5.5F/(1.0F+Math.pow(this.scaleY/0.45F,1.88F)))), 0.0F);
		this.bipedHead.render(f5);
		this.bipedBody.render(f5);
		this.bipedRightArm.render(f5);
		this.bipedLeftArm.render(f5);
		this.bipedRightLeg.render(f5);
		this.bipedLeftLeg.render(f5);
		this.bipedHeadwear.render(f5);
		GL11.glPopMatrix();
	}

}
