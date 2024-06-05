package fr.samlegamer.mcwfencesbop.block;

import fr.samlegamer.mcwfencesbop.McwFencesBOP;
import net.kikoz.mcwfences.objects.WiredFence;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.FenceBlock;
import net.minecraft.block.FenceGateBlock;
import net.minecraft.block.WoodType;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class MFBOPBlocksRegistry
{
    public static final Block dead_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block dead_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block dead_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block dead_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block dead_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block dead_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block fir_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block fir_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block fir_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block fir_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block fir_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block fir_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block hellbark_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block hellbark_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block hellbark_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block hellbark_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block hellbark_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block hellbark_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block jacaranda_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block jacaranda_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block jacaranda_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block jacaranda_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block jacaranda_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block jacaranda_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block magic_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block magic_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block magic_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block magic_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block magic_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block magic_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block mahogany_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block mahogany_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block mahogany_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block mahogany_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block mahogany_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block mahogany_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block palm_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block palm_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block palm_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block palm_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block palm_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block palm_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block redwood_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block redwood_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block redwood_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block redwood_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block redwood_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block redwood_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block umbran_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block umbran_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block umbran_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block umbran_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block umbran_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block umbran_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block willow_picket_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block willow_stockade_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block willow_horse_fence = new FenceBlock(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block willow_wired_fence = new WiredFence(AbstractBlock.Settings.create().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block willow_highley_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));
    public static final Block willow_pyramid_gate = new FenceGateBlock(WoodType.OAK, AbstractBlock.Settings.create().nonOpaque().strength(1.5F, 2.5F).sounds(BlockSoundGroup.WOOD));

    public static void registry()
	{
    	add("dead_picket_fence", dead_picket_fence);
    	add("dead_stockade_fence", dead_stockade_fence);
    	add("dead_horse_fence", dead_horse_fence);
    	add("dead_wired_fence", dead_wired_fence);
    	add("dead_highley_gate", dead_highley_gate);
    	add("dead_pyramid_gate", dead_pyramid_gate);
    	add("fir_picket_fence", fir_picket_fence);
    	add("fir_stockade_fence", fir_stockade_fence);
    	add("fir_horse_fence", fir_horse_fence);
    	add("fir_wired_fence", fir_wired_fence);
    	add("fir_highley_gate", fir_highley_gate);
    	add("fir_pyramid_gate", fir_pyramid_gate);
    	add("hellbark_picket_fence", hellbark_picket_fence);
    	add("hellbark_stockade_fence", hellbark_stockade_fence);
    	add("hellbark_horse_fence", hellbark_horse_fence);
    	add("hellbark_wired_fence", hellbark_wired_fence);
    	add("hellbark_highley_gate", hellbark_highley_gate);
    	add("hellbark_pyramid_gate", hellbark_pyramid_gate);
    	add("jacaranda_picket_fence", jacaranda_picket_fence);
    	add("jacaranda_stockade_fence", jacaranda_stockade_fence);
    	add("jacaranda_horse_fence", jacaranda_horse_fence);
    	add("jacaranda_wired_fence", jacaranda_wired_fence);
    	add("jacaranda_highley_gate", jacaranda_highley_gate);
    	add("jacaranda_pyramid_gate", jacaranda_pyramid_gate);
    	add("magic_picket_fence", magic_picket_fence);
    	add("magic_stockade_fence", magic_stockade_fence);
    	add("magic_horse_fence", magic_horse_fence);
    	add("magic_wired_fence", magic_wired_fence);
    	add("magic_highley_gate", magic_highley_gate);
    	add("magic_pyramid_gate", magic_pyramid_gate);
    	add("mahogany_picket_fence", mahogany_picket_fence);
    	add("mahogany_stockade_fence", mahogany_stockade_fence);
    	add("mahogany_horse_fence", mahogany_horse_fence);
    	add("mahogany_wired_fence", mahogany_wired_fence);
    	add("mahogany_highley_gate", mahogany_highley_gate);
    	add("mahogany_pyramid_gate", mahogany_pyramid_gate);
    	add("palm_picket_fence", palm_picket_fence);
    	add("palm_stockade_fence", palm_stockade_fence);
    	add("palm_horse_fence", palm_horse_fence);
    	add("palm_wired_fence", palm_wired_fence);
    	add("palm_highley_gate", palm_highley_gate);
    	add("palm_pyramid_gate", palm_pyramid_gate);
    	add("redwood_picket_fence", redwood_picket_fence);
    	add("redwood_stockade_fence", redwood_stockade_fence);
    	add("redwood_horse_fence", redwood_horse_fence);
    	add("redwood_wired_fence", redwood_wired_fence);
    	add("redwood_highley_gate", redwood_highley_gate);
    	add("redwood_pyramid_gate", redwood_pyramid_gate);
    	add("umbran_picket_fence", umbran_picket_fence);
    	add("umbran_stockade_fence", umbran_stockade_fence);
    	add("umbran_horse_fence", umbran_horse_fence);
    	add("umbran_wired_fence", umbran_wired_fence);
    	add("umbran_highley_gate", umbran_highley_gate);
    	add("umbran_pyramid_gate", umbran_pyramid_gate);
    	add("willow_picket_fence", willow_picket_fence);
    	add("willow_stockade_fence", willow_stockade_fence);
    	add("willow_horse_fence", willow_horse_fence);
    	add("willow_wired_fence", willow_wired_fence);
    	add("willow_highley_gate", willow_highley_gate);
    	add("willow_pyramid_gate", willow_pyramid_gate);
	}
    
    private static void add(String name, Block b)
    {
    	Registry.register(Registries.BLOCK, new Identifier(McwFencesBOP.MODID, name), b);
    	blockItem(b, name);
	}
    
    private static void blockItem(Block b, String n)
    {
        Registry.register(Registries.ITEM, new Identifier(McwFencesBOP.MODID, n), new BlockItem(b, new Item.Settings()));
    }
}