package fr.samlegamer.mcwfencesbop;

import fr.samlegamer.mcwfencesbop.block.MFBOPBlocksRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraft.world.level.block.Block;
import net.neoforged.api.distmarker.Dist;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.Mod.EventBusSubscriber;
import net.neoforged.fml.common.Mod.EventBusSubscriber.Bus;
import net.neoforged.neoforge.client.event.RegisterColorHandlersEvent;

@EventBusSubscriber(modid = McwFencesBOP.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	@SubscribeEvent
	public static void colorsBlock(RegisterColorHandlersEvent.Block e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L83
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColor.get(0.5D, 1.0D), 
        		MFBOPBlocksRegistry.mahogany_hedge.get(), 
        		MFBOPBlocksRegistry.willow_hedge.get(), 
        		MFBOPBlocksRegistry.palm_hedge.get(), 
        		MFBOPBlocksRegistry.pine_hedge.get(), 
        		MFBOPBlocksRegistry.flowering_oak_hedge.get());
    }
    
	@SubscribeEvent
	public static void colorsItem(RegisterColorHandlersEvent.Item e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L95
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.register((stack, tintIndex) -> {
            Block block = ((BlockItem) stack.getItem()).getBlock();
            return e.getBlockColors().getColor(block.defaultBlockState(), null, null, tintIndex);
        }, MFBOPBlocksRegistry.mahogany_hedge.get(), 
        		MFBOPBlocksRegistry.willow_hedge.get(), 
        		MFBOPBlocksRegistry.palm_hedge.get(), 
        		MFBOPBlocksRegistry.pine_hedge.get(), 
        		MFBOPBlocksRegistry.flowering_oak_hedge.get());
    }
}