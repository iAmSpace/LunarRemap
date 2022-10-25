package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1912
extends class_0689 {
    public class_1912(long l, class_0689 class_06892) {
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
                int n9 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                int n10 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                int n11 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                int n12 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                int n13 = arrn[j + 1 + (i + 1) * n7];
                int n14 = 0;
                if (n9 == 0) {
                    ++n14;
                }
                if (n10 == 0) {
                    ++n14;
                }
                if (n11 == 0) {
                    ++n14;
                }
                if (n12 == 0) {
                    ++n14;
                }
                arrn2[j + i * n3] = n13 == 0 && n14 > 3 ? class_0672.lIlIIllllIlIIIIllIIIIlIIl.lIlIllIIllIIIIlllIlIlllIl : n13;
            }
        }
        return arrn2;
    }
}

