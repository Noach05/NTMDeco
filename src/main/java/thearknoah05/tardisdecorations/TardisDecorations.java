package thearknoah05.tardisdecorations;

import net.minecraft.item.ItemGroup;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;
import thearknoah05.tardisdecorations.itemgroups.NTMDecoItemGroups;

@Mod(TardisDecorations.modid)
public class TardisDecorations
{
    public static TardisDecorations instance;
    public static final String modid = "tardisdecorations";
    public static final Logger logger  = LogManager.getLogger(modid);
    public static final ItemGroup NTMDeco = new NTMDecoItemGroups();

    public TardisDecorations()
    {
        instance = this;

        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::setup);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientRegistries);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event)
    {
        logger.info("Setup method registered.");
    }

    private void clientRegistries(final FMLClientSetupEvent event)
    {
        logger.info("clientRegistries method registered.");
    }

}
