package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_1221
extends class_0339
implements class_1310,
class_0859,
class_0083 {
    public double lllIIIllIIIIlllIlIIllIIll;
    public double lllIlIIlIIIlIlIIIllIlllIl;
    public double IlIllllllIIlIIllllIIlIIIl;
    public double[][] lIlllIlllIIIIlIIlllIllIII = new double[64][3];
    public int IlIIIIIllllllIIlllIllllll = -1;
    public class_1172[] lIIIlIllllIlllIIIIIllIIIl;
    public class_1172 lllIIIlllIlllIIlIllllIIlI = new class_1172(this, "head", 6.0f, 6.0f);
    public class_1172 lIIlIlllIIlllIIlllIIlIlII = new class_1172(this, "body", 8.0f, 8.0f);
    public class_1172 lIIlIIIlIlIIlllIlIllIllIl = new class_1172(this, "tail", 4.0f, 4.0f);
    public class_1172 lIIlIlIIIIIllIIIIllIlIlII = new class_1172(this, "tail", 4.0f, 4.0f);
    public class_1172 lIIIIlIIIIllIlIIllllIlIII = new class_1172(this, "tail", 4.0f, 4.0f);
    public class_1172 lIIIlllllllIlllIIllllllll = new class_1172(this, "wing", 4.0f, 4.0f);
    public class_1172 IIllllIIlIlIlIlllIIIllIIl = new class_1172(this, "wing", 4.0f, 4.0f);
    public float IIIllIIIlIlllllllIIIlllll;
    public float lIlIlllIllllIIlllIlllIIIl;
    public boolean lIlIllllIlIIIIIllIIIIlIlI;
    public boolean IIlllllIIlIIlIlIIlIIlIlII;
    private class_1521 lIlIIIlIlIllIlIlIIIlIlIII;
    public int IIlIlIIIIlIlllIlIlIIIIIlI;
    public class_0355 IlIlIIllIlIlIIIIIlIlllllI;

    public class_1221(class_1334 class_13342) {
        super(class_13342);
        this.lIIIlIllllIlllIIIIIllIIIl = new class_1172[]{this.lllIIIlllIlllIIlIllllIIlI, this.lIIlIlllIIlllIIlllIIlIlII, this.lIIlIIIlIlIIlllIlIllIllIl, this.lIIlIlIIIIIllIIIIllIlIlII, this.lIIIIlIIIIllIlIIllllIlIII, this.lIIIlllllllIlllIIllllllll, this.IIllllIIlIlIlIlllIIIllIIl};
        this.IllIIIllIIIIlIlIlIllIIlll(this.IIllllIIlIlIlIlllIIIllIIl());
        this.IlIIIIIllllllIIlllIllllll(16.0f, 8.0f);
        this.IlIIIlIllIIIllIIIIlIIlIll = true;
        this.llllIlIIllIIlllllIIllIIll = true;
        this.lllIlIIlIIIlIlIIIllIlllIl = 100.0;
        this.IlIIIIIllIlllIIIIlIIIllIl = true;
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(200.0);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public double[] lllIlIIlIIIlIlIIIllIlllIl(int n, float f) {
        if (this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            f = 0.0f;
        }
        f = 1.0f - f;
        int n2 = this.IlIIIIIllllllIIlllIllllll - n * 1 & 0x3F;
        int n3 = this.IlIIIIIllllllIIlllIllllll - n * 1 - 1 & 0x3F;
        double[] arrd = new double[3];
        double d = this.lIlllIlllIIIIlIIlllIllIII[n2][0];
        double d2 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.lIlllIlllIIIIlIIlllIllIII[n3][0] - d);
        arrd[0] = d + d2 * (double)f;
        d = this.lIlllIlllIIIIlIIlllIllIII[n2][1];
        d2 = this.lIlllIlllIIIIlIIlllIllIII[n3][1] - d;
        arrd[1] = d + d2 * (double)f;
        arrd[2] = this.lIlllIlllIIIIlIIlllIllIII[n2][2] + (this.lIlllIlllIIIIlIIlllIllIII[n3][2] - this.lIlllIlllIIIIlIIlllIllIII[n2][2]) * (double)f;
        return arrd;
    }

    @Override
    public void d_() {
        float f;
        float f2;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            f2 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIlllIllllIIlllIlllIIIl * (float)Math.PI * 2.0f);
            f = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIIIlIlllllllIIIlllll * (float)Math.PI * 2.0f);
            if (f <= -0.3f && f2 >= -0.3f) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, "mob.enderdragon.wings", 5.0f, 0.8f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.3f, false);
            }
        }
        this.IIIllIIIlIlllllllIIIlllll = this.lIlIlllIllllIIlllIlllIIIl;
        if (this.lllIIIlllIlllIIlIllllIIlI() <= 0.0f) {
            f2 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 8.0f;
            f = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 4.0f;
            float f3 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 8.0f;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("largeexplode", this.IlIIlllllIIlIlIlllllIllll + (double)f2, this.llIIlIlIlllIIllIlIlllIllI + 2.0 + (double)f, this.IllIIIIllIIllIllIlllIlIIl + (double)f3, 0.0, 0.0, 0.0);
        } else {
            float f4;
            float f5;
            float f6;
            float f7;
            Object object;
            Object object2;
            float f8;
            double d;
            double d2;
            double d3;
            this.IlIIIIIllllllIIlllIllllll();
            f2 = 0.2f / (MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl) * 10.0f + 1.0f);
            this.lIlIlllIllllIIlllIlllIIIl = this.IIlllllIIlIIlIlIIlIIlIlII ? (this.lIlIlllIllllIIlllIlllIIIl += f2 * 0.5f) : (this.lIlIlllIllllIIlllIlllIIIl += (f2 *= (float)Math.pow(2.0, this.IIlIIlIlIlIllIIlIlIIIIlll)));
            this.IIIIlIllIlIIlIIlIllIlIlll = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IIIIlIllIlIIlIIlIllIlIlll);
            if (this.IlIIIIIllllllIIlllIllllll < 0) {
                for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.length; ++i) {
                    this.lIlllIlllIIIIlIIlllIllIII[i][0] = this.IIIIlIllIlIIlIIlIllIlIlll;
                    this.lIlllIlllIIIIlIIlllIllIII[i][1] = this.llIIlIlIlllIIllIlIlllIllI;
                }
            }
            if (++this.IlIIIIIllllllIIlllIllllll == this.lIlllIlllIIIIlIIlllIllIII.length) {
                this.IlIIIIIllllllIIlllIllllll = 0;
            }
            this.lIlllIlllIIIIlIIlllIllIII[this.IlIIIIIllllllIIlllIllllll][0] = this.IIIIlIllIlIIlIIlIllIlIlll;
            this.lIlllIlllIIIIlIIlllIllIII[this.IlIIIIIllllllIIlllIllllll][1] = this.llIIlIlIlllIIllIlIlllIllI;
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                if (this.lllIlIIllllIIllIIIIllIlIl > 0) {
                    d3 = this.IlIIlllllIIlIlIlllllIllll + (this.IllIIIIIllIlIIllIllllllIl - this.IlIIlllllIIlIlIlllllIllll) / (double)this.lllIlIIllllIIllIIIIllIlIl;
                    double d4 = this.llIIlIlIlllIIllIlIlllIllI + (this.IIIlllllIIIIIllIllIIIIllI - this.llIIlIlIlllIIllIlIlllIllI) / (double)this.lllIlIIllllIIllIIIIllIlIl;
                    d2 = this.IllIIIIllIIllIllIlllIlIIl + (this.IlIIIIIIllIIlIllIIllIllIl - this.IllIIIIllIIllIllIlllIlIIl) / (double)this.lllIlIIllllIIllIIIIllIlIl;
                    d = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IlIIllIIIlIlIlIIlIlIllIIl - (double)this.IIIIlIllIlIIlIIlIllIlIlll);
                    this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + d / (double)this.lllIlIIllllIIllIIIIllIlIl);
                    this.IlIlIIlllIllllllllIIIlIlI = (float)((double)this.IlIlIIlllIllllllllIIIlIlI + (this.IIllIIIlIIllllIIIIIIIIlll - (double)this.IlIlIIlllIllllllllIIIlIlI) / (double)this.lllIlIIllllIIllIIIIllIlIl);
                    --this.lllIlIIllllIIllIIIIllIlIl;
                    this.IlIllllllIIlIIllllIIlIIIl(d3, d4, d2);
                    this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
                }
            } else {
                double d5;
                double d6;
                d3 = this.lllIIIllIIIIlllIlIIllIIll - this.IlIIlllllIIlIlIlllllIllll;
                double d7 = this.lllIlIIlIIIlIlIIIllIlllIl - this.llIIlIlIlllIIllIlIlllIllI;
                d2 = this.IlIllllllIIlIIllllIIlIIIl - this.IllIIIIllIIllIllIlllIlIIl;
                d = d3 * d3 + d7 * d7 + d2 * d2;
                if (this.lIlIIIlIlIllIlIlIIIlIlIII != null) {
                    this.lllIIIllIIIIlllIlIIllIIll = this.lIlIIIlIlIllIlIlIIIlIlIII.IlIIlllllIIlIlIlllllIllll;
                    this.IlIllllllIIlIIllllIIlIIIl = this.lIlIIIlIlIllIlIlIIIlIlIII.IllIIIIllIIllIllIlllIlIIl;
                    d6 = this.lllIIIllIIIIlllIlIIllIIll - this.IlIIlllllIIlIlIlllllIllll;
                    d5 = this.IlIllllllIIlIIllllIIlIIIl - this.IllIIIIllIIllIllIlllIlIIl;
                    double d8 = Math.sqrt(d6 * d6 + d5 * d5);
                    double d9 = (double)0.4f + d8 / 80.0 - 1.0;
                    if (d9 > 10.0) {
                        d9 = 10.0;
                    }
                    this.lllIlIIlIIIlIlIIIllIlllIl = this.lIlIIIlIlIllIlIlIIIlIlIII.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + d9;
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 2.0;
                    this.IlIllllllIIlIIllllIIlIIIl += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 2.0;
                }
                if (this.lIlIllllIlIIIIIllIIIIlIlI || d < 100.0 || d > 22500.0 || this.lIlIIllllIlIIIIllIIIIlIIl || this.llIlllIIllIlllIlIlIlIIIll) {
                    this.lIllllIIlIIIlIllllllIIIll();
                }
                if ((d7 /= (double) MathHelper.lllIIIllIIIIlllIlIIllIIll(d3 * d3 + d2 * d2)) < (double)(-(f8 = 0.6f))) {
                    d7 = -f8;
                }
                if (d7 > (double)f8) {
                    d7 = f8;
                }
                this.IIlIIlIlIlIllIIlIlIIIIlll += d7 * (double)0.1f;
                this.IIIIlIllIlIIlIIlIllIlIlll = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IIIIlIllIlIIlIIlIllIlIlll);
                d6 = 180.0 - Math.atan2(d3, d2) * 180.0 / Math.PI;
                d5 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(d6 - (double)this.IIIIlIllIlIIlIIlIllIlIlll);
                if (d5 > 50.0) {
                    d5 = 50.0;
                }
                if (d5 < -50.0) {
                    d5 = -50.0;
                }
                object2 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll - this.IlIIlllllIIlIlIlllllIllll, this.lllIlIIlIIIlIlIIIllIlllIl - this.llIIlIlIlllIIllIlIlllIllI, this.IlIllllllIIlIIllllIIlIIIl - this.IllIIIIllIIllIllIlllIlIIl).lllIIIllIIIIlllIlIIllIIll();
                object = class_0864.lllIIIllIIIIlllIlIIllIIll(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f), this.IIlIIlIlIlIllIIlIlIIIIlll, -MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f)).lllIIIllIIIIlllIlIIllIIll();
                f7 = (float)(((class_0864)object).lllIlIIlIIIlIlIIIllIlllIl((class_0864)object2) + 0.5) / 1.5f;
                if (f7 < 0.0f) {
                    f7 = 0.0f;
                }
                this.lIIlllIIIlIIlIllIIIIIlIlI *= 0.8f;
                float f9 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl) * 1.0f + 1.0f;
                double d10 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl) * 1.0 + 1.0;
                if (d10 > 40.0) {
                    d10 = 40.0;
                }
                this.lIIlllIIIlIIlIllIIIIIlIlI = (float)((double)this.lIIlllIIIlIIlIllIIIIIlIlI + d5 * ((double)0.7f / d10 / (double)f9));
                this.IIIIlIllIlIIlIIlIllIlIlll += this.lIIlllIIIlIIlIllIIIIIlIlI * 0.1f;
                f6 = (float)(2.0 / (d10 + 1.0));
                f5 = 0.06f;
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, -1.0f, f5 * (f7 * f6 + (1.0f - f6)));
                if (this.IIlllllIIlIIlIlIIlIIlIlII) {
                    this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI * (double)0.8f, this.IIlIIlIlIlIllIIlIlIIIIlll * (double)0.8f, this.llIIIlllIlllIlIllIIIIllIl * (double)0.8f);
                } else {
                    this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                }
                class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl).lllIIIllIIIIlllIlIIllIIll();
                f4 = (float)(class_08642.lllIlIIlIIIlIlIIIllIlllIl((class_0864)object) + 1.0) / 2.0f;
                f4 = 0.8f + 0.15f * f4;
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)f4;
                this.llIIIlllIlllIlIllIIIIllIl *= (double)f4;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.91f;
            }
            this.lllllIllllIIIIllIIlIlIlII = this.IIIIlIllIlIIlIIlIllIlIlll;
            this.lllIIIlllIlllIIlIllllIIlI.lllIIIIlIlIIlIIlllIIIIIIl = 3.0f;
            this.lllIIIlllIlllIIlIllllIIlI.IIIIlIlIIlIIIIlIlllIlIIII = 3.0f;
            this.lIIlIIIlIlIIlllIlIllIllIl.lllIIIIlIlIIlIIlllIIIIIIl = 2.0f;
            this.lIIlIIIlIlIIlllIlIllIllIl.IIIIlIlIIlIIIIlIlllIlIIII = 2.0f;
            this.lIIlIlIIIIIllIIIIllIlIlII.lllIIIIlIlIIlIIlllIIIIIIl = 2.0f;
            this.lIIlIlIIIIIllIIIIllIlIlII.IIIIlIlIIlIIIIlIlllIlIIII = 2.0f;
            this.lIIIIlIIIIllIlIIllllIlIII.lllIIIIlIlIIlIIlllIIIIIIl = 2.0f;
            this.lIIIIlIIIIllIlIIllllIlIII.IIIIlIlIIlIIIIlIlllIlIIII = 2.0f;
            this.lIIlIlllIIlllIIlllIIlIlII.lllIIIIlIlIIlIIlllIIIIIIl = 3.0f;
            this.lIIlIlllIIlllIIlllIIlIlII.IIIIlIlIIlIIIIlIlllIlIIII = 5.0f;
            this.lIIIlllllllIlllIIllllllll.lllIIIIlIlIIlIIlllIIIIIIl = 2.0f;
            this.lIIIlllllllIlllIIllllllll.IIIIlIlIIlIIIIlIlllIlIIII = 4.0f;
            this.IIllllIIlIlIlIlllIIIllIIl.lllIIIIlIlIIlIIlllIIIIIIl = 3.0f;
            this.IIllllIIlIlIlIlllIIIllIIl.IIIIlIlIIlIIIIlIlllIlIIII = 4.0f;
            f = (float)(this.lllIlIIlIIIlIlIIIllIlllIl(5, 1.0f)[1] - this.lllIlIIlIIIlIlIIIllIlllIl(10, 1.0f)[1]) * 10.0f / 180.0f * (float)Math.PI;
            float f10 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f);
            float f11 = -MathHelper.lllIIIllIIIIlllIlIIllIIll(f);
            float f12 = this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f;
            float f13 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f12);
            float f14 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f12);
            this.lIIlIlllIIlllIIlllIIlIlII.s_();
            this.lIIlIlllIIlllIIlllIIlIlII.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)(f13 * 0.5f), this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl - (double)(f14 * 0.5f), 0.0f, 0.0f);
            this.lIIIlllllllIlllIIllllllll.s_();
            this.lIIIlllllllIlllIIllllllll.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)(f14 * 4.5f), this.llIIlIlIlllIIllIlIlllIllI + 2.0, this.IllIIIIllIIllIllIlllIlIIl + (double)(f13 * 4.5f), 0.0f, 0.0f);
            this.IIllllIIlIlIlIlllIIIllIIl.s_();
            this.IIllllIIlIlIlIlllIIIllIIl.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll - (double)(f14 * 4.5f), this.llIIlIlIlllIIllIlIlllIllI + 2.0, this.IllIIIIllIIllIllIlllIlIIl - (double)(f13 * 4.5f), 0.0f, 0.0f);
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIIllIlIIlIIlllllIlIIllIl == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.lIIIlllllllIlllIIllllllll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(4.0, 2.0, 4.0).lIlllIlllIIIIlIIlllIllIII(0.0, -2.0, 0.0)));
                this.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllllIIlIlIlIlllIIIllIIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(4.0, 2.0, 4.0).lIlllIlllIIIIlIIlllIllIII(0.0, -2.0, 0.0)));
                this.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.lllIIIlllIlllIIlIllllIIlI.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(1.0, 1.0, 1.0)));
            }
            object2 = this.lllIlIIlIIIlIlIIIllIlllIl(5, 1.0f);
            object = this.lllIlIIlIIIlIlIIIllIlllIl(0, 1.0f);
            f8 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f - this.lIIlllIIIlIIlIllIIIIIlIlI * 0.01f);
            f7 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f - this.lIIlllIIIlIIlIllIIIIIlIlI * 0.01f);
            this.lllIIIlllIlllIIlIllllIIlI.s_();
            this.lllIIIlllIlllIIlIllllIIlI.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll + (double)(f8 * 5.5f * f10), this.llIIlIlIlllIIllIlIlllIllI + (object[1] - object2[1]) * 1.0 + (double)(f11 * 5.5f), this.IllIIIIllIIllIllIlllIlIIl - (double)(f7 * 5.5f * f10), 0.0f, 0.0f);
            for (int i = 0; i < 3; ++i) {
                class_1172 class_11722 = null;
                if (i == 0) {
                    class_11722 = this.lIIlIIIlIlIIlllIlIllIllIl;
                }
                if (i == 1) {
                    class_11722 = this.lIIlIlIIIIIllIIIIllIlIlII;
                }
                if (i == 2) {
                    class_11722 = this.lIIIIlIIIIllIlIIllllIlIII;
                }
                double[] arrd = this.lllIlIIlIIIlIlIIIllIlllIl(12 + i * 2, 1.0f);
                f6 = this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f + this.lllIlIIlIIIlIlIIIllIlllIl(arrd[0] - object2[0]) * (float)Math.PI / 180.0f * 1.0f;
                f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f6);
                float f15 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f6);
                f4 = 1.5f;
                float f16 = (float)(i + 1) * 2.0f;
                class_11722.s_();
                class_11722.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll - (double)((f13 * f4 + f5 * f16) * f10), this.llIIlIlIlllIIllIlIlllIllI + (arrd[1] - object2[1]) * 1.0 - (double)((f16 + f4) * f11) + 1.5, this.IllIIIIllIIllIllIlllIlIIl + (double)((f14 * f4 + f15 * f16) * f10), 0.0f, 0.0f);
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.IIlllllIIlIIlIlIIlIIlIlII = this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlllIlllIIlIllllIIlI.IIllIllIIllIIlllIIIlIlllI) | this.lllIIIllIIIIlllIlIIllIIll(this.lIIlIlllIIlllIIlllIIlIlII.IIllIllIIllIIlllIIIlIlllI);
            }
        }
    }

    private void IlIIIIIllllllIIlllIllllll() {
        if (this.IlIlIIllIlIlIIIIIlIlllllI != null) {
            if (this.IlIlIIllIlIlIIIIIlIlllllI.IllllIIIIlIIlIIIIlllIIIIl) {
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                    this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIlllIlllIIlIllllIIlI, class_0058.lllIIIllIIIIlllIlIIllIIll((class_1013)null), 10.0f);
                }
                this.IlIlIIllIlIlIIIIIlIlllllI = null;
            } else if (this.IlllIIIllllIIllIllIlIIlIl % 10 == 0 && this.lllIIIlllIlllIIlIllllIIlI() < this.IIllllIIlIlIlIlllIIIllIIl()) {
                this.IllIIIllIIIIlIlIlIllIIlll(this.lllIIIlllIlllIIlIllllIIlI() + 1.0f);
            }
        }
        if (this.IlllIIlllllllIIllIlIllllI.nextInt(10) == 0) {
            float f = 32.0f;
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_0355.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f, f, f));
            class_0355 class_03552 = null;
            double d = Double.MAX_VALUE;
            for (class_0355 class_03553 : list) {
                double d2 = class_03553.IlIIIIIllllllIIlllIllllll(this);
                if (!(d2 < d)) continue;
                d = d2;
                class_03552 = class_03553;
            }
            this.IlIlIIllIlIlIIIIIlIlllllI = class_03552;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(List list) {
        double d = (this.lIIlIlllIIlllIIlllIIlIlII.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll + this.lIIlIlllIIlllIIlllIIlIlII.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII) / 2.0;
        double d2 = (this.lIIlIlllIIlllIIlllIIlIlII.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl + this.lIIlIlllIIlllIIlllIIlIlII.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll) / 2.0;
        for (class_1521 class_15212 : list) {
            if (!(class_15212 instanceof class_1965)) continue;
            double d3 = class_15212.IlIIlllllIIlIlIlllllIllll - d;
            double d4 = class_15212.IllIIIIllIIllIllIlllIlIIl - d2;
            double d5 = d3 * d3 + d4 * d4;
            class_15212.IllIIlllllllIIlIIlIIIIlIl(d3 / d5 * 4.0, 0.2f, d4 / d5 * 4.0);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(List list) {
        for (int i = 0; i < list.size(); ++i) {
            class_1521 class_15212 = (class_1521)list.get(i);
            if (!(class_15212 instanceof class_1965)) continue;
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this), 10.0f);
        }
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        this.lIlIllllIlIIIIIllIIIIlIlI = false;
        if (this.IlllIIlllllllIIllIlIllllI.nextInt(2) == 0 && !this.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll.isEmpty()) {
            this.lIlIIIlIlIllIlIlIIIlIlIII = (class_1521)this.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll.get(this.IlllIIlllllllIIllIlIllllI.nextInt(this.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll.size()));
        } else {
            double d;
            double d2;
            double d3;
            boolean bl = false;
            do {
                this.lllIIIllIIIIlllIlIIllIIll = 0.0;
                this.lllIlIIlIIIlIlIIIllIlllIl = 70.0f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 50.0f;
                this.IlIllllllIIlIIllllIIlIIIl = 0.0;
                this.lllIIIllIIIIlllIlIIllIIll += (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 120.0f - 60.0f);
                this.IlIllllllIIlIIllllIIlIIIl += (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 120.0f - 60.0f);
            } while (!(bl = (d3 = this.IlIIlllllIIlIlIlllllIllll - this.lllIIIllIIIIlllIlIIllIIll) * d3 + (d2 = this.llIIlIlIlllIIllIlIlllIllI - this.lllIlIIlIIIlIlIIIllIlllIl) * d2 + (d = this.IllIIIIllIIllIllIlllIlIIl - this.IlIllllllIIlIIllllIIlIIIl) * d > 100.0));
            this.lIlIIIlIlIllIlIlIIIlIlIII = null;
        }
    }

    private float lllIlIIlIIIlIlIIIllIlllIl(double d) {
        return (float) MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(d);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_1974 class_19742) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lllIlIIlIIIlIlIIIllIlllIl);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIllllllIIlIIllllIIlIIIl);
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIlllIlllIIIIlIIlllIllIII);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.IlIIIIIllllllIIlllIllllll);
        int n6 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19742.lIllllIIlIIIlIllllllIIIll);
        boolean bl = false;
        boolean bl2 = false;
        for (int i = n; i <= n4; ++i) {
            for (int j = n2; j <= n5; ++j) {
                for (int k = n3; k <= n6; ++k) {
                    Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(i, j, k);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                    if (class_05492 != Blocks.obsidian && class_05492 != Blocks.IlIIIIIIllIIlIllIIllIllIl && class_05492 != Blocks.IllIIlllllllIIlIIlIIIIlIl && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
                        bl2 = this.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll(i, j, k) || bl2;
                        continue;
                    }
                    bl = true;
                }
            }
        }
        if (bl2) {
            double d = class_19742.lllIIIllIIIIlllIlIIllIIll + (class_19742.lIlllIlllIIIIlIIlllIllIII - class_19742.lllIIIllIIIIlllIlIIllIIll) * (double)this.IlllIIlllllllIIllIlIllllI.nextFloat();
            double d2 = class_19742.lllIlIIlIIIlIlIIIllIlllIl + (class_19742.IlIIIIIllllllIIlllIllllll - class_19742.lllIlIIlIIIlIlIIIllIlllIl) * (double)this.IlllIIlllllllIIllIlIllllI.nextFloat();
            double d3 = class_19742.IlIllllllIIlIIllllIIlIIIl + (class_19742.lIllllIIlIIIlIllllllIIIll - class_19742.IlIllllllIIlIIllllIIlIIIl) * (double)this.IlllIIlllllllIIllIlIllllI.nextFloat();
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("largeexplode", d, d2, d3, 0.0, 0.0, 0.0);
        }
        return bl;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1172 class_11722, class_0058 class_00582, float f) {
        if (class_11722 != this.lllIIIlllIlllIIlIllllIIlI) {
            f = f / 4.0f + 1.0f;
        }
        float f2 = this.IIIIlIllIlIIlIIlIllIlIlll * (float)Math.PI / 180.0f;
        float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f2);
        float f4 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f2);
        this.lllIIIllIIIIlllIlIIllIIll = this.IlIIlllllIIlIlIlllllIllll + (double)(f3 * 5.0f) + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 2.0f);
        this.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 3.0f) + 1.0;
        this.IlIllllllIIlIIllllIIlIIIl = this.IllIIIIllIIllIllIlllIlIIl - (double)(f4 * 5.0f) + (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 2.0f);
        this.lIlIIIlIlIllIlIlIIIlIlIII = null;
        if (class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_0814 || class_00582.IlIllllllIIlIIllllIIlIIIl()) {
            this.IlIIIIIllllllIIlllIllllll(class_00582, f);
        }
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        return false;
    }

    protected boolean IlIIIIIllllllIIlllIllllll(class_0058 class_00582, float f) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_00582, f);
    }

    @Override
    protected void llIllIllIllIlIlIllIlIIIIl() {
        ++this.IIlIlIIIIlIlllIlIlIIIIIlI;
        if (this.IIlIlIIIIlIlllIlIlIIIIIlI >= 180 && this.IIlIlIIIIlIlllIlIlIIIIIlI <= 200) {
            float f = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 8.0f;
            float f2 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 4.0f;
            float f3 = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 8.0f;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("hugeexplosion", this.IlIIlllllIIlIlIlllllIllll + (double)f, this.llIIlIlIlllIIllIlIlllIllI + 2.0 + (double)f2, this.IllIIIIllIIllIllIlllIlIIl + (double)f3, 0.0, 0.0, 0.0);
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (this.IIlIlIIIIlIlllIlIlIIIIIlI > 150 && this.IIlIlIIIIlIlllIlIlIIIIIlI % 5 == 0) {
                int n;
                for (int i = 1000; i > 0; i -= n) {
                    n = class_1138.lllIIIllIIIIlllIlIIllIIll(i);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1138(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, n));
                }
            }
            if (this.IIlIlIIIIlIlllIlIlIIIIIlI == 1) {
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(1018, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
            }
        }
        this.IlIIIIIllllllIIlllIllllll(0.0, 0.1f, 0.0);
        this.lllllIllllIIIIllIIlIlIlII = this.IIIIlIllIlIIlIIlIllIlIlll += 20.0f;
        if (this.IIlIlIIIIlIlllIlIlIIIIIlI == 200 && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            int n;
            for (int i = 2000; i > 0; i -= n) {
                n = class_1138.lllIIIllIIIIlllIlIIllIIll(i);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1138(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, n));
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl));
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3 = 64;
        class_0182.llllllIlIllllIlIlIlIIIIlI = true;
        int n4 = 4;
        for (int i = n3 - 1; i <= n3 + 32; ++i) {
            for (int j = n - n4; j <= n + n4; ++j) {
                for (int k = n2 - n4; k <= n2 + n4; ++k) {
                    double d = j - n;
                    double d2 = k - n2;
                    double d3 = d * d + d2 * d2;
                    if (!(d3 <= ((double)n4 - 0.5) * ((double)n4 - 0.5))) continue;
                    if (i < n3) {
                        if (!(d3 <= ((double)(n4 - 1) - 0.5) * ((double)(n4 - 1) - 0.5))) continue;
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(j, i, k, Blocks.IllIIlllllllIIlIIlIIIIlIl);
                        continue;
                    }
                    if (i > n3) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(j, i, k, Blocks.lllIIIllIIIIlllIlIIllIIll);
                        continue;
                    }
                    if (d3 > ((double)(n4 - 1) - 0.5) * ((double)(n4 - 1) - 0.5)) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(j, i, k, Blocks.IllIIlllllllIIlIIlIIIIlIl);
                        continue;
                    }
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(j, i, k, Blocks.IllIIIIIllIlIIllIllllllIl);
                }
            }
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n3 + 0, n2, Blocks.IllIIlllllllIIlIIlIIIIlIl);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n3 + 1, n2, Blocks.IllIIlllllllIIlIIlIIIIlIl);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n3 + 2, n2, Blocks.IllIIlllllllIIlIIlIIIIlIl);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n - 1, n3 + 2, n2, Blocks.lIIIlIIIlIlllIllIIIlIIIlI);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n + 1, n3 + 2, n2, Blocks.lIIIlIIIlIlllIllIIIlIIIlI);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n3 + 2, n2 - 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n3 + 2, n2 + 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n3 + 3, n2, Blocks.IllIIlllllllIIlIIlIIIIlIl);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n3 + 4, n2, Blocks.dragon_egg);
        class_0182.llllllIlIllllIlIlIlIIIIlI = false;
    }

    @Override
    public void IllIlllIIIlllllIllIIlIlIl() {
    }

    @Override
    public class_1521[] lIIllllllllIlIllllllllIlI() {
        return this.lIIIlIllllIlllIIIIIllIIIl;
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return false;
    }

    @Override
    public class_1334 lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.enderdragon.growl";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.enderdragon.hit";
    }

    @Override
    protected float IIlIlIIIIlIlllIlIlIIIIIlI() {
        return 5.0f;
    }
}

