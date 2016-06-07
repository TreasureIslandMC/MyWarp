/*
 * Copyright (C) 2011 - 2016, mywarp team and contributors
 *
 * This file is part of mywarp.
 *
 * mywarp is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * mywarp is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with mywarp. If not, see <http://www.gnu.org/licenses/>.
 */

package me.taylorkelly.mywarp.platform;

import com.flowpowered.math.vector.Vector3i;

import java.util.UUID;

/**
 * A world or dimension currently existing on the server.
 */
public interface LocalWorld {

  /**
   * Gets the name of this world.
   *
   * @return this world's name
   */
  String getName();

  /**
   * Gets the unique ID of this world.
   *
   * @return this world's unique identifier
   */
  UUID getUniqueId();

  /**
   * Returns whether the block at the given {@code position} within this world is smaller than a single full block.
   *
   * @param position the position to check
   * @return {@code true} if this particular block is smaller than a normal block
   * @deprecated This method exists only to support warps created in legacy versions and may be removed at any time.
   */
  @Deprecated
  boolean isNotFullHeight(Vector3i position);

}
