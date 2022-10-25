/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.server;

import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.ILCNetHandlerClient;
import java.beans.ConstructorProperties;
import java.io.IOException;

public class LCPacketWorldBorder
extends LCPacket {
    private String id;
    private String world;
    private boolean cancelsExit;
    private boolean canShrinkExpand;
    private int color = -13421569;
    private double minX;
    private double minZ;
    private double maxX;
    private double maxZ;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeOptional(this.id, b::writeString);
        b.writeString(this.world);
        b.buf().writeBoolean(this.cancelsExit);
        b.buf().writeBoolean(this.canShrinkExpand);
        b.buf().writeInt(this.color);
        b.buf().writeDouble(this.minX);
        b.buf().writeDouble(this.minZ);
        b.buf().writeDouble(this.maxX);
        b.buf().writeDouble(this.maxZ);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.id = b.readOptional(b::readString);
        this.world = b.readString();
        this.cancelsExit = b.buf().readBoolean();
        this.canShrinkExpand = b.buf().readBoolean();
        this.color = b.buf().readInt();
        this.minX = b.buf().readDouble();
        this.minZ = b.buf().readDouble();
        this.maxX = b.buf().readDouble();
        this.maxZ = b.buf().readDouble();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleWorldBorder(this);
    }

    public String getId() {
        return this.id;
    }

    public String getWorld() {
        return this.world;
    }

    public boolean isCancelsExit() {
        return this.cancelsExit;
    }

    public boolean isCanShrinkExpand() {
        return this.canShrinkExpand;
    }

    public int getColor() {
        return this.color;
    }

    public double getMinX() {
        return this.minX;
    }

    public double getMinZ() {
        return this.minZ;
    }

    public double getMaxX() {
        return this.maxX;
    }

    public double getMaxZ() {
        return this.maxZ;
    }

    public LCPacketWorldBorder() {
    }

    @ConstructorProperties(value={"id", "world", "cancelsExit", "canShrinkExpand", "color", "minX", "minZ", "maxX", "maxZ"})
    public LCPacketWorldBorder(String id, String world, boolean cancelsExit, boolean canShrinkExpand, int color, double minX, double minZ, double maxX, double maxZ) {
        this.id = id;
        this.world = world;
        this.cancelsExit = cancelsExit;
        this.canShrinkExpand = canShrinkExpand;
        this.color = color;
        this.minX = minX;
        this.minZ = minZ;
        this.maxX = maxX;
        this.maxZ = maxZ;
    }
}

