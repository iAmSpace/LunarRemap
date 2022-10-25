package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0432 {
    private class_0339 lllIIIllIIIIlllIlIIllIIll;
    private float lllIlIIlIIIlIlIIIllIlllIl;
    private float IlIllllllIIlIIllllIIlIIIl;
    private boolean lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;
    private double IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0432(class_0339 class_03392) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2) {
        this.IlIIIIIllllllIIlllIllllll = class_15212.IlIIlllllIIlIlIlllllIllll;
        this.lIllllIIlIIIlIllllllIIIll = class_15212 instanceof class_1965 ? class_15212.llIIlIlIlllIIllIlIlllIllI + (double)class_15212.llIIllIllIlIIlIIllIllllll() : (class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + class_15212.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll) / 2.0;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_15212.IllIIIIllIIllIllIlllIlIIl;
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
        this.IlIllllllIIlIIllllIIlIIIl = f2;
        this.lIlllIlllIIIIlIIlllIllIII = true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2) {
        this.IlIIIIIllllllIIlllIllllll = d;
        this.lIllllIIlIIIlIllllllIIIll = d2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = d3;
        this.lllIlIIlIIIlIlIIIllIlllIl = f;
        this.IlIllllllIIlIIllllIIlIIIl = f2;
        this.lIlllIlllIIIIlIIlllIllIII = true;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIllllllllIIIlIlI = 0.0f;
        if (this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII = false;
            double d = this.IlIIIIIllllllIIlllIllllll - this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll;
            double d2 = this.lIllllIIlIIIlIllllllIIIll - (this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI + (double)this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll());
            double d3 = this.IIIllIIlIIIIIIlIlIIllIIlI - this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl;
            double d4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
            float f = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
            float f2 = (float)(-(Math.atan2(d2, d4) * 180.0 / Math.PI));
            this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIllllllllIIIlIlI = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlllIllllllllIIIlIlI, f2, this.IlIllllllIIlIIllllIIlIIIl);
            this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl, f, this.lllIlIIlIIIlIlIIIllIlllIl);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl, this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII, 10.0f);
        }
        float f = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl - this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII);
        if (!this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll()) {
            if (f < -75.0f) {
                this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl = this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII - 75.0f;
            }
            if (f > 75.0f) {
                this.lllIIIllIIIIlllIlIIllIIll.lIIllllIllIlllllIIllIllIl = this.lllIIIllIIIIlllIlIIllIIll.lllllIllllIIIIllIIlIlIlII + 75.0f;
            }
        }
    }

    private float lllIIIllIIIIlllIlIIllIIll(float f, float f2, float f3) {
        float f4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }
}

