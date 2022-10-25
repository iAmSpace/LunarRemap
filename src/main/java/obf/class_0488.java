package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0488
extends class_0689 {
    public class_0488(long l, class_0689 class_06892) {
        super(l);
        this.lllIIIllIIIIlllIlIIllIIll = class_06892;
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        int n5;
        int n6 = (n -= 2) >> 2;
        int n7 = (n2 -= 2) >> 2;
        int n8 = (n3 >> 2) + 2;
        int n9 = (n4 >> 2) + 2;
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n6, n7, n8, n9);
        int n10 = n8 - 1 << 2;
        int n11 = n9 - 1 << 2;
        int[] arrn2 = class_0256.lllIIIllIIIIlllIlIIllIIll(n10 * n11);
        for (int i = 0; i < n9 - 1; ++i) {
            int n12 = arrn[n5 + 0 + (i + 0) * n8];
            int n13 = arrn[n5 + 0 + (i + 1) * n8];
            for (n5 = 0; n5 < n8 - 1; ++n5) {
                double d = 3.6;
                this.lllIIIllIIIIlllIlIIllIIll((long)(n5 + n6 << 2), (long)(i + n7 << 2));
                double d2 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6;
                double d3 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6;
                this.lllIIIllIIIIlllIlIIllIIll((long)(n5 + n6 + 1 << 2), (long)(i + n7 << 2));
                double d4 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                double d5 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6;
                this.lllIIIllIIIIlllIlIIllIIll((long)(n5 + n6 << 2), (long)(i + n7 + 1 << 2));
                double d6 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6;
                double d7 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                this.lllIIIllIIIIlllIlIIllIIll((long)(n5 + n6 + 1 << 2), (long)(i + n7 + 1 << 2));
                double d8 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                double d9 = ((double)this.lllIIIllIIIIlllIlIIllIIll(1024) / 1024.0 - 0.5) * 3.6 + 4.0;
                int n14 = arrn[n5 + 1 + (i + 0) * n8] & 0xFF;
                int n15 = arrn[n5 + 1 + (i + 1) * n8] & 0xFF;
                for (int j = 0; j < 4; ++j) {
                    int n16 = ((i << 2) + j) * n10 + (n5 << 2);
                    for (int k = 0; k < 4; ++k) {
                        double d10 = ((double)j - d3) * ((double)j - d3) + ((double)k - d2) * ((double)k - d2);
                        double d11 = ((double)j - d5) * ((double)j - d5) + ((double)k - d4) * ((double)k - d4);
                        double d12 = ((double)j - d7) * ((double)j - d7) + ((double)k - d6) * ((double)k - d6);
                        double d13 = ((double)j - d9) * ((double)j - d9) + ((double)k - d8) * ((double)k - d8);
                        arrn2[n16++] = d10 < d11 && d10 < d12 && d10 < d13 ? n12 : (d11 < d10 && d11 < d12 && d11 < d13 ? n14 : (d12 < d10 && d12 < d11 && d12 < d13 ? n13 : n15));
                    }
                }
                n12 = n14;
                n13 = n15;
            }
        }
        int[] arrn3 = class_0256.lllIIIllIIIIlllIlIIllIIll(n3 * n4);
        for (n5 = 0; n5 < n4; ++n5) {
            System.arraycopy(arrn2, (n5 + (n2 & 3)) * n10 + (n & 3), arrn3, n5 * n3, n3);
        }
        return arrn3;
    }
}

