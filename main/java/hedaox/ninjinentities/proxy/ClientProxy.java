package hedaox.ninjinentities.proxy;

import hedaox.ninjinentities.rendering.entities.NinjinRenderEntities;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

/**
 * Do Things on client side
 * 
 * @author Hedaox
 */

public class ClientProxy extends CommonProxy{
	
    public void preInit(FMLPreInitializationEvent $e) 
    {
    	super.preInit($e);
        
        NinjinRenderEntities.init();
  
    }

    public void init(FMLInitializationEvent $e)
    {
    	super.init($e);
    	
    }

	public void postInit(FMLPostInitializationEvent $e)
    {
    	super.postInit($e);
    	
    }
}
