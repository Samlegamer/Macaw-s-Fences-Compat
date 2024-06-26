package fr.samlegamer.mcwfencesbyg;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;

public class McwFencesBYG implements ModInitializer
{
	public static final String MODID = "z_mcwfencesbyg";
    private static final Logger LOGGER = LogManager.getLogger();
	private static final ItemGroup TAB_MF_BYG = FabricItemGroup.builder(new Identifier(MODID, "tab_mfbyg")).icon(() -> new ItemStack(MFBYGBlocksRegistry.aspen_picket_fence)).build();

	@Override
	public void onInitialize()
	{
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Loading ...");
    	MFBYGBlocksRegistry.registry();
    	ItemGroupEvents.modifyEntriesEvent(TAB_MF_BYG).register(content -> {
    		content.add(MFBYGBlocksRegistry.aspen_picket_fence);
    		content.add(MFBYGBlocksRegistry.aspen_stockade_fence);
    		content.add(MFBYGBlocksRegistry.aspen_horse_fence);
    		content.add(MFBYGBlocksRegistry.aspen_wired_fence);
    		content.add(MFBYGBlocksRegistry.aspen_highley_gate);
    		content.add(MFBYGBlocksRegistry.aspen_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.baobab_picket_fence);
    		content.add(MFBYGBlocksRegistry.baobab_stockade_fence);
    		content.add(MFBYGBlocksRegistry.baobab_horse_fence);
    		content.add(MFBYGBlocksRegistry.baobab_wired_fence);
    		content.add(MFBYGBlocksRegistry.baobab_highley_gate);
    		content.add(MFBYGBlocksRegistry.baobab_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.blue_enchanted_picket_fence);
    		content.add(MFBYGBlocksRegistry.blue_enchanted_stockade_fence);
    		content.add(MFBYGBlocksRegistry.blue_enchanted_horse_fence);
    		content.add(MFBYGBlocksRegistry.blue_enchanted_wired_fence);
    		content.add(MFBYGBlocksRegistry.blue_enchanted_highley_gate);
    		content.add(MFBYGBlocksRegistry.blue_enchanted_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.cherry_picket_fence);
    		content.add(MFBYGBlocksRegistry.cherry_stockade_fence);
    		content.add(MFBYGBlocksRegistry.cherry_horse_fence);
    		content.add(MFBYGBlocksRegistry.cherry_wired_fence);
    		content.add(MFBYGBlocksRegistry.cherry_highley_gate);
    		content.add(MFBYGBlocksRegistry.cherry_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.cika_picket_fence);
    		content.add(MFBYGBlocksRegistry.cika_stockade_fence);
    		content.add(MFBYGBlocksRegistry.cika_horse_fence);
    		content.add(MFBYGBlocksRegistry.cika_wired_fence);
    		content.add(MFBYGBlocksRegistry.cika_highley_gate);
    		content.add(MFBYGBlocksRegistry.cika_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.cypress_picket_fence);
    		content.add(MFBYGBlocksRegistry.cypress_stockade_fence);
    		content.add(MFBYGBlocksRegistry.cypress_horse_fence);
    		content.add(MFBYGBlocksRegistry.cypress_wired_fence);
    		content.add(MFBYGBlocksRegistry.cypress_highley_gate);
    		content.add(MFBYGBlocksRegistry.cypress_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.ebony_picket_fence);
    		content.add(MFBYGBlocksRegistry.ebony_stockade_fence);
    		content.add(MFBYGBlocksRegistry.ebony_horse_fence);
    		content.add(MFBYGBlocksRegistry.ebony_wired_fence);
    		content.add(MFBYGBlocksRegistry.ebony_highley_gate);
    		content.add(MFBYGBlocksRegistry.ebony_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.ether_picket_fence);
    		content.add(MFBYGBlocksRegistry.ether_stockade_fence);
    		content.add(MFBYGBlocksRegistry.ether_horse_fence);
    		content.add(MFBYGBlocksRegistry.ether_wired_fence);
    		content.add(MFBYGBlocksRegistry.ether_highley_gate);
    		content.add(MFBYGBlocksRegistry.ether_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.fir_picket_fence);
    		content.add(MFBYGBlocksRegistry.fir_stockade_fence);
    		content.add(MFBYGBlocksRegistry.fir_horse_fence);
    		content.add(MFBYGBlocksRegistry.fir_wired_fence);
    		content.add(MFBYGBlocksRegistry.fir_highley_gate);
    		content.add(MFBYGBlocksRegistry.fir_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.green_enchanted_picket_fence);
    		content.add(MFBYGBlocksRegistry.green_enchanted_stockade_fence);
    		content.add(MFBYGBlocksRegistry.green_enchanted_horse_fence);
    		content.add(MFBYGBlocksRegistry.green_enchanted_wired_fence);
    		content.add(MFBYGBlocksRegistry.green_enchanted_highley_gate);
    		content.add(MFBYGBlocksRegistry.green_enchanted_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.holly_picket_fence);
    		content.add(MFBYGBlocksRegistry.holly_stockade_fence);
    		content.add(MFBYGBlocksRegistry.holly_horse_fence);
    		content.add(MFBYGBlocksRegistry.holly_wired_fence);
    		content.add(MFBYGBlocksRegistry.holly_highley_gate);
    		content.add(MFBYGBlocksRegistry.holly_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.jacaranda_picket_fence);
    		content.add(MFBYGBlocksRegistry.jacaranda_stockade_fence);
    		content.add(MFBYGBlocksRegistry.jacaranda_horse_fence);
    		content.add(MFBYGBlocksRegistry.jacaranda_wired_fence);
    		content.add(MFBYGBlocksRegistry.jacaranda_highley_gate);
    		content.add(MFBYGBlocksRegistry.jacaranda_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.lament_picket_fence);
    		content.add(MFBYGBlocksRegistry.lament_stockade_fence);
    		content.add(MFBYGBlocksRegistry.lament_horse_fence);
    		content.add(MFBYGBlocksRegistry.lament_wired_fence);
    		content.add(MFBYGBlocksRegistry.lament_highley_gate);
    		content.add(MFBYGBlocksRegistry.lament_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.mahogany_picket_fence);
    		content.add(MFBYGBlocksRegistry.mahogany_stockade_fence);
    		content.add(MFBYGBlocksRegistry.mahogany_horse_fence);
    		content.add(MFBYGBlocksRegistry.mahogany_wired_fence);
    		content.add(MFBYGBlocksRegistry.mahogany_highley_gate);
    		content.add(MFBYGBlocksRegistry.mahogany_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.white_mangrove_picket_fence);
    		content.add(MFBYGBlocksRegistry.white_mangrove_stockade_fence);
    		content.add(MFBYGBlocksRegistry.white_mangrove_horse_fence);
    		content.add(MFBYGBlocksRegistry.white_mangrove_wired_fence);
    		content.add(MFBYGBlocksRegistry.white_mangrove_highley_gate);
    		content.add(MFBYGBlocksRegistry.white_mangrove_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.maple_picket_fence);
    		content.add(MFBYGBlocksRegistry.maple_stockade_fence);
    		content.add(MFBYGBlocksRegistry.maple_horse_fence);
    		content.add(MFBYGBlocksRegistry.maple_wired_fence);
    		content.add(MFBYGBlocksRegistry.maple_highley_gate);
    		content.add(MFBYGBlocksRegistry.maple_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.nightshade_picket_fence);
    		content.add(MFBYGBlocksRegistry.nightshade_stockade_fence);
    		content.add(MFBYGBlocksRegistry.nightshade_horse_fence);
    		content.add(MFBYGBlocksRegistry.nightshade_wired_fence);
    		content.add(MFBYGBlocksRegistry.nightshade_highley_gate);
    		content.add(MFBYGBlocksRegistry.nightshade_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.palm_picket_fence);
    		content.add(MFBYGBlocksRegistry.palm_stockade_fence);
    		content.add(MFBYGBlocksRegistry.palm_horse_fence);
    		content.add(MFBYGBlocksRegistry.palm_wired_fence);
    		content.add(MFBYGBlocksRegistry.palm_highley_gate);
    		content.add(MFBYGBlocksRegistry.palm_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.pine_picket_fence);
    		content.add(MFBYGBlocksRegistry.pine_stockade_fence);
    		content.add(MFBYGBlocksRegistry.pine_horse_fence);
    		content.add(MFBYGBlocksRegistry.pine_wired_fence);
    		content.add(MFBYGBlocksRegistry.pine_highley_gate);
    		content.add(MFBYGBlocksRegistry.pine_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.rainbow_eucalyptus_picket_fence);
    		content.add(MFBYGBlocksRegistry.rainbow_eucalyptus_stockade_fence);
    		content.add(MFBYGBlocksRegistry.rainbow_eucalyptus_horse_fence);
    		content.add(MFBYGBlocksRegistry.rainbow_eucalyptus_wired_fence);
    		content.add(MFBYGBlocksRegistry.rainbow_eucalyptus_highley_gate);
    		content.add(MFBYGBlocksRegistry.rainbow_eucalyptus_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.redwood_picket_fence);
    		content.add(MFBYGBlocksRegistry.redwood_stockade_fence);
    		content.add(MFBYGBlocksRegistry.redwood_horse_fence);
    		content.add(MFBYGBlocksRegistry.redwood_wired_fence);
    		content.add(MFBYGBlocksRegistry.redwood_highley_gate);
    		content.add(MFBYGBlocksRegistry.redwood_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.skyris_picket_fence);
    		content.add(MFBYGBlocksRegistry.skyris_stockade_fence);
    		content.add(MFBYGBlocksRegistry.skyris_horse_fence);
    		content.add(MFBYGBlocksRegistry.skyris_wired_fence);
    		content.add(MFBYGBlocksRegistry.skyris_highley_gate);
    		content.add(MFBYGBlocksRegistry.skyris_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.willow_picket_fence);
    		content.add(MFBYGBlocksRegistry.willow_stockade_fence);
    		content.add(MFBYGBlocksRegistry.willow_horse_fence);
    		content.add(MFBYGBlocksRegistry.willow_wired_fence);
    		content.add(MFBYGBlocksRegistry.willow_highley_gate);
    		content.add(MFBYGBlocksRegistry.willow_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.witch_hazel_picket_fence);
    		content.add(MFBYGBlocksRegistry.witch_hazel_stockade_fence);
    		content.add(MFBYGBlocksRegistry.witch_hazel_horse_fence);
    		content.add(MFBYGBlocksRegistry.witch_hazel_wired_fence);
    		content.add(MFBYGBlocksRegistry.witch_hazel_highley_gate);
    		content.add(MFBYGBlocksRegistry.witch_hazel_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.zelkova_picket_fence);
    		content.add(MFBYGBlocksRegistry.zelkova_stockade_fence);
    		content.add(MFBYGBlocksRegistry.zelkova_horse_fence);
    		content.add(MFBYGBlocksRegistry.zelkova_wired_fence);
    		content.add(MFBYGBlocksRegistry.zelkova_highley_gate);
    		content.add(MFBYGBlocksRegistry.zelkova_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.bulbis_picket_fence);
    		content.add(MFBYGBlocksRegistry.bulbis_stockade_fence);
    		content.add(MFBYGBlocksRegistry.bulbis_horse_fence);
    		content.add(MFBYGBlocksRegistry.bulbis_wired_fence);
    		content.add(MFBYGBlocksRegistry.bulbis_highley_gate);
    		content.add(MFBYGBlocksRegistry.bulbis_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.imparius_picket_fence);
    		content.add(MFBYGBlocksRegistry.imparius_stockade_fence);
    		content.add(MFBYGBlocksRegistry.imparius_horse_fence);
    		content.add(MFBYGBlocksRegistry.imparius_wired_fence);
    		content.add(MFBYGBlocksRegistry.imparius_highley_gate);
    		content.add(MFBYGBlocksRegistry.imparius_pyramid_gate);
    		content.add(MFBYGBlocksRegistry.sythian_picket_fence);
    		content.add(MFBYGBlocksRegistry.sythian_stockade_fence);
    		content.add(MFBYGBlocksRegistry.sythian_horse_fence);
    		content.add(MFBYGBlocksRegistry.sythian_wired_fence);
    		content.add(MFBYGBlocksRegistry.sythian_highley_gate);
    		content.add(MFBYGBlocksRegistry.sythian_pyramid_gate);
    		//Finish
    	});
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Is Charged");
	}
}