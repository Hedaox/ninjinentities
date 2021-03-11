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

public class EntityChiaotzu1 extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityChiaotzu1(World par1World) {
		super(par1World, 70, MindState.NEUTRAL, false, false, new byte[]{3, 6}, new byte[]{7});
		this.experienceValue = 80;
		this.setSize(0.36F,1.08F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				180.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				18.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/chiaotzu1.png";
	}

}
