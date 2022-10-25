package net.minecraft.network.play.client;

import obf.PacketBuffer;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C03PacketPlayer_C05PacketPlayerLook
extends C03PacketPlayer {
    public C03PacketPlayer_C05PacketPlayerLook() {
        this.IIIllIllIIlIlIlIlIllllIIl = true;
    }

    public C03PacketPlayer_C05PacketPlayerLook(float f, float f2, boolean bl) {
        this.IlIIIIIllllllIIlllIllllll = f;
        this.lIllllIIlIIIlIllllllIIIll = f2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.IIIllIllIIlIlIlIlIllllIIl = true;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.IlIIIIIllllllIIlllIllllll = class_01812.readFloat();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readFloat();
        super.readPacketData(class_01812);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeFloat(this.lIllllIIlIIIlIllllllIIIll);
        super.writePacketData(class_01812);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

