package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import org.lwjgl.opengl.GL11;

public abstract class class_0164
extends class_1518 {
    public class_0164(class_1382 class_13822, float f) {
        super(class_13822, f);
    }

    protected boolean lllIlIIlIIIlIlIIIllIlllIl(class_0339 class_03392) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_03392) && (class_03392.IIIlIllIlllIlIIIlIlIIllII() || class_03392.IllIlIlIIIlIllIlIlIIlllII() && class_03392 == this.lllIlIIlIIIlIlIIIllIlllIl.IIIllIllIIlIlIlIlIllllIIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_03392, d, d2, d3, f, f2);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_03392, d, d2, d3, f, f2);
    }

    private double lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        return d + (d2 - d) * d3;
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0339 class_03392, double d, double d2, double d3, float f, float f2) {
        class_1521 class_15212 = class_03392.lIIIlllIlIIIlIllIIIlIllll();
        if (class_15212 != null) {
            float f3;
            int n;
            d2 -= (1.6 - (double)class_03392.lllIIIIlIlIIlIIlllIIIIIIl) * 0.5;
            class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
            double d4 = this.lllIIIllIIIIlllIlIIllIIll(class_15212.llllIIIIlIIIlIIIIIIlIllll, (double)class_15212.IIIIlIllIlIIlIIlIllIlIlll, (double)(f2 * 0.5f)) * 0.01745329238474369;
            double d5 = this.lllIIIllIIIIlllIlIIllIIll(class_15212.llIIIIllIIIIIIIlIIIlIIIIl, (double)class_15212.IlIlIIlllIllllllllIIIlIlI, (double)(f2 * 0.5f)) * 0.01745329238474369;
            double d6 = Math.cos(d4);
            double d7 = Math.sin(d4);
            double d8 = Math.sin(d5);
            if (class_15212 instanceof class_1309) {
                d6 = 0.0;
                d7 = 0.0;
                d8 = -1.0;
            }
            double d9 = Math.cos(d5);
            double d10 = this.lllIIIllIIIIlllIlIIllIIll(class_15212.llIIlIllIllllIlIIIIlIIlll, class_15212.IlIIlllllIIlIlIlllllIllll, (double)f2) - d6 * 0.7 - d7 * 0.5 * d9;
            double d11 = this.lllIIIllIIIIlllIlIIllIIll(class_15212.llIllllIlIllIIIlIllIIlIlI + (double)class_15212.llIIllIllIlIIlIIllIllllll() * 0.7, class_15212.llIIlIlIlllIIllIlIlllIllI + (double)class_15212.llIIllIllIlIIlIIllIllllll() * 0.7, (double)f2) - d8 * 0.5 - 0.25;
            double d12 = this.lllIIIllIIIIlllIlIIllIIll(class_15212.lIlllIlllIlIIIIlllIlIlIIl, class_15212.IllIIIIllIIllIllIlllIlIIl, (double)f2) - d7 * 0.7 + d6 * 0.5 * d9;
            double d13 = this.lllIIIllIIIIlllIlIIllIIll(class_03392.lIIllIlIllIlIlIIlIlIIIIll, (double)class_03392.lllllIllllIIIIllIIlIlIlII, (double)f2) * 0.01745329238474369 + 1.5707963267948966;
            d6 = Math.cos(d13) * (double)class_03392.IIIIlIlIIlIIIIlIlllIlIIII * 0.4;
            d7 = Math.sin(d13) * (double)class_03392.IIIIlIlIIlIIIIlIlllIlIIII * 0.4;
            double d14 = this.lllIIIllIIIIlllIlIIllIIll(class_03392.llIIlIllIllllIlIIIIlIIlll, class_03392.IlIIlllllIIlIlIlllllIllll, (double)f2) + d6;
            double d15 = this.lllIIIllIIIIlllIlIIllIIll(class_03392.llIllllIlIllIIIlIllIIlIlI, class_03392.llIIlIlIlllIIllIlIlllIllI, (double)f2);
            double d16 = this.lllIIIllIIIIlllIlIIllIIll(class_03392.lIlllIlllIlIIIIlllIlIlIIl, class_03392.IllIIIIllIIllIllIlllIlIIl, (double)f2) + d7;
            d += d6;
            d3 += d7;
            double d17 = (float)(d10 - d14);
            double d18 = (float)(d11 - d15);
            double d19 = (float)(d12 - d16);
            GL11.glDisable((int)3553);
            GL11.glDisable((int)2896);
            GL11.glDisable((int)2884);
            boolean bl = true;
            double d20 = 0.025;
            class_08682.lllIIIllIIIIlllIlIIllIIll(5);
            for (n = 0; n <= 24; ++n) {
                if (n % 2 == 0) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(0.5f, 0.4f, 0.3f, 1.0f);
                } else {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(0.35f, 0.28f, 0.21000001f, 1.0f);
                }
                f3 = (float)n / 24.0f;
                class_08682.lllIIIllIIIIlllIlIIllIIll(d + d17 * (double)f3 + 0.0, d2 + d18 * (double)(f3 * f3 + f3) * 0.5 + (double)((24.0f - (float)n) / 18.0f + 0.125f), d3 + d19 * (double)f3);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d + d17 * (double)f3 + 0.025, d2 + d18 * (double)(f3 * f3 + f3) * 0.5 + (double)((24.0f - (float)n) / 18.0f + 0.125f) + 0.025, d3 + d19 * (double)f3);
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            class_08682.lllIIIllIIIIlllIlIIllIIll(5);
            for (n = 0; n <= 24; ++n) {
                if (n % 2 == 0) {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(0.5f, 0.4f, 0.3f, 1.0f);
                } else {
                    class_08682.lllIIIllIIIIlllIlIIllIIll(0.35f, 0.28f, 0.21000001f, 1.0f);
                }
                f3 = (float)n / 24.0f;
                class_08682.lllIIIllIIIIlllIlIIllIIll(d + d17 * (double)f3 + 0.0, d2 + d18 * (double)(f3 * f3 + f3) * 0.5 + (double)((24.0f - (float)n) / 18.0f + 0.125f) + 0.025, d3 + d19 * (double)f3);
                class_08682.lllIIIllIIIIlllIlIIllIIll(d + d17 * (double)f3 + 0.025, d2 + d18 * (double)(f3 * f3 + f3) * 0.5 + (double)((24.0f - (float)n) / 18.0f + 0.125f), d3 + d19 * (double)f3 + 0.025);
            }
            class_08682.lllIIIllIIIIlllIlIIllIIll();
            GL11.glEnable((int)2896);
            GL11.glEnable((int)3553);
            GL11.glEnable((int)2884);
        }
    }

    @Override
    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        return this.lllIlIIlIIIlIlIIIllIlllIl((class_0339)class_19652);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0339)class_19652, d, d2, d3, f, f2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d, double d2, double d3, float f, float f2) {
        this.lllIIIllIIIIlllIlIIllIIll((class_0339)class_15212, d, d2, d3, f, f2);
    }
}

