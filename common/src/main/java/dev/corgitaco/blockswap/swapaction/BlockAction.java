package dev.corgitaco.blockswap.swapaction;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import dev.corgitaco.blockswap.BlockSwapRegistry;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;

public interface BlockAction {

    Codec<BlockAction> CODEC = Codec.lazyInitialized(() -> BlockSwapRegistry.BLOCK_ACTION_SELECTOR.get().byNameCodec().dispatchStable(BlockAction::codec, MapCodec::assumeMapUnsafe));

    BlockState runAction(ChunkAccess chunkAccess, BlockState originalState, BlockState lastState, BlockPos pos);

    Codec<? extends BlockAction> codec();
}
