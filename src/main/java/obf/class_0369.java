package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_0369
extends class_1521
implements class_1946 {
    private int lIlllIlllIIIIlIIlllIllIII = -1;
    private int IlIIIIIllllllIIlllIllllll = -1;
    private int lIllllIIlIIIlIllllllIIIll = -1;
    private Block IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public class_1521 IlIllllllIIlIIllllIIlIIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;
    private double llIIlllIllIllllIIIlIIIIII = 2.0;
    private int llIIllIllIlIIlIIllIllllll;

    public class_0369(class_1334 class_13342) {
        super(class_13342);
        this.IlIlIIlllIIlIllIIIlllllIl = 10.0;
        this.IlIIIIIllllllIIlllIllllll(0.5f, 0.5f);
    }

    public class_0369(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342);
        this.IlIlIIlllIIlIllIIIlllllIl = 10.0;
        this.IlIIIIIllllllIIlllIllllll(0.5f, 0.5f);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
    }

    public class_0369(class_1334 class_13342, class_1965 class_19652, class_1965 class_19653, float f, float f2) {
        super(class_13342);
        this.IlIlIIlllIIlIllIIIlllllIl = 10.0;
        this.IlIllllllIIlIIllllIIlIIIl = class_19652;
        if (class_19652 instanceof class_0814) {
            this.lllIIIllIIIIlllIlIIllIIll = 1;
        }
        this.llIIlIlIlllIIllIlIlllIllI = class_19652.llIIlIlIlllIIllIlIlllIllI + (double)class_19652.llIIllIllIlIIlIIllIllllll() - (double)0.1f;
        double d = class_19653.IlIIlllllIIlIlIlllllIllll - class_19652.IlIIlllllIIlIlIlllllIllll;
        double d2 = class_19653.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)(class_19653.lllIIIIlIlIIlIIlllIIIIIIl / 3.0f) - this.llIIlIlIlllIIllIlIlllIllI;
        double d3 = class_19653.IllIIIIllIIllIllIlllIlIIl - class_19652.IllIIIIllIIllIllIlllIlIIl;
        double d4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
        if (d4 >= 1.0E-7) {
            float f3 = (float)(Math.atan2(d3, d) * 180.0 / Math.PI) - 90.0f;
            float f4 = (float)(-(Math.atan2(d2, d4) * 180.0 / Math.PI));
            double d5 = d / d4;
            double d6 = d3 / d4;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_19652.IlIIlllllIIlIlIlllllIllll + d5, this.llIIlIlIlllIIllIlIlllIllI, class_19652.IllIIIIllIIllIllIlllIlIIl + d6, f3, f4);
            this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
            float f5 = (float)d4 * 0.2f;
            this.a_(d, d2 + (double)f5, d3, f, f2);
        }
    }

    public class_0369(class_1334 class_13342, class_1965 class_19652, float f) {
        super(class_13342);
        this.IlIlIIlllIIlIllIIIlllllIl = 10.0;
        this.IlIllllllIIlIIllllIIlIIIl = class_19652;
        if (class_19652 instanceof class_0814) {
            this.lllIIIllIIIIlllIlIIllIIll = 1;
        }
        this.IlIIIIIllllllIIlllIllllll(0.5f, 0.5f);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.llIIlIlIlllIIllIlIlllIllI + (double)class_19652.llIIllIllIlIIlIIllIllllll(), class_19652.IllIIIIllIIllIllIlllIlIIl, class_19652.IIIIlIllIlIIlIIlIllIlIlll, class_19652.IlIlIIlllIllllllllIIIlIlI);
        this.IlIIlllllIIlIlIlllllIllll -= (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * 0.16f);
        this.llIIlIlIlllIIllIlIlllIllI -= (double)0.1f;
        this.IllIIIIllIIllIllIlllIlIIl -= (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * 0.16f);
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        this.IIIIIIIIlIllIIllIIlllIllI = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI);
        this.llIIIlllIlllIlIllIIIIllIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI);
        this.IIlIIlIlIlIllIIlIlIIIIlll = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI);
        this.a_(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl, f * 1.5f, 1.0f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, (Object)0);
    }

    @Override
    public void a_(double d, double d2, double d3, float f, float f2) {
        float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)(this.IlllIIlllllllIIllIlIllllI.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f2;
        d2 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)(this.IlllIIlllllllIIllIlIllllI.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f2;
        d3 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)(this.IlllIIlllllllIIllIlIllllI.nextBoolean() ? -1 : 1) * (double)0.0075f * (double)f2;
        this.IIIIIIIIlIllIIllIIlllIllI = d *= (double)f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d2 *= (double)f;
        this.llIIIlllIlllIlIllIIIIllIl = d3 *= (double)f;
        float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
        this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(d2, f4) * 180.0 / Math.PI);
        this.IllIIIllIIIIlIlIlIllIIlll = 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2, int n) {
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.lIllllIIlIIIlIllllllIIIll(f, f2);
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
            this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI;
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll;
            this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
            this.IllIIIllIIIIlIlIlIllIIlll = 0;
        }
    }

    @Override
    public void s_() {
        Object object;
        Block class_05492;
        super.s_();
        if (this.llIIIIllIIIIIIIlIIIlIIIIl == 0.0f && this.llllIIIIlIIIlIIIIIIlIllll == 0.0f) {
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(this.IIIIIIIIlIllIIllIIlllIllI, this.llIIIlllIlllIlIllIIIIllIl) * 180.0 / Math.PI);
            this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(this.IIlIIlIlIlIllIIlIlIIIIlll, f) * 180.0 / Math.PI);
        }
        if ((class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
            class_05492.IlIllllllIIlIIllllIIlIIIl((class_1843)this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
            object = class_05492.IlIllllllIIlIIllllIIlIIIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
            if (object != null && ((class_1974)object).lllIIIllIIIIlllIlIIllIIll(class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl))) {
                this.IIIllIllIIlIlIlIlIllllIIl = true;
            }
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
            --this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            int n = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
            if (class_05492 == this.IIIllIIlIIIIIIlIlIIllIIlI && n == this.IllIIlllllllIIlIIlIIIIlIl) {
                ++this.IllIIIllIIIIlIlIlIllIIlll;
                if (this.IllIIIllIIIIlIlIlIllIIlll == 1200) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                }
            } else {
                this.IIIllIllIIlIlIlIlIllllIIl = false;
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.llIIIlllIlllIlIllIIIIllIl *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.IllIIIllIIIIlIlIlIllIIlll = 0;
                this.lIIIIlIlIIlllllIIllIIlIII = 0;
            }
        } else {
            float f;
            class_1521 class_15212;
            int n;
            ++this.lIIIIlIlIIlllllIIllIIlIII;
            object = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
            class_1112 class_11122 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_0864)object, class_08642, false, true, false);
            object = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
            if (class_11122 != null) {
                class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(class_11122.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll, class_11122.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl, class_11122.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl);
            }
            class_1521 class_15213 = null;
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl).lllIlIIlIIIlIlIIIllIlllIl(1.0, 1.0, 1.0));
            double d = 0.0;
            for (n = 0; n < list.size(); ++n) {
                double d2;
                class_1974 class_19742;
                class_1112 class_11123;
                class_15212 = (class_1521)list.get(n);
                if (!class_15212.IllllIIlIIIllIlllIlllIllI() || class_15212 == this.IlIllllllIIlIIllllIIlIIIl && this.lIIIIlIlIIlllllIIllIIlIII < 5 || (class_11123 = (class_19742 = class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f = 0.3f, f, f)).lllIIIllIIIIlllIlIIllIIll((class_0864)object, class_08642)) == null || !((d2 = ((class_0864)object).lIlllIlllIIIIlIIlllIllIII(class_11123.lIllllIIlIIIlIllllllIIIll)) < d) && d != 0.0) continue;
                class_15213 = class_15212;
                d = d2;
            }
            if (class_15213 != null) {
                class_11122 = new class_1112(class_15213);
            }
            if (class_11122 != null && class_11122.IIIllIIlIIIIIIlIlIIllIIlI != null && class_11122.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_0814) {
                class_15212 = (class_0814)class_11122.IIIllIIlIIIIIIlIlIIllIIlI;
                if (class_15212.lIIlIlIlIlIllIIlIIllllIll.lllIIIllIIIIlllIlIIllIIll || this.IlIllllllIIlIIllllIIlIIIl instanceof class_0814 && !((class_0814)this.IlIllllllIIlIIllllIIlIIIl).lIlllIlllIIIIlIIlllIllIII((class_0814)class_15212)) {
                    class_11122 = null;
                }
            }
            if (class_11122 != null) {
                if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI != null) {
                    float f2 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll * this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
                    int n2 = MathHelper.lIllllIIlIIIlIllllllIIIll((double)f2 * this.llIIlllIllIllllIIIlIIIIII);
                    if (this.lIlllIlllIIIIlIIlllIllIII()) {
                        n2 += this.IlllIIlllllllIIllIlIllllI.nextInt(n2 / 2 + 2);
                    }
                    class_0058 class_00582 = null;
                    class_00582 = this.IlIllllllIIlIIllllIIlIIIl == null ? class_0058.lllIIIllIIIIlllIlIIllIIll(this, (class_1521)this) : class_0058.lllIIIllIIIIlllIlIIllIIll(this, this.IlIllllllIIlIIllllIIlIIIl);
                    if (this.llIIIIIlIIlIIIIllIIIlIIII() && !(class_11122.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_0793)) {
                        class_11122.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(5);
                    }
                    if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_00582, (float)n2)) {
                        if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_1965) {
                            float f3;
                            class_1965 class_19652 = (class_1965)class_11122.IIIllIIlIIIIIIlIlIIllIIlI;
                            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                                class_19652.IlIlIIlllIIlIllIIIlllllIl(class_19652.IIIllIIIlIlllllllIIIlllll() + 1);
                            }
                            if (this.llIIllIllIlIIlIIllIllllll > 0 && (f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl)) > 0.0f) {
                                class_11122.IIIllIIlIIIIIIlIlIIllIIlI.IllIIlllllllIIlIIlIIIIlIl(this.IIIIIIIIlIllIIllIIlllIllI * (double)this.llIIllIllIlIIlIIllIllllll * (double)0.6f / (double)f3, 0.1, this.llIIIlllIlllIlIllIIIIllIl * (double)this.llIIllIllIlIIlIIllIllllll * (double)0.6f / (double)f3);
                            }
                            if (this.IlIllllllIIlIIllllIIlIIIl != null && this.IlIllllllIIlIIllllIIlIIIl instanceof class_1965) {
                                class_1250.lllIIIllIIIIlllIlIIllIIll(class_19652, this.IlIllllllIIlIIllllIIlIIIl);
                                class_1250.lllIlIIlIIIlIlIIIllIlllIl((class_1965)this.IlIllllllIIlIIllllIIlIIIl, (class_1521)class_19652);
                            }
                            if (this.IlIllllllIIlIIllllIIlIIIl != null && class_11122.IIIllIIlIIIIIIlIlIIllIIlI != this.IlIllllllIIlIIllllIIlIIIl && class_11122.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_0814 && this.IlIllllllIIlIIllllIIlIIIl instanceof class_1822) {
                                ((class_1822)this.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(new class_0742(6, 0.0f));
                            }
                        }
                        this.lllIIIllIIIIlllIlIIllIIll("random.bowhit", 1.0f, 1.2f / (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f + 0.9f));
                        if (!(class_11122.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_0793)) {
                            this.IIIIlIIlIIIllIIIIllIIIlII();
                        }
                    } else {
                        this.IIIIIIIIlIllIIllIIlllIllI *= (double)-0.1f;
                        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)-0.1f;
                        this.llIIIlllIlllIlIllIIIIllIl *= (double)-0.1f;
                        this.IIIIlIllIlIIlIIlIllIlIlll += 180.0f;
                        this.llllIIIIlIIIlIIIIIIlIllll += 180.0f;
                        this.lIIIIlIlIIlllllIIllIIlIII = 0;
                    }
                } else {
                    this.lIlllIlllIIIIlIIlllIllIII = class_11122.lllIlIIlIIIlIlIIIllIlllIl;
                    this.IlIIIIIllllllIIlllIllllll = class_11122.IlIllllllIIlIIllllIIlIIIl;
                    this.lIllllIIlIIIlIllllllIIIll = class_11122.lIlllIlllIIIIlIIlllIllIII;
                    this.IIIllIIlIIIIIIlIlIIllIIlI = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
                    this.IllIIlllllllIIlIIlIIIIlIl = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
                    this.IIIIIIIIlIllIIllIIlllIllI = (float)(class_11122.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll - this.IlIIlllllIIlIlIlllllIllll);
                    this.IIlIIlIlIlIllIIlIlIIIIlll = (float)(class_11122.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl - this.llIIlIlIlllIIllIlIlllIllI);
                    this.llIIIlllIlllIlIllIIIIllIl = (float)(class_11122.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl - this.IllIIIIllIIllIllIlllIlIIl);
                    float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll * this.IIlIIlIlIlIllIIlIlIIIIlll + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
                    this.IlIIlllllIIlIlIlllllIllll -= this.IIIIIIIIlIllIIllIIlllIllI / (double)f4 * (double)0.05f;
                    this.llIIlIlIlllIIllIlIlllIllI -= this.IIlIIlIlIlIllIIlIlIIIIlll / (double)f4 * (double)0.05f;
                    this.IllIIIIllIIllIllIlllIlIIl -= this.llIIIlllIlllIlIllIIIIllIl / (double)f4 * (double)0.05f;
                    this.lllIIIllIIIIlllIlIIllIIll("random.bowhit", 1.0f, 1.2f / (this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f + 0.9f));
                    this.IIIllIllIIlIlIlIlIllllIIl = true;
                    this.lllIlIIlIIIlIlIIIllIlllIl = 7;
                    this.lllIIIllIIIIlllIlIIllIIll(false);
                    if (this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) {
                        this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll, this);
                    }
                }
            }
            if (this.lIlllIlllIIIIlIIlllIllIII()) {
                for (n = 0; n < 4; ++n) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("crit", this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI * (double)n / 4.0, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll * (double)n / 4.0, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl * (double)n / 4.0, -this.IIIIIIIIlIllIIllIIlllIllI, -this.IIlIIlIlIlIllIIlIlIIIIlll + 0.2, -this.llIIIlllIlllIlIllIIIIllIl);
                }
            }
            this.IlIIlllllIIlIlIlllllIllll += this.IIIIIIIIlIllIIllIIlllIllI;
            this.llIIlIlIlllIIllIlIlllIllI += this.IIlIIlIlIlIllIIlIlIIIIlll;
            this.IllIIIIllIIllIllIlllIlIIl += this.llIIIlllIlllIlIllIIIIllIl;
            float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(this.IIIIIIIIlIllIIllIIlllIllI, this.llIIIlllIlllIlIllIIIIllIl) * 180.0 / Math.PI);
            this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(this.IIlIIlIlIlIllIIlIlIIIIlll, f5) * 180.0 / Math.PI);
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
            float f6 = 0.99f;
            f = 0.05f;
            if (this.llIlllIlIIllIlIIIIllIIlIl()) {
                for (int i = 0; i < 4; ++i) {
                    float f7 = 0.25f;
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("bubble", this.IlIIlllllIIlIlIlllllIllll - this.IIIIIIIIlIllIIllIIlllIllI * (double)f7, this.llIIlIlIlllIIllIlIlllIllI - this.IIlIIlIlIlIllIIlIlIIIIlll * (double)f7, this.IllIIIIllIIllIllIlllIlIIl - this.llIIIlllIlllIlIllIIIIllIl * (double)f7, this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                }
                f6 = 0.8f;
            }
            if (this.IllIIIlllllIlIlllIlllllII()) {
                this.IllllIIIIlIIlIIIIlllIIIIl();
            }
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)f6;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)f6;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)f6;
            this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)f;
            this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            this.lllIIIIlIlIIlIIlllIIIIIIl();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("xTile", (short)this.lIlllIlllIIIIlIIlllIllIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("yTile", (short)this.IlIIIIIllllllIIlllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("zTile", (short)this.lIllllIIlIIIlIllllllIIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("life", (short)this.IllIIIllIIIIlIlIlIllIIlll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("inTile", (byte) Block.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI));
        class_07752.lllIIIllIIIIlllIlIIllIIll("inData", (byte)this.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("shake", (byte)this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("inGround", (byte)(this.IIIllIllIIlIlIlIlIllllIIl ? 1 : 0));
        class_07752.lllIIIllIIIIlllIlIIllIIll("pickup", (byte)this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("damage", this.llIIlllIllIllllIIIlIIIIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.IlIIIIIllllllIIlllIllllll("xTile");
        this.IlIIIIIllllllIIlllIllllll = class_07752.IlIIIIIllllllIIlllIllllll("yTile");
        this.lIllllIIlIIIlIllllllIIIll = class_07752.IlIIIIIllllllIIlllIllllll("zTile");
        this.IllIIIllIIIIlIlIlIllIIlll = class_07752.IlIIIIIllllllIIlllIllllll("life");
        this.IIIllIIlIIIIIIlIlIIllIIlI = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIlllIlllIIIIlIIlllIllIII("inTile") & 0xFF);
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lIlllIlllIIIIlIIlllIllIII("inData") & 0xFF;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIlllIlllIIIIlIIlllIllIII("shake") & 0xFF;
        boolean bl = this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lIlllIlllIIIIlIIlllIllIII("inGround") == 1;
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("damage", 99)) {
            this.llIIlllIllIllllIIIlIIIIII = class_07752.IIIllIllIIlIlIlIlIllllIIl("damage");
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("pickup", 99)) {
            this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIlllIlllIIIIlIIlllIllIII("pickup");
        } else if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("player", 99)) {
            this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("player") ? 1 : 0;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IIIllIllIIlIlIlIlIllllIIl && this.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
            boolean bl;
            boolean bl2 = bl = this.lllIIIllIIIIlllIlIIllIIll == 1 || this.lllIIIllIIIIlllIlIIllIIll == 2 && class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII;
            if (this.lllIIIllIIIIlllIlIIllIIll == 1 && !class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.arrow, 1))) {
                bl = false;
            }
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll("random.pop", 0.2f, ((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                class_08142.lllIIIllIIIIlllIlIIllIIll((class_1521)this, 1);
                this.IIIIlIIlIIIllIIIIllIIIlII();
            }
        }
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(double d) {
        this.llIIlllIllIllllIIIlIIIIII = d;
    }

    public double IlIllllllIIlIIllllIIlIIIl() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.llIIllIllIlIIlIIllIllllll = n;
    }

    @Override
    public boolean m_() {
        return false;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 1));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xFFFFFFFE));
        }
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        return (by & 1) != 0;
    }
}

