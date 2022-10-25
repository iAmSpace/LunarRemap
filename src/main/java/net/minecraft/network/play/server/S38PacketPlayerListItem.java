package net.minecraft.network.play.server;

import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class S38PacketPlayerListItem
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    public S38PacketPlayerListItem() {
    }

    public S38PacketPlayerListItem(String string, boolean bl, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
        this.IlIllllllIIlIIllllIIlIIIl = n;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(16);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readBoolean();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readShort();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeBoolean(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeShort(this.IlIllllllIIlIIllllIIlIIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
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

