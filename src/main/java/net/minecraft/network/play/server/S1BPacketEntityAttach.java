package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S1BPacketEntityAttach
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    public S1BPacketEntityAttach() {
    }

    public S1BPacketEntityAttach(int n, class_1521 class_15212, class_1521 class_15213) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_15212.llllllIlIllllIlIlIlIIIIlI();
        this.IlIllllllIIlIIllllIIlIIIl = class_15213 != null ? class_15213.llllllIlIllllIlIlIlIIIIlI() : -1;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readUnsignedByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll);
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

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

