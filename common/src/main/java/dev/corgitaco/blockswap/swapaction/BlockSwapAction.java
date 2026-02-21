package dev.corgitaco.blockswap.swapaction;

import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;

public class BlockSwapAction implements BlockAction{
    @Override
    public BlockState runAction(ChunkAccess chunkAccess, BlockState originalState, BlockState lastState, BlockPos pos) {
        return null;
    }

    @Override
    public Codec<? extends BlockAction> codec() {
        return null;
    }
}
