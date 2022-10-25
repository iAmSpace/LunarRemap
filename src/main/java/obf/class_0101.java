package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_0101 {
    private static int[][] IlIIIIIllllllIIlllIllllll = new int[][]{{1, 1, 0}, {-1, 1, 0}, {1, -1, 0}, {-1, -1, 0}, {1, 0, 1}, {-1, 0, 1}, {1, 0, -1}, {-1, 0, -1}, {0, 1, 1}, {0, -1, 1}, {0, 1, -1}, {0, -1, -1}};
    public static final double lllIIIllIIIIlllIlIIllIIll = Math.sqrt(3.0);
    private int[] lIllllIIlIIIlIllllllIIIll = new int[512];
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;
    private static final double IIIllIIlIIIIIIlIlIIllIIlI = 0.5 * (lllIIIllIIIIlllIlIIllIIll - 1.0);
    private static final double IllIIlllllllIIlIIlIIIIlIl = (3.0 - lllIIIllIIIIlllIlIIllIIll) / 6.0;

    public class_0101() {
        this(new Random());
    }

    public class_0101(Random random) {
        this.lllIlIIlIIIlIlIIIllIlllIl = random.nextDouble() * 256.0;
        this.IlIllllllIIlIIllllIIlIIIl = random.nextDouble() * 256.0;
        this.lIlllIlllIIIIlIIlllIllIII = random.nextDouble() * 256.0;
        int n = 0;
        while (n < 256) {
            this.lIllllIIlIIIlIllllllIIIll[n] = n++;
        }
        for (n = 0; n < 256; ++n) {
            int n2 = random.nextInt(256 - n) + n;
            int n3 = this.lIllllIIlIIIlIllllllIIIll[n];
            this.lIllllIIlIIIlIllllllIIIll[n] = this.lIllllIIlIIIlIllllllIIIll[n2];
            this.lIllllIIlIIIlIllllllIIIll[n2] = n3;
            this.lIllllIIlIIIlIllllllIIIll[n + 256] = this.lIllllIIlIIIlIllllllIIIll[n];
        }
    }

    private static int lllIIIllIIIIlllIlIIllIIll(double d) {
        return d > 0.0 ? (int)d : (int)d - 1;
    }

    private static double lllIIIllIIIIlllIlIIllIIll(int[] arrn, double d, double d2) {
        return (double)arrn[0] * d + (double)arrn[1] * d2;
    }

    public double lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        double d3;
        double d4;
        double d5;
        int n;
        int n2;
        double d6;
        double d7;
        double d8;
        int n3;
        double d9;
        double d10 = 0.5 * (lllIIIllIIIIlllIlIIllIIll - 1.0);
        double d11 = (d + d2) * d10;
        int n4 = class_0101.lllIIIllIIIIlllIlIIllIIll(d + d11);
        double d12 = (double)n4 - (d9 = (double)(n4 + (n3 = class_0101.lllIIIllIIIIlllIlIIllIIll(d2 + d11))) * (d8 = (3.0 - lllIIIllIIIIlllIlIIllIIll) / 6.0));
        double d13 = d - d12;
        if (d13 > (d7 = d2 - (d6 = (double)n3 - d9))) {
            n2 = 1;
            n = 0;
        } else {
            n2 = 0;
            n = 1;
        }
        double d14 = d13 - (double)n2 + d8;
        double d15 = d7 - (double)n + d8;
        double d16 = d13 - 1.0 + 2.0 * d8;
        double d17 = d7 - 1.0 + 2.0 * d8;
        int n5 = n4 & 0xFF;
        int n6 = n3 & 0xFF;
        int n7 = this.lIllllIIlIIIlIllllllIIIll[n5 + this.lIllllIIlIIIlIllllllIIIll[n6]] % 12;
        int n8 = this.lIllllIIlIIIlIllllllIIIll[n5 + n2 + this.lIllllIIlIIIlIllllllIIIll[n6 + n]] % 12;
        int n9 = this.lIllllIIlIIIlIllllllIIIll[n5 + 1 + this.lIllllIIlIIIlIllllllIIIll[n6 + 1]] % 12;
        double d18 = 0.5 - d13 * d13 - d7 * d7;
        if (d18 < 0.0) {
            d5 = 0.0;
        } else {
            d18 *= d18;
            d5 = d18 * d18 * class_0101.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll[n7], d13, d7);
        }
        double d19 = 0.5 - d14 * d14 - d15 * d15;
        if (d19 < 0.0) {
            d4 = 0.0;
        } else {
            d19 *= d19;
            d4 = d19 * d19 * class_0101.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll[n8], d14, d15);
        }
        double d20 = 0.5 - d16 * d16 - d17 * d17;
        if (d20 < 0.0) {
            d3 = 0.0;
        } else {
            d20 *= d20;
            d3 = d20 * d20 * class_0101.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll[n9], d16, d17);
        }
        return 70.0 * (d5 + d4 + d3);
    }

    public void lllIIIllIIIIlllIlIIllIIll(double[] arrd, double d, double d2, int n, int n2, double d3, double d4, double d5) {
        int n3 = 0;
        for (int i = 0; i < n2; ++i) {
            double d6 = (d2 + (double)i) * d4 + this.IlIllllllIIlIIllllIIlIIIl;
            for (int j = 0; j < n; ++j) {
                int n4;
                double d7;
                double d8;
                double d9;
                int n5;
                int n6;
                double d10;
                double d11;
                int n7;
                double d12;
                double d13 = (d + (double)j) * d3 + this.lllIlIIlIIIlIlIIIllIlllIl;
                double d14 = (d13 + d6) * IIIllIIlIIIIIIlIlIIllIIlI;
                int n8 = class_0101.lllIIIllIIIIlllIlIIllIIll(d13 + d14);
                double d15 = (double)n8 - (d12 = (double)(n8 + (n7 = class_0101.lllIIIllIIIIlllIlIIllIIll(d6 + d14))) * IllIIlllllllIIlIIlIIIIlIl);
                double d16 = d13 - d15;
                if (d16 > (d11 = d6 - (d10 = (double)n7 - d12))) {
                    n6 = 1;
                    n5 = 0;
                } else {
                    n6 = 0;
                    n5 = 1;
                }
                double d17 = d16 - (double)n6 + IllIIlllllllIIlIIlIIIIlIl;
                double d18 = d11 - (double)n5 + IllIIlllllllIIlIIlIIIIlIl;
                double d19 = d16 - 1.0 + 2.0 * IllIIlllllllIIlIIlIIIIlIl;
                double d20 = d11 - 1.0 + 2.0 * IllIIlllllllIIlIIlIIIIlIl;
                int n9 = n8 & 0xFF;
                int n10 = n7 & 0xFF;
                int n11 = this.lIllllIIlIIIlIllllllIIIll[n9 + this.lIllllIIlIIIlIllllllIIIll[n10]] % 12;
                int n12 = this.lIllllIIlIIIlIllllllIIIll[n9 + n6 + this.lIllllIIlIIIlIllllllIIIll[n10 + n5]] % 12;
                int n13 = this.lIllllIIlIIIlIllllllIIIll[n9 + 1 + this.lIllllIIlIIIlIllllllIIIll[n10 + 1]] % 12;
                double d21 = 0.5 - d16 * d16 - d11 * d11;
                if (d21 < 0.0) {
                    d9 = 0.0;
                } else {
                    d21 *= d21;
                    d9 = d21 * d21 * class_0101.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll[n11], d16, d11);
                }
                double d22 = 0.5 - d17 * d17 - d18 * d18;
                if (d22 < 0.0) {
                    d8 = 0.0;
                } else {
                    d22 *= d22;
                    d8 = d22 * d22 * class_0101.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll[n12], d17, d18);
                }
                double d23 = 0.5 - d19 * d19 - d20 * d20;
                if (d23 < 0.0) {
                    d7 = 0.0;
                } else {
                    d23 *= d23;
                    d7 = d23 * d23 * class_0101.lllIIIllIIIIlllIlIIllIIll(IlIIIIIllllllIIlllIllllll[n13], d19, d20);
                }
                int n14 = n4 = n3++;
                arrd[n14] = arrd[n14] + 70.0 * (d9 + d8 + d7) * d5;
            }
        }
    }
}

