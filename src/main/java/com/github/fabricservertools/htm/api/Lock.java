package com.github.fabricservertools.htm.api;

import com.github.fabricservertools.htm.HTMContainerLock;
import net.minecraft.nbt.NbtCompound;
import net.minecraft.server.network.ServerPlayerEntity;

public interface Lock {
	boolean canOpen(ServerPlayerEntity player, HTMContainerLock lock);

	void onLockSet(ServerPlayerEntity player, HTMContainerLock lock);

	void onInfo(ServerPlayerEntity player, HTMContainerLock lock);

	NbtCompound toTag();

	void fromTag(NbtCompound tag);

	LockType<?> getType();
}
