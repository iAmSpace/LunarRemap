package net.minecraft.network.login.server;

import net.minecraft.network.Packet;
import net.minecraft.util.IChatComponent;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S00PacketDisconnect
extends Packet {
    private IChatComponent lllIIIllIIIIlllIlIIllIIll;

    public S00PacketDisconnect() {
    }

    public S00PacketDisconnect(IChatComponent class_22552) {
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

    public void lllIIIllIIIIlllIlIIllIIll(class_0774 class_07742) {
        class_07742.lllIIIllIIIIlllIlIIllIIll(this);
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
        this.lllIIIllIIIIlllIlIIllIIll((class_0774)class_20752);
    }
}

