package dev.corgitaco.blockswap.levelswapcondition;

import net.minecraft.core.BlockPos;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkAccess;

public record LevelSwapConditionContext(BlockState state, BlockPos pos, ChunkAccess access, Level level) {
}
