package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_1368
implements class_1848 {
    private Random IIIllIllIIlIlIlIlIllllIIl;
    private class_1973 IllIIIllIIIIlIlIlIllIIlll;
    private class_1973 lIIIIlIlIIlllllIIllIIlIII;
    private class_1973 llIIlllIllIllllIIIlIIIIII;
    public class_1973 lllIIIllIIIIlllIlIIllIIll;
    public class_1973 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1334 llIIllIllIlIIlIIllIllllll;
    private double[] lllIIlIIIllllllIIIIlIlIlI;
    private class_0672[] IlIlllIIIIIIlIIllIIllIlll;
    double[] IlIllllllIIlIIllllIIlIIIl;
    double[] lIlllIlllIIIIlIIlllIllIII;
    double[] IlIIIIIllllllIIlllIllllll;
    double[] lIllllIIlIIIlIllllllIIIll;
    double[] IIIllIIlIIIIIIlIlIIllIIlI;
    int[][] IllIIlllllllIIlIIlIIIIlIl = new int[32][32];

    public class_1368(class_1334 class_13342, long l) {
        this.llIIllIllIlIIlIIllIllllll = class_13342;
        this.IIIllIllIIlIlIlIlIllllIIl = new Random(l);
        this.IllIIIllIIIIlIlIlIllIIlll = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
        this.lIIIIlIlIIlllllIIllIIlIII = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
        this.llIIlllIllIllllIIIlIIIIII = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 8);
        this.lllIIIllIIIIlllIlIIllIIll = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 10);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1973(this.IIIllIllIIlIlIlIlIllllIIl, 16);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, Block[] arrclass_0549, class_0672[] arrclass_0672) {
        int n3 = 2;
        int n4 = n3 + 1;
        int n5 = 33;
        int n6 = n3 + 1;
        this.lllIIlIIIllllllIIIIlIlIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI, n * n3, 0, n2 * n3, n4, n5, n6);
        for (int i = 0; i < n3; ++i) {
            for (int j = 0; j < n3; ++j) {
                for (int k = 0; k < 32; ++k) {
                    double d = 0.25;
                    double d2 = this.lllIIlIIIllllllIIIIlIlIlI[((i + 0) * n6 + j + 0) * n5 + k + 0];
                    double d3 = this.lllIIlIIIllllllIIIIlIlIlI[((i + 0) * n6 + j + 1) * n5 + k + 0];
                    double d4 = this.lllIIlIIIllllllIIIIlIlIlI[((i + 1) * n6 + j + 0) * n5 + k + 0];
                    double d5 = this.lllIIlIIIllllllIIIIlIlIlI[((i + 1) * n6 + j + 1) * n5 + k + 0];
                    double d6 = (this.lllIIlIIIllllllIIIIlIlIlI[((i + 0) * n6 + j + 0) * n5 + k + 1] - d2) * d;
                    double d7 = (this.lllIIlIIIllllllIIIIlIlIlI[((i + 0) * n6 + j + 1) * n5 + k + 1] - d3) * d;
                    double d8 = (this.lllIIlIIIllllllIIIIlIlIlI[((i + 1) * n6 + j + 0) * n5 + k + 1] - d4) * d;
                    double d9 = (this.lllIIlIIIllllllIIIIlIlIlI[((i + 1) * n6 + j + 1) * n5 + k + 1] - d5) * d;
                    for (int i2 = 0; i2 < 4; ++i2) {
                        double d10 = 0.125;
                        double d11 = d2;
                        double d12 = d3;
                        double d13 = (d4 - d2) * d10;
                        double d14 = (d5 - d3) * d10;
                        for (int i3 = 0; i3 < 8; ++i3) {
                            int n7 = i3 + i * 8 << 11 | 0 + j * 8 << 7 | k * 4 + i2;
                            int n8 = 128;
                            double d15 = 0.125;
                            double d16 = d11;
                            double d17 = (d12 - d11) * d15;
                            for (int i4 = 0; i4 < 8; ++i4) {
                                Block class_05492 = null;
                                if (d16 > 0.0) {
                                    class_05492 = Blocks.IlIIIIIIllIIlIllIIllIllIl;
                                }
                                arrclass_0549[n7] = class_05492;
                                n7 += n8;
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

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, Block[] arrclass_0549, class_0672[] arrclass_0672) {
        for (int i = 0; i < 16; ++i) {
            for (int j = 0; j < 16; ++j) {
                int n3 = 1;
                int n4 = -1;
                Block class_05492 = Blocks.IlIIIIIIllIIlIllIIllIllIl;
                Block class_05493 = Blocks.IlIIIIIIllIIlIllIIllIllIl;
                for (int k = 127; k >= 0; --k) {
                    int n5 = (j * 16 + i) * 128 + k;
                    Block class_05494 = arrclass_0549[n5];
                    if (class_05494 != null && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                        if (class_05494 != Blocks.lllIlIIlIIIlIlIIIllIlllIl) continue;
                        if (n4 == -1) {
                            if (n3 <= 0) {
                                class_05492 = null;
                                class_05493 = Blocks.IlIIIIIIllIIlIllIIllIllIl;
                            }
                            n4 = n3;
                            if (k >= 0) {
                                arrclass_0549[n5] = class_05492;
                                continue;
                            }
                            arrclass_0549[n5] = class_05493;
                            continue;
                        }
                        if (n4 <= 0) continue;
                        --n4;
                        arrclass_0549[n5] = class_05493;
                        continue;
                    }
                    n4 = -1;
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
        this.IlIlllIIIIIIlIIllIIllIlll = this.llIIllIllIlIIlIIllIllllll.IIIllIllIIlIlIlIlIllllIIl().lllIlIIlIIIlIlIIIllIlllIl(this.IlIlllIIIIIIlIIllIIllIlll, n * 16, n2 * 16, 16, 16);
        this.lllIIIllIIIIlllIlIIllIIll(n, n2, arrclass_0549, this.IlIlllIIIIIIlIIllIIllIlll);
        this.lllIlIIlIIIlIlIIIllIlllIl(n, n2, arrclass_0549, this.IlIlllIIIIIIlIIllIIllIlll);
        class_0723 class_07232 = new class_0723(this.llIIllIllIlIIlIIllIllllll, arrclass_0549, n, n2);
        byte[] arrby = class_07232.lIIIIlIlIIlllllIIllIIlIII();
        for (int i = 0; i < arrby.length; ++i) {
            arrby[i] = (byte)this.IlIlllIIIIIIlIIllIIllIlll[i].lIlIllIIllIIIIlllIlIlllIl;
        }
        class_07232.lIlllIlllIIIIlIIlllIllIII();
        return class_07232;
    }

    private double[] lllIIIllIIIIlllIlIIllIIll(double[] arrd, int n, int n2, int n3, int n4, int n5, int n6) {
        if (arrd == null) {
            arrd = new double[n4 * n5 * n6];
        }
        double d = 684.412;
        double d2 = 684.412;
        this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, n, n3, n4, n6, 1.121, 1.121, 0.5);
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, n, n3, n4, n6, 200.0, 200.0, 0.5);
        this.IlIllllllIIlIIllllIIlIIIl = this.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, n, n2, n3, n4, n5, n6, (d *= 2.0) / 80.0, d2 / 160.0, d / 80.0);
        this.lIlllIlllIIIIlIIlllIllIII = this.IllIIIllIIIIlIlIlIllIIlll.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, n, n2, n3, n4, n5, n6, d, d2, d);
        this.IlIIIIIllllllIIlllIllllll = this.lIIIIlIlIIlllllIIllIIlIII.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, n, n2, n3, n4, n5, n6, d, d2, d);
        int n7 = 0;
        int n8 = 0;
        for (int i = 0; i < n4; ++i) {
            for (int j = 0; j < n6; ++j) {
                double d3;
                double d4 = (this.lIllllIIlIIIlIllllllIIIll[n8] + 256.0) / 512.0;
                if (d4 > 1.0) {
                    d4 = 1.0;
                }
                if ((d3 = this.IIIllIIlIIIIIIlIlIIllIIlI[n8] / 8000.0) < 0.0) {
                    d3 = -d3 * 0.3;
                }
                d3 = d3 * 3.0 - 2.0;
                float f = (float)(i + n - 0) / 1.0f;
                float f2 = (float)(j + n3 - 0) / 1.0f;
                float f3 = 100.0f - MathHelper.IlIllllllIIlIIllllIIlIIIl(f * f + f2 * f2) * 8.0f;
                if (f3 > 80.0f) {
                    f3 = 80.0f;
                }
                if (f3 < -100.0f) {
                    f3 = -100.0f;
                }
                if (d3 > 1.0) {
                    d3 = 1.0;
                }
                d3 /= 8.0;
                d3 = 0.0;
                if (d4 < 0.0) {
                    d4 = 0.0;
                }
                d4 += 0.5;
                d3 = d3 * (double)n5 / 16.0;
                ++n8;
                double d5 = (double)n5 / 2.0;
                for (int k = 0; k < n5; ++k) {
                    double d6;
                    double d7 = 0.0;
                    double d8 = ((double)k - d5) * 8.0 / d4;
                    if (d8 < 0.0) {
                        d8 *= -1.0;
                    }
                    double d9 = this.lIlllIlllIIIIlIIlllIllIII[n7] / 512.0;
                    double d10 = this.IlIIIIIllllllIIlllIllllll[n7] / 512.0;
                    double d11 = (this.IlIllllllIIlIIllllIIlIIIl[n7] / 10.0 + 1.0) / 2.0;
                    d7 = d11 < 0.0 ? d9 : (d11 > 1.0 ? d10 : d9 + (d10 - d9) * d11);
                    d7 -= 8.0;
                    d7 += (double)f3;
                    int n9 = 2;
                    if (k > n5 / 2 - n9) {
                        d6 = (float)(k - (n5 / 2 - n9)) / 64.0f;
                        if (d6 < 0.0) {
                            d6 = 0.0;
                        }
                        if (d6 > 1.0) {
                            d6 = 1.0;
                        }
                        d7 = d7 * (1.0 - d6) + -3000.0 * d6;
                    }
                    if (k < (n9 = 8)) {
                        d6 = (float)(n9 - k) / ((float)n9 - 1.0f);
                        d7 = d7 * (1.0 - d6) + -30.0 * d6;
                    }
                    arrd[n7] = d7;
                    ++n7;
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
        class_0351.llIlllIIllIlllIlIlIlIIIll = true;
        int n3 = n * 16;
        int n4 = n2 * 16;
        class_0672 class_06722 = this.llIIllIllIlIIlIIllIllllll.a_(n3 + 16, n4 + 16);
        class_06722.lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll, this.llIIllIllIlIIlIIllIllllll.lllllIlllIIllIlIIlIIIllII, n3, n4);
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
        class_0672 class_06722 = this.llIIllIllIlIIlIIllIllllll.a_(n, n3);
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
    }
}

