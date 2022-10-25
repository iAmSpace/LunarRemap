package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.Validate
 */
import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;
import org.apache.commons.lang3.Validate;

public class S29PacketSoundEffect
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl = Integer.MAX_VALUE;
    private int lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;

    public S29PacketSoundEffect() {
    }

    public S29PacketSoundEffect(String string, double d, double d2, double d3, float f, float f2) {
        Validate.notNull((Object)string, (String)"name", (Object[])new Object[0]);
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = (int)(d * 8.0);
        this.IlIllllllIIlIIllllIIlIIIl = (int)(d2 * 8.0);
        this.lIlllIlllIIIIlIIlllIllIII = (int)(d3 * 8.0);
        this.IlIIIIIllllllIIlllIllllll = f;
        this.lIllllIIlIIIlIllllllIIIll = (int)(f2 * 63.0f);
        if (this.lIllllIIlIIIlIllllllIIIll < 0) {
            this.lIllllIIlIIIlIllllllIIIll = 0;
        }
        if (this.lIllllIIlIIIlIllllllIIIll > 255) {
            this.lIllllIIlIIIlIllllllIIIll = 255;
        }
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(256);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.readInt();
        this.IlIllllllIIlIIllllIIlIIIl = class_01812.readInt();
        this.lIlllIlllIIIIlIIlllIllIII = class_01812.readInt();
        this.IlIIIIIllllllIIlllIllllll = class_01812.readFloat();
        this.lIllllIIlIIIlIllllllIIIll = class_01812.readUnsignedByte();
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.writeInt(this.lllIlIIlIIIlIlIIIllIlllIl);
        class_01812.writeInt(this.IlIllllllIIlIIllllIIlIIIl);
        class_01812.writeInt(this.lIlllIlllIIIIlIIlllIllIII);
        class_01812.writeFloat(this.IlIIIIIllllllIIlllIllllll);
        class_01812.writeByte(this.lIllllIIlIIIlIllllllIIIll);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public double lIlllIlllIIIIlIIlllIllIII() {
        return (float)this.lllIlIIlIIIlIlIIIllIlllIl / 8.0f;
    }

    public double IlIIIIIllllllIIlllIllllll() {
        return (float)this.IlIllllllIIlIIllllIIlIIIl / 8.0f;
    }

    public double lIllllIIlIIIlIllllllIIIll() {
        return (float)this.lIlllIlllIIIIlIIlllIllIII / 8.0f;
    }

    public float IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public float IllIIlllllllIIlIIlIIIIlIl() {
        return (float)this.lIllllIIlIIIlIllllllIIIll / 63.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

