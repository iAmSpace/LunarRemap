package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1157 {
    private class_0339 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;

    public class_1157(class_0339 class_03392) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_03392.IlIIlllllIIlIlIlllllIllll;
        this.IlIllllllIIlIIllllIIlIIIl = class_03392.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIIIIlIIlllIllIII = class_03392.IllIIIIllIIllIllIlllIlIIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public double lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        this.IlIllllllIIlIIllllIIlIIIl = d2;
        this.lIlllIlllIIIIlIIlllIllIII = d3;
        this.IlIIIIIllllllIIlllIllllll = d4;
        this.lIllllIIlIIIlIllllllIIIll = true;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl(0.0f);
        if (this.lIllllIIlIIIlIllllllIIIll) {
            double d;
            this.lIllllIIlIIIlIllllllIIIll = false;
            double d2 = this.lllIlIIlIIIlIlIIIllIlllIl - this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll;
            int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5);
            double d3 = this.IlIllllllIIlIIllllIIlIIIl - (double)n;
            double d4 = d2 * d2 + d3 * d3 + (d = this.lIlllIlllIIIIlIIlllIllIII - this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl) * d;
            if (d4 >= 2.500000277905201E-7) {
                float f = (float)(Math.atan2(d, d2) * 180.0 / Math.PI) - 90.0f;
                this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll, f, 30.0f);
                this.lllIIIllIIIIlllIlIIllIIll.IIIllIllIIlIlIlIlIllllIIl((float)(this.IlIIIIIllllllIIlllIllllll * this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).IlIIIIIllllllIIlllIllllll()));
                if (d3 > 0.0 && d2 * d2 + d * d < 1.0) {
                    this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll().lllIIIllIIIIlllIlIIllIIll();
                }
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

