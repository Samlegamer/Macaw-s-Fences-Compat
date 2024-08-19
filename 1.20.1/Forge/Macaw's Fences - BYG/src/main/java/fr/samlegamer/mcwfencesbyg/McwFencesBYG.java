package fr.samlegamer.mcwfencesbyg;

import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;

@Mod(McwFencesBYG.MODID)
public class McwFencesBYG
{
	public static final String MODID = "mcwfencesbyg";
    private static final Logger LOGGER = LogManager.getLogger();
    
    public McwFencesBYG()
    {
        LOGGER.info("Macaw's Fences - Oh The Biomes We've Gone : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
        DistExecutor.safeRunWhenOn(Dist.CLIENT, ()-> ()-> initClient(bus));
		MFBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.Item_Group.register(bus);
        LOGGER.info("Macaw's Fences - Oh The Biomes We've Gone : Is Charged");
    }
    
    private void initClient(IEventBus bus)
    {
    	bus.addListener(this::colorsBlock);
    	bus.addListener(this::colorsItem);
    }
    
    private void colorsBlock(RegisterColorHandlersEvent.Block e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L83
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColor.get(0.5D, 1.0D), 
        		MFBYGBlocksRegistry.mahogany_hedge.get(), 
        		MFBYGBlocksRegistry.flowering_yucca_hedge.get());
    }
    

    private void colorsItem(RegisterColorHandlersEvent.Item e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L95
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return e.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, MFBYGBlocksRegistry.mahogany_hedge.get(), MFBYGBlocksRegistry.flowering_yucca_hedge.get());
    }
    
    private void AddTab(BuildCreativeModeTabContentsEvent event)
    {
    	 if (event.getTab() == MFBYGBlocksRegistry.MF_BYG.get())
    	 {
    		 event.accept(MFBYGBlocksRegistry.aspen_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.aspen_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.aspen_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.aspen_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.aspen_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.aspen_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.cika_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cika_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cika_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cika_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cika_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.cika_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.fir_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.fir_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.fir_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.fir_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.fir_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.fir_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.holly_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.holly_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.holly_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.holly_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.holly_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.holly_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.ironwood_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ironwood_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ironwood_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ironwood_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ironwood_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.ironwood_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.maple_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.maple_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.palm_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.palm_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.palm_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.palm_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.palm_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.palm_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.pine_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.pine_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.pine_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.pine_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.pine_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.pine_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.rainbow_eucalyptus_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.rainbow_eucalyptus_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.rainbow_eucalyptus_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.rainbow_eucalyptus_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.rainbow_eucalyptus_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.rainbow_eucalyptus_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.redwood_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.redwood_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.redwood_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.redwood_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.redwood_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.redwood_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.sakura_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sakura_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sakura_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sakura_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sakura_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.sakura_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.willow_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.willow_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.willow_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.willow_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.willow_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.willow_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.witch_hazel_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.witch_hazel_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.witch_hazel_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.witch_hazel_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.witch_hazel_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.witch_hazel_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.zelkova_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.zelkova_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.zelkova_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.zelkova_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.zelkova_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.zelkova_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.florus_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.florus_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.florus_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.florus_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.florus_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.florus_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.aspen_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.cika_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.fir_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.holly_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.ironwood_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.maple_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.palm_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.pine_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.rainbow_eucalyptus_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.redwood_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.willow_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.witch_hazel_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.zelkova_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.blue_spruce_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.orange_spruce_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.red_spruce_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.yellow_spruce_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.brown_birch_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.orange_birch_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.red_birch_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.yellow_birch_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.brown_oak_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.orange_oak_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.red_oak_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.white_sakura_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.yellow_sakura_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.red_maple_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.araucaria_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.blooming_witch_hazel_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_indigo_jacaranda_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_ironwood_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_jacaranda_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_orchard_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_palo_verde_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_skyris_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_yucca_hedge.get());

    		 event.accept(MFBYGBlocksRegistry.modern_dacite_bricks_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_dacite_bricks_wall.get());
    		 event.accept(MFBYGBlocksRegistry.dacite_bricks_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.dacite_bricks_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.dacite_bricks_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_red_rock_bricks_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_red_rock_bricks_wall.get());
    		 event.accept(MFBYGBlocksRegistry.red_rock_bricks_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.red_rock_bricks_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.red_rock_bricks_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_pink_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_pink_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.pink_sandstone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.pink_sandstone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.pink_sandstone_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_white_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_white_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.white_sandstone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.white_sandstone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.white_sandstone_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_blue_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_blue_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.blue_sandstone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.blue_sandstone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.blue_sandstone_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_purple_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_purple_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.purple_sandstone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.purple_sandstone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.purple_sandstone_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_black_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_black_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.black_sandstone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.black_sandstone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.black_sandstone_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_windswept_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_windswept_sandstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.windswept_sandstone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.windswept_sandstone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.windswept_sandstone_grass_topped_wall.get());

    		 //Finish
    	 }
    }
}
