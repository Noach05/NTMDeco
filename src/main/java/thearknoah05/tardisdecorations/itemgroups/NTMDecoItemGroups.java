package thearknoah05.tardisdecorations.itemgroups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thearknoah05.tardisdecorations.blocks.BlockList;
import thearknoah05.tardisdecorations.items.ItemList;

public class NTMDecoItemGroups extends ItemGroup
{
    public NTMDecoItemGroups(){super("tardisdecorations");}

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(BlockList.roundel_toyota);} //TODO: add real icon!
    }
}
