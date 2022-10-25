package net.minecraft.network.play.client;

import net.minecraft.item.ItemStack;
import obf.PacketBuffer;
import net.minecraft.network.Packet;
import obf.class_1829;
import obf.INetHandler;

/*
 * Decompiled with CFR 0.150.
 */
public class C10PacketCreativeInventoryAction
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private ItemStack lllIlIIlIIIlIlIIIllIlllIl;

    public C10PacketCreativeInventoryAction() {
    }

    public C10PacketCreativeInventoryAction(int n, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08972 != null ? class_08972.llIIlllIllIllllIIIlIIIIII() : null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readShort();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeShort(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public ItemStack lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

