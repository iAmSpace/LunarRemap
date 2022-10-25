package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.util.MathHelper;

import java.util.List;

public abstract class class_1937
extends class_1521 {
    private int IlIIIIIllllllIIlllIllllll = -1;
    private int lIllllIIlIIIlIllllllIIIll = -1;
    private int IIIllIIlIIIIIIlIlIIllIIlI = -1;
    private Block IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    public class_1965 lllIIIllIIIIlllIlIIllIIll;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double lIlllIlllIIIIlIIlllIllIII;

    public class_1937(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(1.0f, 1.0f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(double d) {
        double d2 = this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll() * 4.0;
        return d < (d2 *= 64.0) * d2;
    }

    public class_1937(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(1.0f, 1.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl(d, d2, d3, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        double d7 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d4 * d4 + d5 * d5 + d6 * d6);
        this.lllIlIIlIIIlIlIIIllIlllIl = d4 / d7 * 0.1;
        this.IlIllllllIIlIIllllIIlIIIl = d5 / d7 * 0.1;
        this.lIlllIlllIIIIlIIlllIllIII = d6 / d7 * 0.1;
    }

    public class_1937(class_1334 class_13342, class_1965 class_19652, double d, double d2, double d3) {
        super(class_13342);
        this.lllIIIllIIIIlllIlIIllIIll = class_19652;
        this.IlIIIIIllllllIIlllIllllll(1.0f, 1.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.llIIlIlIlllIIllIlIlllIllI, class_19652.IllIIIIllIIllIllIlllIlIIl, class_19652.IIIIlIllIlIIlIIlIllIlIlll, class_19652.IlIlIIlllIllllllllIIIlIlI);
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        double d4 = MathHelper.lllIIIllIIIIlllIlIIllIIll((d += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.4) * d + (d2 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.4) * d2 + (d3 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.4) * d3);
        this.lllIlIIlIIIlIlIIIllIlllIl = d / d4 * 0.1;
        this.IlIllllllIIlIIllllIIlIIIl = d2 / d4 * 0.1;
        this.lIlllIlllIIIIlIIlllIllIII = d3 / d4 * 0.1;
    }

    @Override
    public void s_() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && (this.lllIIIllIIIIlllIlIIllIIll != null && this.lllIIIllIIIIlllIlIIllIIll.IllllIIIIlIIlIIIIlllIIIIl || !this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIIIIllllllIIlllIllllll((int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl))) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        } else {
            super.s_();
            this.IlIIIIIllllllIIlllIllllll(1);
            if (this.IIIllIllIIlIlIlIlIllllIIl) {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll, this.IIIllIIlIIIIIIlIlIIllIIlI) == this.IllIIlllllllIIlIIlIIIIlIl) {
                    ++this.IllIIIllIIIIlIlIlIllIIlll;
                    if (this.IllIIIllIIIIlIlIlIllIIlll == 600) {
                        this.IIIIlIIlIIIllIIIIllIIIlII();
                    }
                    return;
                }
                this.IIIllIllIIlIlIlIlIllllIIl = false;
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.llIIIlllIlllIlIllIIIIllIl *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.IllIIIllIIIIlIlIlIllIIlll = 0;
                this.lIIIIlIlIIlllllIIllIIlIII = 0;
            } else {
                ++this.lIIIIlIlIIlllllIIllIIlIII;
            }
            class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            class_0864 class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
            class_1112 class_11122 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643);
            class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
            if (class_11122 != null) {
                class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(class_11122.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll, class_11122.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl, class_11122.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl);
            }
            class_1521 class_15212 = null;
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl).lllIlIIlIIIlIlIIIllIlllIl(1.0, 1.0, 1.0));
            double d = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                double d2;
                float f;
                class_1974 class_19742;
                class_1112 class_11123;
                class_1521 class_15213 = (class_1521)list.get(i);
                if (!class_15213.IllllIIlIIIllIlllIlllIllI() || class_15213.IllIIlllllllIIlIIlIIIIlIl(this.lllIIIllIIIIlllIlIIllIIll) && this.lIIIIlIlIIlllllIIllIIlIII < 25 || (class_11123 = (class_19742 = class_15213.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f = 0.3f, f, f)).lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643)) == null || !((d2 = class_08642.lIlllIlllIIIIlIIlllIllIII(class_11123.lIllllIIlIIIlIllllllIIIll)) < d) && d != 0.0) continue;
                class_15212 = class_15213;
                d = d2;
            }
            if (class_15212 != null) {
                class_11122 = new class_1112(class_15212);
            }
            if (class_11122 != null) {
                this.lllIIIllIIIIlllIlIIllIIll(class_11122);
            }
            this.IlIIlllllIIlIlIlllllIllll += this.IIIIIIIIlIllIIllIIlllIllI;
            this.llIIlIlIlllIIllIlIlllIllI += this.IIlIIlIlIlIllIIlIlIIIIlll;
            this.IllIIIIllIIllIllIlllIlIIl += this.llIIIlllIlllIlIllIIIIllIl;
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(this.llIIIlllIlllIlIllIIIIllIl, this.IIIIIIIIlIllIIllIIlllIllI) * 180.0 / Math.PI) + 90.0f;
            this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(f, this.IIlIIlIlIlIllIIlIlIIIIlll) * 180.0 / Math.PI) - 90.0f;
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
            float f2 = this.IlIllllllIIlIIllllIIlIIIl();
            if (this.llIlllIlIIllIlIIIIllIIlIl()) {
                for (int i = 0; i < 4; ++i) {
                    float f3 = 0.25f;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("bubble", this.IlIIlllllIIlIlIlllllIllll - this.IIIIIIIIlIllIIllIIlllIllI * (double)f3, this.llIIlIlIlllIIllIlIlllIllI - this.IIlIIlIlIlIllIIlIlIIIIlll * (double)f3, this.IllIIIIllIIllIllIlllIlIIl - this.llIIIlllIlllIlIllIIIIllIl * (double)f3, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                }
                f2 = 0.8f;
            }
            this.IIIIIIIIlIllIIllIIlllIllI += this.lllIlIIlIIIlIlIIIllIlllIl;
            this.IIlIIlIlIlIllIIlIlIIIIlll += this.IlIllllllIIlIIllllIIlIIIl;
            this.llIIIlllIlllIlIllIIIIllIl += this.lIlllIlllIIIIlIIlllIllIII;
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)f2;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)f2;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)f2;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("smoke", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + 0.5, this.IllIIIIllIIllIllIlllIlIIl, 0.0, 0.0, 0.0);
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        }
    }

    protected float IlIllllllIIlIIllllIIlIIIl() {
        return 0.95f;
    }

    protected abstract void lllIIIllIIIIlllIlIIllIIll(class_1112 var1);

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("xTile", (short)this.IlIIIIIllllllIIlllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("yTile", (short)this.lIllllIIlIIIlIllllllIIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("zTile", (short)this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("inTile", (byte) Block.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl));
        class_07752.lllIIIllIIIIlllIlIIllIIll("inGround", (byte)(this.IIIllIllIIlIlIlIlIllllIIl ? 1 : 0));
        class_07752.lllIIIllIIIIlllIlIIllIIll("direction", this.lllIIIllIIIIlllIlIIllIIll(new double[]{this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl}));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.IlIIIIIllllllIIlllIllllll = class_07752.IlIIIIIllllllIIlllIllllll("xTile");
        this.lIllllIIlIIIlIllllllIIIll = class_07752.IlIIIIIllllllIIlllIllllll("yTile");
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.IlIIIIIllllllIIlllIllllll("zTile");
        this.IllIIlllllllIIlIIlIIIIlIl = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIlllIlllIIIIlIIlllIllIII("inTile") & 0xFF);
        boolean bl = this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lIlllIlllIIIIlIIlllIllIII("inGround") == 1;
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("direction", 9)) {
            class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("direction", 6);
            this.IIIIIIIIlIllIIllIIlllIllI = class_21452.lIlllIlllIIIIlIIlllIllIII(0);
            this.IIlIIlIlIlIllIIlIlIIIIlll = class_21452.lIlllIlllIIIIlIIlllIllIII(1);
            this.llIIIlllIlllIlIllIIIIllIl = class_21452.lIlllIlllIIIIlIIlllIllIII(2);
        } else {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return true;
    }

    @Override
    public float IlIlIllIIlIIIIlllIlIllIlI() {
        return 1.0f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        this.IIlIllIIlllllIIlIIllllIIl();
        if (class_00582.IllIIIllIIIIlIlIlIllIIlll() != null) {
            class_0864 class_08642 = class_00582.IllIIIllIIIIlIlIlIllIIlll().IlIIllIlIlIllIIIlIIlIlIIl();
            if (class_08642 != null) {
                this.IIIIIIIIlIllIIllIIlllIllI = class_08642.lllIIIllIIIIlllIlIIllIIll;
                this.IIlIIlIlIlIllIIlIlIIIIlll = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
                this.llIIIlllIlllIlIllIIIIllIl = class_08642.IlIllllllIIlIIllllIIlIIIl;
                this.lllIlIIlIIIlIlIIIllIlllIl = this.IIIIIIIIlIllIIllIIlllIllI * 0.1;
                this.IlIllllllIIlIIllllIIlIIIl = this.IIlIIlIlIlIllIIlIlIIIIlll * 0.1;
                this.lIlllIlllIIIIlIIlllIllIII = this.llIIIlllIlllIlIllIIIIllIl * 0.1;
            }
            if (class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_1965) {
                this.lllIIIllIIIIlllIlIIllIIll = (class_1965)class_00582.IllIIIllIIIIlIlIlIllIIlll();
            }
            return true;
        }
        return false;
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
}

