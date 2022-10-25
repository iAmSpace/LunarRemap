package net.minecraft.network.play.client;

import obf.PacketBuffer;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C03PacketPlayer_C06PacketPlayerPosLook
extends C03PacketPlayer {
    public C03PacketPlayer_C06PacketPlayerPosLook() {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
        this.IIIllIllIIlIlIlIlIllllIIl = true;
    }

    public C03PacketPlayer_C06PacketPlayerPosLook(double d, double d2, double d3, double d4, float f, float f2, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.lIlllIlllIIIIlIIlllIllIII = d3;
        this.IlIllllllIIlIIllllIIlIIIl = d4;
        this.IlIIIIIllllllIIlllIllllll = f;
        this.lIllllIIlIIIlIllllllIIIll = f2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.IIIllIllIIlIlIlIlIllllIIl = true;
        this.IllIIlllllllIIlIIlIIIIlIl = true;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readDouble();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readDouble();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readDouble();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readDouble();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readFloat();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readFloat();
        super.readPacketData(class_01812);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeDouble(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeDouble(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeDouble(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeDouble(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeFloat(this.lIllllIIlIIIlIllllllIIIll);
        super.writePacketData(class_01812);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

