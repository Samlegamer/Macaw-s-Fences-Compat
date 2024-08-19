package fr.samlegamer.mcwfencesbyg.client;

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
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.flowering_yucca_hedge);
		ColorProviderRegistry.BLOCK.register((state, view, pos, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.mahogany_hedge);

		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.flowering_yucca_hedge);
		ColorProviderRegistry.ITEM.register((stack, tintIndex) -> FoliageColors.getDefaultColor(), MFBYGBlocksRegistry.mahogany_hedge);

		BlockRenderLayerMap.INSTANCE.putBlocks(RenderLayer.getCutout(),
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
				MFBYGBlocksRegistry.ironwood_picket_fence, 
				MFBYGBlocksRegistry.ironwood_stockade_fence, 
				MFBYGBlocksRegistry.ironwood_horse_fence, 
				MFBYGBlocksRegistry.ironwood_wired_fence, 
				MFBYGBlocksRegistry.ironwood_highley_gate, 
				MFBYGBlocksRegistry.ironwood_pyramid_gate ,
				MFBYGBlocksRegistry.jacaranda_picket_fence, 
				MFBYGBlocksRegistry.jacaranda_stockade_fence, 
				MFBYGBlocksRegistry.jacaranda_horse_fence, 
				MFBYGBlocksRegistry.jacaranda_wired_fence, 
				MFBYGBlocksRegistry.jacaranda_highley_gate, 
				MFBYGBlocksRegistry.jacaranda_pyramid_gate ,
				MFBYGBlocksRegistry.mahogany_picket_fence, 
				MFBYGBlocksRegistry.mahogany_stockade_fence, 
				MFBYGBlocksRegistry.mahogany_horse_fence, 
				MFBYGBlocksRegistry.mahogany_wired_fence, 
				MFBYGBlocksRegistry.mahogany_highley_gate, 
				MFBYGBlocksRegistry.mahogany_pyramid_gate ,
				MFBYGBlocksRegistry.maple_picket_fence, 
				MFBYGBlocksRegistry.maple_stockade_fence, 
				MFBYGBlocksRegistry.maple_horse_fence, 
				MFBYGBlocksRegistry.maple_wired_fence, 
				MFBYGBlocksRegistry.maple_highley_gate, 
				MFBYGBlocksRegistry.maple_pyramid_gate ,
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
				MFBYGBlocksRegistry.sakura_picket_fence, 
				MFBYGBlocksRegistry.sakura_stockade_fence, 
				MFBYGBlocksRegistry.sakura_horse_fence, 
				MFBYGBlocksRegistry.sakura_wired_fence, 
				MFBYGBlocksRegistry.sakura_highley_gate, 
				MFBYGBlocksRegistry.sakura_pyramid_gate ,
				MFBYGBlocksRegistry.skyris_picket_fence, 
				MFBYGBlocksRegistry.skyris_stockade_fence, 
				MFBYGBlocksRegistry.skyris_horse_fence, 
				MFBYGBlocksRegistry.skyris_wired_fence, 
				MFBYGBlocksRegistry.skyris_highley_gate, 
				MFBYGBlocksRegistry.skyris_pyramid_gate ,
				MFBYGBlocksRegistry.white_mangrove_picket_fence, 
				MFBYGBlocksRegistry.white_mangrove_stockade_fence, 
				MFBYGBlocksRegistry.white_mangrove_horse_fence, 
				MFBYGBlocksRegistry.white_mangrove_wired_fence, 
				MFBYGBlocksRegistry.white_mangrove_highley_gate, 
				MFBYGBlocksRegistry.white_mangrove_pyramid_gate ,
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
				MFBYGBlocksRegistry.florus_picket_fence, 
				MFBYGBlocksRegistry.florus_stockade_fence, 
				MFBYGBlocksRegistry.florus_horse_fence, 
				MFBYGBlocksRegistry.florus_wired_fence, 
				MFBYGBlocksRegistry.florus_highley_gate, 
				MFBYGBlocksRegistry.florus_pyramid_gate ,
				MFBYGBlocksRegistry.aspen_hedge ,
				MFBYGBlocksRegistry.baobab_hedge ,
				MFBYGBlocksRegistry.blue_enchanted_hedge ,
				MFBYGBlocksRegistry.cika_hedge ,
				MFBYGBlocksRegistry.cypress_hedge ,
				MFBYGBlocksRegistry.ebony_hedge ,
				MFBYGBlocksRegistry.fir_hedge ,
				MFBYGBlocksRegistry.green_enchanted_hedge ,
				MFBYGBlocksRegistry.holly_hedge ,
				MFBYGBlocksRegistry.ironwood_hedge ,
				MFBYGBlocksRegistry.jacaranda_hedge ,
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
				MFBYGBlocksRegistry.white_sakura_hedge ,
				MFBYGBlocksRegistry.yellow_sakura_hedge ,
				MFBYGBlocksRegistry.red_maple_hedge ,
				MFBYGBlocksRegistry.araucaria_hedge ,
				MFBYGBlocksRegistry.blooming_witch_hazel_hedge ,
				MFBYGBlocksRegistry.flowering_indigo_jacaranda_hedge ,
				MFBYGBlocksRegistry.flowering_ironwood_hedge ,
				MFBYGBlocksRegistry.flowering_jacaranda_hedge ,
				MFBYGBlocksRegistry.flowering_orchard_hedge ,
				MFBYGBlocksRegistry.flowering_palo_verde_hedge ,
				MFBYGBlocksRegistry.flowering_skyris_hedge ,
				MFBYGBlocksRegistry.flowering_yucca_hedge,
				MFBYGBlocksRegistry.modern_dacite_bricks_wall, 
				MFBYGBlocksRegistry.railing_dacite_bricks_wall, 
				MFBYGBlocksRegistry.dacite_bricks_railing_gate, 
				MFBYGBlocksRegistry.dacite_bricks_pillar_wall, 
				MFBYGBlocksRegistry.dacite_bricks_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_red_rock_bricks_wall, 
				MFBYGBlocksRegistry.railing_red_rock_bricks_wall, 
				MFBYGBlocksRegistry.red_rock_bricks_railing_gate, 
				MFBYGBlocksRegistry.red_rock_bricks_pillar_wall, 
				MFBYGBlocksRegistry.red_rock_bricks_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_pink_sandstone_wall, 
				MFBYGBlocksRegistry.railing_pink_sandstone_wall, 
				MFBYGBlocksRegistry.pink_sandstone_railing_gate, 
				MFBYGBlocksRegistry.pink_sandstone_pillar_wall, 
				MFBYGBlocksRegistry.pink_sandstone_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_white_sandstone_wall, 
				MFBYGBlocksRegistry.railing_white_sandstone_wall, 
				MFBYGBlocksRegistry.white_sandstone_railing_gate, 
				MFBYGBlocksRegistry.white_sandstone_pillar_wall, 
				MFBYGBlocksRegistry.white_sandstone_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_blue_sandstone_wall, 
				MFBYGBlocksRegistry.railing_blue_sandstone_wall, 
				MFBYGBlocksRegistry.blue_sandstone_railing_gate, 
				MFBYGBlocksRegistry.blue_sandstone_pillar_wall, 
				MFBYGBlocksRegistry.blue_sandstone_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_purple_sandstone_wall, 
				MFBYGBlocksRegistry.railing_purple_sandstone_wall, 
				MFBYGBlocksRegistry.purple_sandstone_railing_gate, 
				MFBYGBlocksRegistry.purple_sandstone_pillar_wall, 
				MFBYGBlocksRegistry.purple_sandstone_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_black_sandstone_wall, 
				MFBYGBlocksRegistry.railing_black_sandstone_wall, 
				MFBYGBlocksRegistry.black_sandstone_railing_gate, 
				MFBYGBlocksRegistry.black_sandstone_pillar_wall, 
				MFBYGBlocksRegistry.black_sandstone_grass_topped_wall ,
				MFBYGBlocksRegistry.modern_windswept_sandstone_wall, 
				MFBYGBlocksRegistry.railing_windswept_sandstone_wall, 
				MFBYGBlocksRegistry.windswept_sandstone_railing_gate, 
				MFBYGBlocksRegistry.windswept_sandstone_pillar_wall, 
				MFBYGBlocksRegistry.windswept_sandstone_grass_topped_wall);
	}
}