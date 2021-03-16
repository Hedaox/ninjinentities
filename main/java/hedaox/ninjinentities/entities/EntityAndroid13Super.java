package hedaox.ninjinentities.entities;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.List;

public class EntityAndroid13Super extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityAndroid13Super(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{5, 3}, new byte[]{4, 4});
		this.experienceValue = 80;
		this.setSize(0.72F,2.16F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				14000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1400.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/android13Super.png";
	}
}
