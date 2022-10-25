package net.minecraft.network.play.server;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import obf.PacketBuffer;
import obf.INetHandlerPlayClient;
import net.minecraft.network.Packet;
import obf.INetHandler;
import org.apache.commons.lang3.ArrayUtils;

public class S3APacketTabComplete
extends Packet {
    private String[] lllIIIllIIIIlllIlIIllIIll;

    public S3APacketTabComplete() {
    }

    public S3APacketTabComplete(String[] arrstring) {
        this.lllIIIllIIIIlllIlIIllIIll = arrstring;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = new String[class_01812.readVarIntFromBuffer()];
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = class_01812.readStringFromBuffer(32767);
        }
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeVarIntToBuffer(this.lllIIIllIIIIlllIlIIllIIll.length);
        for (String string : this.lllIIIllIIIIlllIlIIllIIll) {
            class_01812.writeStringToBuffer(string);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(INetHandlerPlayClient class_05962) {
        class_05962.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String[] IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public String serialize() {
        return String.format("candidates='%s'", ArrayUtils.toString((Object)this.lllIIIllIIIIlllIlIIllIIll));
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((INetHandlerPlayClient)class_20752);
    }
}

