package fr.samlegamer.mcwfencesbyg;

import fr.samlegamer.mcwfencesbyg.block.MFBYGBlocksRegistry;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.level.FoliageColor;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.client.event.ColorHandlerEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;

@Mod.EventBusSubscriber(modid = McwFencesBYG.MODID, bus = Bus.MOD, value = Dist.CLIENT)
public class Client
{
	@SubscribeEvent
	public static void colorsBlock(ColorHandlerEvent.Block e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L83
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.getBlockColors().register((state, view, pos, tintIndex) -> view != null && pos != null ? BiomeColors.getAverageFoliageColor(view, pos) : FoliageColor.get(0.5D, 1.0D), 
        		MFBYGBlocksRegistry.mahogany_hedge.get(), 
        		MFBYGBlocksRegistry.maple_hedge.get());
    }
    
	@SubscribeEvent
	public static void colorsItem(ColorHandlerEvent.Item e)
    {
    	/*
    	 * Thanks Potion Studios
    	 * https://github.com/Potion-Studios/Oh-The-Biomes-Weve-Gone/blob/master/Forge/src/main/java/net/potionstudios/biomeswevegone/forge/client/BiomesWeveGoneClientForge.java#L95
    	 * only the parameters have been recovered to match the original leaves
    	 */
        e.getItemColors().register((stack, tintIndex) -> {
        	BlockState state = ((BlockItem) stack.getItem()).getBlock().defaultBlockState();
            return e.getBlockColors().getColor(state, null, null, tintIndex);
        }, MFBYGBlocksRegistry.mahogany_hedge.get(), MFBYGBlocksRegistry.maple_hedge.get());
    }
}