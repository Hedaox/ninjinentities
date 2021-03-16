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

public class EntityBujin extends EntityDBCNinjin {

	public int randomSoundDelay = 0;

	public EntityBujin(World par1World) {
		super(par1World, 10, MindState.AGGRESSIVE, false, true, new byte[]{1, 3}, new byte[]{2, 2});
		this.experienceValue = 80;
		this.setSize(0.45F,1.35F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				8000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				900.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/bujin.png";
	}
}
