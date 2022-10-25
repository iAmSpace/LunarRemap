package net.minecraft.network.play.server;

import net.minecraft.network.Packet;
import net.minecraft.util.MathHelper;
import obf.*;

/*
 * Decompiled with CFR 0.150.
 */
public class S2CPacketSpawnGlobalEntity
extends Packet {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public S2CPacketSpawnGlobalEntity() {
    }

    public S2CPacketSpawnGlobalEntity(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212.llllllIlIllllIlIlIlIIIIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IlIIlllllIIlIlIlllllIllll * 32.0);
        this.IlIllllllIIlIIllllIIlIIIl = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.llIIlIlIlllIIllIlIlllIllI * 32.0);
        this.lIlllIlllIIIIlIIlllIllIII = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_15212.IllIIIIllIIllIllIlllIlIIl * 32.0);
        if (class_15212 instanceof class_0411) {
            this.IlIIIIIllllllIIlllIllllll = 1;
        }
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readVarIntFromBuffer();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readByte();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readInt();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeVarIntToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeByte(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeInt(this.lIlllIlllIIIIlIIlllIllIII);
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public String serialize() {
        return String.format("id=%d, type=%d, x=%.2f, y=%.2f, z=%.2f", this.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll, Float.valueOf((float)this.lllIlIIlIIIlIlIIIllIlllIl / 32.0f), Float.valueOf((float)this.IlIllllllIIlIIllllIIlIIIl / 32.0f), Float.valueOf((float)this.lIlllIlllIIIIlIIlllIllIII / 32.0f));
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

    public int IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

