package thearknoah05.tardisdecorations.registries;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import org.apache.logging.log4j.Logger;
import thearknoah05.tardisdecorations.TardisDecorations;
import thearknoah05.tardisdecorations.blocks.BlockList;
import thearknoah05.tardisdecorations.itemgroups.NTMDecoItemGroups;
import thearknoah05.tardisdecorations.items.ItemList;

public class ItemRegistries
{
    public static final Logger logger = (Logger) TardisDecorations.logger;

    @SubscribeEvent
    public static void registerItems(final RegistryEvent.Register<Item> event)
    {
        event.getRegistry().registerAll(
                ItemList.roundel_toyota = new ItemBlock(BlockList.roundel_toyota, new Item.Properties().group(ItemGroup.MISC)).setRegistryName(BlockList.roundel_toyota.getRegistryName())
        );
    }
}
