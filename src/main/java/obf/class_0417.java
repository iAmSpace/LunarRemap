package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0417
extends class_0689 {
    public class_0417(long l, class_0689 class_06892) {
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
                int n9 = arrn[j + 0 + (i + 1) * n7];
                int n10 = arrn[j + 2 + (i + 1) * n7];
                int n11 = arrn[j + 1 + (i + 0) * n7];
                int n12 = arrn[j + 1 + (i + 2) * n7];
                int n13 = arrn[j + 1 + (i + 1) * n7];
                if (n9 == n10 && n11 == n12) {
                    this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                    n13 = this.lllIIIllIIIIlllIlIIllIIll(2) == 0 ? n9 : n11;
                } else {
                    if (n9 == n10) {
                        n13 = n9;
                    }
                    if (n11 == n12) {
                        n13 = n11;
                    }
                }
                arrn2[j + i * n3] = n13;
            }
        }
        return arrn2;
    }
}

