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

public class LCPacketVoiceChannelRemove
extends LCPacket {
    private UUID uuid;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeUUID(this.uuid);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.uuid = b.readUUID();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleVoiceChannelDelete(this);
    }

    @ConstructorProperties(value={"uuid"})
    public LCPacketVoiceChannelRemove(UUID uuid) {
        this.uuid = uuid;
    }

    public LCPacketVoiceChannelRemove() {
    }

    public UUID getUuid() {
        return this.uuid;
    }
}

