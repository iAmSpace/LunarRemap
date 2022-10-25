package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class class_0729
extends class_0492 {
    private int[] lIlllIlllIIIIlIIlllIllIII = new int[512];
    public double lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;
    private static final double[] IlIIIIIllllllIIlllIllllll = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] lIllllIIlIIIlIllllllIIIll = new double[]{1.0, 1.0, -1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0};
    private static final double[] IIIllIIlIIIIIIlIlIIllIIlI = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};
    private static final double[] IllIIlllllllIIlIIlIIIIlIl = new double[]{1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 1.0, -1.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, -1.0, 0.0};
    private static final double[] IIIllIllIIlIlIlIlIllllIIl = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, -1.0, -1.0, 1.0, 1.0, -1.0, -1.0, 0.0, 1.0, 0.0, -1.0};

    public class_0729() {
        this(new Random());
    }

    public class_0729(Random random) {
        this.lllIIIllIIIIlllIlIIllIIll = random.nextDouble() * 256.0;
        this.lllIlIIlIIIlIlIIIllIlllIl = random.nextDouble() * 256.0;
        this.IlIllllllIIlIIllllIIlIIIl = random.nextDouble() * 256.0;
        int n = 0;
        while (n < 256) {
            this.lIlllIlllIIIIlIIlllIllIII[n] = n++;
        }
        for (n = 0; n < 256; ++n) {
            int n2 = random.nextInt(256 - n) + n;
            int n3 = this.lIlllIlllIIIIlIIlllIllIII[n];
            this.lIlllIlllIIIIlIIlllIllIII[n] = this.lIlllIlllIIIIlIIlllIllIII[n2];
            this.lIlllIlllIIIIlIIlllIllIII[n2] = n3;
            this.lIlllIlllIIIIlIIlllIllIII[n + 256] = this.lIlllIlllIIIIlIIlllIllIII[n];
        }
    }

    public final double lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        return d2 + d * (d3 - d2);
    }

    public final double lllIIIllIIIIlllIlIIllIIll(int n, double d, double d2) {
        int n2 = n & 0xF;
        return IllIIlllllllIIlIIlIIIIlIl[n2] * d + IIIllIllIIlIlIlIlIllllIIl[n2] * d2;
    }

    public final double lllIIIllIIIIlllIlIIllIIll(int n, double d, double d2, double d3) {
        int n2 = n & 0xF;
        return IlIIIIIllllllIIlllIllllll[n2] * d + lIllllIIlIIIlIllllllIIIll[n2] * d2 + IIIllIIlIIIIIIlIlIIllIIlI[n2] * d3;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double[] arrd, double d, double d2, double d3, int n, int n2, int n3, double d4, double d5, double d6, double d7) {
        if (n2 == 1) {
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            double d8 = 0.0;
            double d9 = 0.0;
            int n4 = 0;
            double d10 = 1.0 / d7;
            for (int i = 0; i < n; ++i) {
                double d11 = d + (double)i * d4 + this.lllIIIllIIIIlllIlIIllIIll;
                int n5 = (int)d11;
                if (d11 < (double)n5) {
                    --n5;
                }
                int n6 = n5 & 0xFF;
                double d12 = (d11 -= (double)n5) * d11 * d11 * (d11 * (d11 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n3; ++j) {
                    int n7;
                    double d13 = d3 + (double)j * d6 + this.IlIllllllIIlIIllllIIlIIIl;
                    int n8 = (int)d13;
                    if (d13 < (double)n8) {
                        --n8;
                    }
                    int n9 = n8 & 0xFF;
                    double d14 = (d13 -= (double)n8) * d13 * d13 * (d13 * (d13 * 6.0 - 15.0) + 10.0);
                    int n10 = this.lIlllIlllIIIIlIIlllIllIII[n6] + 0;
                    int n11 = this.lIlllIlllIIIIlIIlllIllIII[n10] + n9;
                    int n12 = this.lIlllIlllIIIIlIIlllIllIII[n6 + 1] + 0;
                    int n13 = this.lIlllIlllIIIIlIIlllIllIII[n12] + n9;
                    d8 = this.lllIIIllIIIIlllIlIIllIIll(d12, this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n11], d11, d13), this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n13], d11 - 1.0, 0.0, d13));
                    d9 = this.lllIIIllIIIIlllIlIIllIIll(d12, this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n11 + 1], d11, 0.0, d13 - 1.0), this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n13 + 1], d11 - 1.0, 0.0, d13 - 1.0));
                    double d15 = this.lllIIIllIIIIlllIlIIllIIll(d14, d8, d9);
                    int n14 = n7 = n4++;
                    arrd[n14] = arrd[n14] + d15 * d10;
                }
            }
        } else {
            int n15 = 0;
            double d16 = 1.0 / d7;
            int n16 = -1;
            boolean bl = false;
            boolean bl5 = false;
            boolean bl6 = false;
            boolean bl7 = false;
            boolean bl8 = false;
            boolean bl9 = false;
            double d17 = 0.0;
            double d18 = 0.0;
            double d19 = 0.0;
            double d20 = 0.0;
            for (int i = 0; i < n; ++i) {
                double d21 = d + (double)i * d4 + this.lllIIIllIIIIlllIlIIllIIll;
                int n17 = (int)d21;
                if (d21 < (double)n17) {
                    --n17;
                }
                int n18 = n17 & 0xFF;
                double d22 = (d21 -= (double)n17) * d21 * d21 * (d21 * (d21 * 6.0 - 15.0) + 10.0);
                for (int j = 0; j < n3; ++j) {
                    double d23 = d3 + (double)j * d6 + this.IlIllllllIIlIIllllIIlIIIl;
                    int n19 = (int)d23;
                    if (d23 < (double)n19) {
                        --n19;
                    }
                    int n20 = n19 & 0xFF;
                    double d24 = (d23 -= (double)n19) * d23 * d23 * (d23 * (d23 * 6.0 - 15.0) + 10.0);
                    for (int k = 0; k < n2; ++k) {
                        int n21;
                        double d25 = d2 + (double)k * d5 + this.lllIlIIlIIIlIlIIIllIlllIl;
                        int n22 = (int)d25;
                        if (d25 < (double)n22) {
                            --n22;
                        }
                        int n23 = n22 & 0xFF;
                        double d26 = (d25 -= (double)n22) * d25 * d25 * (d25 * (d25 * 6.0 - 15.0) + 10.0);
                        if (k == 0 || n23 != n16) {
                            n16 = n23;
                            int n24 = this.lIlllIlllIIIIlIIlllIllIII[n18] + n23;
                            int n25 = this.lIlllIlllIIIIlIIlllIllIII[n24] + n20;
                            int n26 = this.lIlllIlllIIIIlIIlllIllIII[n24 + 1] + n20;
                            int n27 = this.lIlllIlllIIIIlIIlllIllIII[n18 + 1] + n23;
                            int n28 = this.lIlllIlllIIIIlIIlllIllIII[n27] + n20;
                            int n29 = this.lIlllIlllIIIIlIIlllIllIII[n27 + 1] + n20;
                            d17 = this.lllIIIllIIIIlllIlIIllIIll(d22, this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n25], d21, d25, d23), this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n28], d21 - 1.0, d25, d23));
                            d18 = this.lllIIIllIIIIlllIlIIllIIll(d22, this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n26], d21, d25 - 1.0, d23), this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n29], d21 - 1.0, d25 - 1.0, d23));
                            d19 = this.lllIIIllIIIIlllIlIIllIIll(d22, this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n25 + 1], d21, d25, d23 - 1.0), this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n28 + 1], d21 - 1.0, d25, d23 - 1.0));
                            d20 = this.lllIIIllIIIIlllIlIIllIIll(d22, this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n26 + 1], d21, d25 - 1.0, d23 - 1.0), this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII[n29 + 1], d21 - 1.0, d25 - 1.0, d23 - 1.0));
                        }
                        double d27 = this.lllIIIllIIIIlllIlIIllIIll(d26, d17, d18);
                        double d28 = this.lllIIIllIIIIlllIlIIllIIll(d26, d19, d20);
                        double d29 = this.lllIIIllIIIIlllIlIIllIIll(d24, d27, d28);
                        int n30 = n21 = n15++;
                        arrd[n30] = arrd[n30] + d29 * d16;
                    }
                }
            }
        }
    }
}

