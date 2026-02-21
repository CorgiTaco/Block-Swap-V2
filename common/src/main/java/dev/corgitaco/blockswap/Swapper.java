package dev.corgitaco.blockswap;

import dev.corgitaco.blockswap.levelswapcondition.LevelSwapCondition;
import dev.corgitaco.blockswap.stateselector.BlockStateSelector;
import dev.corgitaco.blockswap.swapaction.BlockAction;

public record Swapper(BlockStateSelector blockStateSelector, LevelSwapCondition levelSwapCondition, BlockAction action) {
}
