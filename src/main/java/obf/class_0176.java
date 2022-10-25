package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0176
implements class_1848 {
    private Random IIIllIllIIlIlIlIlIllllIIl;
    private class_1973 IllIIIllIIIIlIlIlIllIIlll;
    private class_1973 lIIIIlIlIIlllllIIllIIlIII;
    private class_1973 llIIlllIllIllllIIIlIIIIII;
    private class_1973 llIIllIllIlIIlIIllIllllll;
    private class_1973 lllIIlIIIllllllIIIIlIlIlI;
    public class_1973 lllIIIllIIIIlllIlIIllIIll;
    public class_1973 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1334 IlIlllIIIIIIlIIllIIllIlll;
    private double[] IlIlIIlIlIllIIlIlIIllIIIl;
    public class_1361 IlIllllllIIlIIllllIIlIIIl = new class_1361();
    private double[] lllllIlllIIllIlIIlIIIllII = new double[256];
    private double[] IlIlIIlllIIlIllIIIlllllIl = new double[256];
    private double[] lIIlIIIIIlIlllIlIIlIlIlll = new double[256];
    private class_1000 lIlIlIIlIIIIlIIIIIlllIIII = new class_0594();
    double[] lIlllIlllIIIIlIIlllIllIII;
    double[] IlIIIIIllllllIIlllIllllll;
    double[] lIllllIIlIIIlIllllllIIIll;
    double[] IIIllIIlIIIIIIlIlIIllIIlI;
    double[] IllIIlllllllIIlIIlIIIIlIl;

    public class_0176(class_1334 class_13342, long l) {
        this.IlIlllIIIIIIlIIllIIllIlll = class_13342;
        this.IIIllIllIIlIlIlIlIllllIIl = new Random(l);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
        this.llIIlllIllIllllIIIlIIIIII = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 8);
        this.llIIllIllIlIIlIIllIllllll = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 4);
        this.lllIIlIIIllllllIIIIlIlIlI = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 4);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 10);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, Block[] arrclass_0549) {
        int n3 = 4;
        int n4 = 32;
        int n5 = n3 + 1;
        int n6 = 17;
        int n7 = n3 + 1;
        this.IlIlIIlIlIllIIlIlIIllIIIl = this.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlIlIllIIlIlIIllIIIl, n * n3, 0, n2 * n3, n5, n6, n7);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < 16; ++k) {
                    double d = 0.125;
                    double d2 = this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 0) * n7 + j + 0) * n6 + k + 0];
                    double d3 = this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 0) * n7 + j + 1) * n6 + k + 0];
                    double d4 = this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 1) * n7 + j + 0) * n6 + k + 0];
                    double d5 = this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 1) * n7 + j + 1) * n6 + k + 0];
                    double d6 = (this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 0) * n7 + j + 0) * n6 + k + 1] - d2) * d;
                    double d7 = (this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 0) * n7 + j + 1) * n6 + k + 1] - d3) * d;
                    double d8 = (this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 1) * n7 + j + 0) * n6 + k + 1] - d4) * d;
                    double d9 = (this.IlIlIIlIlIllIIlIlIIllIIIl[((i + 1) * n7 + j + 1) * n6 + k + 1] - d5) * d;
                    for (int i2 = 0; i2 < 8; ++i2) {
                        double d10 = 0.25;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 0; i3 < 4; ++i3) {
                            int n8 = i3 + i * 4 << 11 | 0 + j * 4 << 7 | k * 8 + i2;
                            int n9 = 128;
                            double d15 = 0.25;
                            double d16 = d11;
                            double d17 = (d12 - d11) * d15;
                            for (int i4 = 0; i4 < 4; ++i4) {
                                Block class_05492 = null;
                                if (k * 8 + i2 < n4) {
                                    class_05492 = Blocks.llIIlllIllIllllIIIlIIIIII;
                                }
                                if (d16 > 0.0) {
                                    class_05492 = Blocks.lllllllIlIIlIlIIIlIlIIlll;
                                }
                                arrclass_0549[n8] = class_05492;
                                n8 += n9;
                                d16 += d17;
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

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, Block[] arrclass_0549) {
        int n3 = 64;
        double d = 0.03125;
        this.lllllIlllIIllIlIIlIIIllII = this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lllllIlllIIllIlIIlIIIllII, n * 16, n2 * 16, 0, 16, 16, 1, d, d, 1.0);
        this.IlIlIIlllIIlIllIIIlllllIl = this.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIIlIllIIIlllllIl, n * 16, 109, n2 * 16, 16, 1, 16, d, 1.0, d);
        this.lIIlIIIIIlIlllIlIIlIlIlll = this.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIIIlIlllIlIIlIlIlll, n * 16, n2 * 16, 0, 16, 16, 1, d * 2.0, d * 2.0, d * 2.0);
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                boolean bl = this.lllllIlllIIllIlIIlIIIllII[i + j * 16] + this.IIIllIllIIlIlIlIlIllllIIl.nextDouble() * 0.2 > 0.0;
                boolean bl2 = this.IlIlIIlllIIlIllIIIlllllIl[i + j * 16] + this.IIIllIllIIlIlIlIlIllllIIl.nextDouble() * 0.2 > 0.0;
                int n4 = (int)(this.lIIlIIIIIlIlllIlIIlIlIlll[i + j * 16] / 3.0 + 3.0 + this.IIIllIllIIlIlIlIlIllllIIl.nextDouble() * 0.25);
                int n5 = -1;
                Block class_05492 = Blocks.lllllllIlIIlIlIIIlIlIIlll;
                Block class_05493 = Blocks.lllllllIlIIlIlIIIlIlIIlll;
                for (int k = 127; k >= 0; --k) {
                    int n6 = (j * 16 + i) * 128 + k;
                    if (k < 127 - this.IIIllIllIIlIlIlIlIllllIIl.nextInt(5) && k > 0 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(5)) {
                        Block class_05494 = arrclass_0549[n6];
                        if (class_05494 != null && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                            if (class_05494 != Blocks.lllllllIlIIlIlIIIlIlIIlll) continue;
                            if (n5 == -1) {
                                if (n4 <= 0) {
                                    class_05492 = null;
                                    class_05493 = Blocks.lllllllIlIIlIlIIIlIlIIlll;
                                } else if (k >= n3 - 4 && k <= n3 + 1) {
                                    class_05492 = Blocks.lllllllIlIIlIlIIIlIlIIlll;
                                    class_05493 = Blocks.lllllllIlIIlIlIIIlIlIIlll;
                                    if (bl2) {
                                        class_05492 = Blocks.lllIIlIIIllllllIIIIlIlIlI;
                                        class_05493 = Blocks.lllllllIlIIlIlIIIlIlIIlll;
                                    }
                                    if (bl) {
                                        class_05492 = Blocks.llIllllIIIIIlIIlIlllIIlll;
                                        class_05493 = Blocks.llIllllIIIIIlIIlIlllIIlll;
                                    }
                                }
                                if (k < n3 && (class_05492 == null || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll)) {
                                    class_05492 = Blocks.llIIlllIllIllllIIIlIIIIII;
                                }
                                n5 = n4;
                                if (k >= n3 - 1) {
                                    arrclass_0549[n6] = class_05492;
                                    continue;
                                }
                                arrclass_0549[n6] = class_05493;
                                continue;
                            }
                            if (n5 <= 0) continue;
                            --n5;
                            arrclass_0549[n6] = class_05493;
                            continue;
                        }
                        n5 = -1;
                        continue;
                    }
                    arrclass_0549[n6] = Blocks.IllIIlllllllIIlIIlIIIIlIl;
                }
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
        Block[] arrclass_0549 = new Block[32768];
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, arrclass_0549);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, arrclass_0549);
        this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(this, this.IlIlllIIIIIIlIIllIIllIlll, n, n2, arrclass_0549);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this, this.IlIlllIIIIIIlIIllIIllIlll, n, n2, arrclass_0549);
        class_0723 class_07232 = new class_0723(this.IlIlllIIIIIIlIIllIIllIlll, arrclass_0549, n, n2);
        class_0672[] arrclass_0672 = this.IlIlllIIIIIIlIIllIIllIlll.IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl(null, n * 16, n2 * 16, 16, 16);
        byte[] arrby = class_07232.lIIIIlIlIIlllllIIllIIlIII();
        for (int i = 0; i < arrby.length; ++i) {
            arrby[i] = (byte)arrclass_0672[i].lIlIllIIllIIIIlllIlIlllIl;
        }
        class_07232.llIIlllIllIllllIIIlIIIIII();
        return class_07232;
    }

    private double[] lllIIIllIIIIlllIlIIllIIll(double[] arrd, int n, int n2, int n3, int n4, int n5, int n6) {
        int n7;
        if (arrd == null) {
            arrd = new double[n4 * n5 * n6];
        }
        double d = 684.412;
        double d2 = 2053.236;
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, n, n2, n3, n4, 1, n6, 1.0, 0.0, 1.0);
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, n, n2, n3, n4, 1, n6, 100.0, 0.0, 100.0);
        this.lIlllIlllIIIIlIIlllIllIII = this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, n, n2, n3, n4, n5, n6, d / 80.0, d2 / 60.0, d / 80.0);
        this.IlIIIIIllllllIIlllIllllll = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n, n2, n3, n4, n5, n6, d, d2, d);
        this.lIllllIIlIIIlIllllllIIIll = this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, n, n2, n3, n4, n5, n6, d, d2, d);
        int n8 = 0;
        int n9 = 0;
        double[] arrd2 = new double[n5];
        for (n7 = 0; n7 < n5; ++n7) {
            arrd2[n7] = Math.cos((double)n7 * Math.PI * 6.0 / (double)n5) * 2.0;
            double d3 = n7;
            if (n7 > n5 / 2) {
                d3 = n5 - 1 - n7;
            }
            if (!(d3 < 4.0)) continue;
            d3 = 4.0 - d3;
            int n10 = n7;
            arrd2[n10] = arrd2[n10] - d3 * d3 * d3 * 10.0;
        }
        for (n7 = 0; n7 < n4; ++n7) {
            for (int i = 0; i < n6; ++i) {
                double d4 = (this.IIIllIIlIIIIIIlIlIIllIIlI[n9] + 256.0) / 512.0;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                double d5 = 0.0;
                double d6 = this.IllIIlllllllIIlIIlIIIIlIl[n9] / 8000.0;
                if (d6 < 0.0) {
                    d6 = -d6;
                }
                if ((d6 = d6 * 3.0 - 3.0) < 0.0) {
                    if ((d6 /= 2.0) < -1.0) {
                        d6 = -1.0;
                    }
                    d6 /= 1.4;
                    d6 /= 2.0;
                    d4 = 0.0;
                } else {
                    if (d6 > 1.0) {
                        d6 = 1.0;
                    }
                    d6 /= 6.0;
                }
                d4 += 0.5;
                d6 = d6 * (double)n5 / 16.0;
                ++n9;
                for (int j = 0; j < n5; ++j) {
                    double d7;
                    double d8 = 0.0;
                    double d9 = arrd2[j];
                    double d10 = this.IlIIIIIllllllIIlllIllllll[n8] / 512.0;
                    double d11 = this.lIllllIIlIIIlIllllllIIIll[n8] / 512.0;
                    double d12 = (this.lIlllIlllIIIIlIIlllIllIII[n8] / 10.0 + 1.0) / 2.0;
                    d8 = d12 < 0.0 ? d10 : (d12 > 1.0 ? d11 : d10 + (d11 - d10) * d12);
                    d8 -= d9;
                    if (j > n5 - 4) {
                        d7 = (float)(j - (n5 - 4)) / 3.0f;
                        d8 = d8 * (1.0 - d7) + -10.0 * d7;
                    }
                    if ((double)j < d5) {
                        d7 = (d5 - (double)j) / 4.0;
                        if (d7 < 0.0) {
                            d7 = 0.0;
                        }
                        if (d7 > 1.0) {
                            d7 = 1.0;
                        }
                        d8 = d8 * (1.0 - d7) + -10.0 * d7;
                    }
                    arrd[n8] = d8;
                    ++n8;
                }
            }
        }
        return arrd;
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
        int n6;
        int n7;
        int n8;
        class_0351.llIlllIIllIlllIlIlIlIIIll = true;
        int n9 = n * 16;
        int n10 = n2 * 16;
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n, n2);
        for (n8 = 0; n8 < 8; ++n8) {
            n7 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n6 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(120) + 4;
            n5 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_1957(Blocks.lIIIIlIlIIlllllIIllIIlIII, false).a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n7, n6, n5);
        }
        n8 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(this.IIIllIllIIlIlIlIlIllllIIl.nextInt(10) + 1) + 1;
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n5 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(120) + 4;
            n4 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_0197().a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n6, n5, n4);
        }
        n8 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(this.IIIllIllIIlIlIlIlIllllIIl.nextInt(10) + 1);
        for (n7 = 0; n7 < n8; ++n7) {
            n6 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n5 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(120) + 4;
            n4 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_0862().a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n6, n5, n4);
        }
        for (n7 = 0; n7 < 10; ++n7) {
            n6 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n5 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(128);
            n4 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_1044().a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n6, n5, n4);
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl.nextInt(1) == 0) {
            n7 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n6 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(128);
            n5 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_1362(Blocks.lllIIIIIIlIlllIIlIlIIIllI).a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n7, n6, n5);
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl.nextInt(1) == 0) {
            n7 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            n6 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(128);
            n5 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16) + 8;
            new class_1362(Blocks.llIIlIIllIIllIlIIllIIllII).a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n7, n6, n5);
        }
        class_1580 class_15802 = new class_1580(Blocks.lIlIlIIllIlIIIIIlIIlllIlI, 13, Blocks.lllllllIlIIlIlIIIlIlIIlll);
        for (n6 = 0; n6 < 16; ++n6) {
            n5 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16);
            n4 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(108) + 10;
            n3 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16);
            class_15802.a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n5, n4, n3);
        }
        for (n6 = 0; n6 < 16; ++n6) {
            n5 = n9 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16);
            n4 = this.IIIllIllIIlIlIlIlIllllIIl.nextInt(108) + 10;
            n3 = n10 + this.IIIllIllIIlIlIlIlIllllIIl.nextInt(16);
            new class_1957(Blocks.lIIIIlIlIIlllllIIllIIlIII, true).a_(this.IlIlllIIIIIIlIIllIIllIlll, this.IIIllIllIIlIlIlIlIllllIIl, n5, n4, n3);
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
        return "HellRandomLevelSource";
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122, int n, int n2, int n3) {
        if (class_10122 == class_1012.lllIIIllIIIIlllIlIIllIIll) {
            if (this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) {
                return this.IlIllllllIIlIIllllIIlIIIl.v_();
            }
            if (this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) && this.IlIlllIIIIIIlIIllIIllIlll.a_(n, n2 - 1, n3) == Blocks.llIllIllIllIlIlIllIlIIIIl) {
                return this.IlIllllllIIlIIllllIIlIIIl.v_();
            }
        }
        class_0672 class_06722 = this.IlIlllIIIIIIlIIllIIllIlll.a_(n, n3);
        return class_06722.lllIIIllIIIIlllIlIIllIIll(class_10122);
    }

    @Override
    public class_2137 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, String string, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(int n, int n2) {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this, this.IlIlllIIIIIIlIIllIIllIlll, n, n2, null);
    }
}

