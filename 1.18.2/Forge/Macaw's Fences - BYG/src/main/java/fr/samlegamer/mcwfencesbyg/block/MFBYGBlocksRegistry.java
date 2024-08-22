package fr.samlegamer.mcwfencesbyg.block;

import com.google.common.base.Supplier;
import com.mcwfences.kikoz.objects.FenceHitbox;
import com.mcwfences.kikoz.objects.FuelItemBlock;
import com.mcwfences.kikoz.objects.WiredFence;
import fr.samlegamer.mcwfencesbyg.McwFencesBYG;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.FenceBlock;
import net.minecraft.world.level.block.FenceGateBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MFBYGBlocksRegistry
{
	public static final DeferredRegister<Block> BLOCKS_REGISTRY = DeferredRegister.create(ForgeRegistries.BLOCKS, McwFencesBYG.MODID);    
	public static final DeferredRegister<Item> ITEMS_REGISTRY = DeferredRegister.create(ForgeRegistries.ITEMS, McwFencesBYG.MODID);
	
	private static final BlockBehaviour.Properties WOOD = BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS);
	private static final BlockBehaviour.Properties HEDGES = BlockBehaviour.Properties.copy(Blocks.OAK_LEAVES);
	private static final BlockBehaviour.Properties STONE = BlockBehaviour.Properties.copy(Blocks.CUT_SANDSTONE);

	public static final RegistryObject<Block> aspen_picket_fence = createBlock("aspen_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> aspen_stockade_fence = createBlock("aspen_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> aspen_horse_fence = createBlock("aspen_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> aspen_wired_fence = createBlock("aspen_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> aspen_highley_gate = createBlock("aspen_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> aspen_pyramid_gate = createBlock("aspen_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> baobab_picket_fence = createBlock("baobab_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> baobab_stockade_fence = createBlock("baobab_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> baobab_horse_fence = createBlock("baobab_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> baobab_wired_fence = createBlock("baobab_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> baobab_highley_gate = createBlock("baobab_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> baobab_pyramid_gate = createBlock("baobab_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> blue_enchanted_picket_fence = createBlock("blue_enchanted_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> blue_enchanted_stockade_fence = createBlock("blue_enchanted_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> blue_enchanted_horse_fence = createBlock("blue_enchanted_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> blue_enchanted_wired_fence = createBlock("blue_enchanted_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> blue_enchanted_highley_gate = createBlock("blue_enchanted_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> blue_enchanted_pyramid_gate = createBlock("blue_enchanted_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> cherry_picket_fence = createBlock("cherry_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cherry_stockade_fence = createBlock("cherry_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cherry_horse_fence = createBlock("cherry_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cherry_wired_fence = createBlock("cherry_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> cherry_highley_gate = createBlock("cherry_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> cherry_pyramid_gate = createBlock("cherry_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> cika_picket_fence = createBlock("cika_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cika_stockade_fence = createBlock("cika_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cika_horse_fence = createBlock("cika_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cika_wired_fence = createBlock("cika_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> cika_highley_gate = createBlock("cika_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> cika_pyramid_gate = createBlock("cika_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> cypress_picket_fence = createBlock("cypress_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cypress_stockade_fence = createBlock("cypress_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cypress_horse_fence = createBlock("cypress_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> cypress_wired_fence = createBlock("cypress_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> cypress_highley_gate = createBlock("cypress_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> cypress_pyramid_gate = createBlock("cypress_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> ebony_picket_fence = createBlock("ebony_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> ebony_stockade_fence = createBlock("ebony_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> ebony_horse_fence = createBlock("ebony_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> ebony_wired_fence = createBlock("ebony_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> ebony_highley_gate = createBlock("ebony_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> ebony_pyramid_gate = createBlock("ebony_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> ether_picket_fence = createBlock("ether_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> ether_stockade_fence = createBlock("ether_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> ether_horse_fence = createBlock("ether_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> ether_wired_fence = createBlock("ether_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> ether_highley_gate = createBlock("ether_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> ether_pyramid_gate = createBlock("ether_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> fir_picket_fence = createBlock("fir_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> fir_stockade_fence = createBlock("fir_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> fir_horse_fence = createBlock("fir_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> fir_wired_fence = createBlock("fir_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> fir_highley_gate = createBlock("fir_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> fir_pyramid_gate = createBlock("fir_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> green_enchanted_picket_fence = createBlock("green_enchanted_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> green_enchanted_stockade_fence = createBlock("green_enchanted_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> green_enchanted_horse_fence = createBlock("green_enchanted_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> green_enchanted_wired_fence = createBlock("green_enchanted_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> green_enchanted_highley_gate = createBlock("green_enchanted_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> green_enchanted_pyramid_gate = createBlock("green_enchanted_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> holly_picket_fence = createBlock("holly_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> holly_stockade_fence = createBlock("holly_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> holly_horse_fence = createBlock("holly_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> holly_wired_fence = createBlock("holly_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> holly_highley_gate = createBlock("holly_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> holly_pyramid_gate = createBlock("holly_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> jacaranda_picket_fence = createBlock("jacaranda_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> jacaranda_stockade_fence = createBlock("jacaranda_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> jacaranda_horse_fence = createBlock("jacaranda_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> jacaranda_wired_fence = createBlock("jacaranda_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> jacaranda_highley_gate = createBlock("jacaranda_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> jacaranda_pyramid_gate = createBlock("jacaranda_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> lament_picket_fence = createBlock("lament_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> lament_stockade_fence = createBlock("lament_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> lament_horse_fence = createBlock("lament_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> lament_wired_fence = createBlock("lament_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> lament_highley_gate = createBlock("lament_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> lament_pyramid_gate = createBlock("lament_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> mahogany_picket_fence = createBlock("mahogany_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> mahogany_stockade_fence = createBlock("mahogany_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> mahogany_horse_fence = createBlock("mahogany_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> mahogany_wired_fence = createBlock("mahogany_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> mahogany_highley_gate = createBlock("mahogany_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> mahogany_pyramid_gate = createBlock("mahogany_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> mangrove_picket_fence = createBlock("mangrove_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> mangrove_stockade_fence = createBlock("mangrove_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> mangrove_horse_fence = createBlock("mangrove_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> mangrove_wired_fence = createBlock("mangrove_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> mangrove_highley_gate = createBlock("mangrove_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> mangrove_pyramid_gate = createBlock("mangrove_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> maple_picket_fence = createBlock("maple_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> maple_stockade_fence = createBlock("maple_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> maple_horse_fence = createBlock("maple_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> maple_wired_fence = createBlock("maple_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> maple_highley_gate = createBlock("maple_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> maple_pyramid_gate = createBlock("maple_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> nightshade_picket_fence = createBlock("nightshade_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> nightshade_stockade_fence = createBlock("nightshade_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> nightshade_horse_fence = createBlock("nightshade_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> nightshade_wired_fence = createBlock("nightshade_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> nightshade_highley_gate = createBlock("nightshade_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> nightshade_pyramid_gate = createBlock("nightshade_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> palm_picket_fence = createBlock("palm_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> palm_stockade_fence = createBlock("palm_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> palm_horse_fence = createBlock("palm_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> palm_wired_fence = createBlock("palm_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> palm_highley_gate = createBlock("palm_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> palm_pyramid_gate = createBlock("palm_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> pine_picket_fence = createBlock("pine_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> pine_stockade_fence = createBlock("pine_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> pine_horse_fence = createBlock("pine_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> pine_wired_fence = createBlock("pine_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> pine_highley_gate = createBlock("pine_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> pine_pyramid_gate = createBlock("pine_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> rainbow_eucalyptus_picket_fence = createBlock("rainbow_eucalyptus_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> rainbow_eucalyptus_stockade_fence = createBlock("rainbow_eucalyptus_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> rainbow_eucalyptus_horse_fence = createBlock("rainbow_eucalyptus_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> rainbow_eucalyptus_wired_fence = createBlock("rainbow_eucalyptus_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> rainbow_eucalyptus_highley_gate = createBlock("rainbow_eucalyptus_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> rainbow_eucalyptus_pyramid_gate = createBlock("rainbow_eucalyptus_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> redwood_picket_fence = createBlock("redwood_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> redwood_stockade_fence = createBlock("redwood_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> redwood_horse_fence = createBlock("redwood_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> redwood_wired_fence = createBlock("redwood_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> redwood_highley_gate = createBlock("redwood_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> redwood_pyramid_gate = createBlock("redwood_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> skyris_picket_fence = createBlock("skyris_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> skyris_stockade_fence = createBlock("skyris_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> skyris_horse_fence = createBlock("skyris_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> skyris_wired_fence = createBlock("skyris_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> skyris_highley_gate = createBlock("skyris_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> skyris_pyramid_gate = createBlock("skyris_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> willow_picket_fence = createBlock("willow_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> willow_stockade_fence = createBlock("willow_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> willow_horse_fence = createBlock("willow_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> willow_wired_fence = createBlock("willow_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> willow_highley_gate = createBlock("willow_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> willow_pyramid_gate = createBlock("willow_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> witch_hazel_picket_fence = createBlock("witch_hazel_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> witch_hazel_stockade_fence = createBlock("witch_hazel_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> witch_hazel_horse_fence = createBlock("witch_hazel_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> witch_hazel_wired_fence = createBlock("witch_hazel_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> witch_hazel_highley_gate = createBlock("witch_hazel_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> witch_hazel_pyramid_gate = createBlock("witch_hazel_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> zelkova_picket_fence = createBlock("zelkova_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> zelkova_stockade_fence = createBlock("zelkova_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> zelkova_horse_fence = createBlock("zelkova_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> zelkova_wired_fence = createBlock("zelkova_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> zelkova_highley_gate = createBlock("zelkova_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> zelkova_pyramid_gate = createBlock("zelkova_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> bulbis_picket_fence = createBlock("bulbis_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> bulbis_stockade_fence = createBlock("bulbis_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> bulbis_horse_fence = createBlock("bulbis_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> bulbis_wired_fence = createBlock("bulbis_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> bulbis_highley_gate = createBlock("bulbis_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> bulbis_pyramid_gate = createBlock("bulbis_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> imparius_picket_fence = createBlock("imparius_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> imparius_stockade_fence = createBlock("imparius_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> imparius_horse_fence = createBlock("imparius_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> imparius_wired_fence = createBlock("imparius_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> imparius_highley_gate = createBlock("imparius_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> imparius_pyramid_gate = createBlock("imparius_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> sythian_picket_fence = createBlock("sythian_picket_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> sythian_stockade_fence = createBlock("sythian_stockade_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> sythian_horse_fence = createBlock("sythian_horse_fence", () -> new FenceBlock(WOOD));
	public static final RegistryObject<Block> sythian_wired_fence = createBlock("sythian_wired_fence", () -> new WiredFence(WOOD));
	public static final RegistryObject<Block> sythian_highley_gate = createBlock("sythian_highley_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> sythian_pyramid_gate = createBlock("sythian_pyramid_gate", () -> new FenceGateBlock(WOOD));
	public static final RegistryObject<Block> aspen_hedge = createBlock("aspen_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> baobab_hedge = createBlock("baobab_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> blue_enchanted_hedge = createBlock("blue_enchanted_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> cika_hedge = createBlock("cika_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> cypress_hedge = createBlock("cypress_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> ebony_hedge = createBlock("ebony_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> ether_hedge = createBlock("ether_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> fir_hedge = createBlock("fir_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> green_enchanted_hedge = createBlock("green_enchanted_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> holly_hedge = createBlock("holly_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> jacaranda_hedge = createBlock("jacaranda_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> lament_hedge = createBlock("lament_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> mahogany_hedge = createBlock("mahogany_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> maple_hedge = createBlock("maple_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> palm_hedge = createBlock("palm_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> pine_hedge = createBlock("pine_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> rainbow_eucalyptus_hedge = createBlock("rainbow_eucalyptus_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> redwood_hedge = createBlock("redwood_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> skyris_hedge = createBlock("skyris_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> mangrove_hedge = createBlock("mangrove_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> willow_hedge = createBlock("willow_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> witch_hazel_hedge = createBlock("witch_hazel_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> zelkova_hedge = createBlock("zelkova_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> blue_spruce_hedge = createBlock("blue_spruce_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> orange_spruce_hedge = createBlock("orange_spruce_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> red_spruce_hedge = createBlock("red_spruce_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> yellow_spruce_hedge = createBlock("yellow_spruce_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> brown_birch_hedge = createBlock("brown_birch_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> orange_birch_hedge = createBlock("orange_birch_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> red_birch_hedge = createBlock("red_birch_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> yellow_birch_hedge = createBlock("yellow_birch_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> brown_oak_hedge = createBlock("brown_oak_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> orange_oak_hedge = createBlock("orange_oak_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> red_oak_hedge = createBlock("red_oak_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> white_cherry_hedge = createBlock("white_cherry_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> pink_cherry_hedge = createBlock("pink_cherry_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> araucaria_hedge = createBlock("araucaria_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> blooming_witch_hazel_hedge = createBlock("blooming_witch_hazel_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> flowering_indigo_jacaranda_hedge = createBlock("flowering_indigo_jacaranda_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> flowering_jacaranda_hedge = createBlock("flowering_jacaranda_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> flowering_orchard_hedge = createBlock("flowering_orchard_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> flowering_palo_verde_hedge = createBlock("flowering_palo_verde_hedge", () -> new FenceHitbox(HEDGES));
	public static final RegistryObject<Block> palo_verde_hedge = createBlock("palo_verde_hedge", () -> new FenceHitbox(HEDGES));

	public static final RegistryObject<Block> modern_soapstone_wall = createBlockStone("modern_soapstone_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> railing_soapstone_wall = createBlockStone("railing_soapstone_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> soapstone_railing_gate = createBlockStone("soapstone_railing_gate", () -> new FenceGateBlock(STONE));
	public static final RegistryObject<Block> soapstone_pillar_wall = createBlockStone("soapstone_pillar_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> soapstone_grass_topped_wall = createBlockStone("soapstone_grass_topped_wall", () -> new FenceHitbox(STONE));
	public static final RegistryObject<Block> modern_travertine_wall = createBlockStone("modern_travertine_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> railing_travertine_wall = createBlockStone("railing_travertine_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> travertine_railing_gate = createBlockStone("travertine_railing_gate", () -> new FenceGateBlock(STONE));
	public static final RegistryObject<Block> travertine_pillar_wall = createBlockStone("travertine_pillar_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> travertine_grass_topped_wall = createBlockStone("travertine_grass_topped_wall", () -> new FenceHitbox(STONE));
	public static final RegistryObject<Block> modern_dacite_wall = createBlockStone("modern_dacite_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> railing_dacite_wall = createBlockStone("railing_dacite_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> dacite_railing_gate = createBlockStone("dacite_railing_gate", () -> new FenceGateBlock(STONE));
	public static final RegistryObject<Block> dacite_pillar_wall = createBlockStone("dacite_pillar_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> dacite_grass_topped_wall = createBlockStone("dacite_grass_topped_wall", () -> new FenceHitbox(STONE));
	public static final RegistryObject<Block> modern_red_rock_wall = createBlockStone("modern_red_rock_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> railing_red_rock_wall = createBlockStone("railing_red_rock_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> red_rock_railing_gate = createBlockStone("red_rock_railing_gate", () -> new FenceGateBlock(STONE));
	public static final RegistryObject<Block> red_rock_pillar_wall = createBlockStone("red_rock_pillar_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> red_rock_grass_topped_wall = createBlockStone("red_rock_grass_topped_wall", () -> new FenceHitbox(STONE));
	public static final RegistryObject<Block> modern_scoria_stone_wall = createBlockStone("modern_scoria_stone_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> railing_scoria_stone_wall = createBlockStone("railing_scoria_stone_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> scoria_stone_railing_gate = createBlockStone("scoria_stone_railing_gate", () -> new FenceGateBlock(STONE));
	public static final RegistryObject<Block> scoria_stone_pillar_wall = createBlockStone("scoria_stone_pillar_wall", () -> new FenceBlock(STONE));
	public static final RegistryObject<Block> scoria_stone_grass_topped_wall = createBlockStone("scoria_stone_grass_topped_wall", () -> new FenceHitbox(STONE));

    public static RegistryObject<Block> createBlock(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new FuelItemBlock(block.get(), new Item.Properties().tab(McwFencesBYG.TAB_GROUP)));
        return block;
    }
    
    public static RegistryObject<Block> createBlockStone(String name, Supplier<? extends Block> supplier)
    {
        RegistryObject<Block> block = BLOCKS_REGISTRY.register(name, supplier);
        ITEMS_REGISTRY.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(McwFencesBYG.TAB_GROUP)));
        return block;
    }
}