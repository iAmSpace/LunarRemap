package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S14PacketEntity
extends Packet {
    protected int lllIIIllIIIIlllIlIIllIIll;
    protected byte lllIlIIlIIIlIlIIIllIlllIl;
    protected byte IlIllllllIIlIIllllIIlIIIl;
    protected byte lIlllIlllIIIIlIIlllIllIII;
    protected byte IlIIIIIllllllIIlllIllllll;
    protected byte lIllllIIlIIIlIllllllIIIll;
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI;

    public S14PacketEntity() {
    }

    public S14PacketEntity(int n) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("id=%d", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public String toString() {
        return "Entity_" + super.toString();
    }

    public class_1521 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return class_13342.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public byte IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public byte lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public byte IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public byte lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public byte IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

