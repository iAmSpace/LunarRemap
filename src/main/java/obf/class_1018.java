package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.lwjgl.opengl.GL11
 */
import net.minecraft.util.MathHelper;
import org.lwjgl.opengl.GL11;

public class class_1018 {
    private class_0744 lllIIIllIIIIlllIlIIllIIll = null;
    private int lllIlIIlIIIlIlIIIllIlllIl = 0;
    private int IlIllllllIIlIIllllIIlIIIl = 0;
    private float lIlllIlllIIIIlIIlllIllIII = 0.0f;
    private float IlIIIIIllllllIIlllIllllll = 0.0f;
    private float lIllllIIlIIIlIllllllIIIll = 0.0f;
    private int IIIllIIlIIIIIIlIlIIllIIlI = 0;
    private int IllIIlllllllIIlIIlIIIIlIl = 0;
    private int IIIllIllIIlIlIlIlIllllIIl = 0;
    private float IllIIIllIIIIlIlIlIllIIlll = 0.0f;
    private float lIIIIlIlIIlllllIIllIIlIII = 0.0f;
    private float llIIlllIllIllllIIIlIIIIII = 0.0f;
    private float llIIllIllIlIIlIIllIllllll = 0.0f;
    private float lllIIlIIIllllllIIIIlIlIlI = 0.0f;

    public class_1018(class_0744 class_07442, int n, int n2, float f, float f2, float f3, int n3, int n4, int n5, float f4) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07442;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = f;
        this.IlIIIIIllllllIIlllIllllll = f2;
        this.lIllllIIlIIIlIllllllIIIll = f3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n3;
        this.IllIIlllllllIIlIIlIIIIlIl = n4;
        this.IIIllIllIIlIlIlIlIllllIIl = n5;
        this.IllIIIllIIIIlIlIlIllIIlll = f4;
        this.lIIIIlIlIIlllllIIllIIlIII = (float)n / class_07442.lllIIIllIIIIlllIlIIllIIll;
        this.llIIlllIllIllllIIIlIIIIII = (float)n2 / class_07442.lllIlIIlIIIlIlIIIllIlllIl;
        this.llIIllIllIlIIlIIllIllllll = (float)(n + n3) / class_07442.lllIIIllIIIIlllIlIIllIIll;
        this.lllIIlIIIllllllIIIIlIlIlI = (float)(n2 + n4) / class_07442.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f) {
        GL11.glTranslatef((float)(this.lIlllIlllIIIIlIIlllIllIII * f), (float)(this.IlIIIIIllllllIIlllIllllll * f), (float)(this.lIllllIIlIIIlIllllllIIIll * f));
        float f2 = this.lIIIIlIlIIlllllIIllIIlIII;
        float f3 = this.llIIllIllIlIIlIIllIllllll;
        float f4 = this.llIIlllIllIllllIIIlIIIIII;
        float f5 = this.lllIIlIIIllllllIIIIlIlIlI;
        if (this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl) {
            f2 = this.llIIllIllIlIIlIIllIllllll;
            f3 = this.lIIIIlIlIIlllllIIllIIlIII;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.lIIlIIIIIlIlllIlIIlIlIlll) {
            f4 = this.lllIIlIIIllllllIIIIlIlIlI;
            f5 = this.llIIlllIllIllllIIIlIIIIII;
        }
        class_1018.lllIIIllIIIIlllIlIIllIIll(class_08682, f2, f4, f3, f5, this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, f * (float)this.IIIllIllIIlIlIlIlIllllIIl, this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl);
        GL11.glTranslatef((float)(-this.lIlllIlllIIIIlIIlllIllIII * f), (float)(-this.IlIIIIIllllllIIlllIllllll * f), (float)(-this.lIllllIIlIIIlIllllllIIIll * f));
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, int n, int n2, float f5, float f6, float f7) {
        float f8;
        float f9;
        float f10;
        int n3;
        if (f5 < 6.25E-4f) {
            f5 = 6.25E-4f;
        }
        float f11 = f3 - f;
        float f12 = f4 - f2;
        double d = MathHelper.IlIIIIIllllllIIlllIllllll(f11) * (f6 / 16.0f);
        double d2 = MathHelper.IlIIIIIllllllIIlllIllllll(f12) * (f7 / 16.0f);
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, -1.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0, f, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, 0.0, 0.0, f3, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d2, 0.0, f3, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, d2, 0.0, f, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 0.0f, 1.0f);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, d2, f5, f, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, d2, f5, f3, f4);
        class_08682.lllIIIllIIIIlllIlIIllIIll(d, 0.0, f5, f3, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, f5, f, f2);
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        float f13 = 0.5f * f11 / (float)n;
        float f14 = 0.5f * f12 / (float)n2;
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(-1.0f, 0.0f, 0.0f);
        for (n3 = 0; n3 < n; ++n3) {
            f10 = (float)n3 / (float)n;
            f9 = f + f11 * f10 + f13;
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f10 * d, 0.0, f5, f9, f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f10 * d, 0.0, 0.0, f9, f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f10 * d, d2, 0.0, f9, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f10 * d, d2, f5, f9, f4);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(1.0f, 0.0f, 0.0f);
        for (n3 = 0; n3 < n; ++n3) {
            f10 = (float)n3 / (float)n;
            f9 = f + f11 * f10 + f13;
            f8 = f10 + 1.0f / (float)n;
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f8 * d, d2, f5, f9, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f8 * d, d2, 0.0, f9, f4);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f8 * d, 0.0, 0.0, f9, f2);
            class_08682.lllIIIllIIIIlllIlIIllIIll((double)f8 * d, 0.0, f5, f9, f2);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, 1.0f, 0.0f);
        for (n3 = 0; n3 < n2; ++n3) {
            f10 = (float)n3 / (float)n2;
            f9 = f2 + f12 * f10 + f14;
            f8 = f10 + 1.0f / (float)n2;
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)f8 * d2, 0.0, f, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, (double)f8 * d2, 0.0, f3, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, (double)f8 * d2, f5, f3, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)f8 * d2, f5, f, f9);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
        class_08682.lllIlIIlIIIlIlIIIllIlllIl();
        class_08682.IlIllllllIIlIIllllIIlIIIl(0.0f, -1.0f, 0.0f);
        for (n3 = 0; n3 < n2; ++n3) {
            f10 = (float)n3 / (float)n2;
            f9 = f2 + f12 * f10 + f14;
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, (double)f10 * d2, 0.0, f3, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)f10 * d2, 0.0, f, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(0.0, (double)f10 * d2, f5, f, f9);
            class_08682.lllIIIllIIIIlllIlIIllIIll(d, (double)f10 * d2, f5, f3, f9);
        }
        class_08682.lllIIIllIIIIlllIlIIllIIll();
    }
}

