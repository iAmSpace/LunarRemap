package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1864 {
    public final byte[] lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;

    public class_1864(byte[] arrby, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = arrby;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n + 4;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = n << this.IlIllllllIIlIIllllIIlIIIl | n3 << this.lllIlIIlIIIlIlIIIllIlllIl | n2;
        int n5 = n4 >> 1;
        int n6 = n4 & 1;
        return n6 == 0 ? this.lllIIIllIIIIlllIlIIllIIll[n5] & 0xF : this.lllIIIllIIIIlllIlIIllIIll[n5] >> 4 & 0xF;
    }
}

