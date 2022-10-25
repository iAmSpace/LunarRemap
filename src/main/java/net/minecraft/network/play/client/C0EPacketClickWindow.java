package net.minecraft.network.play.client;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C0EPacketClickWindow
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private short lIlllIlllIIIIlIIlllIllIII;
    private ItemStack IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public C0EPacketClickWindow() {
    }

    public C0EPacketClickWindow(int n, int n2, int n3, int n4, ItemStack class_08972, short s) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.IlIIIIIllllllIIlllIllllll = class_08972 != null ? class_08972.llIIlllIllIllllIIIlIIIIII() : null;
        this.lIlllIlllIIIIlIIlllIllIII = s;
        this.lIllllIIlIIIlIllllllIIIll = n4;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readShort();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readByte();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readShort();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readByte();
        this.IlIIIIIllllllIIlllIllllll = class_01812.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeByte(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeShort(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeByte(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeShort(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public String serialize() {
        return this.IlIIIIIllllllIIlllIllllll != null ? String.format("id=%d, slot=%d, button=%d, type=%d, itemid=%d, itemcount=%d, itemaux=%d", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIllllIIlIIIlIllllllIIIll, Item.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll()), this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IllIIIllIIIIlIlIlIllIIlll()) : String.format("id=%d, slot=%d, button=%d, type=%d, itemid=-1", this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIllllIIlIIIlIllllllIIIll);
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

    public short lIllllIIlIIIlIllllllIIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public ItemStack IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IllIIlllllllIIlIIlIIIIlIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

