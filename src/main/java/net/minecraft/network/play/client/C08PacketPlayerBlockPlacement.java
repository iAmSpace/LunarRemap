package net.minecraft.network.play.client;

import net.minecraft.item.ItemStack;
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C08PacketPlayerBlockPlacement
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private ItemStack IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI;
    private float IllIIlllllllIIlIIlIIIIlIl;

    public C08PacketPlayerBlockPlacement() {
    }

    public C08PacketPlayerBlockPlacement(int n, int n2, int n3, int n4, ItemStack class_08972, float f, float f2, float f3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.IlIIIIIllllllIIlllIllllll = class_08972 != null ? class_08972.llIIlllIllIllllIIIlIIIIII() : null;
        this.lIllllIIlIIIlIllllllIIIll = f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f2;
        this.IllIIlllllllIIlIIlIIIIlIl = f3;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readInt();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readUnsignedByte();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readUnsignedByte();
        this.IlIIIIIllllllIIlllIllllll = class_01812.IlIllllllIIlIIllllIIlIIIl();
        this.lIllllIIlIIIlIllllllIIIll = (float)class_01812.readUnsignedByte() / 16.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (float)class_01812.readUnsignedByte() / 16.0f;
        this.IllIIlllllllIIlIIlIIIIlIl = (float)class_01812.readUnsignedByte() / 16.0f;
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeInt(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeByte(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte((int)(this.lIllllIIlIIIlIllllllIIIll * 16.0f));
        class_01812.writeByte((int)(this.IIIllIIlIIIIIIlIlIIllIIlI * 16.0f));
        class_01812.writeByte((int)(this.IllIIlllllllIIlIIlIIIIlIl * 16.0f));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
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

    public ItemStack IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public float IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public float IllIIIllIIIIlIlIlIllIIlll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

