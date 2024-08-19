package fr.samlegamer.mcwfencesbyg;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;

@Mod(McwFencesBYG.MODID)
public class McwFencesBYG
{
	public static final String MODID = "mcwfencesbyg";
	public static final TabsMFBOP TAB_GROUP = new TabsMFBOP("tab_mfbyg");
    private static final Logger LOGGER = LogManager.getLogger();

    public McwFencesBYG()
    {
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Is Charged");
    }
    
	private static class TabsMFBOP extends CreativeModeTab
	{
		public TabsMFBOP(String p_i1853_2_)
		{
			super(p_i1853_2_);
		}

		@Override
		public ItemStack makeIcon() {
			return new ItemStack(MFBYGBlocksRegistry.aspen_picket_fence.get());
		}
		
		@Override
		public boolean hasSearchBar()
		{
			return false;
		}
	}
}