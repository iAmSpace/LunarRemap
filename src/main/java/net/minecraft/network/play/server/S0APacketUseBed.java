package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S0APacketUseBed
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public S0APacketUseBed() {
    }

    public S0APacketUseBed(class_0814 class_08142, int n, int n2, int n3) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.lllIIIllIIIIlllIlIIllIIll = class_08142.llllllIlIllllIlIlIlIIIIlI();
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readByte();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readInt();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeInt(this.lIlllIlllIIIIlIIlllIllIII);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public class_0814 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return (class_0814)class_13342.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

