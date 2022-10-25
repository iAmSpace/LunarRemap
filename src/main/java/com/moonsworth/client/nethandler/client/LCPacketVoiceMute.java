/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.client;

import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.server.ILCNetHandlerServer;
import java.io.IOException;
import java.util.UUID;

public class LCPacketVoiceMute
extends LCPacket {
    private UUID muting;

    public LCPacketVoiceMute() {
    }

    public LCPacketVoiceMute(UUID muting) {
        this.muting = muting;
    }

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeUUID(this.muting);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.muting = b.readUUID();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerServer)handler).handleVoiceMute(this);
    }

    public UUID getMuting() {
        return this.muting;
    }
}

