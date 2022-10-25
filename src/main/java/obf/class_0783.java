package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0783 {
    public final byte[] lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;

    public class_0783(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = new byte[n >> 1];
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n2 + 4;
    }

    public class_0783(byte[] arrby, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = arrby;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n + 4;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = n2 << this.IlIllllllIIlIIllllIIlIIIl | n3 << this.lllIlIIlIIIlIlIIIllIlllIl | n;
        int n5 = n4 >> 1;
        int n6 = n4 & 1;
        return n6 == 0 ? this.lllIIIllIIIIlllIlIIllIIll[n5] & 0xF : this.lllIIIllIIIIlllIlIIllIIll[n5] >> 4 & 0xF;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = n2 << this.IlIllllllIIlIIllllIIlIIIl | n3 << this.lllIlIIlIIIlIlIIIllIlllIl | n;
        int n6 = n5 >> 1;
        int n7 = n5 & 1;
        this.lllIIIllIIIIlllIlIIllIIll[n6] = n7 == 0 ? (byte)(this.lllIIIllIIIIlllIlIIllIIll[n6] & 0xF0 | n4 & 0xF) : (byte)(this.lllIIIllIIIIlllIlIIllIIll[n6] & 0xF | (n4 & 0xF) << 4);
    }
}

