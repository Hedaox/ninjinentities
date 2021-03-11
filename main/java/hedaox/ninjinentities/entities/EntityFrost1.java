package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFrost1 extends EntityDBCNinjin {

	public EntityFrost1(World par1World) {
		super(par1World, 5, MindState.NEUTRAL, false, false, new byte[]{3, 1, 5}, new byte[]{4, 4 ,4});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				5000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/frost1.png";
	}

}
