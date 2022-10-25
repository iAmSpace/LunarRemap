/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.shared;

import com.google.common.base.Preconditions;
import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import java.io.IOException;

public class LCPacketWaypointAdd
extends LCPacket {
    private String name;
    private String world;
    private int color;
    private int x;
    private int y;
    private int z;
    private boolean forced;
    private boolean visible;

    public LCPacketWaypointAdd(String name, String world, int color, int x, int y, int z, boolean forced, boolean visible) {
        this.name = Preconditions.checkNotNull(name, "name");
        this.world = Preconditions.checkNotNull(world, "world");
        this.color = color;
        this.x = x;
        this.y = y;
        this.z = z;
        this.forced = forced;
        this.visible = visible;
    }

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeString(this.name);
        b.writeString(this.world);
        b.buf().writeInt(this.color);
        b.buf().writeInt(this.x);
        b.buf().writeInt(this.y);
        b.buf().writeInt(this.z);
        b.buf().writeBoolean(this.forced);
        b.buf().writeBoolean(this.visible);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.name = b.readString();
        this.world = b.readString();
        this.color = b.buf().readInt();
        this.x = b.buf().readInt();
        this.y = b.buf().readInt();
        this.z = b.buf().readInt();
        this.forced = b.buf().readBoolean();
        this.visible = b.buf().readBoolean();
    }

    @Override
    public void process(ILCNetHandler handler) {
        handler.handleAddWaypoint(this);
    }

    public String getName() {
        return this.name;
    }

    public String getWorld() {
        return this.world;
    }

    public int getColor() {
        return this.color;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getZ() {
        return this.z;
    }

    public boolean isForced() {
        return this.forced;
    }

    public boolean isVisible() {
        return this.visible;
    }

    public LCPacketWaypointAdd() {
    }
}

