package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import net.minecraft.util.MathHelper;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S18PacketEntityTeleport
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private byte IlIIIIIllllllIIlllIllllll;
    private byte lIllllIIlIIIlIllllllIIIll;

    public S18PacketEntityTeleport() {
    }

    public S18PacketEntityTeleport(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212.llllllIlIllllIlIlIlIIIIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll * 32.0);
        this.IlIllllllIIlIIllllIIlIIIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI * 32.0);
        this.lIlllIlllIIIIlIIlllIllIII = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl * 32.0);
        this.IlIIIIIllllllIIlllIllllll = (byte)(class_15212.IIIIlIllIlIIlIIlIllIlIlll * 256.0f / 360.0f);
        this.lIllllIIlIIIlIllllllIIIll = (byte)(class_15212.IlIlIIlllIllllllllIIIlIlI * 256.0f / 360.0f);
    }

    public S18PacketEntityTeleport(int n, int n2, int n3, int n4, byte by, byte by2) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.IlIIIIIllllllIIlllIllllll = by;
        this.lIllllIIlIIIlIllllllIIIll = by2;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readInt();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readByte();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeInt(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
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

    public byte IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public byte IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

