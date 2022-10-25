package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class class_0857 {
    protected static float lllIIIllIIIIlllIlIIllIIll = 0.0f;
    private static final double lllIlIIlIIIlIlIIIllIlllIl = 30.0;

    public static void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = 0.00390625f;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(f, f2 + (float)n2, lllIIIllIIIIlllIlIIllIIll, f3 * f5, (f4 + (float)n2) * f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f + (float)n, f2 + (float)n2, lllIIIllIIIIlllIlIIllIIll, (f3 + (float)n) * f5, (f4 + (float)n2) * f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f + (float)n, f2, lllIIIllIIIIlllIlIIllIIll, (f3 + (float)n) * f5, f4 * f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f, f2, lllIIIllIIIIlllIlIIllIIll, f3 * f5, f4 * f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, class_0321 class_03212) {
        int n5 = class_03212.IlIIIIIllllllIIlllIllllll();
        int n6 = n4 - n2;
        int n7 = n3 - n;
        int n8 = class_03212.lllIlIIlIIIlIlIIIllIlllIl() - n4;
        GL11.glScissor((int)(n * n5), (int)(n8 * n5), (int)(n7 * n5), (int)(n6 * n5));
    }

    public static void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, float f, float f2, float f3) {
        float f4 = f * 2.0f;
        float f5 = f * 2.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        GL11.glEnable((int)3042);
        Minecraft.getMinecraft().IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_17732);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)(f6 / f), (double)(f7 / f));
        GL11.glVertex2d((double)f2, (double)f3);
        GL11.glTexCoord2d((double)(f6 / f), (double)((f7 + f) / f));
        GL11.glVertex2d((double)f2, (double)(f3 + f5));
        GL11.glTexCoord2d((double)((f6 + f) / f), (double)((f7 + f) / f));
        GL11.glVertex2d((double)(f2 + f4), (double)(f3 + f5));
        GL11.glTexCoord2d((double)((f6 + f) / f), (double)(f7 / f));
        GL11.glVertex2d((double)(f2 + f4), (double)f3);
        GL11.glEnd();
        GL11.glDisable((int)3042);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(ResourceLocation class_17732, float f, float f2, float f3) {
        float f4 = f * 2.0f;
        float f5 = f * 2.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        GL11.glEnable((int)3042);
        Minecraft.getMinecraft().llIIlIIllIIllIlIIllIIllII().lllIIIllIIIIlllIlIIllIIll(class_17732);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)(f6 / f), (double)(f7 / f));
        GL11.glVertex2d((double)f2, (double)f3);
        GL11.glTexCoord2d((double)(f6 / f), (double)((f7 + f) / f));
        GL11.glVertex2d((double)f2, (double)(f3 + f5));
        GL11.glTexCoord2d((double)((f6 + f) / f), (double)((f7 + f) / f));
        GL11.glVertex2d((double)(f2 + f4), (double)(f3 + f5));
        GL11.glTexCoord2d((double)((f6 + f) / f), (double)(f7 / f));
        GL11.glVertex2d((double)(f2 + f4), (double)f3);
        GL11.glEnd();
        GL11.glDisable((int)3042);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(ResourceLocation class_17732, float f, float f2, float f3, float f4) {
        float f5 = f3 / 2.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        GL11.glEnable((int)3042);
        Minecraft.getMinecraft().IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_17732);
        GL11.glBegin((int)7);
        GL11.glTexCoord2d((double)(f6 / f5), (double)(f7 / f5));
        GL11.glVertex2d((double)f, (double)f2);
        GL11.glTexCoord2d((double)(f6 / f5), (double)((f7 + f5) / f5));
        GL11.glVertex2d((double)f, (double)(f2 + f4));
        GL11.glTexCoord2d((double)((f6 + f5) / f5), (double)((f7 + f5) / f5));
        GL11.glVertex2d((double)(f + f3), (double)(f2 + f4));
        GL11.glTexCoord2d((double)((f6 + f5) / f5), (double)(f7 / f5));
        GL11.glVertex2d((double)(f + f3), (double)f2);
        GL11.glEnd();
        GL11.glDisable((int)3042);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, float f, int n5) {
        int n6 = n4 - n2;
        int n7 = n3 - n;
        int n8 = n5 - n4;
        GL11.glScissor((int)((int)((float)n * f)), (int)((int)((float)n8 * f)), (int)((int)((float)n7 * f)), (int)((int)((float)n6 * f)));
    }

    public static void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, int n) {
        int n2;
        float f = (float)(n >> 24 & 0xFF) / 255.0f;
        float f2 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f3 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f4 = (float)(n & 0xFF) / 255.0f;
        GL11.glPushAttrib((int)0);
        GL11.glScaled((double)0.5, (double)0.5, (double)0.5);
        d *= 2.0;
        d2 *= 2.0;
        d3 *= 2.0;
        d4 *= 2.0;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glColor4f((float)f2, (float)f3, (float)f4, (float)f);
        GL11.glEnable((int)2848);
        GL11.glBegin((int)9);
        for (n2 = 0; n2 <= 90; n2 += 3) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Math.PI / 180.0) * (d5 * -1.0)), (double)(d2 + d5 + Math.cos((double)n2 * Math.PI / 180.0) * (d5 * -1.0)));
        }
        for (n2 = 90; n2 <= 180; n2 += 3) {
            GL11.glVertex2d((double)(d + d5 + Math.sin((double)n2 * Math.PI / 180.0) * (d5 * -1.0)), (double)(d4 - d5 + Math.cos((double)n2 * Math.PI / 180.0) * (d5 * -1.0)));
        }
        for (n2 = 0; n2 <= 90; n2 += 3) {
            GL11.glVertex2d((double)(d3 - d5 + Math.sin((double)n2 * Math.PI / 180.0) * d5), (double)(d4 - d5 + Math.cos((double)n2 * Math.PI / 180.0) * d5));
        }
        for (n2 = 90; n2 <= 180; n2 += 3) {
            GL11.glVertex2d((double)(d3 - d5 + Math.sin((double)n2 * Math.PI / 180.0) * d5), (double)(d2 + d5 + Math.cos((double)n2 * Math.PI / 180.0) * d5));
        }
        GL11.glEnd();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
        GL11.glScaled((double)2.0, (double)2.0, (double)2.0);
        GL11.glPopAttrib();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glBlendFunc((int)770, (int)771);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIIIllIIIIlllIlIIllIIll(6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d2, (double)lllIIIllIIIIlllIlIIllIIll);
        double d4 = Math.PI * 2;
        double d5 = d4 / 30.0;
        for (double d6 = -d5; d6 < d4; d6 += d5) {
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + d3 * Math.cos(-d6), d2 + d3 * Math.sin(-d6), (double)lllIIIllIIIIlllIlIIllIIll);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, int n, double d6) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        d5 = (d5 + (double)n) % (double)n;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        for (double d7 = 360.0 / (double)n * d5; d7 < 360.0 / (double)n * (d5 + d6); d7 += 1.0) {
            double d8 = d7 * Math.PI / 180.0;
            double d9 = (d7 - 1.0) * Math.PI / 180.0;
            double[] arrd = new double[]{Math.cos(d8) * d3, -Math.sin(d8) * d3, Math.cos(d9) * d3, -Math.sin(d9) * d3};
            double[] arrd2 = new double[]{Math.cos(d8) * d4, -Math.sin(d8) * d4, Math.cos(d9) * d4, -Math.sin(d9) * d4};
            class_08682.lllIIIllIIIIlllIlIIllIIll(7);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd2[0], d2 + arrd2[1], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd2[2], d2 + arrd2[3], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd[2], d2 + arrd[3], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd[0], d2 + arrd[1], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4, double d5, double d6) {
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        GL11.glEnable((int)2848);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        for (double d7 = d5; d7 < d6; d7 += 0.5) {
            double d8 = d7 * Math.PI / 180.0;
            double d9 = (d7 - 1.0) * Math.PI / 180.0;
            double[] arrd = new double[]{Math.cos(d8) * d3, -Math.sin(d8) * d3, Math.cos(d9) * d3, -Math.sin(d9) * d3};
            double[] arrd2 = new double[]{Math.cos(d8) * d4, -Math.sin(d8) * d4, Math.cos(d9) * d4, -Math.sin(d9) * d4};
            class_08682.lllIlIIlIIIlIlIIIllIlllIl();
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd2[0], d2 + arrd2[1], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd2[2], d2 + arrd2[3], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd[2], d2 + arrd[3], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d + arrd[0], d2 + arrd[1], 0.0);
            class_08682.lllIIIllIIIIlllIlIIllIIll();
        }
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
        GL11.glDisable((int)2848);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3553);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, int n) {
        if (f2 < f) {
            float f4 = f;
            f = f2;
            f2 = f4;
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f3, f2 + 1.0f, f3 + 1.0f, n);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, int n) {
        if (f3 < f2) {
            float f4 = f2;
            f2 = f3;
            f3 = f4;
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f2 + 1.0f, f + 1.0f, f3, n);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, float f4, int n, int n2) {
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        class_0210.lllIIIllIIIIlllIlIIllIIll((f *= 2.0f) + 1.0f, (f2 *= 2.0f) + 1.0f, (f3 *= 2.0f) - 1.0f, (f4 *= 2.0f) - 1.0f, n2);
        class_0857.lllIlIIlIIIlIlIIIllIlllIl(f, f2 + 1.0f, f4 - 2.0f, n);
        class_0857.lllIlIIlIIIlIlIIIllIlllIl(f3 - 1.0f, f2 + 1.0f, f4 - 2.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 2.0f, f3 - 3.0f, f2, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 2.0f, f3 - 3.0f, f4 - 1.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 1.0f, f + 1.0f, f2 + 1.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f3 - 2.0f, f3 - 2.0f, f2 + 1.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f3 - 2.0f, f3 - 2.0f, f4 - 2.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 1.0f, f + 1.0f, f4 - 2.0f, n);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, int n, int n2, int n3) {
        GL11.glScalef((float)0.5f, (float)0.5f, (float)0.5f);
        class_0210.lllIIIllIIIIlllIlIIllIIll((f *= 2.0f) + 1.0f, (f2 *= 2.0f) + 1.0f, (f3 *= 2.0f) - 1.0f, (f4 *= 2.0f) - 1.0f, n2, n3);
        class_0857.lllIlIIlIIIlIlIIIllIlllIl(f, f2 + 1.0f, f4 - 2.0f, n);
        class_0857.lllIlIIlIIIlIlIIIllIlllIl(f3 - 1.0f, f2 + 1.0f, f4 - 2.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 2.0f, f3 - 3.0f, f2, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 2.0f, f3 - 3.0f, f4 - 1.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 1.0f, f + 1.0f, f2 + 1.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f3 - 2.0f, f3 - 2.0f, f2 + 1.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f3 - 2.0f, f3 - 2.0f, f4 - 2.0f, n);
        class_0857.lllIIIllIIIIlllIlIIllIIll(f + 1.0f, f + 1.0f, f4 - 2.0f, n);
        GL11.glScalef((float)2.0f, (float)2.0f, (float)2.0f);
    }
}

