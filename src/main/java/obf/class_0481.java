package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_0481
implements class_1848 {
    private Random IIIllIllIIlIlIlIlIllllIIl;
    private class_1973 IllIIIllIIIIlIlIlIllIIlll;
    private class_1973 lIIIIlIlIIlllllIIllIIlIII;
    private class_1973 llIIlllIllIllllIIIlIIIIII;
    private class_1940 llIIllIllIlIIlIIllIllllll;
    public class_1973 lllIIIllIIIIlllIlIIllIIll;
    public class_1973 lllIlIIlIIIlIlIIIllIlllIl;
    public class_1973 IlIllllllIIlIIllllIIlIIIl;
    private class_1334 lllIIlIIIllllllIIIIlIlIlI;
    private final boolean IlIlllIIIIIIlIIllIIllIlll;
    private class_1074 IlIlIIlIlIllIIlIlIIllIIIl;
    private final double[] lllllIlllIIllIlIIlIIIllII;
    private final float[] IlIlIIlllIIlIllIIIlllllIl;
    private double[] lIIlIIIIIlIlllIlIIlIlIlll = new double[256];
    private class_1000 lIlIlIIlIIIIlIIIIIlllIIII = new class_1783();
    private class_0763 IlIIIlIIIIllIIIllIIIIIIll = new class_0763();
    private class_1430 IIlllIlIlllIllIIIlllIIlIl = new class_1430();
    private class_2096 lIlIllIIlIIlIIlIIlIIlIIll = new class_2096();
    private class_0638 llIIlIllIllllIlIIIIlIIlll = new class_0638();
    private class_1000 llIllllIlIllIIIlIllIIlIlI = new class_0725();
    private class_0672[] lIlllIlllIlIIIIlllIlIlIIl;
    double[] lIlllIlllIIIIlIIlllIllIII;
    double[] IlIIIIIllllllIIlllIllllll;
    double[] lIllllIIlIIIlIllllllIIIll;
    double[] IIIllIIlIIIIIIlIlIIllIIlI;
    int[][] IllIIlllllllIIlIIlIIIIlIl = new int[32][32];

    public class_0481(class_1334 class_13342, long l, boolean bl) {
        this.lllIIlIIIllllllIIIIlIlIlI = class_13342;
        this.IlIlllIIIIIIlIIllIIllIlll = bl;
        this.IlIlIIlIlIllIIlIlIIllIIIl = class_13342.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll();
        this.IIIllIllIIlIlIlIlIllllIIl = new Random(l);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
        this.llIIlllIllIllllIIIlIIIIII = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 8);
        this.llIIllIllIlIIlIIllIllllll = new class_1940(this.IIIllIllIIlIlIlIlIllllIIl, 4);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 10);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
        this.IlIllllllIIlIIllllIIlIIIl = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 8);
        this.lllllIlllIIllIlIIlIIIllII = new double[825];
        this.IlIlIIlllIIlIllIIIlllllIl = new float[25];
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                float f;
                this.IlIlIIlllIIlIllIIIlllllIl[i + 2 + (j + 2) * 5] = f = 10.0f / MathHelper.IlIllllllIIlIIllllIIlIIIl((float)(i * i + j * j) + 0.2f);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, Block[] arrclass_0549) {
        int n3 = 63;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIlIIIllllllIIIIlIlIlI.IIIllIllIIlIlIlIlIllllIIl().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIlIIIIlllIlIlIIl, n * 4 - 2, n2 * 4 - 2, 10, 10);
        this.lllIIIllIIIIlllIlIIllIIll(n * 4, 0, n2 * 4);
        for (int i = 0; i < 4; ++i) {
            int n4 = i * 5;
            int n5 = (i + 1) * 5;
            for (int j = 0; j < 4; ++j) {
                int n6 = (n4 + j) * 33;
                int n7 = (n4 + j + 1) * 33;
                int n8 = (n5 + j) * 33;
                int n9 = (n5 + j + 1) * 33;
                for (int k = 0; k < 32; ++k) {
                    double d = 0.125;
                    double d2 = this.lllllIlllIIllIlIIlIIIllII[n6 + k];
                    double d3 = this.lllllIlllIIllIlIIlIIIllII[n7 + k];
                    double d4 = this.lllllIlllIIllIlIIlIIIllII[n8 + k];
                    double d5 = this.lllllIlllIIllIlIIlIIIllII[n9 + k];
                    double d6 = (this.lllllIlllIIllIlIIlIIIllII[n6 + k + 1] - d2) * d;
                    double d7 = (this.lllllIlllIIllIlIIlIIIllII[n7 + k + 1] - d3) * d;
                    double d8 = (this.lllllIlllIIllIlIIlIIIllII[n8 + k + 1] - d4) * d;
                    double d9 = (this.lllllIlllIIllIlIIlIIIllII[n9 + k + 1] - d5) * d;
                    for (int i2 = 0; i2 < 8; ++i2) {
                        double d10 = 0.25;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 0; i3 < 4; ++i3) {
                            int n10 = i3 + i * 4 << 12 | 0 + j * 4 << 8 | k * 8 + i2;
                            int n11 = 256;
                            n10 -= n11;
                            double d15 = 0.25;
                            double d16 = (d12 - d11) * d15;
                            double d17 = d11 - d16;
                            for (int i4 = 0; i4 < 4; ++i4) {
                                double d18;
                                d17 += d16;
                                arrclass_0549[n10 += n11] = d18 > 0.0 ? Blocks.lllIlIIlIIIlIlIIIllIlllIl : (k * 8 + i2 < n3 ? Blocks.IllIIIllIIIIlIlIlIllIIlll : null);
                            }
                            d11 += d13;
                            d12 += d14;
                        }
                        d2 += d6;
                        d3 += d7;
                        d4 += d8;
                        d5 += d9;
                    }
                }
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, Block[] arrclass_0549, byte[] arrby, class_0672[] arrclass_0672) {
        double d = 0.03125;
        this.lIIlIIIIIlIlllIlIIlIlIlll = this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIIIlIlllIlIIlIlIlll, n * 16, n2 * 16, 16, 16, d * 2.0, d * 2.0, 1.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                class_0672 class_06722 = arrclass_0672[j + i * 16];
                class_06722.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, arrclass_0549, arrby, n * 16 + i, n2 * 16 + j, this.lIIlIIIIIlIlllIlIIlIlIlll[j + i * 16]);
            }
        }
    }

    @Override
    public class_0723 IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return this.lIlllIlllIIIIlIIlllIllIII(n, n2);
    }

    @Override
    public class_0723 lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        this.IIIllIllIIlIlIlIlIllllIIl.setSeed((long)n * 341873128712L + (long)n2 * 132897987541L);
        Block[] arrclass_0549 = new Block[65536];
        byte[] arrby = new byte[65536];
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, arrclass_0549);
        this.lIlllIlllIlIIIIlllIlIlIIl = this.lllIIlIIIllllllIIIIlIlIlI.IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl(this.lIlllIlllIlIIIIlllIlIlIIl, n * 16, n2 * 16, 16, 16);
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, arrclass_0549, arrby, this.lIlllIlllIlIIIIlllIlIlIIl);
        this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, arrclass_0549);
        this.llIllllIlIllIIIlIllIIlIlI.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, arrclass_0549);
        if (this.IlIlllIIIIIIlIIllIIllIlll) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, arrclass_0549);
            this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, arrclass_0549);
            this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, arrclass_0549);
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, arrclass_0549);
        }
        class_0723 class_07232 = new class_0723(this.lllIIlIIIllllllIIIIlIlIlI, arrclass_0549, arrby, n, n2);
        byte[] arrby2 = class_07232.lIIIIlIlIIlllllIIllIIlIII();
        for (int i = 0; i < arrby2.length; ++i) {
            arrby2[i] = (byte)this.lIlllIlllIlIIIIlllIlIlIIl[i].lIlIllIIllIIIIlllIlIlllIl;
        }
        class_07232.lIlllIlllIIIIlIIlllIllIII();
        return class_07232;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        double d = 684.412;
        double d2 = 684.412;
        double d3 = 512.0;
        double d4 = 512.0;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, n, n3, 5, 5, 200.0, 200.0, 0.5);
        this.lIlllIlllIIIIlIIlllIllIII = this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, n, n2, n3, 5, 33, 5, 8.555150000000001, 4.277575000000001, 8.555150000000001);
        this.IlIIIIIllllllIIlllIllllll = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n, n2, n3, 5, 33, 5, 684.412, 684.412, 684.412);
        this.lIllllIIlIIIlIllllllIIIll = this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, n, n2, n3, 5, 33, 5, 684.412, 684.412, 684.412);
        boolean bl = false;
        boolean bl2 = false;
        int n4 = 0;
        int n5 = 0;
        double d5 = 8.5;
        for (int i = 0; i < 5; ++i) {
            for (int j = 0; j < 5; ++j) {
                float f = 0.0f;
                float f2 = 0.0f;
                float f3 = 0.0f;
                int n6 = 2;
                class_0672 class_06722 = this.lIlllIlllIlIIIIlllIlIlIIl[i + 2 + (j + 2) * 10];
                for (int k = -n6; k <= n6; ++k) {
                    for (int i2 = -n6; i2 <= n6; ++i2) {
                        class_0672 class_06723 = this.lIlllIlllIlIIIIlllIlIlIIl[i + k + 2 + (j + i2 + 2) * 10];
                        float f4 = class_06723.llllIlIIllIIlllllIIllIIll;
                        float f5 = class_06723.IlIlIllIIlIIIIlllIlIllIlI;
                        if (this.IlIlIIlIlIllIIlIlIIllIIIl == class_1074.IlIIIIIllllllIIlllIllllll && f4 > 0.0f) {
                            f4 = 1.0f + f4 * 2.0f;
                            f5 = 1.0f + f5 * 4.0f;
                        }
                        float f6 = this.IlIlIIlllIIlIllIIIlllllIl[k + 2 + (i2 + 2) * 5] / (f4 + 2.0f);
                        if (class_06723.llllIlIIllIIlllllIIllIIll > class_06722.llllIlIIllIIlllllIIllIIll) {
                            f6 /= 2.0f;
                        }
                        f += f5 * f6;
                        f2 += f4 * f6;
                        f3 += f6;
                    }
                }
                f /= f3;
                f2 /= f3;
                f = f * 0.9f + 0.1f;
                f2 = (f2 * 4.0f - 1.0f) / 8.0f;
                double d6 = this.IIIllIIlIIIIIIlIlIIllIIlI[n5] / 8000.0;
                if (d6 < 0.0) {
                    d6 = -d6 * 0.3;
                }
                if ((d6 = d6 * 3.0 - 2.0) < 0.0) {
                    if ((d6 /= 2.0) < -1.0) {
                        d6 = -1.0;
                    }
                    d6 /= 1.4;
                    d6 /= 2.0;
                } else {
                    if (d6 > 1.0) {
                        d6 = 1.0;
                    }
                    d6 /= 8.0;
                }
                ++n5;
                double d7 = f2;
                double d8 = f;
                d7 += d6 * 0.2;
                d7 = d7 * 8.5 / 8.0;
                double d9 = 8.5 + d7 * 4.0;
                for (int k = 0; k < 33; ++k) {
                    double d10 = ((double)k - d9) * 12.0 * 128.0 / 256.0 / d8;
                    if (d10 < 0.0) {
                        d10 *= 4.0;
                    }
                    double d11 = this.IlIIIIIllllllIIlllIllllll[n4] / 512.0;
                    double d12 = this.lIllllIIlIIIlIllllllIIIll[n4] / 512.0;
                    double d13 = (this.lIlllIlllIIIIlIIlllIllIII[n4] / 10.0 + 1.0) / 2.0;
                    double d14 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(d11, d12, d13) - d10;
                    if (k > 29) {
                        double d15 = (float)(k - 29) / 3.0f;
                        d14 = d14 * (1.0 - d15) + -10.0 * d15;
                    }
                    this.lllllIlllIIllIlIIlIIIllII[n4] = d14;
                    ++n4;
                }
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1848 class_18482, int n, int n2) {
        int n3;
        int n4;
        int n5;
        class_0351.llIlllIIllIlllIlIlIlIIIll = true;
        int n6 = n * 16;
        int n7 = n2 * 16;
        class_0672 class_06722 = this.lllIIlIIIllllllIIIIlIlIlI.a_(n6 + 16, n7 + 16);
        this.IIIllIllIIlIlIlIlIllllIIl.setSeed(this.lllIIlIIIllllllIIIIlIlIlI.lIlIlIIlIIIIlIIIIIlllIIII());
        long l = this.IIIllIllIIlIlIlIlIllllIIl.nextLong() / 2L * 2L + 1L;
        long l2 = this.IIIllIllIIlIlIlIlIllllIIl.nextLong() / 2L * 2L + 1L;
        this.IIIllIllIIlIlIlIlIllllIIl.setSeed((long)n * l + (long)n2 * l2 ^ this.lllIIlIIIllllllIIIIlIlIlI.lIlIlIIlIIIIlIIIIIlllIIII());
        boolean bl = false;
        if (this.IlIlllIIIIIIlIIllIIllIlll) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n, n2);
            bl = this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n, n2);
            this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n, n2);
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n, n2);
        }
        if (class_06722 != class_0672.lllllIlllIIllIlIIlIIIllII && class_06722 != class_0672.llIIIlllIlllIlIllIIIIllIl && !bl && this.IIIllIllIIlIlIlIlIllllIIl.nextInt(4) == 0) {
            n5 = n6 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n4 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(256);
            n3 = n7 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_1206(Blocks.IllIIIllIIIIlIlIlIllIIlll).a_(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n5, n4, n3);
        }
        if (!bl && this.IIIllIllIIlIlIlIlIllllIIl.nextInt(8) == 0) {
            n5 = n6 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n4 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(this.IIIllIllIIlIlIlIlIllllIIl.nextInt(248) + 8);
            n3 = n7 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            if (n4 < 63 || this.IIIllIllIIlIlIlIlIllllIIl.nextInt(10) == 0) {
                new class_1206(Blocks.llIIlllIllIllllIIIlIIIIII).a_(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n5, n4, n3);
            }
        }
        for (n5 = 0; n5 < 8; ++n5) {
            n4 = n6 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n3 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(256);
            int n8 = n7 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_1672().a_(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n4, n3, n8);
        }
        class_06722.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, this.IIIllIllIIlIlIlIlIllllIIl, n6, n7);
        class_0907.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, class_06722, n6 + 8, n7 + 8, 16, 16, this.IIIllIllIIlIlIlIlIllllIIl);
        n6 += 8;
        n7 += 8;
        for (n5 = 0; n5 < 16; ++n5) {
            for (n4 = 0; n4 < 16; ++n4) {
                n3 = this.lllIIlIIIllllllIIIIlIlIlI.IllIIlllllllIIlIIlIIIIlIl(n6 + n5, n7 + n4);
                if (this.lllIIlIIIllllllIIIIlIlIlI.IlIlllIIIIIIlIIllIIllIlll(n5 + n6, n3 - 1, n4 + n7)) {
                    this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(n5 + n6, n3 - 1, n4 + n7, Blocks.IllIIllIlIlllIllIllIlIIIl, 0, 2);
                }
                if (!this.lllIIlIIIllllllIIIIlIlIlI.IlIIIIIllllllIIlllIllllll(n5 + n6, n3, n4 + n7, true)) continue;
                this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(n5 + n6, n3, n4 + n7, Blocks.lIIllIIlIIIlllIlllIIlIIlI, 0, 2);
            }
        }
        class_0351.llIlllIIllIlllIlIlIlIIIll = false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(boolean bl, class_1832 class_18322) {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return false;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return true;
    }

    @Override
    public String lIlllIlllIIIIlIIlllIllIII() {
        return "RandomLevelSource";
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122, int n, int n2, int n3) {
        class_0672 class_06722 = this.lllIIlIIIllllllIIIIlIlIlI.a_(n, n3);
        return class_10122 == class_1012.lllIIIllIIIIlllIlIIllIIll && this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3) ? this.llIIlIllIllllIlIIIIlIIlll.w_() : class_06722.lllIIIllIIIIlllIlIIllIIll(class_10122);
    }

    @Override
    public class_2137 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, String string, int n, int n2, int n3) {
        return "Stronghold".equals(string) && this.IlIIIlIIIIllIIIllIIIIIIll != null ? this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3) : null;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(int n, int n2) {
        if (this.IlIlllIIIIIIlIIllIIllIlll) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, null);
            this.IIlllIlIlllIllIIIlllIIlIl.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, null);
            this.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, null);
            this.llIIlIllIllllIlIIIIlIIlll.lllIIIllIIIIlllIlIIllIIll(this, this.lllIIlIIIllllllIIIIlIlIlI, n, n2, null);
        }
    }
}

