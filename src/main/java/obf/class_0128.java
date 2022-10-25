package obf;

import net.minecraft.client.Minecraft;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0128
extends class_0323 {
    private int IIIlIllllIIIlllllIllIlIII;
    private final class_1462 IIIIIllIlIllIlIlIIlIllIIl;
    private class_2145 lIIllIlIIlIIlllllIlIIllIl;
    boolean lllIIIllIIIIlllIlIIllIIll;

    public class_0128(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6, class_1462 class_14622, class_0775 class_07752) {
        super(class_13342, d, d2, d3, 0.0, 0.0, 0.0);
        this.IIIIIIIIlIllIIllIIlllIllI = d4;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5;
        this.llIIIlllIlllIlIllIIIIllIl = d6;
        this.IIIIIllIlIllIlIlIIlIllIIl = class_14622;
        this.IIIllIIlIIIIIIlIlIIllIIlI = 8;
        if (class_07752 != null) {
            this.lIIllIlIIlIIlllllIlIIllIl = class_07752.IlIllllllIIlIIllllIIlIIIl("Explosions", 10);
            if (this.lIIllIlIIlIIlllllIlIIllIl.lIlllIlllIIIIlIIlllIllIII() == 0) {
                this.lIIllIlIIlIIlllllIlIIllIl = null;
            } else {
                this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIIllIlIIlIIlllllIlIIllIl.lIlllIlllIIIIlIIlllIllIII() * 2 - 1;
                for (int i = 0; i < this.lIIllIlIIlIIlllllIlIIllIl.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                    class_0775 class_07753 = this.lIIllIlIIlIIlllllIlIIllIl.lllIlIIlIIIlIlIIIllIlllIl(i);
                    if (!class_07753.lllIIlIIIllllllIIIIlIlIlI("Flicker")) continue;
                    this.lllIIIllIIIIlllIlIIllIIll = true;
                    this.IIIllIIlIIIIIIlIlIIllIIlI += 15;
                    break;
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
    }

    @Override
    public void s_() {
        Object object;
        int n;
        boolean bl;
        if (this.IIIlIllllIIIlllllIllIlIII == 0 && this.lIIllIlIIlIIlllllIlIIllIl != null) {
            bl = this.lllIIlIIIllllllIIIIlIlIlI();
            n = 0;
            if (this.lIIllIlIIlIIlllllIlIIllIl.lIlllIlllIIIIlIIlllIllIII() >= 3) {
                n = 1;
            } else {
                for (int i = 0; i < this.lIIllIlIIlIIlllllIlIIllIl.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                    class_0775 class_07752 = this.lIIllIlIIlIIlllllIlIIllIl.lllIlIIlIIIlIlIIIllIlllIl(i);
                    if (class_07752.lIlllIlllIIIIlIIlllIllIII("Type") != 1) continue;
                    n = 1;
                    break;
                }
            }
            object = "fireworks." + (n != 0 ? "largeBlast" : "blast") + (bl ? "_far" : "");
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, (String)object, 20.0f, 0.95f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.1f, true);
        }
        if (this.IIIlIllllIIIlllllIllIlIII % 2 == 0 && this.lIIllIlIIlIIlllllIlIIllIl != null && this.IIIlIllllIIIlllllIllIlIII / 2 < this.lIIllIlIIlIIlllllIlIIllIl.lIlllIlllIIIIlIIlllIllIII()) {
            n = this.IIIlIllllIIIlllllIllIlIII / 2;
            object = this.lIIllIlIIlIIlllllIlIIllIl.lllIlIIlIIIlIlIIIllIlllIl(n);
            byte by = ((class_0775)object).lIlllIlllIIIIlIIlllIllIII("Type");
            boolean bl2 = ((class_0775)object).lllIIlIIIllllllIIIIlIlIlI("Trail");
            boolean bl3 = ((class_0775)object).lllIIlIIIllllllIIIIlIlIlI("Flicker");
            int[] arrn = ((class_0775)object).llIIlllIllIllllIIIlIIIIII("Colors");
            int[] arrn2 = ((class_0775)object).llIIlllIllIllllIIIlIIIIII("FadeColors");
            if (by == 1) {
                this.lllIIIllIIIIlllIlIIllIIll(0.5, 4, arrn, arrn2, bl2, bl3);
            } else if (by == 2) {
                this.lllIIIllIIIIlllIlIIllIIll(0.5, new double[][]{{0.0, 1.0}, {0.3455, 0.309}, {0.9511, 0.309}, {0.3795918367346939, -0.12653061224489795}, {0.6122448979591837, -0.8040816326530612}, {0.0, -0.35918367346938773}}, arrn, arrn2, bl2, bl3, false);
            } else if (by == 3) {
                this.lllIIIllIIIIlllIlIIllIIll(0.5, new double[][]{{0.0, 0.2}, {0.2, 0.2}, {0.2, 0.6}, {0.6, 0.6}, {0.6, 0.2}, {0.2, 0.2}, {0.2, 0.0}, {0.4, 0.0}, {0.4, -0.6}, {0.2, -0.6}, {0.2, -0.4}, {0.0, -0.4}}, arrn, arrn2, bl2, bl3, true);
            } else if (by == 4) {
                this.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, bl2, bl3);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.25, 2, arrn, arrn2, bl2, bl3);
            }
            int n2 = arrn[0];
            float f = (float)((n2 & 0xFF0000) >> 16) / 255.0f;
            float f2 = (float)((n2 & 0xFF00) >> 8) / 255.0f;
            float f3 = (float)((n2 & 0xFF) >> 0) / 255.0f;
            class_0640 class_06402 = new class_0640(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            class_06402.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3);
            this.IIIIIllIlIllIlIlIIlIllIIl.lllIIIllIIIIlllIlIIllIIll(class_06402);
        }
        ++this.IIIlIllllIIIlllllIllIlIII;
        if (this.IIIlIllllIIIlllllIllIlIII > this.IIIllIIlIIIIIIlIlIIllIIlI) {
            if (this.lllIIIllIIIIlllIlIIllIIll) {
                bl = this.lllIIlIIIllllllIIIIlIlIlI();
                String string = "fireworks." + (bl ? "twinkle_far" : "twinkle");
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, string, 20.0f, 0.9f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.15f, true);
            }
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    private boolean lllIIlIIIllllllIIIIlIlIlI() {
        Minecraft class_06672 = Minecraft.getMinecraft();
        return class_06672 == null || class_06672.llIIlllIllIllllIIIlIIIIII == null || class_06672.llIIlllIllIllllIIIlIIIIII.lIllllIIlIIIlIllllllIIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl) >= 256.0;
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6, int[] arrn, int[] arrn2, boolean bl, boolean bl2) {
        class_1892 class_18922 = new class_1892(this.lIlIllIIlIIlIIlIIlIIlIIll, d, d2, d3, d4, d5, d6, this.IIIIIllIlIllIlIlIIlIllIIl);
        class_18922.lllIIIllIIIIlllIlIIllIIll(bl);
        class_18922.IlIllllllIIlIIllllIIlIIIl(bl2);
        int n = this.IlllIIlllllllIIllIlIllllI.nextInt(arrn.length);
        class_18922.lllIIIllIIIIlllIlIIllIIll(arrn[n]);
        if (arrn2 != null && arrn2.length > 0) {
            class_18922.IlIllllllIIlIIllllIIlIIIl(arrn2[this.IlllIIlllllllIIllIlIllllI.nextInt(arrn2.length)]);
        }
        this.IIIIIllIlIllIlIlIIlIllIIl.lllIIIllIIIIlllIlIIllIIll(class_18922);
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, int n, int[] arrn, int[] arrn2, boolean bl, boolean bl2) {
        double d2 = this.IlIIlllllIIlIlIlllllIllll;
        double d3 = this.llIIlIlIlllIIllIlIlllIllI;
        double d4 = this.IllIIIIllIIllIllIlllIlIIl;
        for (int i = -n; i <= n; ++i) {
            for (int j = -n; j <= n; ++j) {
                for (int k = -n; k <= n; ++k) {
                    double d5 = (double)j + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - this.IlllIIlllllllIIllIlIllllI.nextDouble()) * 0.5;
                    double d6 = (double)i + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - this.IlllIIlllllllIIllIlIllllI.nextDouble()) * 0.5;
                    double d7 = (double)k + (this.IlllIIlllllllIIllIlIllllI.nextDouble() - this.IlllIIlllllllIIllIlIllllI.nextDouble()) * 0.5;
                    double d8 = (double) MathHelper.lllIIIllIIIIlllIlIIllIIll(d5 * d5 + d6 * d6 + d7 * d7) / d + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.05;
                    this.lllIIIllIIIIlllIlIIllIIll(d2, d3, d4, d5 / d8, d6 / d8, d7 / d8, arrn, arrn2, bl, bl2);
                    if (i == -n || i == n || j == -n || j == n) continue;
                    k += n * 2 - 1;
                }
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(double d, double[][] arrd, int[] arrn, int[] arrn2, boolean bl, boolean bl2, boolean bl3) {
        double d2 = arrd[0][0];
        double d3 = arrd[0][1];
        this.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, d2 * d, d3 * d, 0.0, arrn, arrn2, bl, bl2);
        float f = this.IlllIIlllllllIIllIlIllllI.nextFloat() * (float)Math.PI;
        double d4 = bl3 ? 0.034 : 0.34;
        for (int i = 0; i < 3; ++i) {
            double d5 = (double)f + (double)((float)i * (float)Math.PI) * d4;
            double d6 = d2;
            double d7 = d3;
            for (int j = 1; j < arrd.length; ++j) {
                double d8 = arrd[j][0];
                double d9 = arrd[j][1];
                for (double d10 = 0.25; d10 <= 1.0; d10 += 0.25) {
                    double d11 = (d6 + (d8 - d6) * d10) * d;
                    double d12 = (d7 + (d9 - d7) * d10) * d;
                    double d13 = d11 * Math.sin(d5);
                    d11 *= Math.cos(d5);
                    for (double d14 = -1.0; d14 <= 1.0; d14 += 2.0) {
                        this.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, d11 * d14, d12, d13 * d14, arrn, arrn2, bl, bl2);
                    }
                }
                d6 = d8;
                d7 = d9;
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, boolean bl, boolean bl2) {
        double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.05;
        double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.05;
        for (int i = 0; i < 70; ++i) {
            double d3 = this.IIIIIIIIlIllIIllIIlllIllI * 0.5 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.15 + d;
            double d4 = this.llIIIlllIlllIlIllIIIIllIl * 0.5 + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.15 + d2;
            double d5 = this.IIlIIlIlIlIllIIlIlIIIIlll * 0.5 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.5;
            this.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, d3, d5, d4, arrn, arrn2, bl, bl2);
        }
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 0;
    }
}

