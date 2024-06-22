package fr.samlegamer.mcwfencesbop;

import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;

@Mod(McwFencesBOP.MODID)
@Mod.EventBusSubscriber(modid = McwFencesBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwFencesBOP
{
	public static final String MODID = "mcwfencesbop";
    private static final Logger LOGGER = LogManager.getLogger();

    public McwFencesBOP()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::client);
        LOGGER.info("Macaw's Fences - Biome O' Plenty : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
		MFBOPBlocksRegistry.Item_Group.register(bus);
		MFBOPBlocksRegistry.registry();
        LOGGER.info("Macaw's Fences - Biome O' Plenty : Is Charged");
    }
	
    private void client(FMLClientSetupEvent event)
	{    	
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
    	 }
    }
}