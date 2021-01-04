package thearknoah05.tardisdecorations.registries;


import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import thearknoah05.tardisdecorations.TardisDecorations;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class NTMDecoRegistries
{
    public static final Logger logger = (Logger) TardisDecorations.logger;
    public static final String modid = TardisDecorations.modid;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(

                );

        logger.info("Items registered.");
    }

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(

        );

        logger.info("Blocks registered.");
    }

    public static ResourceLocation location(String name) {return new ResourceLocation(modid, name);}

}
