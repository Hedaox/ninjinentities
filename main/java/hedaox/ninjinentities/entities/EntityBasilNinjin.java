package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityBasilNinjin extends EntityDBCNinjin {

	public EntityBasilNinjin(World par1World) {
		super(par1World, 20, MindState.NEUTRAL, false, true, new byte[]{1, 3, 6}, new byte[]{4, 4, 4});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				25000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				2500.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/basil.png";
	}

}
