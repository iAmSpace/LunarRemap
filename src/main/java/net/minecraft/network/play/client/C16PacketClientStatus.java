package net.minecraft.network.play.client;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class C16PacketClientStatus
extends Packet {
    private class_1297 lllIIIllIIIIlllIlIIllIIll;

    public C16PacketClientStatus() {
    }

    public C16PacketClientStatus(class_1297 class_12972) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12972;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_1297.lllIIIllIIIIlllIlIIllIIll()[class_01812.readByte() % class_1297.lllIIIllIIIIlllIlIIllIIll().length];
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(class_1297.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public class_1297 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

