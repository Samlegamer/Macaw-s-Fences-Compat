package fr.samlegamer.mcwfencesbyg;

import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
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
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_highley_gate.get(), RenderType.cutout());
    	
    	for(String i : MFBYGBlocksRegistry.MATERIAL)
    	{
        	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.picket_fenceAll.get(), RenderType.cutout());
    		RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.stockade_fenceAll.get(), RenderType.cutout());
    		RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.horse_fenceAll.get(), RenderType.cutout());
    		RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.wired_fenceAll.get(), RenderType.cutout());
    		RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.highley_gateAll.get(), RenderType.cutout());
    	}
	}
	
	static class TabsMFBOP extends ItemGroup
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