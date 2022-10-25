package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S12PacketEntityVelocity
extends Packet {
    private static int lllIIIllIIIIlllIlIIllIIll = "PD0QEiMBp7MMnE/Xsy15Y".length() * "SxsSzIMRVwhI4lWHAxrwyAAs".length() * "FBCXhDkD".length() - 32;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public S12PacketEntityVelocity() {
    }

    public S12PacketEntityVelocity(class_1521 class_15212) {
        this(class_15212.llllllIlIllllIlIlIlIIIIlI(), class_15212.IIIIIIIIlIllIIllIIlllIllI, class_15212.IIlIIlIlIlIllIIlIlIIIIlll, class_15212.llIIIlllIlllIlIllIIIIllIl);
    }

    public S12PacketEntityVelocity(int n, double d, double d2, double d3) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        double d4 = 3.9;
        if (d < -d4) {
            d = -d4;
        }
        if (d2 < -d4) {
            d2 = -d4;
        }
        if (d3 < -d4) {
            d3 = -d4;
        }
        if (d > d4) {
            d = d4;
        }
        if (d2 > d4) {
            d2 = d4;
        }
        if (d3 > d4) {
            d3 = d4;
        }
        this.IlIllllllIIlIIllllIIlIIIl = (int)(d * ((double)lllIIIllIIIIlllIlIIllIIll * 2.0));
        this.lIlllIlllIIIIlIIlllIllIII = (int)(d2 * ((double)lllIIIllIIIIlllIlIIllIIll * 2.0));
        this.IlIIIIIllllllIIlllIllllll = (int)(d3 * ((double)lllIIIllIIIIlllIlIIllIIll * 2.0));
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readShort();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readShort();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readShort();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeShort(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeShort(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeShort(this.IlIIIIIllllllIIlllIllllll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("id=%d, x=%.2f, y=%.2f, z=%.2f", this.lllIlIIlIIIlIlIIIllIlllIl, Float.valueOf((float)this.IlIllllllIIlIIllllIIlIIIl / ((float)lllIIIllIIIIlllIlIIllIIll * 2.0f)), Float.valueOf((float)this.lIlllIlllIIIIlIIlllIllIII / ((float)lllIIIllIIIIlllIlIIllIIll * 2.0f)), Float.valueOf((float)this.IlIIIIIllllllIIlllIllllll / ((float)lllIIIllIIIIlllIlIIllIIll * 2.0f)));
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

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

