package dev.corgitaco.blockswap.levelswapcondition;

import com.mojang.serialization.Codec;
import com.mojang.serialization.MapCodec;
import dev.corgitaco.blockswap.BlockSwapRegistry;

public interface LevelSwapCondition {

    Codec<LevelSwapCondition> CODEC = Codec.lazyInitialized(() -> BlockSwapRegistry.LEVEL_SWAP_CONDITION.get().byNameCodec().dispatchStable(LevelSwapCondition::codec, MapCodec::assumeMapUnsafe));


    boolean passesBlockPlace(LevelSwapConditionContext conditionContext);


    Codec<? extends LevelSwapCondition> codec();

}
