package thearknoah05.tardisdecorations.registries;


import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import org.apache.logging.log4j.Logger;
import thearknoah05.tardisdecorations.TardisDecorations;
import thearknoah05.tardisdecorations.blocks.BlockList;

@Mod.EventBusSubscriber(bus= Mod.EventBusSubscriber.Bus.MOD)
public class NTMDecoRegistries
{
    public static final Logger logger = (Logger) TardisDecorations.logger;
    public static final String modid = TardisDecorations.modid;

    public static ResourceLocation location(String name) {return new ResourceLocation(modid, name);}

}
