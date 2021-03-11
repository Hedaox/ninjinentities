package hedaox.ninjinentities.entities;

import java.util.List;

import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityRoshi extends EntityDBCNinjin {

	public int randomSoundDelay = 0;
	private int angerLevel = 0;

	public EntityRoshi(World par1World) {
		super(par1World, 80, MindState.NEUTRAL, true, false, new byte[]{3}, new byte[]{2});
		this.experienceValue = 80;
		this.setSize(0.6F,1.8F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				200.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				20.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return "jinryuudragonbc:npcs/roshishell.png";
	}
}
