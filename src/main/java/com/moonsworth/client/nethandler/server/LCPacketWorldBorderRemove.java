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

public class LCPacketWorldBorderRemove
extends LCPacket {
    private String id;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeString(this.id);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.id = b.readString();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleWorldBorderRemove(this);
    }

    @ConstructorProperties(value={"id"})
    public LCPacketWorldBorderRemove(String id) {
        this.id = id;
    }

    public LCPacketWorldBorderRemove() {
    }

    public String getId() {
        return this.id;
    }
}

