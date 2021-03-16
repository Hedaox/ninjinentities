package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;

public class EntityAniraza2 extends EntityDBCNinjin {

	public EntityAniraza2(World par1World) {
		super(par1World, 85, MindState.NEUTRAL, false, true, new byte[]{3, 5}, new byte[]{4, 4});
		this.experienceValue = 80;
		this.setSize(0.66F,1.98F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				79000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				7900.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/aniraza.png";
	}

}
