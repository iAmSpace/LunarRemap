package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.List;

public abstract class class_0512
extends class_1521
implements class_1946 {
    private int IlIllllllIIlIIllllIIlIIIl = -1;
    private int lIlllIlllIIIIlIIlllIllIII = -1;
    private int IlIIIIIllllllIIlllIllllll = -1;
    private Block lIllllIIlIIIlIllllllIIIll;
    protected boolean lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    private class_1965 IIIllIIlIIIIIIlIlIIllIIlI;
    private String IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;

    public class_0512(class_1334 class_13342) {
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

    public class_0512(class_1334 class_13342, class_1965 class_19652) {
        super(class_13342);
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_19652;
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.llIIlIlIlllIIllIlIlllIllI + (double)class_19652.llIIllIllIlIIlIIllIllllll(), class_19652.IllIIIIllIIllIllIlllIlIIl, class_19652.IIIIlIllIlIIlIIlIllIlIlll, class_19652.IlIlIIlllIllllllllIIIlIlI);
        this.IlIIlllllIIlIlIlllllIllll -= (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * 0.16f);
        this.llIIlIlIlllIIllIlIlllIllI -= (double)0.1f;
        this.IllIIIIllIIllIllIlllIlIIl -= (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * 0.16f);
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        float f = 0.4f;
        this.IIIIIIIIlIllIIllIIlllIllI = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f;
        this.llIIIlllIlllIlIllIIIIllIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = -MathHelper.lllIIIllIIIIlllIlIIllIIll((this.IlIlIIlllIllllllllIIIlIlI + this.IlIIIIIllllllIIlllIllllll()) / 180.0f * (float)Math.PI) * f;
        this.a_(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl, this.lIlllIlllIIIIlIIlllIllIII(), 1.0f);
    }

    public class_0512(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342);
        this.IIIllIllIIlIlIlIlIllllIIl = 0;
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
    }

    protected float lIlllIlllIIIIlIIlllIllIII() {
        return 1.5f;
    }

    protected float IlIIIIIllllllIIlllIllllll() {
        return 0.0f;
    }

    @Override
    public void a_(double d, double d2, double d3, float f, float f2) {
        float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.0075f * (double)f2;
        d2 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.0075f * (double)f2;
        d3 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.0075f * (double)f2;
        this.IIIIIIIIlIllIIllIIlllIllI = d *= (double)f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d2 *= (double)f;
        this.llIIIlllIlllIlIllIIIIllIl = d3 *= (double)f;
        float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
        this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(d2, f4) * 180.0 / Math.PI);
        this.IIIllIllIIlIlIlIlIllllIIl = 0;
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
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            --this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll) == this.lIllllIIlIIIlIllllllIIIll) {
                ++this.IIIllIllIIlIlIlIlIllllIIl;
                if (this.IIIllIllIIlIlIlIlIllllIIl == 1200) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                }
                return;
            }
            this.lllIIIllIIIIlllIlIIllIIll = false;
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
            this.llIIIlllIlllIlIllIIIIllIl *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
            this.IIIllIllIIlIlIlIlIllllIIl = 0;
            this.IllIIIllIIIIlIlIlIllIIlll = 0;
        } else {
            ++this.IllIIIllIIIIlIlIlIllIIlll;
        }
        class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        class_0864 class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
        class_1112 class_11122 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643);
        class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
        if (class_11122 != null) {
            class_08643 = class_0864.lllIIIllIIIIlllIlIIllIIll(class_11122.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll, class_11122.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl, class_11122.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl);
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1521 class_15212 = null;
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl).lllIlIIlIIIlIlIIIllIlllIl(1.0, 1.0, 1.0));
            double d = 0.0;
            class_1965 class_19652 = this.IllIIlllllllIIlIIlIIIIlIl();
            for (int i = 0; i < list.size(); ++i) {
                double d2;
                float f;
                class_1974 class_19742;
                class_1112 class_11123;
                class_1521 class_15213 = (class_1521)list.get(i);
                if (!class_15213.IllllIIlIIIllIlllIlllIllI() || class_15213 == class_19652 && this.IllIIIllIIIIlIlIlIllIIlll < 5 || (class_11123 = (class_19742 = class_15213.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f = 0.3f, f, f)).lllIIIllIIIIlllIlIIllIIll(class_08642, class_08643)) == null || !((d2 = class_08642.lIlllIlllIIIIlIIlllIllIII(class_11123.lIllllIIlIIIlIllllllIIIll)) < d) && d != 0.0) continue;
                class_15212 = class_15213;
                d = d2;
            }
            if (class_15212 != null) {
                class_11122 = new class_1112(class_15212);
            }
        }
        if (class_11122 != null) {
            if (class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl && this.lIlIllIIlIIlIIlIIlIIlIIll.a_(class_11122.lllIlIIlIIIlIlIIIllIlllIl, class_11122.IlIllllllIIlIIllllIIlIIIl, class_11122.lIlllIlllIIIIlIIlllIllIII) == Blocks.IIIIIIlIIIIIIIIIIlIlIlIlI) {
                this.lIlIIllIllIIIIIlIllllIIIl();
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(class_11122);
            }
        }
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
        float f2 = 0.99f;
        float f3 = this.IlIllllllIIlIIllllIIlIIIl();
        if (this.llIlllIlIIllIlIIIIllIIlIl()) {
            for (int i = 0; i < 4; ++i) {
                float f4 = 0.25f;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("bubble", this.IlIIlllllIIlIlIlllllIllll - this.IIIIIIIIlIllIIllIIlllIllI * (double)f4, this.llIIlIlIlllIIllIlIlllIllI - this.IIlIIlIlIlIllIIlIlIIIIlll * (double)f4, this.IllIIIIllIIllIllIlllIlIIl - this.llIIIlllIlllIlIllIIIIllIl * (double)f4, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            }
            f2 = 0.8f;
        }
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)f2;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)f2;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)f2;
        this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)f3;
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
    }

    protected float IlIllllllIIlIIllllIIlIIIl() {
        return 0.03f;
    }

    protected abstract void lllIIIllIIIIlllIlIIllIIll(class_1112 var1);

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("xTile", (short)this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("yTile", (short)this.lIlllIlllIIIIlIIlllIllIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("zTile", (short)this.IlIIIIIllllllIIlllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("inTile", (byte) Block.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll));
        class_07752.lllIIIllIIIIlllIlIIllIIll("shake", (byte)this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("inGround", (byte)(this.lllIIIllIIIIlllIlIIllIIll ? 1 : 0));
        if ((this.IllIIlllllllIIlIIlIIIIlIl == null || this.IllIIlllllllIIlIIlIIIIlIl.length() == 0) && this.IIIllIIlIIIIIIlIlIIllIIlI != null && this.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_0814) {
            this.IllIIlllllllIIlIIlIIIIlIl = this.IIIllIIlIIIIIIlIlIIllIIlI.llllIIIIlIIIlIIIIIIlIllll();
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("ownerName", this.IllIIlllllllIIlIIlIIIIlIl == null ? "" : this.IllIIlllllllIIlIIlIIIIlIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.IlIIIIIllllllIIlllIllllll("xTile");
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.IlIIIIIllllllIIlllIllllll("yTile");
        this.IlIIIIIllllllIIlllIllllll = class_07752.IlIIIIIllllllIIlllIllllll("zTile");
        this.lIllllIIlIIIlIllllllIIIll = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIlllIlllIIIIlIIlllIllIII("inTile") & 0xFF);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIlllIlllIIIIlIIlllIllIII("shake") & 0xFF;
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIlllIlllIIIIlIIlllIllIII("inGround") == 1;
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.IllIIIllIIIIlIlIlIllIIlll("ownerName");
        if (this.IllIIlllllllIIlIIlIIIIlIl != null && this.IllIIlllllllIIlIIlIIIIlIl.length() == 0) {
            this.IllIIlllllllIIlIIlIIIIlIl = null;
        }
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    public class_1965 IllIIlllllllIIlIIlIIIIlIl() {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI == null && this.IllIIlllllllIIlIIlIIIIlIl != null && this.IllIIlllllllIIlIIlIIIIlIl.length() > 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl);
        }
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }
}

