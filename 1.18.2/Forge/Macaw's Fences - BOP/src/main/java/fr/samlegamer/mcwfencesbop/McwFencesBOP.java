package fr.samlegamer.mcwfencesbop;

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
		bus.addListener(this::client);
        LOGGER.info("Macaw's Fences - Biomes O' Plenty : Is Charged");
    }
	
    private void client(FMLClientSetupEvent event)
	{
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.cherry_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.dead_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.dead_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.dead_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.dead_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.dead_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.dead_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.fir_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.fir_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.fir_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.fir_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.fir_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.fir_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.hellbark_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.hellbark_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.hellbark_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.hellbark_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.hellbark_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.hellbark_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.jacaranda_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.jacaranda_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.jacaranda_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.jacaranda_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.jacaranda_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.jacaranda_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.magic_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.magic_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.magic_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.magic_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.magic_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.magic_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.mahogany_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.mahogany_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.mahogany_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.mahogany_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.mahogany_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.mahogany_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.palm_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.palm_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.palm_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.palm_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.palm_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.palm_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.redwood_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.redwood_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.redwood_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.redwood_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.redwood_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.redwood_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.umbran_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.umbran_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.umbran_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.umbran_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.umbran_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.umbran_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.willow_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.willow_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.willow_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.willow_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.willow_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.willow_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.pink_cherry_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.dead_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.fir_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.hellbark_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.jacaranda_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.magic_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.mahogany_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.palm_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.redwood_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.umbran_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.willow_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.maple_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.orange_autumn_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.yellow_autumn_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.white_cherry_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.flowering_oak_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.rainbow_birch_hedge.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBOPBlocksRegistry.origin_hedge.get(), RenderType.cutout());
	}
	
    private static class TabsMFBOP extends CreativeModeTab
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