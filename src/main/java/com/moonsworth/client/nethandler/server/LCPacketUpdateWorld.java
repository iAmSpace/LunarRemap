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

public class LCPacketUpdateWorld
extends LCPacket {
    private String world;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeString(this.world);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.world = b.readString();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleUpdateWorld(this);
    }

    @ConstructorProperties(value={"world"})
    public LCPacketUpdateWorld(String world) {
        this.world = world;
    }

    public LCPacketUpdateWorld() {
    }

    public String getWorld() {
        return this.world;
    }
}

