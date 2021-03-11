package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;

import java.util.List;

import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class EntityFrost4 extends EntityDBCNinjin {

	public EntityFrost4(World par1World) {
		super(par1World, 5, MindState.NEUTRAL, false, false, new byte[]{3, 1, 5}, new byte[]{4, 4 ,4});
		this.experienceValue = 80;
		this.angerLevel = 400;
		this.setSize(0.6F,1.8F);
	}
	protected void applyEntityAttributes() {
		super.applyEntityAttributes();
		getEntityAttribute(SharedMonsterAttributes.maxHealth).setBaseValue(
				10000.0D);
		getEntityAttribute(SharedMonsterAttributes.attackDamage).setBaseValue(
				1000.0D);
	}

	@SideOnly(Side.CLIENT)
	public String getTexture() {
		return ModVars.MOD_ID + ":textures/entity/frost4.png";
	}
	
	@Override
	protected void updateEntityActionState() {
		if (mindState == MindState.PACIFIC) {
			angerLevel = 0;
		}
		if (this.angerLevel > 0) {
			this.fallDistance = 0.0F;

			this.prevAttackCounter = this.attackCounter;
			if ((this.targetedEntity != null) && (this.targetedEntity.isDead)) {
				this.targetedEntity = null;
				this.dataWatcher.updateObject(23, Integer.valueOf(0));
				super.func_70626_be();
			}
			if ((this.targetedEntity == null) || (this.aggroCooldown-- <= 0)) {
				this.targetedEntity = this.worldObj
						.getClosestVulnerablePlayerToEntity(this, 100.0D);
				super.func_70626_be();
				if (this.targetedEntity != null) {
					this.dataWatcher.updateObject(23,
							Integer.valueOf(this.targetedEntity.getEntityId()));
					this.aggroCooldown = 20;
				}
			}
			float r = this.width / 2.0F + 3.5F;
			if ((this.entityToAttack != null)
					&& (this.entityToAttack.isEntityAlive())
					&& (this.entityToAttack.getDistanceToEntity(this) < r)) {
				AxisAlignedBB aabb = AxisAlignedBB.getBoundingBox(
						this.posX - r, this.posY - r, this.posZ - r, this.posX
								+ r, this.posY + r, this.posZ + r);
				List<?> list = this.worldObj.getEntitiesWithinAABB(
						EntityPlayer.class, aabb);
				if (this.attackTime <= 0) {
					for (int i = 0; i < list.size(); i++) {
						EntityPlayer player = (EntityPlayer) list.get(i);
						func_70652_k(player);
						player.addPotionEffect(new PotionEffect(Potion.poison.id, 200, 20));
					}
					this.attackTime = 35;
					this.worldObj.playSoundAtEntity(this,
							"jinryuudragonbc:DBC3.force", 0.5F,
							this.worldObj.rand.nextFloat() * 0.1F + 0.9F);
				}
			}
			double d4 = 64.0D;
			if ((this.targetedEntity != null)
					&& (this.targetedEntity.getDistanceSqToEntity(this) < d4
							* d4)) {
				double d5 = this.targetedEntity.posX - this.posX;
				double d7 = this.targetedEntity.posZ - this.posZ;
				this.renderYawOffset = (this.rotationYaw = -(float) Math.atan2(
						d5, d7) * 180.0F / 3.1415927F);
				if (canEntityBeSeen(this.targetedEntity)) {
					if (this.attackCounter == 10) {
					}
					this.attackCounter += 1;
					if (this.attackCounter == 80) {
						this.worldObj.playSoundAtEntity(this,
								"jinryuudragonbc:DBC2.basicbeam_fire", 0.5F,
								1.0F);

						byte type = 1;
						byte speed = 1;
						byte effect = 1;
						// Couleur de l'attaque en fonction de l'alignement
						// neutre violet
						byte color = 3;
						if (alignment < 33) {
							// m�chant rouge
							color = 4;
						} else if (alignment > 66) {
							// gentil bleu
							color = 2;
						}
						byte density = 1;
						byte sincantation = 0;
						byte sfire = 0;
						byte smove = 0;
						byte[] sts = JRMCoreH.techDBCstatsDefault;
						int dmg = 50;
						int f = (int) getEntityAttribute(
								SharedMonsterAttributes.attackDamage)
								.getAttributeValue();
						int dmg1 = (int) (f * 1.2F);
						int cst = dmg1 / 2;
						EntityEnergyAtt entityball = new EntityEnergyAtt(this,
								type, speed, dmg, effect, color, density,
								sincantation, sfire, smove, (byte) 50, dmg1,
								cst, sts, (byte) 0);

						double d8 = this.width + 0.5D;
						Vec3 vec3 = getLook(1.0F);
						entityball.posX = (this.posX + vec3.xCoord * d8);
						entityball.posY = (this.posY + this.height / 2.0F + 0.5D);
						entityball.posZ = (this.posZ + vec3.zCoord * d8);
						this.worldObj.spawnEntityInWorld(entityball);
						this.attackCounter = -40;
					}
				} else if (this.attackCounter > 0) {
					this.attackCounter -= 1;
				}
			} else if (this.attackCounter > 0) {
				this.attackCounter -= 1;
			}
		} else {
			super.func_70626_be();
		}
	}
}
