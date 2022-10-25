package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1360
extends class_0689 {
    public class_1360(long l, class_0689 class_06892) {
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
                int n9;
                int n10 = arrn[j + 1 + (i + 1 - 1) * (n3 + 2)];
                int n11 = arrn[j + 1 + 1 + (i + 1) * (n3 + 2)];
                int n12 = arrn[j + 1 - 1 + (i + 1) * (n3 + 2)];
                int n13 = arrn[j + 1 + (i + 1 + 1) * (n3 + 2)];
                arrn2[j + i * n3] = n9 = arrn[j + 1 + (i + 1) * n7];
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                if (n9 != 0 || n10 != 0 || n11 != 0 || n12 != 0 || n13 != 0 || this.lllIIIllIIIIlllIlIIllIIll(2) != 0) continue;
                arrn2[j + i * n3] = 1;
            }
        }
        return arrn2;
    }
}

