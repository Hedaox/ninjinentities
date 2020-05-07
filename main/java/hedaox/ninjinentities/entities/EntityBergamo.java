package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBergamo extends EntityDBCEvilNinjin {

	public EntityBergamo(World par1World) {
		super(par1World, 20, MindState.NEUTRAL, false, true);
		this.experienceValue = 80;
		this.setSize(0.66F,1.98F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				60000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				6000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/bergamo.png";
	}
	
	protected void dropFewItems(boolean par1, int par2) {
		int var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
		}
		var3 = this.rand.nextInt(2 + par2);
		for (int var4 = 0; var4 < var3; var4++) {
		}
	}
}
