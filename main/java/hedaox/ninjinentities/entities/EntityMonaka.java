package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import JinRyuu.DragonBC.common.Npcs.EntityDBCWildlife;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityMonaka extends EntityDBCWildlife {

	public int randomSoundDelay = 0;

	public EntityMonaka(World par1World) {
		super(par1World);
		this.experienceValue = 80;
		this.setSize(0.48F,1.44F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				100.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				10.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/monaka.png";
	}
}
