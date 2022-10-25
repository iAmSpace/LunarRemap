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

public class LCPacketServerUpdate
extends LCPacket {
    private String server;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeString(this.server);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.server = b.readString();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleServerUpdate(this);
    }

    @ConstructorProperties(value={"server"})
    public LCPacketServerUpdate(String server) {
        this.server = server;
    }

    public LCPacketServerUpdate() {
    }

    public String getServer() {
        return this.server;
    }
}

