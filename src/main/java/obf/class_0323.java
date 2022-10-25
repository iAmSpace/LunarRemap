package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0323
extends class_1521 {
    protected int lllIlIIlIIIlIlIIIllIlllIl;
    protected int IlIllllllIIlIIllllIIlIIIl;
    protected float lIlllIlllIIIIlIIlllIllIII;
    protected float IlIIIIIllllllIIlllIllllll;
    protected int lIllllIIlIIIlIllllllIIIll;
    protected int IIIllIIlIIIIIIlIlIIllIIlI;
    protected float IllIIlllllllIIlIIlIIIIlIl;
    protected float IIIllIllIIlIlIlIlIllllIIl;
    protected float IllIIIllIIIIlIlIlIllIIlll;
    protected float lIIIIlIlIIlllllIIllIIlIII;
    protected float llIIlllIllIllllIIIlIIIIII;
    protected float llIIllIllIlIIlIIllIllllll = 1.0f;
    protected class_2102 lllIIlIIIllllllIIIIlIlIlI;
    public static double IlIlllIIIIIIlIIllIIllIlll;
    public static double IlIlIIlIlIllIIlIlIIllIIIl;
    public static double lllllIlllIIllIlIIlIIIllII;

    protected class_0323(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.2f, 0.2f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.lIIIlIIIlIlllIllIIIlIIIlI = d;
        this.lIIlIlllIllIlIlllIIIIIIII = d2;
        this.IIlIllIIlllllIIlIIllllIIl = d3;
        this.llIIlllIllIllllIIIlIIIIII = 1.0f;
        this.lIIIIlIlIIlllllIIllIIlIII = 1.0f;
        this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        this.lIlllIlllIIIIlIIlllIllIII = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 3.0f;
        this.IlIIIIIllllllIIlllIllllll = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 3.0f;
        this.IllIIlllllllIIlIIlIIIIlIl = (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.5f + 0.5f) * 2.0f;
        this.IIIllIIlIIIIIIlIlIIllIIlI = (int)(4.0f / (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.9f + 0.1f));
        this.lIllllIIlIIIlIllllllIIIll = 0;
    }

    public class_0323(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        this(class_13342, d, d2, d3);
        this.IIIIIIIIlIllIIllIIlllIllI = d4 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        this.IIlIIlIlIlIllIIlIlIIIIlll = d5 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        this.llIIIlllIlllIlIllIIIIllIl = d6 + (double)((float)(Math.random() * 2.0 - 1.0) * 0.4f);
        float f = (float)(Math.random() + Math.random() + 1.0) * 0.15f;
        float f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll * this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI = this.IIIIIIIIlIllIIllIIlllIllI / (double)f2 * (double)f * (double)0.4f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = this.IIlIIlIlIlIllIIlIlIIIIlll / (double)f2 * (double)f * (double)0.4f + (double)0.1f;
        this.llIIIlllIlllIlIllIIIIllIl = this.llIIIlllIlllIlIllIIIIllIl / (double)f2 * (double)f * (double)0.4f;
    }

    public class_0323 IlIllllllIIlIIllllIIlIIIl(float f) {
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = (this.IIlIIlIlIlIllIIlIlIIIIlll - (double)0.1f) * (double)f + (double)0.1f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)f;
        return this;
    }

    public class_0323 lIlllIlllIIIIlIIlllIllIII(float f) {
        this.IlIIIIIllllllIIlllIllllll(0.2f * f, 0.2f * f);
        this.IllIIlllllllIIlIIlIIIIlIl *= f;
        return this;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3) {
        this.IllIIIllIIIIlIlIlIllIIlll = f;
        this.lIIIIlIlIIlllllIIllIIlIII = f2;
        this.llIIlllIllIllllIIIlIIIIII = f3;
    }

    public void IlIIIIIllllllIIlllIllllll(float f) {
        this.llIIllIllIlIIlIIllIllllll = f;
    }

    public float lIlllIlllIIIIlIIlllIllIII() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public float IlIIIIIllllllIIlllIllllll() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public float lIllllIIlIIIlIllllllIIIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        if (this.lIllllIIlIIIlIllllllIIIll++ >= this.IIIllIIlIIIIIIlIlIIllIIlI) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        this.IIlIIlIlIlIllIIlIlIIIIlll -= 0.04 * (double)this.IIIllIllIIlIlIlIlIllllIIl;
        this.IlIIlllllIIlIlIlllllIllll += this.IIIIIIIIlIllIIllIIlllIllI;
        this.llIIlIlIlllIIllIlIlllIllI += this.IIlIIlIlIlIllIIlIlIIIIlll;
        this.IllIIIIllIIllIllIlllIlIIl += this.llIIIlllIlllIlIllIIIIllIl;
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.98f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.98f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0868 class_08682, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7 = (float)this.lllIlIIlIIIlIlIIIllIlllIl / 16.0f;
        float f8 = f7 + 0.0624375f;
        float f9 = (float)this.IlIllllllIIlIIllllIIlIIIl / 16.0f;
        float f10 = f9 + 0.0624375f;
        float f11 = 0.1f * this.IllIIlllllllIIlIIlIIIIlIl;
        if (this.lllIIlIIIllllllIIIIlIlIlI != null) {
            f7 = this.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl();
            f8 = this.lllIIlIIIllllllIIIIlIlIlI.lIlllIlllIIIIlIIlllIllIII();
            f9 = this.lllIIlIIIllllllIIIIlIlIlI.IlIIIIIllllllIIlllIllllll();
            f10 = this.lllIIlIIIllllllIIIIlIlIlI.lIllllIIlIIIlIllllllIIIll();
        }
        float f12 = (float)(this.llIIlIllIllllIlIIIIlIIlll + (this.IlIIlllllIIlIlIlllllIllll - this.llIIlIllIllllIlIIIIlIIlll) * (double)f - IlIlllIIIIIIlIIllIIllIlll);
        float f13 = (float)(this.llIllllIlIllIIIlIllIIlIlI + (this.llIIlIlIlllIIllIlIlllIllI - this.llIllllIlIllIIIlIllIIlIlI) * (double)f - IlIlIIlIlIllIIlIlIIllIIIl);
        float f14 = (float)(this.lIlllIlllIlIIIIlllIlIlIIl + (this.IllIIIIllIIllIllIlllIlIIl - this.lIlllIlllIlIIIIlllIlIlIIl) * (double)f - lllllIlllIIllIlIIlIIIllII);
        class_08682.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 - f5 * f11, f13 - f3 * f11, f14 - f4 * f11 - f6 * f11, f8, f10);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 - f2 * f11 + f5 * f11, f13 + f3 * f11, f14 - f4 * f11 + f6 * f11, f8, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 + f5 * f11, f13 + f3 * f11, f14 + f4 * f11 + f6 * f11, f7, f9);
        class_08682.lllIIIllIIIIlllIlIIllIIll(f12 + f2 * f11 - f5 * f11, f13 - f3 * f11, f14 + f4 * f11 - f6 * f11, f7, f10);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return 0;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_2102 class_21022) {
        if (this.IlIllllllIIlIIllllIIlIIIl() == 1) {
            this.lllIIlIIIllllllIIIIlIlIlI = class_21022;
        } else {
            if (this.IlIllllllIIlIIllllIIlIIIl() != 2) {
                throw new RuntimeException("Invalid call to Particle.setTex, use coordinate methods");
            }
            this.lllIIlIIIllllllIIIIlIlIlI = class_21022;
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (this.IlIllllllIIlIIllllIIlIIIl() != 0) {
            throw new RuntimeException("Invalid call to Particle.setMiscTex");
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = n % 16;
        this.IlIllllllIIlIIllllIIlIIIl = n / 16;
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        ++this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public boolean m_() {
        return false;
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + ", Pos (" + this.IlIIlllllIIlIlIlllllIllll + "," + this.llIIlIlIlllIIllIlIlllIllI + "," + this.IllIIIIllIIllIllIlllIlIIl + "), RGBA (" + this.IllIIIllIIIIlIlIlIllIIlll + "," + this.lIIIIlIlIIlllllIIllIIlIII + "," + this.llIIlllIllIllllIIIlIIIIII + "," + this.llIIllIllIlIIlIIllIllllll + "), Age " + this.lIllllIIlIIIlIllllllIIIll;
    }
}

