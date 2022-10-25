package net.minecraft.network.login.server;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.network.Packet;
import obf.*;

import java.io.IOException;
import java.security.PublicKey;

public class S01PacketEncryptionRequest
extends Packet {
    private String lllIIIllIIIIlllIlIIllIIll;
    private PublicKey lllIlIIlIIIlIlIIIllIlllIl;
    private byte[] IlIllllllIIlIIllllIIlIIIl;

    public S01PacketEncryptionRequest() {
    }

    public S01PacketEncryptionRequest(String string, PublicKey publicKey, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = publicKey;
        this.IlIllllllIIlIIllllIIlIIIl = arrby;
    }

    @Override
    public void readPacketData(PacketBuffer class_01812) throws IOException {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readStringFromBuffer(20);
        this.lllIlIIlIIIlIlIIIllIlllIl = CryptManager.lllIIIllIIIIlllIlIIllIIll(readBlob(class_01812));
        this.IlIllllllIIlIIllllIIlIIIl = readBlob(class_01812);
    }

    @Override
    public void writePacketData(PacketBuffer class_01812) {
        class_01812.writeStringToBuffer(this.lllIIIllIIIIlllIlIIllIIll);
        S01PacketEncryptionRequest.writeBlob(class_01812, this.lllIlIIlIIIlIlIIIllIlllIl.getEncoded());
        S01PacketEncryptionRequest.writeBlob(class_01812, this.IlIllllllIIlIIllllIIlIIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0774 class_07742) {
        class_07742.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public PublicKey lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public byte[] IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public void processPacket(INetHandler class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0774)class_20752);
    }
}

