/*
 * Decompiled with CFR 0.150.
 */
package com.moonsworth.client.nethandler.server;

import com.moonsworth.client.nethandler.ByteBufWrapper;
import com.moonsworth.client.nethandler.ILCNetHandler;
import com.moonsworth.client.nethandler.LCPacket;
import com.moonsworth.client.nethandler.client.ILCNetHandlerClient;
import java.io.IOException;

public class LCPacketNotification
extends LCPacket {
    private String message;
    private long durationMs;
    private String level;

    public LCPacketNotification() {
    }

    public LCPacketNotification(String message, long durationMs, String level) {
        this.message = message;
        this.durationMs = durationMs;
        this.level = level;
    }

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeString(this.message);
        b.buf().writeLong(this.durationMs);
        b.writeString(this.level);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.message = b.readString();
        this.durationMs = b.buf().readLong();
        this.level = b.readString();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleNotification(this);
    }

    public String getMessage() {
        return this.message;
    }

    public long getDurationMs() {
        return this.durationMs;
    }

    public String getLevel() {
        return this.level;
    }
}

