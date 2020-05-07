package hedaox.ninjinentities.entities;

import JinRyuu.DragonBC.common.Npcs.EntityDBCKami;
import JinRyuu.DragonBC.common.mod_DragonBC;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import hedaox.ninjinentities.lib.ModVars;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

import java.util.List;

public class EntityMasterBaba extends EntityDBCKami
{
	public final int HePo = 5;

	public EntityMasterBaba(World par1World)
	{
		super(par1World);
	}

	protected void applyEntityAttributes()
	{
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(20.0D);
	}

	public boolean interact(EntityPlayer par1EntityPlayer)
	{
		ItemStack var2 = par1EntityPlayer.inventory.getCurrentItem();
		boolean var3 = var2 != null;
		if (isEntityAlive())
		{
			par1EntityPlayer.openGui(mod_DragonBC.instance, 17, par1EntityPlayer.worldObj, (int)this.posX, (int)this.posY, (int)this.posZ);
			return true;
		}
		return super.interact(par1EntityPlayer);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture()
	{
		return ModVars.MOD_ID + ":textures/entity/baba.png";
	}

	public void onUpdate()
	{
		super.onUpdate();
	}
}
