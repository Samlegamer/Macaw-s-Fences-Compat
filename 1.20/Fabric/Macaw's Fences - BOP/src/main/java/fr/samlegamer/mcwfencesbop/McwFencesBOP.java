package fr.samlegamer.mcwfencesbop;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.kikoz.mcwfences.MacawsFences;

public class McwFencesBOP implements ModInitializer
{
	public static final String MODID = "mcwfencesbop";
    private static final Logger LOGGER = LogManager.getLogger();

    @Override
	public void onInitialize()
	{
    	LOGGER.info("Macaw's Fences - Biomes O Plenty... Loading...");
		MFBOPBlocksRegistry.registry();
		ItemGroupEvents.modifyEntriesEvent(MacawsFences.FENCESGROUP).register(content -> {
			content.add(MFBOPBlocksRegistry.dead_picket_fence);
			content.add(MFBOPBlocksRegistry.dead_stockade_fence);
			content.add(MFBOPBlocksRegistry.dead_horse_fence);
			content.add(MFBOPBlocksRegistry.dead_wired_fence);
			content.add(MFBOPBlocksRegistry.dead_highley_gate);
			content.add(MFBOPBlocksRegistry.dead_pyramid_gate);
			content.add(MFBOPBlocksRegistry.fir_picket_fence);
			content.add(MFBOPBlocksRegistry.fir_stockade_fence);
			content.add(MFBOPBlocksRegistry.fir_horse_fence);
			content.add(MFBOPBlocksRegistry.fir_wired_fence);
			content.add(MFBOPBlocksRegistry.fir_highley_gate);
			content.add(MFBOPBlocksRegistry.fir_pyramid_gate);
			content.add(MFBOPBlocksRegistry.hellbark_picket_fence);
			content.add(MFBOPBlocksRegistry.hellbark_stockade_fence);
			content.add(MFBOPBlocksRegistry.hellbark_horse_fence);
			content.add(MFBOPBlocksRegistry.hellbark_wired_fence);
			content.add(MFBOPBlocksRegistry.hellbark_highley_gate);
			content.add(MFBOPBlocksRegistry.hellbark_pyramid_gate);
			content.add(MFBOPBlocksRegistry.jacaranda_picket_fence);
			content.add(MFBOPBlocksRegistry.jacaranda_stockade_fence);
			content.add(MFBOPBlocksRegistry.jacaranda_horse_fence);
			content.add(MFBOPBlocksRegistry.jacaranda_wired_fence);
			content.add(MFBOPBlocksRegistry.jacaranda_highley_gate);
			content.add(MFBOPBlocksRegistry.jacaranda_pyramid_gate);
			content.add(MFBOPBlocksRegistry.magic_picket_fence);
			content.add(MFBOPBlocksRegistry.magic_stockade_fence);
			content.add(MFBOPBlocksRegistry.magic_horse_fence);
			content.add(MFBOPBlocksRegistry.magic_wired_fence);
			content.add(MFBOPBlocksRegistry.magic_highley_gate);
			content.add(MFBOPBlocksRegistry.magic_pyramid_gate);
			content.add(MFBOPBlocksRegistry.mahogany_picket_fence);
			content.add(MFBOPBlocksRegistry.mahogany_stockade_fence);
			content.add(MFBOPBlocksRegistry.mahogany_horse_fence);
			content.add(MFBOPBlocksRegistry.mahogany_wired_fence);
			content.add(MFBOPBlocksRegistry.mahogany_highley_gate);
			content.add(MFBOPBlocksRegistry.mahogany_pyramid_gate);
			content.add(MFBOPBlocksRegistry.palm_picket_fence);
			content.add(MFBOPBlocksRegistry.palm_stockade_fence);
			content.add(MFBOPBlocksRegistry.palm_horse_fence);
			content.add(MFBOPBlocksRegistry.palm_wired_fence);
			content.add(MFBOPBlocksRegistry.palm_highley_gate);
			content.add(MFBOPBlocksRegistry.palm_pyramid_gate);
			content.add(MFBOPBlocksRegistry.redwood_picket_fence);
			content.add(MFBOPBlocksRegistry.redwood_stockade_fence);
			content.add(MFBOPBlocksRegistry.redwood_horse_fence);
			content.add(MFBOPBlocksRegistry.redwood_wired_fence);
			content.add(MFBOPBlocksRegistry.redwood_highley_gate);
			content.add(MFBOPBlocksRegistry.redwood_pyramid_gate);
			content.add(MFBOPBlocksRegistry.umbran_picket_fence);
			content.add(MFBOPBlocksRegistry.umbran_stockade_fence);
			content.add(MFBOPBlocksRegistry.umbran_horse_fence);
			content.add(MFBOPBlocksRegistry.umbran_wired_fence);
			content.add(MFBOPBlocksRegistry.umbran_highley_gate);
			content.add(MFBOPBlocksRegistry.umbran_pyramid_gate);
			content.add(MFBOPBlocksRegistry.willow_picket_fence);
			content.add(MFBOPBlocksRegistry.willow_stockade_fence);
			content.add(MFBOPBlocksRegistry.willow_horse_fence);
			content.add(MFBOPBlocksRegistry.willow_wired_fence);
			content.add(MFBOPBlocksRegistry.willow_highley_gate);
			content.add(MFBOPBlocksRegistry.willow_pyramid_gate);
		});
    	LOGGER.info("Macaw's Fences - Biomes O Plenty... Finish...");
	}

    /*private void AddTab(BuildCreativeModeTabContentsEvent event)
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
    	 }
    }*/
}