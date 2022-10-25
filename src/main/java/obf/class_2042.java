package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.security.PrivateKey;
import java.security.PublicKey;
import javax.crypto.SecretKey;

public class class_2042
extends class_0703 {
    private byte[] lllIIIllIIIIlllIlIIllIIll = new byte[0];
    private byte[] lllIlIIlIIIlIlIIIllIlllIl = new byte[0];

    public class_2042() {
    }

    public class_2042(SecretKey secretKey, PublicKey publicKey, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = class_0936.lllIIIllIIIIlllIlIIllIIll(publicKey, secretKey.getEncoded());
        this.lllIlIIlIIIlIlIIIllIlllIl = class_0936.lllIIIllIIIIlllIlIIllIIll(publicKey, arrby);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_2042.lllIIIllIIIIlllIlIIllIIll(class_01812);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_2042.lllIIIllIIIIlllIlIIllIIll(class_01812);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_2042.lllIIIllIIIIlllIlIIllIIll(class_01812, this.lllIIIllIIIIlllIlIIllIIll);
        class_2042.lllIIIllIIIIlllIlIIllIIll(class_01812, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1647 class_16472) {
        class_16472.lllIIIllIIIIlllIlIIllIIll(this);
    }

    public SecretKey lllIIIllIIIIlllIlIIllIIll(PrivateKey privateKey) {
        return class_0936.lllIIIllIIIIlllIlIIllIIll(privateKey, this.lllIIIllIIIIlllIlIIllIIll);
    }

    public byte[] lllIlIIlIIIlIlIIIllIlllIl(PrivateKey privateKey) {
        return privateKey == null ? this.lllIlIIlIIIlIlIIIllIlllIl : class_0936.lllIlIIlIIIlIlIIIllIlllIl(privateKey, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1647)class_20752);
    }
}

