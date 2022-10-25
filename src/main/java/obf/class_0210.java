package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.client.renderer.OpenGlHelper;
import org.lwjgl.opengl.GL11;

public class class_0210 {
    public static final ResourceLocation llIIlllIllIllllIIIlIIIIII = new ResourceLocation("textures/gui/options_background.png");
    public static final ResourceLocation llIIllIllIlIIlIIllIllllll = new ResourceLocation("textures/gui/container/stats_icons.png");
    public static final ResourceLocation lllIIlIIIllllllIIIIlIlIlI = new ResourceLocation("textures/gui/icons.png");
    protected static float IlIlllIIIIIIlIIllIIllIlll;

    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        if (n2 < n) {
            int n5 = n;
            n = n2;
            n2 = n5;
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll(n, n3, n2 + 1, n3 + 1, n4);
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        if (n3 < n2) {
            int n5 = n2;
            n2 = n3;
            n3 = n5;
        }
        class_0210.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n + 1, n3, n4);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        class_0210.lllIIIllIIIIlllIlIIllIIll(f + f5, f2 + f5, f3 - f5, f4 - f5, n2);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f2 + f5, f + f5, f4 - f5, n);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f3 - f5, f2 + f5, f3, f4 - f5, n);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f2 + f5, n);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f4 - f5, f3, f4, n);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3, float f4, float f5, int n, int n2) {
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f2, f3, f4, n2);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f - f5, f2 - f5, f, f4 + f5, n);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f3, f2 - f5, f3 + f5, f4 + f5, n);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f2 - f5, f3, f2, n);
        class_0210.lllIIIllIIIIlllIlIIllIIll(f, f4, f3, f4 + f5, n);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, int n) {
        float f5;
        if (f < f3) {
            f5 = f;
            f = f3;
            f3 = f5;
        }
        if (f2 < f4) {
            f5 = f2;
            f2 = f4;
            f4 = f5;
        }
        float f6 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f8 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f9 = (float)(n & 0xFF) / 255.0f;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3553);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glColor4f((float)f7, (float)f8, (float)f9, (float)f6);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f4, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f3, (double)f4, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f3, (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f2, 0.0);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glEnable((int)3553);
        GL11.glDisable((int)3042);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3, float f4, int n, int n2) {
        float f5 = (float)(n >> 24 & 0xFF) / 255.0f;
        float f6 = (float)(n >> 16 & 0xFF) / 255.0f;
        float f7 = (float)(n >> 8 & 0xFF) / 255.0f;
        float f8 = (float)(n & 0xFF) / 255.0f;
        float f9 = (float)(n2 >> 24 & 0xFF) / 255.0f;
        float f10 = (float)(n2 >> 16 & 0xFF) / 255.0f;
        float f11 = (float)(n2 >> 8 & 0xFF) / 255.0f;
        float f12 = (float)(n2 & 0xFF) / 255.0f;
        GL11.glDisable((int)3553);
        GL11.glEnable((int)3042);
        GL11.glDisable((int)3008);
        OpenGlHelper.glBlendFunc(770, 771, 1, 0);
        GL11.glShadeModel((int)7425);
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(f6, f7, f8, f5);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f3, (double)f2, (double)IlIlllIIIIIIlIIllIIllIlll);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f2, (double)IlIlllIIIIIIlIIllIIllIlll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f10, f11, f12, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f, (double)f4, (double)IlIlllIIIIIIlIIllIIllIlll);
        class_08682.lllIIIllIIIIlllIlIIllIIll((double)f3, (double)f4, (double)IlIlllIIIIIIlIIllIIllIlll);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        GL11.glShadeModel((int)7424);
        GL11.glDisable((int)3042);
        GL11.glEnable((int)3008);
        GL11.glEnable((int)3553);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1854 class_18542, String string, int n, int n2, int n3) {
        class_18542.lllIIIllIIIIlllIlIIllIIll(string, (float)(n - class_18542.lllIIIllIIIIlllIlIIllIIll(string) / 2), (float)n2, n3);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1854 class_18542, String string, int n, int n2, int n3) {
        class_18542.lllIIIllIIIIlllIlIIllIIll(string, (float)n, (float)n2, n3);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        float f = 0.00390625f;
        float f2 = 0.00390625f;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + n6, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * f, (float)(n4 + n6) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + n6, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + n5) * f, (float)(n4 + n6) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + 0, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + n5) * f, (float)(n4 + 0) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, IlIlllIIIIIIlIIllIIllIlll, (float)(n3 + 0) * f, (float)(n4 + 0) * f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_2102 class_21022, int n3, int n4) {
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + n4, IlIlllIIIIIIlIIllIIllIlll, class_21022.IlIllllllIIlIIllllIIlIIIl(), class_21022.lIllllIIlIIIlIllllllIIIll());
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n3, n2 + n4, IlIlllIIIIIIlIIllIIllIlll, class_21022.lIlllIlllIIIIlIIlllIllIII(), class_21022.lIllllIIlIIIlIllllllIIIll());
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n3, n2 + 0, IlIlllIIIIIIlIIllIIllIlll, class_21022.lIlllIlllIIIIlIIlllIllIII(), class_21022.IlIIIIIllllllIIlllIllllll());
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, IlIlllIIIIIIlIIllIIllIlll, class_21022.IlIllllllIIlIIllllIIlIIIl(), class_21022.IlIIIIIllllllIIlllIllllll());
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f, float f2, int n3, int n4, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, n2 + n4, 0.0, f * f5, (f2 + (float)n4) * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n3, n2 + n4, 0.0, (f + (float)n3) * f5, (f2 + (float)n4) * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n3, n2, 0.0, (f + (float)n3) * f5, f2 * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, n2, 0.0, f * f5, f2 * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, float f, float f2, int n3, int n4, int n5, int n6, float f3, float f4) {
        float f5 = 1.0f / f3;
        float f6 = 1.0f / f4;
        class_0868 class_08682 = class_0868.IlIIIIIllllllIIlllIllllll;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, n2 + n6, 0.0, f * f5, (f2 + (float)n4) * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + n6, 0.0, (f + (float)n3) * f5, (f2 + (float)n4) * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n + n5, n2, 0.0, (f + (float)n3) * f5, f2 * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll(n, n2, 0.0, f * f5, f2 * f6);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }
}

