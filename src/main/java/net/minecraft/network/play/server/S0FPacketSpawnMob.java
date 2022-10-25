package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.network.Packet;
import net.minecraft.util.MathHelper;
import obf.*;

import java.util.List;

public class S0FPacketSpawnMob
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private byte IIIllIllIIlIlIlIlIllllIIl;
    private byte IllIIIllIIIIlIlIlIllIIlll;
    private byte lIIIIlIlIIlllllIIllIIlIII;
    private class_0788 llIIlllIllIllllIIIlIIIIII;
    private List llIIllIllIlIIlIIllIllllll;

    public S0FPacketSpawnMob() {
    }

    public S0FPacketSpawnMob(class_1965 class_19652) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19652.llllllIlIllllIlIlIlIIIIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl = (byte) class_0054.lllIIIllIIIIlllIlIIllIIll(class_19652);
        this.IlIllllllIIlIIllllIIlIIIl = class_19652.IllIIllIlIlllIllIllIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_19652.IlIIlllllIIlIlIlllllIllll);
        this.lIlllIlllIIIIlIIlllIllIII = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI * 32.0);
        this.IlIIIIIllllllIIlllIllllll = class_19652.IllIIllIlIlllIllIllIlIIIl.lllIIIllIIIIlllIlIIllIIll(class_19652.IllIIIIllIIllIllIlllIlIIl);
        this.IIIllIllIIlIlIlIlIllllIIl = (byte)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f);
        this.IllIIIllIIIIlIlIlIllIIlll = (byte)(class_19652.IlIlIIlllIllllllllIIIlIlI * 256.0f / 360.0f);
        this.lIIIIlIlIIlllllIIllIIlIII = (byte)(class_19652.lIIllllIllIlllllIIllIllIl * 256.0f / 360.0f);
        double d = 3.9;
        double d2 = class_19652.IIIIIIIIlIllIIllIIlllIllI;
        double d3 = class_19652.IIlIIlIlIlIllIIlIlIIIIlll;
        double d4 = class_19652.llIIIlllIlllIlIllIIIIllIl;
        if (d2 < -d) {
            d2 = -d;
        }
        if (d3 < -d) {
            d3 = -d;
        }
        if (d4 < -d) {
            d4 = -d;
        }
        if (d2 > d) {
            d2 = d;
        }
        if (d3 > d) {
            d3 = d;
        }
        if (d4 > d) {
            d4 = d;
        }
        this.lIllllIIlIIIlIllllllIIIll = (int)(d2 * 8000.0);
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(d3 * 8000.0);
        this.IllIIlllllllIIlIIlIIIIlIl = (int)(d4 * 8000.0);
        this.llIIlllIllIllllIIIlIIIIII = class_19652.lIlIIllllIlIIIIllIIIIlIIl();
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readVarIntFromBuffer();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readByte() & 0xFF;
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readInt();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readInt();
        this.IIIllIllIIlIlIlIlIllllIIl = class_01812.readByte();
        this.IllIIIllIIIIlIlIlIllIIlll = class_01812.readByte();
        this.lIIIIlIlIIlllllIIllIIlIII = class_01812.readByte();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readShort();
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_01812.readShort();
        this.IllIIlllllllIIlIIlIIIIlIl = class_01812.readShort();
        this.llIIllIllIlIIlIIllIllllll = class_0788.lllIlIIlIIIlIlIIIllIlllIl(class_01812);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeVarIntToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl & 0xFF);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeInt(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeInt(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte(this.IIIllIllIIlIlIlIlIllllIIl);
        class_01812.writeByte(this.IllIIIllIIIIlIlIlIllIIlll);
        class_01812.writeByte(this.lIIIIlIlIIlllllIIllIIlIII);
        class_01812.writeShort(this.lIllllIIlIIIlIllllllIIIll);
        class_01812.writeShort(this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_01812.writeShort(this.IllIIlllllllIIlIIlIIIIlIl);
        this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(class_01812);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public List IlIllllllIIlIIllllIIlIIIl() {
        if (this.llIIllIllIlIIlIIllIllllll == null) {
            this.llIIllIllIlIIlIIllIllllll = this.llIIlllIllIllllIIIlIIIIII.IlIllllllIIlIIllllIIlIIIl();
        }
        return this.llIIllIllIlIIlIIllIllllll;
    }

    @Override
    public String serialize() {
        return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f, xd=%.2f, yd=%.2f, zd=%.2f", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, Float.valueOf((float)this.IlIllllllIIlIIllllIIlIIIl / 32.0f), Float.valueOf((float)this.lIlllIlllIIIIlIIlllIllIII / 32.0f), Float.valueOf((float)this.IlIIIIIllllllIIlllIllllll / 32.0f), Float.valueOf((float)this.lIllllIIlIIIlIllllllIIIll / 8000.0f), Float.valueOf((float)this.IIIllIIlIIIIIIlIlIIllIIlI / 8000.0f), Float.valueOf((float)this.IllIIlllllllIIlIIlIIIIlIl / 8000.0f));
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public byte llIIlllIllIllllIIIlIIIIII() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public byte llIIllIllIlIIlIIllIllllll() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public byte lllIIlIIIllllllIIIIlIlIlI() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

