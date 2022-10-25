/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.shared;

import com.google.common.base.Preconditions;
import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import java.io.IOException;

public class LCPacketWaypointRemove
extends LCPacket {
    private String name;
    private String world;

    public LCPacketWaypointRemove(String name, String world) {
        this.name = Preconditions.checkNotNull(name, "name");
        this.world = Preconditions.checkNotNull(world, "world");
    }

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeString(this.name);
        b.writeString(this.world);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.name = b.readString();
        this.world = b.readString();
    }

    @Override
    public void process(ILCNetHandler handler) {
        handler.handleRemoveWaypoint(this);
    }

    public String getName() {
        return this.name;
    }

    public String getWorld() {
        return this.world;
    }

    public LCPacketWaypointRemove() {
    }
}

