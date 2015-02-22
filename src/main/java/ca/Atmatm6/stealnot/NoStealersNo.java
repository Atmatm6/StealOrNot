package ca.Atmatm6.stealnot;

import ca.Atmatm6.stealnot.init.Blocks;
import ca.Atmatm6.stealnot.reference.Reference;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;
import org.apache.logging.log4j.Level;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

@Mod(modid = Reference.Strings.MODID, version = Reference.Strings.VERSIUN, name = Reference.Strings.NAMECON)
public class NoStealersNo{

    public static Logger stealog = LogManager.getLogger(Reference.Strings.NAMECON);

    @EventHandler
    public void preInit(FMLPreInitializationEvent preInitializationEvent)
    {
        stealog.log(Level.INFO, Reference.Strings.STEALINGLOGIN + "Pre Initialization Mode.");
        GameRegistry.registerBlock(Blocks.secureOre, "secure");
        stealog.log(Level.INFO, Reference.Strings.STEALINGLOGOUT + "Pre Initialization Mode");
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        stealog.log(Level.INFO, Reference.Strings.STEALINGLOGIN + "Initialization Mode.");

        stealog.log(Level.INFO, Reference.Strings.STEALINGLOGOUT + "Initialization Mode");
    }

    @EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        stealog.log(Level.INFO, Reference.Strings.STEALINGLOGIN + "Post Initialization Mode");

        stealog.log(Level.INFO, Reference.Strings.STEALINGLOGOUT + "Post Initialization Mode");
    }
}