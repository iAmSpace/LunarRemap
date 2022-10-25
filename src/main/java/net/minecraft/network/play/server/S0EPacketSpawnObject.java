package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import net.minecraft.util.MathHelper;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S0EPacketSpawnObject
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;

    public S0EPacketSpawnObject() {
    }

    public S0EPacketSpawnObject(class_1521 class_15212, int n) {
        this(class_15212, n, 0);
    }

    public S0EPacketSpawnObject(class_1521 class_15212, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212.llllllIlIllllIlIlIlIIIIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll * 32.0);
        this.IlIllllllIIlIIllllIIlIIIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI * 32.0);
        this.lIlllIlllIIIIlIIlllIllIII = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl * 32.0);
        this.IllIIlllllllIIlIIlIIIIlIl = MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.IlIlIIlllIllllllllIIIlIlI * 256.0f / 360.0f);
        this.IIIllIllIIlIlIlIlIllllIIl = MathHelper.lIlllIlllIIIIlIIlllIllIII(class_15212.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = n;
        this.lIIIIlIlIIlllllIIllIIlIII = n2;
        if (n2 > 0) {
            double d = class_15212.IIIIIIIIlIllIIllIIlllIllI;
            double d2 = class_15212.IIlIIlIlIlIllIIlIlIIIIlll;
            double d3 = class_15212.llIIIlllIlllIlIllIIIIllIl;
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
            this.IlIIIIIllllllIIlllIllllll = (int)(d * 8000.0);
            this.lIllllIIlIIIlIllllllIIIll = (int)(d2 * 8000.0);
            this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(d3 * 8000.0);
        }
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readVarIntFromBuffer();
        this.IllIIIllIIIIlIlIlIllIIlll = class_01812.readByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readInt();
        this.IllIIlllllllIIlIIlIIIIlIl = class_01812.readByte();
        this.IIIllIllIIlIlIlIlIllllIIl = class_01812.readByte();
        this.lIIIIlIlIIlllllIIllIIlIII = class_01812.readInt();
        if (this.lIIIIlIlIIlllllIIllIIlIII > 0) {
            this.IlIIIIIllllllIIlllIllllll = class_01812.readShort();
            this.lIllllIIlIIIlIllllllIIIll = class_01812.readShort();
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readShort();
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeVarIntToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.IllIIIllIIIIlIlIlIllIIlll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeInt(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeByte(this.IllIIlllllllIIlIIlIIIIlIl);
        class_01812.writeByte(this.IIIllIllIIlIlIlIlIllllIIl);
        class_01812.writeInt(this.lIIIIlIlIIlllllIIllIIlIII);
        if (this.lIIIIlIlIIlllllIIllIIlIII > 0) {
            class_01812.writeShort(this.IlIIIIIllllllIIlllIllllll);
            class_01812.writeShort(this.lIllllIIlIIIlIllllllIIIll);
            class_01812.writeShort(this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", this.lllIIIllIIIIlllIlIIllIIll, this.IllIIIllIIIIlIlIlIllIIlll, Float.valueOf((float)this.lllIlIIlIIIlIlIIIllIlllIl / 32.0f), Float.valueOf((float)this.IlIllllllIIlIIllllIIlIIIl / 32.0f), Float.valueOf((float)this.lIlllIlllIIIIlIIlllIllIII / 32.0f));
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public int IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public int llIIlllIllIllllIIIlIIIIII() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public int llIIllIllIlIIlIIllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public void lIlllIlllIIIIlIIlllIllIII(int n) {
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    public void IlIIIIIllllllIIlllIllllll(int n) {
        this.lIllllIIlIIIlIllllllIIIll = n;
    }

    public void lIllllIIlIIIlIllllllIIIll(int n) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        this.lIIIIlIlIIlllllIIllIIlIII = n;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

