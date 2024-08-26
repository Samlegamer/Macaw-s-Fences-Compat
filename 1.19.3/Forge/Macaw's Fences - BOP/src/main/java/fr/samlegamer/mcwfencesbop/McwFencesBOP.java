package fr.samlegamer.mcwfencesbop;

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
import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;

@Mod(McwFencesBOP.MODID)
@Mod.EventBusSubscriber(modid = McwFencesBOP.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class McwFencesBOP
{
	public static final String MODID = "mcwfencesbop";
    private static final Logger LOGGER = LogManager.getLogger();
    private static CreativeModeTab MF_BOP;
    
    public McwFencesBOP()
    {
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::CreateTab);
        FMLJavaModLoadingContext.get().getModEventBus().addListener(this::AddTab);
        LOGGER.info("Macaw's Fences - Biomes O' Plenty : Loading ...");
		IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
		MFBOPBlocksRegistry.ITEMS_REGISTRY.register(bus);
		MFBOPBlocksRegistry.BLOCKS_REGISTRY.register(bus);
        LOGGER.info("Macaw's Fences - Biomes O' Plenty : Is Charged");
    }
		
    private void CreateTab(CreativeModeTabEvent.Register event)
    {
        MF_BOP = event.registerCreativeModeTab(new ResourceLocation("mcwfencesbop", "tab_mfbop"), builder -> builder
        .icon(() -> new ItemStack(MFBOPBlocksRegistry.cherry_picket_fence.get()))
        .title(Component.literal("Macaw's Fences - BOP")));
    }
    
    private void AddTab(CreativeModeTabEvent.BuildContents event)
    {
    	 if (event.getTab() == MF_BOP)
    	 {
    		 event.accept(MFBOPBlocksRegistry.cherry_picket_fence.get());
    		 event.accept(MFBOPBlocksRegistry.cherry_stockade_fence.get());
    		 event.accept(MFBOPBlocksRegistry.cherry_horse_fence.get());
    		 event.accept(MFBOPBlocksRegistry.cherry_wired_fence.get());
    		 event.accept(MFBOPBlocksRegistry.cherry_highley_gate.get());
    		 event.accept(MFBOPBlocksRegistry.cherry_pyramid_gate.get());
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
    		 event.accept(MFBOPBlocksRegistry.pink_cherry_hedge.get());
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
    		 event.accept(MFBOPBlocksRegistry.maple_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.orange_autumn_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.yellow_autumn_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.white_cherry_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.flowering_oak_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.rainbow_birch_hedge.get());
    		 event.accept(MFBOPBlocksRegistry.origin_hedge.get());
    	 }
    }
}