package obf;

import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1163 {
    public static final float[] lllIIIllIIIIlllIlIIllIIll = new float[]{1.0f, 0.75f, 0.5f, 0.25f, 0.0f, 0.25f, 0.5f, 0.75f};
    public class_1334 lllIlIIlIIIlIlIIIllIlllIl;
    public class_1074 IlIllllllIIlIIllllIIlIIIl;
    public String lIlllIlllIIIIlIIlllIllIII;
    public class_1076 IlIIIIIllllllIIlllIllllll;
    public boolean lIllllIIlIIIlIllllllIIIll;
    public boolean IIIllIIlIIIIIIlIlIIllIIlI;
    public float[] IllIIlllllllIIlIIlIIIIlIl = new float[16];
    public int IIIllIllIIlIlIlIlIllllIIl;
    private float[] IllIIIllIIIIlIlIlIllIIlll = new float[4];

    public final void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13342;
        this.IlIllllllIIlIIllllIIlIIIl = class_13342.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll();
        this.lIlllIlllIIIIlIIlllIllIII = class_13342.lIlllIlllIlIIIIlllIlIlIIl().llIllllIlIllIIIlIllIIlIlI();
        this.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    protected void lllIIIllIIIIlllIlIIllIIll() {
        float f = 0.0f;
        for (int i = 0; i <= 15; ++i) {
            float f2 = 1.0f - (float)i / 15.0f;
            this.IllIIlllllllIIlIIlIIIIlIl[i] = (1.0f - f2) / (f2 * 3.0f + 1.0f) * (1.0f - f) + f;
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll() == class_1074.IlIllllllIIlIIllllIIlIIIl) {
            class_0326 class_03262 = class_0326.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl().llIllllIlIllIIIlIllIIlIlI());
            this.IlIIIIIllllllIIlllIllllll = new class_2231(class_0672.lIlllIlllIIIIlIIlllIllIII(class_03262.lllIIIllIIIIlllIlIIllIIll()), 0.5f);
        } else {
            this.IlIIIIIllllllIIlllIllllll = new class_1076(this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    public class_1848 IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl == class_1074.IlIllllllIIlIIllllIIlIIIl ? new class_1933(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIlIIIIlIIIIIlllIIII(), this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl().lIIlIIIIIlIlllIlIIlIlIlll(), this.lIlllIlllIIIIlIIlllIllIII) : new class_0481(this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl.lIlIlIIlIIIIlIIIIIlllIIII(), this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl().lIIlIIIIIlIlllIlIIlIlIlll());
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(n, n2) == Blocks.IlIllllllIIlIIllllIIlIIIl;
    }

    public float lllIIIllIIIIlllIlIIllIIll(long l, float f) {
        int n = (int)(l % 24000L);
        float f2 = ((float)n + f) / 24000.0f - 0.25f;
        if (f2 < 0.0f) {
            f2 += 1.0f;
        }
        if (f2 > 1.0f) {
            f2 -= 1.0f;
        }
        float f3 = f2;
        f2 = 1.0f - (float)((Math.cos((double)f2 * Math.PI) + 1.0) / 2.0);
        f2 = f3 + (f2 - f3) / 3.0f;
        return f2;
    }

    public int lllIIIllIIIIlllIlIIllIIll(long l) {
        return (int)(l / 24000L % 8L + 8L) % 8;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return true;
    }

    public float[] lllIIIllIIIIlllIlIIllIIll(float f, float f2) {
        float f3;
        float f4 = 0.4f;
        float f5 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * (float)Math.PI * 2.0f) - 0.0f;
        if (f5 >= (f3 = -0.0f) - f4 && f5 <= f3 + f4) {
            float f6 = (f5 - f3) / f4 * 0.5f + 0.5f;
            float f7 = 1.0f - (1.0f - MathHelper.lllIIIllIIIIlllIlIIllIIll(f6 * (float)Math.PI)) * 0.99f;
            f7 *= f7;
            this.IllIIIllIIIIlIlIlIllIIlll[0] = f6 * 0.3f + 0.7f;
            this.IllIIIllIIIIlIlIlIllIIlll[1] = f6 * f6 * 0.7f + 0.2f;
            this.IllIIIllIIIIlIlIlIllIIlll[2] = f6 * f6 * 0.0f + 0.2f;
            this.IllIIIllIIIIlIlIlIllIIlll[3] = f7;
            return this.IllIIIllIIIIlIlIlIllIIlll;
        }
        return null;
    }

    public class_0864 lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        float f3 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f * (float)Math.PI * 2.0f) * 2.0f + 0.5f;
        if (f3 < 0.0f) {
            f3 = 0.0f;
        }
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        float f4 = 0.7529412f;
        float f5 = 0.84705883f;
        float f6 = 1.0f;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(f4 *= f3 * 0.94f + 0.06f, f5 *= f3 * 0.94f + 0.06f, f6 *= f3 * 0.91f + 0.09f);
    }

    public boolean IlIIIIIllllllIIlllIllllll() {
        return true;
    }

    public static class_1163 lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == -1 ? new class_1439() : (n == 0 ? new class_0997() : (n == 1 ? new class_1863() : null));
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return 128.0f;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return true;
    }

    public class_2208 IllIIlllllllIIlIIlIIIIlIl() {
        return null;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl == class_1074.IlIllllllIIlIIllllIIlIIIl ? 4 : 64;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.IlIllllllIIlIIllllIIlIIIl != class_1074.IlIllllllIIlIIllllIIlIIIl && !this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public double lIIIIlIlIIlllllIIllIIlIII() {
        return this.IlIllllllIIlIIllllIIlIIIl == class_1074.IlIllllllIIlIIllllIIlIIIl ? 1.0 : 0.03125;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return false;
    }

    public abstract String llIIlllIllIllllIIIlIIIIII();
}

