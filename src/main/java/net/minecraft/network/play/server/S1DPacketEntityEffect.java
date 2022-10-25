package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S1DPacketEntityEffect
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private byte lllIlIIlIIIlIlIIIllIlllIl;
    private byte IlIllllllIIlIIllllIIlIIIl;
    private short lIlllIlllIIIIlIIlllIllIII;

    public S1DPacketEntityEffect() {
    }

    public S1DPacketEntityEffect(int n, class_1852 class_18522) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = (byte)(class_18522.lllIIIllIIIIlllIlIIllIIll() & 0xFF);
        this.IlIllllllIIlIIllllIIlIIIl = (byte)(class_18522.IlIllllllIIlIIllllIIlIIIl() & 0xFF);
        this.lIlllIlllIIIIlIIlllIllIII = class_18522.lllIlIIlIIIlIlIIIllIlllIl() > 32767 ? (short)32767 : (short)class_18522.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readByte();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readShort();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeShort(this.lIlllIlllIIIIlIIlllIllIII);
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII == 32767;
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public byte IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public byte lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public short IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

