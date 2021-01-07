package thearknoah05.tardisdecorations.registries;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import thearknoah05.tardisdecorations.TardisDecorations;
import thearknoah05.tardisdecorations.blocks.BlockList;
import org.apache.logging.log4j.Logger;

public class BlockRegistries
{
    public static final Logger logger = (Logger) TardisDecorations.logger;

    @SubscribeEvent
    public static void registerBlocks(final RegistryEvent.Register<Block> event)
    {
        event.getRegistry().registerAll(
                BlockList.roundel_toyota = new Block(Block.Properties.create(Material.ROCK))
        );

        logger.info("Blocks registered.");
    }
}
