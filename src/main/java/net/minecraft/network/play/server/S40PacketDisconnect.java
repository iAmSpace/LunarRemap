package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import net.minecraft.util.IChatComponent;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S40PacketDisconnect
extends Packet {
    private IChatComponent lllIIIllIIIIlllIlIIllIIll;

    public S40PacketDisconnect() {
    }

    public S40PacketDisconnect(IChatComponent class_22552) {
        this.lllIIIllIIIIlllIlIIllIIll = class_22552;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_2095.lllIIIllIIIIlllIlIIllIIll(class_01812.readStringFromBuffer(32767));
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(class_2095.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean hasPriority() {
        return true;
    }

    public IChatComponent IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

