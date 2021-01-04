package thearknoah05.tardisdecorations.itemgroups;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import thearknoah05.tardisdecorations.items.ItemList;

public class NTMDecoItemGroups extends ItemGroup
{
    public NTMDecoItemGroups(){super("tardisdecorations");}

    @Override
    public ItemStack createIcon()
    {
        return new ItemStack(ItemList.placeholder_item);} //TODO: add real icon!
    }
}
