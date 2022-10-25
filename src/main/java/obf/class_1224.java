package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1224 {
    public float[] lllIIIllIIIIlllIlIIllIIll = new float[256];
    public class_0672[] lllIlIIlIIIlIlIIIllIlllIl = new class_0672[256];
    public int IlIllllllIIlIIllllIIlIIIl;
    public int lIlllIlllIIIIlIIlllIllIII;
    public long IlIIIIIllllllIIlllIllllll;
    final /* synthetic */ class_2147 lIllllIIlIIIlIllllllIIIll;

    public class_1224(class_2147 class_21472, int n, int n2) {
        this.lIllllIIlIIIlIllllllIIIll = class_21472;
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        class_2147.lllIIIllIIIIlllIlIIllIIll(class_21472).lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n << 4, n2 << 4, 16, 16);
        class_2147.lllIIIllIIIIlllIlIIllIIll(class_21472).lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, n << 4, n2 << 4, 16, 16, false);
    }

    public class_0672 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIlIIlIIIlIlIIIllIlllIl[n & 0xF | (n2 & 0xF) << 4];
    }
}

