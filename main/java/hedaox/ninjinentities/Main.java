package hedaox.ninjinentities;

import hedaox.ninjinentities.proxy.CommonProxy;
import hedaox.ninjinentities.lib.ModVars;
import hedaox.ninjinentities.entities.NinjinEntities;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
/**
 *  Main class
 *
 * @author Hedaox
 */
@Mod(modid = ModVars.MOD_ID, name = ModVars.MOD_name)
public class Main
{
	
	@Instance
	public static Main instance = new Main();
	
	@SidedProxy(clientSide = "hedaox.ninjinentities.proxy.ClientProxy", serverSide = "hedaox.ninjinentities.proxy.ServerProxy")
	public static CommonProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent $e)
    {
    	proxy.preInit($e);
    	NinjinEntities.init();
    }
    @EventHandler
    public void init(FMLInitializationEvent $e)
    {
    	proxy.init($e);
    }
    @EventHandler
    public void postInit(FMLPostInitializationEvent $e)
    {
    	proxy.postInit($e);
    }
}