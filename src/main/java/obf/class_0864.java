package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0864 {
    public double lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;

    public static class_0864 lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        return new class_0864(d, d2, d3);
    }

    public class_0864(double d, double d2, double d3) {
        if (d == -0.0) {
            d = 0.0;
        }
        if (d2 == -0.0) {
            d2 = 0.0;
        }
        if (d3 == -0.0) {
            d3 = 0.0;
        }
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.IlIllllllIIlIIllllIIlIIIl = d3;
    }

    protected class_0864 lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
        this.IlIllllllIIlIIllllIIlIIIl = d3;
        return this;
    }

    public class_0864 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642) {
        return class_0864.lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl);
    }

    public class_0864 lllIIIllIIIIlllIlIIllIIll() {
        double d = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll * this.lllIIIllIIIIlllIlIIllIIll + this.lllIlIIlIIIlIlIIIllIlllIl * this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl * this.IlIllllllIIlIIllllIIlIIIl);
        return d < 1.0E-4 ? class_0864.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0) : class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll / d, this.lllIlIIlIIIlIlIIIllIlllIl / d, this.IlIllllllIIlIIllllIIlIIIl / d);
    }

    public double lllIlIIlIIIlIlIIIllIlllIl(class_0864 class_08642) {
        return this.lllIIIllIIIIlllIlIIllIIll * class_08642.lllIIIllIIIIlllIlIIllIIll + this.lllIlIIlIIIlIlIIIllIlllIl * class_08642.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl * class_08642.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_0864 IlIllllllIIlIIllllIIlIIIl(class_0864 class_08642) {
        return class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl * class_08642.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl * class_08642.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl * class_08642.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll * class_08642.IlIllllllIIlIIllllIIlIIIl, this.lllIIIllIIIIlllIlIIllIIll * class_08642.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl * class_08642.lllIIIllIIIIlllIlIIllIIll);
    }

    public class_0864 IlIllllllIIlIIllllIIlIIIl(double d, double d2, double d3) {
        return class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + d, this.lllIlIIlIIIlIlIIIllIlllIl + d2, this.IlIllllllIIlIIllllIIlIIIl + d3);
    }

    public double lIlllIlllIIIIlIIlllIllIII(class_0864 class_08642) {
        double d = class_08642.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        double d2 = class_08642.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = class_08642.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl;
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2 + d3 * d3);
    }

    public double IlIIIIIllllllIIlllIllllll(class_0864 class_08642) {
        double d = class_08642.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        double d2 = class_08642.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = class_08642.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl;
        return d * d + d2 * d2 + d3 * d3;
    }

    public double lIlllIlllIIIIlIIlllIllIII(double d, double d2, double d3) {
        double d4 = d - this.lllIIIllIIIIlllIlIIllIIll;
        double d5 = d2 - this.lllIlIIlIIIlIlIIIllIlllIl;
        double d6 = d3 - this.IlIllllllIIlIIllllIIlIIIl;
        return d4 * d4 + d5 * d5 + d6 * d6;
    }

    public double lllIlIIlIIIlIlIIIllIlllIl() {
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll * this.lllIIIllIIIIlllIlIIllIIll + this.lllIlIIlIIIlIlIIIllIlllIl * this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl * this.IlIllllllIIlIIllllIIlIIIl);
    }

    public class_0864 lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, double d) {
        double d2 = class_08642.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        double d3 = class_08642.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        double d4 = class_08642.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl;
        if (d2 * d2 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.lllIIIllIIIIlllIlIIllIIll) / d2;
        return d5 >= 0.0 && d5 <= 1.0 ? class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + d2 * d5, this.lllIlIIlIIIlIlIIIllIlllIl + d3 * d5, this.IlIllllllIIlIIllllIIlIIIl + d4 * d5) : null;
    }

    public class_0864 lllIlIIlIIIlIlIIIllIlllIl(class_0864 class_08642, double d) {
        double d2 = class_08642.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        double d3 = class_08642.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        double d4 = class_08642.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl;
        if (d3 * d3 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.lllIlIIlIIIlIlIIIllIlllIl) / d3;
        return d5 >= 0.0 && d5 <= 1.0 ? class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + d2 * d5, this.lllIlIIlIIIlIlIIIllIlllIl + d3 * d5, this.IlIllllllIIlIIllllIIlIIIl + d4 * d5) : null;
    }

    public class_0864 IlIllllllIIlIIllllIIlIIIl(class_0864 class_08642, double d) {
        double d2 = class_08642.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        double d3 = class_08642.lllIlIIlIIIlIlIIIllIlllIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        double d4 = class_08642.IlIllllllIIlIIllllIIlIIIl - this.IlIllllllIIlIIllllIIlIIIl;
        if (d4 * d4 < (double)1.0E-7f) {
            return null;
        }
        double d5 = (d - this.IlIllllllIIlIIllllIIlIIIl) / d4;
        return d5 >= 0.0 && d5 <= 1.0 ? class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll + d2 * d5, this.lllIlIIlIIIlIlIIIllIlllIl + d3 * d5, this.IlIllllllIIlIIllllIIlIIIl + d4 * d5) : null;
    }

    public String toString() {
        return "(" + this.lllIIIllIIIIlllIlIIllIIll + ", " + this.lllIlIIlIIIlIlIIIllIlllIl + ", " + this.IlIllllllIIlIIllllIIlIIIl + ")";
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        float f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f);
        float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f);
        double d = this.lllIIIllIIIIlllIlIIllIIll;
        double d2 = this.lllIlIIlIIIlIlIIIllIlllIl * (double)f2 + this.IlIllllllIIlIIllllIIlIIIl * (double)f3;
        double d3 = this.IlIllllllIIlIIllllIIlIIIl * (double)f2 - this.lllIlIIlIIIlIlIIIllIlllIl * (double)f3;
        this.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f) {
        float f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f);
        float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f);
        double d = this.lllIIIllIIIIlllIlIIllIIll * (double)f2 + this.IlIllllllIIlIIllllIIlIIIl * (double)f3;
        double d2 = this.lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = this.IlIllllllIIlIIllllIIlIIIl * (double)f2 - this.lllIIIllIIIIlllIlIIllIIll * (double)f3;
        this.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3);
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        float f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f);
        float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f);
        double d = this.lllIIIllIIIIlllIlIIllIIll * (double)f2 + this.lllIlIIlIIIlIlIIIllIlllIl * (double)f3;
        double d2 = this.lllIlIIlIIIlIlIIIllIlllIl * (double)f2 - this.lllIIIllIIIIlllIlIIllIIll * (double)f3;
        double d3 = this.IlIllllllIIlIIllllIIlIIIl;
        this.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3);
    }
}

