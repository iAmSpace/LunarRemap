package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1138
extends class_1521 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII = 5;
    private int IlIIIIIllllllIIlllIllllll;
    private class_0814 lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;

    public class_1138(class_1334 class_13342, double d, double d2, double d3, int n) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.5f, 0.5f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.random() * 360.0);
        this.IIIIIIIIlIllIIllIIlllIllI = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = (float)(Math.random() * 0.2) * 2.0f;
        this.llIIIlllIlllIlIllIIIIllIl = (float)(Math.random() * (double)0.2f - (double)0.1f) * 2.0f;
        this.IlIIIIIllllllIIlllIllllll = n;
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    public class_1138(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        float f2 = 0.5f;
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > 1.0f) {
            f2 = 1.0f;
        }
        int n = super.lllIIIllIIIIlllIlIIllIIll(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }

    @Override
    public void s_() {
        double d;
        double d2;
        double d3;
        double d4;
        double d5;
        super.s_();
        if (this.IlIllllllIIlIIllllIIlIIIl > 0) {
            --this.IlIllllllIIlIIllllIIlIIIl;
        }
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)0.03f;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            this.IIlIIlIlIlIllIIlIlIIIIlll = 0.2f;
            this.IIIIIIIIlIllIIllIIlllIllI = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f;
            this.llIIIlllIlllIlIllIIIIllIl = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f;
            this.lllIIIllIIIIlllIlIIllIIll("random.fizz", 0.4f, 2.0f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.4f);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, (this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll) / 2.0, this.IllIIIIllIIllIllIlllIlIIl);
        double d6 = 8.0;
        if (this.IIIllIIlIIIIIIlIlIIllIIlI < this.lllIIIllIIIIlllIlIIllIIll - 20 + this.llllllIlIllllIlIlIlIIIIlI() % 100) {
            if (this.lIllllIIlIIIlIllllllIIIll == null || this.lIllllIIlIIIlIllllllIIIll.IlIIIIIllllllIIlllIllllll(this) > d6 * d6) {
                this.lIllllIIlIIIlIllllllIIIll = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, d6);
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lllIIIllIIIIlllIlIIllIIll;
        }
        if (this.lIllllIIlIIIlIllllllIIIll != null && (d5 = 1.0 - (d4 = Math.sqrt((d3 = (this.lIllllIIlIIIlIllllllIIIll.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll) / d6) * d3 + (d2 = (this.lIllllIIlIIIlIllllllIIIll.llIIlIlIlllIIllIlIlllIllI + (double)this.lIllllIIlIIIlIllllllIIIll.llIIllIllIlIIlIIllIllllll() - this.llIIlIlIlllIIllIlIlllIllI) / d6) * d2 + (d = (this.lIllllIIlIIIlIllllllIIIll.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl) / d6) * d))) > 0.0) {
            d5 *= d5;
            this.IIIIIIIIlIllIIllIIlllIllI += d3 / d4 * d5 * 0.1;
            this.IIlIIlIlIlIllIIlIlIIIIlll += d2 / d4 * d5 * 0.1;
            this.llIIIlllIlllIlIllIIIIllIl += d / d4 * d5 * 0.1;
        }
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        float f = 0.98f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            f = this.lIlIllIIlIIlIIlIIlIIlIIll.a_((int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IlIIlllllIIlIlIlllllIllll), (int)(MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1), (int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IllIIIIllIIllIllIlllIlIIl)).llllIIIIlIIIlIIIIIIlIllll * 0.98f;
        }
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)-0.9f;
        }
        ++this.lllIIIllIIIIlllIlIIllIIll;
        ++this.lllIlIIlIIIlIlIIIllIlllIl;
        if (this.lllIlIIlIIIlIlIIIllIlllIl >= 6000) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public boolean lIIIllIIIIIllllIlIlIllIll() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI, class_1855.IllIIlllllllIIlIIlIIIIlIl, (class_1521)this);
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(int n) {
        this.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll, (float)n);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        this.IIlIllIIlllllIIlIIllllIIl();
        this.lIlllIlllIIIIlIIlllIllIII = (int)((float)this.lIlllIlllIIIIlIIlllIllIII - f);
        if (this.lIlllIlllIIIIlIIlllIllIII <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Health", (short)((byte)this.lIlllIlllIIIIlIIlllIllIII));
        class_07752.lllIIIllIIIIlllIlIIllIIll("Age", (short)this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Value", (short)this.IlIIIIIllllllIIlllIllllll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.IlIIIIIllllllIIlllIllllll("Health") & 0xFF;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.IlIIIIIllllllIIlllIllllll("Age");
        this.IlIIIIIllllllIIlllIllllll = class_07752.IlIIIIIllllllIIlllIllllll("Value");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IlIllllllIIlIIllllIIlIIIl == 0 && class_08142.lIIIIlIIIIllIlIIllllIlIII == 0) {
            class_08142.lIIIIlIIIIllIlIIllllIlIII = 2;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.orb", 0.1f, 0.5f * ((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.7f + 1.8f));
            class_08142.lllIIIllIIIIlllIlIIllIIll((class_1521)this, 1);
            class_08142.lIlIlIIlIIIIlIIIIIlllIIII(this.IlIIIIIllllllIIlllIllllll);
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll >= 2477 ? 10 : (this.IlIIIIIllllllIIlllIllllll >= 1237 ? 9 : (this.IlIIIIIllllllIIlllIllllll >= 617 ? 8 : (this.IlIIIIIllllllIIlllIllllll >= 307 ? 7 : (this.IlIIIIIllllllIIlllIllllll >= 149 ? 6 : (this.IlIIIIIllllllIIlllIllllll >= 73 ? 5 : (this.IlIIIIIllllllIIlllIllllll >= 37 ? 4 : (this.IlIIIIIllllllIIlllIllllll >= 17 ? 3 : (this.IlIIIIIllllllIIlllIllllll >= 7 ? 2 : (this.IlIIIIIllllllIIlllIllllll >= 3 ? 1 : 0)))))))));
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        return n >= 2477 ? 2477 : (n >= 1237 ? 1237 : (n >= 617 ? 617 : (n >= 307 ? 307 : (n >= 149 ? 149 : (n >= 73 ? 73 : (n >= 37 ? 37 : (n >= 17 ? 17 : (n >= 7 ? 7 : (n >= 3 ? 3 : 1)))))))));
    }

    @Override
    public boolean m_() {
        return false;
    }
}

