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
import java.util.UUID;

public class LCPacketVoice
extends LCPacket {
    private UUID uuid;
    private byte[] data;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeUUID(this.uuid);
        this.writeBlob(b, this.data);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.uuid = b.readUUID();
        this.data = this.readBlob(b);
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleVoice(this);
    }

    @ConstructorProperties(value={"uuid", "data"})
    public LCPacketVoice(UUID uuid, byte[] data) {
        this.uuid = uuid;
        this.data = data;
    }

    public LCPacketVoice() {
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public byte[] getData() {
        return this.data;
    }
}

