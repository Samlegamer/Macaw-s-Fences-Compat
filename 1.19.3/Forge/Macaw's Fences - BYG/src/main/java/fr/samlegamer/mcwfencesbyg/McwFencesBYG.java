package fr.samlegamer.mcwfencesbyg;

import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.IEventBus;
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
    private static CreativeModeTab MF_BYG;
    
    public McwFencesBYG()
    {
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		bus.addListener(this::CreateTab);
        bus.addListener(this::AddTab);
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Is Charged");
    }
	    
    private void CreateTab(CreativeModeTabEvent.Register event)
    {
    	McwFencesBYG.MF_BYG = event.registerCreativeModeTab(new ResourceLocation("mcwfencesbyg", "tab_mfbyg"), builder -> builder
        .icon(() -> new ItemStack(MFBYGBlocksRegistry.aspen_picket_fence.get()))
        .title(Component.literal("Macaw's Fences - BYG")));
    }
    
    private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == McwFencesBYG.MF_BYG)
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
    		 event.accept(MFBYGBlocksRegistry.cherry_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cherry_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cherry_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cherry_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.cherry_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.cherry_pyramid_gate.get());
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
    		 event.accept(MFBYGBlocksRegistry.ether_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ether_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ether_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ether_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.ether_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.ether_pyramid_gate.get());
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
    		 event.accept(MFBYGBlocksRegistry.jacaranda_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.lament_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.lament_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.lament_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.lament_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.lament_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.lament_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.mahogany_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.white_mangrove_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.maple_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.maple_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.maple_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.nightshade_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.nightshade_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.nightshade_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.nightshade_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.nightshade_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.nightshade_pyramid_gate.get());
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
    		 event.accept(MFBYGBlocksRegistry.skyris_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.skyris_pyramid_gate.get());
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
    		 event.accept(MFBYGBlocksRegistry.bulbis_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.bulbis_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.bulbis_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.bulbis_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.bulbis_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.bulbis_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.imparius_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.imparius_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.imparius_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.imparius_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.imparius_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.imparius_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.sythian_picket_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sythian_stockade_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sythian_horse_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sythian_wired_fence.get());
    		 event.accept(MFBYGBlocksRegistry.sythian_highley_gate.get());
    		 event.accept(MFBYGBlocksRegistry.sythian_pyramid_gate.get());
    		 event.accept(MFBYGBlocksRegistry.aspen_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.baobab_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.blue_enchanted_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.cika_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.cypress_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.ebony_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.ether_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.fir_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.green_enchanted_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.holly_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.jacaranda_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.lament_hedge.get());
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
    		 event.accept(MFBYGBlocksRegistry.white_cherry_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.pink_cherry_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.araucaria_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.blooming_witch_hazel_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_indigo_jacaranda_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_jacaranda_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_orchard_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.flowering_palo_verde_hedge.get());
    		 event.accept(MFBYGBlocksRegistry.palo_verde_hedge.get());

    		 event.accept(MFBYGBlocksRegistry.modern_soapstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_soapstone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.soapstone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.soapstone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.soapstone_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_travertine_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_travertine_wall.get());
    		 event.accept(MFBYGBlocksRegistry.travertine_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.travertine_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.travertine_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_dacite_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_dacite_wall.get());
    		 event.accept(MFBYGBlocksRegistry.dacite_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.dacite_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.dacite_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_red_rock_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_red_rock_wall.get());
    		 event.accept(MFBYGBlocksRegistry.red_rock_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.red_rock_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.red_rock_grass_topped_wall.get());
    		 event.accept(MFBYGBlocksRegistry.modern_scoria_stone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.railing_scoria_stone_wall.get());
    		 event.accept(MFBYGBlocksRegistry.scoria_stone_railing_gate.get());
    		 event.accept(MFBYGBlocksRegistry.scoria_stone_pillar_wall.get());
    		 event.accept(MFBYGBlocksRegistry.scoria_stone_grass_topped_wall.get());
    	 }
    }
}