/**
 * This file is part of PacketWrapper.
 * Copyright (C) 2012-2015 Kristian S. Strangeland
 * Copyright (C) 2015 dmulloy2
 *
 * PacketWrapper is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * PacketWrapper is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with PacketWrapper.  If not, see <http://www.gnu.org/licenses/>.
 */
package com.comphenix.packetwrapper;

import com.comphenix.protocol.PacketType;
import com.comphenix.protocol.events.PacketContainer;

public class WrapperPlayServerAttachEntity extends AbstractPacket {
    public static final PacketType TYPE = PacketType.Play.Server.ATTACH_ENTITY;
    
    public WrapperPlayServerAttachEntity() {
        super(new PacketContainer(TYPE), TYPE);
        handle.getModifier().writeDefaults();
    }
    
    public WrapperPlayServerAttachEntity(PacketContainer packet) {
        super(packet, TYPE);
    }
    
    /**
     * Retrieve Entity ID.
     * <p>
     * Notes: entity's ID
     * @return The current Entity ID
     */
    public int getEntityId() {
        return handle.getIntegers().read(1);
    }
    
    /**
     * Set Entity ID.
     * @param value - new value.
     */
    public void setEntityId(int value) {
        handle.getIntegers().write(1, value);
    }
    
    /**
     * Retrieve Vehicle ID.
     * <p>
     * Notes: vechicle's Entity ID
     * @return The current Vehicle ID
     */
    public int getVehicleId() {
        return handle.getIntegers().read(2);
    }
    
    /**
     * Set Vehicle ID.
     * @param value - new value.
     */
    public void setVehicleId(int value) {
        handle.getIntegers().write(2, value);
    }
    
    /**
     * Retrieve Leash.
     * <p>
     * Notes: if true leashes the entity to the vehicle
     * @return The current Leash
     */
    public int getLeash() {
        return  handle.getIntegers().read(0);
    }
    
    /**
     * Set Leash.
     * @param value - new value.
     */
    public void setLeash(int value) {
        handle.getIntegers().write(0, value);
    }
    
}

