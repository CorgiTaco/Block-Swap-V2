package dev.corgitaco.blockswap.stateselector;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import dev.corgitaco.blockswap.BlockSwapRegistry;
import net.minecraft.world.level.block.state.BlockState;

import java.util.Collection;
import java.util.List;

public interface BlockStateSelector {

    Codec<BlockStateSelector> CODEC = Codec.lazyInitialized(() -> BlockSwapRegistry.BLOCK_STATE_SELECTOR.get().byNameCodec().dispatchStable(BlockStateSelector::codec, MapCodec::assumeMapUnsafe));

    List<BlockState> gatherStates(Collection<BlockState> registryStates);

    Codec<? extends BlockStateSelector> codec();
}
