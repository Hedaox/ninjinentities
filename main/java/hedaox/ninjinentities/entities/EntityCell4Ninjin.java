package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Items.ItemsDBC;
import JinRyuu.DragonBC.common.Npcs.EntityCell4;
import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.entity.EntityCusPar;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.network.MessageSendStringSoundToPlay;
import hedaox.ninjinentities.proxy.ClientProxy;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;

import java.util.List;

public class EntityCell4Ninjin extends EntityDBCNinjin {


	public int randomSoundDelay = 0;

	public EntityCell4Ninjin(World par1World) {
		super(par1World, 0, MindState.AGGRESSIVE, false, true, new byte[]{1, 6, 2, 3, 4, 3}, new byte[]{3, 2, 7, 3, 7, 2}, 255.0F, 217.0F, 25.0F, true);
		this.experienceValue = 80;
		this.setSize(0.45F,1.35F);
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				18500.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1850.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return "jinryuudragonbc:npcs/cell3.png";
	}

}
