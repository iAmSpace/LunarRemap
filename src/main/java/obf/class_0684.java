package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0684
extends class_0689 {
    public class_0684(long l, class_0689 class_06892) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                arrn2[j + i * n3] = arrn[j + i * n3] > 0 ? this.lllIIIllIIIIlllIlIIllIIll(299999) + 2 : 0;
            }
        }
        return arrn2;
    }
}

