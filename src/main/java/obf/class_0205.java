package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class class_0205
extends class_0688 {
    private byte[] lllIIIllIIIIlllIlIIllIIll = new byte[0];
    private byte[] IlIllllllIIlIIllllIIlIIIl = new byte[0];

    public class_0205(SecretKey secretKey, PublicKey publicKey, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = CryptManager.encryptData(publicKey, secretKey.getEncoded());
        this.IlIllllllIIlIIllllIIlIIIl = CryptManager.encryptData(publicKey, arrby);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(PacketBuffer class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll(class_01812, this.lllIIIllIIIIlllIlIIllIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_01812, this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(PacketBuffer class_01812) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1982 class_19822) {
    }
}

