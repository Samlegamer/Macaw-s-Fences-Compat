package fr.samlegamer.mcwfencesbyg;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.event.CreativeModeTabEvent;
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
    private static final Logger LOGGER = LogManager.getLogger();
    private static CreativeModeTab MF_BYG;
    
    public McwFencesBYG()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreateTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
        LOGGER.info("Macaw's Fences - Oh The Biomes You'll Go : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBYGBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBYGBlocksRegistry.BLOCKS_REGISTRY.register(bus);
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
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.baobab_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.baobab_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.baobab_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.baobab_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.baobab_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.baobab_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.blue_enchanted_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cherry_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cherry_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cherry_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cherry_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cherry_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cherry_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cika_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cika_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cika_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cika_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cika_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cika_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cypress_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cypress_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cypress_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cypress_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cypress_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.cypress_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ebony_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ebony_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ebony_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ebony_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ebony_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ebony_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ether_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ether_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ether_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ether_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ether_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.ether_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.fir_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.fir_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.fir_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.fir_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.fir_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.fir_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.green_enchanted_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.holly_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.holly_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.holly_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.holly_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.holly_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.holly_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.jacaranda_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.jacaranda_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.jacaranda_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.jacaranda_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.jacaranda_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.jacaranda_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.lament_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.lament_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.lament_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.lament_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.lament_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.lament_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mahogany_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mahogany_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mahogany_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mahogany_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mahogany_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.mahogany_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.white_mangrove_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.white_mangrove_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.white_mangrove_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.white_mangrove_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.white_mangrove_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.white_mangrove_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.maple_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.maple_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.maple_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.maple_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.maple_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.maple_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.nightshade_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.nightshade_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.nightshade_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.nightshade_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.nightshade_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.nightshade_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.palm_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.palm_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.palm_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.palm_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.palm_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.palm_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pine_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pine_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pine_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pine_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pine_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.pine_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.rainbow_eucalyptus_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.redwood_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.redwood_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.redwood_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.redwood_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.redwood_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.redwood_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.skyris_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.skyris_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.skyris_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.skyris_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.skyris_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.skyris_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.willow_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.willow_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.willow_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.willow_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.willow_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.willow_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.witch_hazel_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.zelkova_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.zelkova_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.zelkova_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.zelkova_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.zelkova_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.zelkova_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.bulbis_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.bulbis_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.bulbis_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.bulbis_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.bulbis_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.bulbis_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.imparius_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.imparius_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.imparius_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.imparius_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.imparius_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.imparius_pyramid_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.sythian_picket_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.sythian_stockade_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.sythian_horse_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.sythian_wired_fence.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.sythian_highley_gate.get(), RenderType.cutout());
    	ItemBlockRenderTypes.setRenderLayer(MFBYGBlocksRegistry.sythian_pyramid_gate.get(), RenderType.cutout());

	}
    
    private void CreateTab(CreativeModeTabEvent.Register event)
    {
    	MF_BYG = event.registerCreativeModeTab(new ResourceLocation("mcwfencesbyg", "tab_mfbyg"), builder -> builder
        .icon(() -> new ItemStack(MFBYGBlocksRegistry.aspen_picket_fence.get()))
        .title(Component.literal("Macaw's Fences - BYG")));
    }
    
    private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == MF_BYG)
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
    		 //Finish
    	 }
    }
}