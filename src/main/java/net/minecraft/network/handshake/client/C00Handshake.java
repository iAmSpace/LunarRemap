package net.minecraft.network.handshake.client;

import net.minecraft.network.EnumConnectionState;
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.INetHandler;
import obf.class_2128;

/*
 * Decompiled with CFR 0.150.
 */
public class C00Handshake
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private String lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private EnumConnectionState lIlllIlllIIIIlIIlllIllIII;

    public C00Handshake() {
    }

    public C00Handshake(int n, String string, int n2, EnumConnectionState class_05462) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = class_05462;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readVarIntFromBuffer();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readStringFromBuffer(255);
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readUnsignedShort();
        this.lIlllIlllIIIIlIIlllIllIII = EnumConnectionState.func_150760_a(class_01812.readVarIntFromBuffer());
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeVarIntToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeStringToBuffer(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeShort(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeVarIntToBuffer(this.lIlllIlllIIIIlIIlllIllIII.func_150759_c());
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2128 class_21282) {
        class_21282.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public boolean hasPriority() {
        return true;
    }

    public EnumConnectionState IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_2128)class_20752);
    }
}

