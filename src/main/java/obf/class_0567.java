package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0567
extends class_0689 {
    public class_0567(long l, class_0689 class_06892) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = n >> 1;
        int n7 = n2 >> 1;
        int n8 = (n3 >> 1) + 2;
        int n9 = (n4 >> 1) + 2;
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n6, n7, n8, n9);
        int n10 = n8 - 1 << 1;
        int n11 = n9 - 1 << 1;
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n10 * n11);
        for (int i = 0; i < n9 - 1; ++i) {
            int n12;
            n5 = (i << 1) * n10;
            int n13 = arrn[n12 + 0 + (i + 0) * n8];
            int n14 = arrn[n12 + 0 + (i + 1) * n8];
            for (n12 = 0; n12 < n8 - 1; ++n12) {
                this.lllIIIllIIIIlllIlIIllIIll((long)(n12 + n6 << 1), (long)(i + n7 << 1));
                int n15 = arrn[n12 + 1 + (i + 0) * n8];
                int n16 = arrn[n12 + 1 + (i + 1) * n8];
                arrn2[n5] = n13;
                arrn2[n5++ + n10] = this.lllIIIllIIIIlllIlIIllIIll(n13, n14);
                arrn2[n5] = this.lllIIIllIIIIlllIlIIllIIll(n13, n15);
                arrn2[n5++ + n10] = this.lllIlIIlIIIlIlIIIllIlllIl(n13, n15, n14, n16);
                n13 = n15;
                n14 = n16;
            }
        }
        int[] arrn3 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (n5 = 0; n5 < n4; ++n5) {
            System.arraycopy(arrn2, (n5 + (n2 & 1)) * n10 + (n & 1), arrn3, n5 * n3, n3);
        }
        return arrn3;
    }

    public static class_0689 lllIIIllIIIIlllIlIIllIIll(long l, class_0689 class_06892, int n) {
        class_0689 class_06893 = class_06892;
        for (int i = 0; i < n; ++i) {
            class_06893 = new class_0567(l + (long)i, class_06893);
        }
        return class_06893;
    }
}

