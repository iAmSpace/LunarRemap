package net.minecraft.network.play.client;

import net.minecraft.network.Packet;
import obf.*;

import java.io.IOException;

/*
 * Decompiled with CFR 0.150.
 */
public class C13PacketPlayerAbilities
extends Packet {
    private boolean lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;

    public C13PacketPlayerAbilities() {
    }

    public C13PacketPlayerAbilities(class_0372 class_03722) {
        this.lllIIIllIIIIlllIlIIllIIll(class_03722.lllIIIllIIIIlllIlIIllIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_03722.lllIlIIlIIIlIlIIIllIlllIl);
        this.IlIllllllIIlIIllllIIlIIIl(class_03722.IlIllllllIIlIIllllIIlIIIl);
        this.lIlllIlllIIIIlIIlllIllIII(class_03722.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_03722.lllIIIllIIIIlllIlIIllIIll());
        this.lllIlIIlIIIlIlIIIllIlllIl(class_03722.lllIlIIlIIIlIlIIIllIlllIl());
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        byte by = class_01812.readByte();
        this.lllIIIllIIIIlllIlIIllIIll((by & 1) > 0);
        this.lllIlIIlIIIlIlIIIllIlllIl((by & 2) > 0);
        this.IlIllllllIIlIIllllIIlIIIl((by & 4) > 0);
        this.lIlllIlllIIIIlIIlllIllIII((by & 8) > 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_01812.readFloat());
        this.lllIlIIlIIIlIlIIIllIlllIl(class_01812.readFloat());
    }

    @Override
    public void writePacketData(PacketBuffer p_148840_1_) throws IOException
    {
        byte var2 = 0;

        if (this.IlIllllllIIlIIllllIIlIIIl())
        {
            var2 = (byte)(var2 | 1);
        }

        if (this.lIlllIlllIIIIlIIlllIllIII())
        {
            var2 = (byte)(var2 | 2);
        }

        if (this.IlIIIIIllllllIIlllIllllll())
        {
            var2 = (byte)(var2 | 4);
        }

        if (this.lIllllIIlIIIlIllllllIIIll())
        {
            var2 = (byte)(var2 | 8);
        }

        p_148840_1_.writeByte(var2);
        p_148840_1_.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        p_148840_1_.writeFloat(this.lIllllIIlIIIlIllllllIIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("invuln=%b, flying=%b, canfly=%b, instabuild=%b, flyspeed=%.4f, walkspped=%.4f", this.IlIllllllIIlIIllllIIlIIIl(), this.lIlllIlllIIIIlIIlllIllIII(), this.IlIIIIIllllllIIlllIllllll(), this.lIllllIIlIIIlIllllllIIIll(), Float.valueOf(this.IIIllIIlIIIIIIlIlIIllIIlI()), Float.valueOf(this.IllIIlllllllIIlIIlIIIIlIl()));
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl = bl;
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = bl;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII = bl;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        this.IlIIIIIllllllIIlllIllllll = f;
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        this.lIllllIIlIIIlIllllllIIIll = f;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

