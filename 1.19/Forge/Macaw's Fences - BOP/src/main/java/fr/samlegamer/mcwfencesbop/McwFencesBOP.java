package fr.samlegamer.mcwfencesbop;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;

@Mod(McwFencesBOP.MODID)
public class McwFencesBOP
{
	public static final String MODID = "mcwfencesbop";
	public static final TabsMFBOP TAB_GROUP = new TabsMFBOP("mcwfencesbop.tab_mfbop");
    private static final Logger LOGGER = LogManager.getLogger();

    public McwFencesBOP()
    {
        LOGGER.info("Macaw's Fences - Biomes O' Plenty : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
        LOGGER.info("Macaw's Fences - Biomes O' Plenty : Is Charged");
    }
		
	static class TabsMFBOP extends CreativeModeTab
	{
		public TabsMFBOP(String p_i1853_2_)
		{
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(MFBOPBlocksRegistry.cherry_picket_fence.get());
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return false;
		}
	}
}