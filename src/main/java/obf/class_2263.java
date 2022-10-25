package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_2263
extends class_1521 {
    private boolean lllIIIllIIIIlllIlIIllIIll = true;
    private double lllIlIIlIIIlIlIIIllIlllIl = 0.07;
    private int IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;
    private double IIIllIIlIIIIIIlIlIIllIIlI;
    private double IllIIlllllllIIlIIlIIIIlIl;
    private double IIIllIllIIlIlIlIlIllllIIl;
    private double IllIIIllIIIIlIlIlIllIIlll;
    private double lIIIIlIlIIlllllIIllIIlIII;

    public class_2263(class_1334 class_13342) {
        super(class_13342);
        this.lIIlIIIIIlIlllIlIIlIlIlll = true;
        this.IlIIIIIllllllIIlllIllllll(1.5f, 0.6f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(17, new Integer(0));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(18, new Integer(1));
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(19, new Float(0.0f));
    }

    @Override
    public class_1974 IIIllIIlIIIIIIlIlIIllIIlI(class_1521 class_15212) {
        return class_15212.IIllIllIIllIIlllIIIlIlllI;
    }

    @Override
    public class_1974 IllIIIllIIIIlIlIlIllIIlll() {
        return this.IIllIllIIllIIlllIIIlIlllI;
    }

    @Override
    public boolean lIIIIlIlIIlllllIIllIIlIII() {
        return true;
    }

    public class_2263(class_1334 class_13342, double d, double d2, double d3) {
        this(class_13342);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2 + (double)this.llllIlIIIIIIIIIlllIIlIIIl, d3);
        this.IIIIIIIIlIllIIllIIlllIllI = 0.0;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.0;
        this.llIIIlllIlllIlIllIIIIllIl = 0.0;
        this.llIIlIllIllllIlIIIIlIIlll = d;
        this.llIllllIlIllIIIlIllIIlIlI = d2;
        this.lIlllIlllIlIIIIlllIlIlIIl = d3;
    }

    @Override
    public double llllIlIIllIIlllllIIllIIll() {
        return (double)this.lllIIIIlIlIIlIIlllIIIIIIl * 0.0 - (double)0.3f;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IllllIIIIlIIlIIIIlllIIIIl) {
            boolean bl;
            this.lllIlIIlIIIlIlIIIllIlllIl(-this.IlIIIIIllllllIIlllIllllll());
            this.lllIIIllIIIIlllIlIIllIIll(10);
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl() + f * 10.0f);
            this.IIlIllIIlllllIIlIIllllIIl();
            boolean bl2 = bl = class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_0814 && ((class_0814)class_00582.IllIIIllIIIIlIlIlIllIIlll()).lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII;
            if (bl || this.IlIllllllIIlIIllllIIlIIIl() > 40.0f) {
                if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
                    this.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(this);
                }
                if (!bl) {
                    this.lllIIIllIIIIlllIlIIllIIll(Items.boat, 1, 0.0f);
                }
                this.IIIIlIIlIIIllIIIIllIIIlII();
            }
            return true;
        }
        return true;
    }

    @Override
    public void llIIIlIlIlIIlIllIIIllIlIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl(-this.IlIIIIIllllllIIlllIllllll());
        this.lllIIIllIIIIlllIlIIllIIll(10);
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl() * 11.0f);
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2, int n) {
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            this.IlIllllllIIlIIllllIIlIIIl = n + 5;
        } else {
            double d4 = d - this.IlIIlllllIIlIlIlllllIllll;
            double d5 = d2 - this.llIIlIlIlllIIllIlIlllIllI;
            double d6 = d3 - this.IllIIIIllIIllIllIlllIlIIl;
            double d7 = d4 * d4 + d5 * d5 + d6 * d6;
            if (d7 <= 1.0) {
                return;
            }
            this.IlIllllllIIlIIllllIIlIIIl = 3;
        }
        this.lIlllIlllIIIIlIIlllIllIII = d;
        this.IlIIIIIllllllIIlllIllllll = d2;
        this.lIllllIIlIIIlIllllllIIIll = d3;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
        this.IllIIlllllllIIlIIlIIIIlIl = f2;
        this.IIIIIIIIlIllIIllIIlllIllI = this.IIIllIllIIlIlIlIlIllllIIl;
        this.IIlIIlIlIlIllIIlIlIIIIlll = this.IllIIIllIIIIlIlIlIllIIlll;
        this.llIIIlllIlllIlIllIIIIllIl = this.lIIIIlIlIIlllllIIllIIlIII;
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(double d, double d2, double d3) {
        this.IIIllIllIIlIlIlIlIllllIIl = this.IIIIIIIIlIllIIllIIlllIllI = d;
        this.IllIIIllIIIIlIlIlIllIIlll = this.IIlIIlIlIlIllIIlIlIIIIlll = d2;
        this.lIIIIlIlIIlllllIIllIIlIII = this.llIIIlllIlllIlIllIIIIllIl = d3;
    }

    @Override
    public void s_() {
        double d;
        double d2;
        int n;
        double d3;
        double d4;
        super.s_();
        if (this.lIlllIlllIIIIlIIlllIllIII() > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII() - 1);
        }
        if (this.IlIllllllIIlIIllllIIlIIIl() > 0.0f) {
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl() - 1.0f);
        }
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        int n2 = 5;
        double d5 = 0.0;
        for (int i = 0; i < n2; ++i) {
            double d6 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll - this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) * (double)(i + 0) / (double)n2 - 0.125;
            double d7 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll - this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) * (double)(i + 1) / (double)n2 - 0.125;
            class_1974 class_19742 = class_1974.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll, d6, this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl, this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII, d7, this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll);
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_19742, class_1855.IllIIlllllllIIlIIlIIIIlIl)) continue;
            d5 += 1.0 / (double)n2;
        }
        double d8 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
        if (d8 > 0.26249999999999996) {
            d4 = Math.cos((double)this.IIIIlIllIlIIlIIlIllIlIlll * Math.PI / 180.0);
            d3 = Math.sin((double)this.IIIIlIllIlIIlIIlIllIlIlll * Math.PI / 180.0);
            n = 0;
            while ((double)n < 1.0 + d8 * 60.0) {
                double d9;
                double d10;
                d2 = this.IlllIIlllllllIIllIlIllllI.nextFloat() * 2.0f - 1.0f;
                d = (double)(this.IlllIIlllllllIIllIlIllllI.nextInt(2) * 2 - 1) * 0.7;
                if (this.IlllIIlllllllIIllIlIllllI.nextBoolean()) {
                    d10 = this.IlIIlllllIIlIlIlllllIllll - d4 * d2 * 0.8 + d3 * d;
                    d9 = this.IllIIIIllIIllIllIlllIlIIl - d3 * d2 * 0.8 - d4 * d;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("splash", d10, this.llIIlIlIlllIIllIlIlllIllI - 0.125, d9, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                } else {
                    d10 = this.IlIIlllllIIlIlIlllllIllll + d4 + d3 * d2 * 0.7;
                    d9 = this.IllIIIIllIIllIllIlllIlIIl + d3 - d4 * d2 * 0.7;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("splash", d10, this.llIIlIlIlllIIllIlIlllIllI - 0.125, d9, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                }
                ++n;
            }
        }
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lllIIIllIIIIlllIlIIllIIll) {
            if (this.IlIllllllIIlIIllllIIlIIIl > 0) {
                d4 = this.IlIIlllllIIlIlIlllllIllll + (this.lIlllIlllIIIIlIIlllIllIII - this.IlIIlllllIIlIlIlllllIllll) / (double)this.IlIllllllIIlIIllllIIlIIIl;
                d3 = this.llIIlIlIlllIIllIlIlllIllI + (this.IlIIIIIllllllIIlllIllllll - this.llIIlIlIlllIIllIlIlllIllI) / (double)this.IlIllllllIIlIIllllIIlIIIl;
                d2 = this.IllIIIIllIIllIllIlllIlIIl + (this.lIllllIIlIIIlIllllllIIIll - this.IllIIIIllIIllIllIlllIlIIl) / (double)this.IlIllllllIIlIIllllIIlIIIl;
                d = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IIIllIIlIIIIIIlIlIIllIIlI - (double)this.IIIIlIllIlIIlIIlIllIlIlll);
                this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + d / (double)this.IlIllllllIIlIIllllIIlIIIl);
                this.IlIlIIlllIllllllllIIIlIlI = (float)((double)this.IlIlIIlllIllllllllIIIlIlI + (this.IllIIlllllllIIlIIlIIIIlIl - (double)this.IlIlIIlllIllllllllIIIlIlI) / (double)this.IlIllllllIIlIIllllIIlIIIl);
                --this.IlIllllllIIlIIllllIIlIIIl;
                this.IlIllllllIIlIIllllIIlIIIl(d4, d3, d2);
                this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            } else {
                d4 = this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI;
                d3 = this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll;
                d2 = this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl;
                this.IlIllllllIIlIIllllIIlIIIl(d4, d3, d2);
                if (this.llllllIlIllllIlIlIlIIIIlI) {
                    this.IIIIIIIIlIllIIllIIlllIllI *= 0.5;
                    this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.5;
                    this.llIIIlllIlllIlIllIIIIllIl *= 0.5;
                }
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.99f;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.95f;
                this.llIIIlllIlllIlIllIIIIllIl *= (double)0.99f;
            }
        } else {
            double d11;
            int n3;
            if (d5 < 1.0) {
                d4 = d5 * 2.0 - 1.0;
                this.IIlIIlIlIlIllIIlIlIIIIlll += (double)0.04f * d4;
            } else {
                if (this.IIlIIlIlIlIllIIlIlIIIIlll < 0.0) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll /= 2.0;
                }
                this.IIlIIlIlIlIllIIlIlIIIIlll += (double)0.007f;
            }
            if (this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_1965) {
                class_1965 class_19652 = (class_1965)this.lIlIlIIlIIIIlIIIIIlllIIII;
                float f = this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIlIIlIllIlIlll + -class_19652.IlllIIIlIIlIIIIllllIllllI * 90.0f;
                this.IIIIIIIIlIllIIllIIlllIllI += -Math.sin(f * (float)Math.PI / 180.0f) * this.lllIlIIlIIIlIlIIIllIlllIl * (double)class_19652.llIlIIIlllIIIllIllllIIIll * (double)0.05f;
                this.llIIIlllIlllIlIllIIIIllIl += Math.cos(f * (float)Math.PI / 180.0f) * this.lllIlIIlIIIlIlIIIllIlllIl * (double)class_19652.llIlIIIlllIIIllIllllIIIll * (double)0.05f;
            }
            if ((d4 = Math.sqrt(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl)) > 0.35) {
                d3 = 0.35 / d4;
                this.IIIIIIIIlIllIIllIIlllIllI *= d3;
                this.llIIIlllIlllIlIllIIIIllIl *= d3;
                d4 = 0.35;
            }
            if (d4 > d8 && this.lllIlIIlIIIlIlIIIllIlllIl < 0.35) {
                this.lllIlIIlIIIlIlIIIllIlllIl += (0.35 - this.lllIlIIlIIIlIlIIIllIlllIl) / 35.0;
                if (this.lllIlIIlIIIlIlIIIllIlllIl > 0.35) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = 0.35;
                }
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl -= (this.lllIlIIlIIIlIlIIIllIlllIl - 0.07) / 35.0;
                if (this.lllIlIIlIIIlIlIIIllIlllIl < 0.07) {
                    this.lllIlIIlIIIlIlIIIllIlllIl = 0.07;
                }
            }
            for (n3 = 0; n3 < 4; ++n3) {
                int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + ((double)(n3 % 2) - 0.5) * 0.8);
                n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl + ((double)(n3 / 2) - 0.5) * 0.8);
                for (int i = 0; i < 2; ++i) {
                    int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI) + i;
                    Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n4, n5, n);
                    if (class_05492 == Blocks.lIIllIIlIIIlllIlllIIlIIlI) {
                        this.lIlIllIIlIIlIIlIIlIIlIIll.lIllllIIlIIIlIllllllIIIll(n4, n5, n);
                        this.lIlIIllllIlIIIIllIIIIlIIl = false;
                        continue;
                    }
                    if (class_05492 != Blocks.IlIIIIIIIIIIlIIlllIIIlIlI) continue;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n4, n5, n, true);
                    this.lIlIIllllIlIIIIllIIIIlIIl = false;
                }
            }
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                this.IIIIIIIIlIllIIllIIlllIllI *= 0.5;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.5;
                this.llIIIlllIlllIlIllIIIIllIl *= 0.5;
            }
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            if (this.lIlIIllllIlIIIIllIIIIlIIl && d8 > 0.2) {
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IllllIIIIlIIlIIIIlllIIIIl) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                    for (n3 = 0; n3 < 3; ++n3) {
                        this.lllIIIllIIIIlllIlIIllIIll(Item.getItemFromBlock(Blocks.lIllllIIlIIIlIllllllIIIll), 1, 0.0f);
                    }
                    for (n3 = 0; n3 < 2; ++n3) {
                        this.lllIIIllIIIIlllIlIIllIIll(Items.llIllllIlIllIIIlIllIIlIlI, 1, 0.0f);
                    }
                }
            } else {
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.99f;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.95f;
                this.llIIIlllIlllIlIllIIIIllIl *= (double)0.99f;
            }
            this.IlIlIIlllIllllllllIIIlIlI = 0.0f;
            d3 = this.IIIIlIllIlIIlIIlIllIlIlll;
            d2 = this.llIIlIllIllllIlIIIIlIIlll - this.IlIIlllllIIlIlIlllllIllll;
            d = this.lIlllIlllIlIIIIlllIlIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            if (d2 * d2 + d * d > 0.001) {
                d3 = (float)(Math.atan2(d, d2) * 180.0 / Math.PI);
            }
            if ((d11 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(d3 - (double)this.IIIIlIllIlIIlIIlIllIlIlll)) > 20.0) {
                d11 = 20.0;
            }
            if (d11 < -20.0) {
                d11 = -20.0;
            }
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + d11);
            this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(0.2f, 0.0, 0.2f));
                if (list != null && !list.isEmpty()) {
                    for (int i = 0; i < list.size(); ++i) {
                        class_1521 class_15212 = (class_1521)list.get(i);
                        if (class_15212 == this.lIlIlIIlIIIIlIIIIIlllIIII || !class_15212.lIIIIlIlIIlllllIIllIIlIII() || !(class_15212 instanceof class_2263)) continue;
                        class_15212.lIllllIIlIIIlIllllllIIIll(this);
                    }
                }
                if (this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lIlIlIIlIIIIlIIIIIlllIIII.IllllIIIIlIIlIIIIlllIIIIl) {
                    this.lIlIlIIlIIIIlIIIIIlllIIII = null;
                }
            }
        }
    }

    @Override
    public void IIIlIlIllIlllllIlIllllllI() {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            double d = Math.cos((double)this.IIIIlIllIlIIlIIlIllIlIlll * Math.PI / 180.0) * 0.4;
            double d2 = Math.sin((double)this.IIIIlIllIlIIlIIlIllIlIlll * Math.PI / 180.0) * 0.4;
            this.lIlIlIIlIIIIlIIIIIlllIIII.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll + d, this.llIIlIlIlllIIllIlIlllIllI + this.llllIlIIllIIlllllIIllIIll() + this.lIlIlIIlIIIIlIIIIIlllIIII.IIIIlIllIlIIIIIllllIIlllI(), this.IllIIIIllIIllIllIlllIlIIl + d2);
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    @Override
    public boolean b_(class_0814 class_08142) {
        if (this.lIlIlIIlIIIIlIIIIIlllIIII != null && this.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_0814 && this.lIlIlIIlIIIIlIIIIIlllIIII != class_08142) {
            return true;
        }
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(this);
        }
        return true;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(double d, boolean bl) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
        if (bl) {
            if (this.lIIIllIIIIIllllIlIlIllIll > 3.0f) {
                this.lIllllIIlIIIlIllllllIIIll(this.lIIIllIIIIIllllIlIlIllIll);
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.IllllIIIIlIIlIIIIlllIIIIl) {
                    int n4;
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                    for (n4 = 0; n4 < 3; ++n4) {
                        this.lllIIIllIIIIlllIlIIllIIll(Item.getItemFromBlock(Blocks.lIllllIIlIIIlIllllllIIIll), 1, 0.0f);
                    }
                    for (n4 = 0; n4 < 2; ++n4) {
                        this.lllIIIllIIIIlllIlIIllIIll(Items.llIllllIlIllIIIlIllIIlIlI, 1, 0.0f);
                    }
                }
                this.lIIIllIIIIIllllIlIlIllIll = 0.0f;
            }
        } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl && d < 0.0) {
            this.lIIIllIIIIIllllIlIlIllIll = (float)((double)this.lIIIllIIIIIllllIlIlIllIll - d);
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(float f) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(19, Float.valueOf(f));
    }

    public float IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lIlllIlllIIIIlIIlllIllIII(19);
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(17, n);
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(17);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(18, n);
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIllllllIIlIIllllIIlIIIl(18);
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = bl;
    }
}

