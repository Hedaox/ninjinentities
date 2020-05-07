package hedaox.ninjinentities.entities;

import java.util.List;

import JinRyuu.JRMCore.JRMCoreConfig;
import JinRyuu.JRMCore.entity.EntityCusPar;
import net.minecraft.client.entity.EntityPlayerSP;
import net.minecraft.entity.Entity;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.util.DamageSource;
import net.minecraft.util.Vec3;
import net.minecraft.world.World;
import JinRyuu.DragonBC.common.Npcs.EntityDBCNeut;
import JinRyuu.JRMCore.JRMCoreH;
import JinRyuu.JRMCore.entity.EntityEnergyAtt;

public class EntityDBCNeutNinjin extends EntityDBCNeut {

	public int angerLevel = 0;
	protected int aggroCooldown = 0;
	public int prevAttackCounter = 0;
	public int attackCounter = 0;
	protected Entity targetedEntity = null;
	private byte data1 = 1;
	private byte data2 = 0;
	private byte data3 = 0;
	private byte data4 = 0;
	private boolean blst = false;
	public int alignment = 50;
	public boolean isTrainer = false;
	public boolean hasAnAura = false;
	public float auraRed = 125.0F;
	public float auraGreen = 0.0F;
	public float auraBlue = 255.0F;
	public MindState mindState = MindState.NEUTRAL;
	public boolean canTeleport = false;
	private int wait = 0;
	private int m = 1;
	private int rang = 0;
	private boolean updtd = false;

	public enum MindState {
		NEUTRAL, AGGRESSIVE, PACIFIC
	}

	public EntityDBCNeutNinjin(World par1World) {
		super(par1World);
	}

	public EntityDBCNeutNinjin(World par1World, int _alignment,
			MindState _mindState, boolean _isTrainer, boolean _canTeleport) {
		super(par1World);
		alignment = _alignment;
		this.
		isTrainer = _isTrainer;
		mindState = _mindState;
		canTeleport = _canTeleport;
		if (mindState == MindState.AGGRESSIVE) {
			angerLevel = 400;
		}
	}

	public EntityDBCNeutNinjin(World par1World, int _alignment,
							   MindState _mindState, boolean _isTrainer, boolean _canTeleport, boolean _hasAnAura) {
		super(par1World);
		alignment = _alignment;
		this.
				isTrainer = _isTrainer;
		mindState = _mindState;
		canTeleport = _canTeleport;
		if (mindState == MindState.AGGRESSIVE) {
			angerLevel = 400;
		}
		hasAnAura = _hasAnAura;
	}

	public EntityDBCNeutNinjin(World par1World, int _alignment,
							   MindState _mindState, boolean _isTrainer, boolean _canTeleport, float _auraRed, float _auraGreen, float _auraBlue) {
		super(par1World);
		alignment = _alignment;
		this.
				isTrainer = _isTrainer;
		mindState = _mindState;
		canTeleport = _canTeleport;
		if (mindState == MindState.AGGRESSIVE) {
			angerLevel = 400;
		}
		auraRed = _auraRed;
		auraGreen = _auraGreen;
		auraBlue = _auraBlue;
		hasAnAura = true;
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
				super.updateEntityActionState();
			}
			if ((this.targetedEntity == null) || (this.aggroCooldown-- <= 0)) {
				this.targetedEntity = this.worldObj
						.getClosestVulnerablePlayerToEntity(this, 100.0D);
				super.updateEntityActionState();
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
						attackEntityAsMob(player);
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
				double d6 = this.targetedEntity.boundingBox.minY + this.targetedEntity.height / 2.0F - (this.posY + this.height / 2.0F);
				double d7 = this.targetedEntity.posZ - this.posZ;
				this.renderYawOffset = (this.rotationYaw = -(float) Math.atan2(
						d5, d7) * 180.0F / 3.1415927F);
				if (canEntityBeSeen(this.targetedEntity)) {
					this.attackCounter += 1;
					if (this.attackCounter == 80) {
						this.worldObj.playSoundAtEntity(this,
								"jinryuudragonbc:DBC2.basicbeam_fire", 0.5F,
								1.0F);

						byte type = this.data1;
						byte speed = 1;
						byte effect = 1;
						// Couleur de l'attaque en fonction de l'alignement
						// neutre violet
						byte color = 3;
						if (alignment < 33) {
							// méchant rouge
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
						int dmg = (int)(50.0F / (this.data1 == 6 ? 5.0F : 1.0F));
						int f = (int) getEntityAttribute(SharedMonsterAttributes.attackDamage).getAttributeValue();
						int dmg1 = (int)(f * 1.2F / (this.data1 == 6 ? 5.0F : 1.0F));
						int cst = dmg1 / 2;
						EntityEnergyAtt entityball;
						if (this.data3 == 0) {
							entityball = new EntityEnergyAtt(this, type, speed, dmg, effect, color, density, sincantation, sfire, smove, (byte)50, dmg1, cst, sts, (byte)0);
						} else {
							entityball = new EntityEnergyAtt(this, type, speed, dmg, effect, color, this.data4, density, sincantation, sfire, smove, (byte)50, dmg1, cst, sts, (byte)0);
						}
						double d8 = this.width + 0.5D;
						Vec3 vec3 = getLook(1.0F);
						entityball.posX = (this.posX + vec3.xCoord * d8);
						entityball.posY = (this.posY + this.height / 2.0F + 0.5D);
						entityball.posZ = (this.posZ + vec3.zCoord * d8);
						this.worldObj.spawnEntityInWorld(entityball);
						if ((this.data1 != 6) || ((int)(Math.random() * 8.0D) == 0))
						{
							this.attackCounter = -40;
							this.blst = true;
						}
						else
						{
							this.attackCounter = 70;
							this.blst = false;
						}
					}
				} else if (this.attackCounter > 0) {
					this.attackCounter -= 1;
				}
			} else if (this.attackCounter > 0) {
				this.attackCounter -= 1;
			}
		} else {
			super.updateEntityActionState();
		}
	}

	protected NBTTagCompound nbt(EntityPlayer p, String s) {
		NBTTagCompound nbt;
		if (s.contains("pres")) {
			if (!p.getEntityData().hasKey("PlayerPersisted")) {
				nbt = new NBTTagCompound();
				p.getEntityData().setTag("PlayerPersisted", nbt);
			} else {
				nbt = p.getEntityData().getCompoundTag("PlayerPersisted");
			}
		} else {
			nbt = p.getEntityData();
		}
		return nbt;
	}

	protected void applyEntityAttributes() {
		super.applyEntityAttributes();

		getEntityAttribute(SharedMonsterAttributes.movementSpeed).setBaseValue(
				0.699999988079071D);
	}

	public void onDeath(DamageSource par1DamageSource) {
		Entity entitySource = par1DamageSource.getEntity();
		if ((entitySource instanceof EntityPlayer)) {
			List<?> listCloseEntities = this.worldObj
					.getEntitiesWithinAABBExcludingEntity(this,
							this.boundingBox.expand(32.0D, 32.0D, 32.0D));
			for (int i = 0; i < listCloseEntities.size(); i++) {
				Entity entity = (Entity) listCloseEntities.get(i);
				if ((entity instanceof EntityDBCNeutNinjin)) {
					EntityDBCNeutNinjin entityTrain = (EntityDBCNeutNinjin) entity;
					entityTrain.becomeAngryAt(entitySource);
				}
			}
			becomeAngryAt(entitySource);
		}
		super.onDeath(par1DamageSource);
	}

	public void writeEntityToNBT(NBTTagCompound par1NBTTagCompound) {
		super.writeEntityToNBT(par1NBTTagCompound);
		par1NBTTagCompound.setShort("Anger", (short) this.angerLevel);
	}

	public void readEntityFromNBT(NBTTagCompound par1NBTTagCompound) {
		super.readEntityFromNBT(par1NBTTagCompound);
		this.angerLevel = par1NBTTagCompound.getShort("Anger");
	}

	protected Entity findPlayerToAttack() {
		return this.angerLevel == 0 ? null : super.findPlayerToAttack();
	}

	public boolean attackEntityFrom(DamageSource par1DamageSource, float par2) {
		if (isEntityInvulnerable()) {
			return false;
		}
		Entity entitySource = par1DamageSource.getEntity();
		if ((entitySource instanceof EntityPlayer)) {
			List<?> listCloseEntities = this.worldObj
					.getEntitiesWithinAABBExcludingEntity(this,
							this.boundingBox.expand(32.0D, 32.0D, 32.0D));
			for (int i = 0; i < listCloseEntities.size(); i++) {
				Entity entity = (Entity) listCloseEntities.get(i);
				if ((entity instanceof EntityDBCNeutNinjin)) {
					EntityDBCNeutNinjin entityTrain = (EntityDBCNeutNinjin) entity;
					entityTrain.becomeAngryAt(entitySource);
				}
			}
			becomeAngryAt(entitySource);
		}
		return super.attackEntityFrom(par1DamageSource, par2);
	}

	@SuppressWarnings("rawtypes")
	@Override
	public void onLivingUpdate() {

		if ((this.worldObj.isRemote) && (JRMCoreConfig.CLIENT_DA8) && (angerLevel >= 400) && (hasAnAura)) {
			for (int k = 0; k < JRMCoreConfig.get_da1(); k++) {
				for (int i = 0; i < 5; i++)
				{
					Entity pl = this;

					float a = 0.5F;float h1 = 1.0F;
					float red = auraRed;float green = auraGreen;float blue = auraBlue;

					float life = 0.8F * pl.height;
					float extra_scale = 1.0F + (pl.height > 2.1F ? pl.height / 2.0F : 0.0F) / 5.0F;
					float width = pl.width * 2.0F;

					double x = (Math.random() * 1.0D - 0.5D) * (width * 1.2F);
					double y = Math.random() * (this.height * 1.4F) - this.height / 2.0F - 0.30000001192092896D;
					double z = (Math.random() * 1.0D - 0.5D) * (width * 1.2F);

					double motx = Math.random() * 0.019999999552965164D - 0.009999999776482582D;
					double moty = (Math.random() * 0.8999999761581421D + 0.8999999761581421D) * (life * extra_scale * 0.07D);
					double motz = Math.random() * 0.019999999552965164D - 0.009999999776482582D;

					Entity entity = new EntityCusPar("jinryuumodscore:bens_particles.png", pl.worldObj, 0.2F, 0.2F, pl.posX, pl.posY + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int)(Math.random() * 3.0D) + 32, 8, 3, 32, false, 0.0F, false, 0.0F, 1, "", (int)(30.0F * life * 0.5F), 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * extra_scale, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * extra_scale, 0.2F * life * extra_scale, 0, red, green, blue, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);

					pl.worldObj.spawnEntityInWorld(entity);

					Entity entity2 = new EntityCusPar("jinryuudragonbc:bens_particles.png", pl.worldObj, 0.2F, 0.2F, pl.posX, pl.posY + ((pl instanceof EntityPlayerSP) ? -1.6F : 0.0F), pl.posZ, x, y, z, motx, moty, motz, 0.0F, (int)(Math.random() * 8.0D) + 32, 32, 8, 32, false, 0.0F, false, 0.0F, 1, "", (int)(30.0F * life * 0.5F), 2, ((float)(Math.random() * 0.029999999329447746D) + 0.03F) * life * extra_scale, ((float)(Math.random() * 0.009999999776482582D) + 0.02F) * life * extra_scale, 0.1F * life * extra_scale, 0, red, green, blue, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2, 0.0F, 0.0F, 0.4F, 0.45F, 0.08F, false, -1, true, pl);

					pl.worldObj.spawnEntityInWorld(entity2);
				}
			}
		}
		if(canTeleport)
		{
			this.wait += 1;
			List ListPlayers = this.worldObj.getEntitiesWithinAABB(EntityPlayer.class,
					this.boundingBox.expand(16.0D, 16.0D, 16.0D));
			if (!ListPlayers.isEmpty()) {
				for (int i = 0; i < ListPlayers.size(); i++) {
					Entity player = (Entity) ListPlayers.get(i);
					becomeAngryAt(player);
					if (this.wait == 150 * this.m) {
						this.m = 1;
						this.wait = 0;
						if (!this.worldObj.isRemote) {
							setPositionAndUpdate(player.posX,
									player.posY + 1.0D, player.posZ);
							this.worldObj
									.playSoundAtEntity(this, "jinryuudragonbc:DBC2.tp",
											0.5F, this.worldObj.rand
													.nextFloat() * 0.1F + 0.9F);
						}
					}
				}
			}
		}
		super.onLivingUpdate();
	}

	@Override
	public void onUpdate()
	{
		if (this.worldObj.isRemote) {
			this.rang += 1;
		}
		if ((this.worldObj.isRemote) && (this.rang > 100))
		{
			this.rang = 0;
			int i = updateDataInt(23);
			this.targetedEntity = (i > 0 ? this.worldObj.getEntityByID(i) : null);
		}
		if ((!this.worldObj.isRemote) && (!this.updtd)) {
			this.updtd = true;
		}
		if ((this.targetedEntity != null) && (canEntityBeSeen(this.targetedEntity))) {
			if (this.targetedEntity.posY - 4.0D > this.posY)
			{
				this.motionY += 0.1D;
			}
			else if (this.targetedEntity.posY - 1.6D >= this.posY)
			{
				this.posY = (this.targetedEntity.posY - 1.6D);
				this.motionY = 0.0D;
				this.fallDistance = 0.0F;
			}
		}
		super.onUpdate();
	}

	private void becomeAngryAt(Entity par1Entity) {
		this.entityToAttack = par1Entity;
		this.angerLevel = (400 + this.rand.nextInt(400));
	}

}
