package net.minecraft.network.play.client;

import obf.PacketBuffer;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C03PacketPlayer_C04PacketPlayerPosition
extends C03PacketPlayer {
    public C03PacketPlayer_C04PacketPlayerPosition() {
        this.IllIIlllllllIIlIIlIIIIlIl = true;
    }

    public C03PacketPlayer_C04PacketPlayerPosition(double d, double d2, double d3, double d4, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.lIlllIlllIIIIlIIlllIllIII = d3;
        this.IlIllllllIIlIIllllIIlIIIl = d4;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.IllIIlllllllIIlIIlIIIIlIl = true;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readDouble();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readDouble();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readDouble();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readDouble();
        super.readPacketData(class_01812);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeDouble(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeDouble(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeDouble(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeDouble(this.IlIllllllIIlIIllllIIlIIIl);
        super.writePacketData(class_01812);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        super.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

