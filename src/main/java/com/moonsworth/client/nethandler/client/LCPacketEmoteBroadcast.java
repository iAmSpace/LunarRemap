/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.client;

import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import java.io.IOException;
import java.util.UUID;

public class LCPacketEmoteBroadcast
extends LCPacket {
    private UUID uuid;
    private int emoteId;

    public LCPacketEmoteBroadcast() {
    }

    public LCPacketEmoteBroadcast(UUID broadcastTo, int emoteId) {
        this.uuid = broadcastTo;
        this.emoteId = emoteId;
    }

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeUUID(this.uuid);
        b.buf().writeInt(this.emoteId);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.uuid = b.readUUID();
        this.emoteId = b.buf().readInt();
    }

    @Override
    public void process(ILCNetHandler handler) {
        handler.handleEmote(this);
    }

    public UUID getUuid() {
        return this.uuid;
    }

    public int getEmoteId() {
        return this.emoteId;
    }
}

