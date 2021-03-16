package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityPiccoloDaimaoYoung extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityPiccoloDaimaoYoung(World par1World) {
		super(par1World, 1, MindState.NEUTRAL, false, false, new byte[]{1, 3, 5}, new byte[]{4, 4, 4});
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				230.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				23.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/piccoloDaimaoYoung.png";
	}
}
