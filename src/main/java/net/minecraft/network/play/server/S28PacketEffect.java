package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S28PacketEffect
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;

    public S28PacketEffect() {
    }

    public S28PacketEffect(int n, int n2, int n3, int n4, int n5, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
        this.IlIIIIIllllllIIlllIllllll = n4;
        this.lllIlIIlIIIlIlIIIllIlllIl = n5;
        this.lIllllIIlIIIlIllllllIIIll = bl;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readByte() & 0xFF;
        this.IlIIIIIllllllIIlllIllllll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readBoolean();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII & 0xFF);
        class_01812.writeInt(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeBoolean(this.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
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

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}
