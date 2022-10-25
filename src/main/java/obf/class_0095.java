package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0095
extends class_0689 {
    public class_0095(long l, class_0689 class_06892) {
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
                int n9 = arrn[j + 0 + (i + 0) * n7];
                int n10 = arrn[j + 2 + (i + 0) * n7];
                int n11 = arrn[j + 0 + (i + 2) * n7];
                int n12 = arrn[j + 2 + (i + 2) * n7];
                int n13 = arrn[j + 1 + (i + 1) * n7];
                this.lllIIIllIIIIlllIlIIllIIll((long)(j + n), (long)(i + n2));
                if (n13 == 0 && (n9 != 0 || n10 != 0 || n11 != 0 || n12 != 0)) {
                    int n14 = 1;
                    int n15 = 1;
                    if (n9 != 0 && this.lllIIIllIIIIlllIlIIllIIll(n14++) == 0) {
                        n15 = n9;
                    }
                    if (n10 != 0 && this.lllIIIllIIIIlllIlIIllIIll(n14++) == 0) {
                        n15 = n10;
                    }
                    if (n11 != 0 && this.lllIIIllIIIIlllIlIIllIIll(n14++) == 0) {
                        n15 = n11;
                    }
                    if (n12 != 0 && this.lllIIIllIIIIlllIlIIllIIll(n14++) == 0) {
                        n15 = n12;
                    }
                    if (this.lllIIIllIIIIlllIlIIllIIll(3) == 0) {
                        arrn2[j + i * n3] = n15;
                        continue;
                    }
                    if (n15 == 4) {
                        arrn2[j + i * n3] = 4;
                        continue;
                    }
                    arrn2[j + i * n3] = 0;
                    continue;
                }
                if (n13 > 0 && (n9 == 0 || n10 == 0 || n11 == 0 || n12 == 0)) {
                    if (this.lllIIIllIIIIlllIlIIllIIll(5) == 0) {
                        if (n13 == 4) {
                            arrn2[j + i * n3] = 4;
                            continue;
                        }
                        arrn2[j + i * n3] = 0;
                        continue;
                    }
                    arrn2[j + i * n3] = n13;
                    continue;
                }
                arrn2[j + i * n3] = n13;
            }
        }
        return arrn2;
    }
}

