package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.security.PublicKey;

public class class_0201
extends class_0703 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private PublicKey lllIlIIlIIIlIlIIIllIlllIl;
    private byte[] IlIllllllIIlIIllllIIlIIIl;

    public class_0201() {
    }

    public class_0201(String string, PublicKey publicKey, byte[] arrby) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = publicKey;
        this.IlIllllllIIlIIllllIIlIIIl = arrby;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.IlIllllllIIlIIllllIIlIIIl(20);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_0936.lllIIIllIIIIlllIlIIllIIll(class_0201.lllIIIllIIIIlllIlIIllIIll(class_01812));
        this.IlIllllllIIlIIllllIIlIIIl = class_0201.lllIIIllIIIIlllIlIIllIIll(class_01812);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        class_0201.lllIIIllIIIIlllIlIIllIIll(class_01812, this.lllIlIIlIIIlIlIIIllIlllIl.getEncoded());
        class_0201.lllIIIllIIIIlllIlIIllIIll(class_01812, this.IlIllllllIIlIIllllIIlIIIl);
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
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0774)class_20752);
    }
}

