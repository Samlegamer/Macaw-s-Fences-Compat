package fr.samlegamer.mcwfencesbop;

import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;
import net.neoforged.neoforge.event.BuildCreativeModeTabContentsEvent;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;

@Mod(McwFencesBOP.MODID)
public class McwFencesBOP
{
	public static final String MODID = "mcwfencesbop";
    private static final Logger LOGGER = LogManager.getLogger();

    public McwFencesBOP(IEventBus modEventBus)
    {
        LOGGER.info("Macaw's Fences - Biome O' Plenty : Loading ...");
		MFBOPBlocksRegistry.ITEMS_REGISTRY.register(modEventBus);
		MFBOPBlocksRegistry.BLOCKS_REGISTRY.register(modEventBus);
		MFBOPBlocksRegistry.Item_Group.register(modEventBus);
    	modEventBus.addListener(this::AddTab);
        LOGGER.info("Macaw's Fences - Biome O' Plenty : Is Charged");
    }
	
    private void AddTab(BuildCreativeModeTabContentsEvent event)
    {
    	 if (event.getTab() == MFBOPBlocksRegistry.MF_CT.get())
    	 {
    		 event.accept(MFBOPBlocksRegistry.dead_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.dead_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.dead_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.dead_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.dead_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.dead_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.fir_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.fir_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.fir_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.fir_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.fir_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.fir_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.hellbark_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.hellbark_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.hellbark_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.hellbark_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.hellbark_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.hellbark_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.jacaranda_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.jacaranda_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.jacaranda_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.jacaranda_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.jacaranda_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.jacaranda_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.magic_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.magic_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.magic_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.magic_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.magic_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.magic_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.mahogany_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.mahogany_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.mahogany_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.mahogany_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.mahogany_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.mahogany_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.palm_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.palm_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.palm_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.palm_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.palm_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.palm_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.redwood_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.redwood_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.redwood_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.redwood_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.redwood_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.redwood_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.umbran_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.umbran_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.umbran_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.umbran_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.umbran_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.umbran_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.willow_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.willow_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.willow_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.willow_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.willow_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.willow_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.empyreal_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.empyreal_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.empyreal_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.empyreal_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.empyreal_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.empyreal_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.maple_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.maple_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.maple_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.maple_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.maple_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.maple_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.pine_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.pine_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.pine_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.pine_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.pine_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.pine_pyramid_gate.get());
    		 event.accept(MFBOPBlocksRegistry.dead_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.fir_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.hellbark_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.jacaranda_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.magic_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.mahogany_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.palm_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.redwood_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.umbran_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.willow_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.empyreal_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.pine_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.orange_maple_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.red_maple_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.yellow_maple_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.cypress_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.snowblossom_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.flowering_oak_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.rainbow_birch_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.origin_hedge.get());
    	 }
    }
}