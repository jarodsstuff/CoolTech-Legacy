package mcadventurecity.cooltech.items;

import cpw.mods.fml.common.registry.GameRegistry;
import mcadventurecity.cooltech.Constants;
import mcadventurecity.cooltech.ModTabs;
import net.minecraft.item.Item;

public class OsmiumIngot extends Item {
	private String name = "osmiumIngot";
public OsmiumIngot() {
		
		setUnlocalizedName(Constants.MODID + "_" + name);
		GameRegistry.registerItem(this, name);
		setCreativeTab(ModTabs.tabCustom);
		setTextureName(Constants.MODID + ":" + name);
	}
}
