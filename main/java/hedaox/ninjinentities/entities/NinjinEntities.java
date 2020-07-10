package hedaox.ninjinentities.entities;

import hedaox.ninjinentities.lib.ModVars;
import cpw.mods.fml.common.registry.EntityRegistry;

public class NinjinEntities {

	private static int entityId = 0;

	public static void init()
	{
		createEntity(EntityMasterBaba.class, 64, "masterBaba");
		createEntity(EntityBandit1.class, 64, "bandit1");
		createEntity(EntityGeneralBlue.class, 64, "generalBlue");
		createEntity(EntityHercule.class, 64, "hercule");
		createEntity(EntityGohanAdult.class, 64, "gohanAdult");
		createEntity(EntityGohanAdultSsj.class, 64, "gohanAdultSsj");
		createEntity(EntityGohanAdultSsj2.class, 64, "gohanAdultSsj2");
		createEntity(EntityGohanKid1.class, 64, "gohanKid1");
		createEntity(EntityGohanKid2.class, 64, "gohanKid2");
		createEntity(EntityGohanKid3.class, 64, "gohanKid3");
		createEntity(EntityGohanKidArmor.class, 64, "gohanKidArmor");
		createEntity(EntityGohanTeen.class, 64, "gohanTeen");
		createEntity(EntityGohanTeenArmor.class, 64, "gohanTeenArmor");
		createEntity(EntityGohanTeenArmorSsj.class, 64, "gohanTeenArmorSsj");
		createEntity(EntityGohanTeenSsj.class, 64, "gohanTeenSsj");
		createEntity(EntityGohanTeenSsj2.class, 64, "gohanTeenSsj2");
		createEntity(EntityGohanUltimate.class, 64, "gohanUltimate");
		createEntity(EntityGokuKid1.class, 64, "gokuKid1");
		createEntity(EntityGokuKid2.class, 64, "gokuKid2");
		createEntity(EntityGoku1.class, 64, "goku1");
		createEntity(EntityGoku2Kaioken.class, 64, "goku2Kaioken");
		createEntity(EntityGoku2.class, 64, "goku2");
		createEntity(EntityGokuArmor.class, 64, "gokuArmor");
		createEntity(EntityGokuArmorSsj.class, 64, "gokuArmorSsj");
		createEntity(EntityGokunoweight.class, 64, "gokunoweight");
		createEntity(EntityGokuSsj.class, 64, "gokuSsj");
		createEntity(EntityGokuSsj2.class, 64, "gokuSsj2");
		createEntity(EntityGokuSsj3.class, 64, "gokuSsj3");
		createEntity(EntityGokuSsjg.class, 64, "gokuSsjg");
		createEntity(EntityGokuSsjb.class, 64, "gokuSsjb");
		createEntity(EntityGokuSuper.class, 64, "gokuSuper");
		createEntity(EntityGokuSuperSsj.class, 64, "gokuSuperSsj");
		createEntity(EntityGokuSuperSsjb.class, 64, "gokuSuperSsjb");
		createEntity(EntityGokuUI.class, 64, "gokuUi");
		createEntity(EntityGokuUIM.class, 64, "gokuUiM");
		createEntity(EntityGokuYardrat.class, 64, "gokuYardrat");
		createEntity(EntityGokuYardratSsj.class, 64, "gokuYardratSsj");
		createEntity(EntityGoten.class, 64, "goten");
		createEntity(EntityGotenSsj.class, 64, "gotenSsj");
		createEntity(EntityGotenks.class, 64, "gotenks");
		createEntity(EntityGotenksSsj.class, 64, "gotenksSsj");
		createEntity(EntityGotenksSsj3.class, 64, "gotenksSsj3");
		createEntity(EntityKrillin1.class, 64, "krillin1");
		createEntity(EntityKrillin2.class, 64, "krillin2");
		createEntity(EntityKrillinKid1.class, 64, "krillinKid1");
		createEntity(EntityKrillinKid2.class, 64, "krillinKid2");
		createEntity(EntityTien.class, 64, "tien");
		createEntity(EntityChiaotzu1.class, 64, "chiaotzu1");
		createEntity(EntityChiaotzu2.class, 64, "chiaotzu2");
		createEntity(EntityYamcha1.class, 64, "yamcha1");
		createEntity(EntityYamcha2.class, 64, "yamcha2");
		createEntity(EntityYamcha3.class, 64, "yamcha3");
		createEntity(EntityPiccolo.class, 64, "piccolo");
		createEntity(EntityOozaru.class, 64, "oozaru");
		createEntity(EntityRoshi.class, 64, "roshi");
		createEntity(EntityRoshiBuff.class, 64, "roshiBuff");
		createEntity(EntityTrunksArmor.class, 64, "trunksArmor");
		createEntity(EntityTrunksArmorSsj.class, 64, "trunksArmorSsj");
		createEntity(EntityTrunksArmorSsjG2.class, 64, "trunksArmorSsjG2");
		createEntity(EntityTrunksArmorSsjG3.class, 64, "trunksArmorSsjG3");
		createEntity(EntityTrunksFutur.class, 64, "trunksFutur");
		createEntity(EntityTrunksFuturSsj.class, 64, "trunksFuturSsj");
		createEntity(EntityTrunksFuturSuper.class, 64, "trunksFuturSuper");
		createEntity(EntityTrunksFuturSuperSsj.class, 64, "trunksFuturSuperSsj");
		createEntity(EntityTrunksFuturSuperSsj2.class, 64, "trunksFuturSuperSsj2");
		createEntity(EntityTrunksFuturSuperSsjG3.class, 64, "trunksFuturSuperSsjG3");
		createEntity(EntityTrunksFuturSuperSsjRage.class, 64, "trunksFuturSuperSsjRage");
		createEntity(EntityTrunksKid.class, 64, "trunksKid");
		createEntity(EntityTrunksKidSsj.class, 64, "trunksKidSsj");
		createEntity(EntityVegeto.class, 64, "vegeto");
		createEntity(EntityVegetoSsj.class, 64, "vegetoSsj");
		createEntity(EntityVegetoSsjb.class, 64, "vegetoSsjb");
		createEntity(EntityGogeta.class, 64, "gogeta");
		createEntity(EntityGogetaSsj.class, 64, "gogetaSsj");
		createEntity(EntityGogetaSsjb.class, 64, "gogetaSsjb");
		createEntity(EntityVegeta0.class, 64, "vegeta0");
		createEntity(EntityVegeta.class, 64, "vegeta");
		createEntity(EntityVegeta3.class, 64, "vegeta3");
		createEntity(EntityVegetaSsj.class, 64, "vegetaSsj");
		createEntity(EntityVegetaSsjG2.class, 64, "vegetaSsjG2");
		createEntity(EntityVegeta2.class, 64, "vegeta2");
		createEntity(EntityVegeta2Ssj.class, 64, "vegeta2Ssj");
		createEntity(EntityVegeta2Ssj2.class, 64, "vegeta2Ssj2");
		createEntity(EntityVegetaSsjg.class, 64, "vegetaSsjg");
		createEntity(EntityVegetaSsjb.class, 64, "vegetaSsjb");
		createEntity(EntityVegetaSsjbe.class, 64, "vegetaSsjbe");
		createEntity(EntityVegetaMajin.class, 64, "vegetaMajin");
		createEntity(EntityVegetaOozaru.class, 64, "vegetaOozaru");
		createEntity(EntityVegetaCopy.class, 64, "vegetaCopy");
		createEntity(EntityVegetaBlueCopy.class, 64, "vegetaBlueCopy");
		createEntity(EntityVegetaSuper.class, 64, "vegetaSuper");
		createEntity(EntityVegetaSuperSsj.class, 64, "vegetaSuperSsj");
		createEntity(EntityVegetaSuperSsjb.class, 64, "vegetaSuperSsjb");
		createEntity(EntityCyborgTaopaipai.class, 64, "cyborgTaopaipai");
		createEntity(EntityTaopaipai.class, 64, "taopaipai");
		createEntity(EntityDaimao.class, 64, "daimao");
		createEntity(EntityHit.class, 64, "hit");
		createEntity(EntityFrost1.class, 64, "frost1");
		createEntity(EntityFrost3.class, 64, "frost3");
		createEntity(EntityFrost4.class, 64, "frost4");
		createEntity(EntityCaulifla.class, 64, "caulifla");
		createEntity(EntityCauliflaSsj.class, 64, "cauliflaSsj");
		createEntity(EntityCauliflaSsj2.class, 64, "cauliflaSsj2");
		createEntity(EntityKale.class, 64, "kale");
		createEntity(EntityKaleSsj.class, 64, "kaleSsj");
		createEntity(EntityKaleSsjL.class, 64, "kaleSsjL");
		createEntity(EntityKaleSsj2.class, 64, "kaleSsj2");
		createEntity(EntityMonaka.class, 64, "monaka");
		createEntity(EntityGokuBlack.class, 64, "gokuBlack");
		createEntity(EntityGokuBlackSsj.class, 64, "gokuBlackSsj");
		createEntity(EntityGokuBlackR.class, 64, "gokuBlackR");
		createEntity(EntityZamasu.class, 64, "zamasu");
		createEntity(EntityZamasuMerged.class, 64, "zamasuMerged");
		createEntity(EntityJiren.class, 64, "jiren");
		createEntity(EntityJirenSuperFullPower.class, 64, "jirenSuperFullPower");
		createEntity(EntityToppo.class, 64, "toppo");
		createEntity(EntityToppoGOD.class, 64, "toppoGOD");
		createEntity(EntityDyspo.class, 64, "dyspo");
		createEntity(EntityKefla.class, 64, "kefla");
		createEntity(EntityKeflaSsj.class, 64, "keflaSsj");
		createEntity(EntityBergamo.class, 64, "bergamo");
		createEntity(EntityBasil.class, 64, "basil");
		createEntity(EntityLavender.class, 64, "lavender");
		createEntity(EntityPilina.class, 64, "pilina");
		createEntity(EntitySaonel.class, 64, "saonel");
		createEntity(EntityBrolySuper.class, 64, "brolySuper");
		createEntity(EntityBrolySuperWrath.class, 64, "brolySuperWrath");
		createEntity(EntityBrolySuperSsj.class, 64, "brolySuperSsj");
		createEntity(EntityBrolySuperSsjL.class, 64, "brolySuperSsjL");
		createEntity(EntityZarbon1.class, 64, "zarbon1");
		createEntity(EntityZarbon2.class, 64, "zarbon2");
		createEntity(EntityWhis.class, 64, "whis");
		createEntity(EntityRaditz.class, 64, "raditz");
		createEntity(EntityNappa.class, 64, "nappa");
	}
	
	// simpleEntity
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void createEntity(Class entityClass, int trackingRange, String entityName)
	{
		EntityRegistry.registerModEntity(entityClass, entityName, entityId, ModVars.MOD_ID, trackingRange, 1, true);
		entityId++;
	}
}
