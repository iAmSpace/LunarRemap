package net.minecraft.network.play.server;

import net.minecraft.block.Block;
import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S23PacketBlockChange
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private Block lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public S23PacketBlockChange() {
    }

    public S23PacketBlockChange(int n, int n2, int n3, class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = class_13342.a_(n, n2, n3);
        this.IlIIIIIllllllIIlllIllllll = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readUnsignedByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = Block.lllIIIllIIIIlllIlIIllIIll(class_01812.readVarIntFromBuffer());
        this.IlIIIIIllllllIIlllIllllll = class_01812.readUnsignedByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeVarIntToBuffer(Block.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII));
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("type=%d, data=%d, x=%d, y=%d, z=%d", Block.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII), this.IlIIIIIllllllIIlllIllllll, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
    }

    public Block IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
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
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}
