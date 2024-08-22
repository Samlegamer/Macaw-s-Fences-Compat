package fr.samlegamer.mcwfencesbyg;

import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;
import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.fabricmc.fabric.api.client.rendering.v1.ColorProviderRegistry;
import net.minecraft.client.color.world.FoliageColors;
import net.minecraft.client.render.RenderLayer;

@Environment(EnvType.CLIENT)
public class McwFencesBYGClient implements ClientModInitializer
{
	@Override
	public void onInitializeClient()
	{

		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
				MFBYGBlocksRegistry.modern_soapstone_wall, 
				MFBYGBlocksRegistry.railing_soapstone_wall, 
				MFBYGBlocksRegistry.soapstone_railing_gate, 
				MFBYGBlocksRegistry.soapstone_pillar_wall, 
				MFBYGBlocksRegistry.soapstone_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_travertine_wall, 
				MFBYGBlocksRegistry.railing_travertine_wall, 
				MFBYGBlocksRegistry.travertine_railing_gate, 
				MFBYGBlocksRegistry.travertine_pillar_wall, 
				MFBYGBlocksRegistry.travertine_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_dacite_wall, 
				MFBYGBlocksRegistry.railing_dacite_wall, 
				MFBYGBlocksRegistry.dacite_railing_gate, 
				MFBYGBlocksRegistry.dacite_pillar_wall, 
				MFBYGBlocksRegistry.dacite_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_red_rock_wall, 
				MFBYGBlocksRegistry.railing_red_rock_wall, 
				MFBYGBlocksRegistry.red_rock_railing_gate, 
				MFBYGBlocksRegistry.red_rock_pillar_wall, 
				MFBYGBlocksRegistry.red_rock_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_scoria_stone_wall, 
				MFBYGBlocksRegistry.railing_scoria_stone_wall, 
				MFBYGBlocksRegistry.scoria_stone_railing_gate, 
				MFBYGBlocksRegistry.scoria_stone_pillar_wall, 
				MFBYGBlocksRegistry.scoria_stone_grass_topped_wall,
				MFBYGBlocksRegistry.aspen_picket_fence, 
				MFBYGBlocksRegistry.aspen_stockade_fence, 
				MFBYGBlocksRegistry.aspen_horse_fence, 
				MFBYGBlocksRegistry.aspen_wired_fence, 
				MFBYGBlocksRegistry.aspen_highley_gate, 
				MFBYGBlocksRegistry.aspen_pyramid_gate ,
				MFBYGBlocksRegistry.baobab_picket_fence, 
				MFBYGBlocksRegistry.baobab_stockade_fence, 
				MFBYGBlocksRegistry.baobab_horse_fence, 
				MFBYGBlocksRegistry.baobab_wired_fence, 
				MFBYGBlocksRegistry.baobab_highley_gate, 
				MFBYGBlocksRegistry.baobab_pyramid_gate ,
				MFBYGBlocksRegistry.blue_enchanted_picket_fence, 
				MFBYGBlocksRegistry.blue_enchanted_stockade_fence, 
				MFBYGBlocksRegistry.blue_enchanted_horse_fence, 
				MFBYGBlocksRegistry.blue_enchanted_wired_fence, 
				MFBYGBlocksRegistry.blue_enchanted_highley_gate, 
				MFBYGBlocksRegistry.blue_enchanted_pyramid_gate ,
				MFBYGBlocksRegistry.cherry_picket_fence, 
				MFBYGBlocksRegistry.cherry_stockade_fence, 
				MFBYGBlocksRegistry.cherry_horse_fence, 
				MFBYGBlocksRegistry.cherry_wired_fence, 
				MFBYGBlocksRegistry.cherry_highley_gate, 
				MFBYGBlocksRegistry.cherry_pyramid_gate ,
				MFBYGBlocksRegistry.cika_picket_fence, 
				MFBYGBlocksRegistry.cika_stockade_fence, 
				MFBYGBlocksRegistry.cika_horse_fence, 
				MFBYGBlocksRegistry.cika_wired_fence, 
				MFBYGBlocksRegistry.cika_highley_gate, 
				MFBYGBlocksRegistry.cika_pyramid_gate ,
				MFBYGBlocksRegistry.cypress_picket_fence, 
				MFBYGBlocksRegistry.cypress_stockade_fence, 
				MFBYGBlocksRegistry.cypress_horse_fence, 
				MFBYGBlocksRegistry.cypress_wired_fence, 
				MFBYGBlocksRegistry.cypress_highley_gate, 
				MFBYGBlocksRegistry.cypress_pyramid_gate ,
				MFBYGBlocksRegistry.ebony_picket_fence, 
				MFBYGBlocksRegistry.ebony_stockade_fence, 
				MFBYGBlocksRegistry.ebony_horse_fence, 
				MFBYGBlocksRegistry.ebony_wired_fence, 
				MFBYGBlocksRegistry.ebony_highley_gate, 
				MFBYGBlocksRegistry.ebony_pyramid_gate ,
				MFBYGBlocksRegistry.ether_picket_fence, 
				MFBYGBlocksRegistry.ether_stockade_fence, 
				MFBYGBlocksRegistry.ether_horse_fence, 
				MFBYGBlocksRegistry.ether_wired_fence, 
				MFBYGBlocksRegistry.ether_highley_gate, 
				MFBYGBlocksRegistry.ether_pyramid_gate ,
				MFBYGBlocksRegistry.fir_picket_fence, 
				MFBYGBlocksRegistry.fir_stockade_fence, 
				MFBYGBlocksRegistry.fir_horse_fence, 
				MFBYGBlocksRegistry.fir_wired_fence, 
				MFBYGBlocksRegistry.fir_highley_gate, 
				MFBYGBlocksRegistry.fir_pyramid_gate ,
				MFBYGBlocksRegistry.green_enchanted_picket_fence, 
				MFBYGBlocksRegistry.green_enchanted_stockade_fence, 
				MFBYGBlocksRegistry.green_enchanted_horse_fence, 
				MFBYGBlocksRegistry.green_enchanted_wired_fence, 
				MFBYGBlocksRegistry.green_enchanted_highley_gate, 
				MFBYGBlocksRegistry.green_enchanted_pyramid_gate ,
				MFBYGBlocksRegistry.holly_picket_fence, 
				MFBYGBlocksRegistry.holly_stockade_fence, 
				MFBYGBlocksRegistry.holly_horse_fence, 
				MFBYGBlocksRegistry.holly_wired_fence, 
				MFBYGBlocksRegistry.holly_highley_gate, 
				MFBYGBlocksRegistry.holly_pyramid_gate ,
				MFBYGBlocksRegistry.jacaranda_picket_fence, 
				MFBYGBlocksRegistry.jacaranda_stockade_fence, 
				MFBYGBlocksRegistry.jacaranda_horse_fence, 
				MFBYGBlocksRegistry.jacaranda_wired_fence, 
				MFBYGBlocksRegistry.jacaranda_highley_gate, 
				MFBYGBlocksRegistry.jacaranda_pyramid_gate ,
				MFBYGBlocksRegistry.lament_picket_fence, 
				MFBYGBlocksRegistry.lament_stockade_fence, 
				MFBYGBlocksRegistry.lament_horse_fence, 
				MFBYGBlocksRegistry.lament_wired_fence, 
				MFBYGBlocksRegistry.lament_highley_gate, 
				MFBYGBlocksRegistry.lament_pyramid_gate ,
				MFBYGBlocksRegistry.mahogany_picket_fence, 
				MFBYGBlocksRegistry.mahogany_stockade_fence, 
				MFBYGBlocksRegistry.mahogany_horse_fence, 
				MFBYGBlocksRegistry.mahogany_wired_fence, 
				MFBYGBlocksRegistry.mahogany_highley_gate, 
				MFBYGBlocksRegistry.mahogany_pyramid_gate ,
				MFBYGBlocksRegistry.white_mangrove_picket_fence, 
				MFBYGBlocksRegistry.white_mangrove_stockade_fence, 
				MFBYGBlocksRegistry.white_mangrove_horse_fence, 
				MFBYGBlocksRegistry.white_mangrove_wired_fence, 
				MFBYGBlocksRegistry.white_mangrove_highley_gate, 
				MFBYGBlocksRegistry.white_mangrove_pyramid_gate ,
				MFBYGBlocksRegistry.maple_picket_fence, 
				MFBYGBlocksRegistry.maple_stockade_fence, 
				MFBYGBlocksRegistry.maple_horse_fence, 
				MFBYGBlocksRegistry.maple_wired_fence, 
				MFBYGBlocksRegistry.maple_highley_gate, 
				MFBYGBlocksRegistry.maple_pyramid_gate ,
				MFBYGBlocksRegistry.nightshade_picket_fence, 
				MFBYGBlocksRegistry.nightshade_stockade_fence, 
				MFBYGBlocksRegistry.nightshade_horse_fence, 
				MFBYGBlocksRegistry.nightshade_wired_fence, 
				MFBYGBlocksRegistry.nightshade_highley_gate, 
				MFBYGBlocksRegistry.nightshade_pyramid_gate ,
				MFBYGBlocksRegistry.palm_picket_fence, 
				MFBYGBlocksRegistry.palm_stockade_fence, 
				MFBYGBlocksRegistry.palm_horse_fence, 
				MFBYGBlocksRegistry.palm_wired_fence, 
				MFBYGBlocksRegistry.palm_highley_gate, 
				MFBYGBlocksRegistry.palm_pyramid_gate ,
				MFBYGBlocksRegistry.pine_picket_fence, 
				MFBYGBlocksRegistry.pine_stockade_fence, 
				MFBYGBlocksRegistry.pine_horse_fence, 
				MFBYGBlocksRegistry.pine_wired_fence, 
				MFBYGBlocksRegistry.pine_highley_gate, 
				MFBYGBlocksRegistry.pine_pyramid_gate ,
				MFBYGBlocksRegistry.rainbow_eucalyptus_picket_fence, 
				MFBYGBlocksRegistry.rainbow_eucalyptus_stockade_fence, 
				MFBYGBlocksRegistry.rainbow_eucalyptus_horse_fence, 
				MFBYGBlocksRegistry.rainbow_eucalyptus_wired_fence, 
				MFBYGBlocksRegistry.rainbow_eucalyptus_highley_gate, 
				MFBYGBlocksRegistry.rainbow_eucalyptus_pyramid_gate ,
				MFBYGBlocksRegistry.redwood_picket_fence, 
				MFBYGBlocksRegistry.redwood_stockade_fence, 
				MFBYGBlocksRegistry.redwood_horse_fence, 
				MFBYGBlocksRegistry.redwood_wired_fence, 
				MFBYGBlocksRegistry.redwood_highley_gate, 
				MFBYGBlocksRegistry.redwood_pyramid_gate ,
				MFBYGBlocksRegistry.skyris_picket_fence, 
				MFBYGBlocksRegistry.skyris_stockade_fence, 
				MFBYGBlocksRegistry.skyris_horse_fence, 
				MFBYGBlocksRegistry.skyris_wired_fence, 
				MFBYGBlocksRegistry.skyris_highley_gate, 
				MFBYGBlocksRegistry.skyris_pyramid_gate ,
				MFBYGBlocksRegistry.willow_picket_fence, 
				MFBYGBlocksRegistry.willow_stockade_fence, 
				MFBYGBlocksRegistry.willow_horse_fence, 
				MFBYGBlocksRegistry.willow_wired_fence, 
				MFBYGBlocksRegistry.willow_highley_gate, 
				MFBYGBlocksRegistry.willow_pyramid_gate ,
				MFBYGBlocksRegistry.witch_hazel_picket_fence, 
				MFBYGBlocksRegistry.witch_hazel_stockade_fence, 
				MFBYGBlocksRegistry.witch_hazel_horse_fence, 
				MFBYGBlocksRegistry.witch_hazel_wired_fence, 
				MFBYGBlocksRegistry.witch_hazel_highley_gate, 
				MFBYGBlocksRegistry.witch_hazel_pyramid_gate ,
				MFBYGBlocksRegistry.zelkova_picket_fence, 
				MFBYGBlocksRegistry.zelkova_stockade_fence, 
				MFBYGBlocksRegistry.zelkova_horse_fence, 
				MFBYGBlocksRegistry.zelkova_wired_fence, 
				MFBYGBlocksRegistry.zelkova_highley_gate, 
				MFBYGBlocksRegistry.zelkova_pyramid_gate ,
				MFBYGBlocksRegistry.bulbis_picket_fence, 
				MFBYGBlocksRegistry.bulbis_stockade_fence, 
				MFBYGBlocksRegistry.bulbis_horse_fence, 
				MFBYGBlocksRegistry.bulbis_wired_fence, 
				MFBYGBlocksRegistry.bulbis_highley_gate, 
				MFBYGBlocksRegistry.bulbis_pyramid_gate ,
				MFBYGBlocksRegistry.imparius_picket_fence, 
				MFBYGBlocksRegistry.imparius_stockade_fence, 
				MFBYGBlocksRegistry.imparius_horse_fence, 
				MFBYGBlocksRegistry.imparius_wired_fence, 
				MFBYGBlocksRegistry.imparius_highley_gate, 
				MFBYGBlocksRegistry.imparius_pyramid_gate ,
				MFBYGBlocksRegistry.sythian_picket_fence, 
				MFBYGBlocksRegistry.sythian_stockade_fence, 
				MFBYGBlocksRegistry.sythian_horse_fence, 
				MFBYGBlocksRegistry.sythian_wired_fence, 
				MFBYGBlocksRegistry.sythian_highley_gate, 
				MFBYGBlocksRegistry.sythian_pyramid_gate ,
				MFBYGBlocksRegistry.aspen_hedge ,
				MFBYGBlocksRegistry.baobab_hedge ,
				MFBYGBlocksRegistry.blue_enchanted_hedge ,
				MFBYGBlocksRegistry.cika_hedge ,
				MFBYGBlocksRegistry.cypress_hedge ,
				MFBYGBlocksRegistry.ebony_hedge ,
				MFBYGBlocksRegistry.ether_hedge ,
				MFBYGBlocksRegistry.fir_hedge ,
				MFBYGBlocksRegistry.green_enchanted_hedge ,
				MFBYGBlocksRegistry.holly_hedge ,
				MFBYGBlocksRegistry.jacaranda_hedge ,
				MFBYGBlocksRegistry.lament_hedge ,
				MFBYGBlocksRegistry.mahogany_hedge ,
				MFBYGBlocksRegistry.maple_hedge ,
				MFBYGBlocksRegistry.palm_hedge ,
				MFBYGBlocksRegistry.pine_hedge ,
				MFBYGBlocksRegistry.rainbow_eucalyptus_hedge ,
				MFBYGBlocksRegistry.redwood_hedge ,
				MFBYGBlocksRegistry.skyris_hedge ,
				MFBYGBlocksRegistry.white_mangrove_hedge ,
				MFBYGBlocksRegistry.willow_hedge ,
				MFBYGBlocksRegistry.witch_hazel_hedge ,
				MFBYGBlocksRegistry.zelkova_hedge ,
				MFBYGBlocksRegistry.blue_spruce_hedge ,
				MFBYGBlocksRegistry.orange_spruce_hedge ,
				MFBYGBlocksRegistry.red_spruce_hedge ,
				MFBYGBlocksRegistry.yellow_spruce_hedge ,
				MFBYGBlocksRegistry.brown_birch_hedge ,
				MFBYGBlocksRegistry.orange_birch_hedge ,
				MFBYGBlocksRegistry.red_birch_hedge ,
				MFBYGBlocksRegistry.yellow_birch_hedge ,
				MFBYGBlocksRegistry.brown_oak_hedge ,
				MFBYGBlocksRegistry.orange_oak_hedge ,
				MFBYGBlocksRegistry.red_oak_hedge ,
				MFBYGBlocksRegistry.white_cherry_hedge ,
				MFBYGBlocksRegistry.pink_cherry_hedge ,
				MFBYGBlocksRegistry.araucaria_hedge ,
				MFBYGBlocksRegistry.blooming_witch_hazel_hedge ,
				MFBYGBlocksRegistry.flowering_indigo_jacaranda_hedge ,
				MFBYGBlocksRegistry.flowering_jacaranda_hedge ,
				MFBYGBlocksRegistry.flowering_orchard_hedge ,
				MFBYGBlocksRegistry.flowering_palo_verde_hedge ,
				MFBYGBlocksRegistry.palo_verde_hedge);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.mahogany_hedge);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.maple_hedge);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.mahogany_hedge);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.maple_hedge);
	}
}