package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import java.util.Random;
import org.lwjgl.opengl.GL11;

public class class_0142
extends class_1603 {
    public void lllIIIllIIIIlllIlIIllIIll(class_0411 class_04112, double d, double d2, double d3, float f, float f2) {
        int n;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glDisable((int)3553);
        GL11.glDisable((int)2896);
        GL11.glEnable((int)3042);
        GL11.glBlendFunc((int)770, (int)1);
        double[] arrd = new double[8];
        double[] arrd2 = new double[8];
        double d4 = 0.0;
        double d5 = 0.0;
        Random random = new Random(class_04112.lllIIIllIIIIlllIlIIllIIll);
        for (n = 7; n >= 0; --n) {
            arrd[n] = d4;
            arrd2[n] = d5;
            d4 += (double)(random.nextInt(11) - 5);
            d5 += (double)(random.nextInt(11) - 5);
        }
        for (n = 0; n < 4; ++n) {
            Random random2 = new Random(class_04112.lllIIIllIIIIlllIlIIllIIll);
            for (int i = 0; i < 3; ++i) {
                int n2 = 7;
                int n3 = 0;
                if (i > 0) {
                    n2 = 7 - i;
                }
                if (i > 0) {
                    n3 = n2 - 2;
                }
                double d6 = arrd[n2] - d4;
                double d7 = arrd2[n2] - d5;
                for (int j = n2; j >= n3; --j) {
                    double d8 = d6;
                    double d9 = d7;
                    if (i == 0) {
                        d6 += (double)(random2.nextInt(11) - 5);
                        d7 += (double)(random2.nextInt(11) - 5);
                    } else {
                        d6 += (double)(random2.nextInt(31) - 15);
                        d7 += (double)(random2.nextInt(31) - 15);
                    }
                    class_08682.lllIIIllIIIIlllIlIIllIIll(5);
                    float f3 = 0.5f;
                    class_08682.lllIIIllIIIIlllIlIIllIIll(0.9f * f3, 0.9f * f3, 1.0f * f3, 0.3f);
                    double d10 = 0.1 + (double)n * 0.2;
                    if (i == 0) {
                        d10 *= (double)j * 0.1 + 1.0;
                    }
                    double d11 = 0.1 + (double)n * 0.2;
                    if (i == 0) {
                        d11 *= (double)(j - 1) * 0.1 + 1.0;
                    }
                    for (int k = 0; k < 5; ++k) {
                        double d12 = d + 0.5 - d10;
                        double d13 = d3 + 0.5 - d10;
                        if (k == 1 || k == 2) {
                            d12 += d10 * 2.0;
                        }
                        if (k == 2 || k == 3) {
                            d13 += d10 * 2.0;
                        }
                        double d14 = d + 0.5 - d11;
                        double d15 = d3 + 0.5 - d11;
                        if (k == 1 || k == 2) {
                            d14 += d11 * 2.0;
                        }
                        if (k == 2 || k == 3) {
                            d15 += d11 * 2.0;
                        }
                        class_08682.lllIIIllIIIIlllIlIIllIIll(d14 + d6, d2 + (double)(j * 16), d15 + d7);
                        class_08682.lllIIIllIIIIlllIlIIllIIll(d12 + d8, d2 + (double)((j + 1) * 16), d13 + d9);
                    }
                    class_08682.lllIIIllIIIIlllIlIIllIIll();
                }
            }
        }
        GL11.glDisable((int)3042);
        GL11.glEnable((int)2896);
        GL11.glEnable((int)3553);
    }

    protected ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_0411 class_04112) {
        return null;
    }

    @Override
    public ResourceLocation lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0411)class_15212);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0411)class_15212, d, d2, d3, f, f2);
    }
}

