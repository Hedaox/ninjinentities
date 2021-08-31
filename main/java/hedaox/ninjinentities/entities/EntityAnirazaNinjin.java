package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAnirazaNinjin extends EntityDBCNinjin {

	public EntityAnirazaNinjin(World par1World) {
		super(par1World, 85, MindState.NEUTRAL, false, true, new byte[]{3, 5}, new byte[]{4, 4});
		this.experienceValue = 80;
		this.setSize(1.08F,3.24F);
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
		return ModVars.MOD_ID + ":textures/entity/aniraza.png";
	}

}
