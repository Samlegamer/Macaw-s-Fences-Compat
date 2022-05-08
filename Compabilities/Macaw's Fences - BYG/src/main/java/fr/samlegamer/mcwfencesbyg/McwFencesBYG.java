package fr.samlegamer.mcwfencesbyg;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import potionstudios.byg.BYG;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import com.mcwfences.kikoz.MacawsFences;
import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;

@Mod(McwFencesBYG.MODID)
public class McwFencesBYG
{
	public static final String MODID = "mcwfencesbyg";
	public static final TabsMFBOP TAB_GROUP = new TabsMFBOP("tab_mfbyg");
    private static final Logger LOGGER = LogManager.getLogger();

    public McwFencesBYG()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.registry();
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Is Charged");
    }
	
    void client(FMLClientSetupEvent event)
	{
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.picket_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.stockade_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.horse_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.wired_fenceAll.get(), RenderType.cutout());
		ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.highley_gateAll.get(), RenderType.cutout());
	}
	
	static class TabsMFBOP extends CreativeModeTab
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
	
	private void require(BYG bop, MacawsFences bridges) {}
}