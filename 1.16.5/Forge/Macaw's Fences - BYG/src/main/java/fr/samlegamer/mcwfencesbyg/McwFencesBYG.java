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
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
    	bus.addListener(this::client);
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Is Charged");
    }
	
    private void client(FMLClientSetupEvent event)
	{
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.modern_soapstone_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.railing_soapstone_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.soapstone_railing_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.soapstone_pillar_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.soapstone_grass_topped_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.modern_travertine_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.railing_travertine_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.travertine_railing_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.travertine_pillar_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.travertine_grass_topped_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.modern_dacite_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.railing_dacite_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.dacite_railing_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.dacite_pillar_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.dacite_grass_topped_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.modern_red_rock_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.railing_red_rock_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.red_rock_railing_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.red_rock_pillar_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.red_rock_grass_topped_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.modern_scoria_stone_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.railing_scoria_stone_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.scoria_stone_railing_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.scoria_stone_pillar_wall.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.scoria_stone_grass_topped_wall.get(), RenderType.cutout());

    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.baobab_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.baobab_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.baobab_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.baobab_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.baobab_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.baobab_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cherry_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cherry_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cherry_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cherry_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cherry_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cherry_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cika_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cika_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cika_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cika_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cika_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cika_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cypress_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cypress_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cypress_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cypress_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cypress_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cypress_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ebony_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ebony_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ebony_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ebony_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ebony_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ebony_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ether_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ether_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ether_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ether_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ether_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ether_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.fir_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.fir_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.fir_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.fir_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.fir_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.fir_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.holly_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.holly_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.holly_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.holly_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.holly_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.holly_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.jacaranda_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.jacaranda_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.jacaranda_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.jacaranda_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.jacaranda_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.jacaranda_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.lament_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.lament_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.lament_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.lament_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.lament_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.lament_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mahogany_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mahogany_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mahogany_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mahogany_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mahogany_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mahogany_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mangrove_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mangrove_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mangrove_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mangrove_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mangrove_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mangrove_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.maple_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.maple_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.maple_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.maple_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.maple_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.maple_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.nightshade_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.nightshade_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.nightshade_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.nightshade_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.nightshade_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.nightshade_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palm_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palm_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palm_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palm_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palm_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palm_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pine_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pine_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pine_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pine_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pine_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pine_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.redwood_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.redwood_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.redwood_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.redwood_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.redwood_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.redwood_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.skyris_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.skyris_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.skyris_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.skyris_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.skyris_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.skyris_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.willow_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.willow_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.willow_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.willow_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.willow_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.willow_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.zelkova_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.zelkova_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.zelkova_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.zelkova_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.zelkova_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.zelkova_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.bulbis_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.bulbis_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.bulbis_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.bulbis_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.bulbis_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.bulbis_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.imparius_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.imparius_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.imparius_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.imparius_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.imparius_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.imparius_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.sythian_picket_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.sythian_stockade_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.sythian_horse_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.sythian_wired_fence.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.sythian_highley_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.sythian_pyramid_gate.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.aspen_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.baobab_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cika_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.cypress_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ebony_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.ether_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.fir_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.holly_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.jacaranda_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.lament_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mahogany_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.maple_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palm_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pine_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.redwood_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.skyris_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.mangrove_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.willow_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.zelkova_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blue_spruce_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.orange_spruce_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.red_spruce_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.yellow_spruce_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.brown_birch_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.orange_birch_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.red_birch_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.yellow_birch_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.brown_oak_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.orange_oak_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.red_oak_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.white_cherry_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.pink_cherry_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.araucaria_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.blooming_witch_hazel_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.flowering_indigo_jacaranda_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.flowering_jacaranda_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.flowering_orchard_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.flowering_palo_verde_hedge.get(), RenderType.cutout());
    	RenderTypeLookup.setRenderLayer(MFBYGBlocksRegistry.palo_verde_hedge.get(), RenderType.cutout());
	}
	
	private static class TabsMFBOP extends ItemGroup
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