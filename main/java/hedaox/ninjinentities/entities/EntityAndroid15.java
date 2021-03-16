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

public class EntityAndroid15 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityAndroid15(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{6, 1, 5}, new byte[]{2, 2, 2});
		this.experienceValue = 80;
		this.setSize(0.51F,1.53F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				8250.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				875.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/android15.png";
	}

}
