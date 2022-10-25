package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0093
extends class_1521 {
    private double lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_0093(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(double d) {
        double d2 = this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll() * 4.0;
        return d < (d2 *= 64.0) * d2;
    }

    public class_0093(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342);
        this.lIlllIlllIIIIlIIlllIllIII = 0;
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d, int n, double d2) {
        double d3 = d - this.IlIIlllllIIlIlIlllllIllll;
        double d4 = d2 - this.IllIIIIllIIllIllIlllIlIIl;
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d3 * d3 + d4 * d4);
        if (f > 12.0f) {
            this.lllIIIllIIIIlllIlIIllIIll = this.IlIIlllllIIlIlIlllllIllll + d3 / (double)f * 12.0;
            this.IlIllllllIIlIIllllIIlIIIl = this.IllIIIIllIIllIllIlllIlIIl + d4 / (double)f * 12.0;
            this.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI + 8.0;
        } else {
            this.lllIIIllIIIIlllIlIIllIIll = d;
            this.lllIlIIlIIIlIlIIIllIlllIl = n;
            this.IlIllllllIIlIIllllIIlIIIl = d2;
        }
        this.lIlllIlllIIIIlIIlllIllIII = 0;
        this.IlIIIIIllllllIIlllIllllll = this.IlllIIlllllllIIllIlIllllI.nextInt(5) > 0;
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(double d, double d2, double d3) {
        this.IIIIIIIIlIllIIllIIlllIllI = d;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d2;
        this.llIIIlllIlllIlIllIIIIllIl = d3;
        if (this.llIIIIllIIIIIIIlIIIlIIIIl == 0.0f && this.llllIIIIlIIIlIIIIIIlIllll == 0.0f) {
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
            this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(d2, f) * 180.0 / Math.PI);
        }
    }

    @Override
    public void s_() {
        this.lIIIlIIIlIlllIllIIIlIIIlI = this.IlIIlllllIIlIlIlllllIllll;
        this.lIIlIlllIllIlIlllIIIIIIII = this.llIIlIlIlllIIllIlIlllIllI;
        this.IIlIllIIlllllIIlIIllllIIl = this.IllIIIIllIIllIllIlllIlIIl;
        super.s_();
        this.IlIIlllllIIlIlIlllllIllll += this.IIIIIIIIlIllIIllIIlllIllI;
        this.llIIlIlIlllIIllIlIlllIllI += this.IIlIIlIlIlIllIIlIlIIIIlll;
        this.IllIIIIllIIllIllIlllIlIIl += this.llIIIlllIlllIlIllIIIIllIl;
        float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(this.IIIIIIIIlIllIIllIIlllIllI, this.llIIIlllIlllIlIllIIIIllIl) * 180.0 / Math.PI);
        this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(this.IIlIIlIlIlIllIIlIlIIIIlll, f) * 180.0 / Math.PI);
        while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl < -180.0f) {
            this.llIIIIllIIIIIIIlIIIlIIIIl -= 360.0f;
        }
        while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl >= 180.0f) {
            this.llIIIIllIIIIIIIlIIIlIIIIl += 360.0f;
        }
        while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll < -180.0f) {
            this.llllIIIIlIIIlIIIIIIlIllll -= 360.0f;
        }
        while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll >= 180.0f) {
            this.llllIIIIlIIIlIIIIIIlIllll += 360.0f;
        }
        this.IlIlIIlllIllllllllIIIlIlI = this.llIIIIllIIIIIIIlIIIlIIIIl + (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl) * 0.2f;
        this.IIIIlIllIlIIlIIlIllIlIlll = this.llllIIIIlIIIlIIIIIIlIllll + (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll) * 0.2f;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            double d = this.lllIIIllIIIIlllIlIIllIIll - this.IlIIlllllIIlIlIlllllIllll;
            double d2 = this.IlIllllllIIlIIllllIIlIIIl - this.IllIIIIllIIllIllIlllIlIIl;
            float f2 = (float)Math.sqrt(d * d + d2 * d2);
            float f3 = (float)Math.atan2(d2, d);
            double d3 = (double)f + (double)(f2 - f) * 0.0025;
            if (f2 < 1.0f) {
                d3 *= 0.8;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.8;
            }
            this.IIIIIIIIlIllIIllIIlllIllI = Math.cos(f3) * d3;
            this.llIIIlllIlllIlIllIIIIllIl = Math.sin(f3) * d3;
            this.IIlIIlIlIlIllIIlIlIIIIlll = this.llIIlIlIlllIIllIlIlllIllI < this.lllIlIIlIIIlIlIIIllIlllIl ? (this.IIlIIlIlIlIllIIlIlIIIIlll += (1.0 - this.IIlIIlIlIlIllIIlIlIIIIlll) * (double)0.015f) : (this.IIlIIlIlIlIllIIlIlIIIIlll += (-1.0 - this.IIlIIlIlIlIllIIlIlIIIIlll) * (double)0.015f);
        }
        float f4 = 0.25f;
        if (this.llIlllIlIIllIlIIIIllIIlIl()) {
            for (int i = 0; i < 4; ++i) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("bubble", this.IlIIlllllIIlIlIlllllIllll - this.IIIIIIIIlIllIIllIIlllIllI * (double)f4, this.llIIlIlIlllIIllIlIlllIllI - this.IIlIIlIlIlIllIIlIlIIIIlll * (double)f4, this.IllIIIIllIIllIllIlllIlIIl - this.llIIIlllIlllIlIllIIIIllIl * (double)f4, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            }
        } else {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("portal", this.IlIIlllllIIlIlIlllllIllll - this.IIIIIIIIlIllIIllIIlllIllI * (double)f4 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.6 - 0.3, this.llIIlIlIlllIIllIlIlllIllI - this.IIlIIlIlIlIllIIlIlIIIIlll * (double)f4 - 0.5, this.IllIIIIllIIllIllIlllIlIIl - this.llIIIlllIlllIlIllIIIIllIl * (double)f4 + this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.6 - 0.3, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            ++this.lIlllIlllIIIIlIIlllIllIII;
            if (this.lIlllIlllIIIIlIIlllIllIII > 80 && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.IIIIlIIlIIIllIIIIllIIIlII();
                if (this.IlIIIIIllllllIIlllIllllll) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1781(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, new ItemStack(Items.ender_eye)));
                } else {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(2003, (int)Math.round(this.IlIIlllllIIlIlIlllllIllll), (int)Math.round(this.llIIlIlIlllIIllIlIlllIllI), (int)Math.round(this.IllIIIIllIIllIllIlllIlIIl), 0);
                }
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    @Override
    public float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return 1.0f;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(float f) {
        return 0xF000F0;
    }

    @Override
    public boolean m_() {
        return false;
    }
}

