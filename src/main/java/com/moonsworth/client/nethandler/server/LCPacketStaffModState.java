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

public class LCPacketStaffModState
extends LCPacket {
    private String mod;
    private boolean state;

    @Override
    public void write(ByteBufWrapper b) throws IOException {
        b.writeString(this.mod);
        b.buf().writeBoolean(this.state);
    }

    @Override
    public void read(ByteBufWrapper b) throws IOException {
        this.mod = b.readString();
        this.state = b.buf().readBoolean();
    }

    @Override
    public void process(ILCNetHandler handler) {
        ((ILCNetHandlerClient)handler).handleStaffModState(this);
    }

    public String getMod() {
        return this.mod;
    }

    public boolean isState() {
        return this.state;
    }

    @ConstructorProperties(value={"mod", "state"})
    public LCPacketStaffModState(String mod, boolean state) {
        this.mod = mod;
        this.state = state;
    }

    public LCPacketStaffModState() {
    }
}

