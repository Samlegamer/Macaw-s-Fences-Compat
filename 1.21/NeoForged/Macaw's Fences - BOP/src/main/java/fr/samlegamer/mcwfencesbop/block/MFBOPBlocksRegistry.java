package fr.samlegamer.mcwfencesbop.block;

import com.google.common.base.Supplier;
import fr.samlegamer.mcwfencesbop.McwFencesBOP;

import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.WiredFence;
import net.minecraft.core.registries.Registries;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.WoodType;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.minecraft.network.chat.Component;

public class MFBOPBlocksRegistry
{
	public static final DeferredRegister.Blocks BLOCKS_REGISTRY = DeferredRegister.createBlocks(McwFencesBOP.MODID);    
	public static final DeferredRegister.Items ITEMS_REGISTRY = DeferredRegister.createItems(McwFencesBOP.MODID);
    public static final DeferredRegister<CreativeModeTab> Item_Group = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, McwFencesBOP.MODID);
    
    public static DeferredHolder<CreativeModeTab, CreativeModeTab> MF_CT = Item_Group.register("tab_mfbop", () -> CreativeModeTab.builder().title((Component)Component.literal("Macaw's Fences - BOP")).icon(()-> new ItemStack(MFBOPBlocksRegistry.palm_picket_fence.get())).build());
    
    public static final DeferredBlock<Block> dead_picket_fence = createBlock("dead_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_stockade_fence = createBlock("dead_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_horse_fence = createBlock("dead_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_wired_fence = createBlock("dead_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> dead_highley_gate = createBlock("dead_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> dead_pyramid_gate = createBlock("dead_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_picket_fence = createBlock("fir_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_stockade_fence = createBlock("fir_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_horse_fence = createBlock("fir_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_wired_fence = createBlock("fir_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> fir_highley_gate = createBlock("fir_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> fir_pyramid_gate = createBlock("fir_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_picket_fence = createBlock("hellbark_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_stockade_fence = createBlock("hellbark_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_horse_fence = createBlock("hellbark_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_wired_fence = createBlock("hellbark_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> hellbark_highley_gate = createBlock("hellbark_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> hellbark_pyramid_gate = createBlock("hellbark_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_picket_fence = createBlock("jacaranda_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_stockade_fence = createBlock("jacaranda_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_horse_fence = createBlock("jacaranda_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_wired_fence = createBlock("jacaranda_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> jacaranda_highley_gate = createBlock("jacaranda_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> jacaranda_pyramid_gate = createBlock("jacaranda_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_picket_fence = createBlock("magic_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_stockade_fence = createBlock("magic_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_horse_fence = createBlock("magic_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_wired_fence = createBlock("magic_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> magic_highley_gate = createBlock("magic_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> magic_pyramid_gate = createBlock("magic_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_picket_fence = createBlock("mahogany_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_stockade_fence = createBlock("mahogany_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_horse_fence = createBlock("mahogany_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_wired_fence = createBlock("mahogany_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> mahogany_highley_gate = createBlock("mahogany_highley_gate", () -> new FenceGateBlock(WoodType.OAK, BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> mahogany_pyramid_gate = createBlock("mahogany_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_picket_fence = createBlock("palm_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_stockade_fence = createBlock("palm_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_horse_fence = createBlock("palm_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_wired_fence = createBlock("palm_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> palm_highley_gate = createBlock("palm_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> palm_pyramid_gate = createBlock("palm_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_picket_fence = createBlock("redwood_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_stockade_fence = createBlock("redwood_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_horse_fence = createBlock("redwood_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_wired_fence = createBlock("redwood_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> redwood_highley_gate = createBlock("redwood_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> redwood_pyramid_gate = createBlock("redwood_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_picket_fence = createBlock("umbran_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_stockade_fence = createBlock("umbran_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_horse_fence = createBlock("umbran_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_wired_fence = createBlock("umbran_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> umbran_highley_gate = createBlock("umbran_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> umbran_pyramid_gate = createBlock("umbran_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_picket_fence = createBlock("willow_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_stockade_fence = createBlock("willow_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_horse_fence = createBlock("willow_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_wired_fence = createBlock("willow_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> willow_highley_gate = createBlock("willow_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> willow_pyramid_gate = createBlock("willow_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_picket_fence = createBlock("empyreal_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_stockade_fence = createBlock("empyreal_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_horse_fence = createBlock("empyreal_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of().strength(1.8F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_wired_fence = createBlock("empyreal_wired_fence", () -> new WiredFence(null));
    public static final DeferredBlock<Block> empyreal_highley_gate = createBlock("empyreal_highley_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
    public static final DeferredBlock<Block> empyreal_pyramid_gate = createBlock("empyreal_pyramid_gate", () -> new FenceGateBlock(WoodType.OAK,BlockBehaviour.Properties.of().strength(2.0F, 3.0F).sound(SoundType.WOOD)));
	
    public static DeferredBlock<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        DeferredBlock<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties()));
        return block;
    }
}