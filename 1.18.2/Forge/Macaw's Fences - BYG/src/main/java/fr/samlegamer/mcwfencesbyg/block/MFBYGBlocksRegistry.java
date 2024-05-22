package fr.samlegamer.mcwfencesbyg.block;

import java.util.ArrayList;
import java.util.List;
import com.google.common.base.Supplier;
import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.WiredFence;
import fr.samlegamer.mcwfencesbyg.McwFencesBYG;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MFBYGBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwFencesBYG.MODID);    
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwFencesBYG.MODID);
	
	public static final RegistryObject<Block> aspen_picket_fence = createBlock("aspen_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_stockade_fence = createBlock("aspen_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_horse_fence = createBlock("aspen_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_wired_fence = createBlock("aspen_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_highley_gate = createBlock("aspen_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> aspen_pyramid_gate = createBlock("aspen_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(1.5F, 2.5F).sound(SoundType.WOOD)));

	public static final RegistryObject<Block> baobab_wired_fence = createBlock("baobab_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> blue_enchanted_wired_fence = createBlock("blue_enchanted_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cherry_wired_fence = createBlock("cherry_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cika_wired_fence = createBlock("cika_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> cypress_wired_fence = createBlock("cypress_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ebony_wired_fence = createBlock("ebony_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> ether_wired_fence = createBlock("ether_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> fir_wired_fence = createBlock("fir_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> green_enchanted_wired_fence = createBlock("green_enchanted_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> holly_wired_fence = createBlock("holly_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> jacaranda_wired_fence = createBlock("jacaranda_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> lament_wired_fence = createBlock("lament_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mahogany_wired_fence = createBlock("mahogany_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> mangrove_wired_fence = createBlock("mangrove_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> maple_wired_fence = createBlock("maple_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> nightshade_wired_fence = createBlock("nightshade_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> palm_wired_fence = createBlock("palm_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> pine_wired_fence = createBlock("pine_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> rainbow_eucalyptus_wired_fence = createBlock("rainbow_eucalyptus_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> redwood_wired_fence = createBlock("redwood_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> skyris_wired_fence = createBlock("skyris_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> willow_wired_fence = createBlock("willow_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> witch_hazel_wired_fence = createBlock("witch_hazel_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> zelkova_wired_fence = createBlock("zelkova_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> bulbis_wired_fence = createBlock("bulbis_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> imparius_wired_fence = createBlock("imparius_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
	public static final RegistryObject<Block> sythian_wired_fence = createBlock("sythian_wired_fence", () -> new WiredFence(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));

	
    public static RegistryObject<Block> picket_fenceAll, stockade_fenceAll, horse_fenceAll, highley_gateAll, pyramid_gateAll;

    public static List<String> MATERIAL = new ArrayList<>();

    
    public static void registry()
    {
    	MATERIAL.add("baobab");
		MATERIAL.add("blue_enchanted");
		MATERIAL.add("cherry");
		MATERIAL.add("cika");
		MATERIAL.add("cypress");
		MATERIAL.add("ebony");
		MATERIAL.add("ether");
		MATERIAL.add("fir");
		MATERIAL.add("green_enchanted");
		MATERIAL.add("holly");
		MATERIAL.add("jacaranda");
		MATERIAL.add("lament");
		MATERIAL.add("mahogany");
		MATERIAL.add("mangrove");
		MATERIAL.add("maple");
		MATERIAL.add("nightshade");
		MATERIAL.add("palm");
		MATERIAL.add("pine");
		MATERIAL.add("rainbow_eucalyptus");
		MATERIAL.add("redwood");
		MATERIAL.add("skyris");
		MATERIAL.add("willow");
		MATERIAL.add("witch_hazel");
		MATERIAL.add("zelkova");
		MATERIAL.add("bulbis");
		MATERIAL.add("imparius");
		MATERIAL.add("sythian");
		
		/*

		 */
		
		for(String i : MATERIAL)
		{
			picket_fenceAll = createBlock(""+i+"_picket_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			stockade_fenceAll = createBlock(""+i+"_stockade_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			horse_fenceAll = createBlock(""+i+"_horse_fence", () -> new FenceBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			highley_gateAll = createBlock(""+i+"_highley_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).noOcclusion().strength(1.5F, 2.5F).sound(SoundType.WOOD)));
			pyramid_gateAll = createBlock(""+i+"_pyramid_gate", () -> new FenceGateBlock(BlockBehaviour.Properties.of(Material.WOOD).strength(2.0F, 3.0F).sound(SoundType.WOOD)));
		}
    }
    
    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(McwFencesBYG.TAB_GROUP)));
        return block;
    }
}