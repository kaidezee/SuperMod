package me.proton.kaidezee.supermod;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;

import static me.proton.kaidezee.supermod.SuperMod.MODID;

public class ModBlocks {
        public static final DeferredRegister.Blocks BLOCKS = DeferredRegister.createBlocks(MODID);

        public static final DeferredBlock<Block> CHECKERED_TILE_BLOCK = BLOCKS.register("checkered_tile_block",
                        () -> new Block(BlockBehaviour.Properties.ofFullCopy(Blocks.DIRT)
                                        .sound(SoundType.STONE)
                                        .setId(ResourceKey.create(
                                                        Registries.BLOCK, ResourceLocation.fromNamespaceAndPath(
                                                                        MODID, "checkered_tile_block")))));
}
