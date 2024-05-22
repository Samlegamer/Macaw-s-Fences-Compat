package fr.samlegamer.mcwfencesbyg;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
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
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.aspen_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.baobab_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cherry_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cika_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cypress_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ebony_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ether_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.fir_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.holly_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.jacaranda_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.lament_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mahogany_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mangrove_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.maple_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.nightshade_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.palm_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pine_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.redwood_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.skyris_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.willow_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.zelkova_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.bulbis_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.imparius_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.sythian_wired_fence.get(), RenderType.cutout());

    	for(String i : MFBYGBlocksRegistry.MATERIAL)
    	{
        	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.picket_fenceAll.get(), RenderType.cutout());
    		ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.stockade_fenceAll.get(), RenderType.cutout());
    		ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.horse_fenceAll.get(), RenderType.cutout());
    		ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.highley_gateAll.get(), RenderType.cutout());
        	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pyramid_gateAll.get(), RenderType.cutout());
    	}
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
}