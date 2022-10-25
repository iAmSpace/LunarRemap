package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0578
extends class_0689 {
    public class_0578(long l, class_0689 class_06892) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5 = n - 1;
        int n6 = n2 - 1;
        int n7 = n3 + 2;
        int n8 = n4 + 2;
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n5, n6, n7, n8);
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n3; ++j) {
                int n9 = this.IlIllllllIIlIIllllIIlIIIl(arrn[j + 0 + (i + 1) * n7]);
                int n10 = this.IlIllllllIIlIIllllIIlIIIl(arrn[j + 2 + (i + 1) * n7]);
                int n11 = this.IlIllllllIIlIIllllIIlIIIl(arrn[j + 1 + (i + 0) * n7]);
                int n12 = this.IlIllllllIIlIIllllIIlIIIl(arrn[j + 1 + (i + 2) * n7]);
                int n13 = this.IlIllllllIIlIIllllIIlIIIl(arrn[j + 1 + (i + 1) * n7]);
                arrn2[j + i * n3] = n13 == n9 && n13 == n11 && n13 == n10 && n13 == n12 ? -1 : class_0672.IIlllIlIlllIllIIIlllIIlIl.lIlIllIIllIIIIlllIlIlllIl;
            }
        }
        return arrn2;
    }

    private int IlIllllllIIlIIllllIIlIIIl(int n) {
        return n >= 2 ? 2 + (n & 1) : n;
    }
}

