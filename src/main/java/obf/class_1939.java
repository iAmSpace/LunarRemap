package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1939 {
    private class_0339 lllIIIllIIIIlllIlIIllIIll;
    private class_1334 lllIlIIlIIIlIlIIIllIlllIl;
    private class_2086 IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private class_1685 IlIIIIIllllllIIlllIllllll;
    private boolean lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private class_0864 IIIllIllIIlIlIlIlIllllIIl = class_0864.lllIIIllIIIIlllIlIIllIIll(0.0, 0.0, 0.0);
    private boolean IllIIIllIIIIlIlIlIllIIlll = true;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private boolean llIIlllIllIllllIIIlIIIIII;
    private boolean llIIllIllIlIIlIIllIllllll;

    public class_1939(class_0339 class_03392, class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13342;
        this.IlIIIIIllllllIIlllIllllll = class_03392.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.llIIlllIllIllllIIIlIIIIII = bl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.lIIIIlIlIIlllllIIllIIlIII = bl;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIIIIlIlIIlllllIIllIIlIII;
    }

    public void lIlllIlllIIIIlIIlllIllIII(boolean bl) {
        this.lIllllIIlIIIlIllllllIIIll = bl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(double d) {
        this.lIlllIlllIIIIlIIlllIllIII = d;
    }

    public void IlIIIIIllllllIIlllIllllll(boolean bl) {
        this.llIIllIllIlIIlIIllIllllll = bl;
    }

    public float IlIllllllIIlIIllllIIlIIIl() {
        return (float)this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll();
    }

    public class_2086 lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        return !this.lIIIIlIlIIlllllIIllIIlIII() ? null : this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, MathHelper.IlIllllllIIlIIllllIIlIIIl(d), (int)d2, MathHelper.IlIllllllIIlIIllllIIlIIIl(d3), this.IlIllllllIIlIIllllIIlIIIl(), this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        class_2086 class_20862 = this.lllIIIllIIIIlllIlIIllIIll(MathHelper.IlIllllllIIlIIllllIIlIIIl(d), (int)d2, MathHelper.IlIllllllIIlIIllllIIlIIIl(d3));
        return this.lllIIIllIIIIlllIlIIllIIll(class_20862, d4);
    }

    public class_2086 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return !this.lIIIIlIlIIlllllIIllIIlIII() ? null : this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll, class_15212, this.IlIllllllIIlIIllllIIlIIIl(), this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII, this.llIIlllIllIllllIIIlIIIIII, this.llIIllIllIlIIlIIllIllllll);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, double d) {
        class_2086 class_20862 = this.lllIIIllIIIIlllIlIIllIIll(class_15212);
        return class_20862 != null ? this.lllIIIllIIIIlllIlIIllIIll(class_20862, d) : false;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2086 class_20862, double d) {
        if (class_20862 == null) {
            this.IlIllllllIIlIIllllIIlIIIl = null;
            return false;
        }
        if (!class_20862.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl)) {
            this.IlIllllllIIlIIllllIIlIIIl = class_20862;
        }
        if (this.lIllllIIlIIIlIllllllIIIll) {
            this.llIIllIllIlIIlIIllIllllll();
        }
        if (this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII() == 0) {
            return false;
        }
        this.lIlllIlllIIIIlIIlllIllIII = d;
        class_0864 class_08642 = this.IIIllIllIIlIlIlIlIllllIIl();
        this.IllIIlllllllIIlIIlIIIIlIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll = class_08642.lllIIIllIIIIlllIlIIllIIll;
        this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
        this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl = class_08642.IlIllllllIIlIIllllIIlIIIl;
        return true;
    }

    public class_2086 lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        ++this.IIIllIIlIIIIIIlIlIIllIIlI;
        if (!this.lIllllIIlIIIlIllllllIIIll()) {
            class_0864 class_08642;
            if (this.lIIIIlIlIIlllllIIllIIlIII()) {
                this.IllIIlllllllIIlIIlIIIIlIl();
            }
            if (!this.lIllllIIlIIIlIllllllIIIll() && (class_08642 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll)) != null) {
                this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIlIIIIlllIlIlIIl().lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        int n;
        class_0864 class_08642 = this.IIIllIllIIlIlIlIlIllllIIl();
        int n2 = this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII();
        for (int i = this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll(); i < this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            if (this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll((int)i).lllIlIIlIIIlIlIIIllIlllIl == (int)class_08642.lllIlIIlIIIlIlIIIllIlllIl) continue;
            n2 = i;
            break;
        }
        float f = this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII * this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII;
        for (n = this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll(); n < n2; ++n) {
            if (!(class_08642.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n)) < (double)f)) continue;
            this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(n + 1);
        }
        n = MathHelper.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll.IIIIlIlIIlIIIIlIlllIlIIII);
        int n3 = (int)this.lllIIIllIIIIlllIlIIllIIll.lllIIIIlIlIIlIIlllIIIIIIl + 1;
        int n4 = n;
        for (int i = n2 - 1; i >= this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll(); --i) {
            if (!this.lllIIIllIIIIlllIlIIllIIll(class_08642, this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, i), n, n3, n4)) continue;
            this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(i);
            break;
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI - this.IllIIlllllllIIlIIlIIIIlIl > 100) {
            if (class_08642.IlIIIIIllllllIIlllIllllll(this.IIIllIllIIlIlIlIlIllllIIl) < 2.25) {
                this.IIIllIIlIIIIIIlIlIIllIIlI();
            }
            this.IllIIlllllllIIlIIlIIIIlIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
            this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll = class_08642.lllIIIllIIIIlllIlIIllIIll;
            this.IIIllIllIIlIlIlIlIllllIIl.lllIlIIlIIIlIlIIIllIlllIl = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
            this.IIIllIllIIlIlIlIlIllllIIl.IlIllllllIIlIIllllIIlIIIl = class_08642.IlIllllllIIlIIllllIIlIIIl;
        }
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl == null || this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        this.IlIllllllIIlIIllllIIlIIIl = null;
    }

    private class_0864 IIIllIllIIlIlIlIlIllllIIl() {
        return class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll, this.IllIIIllIIIIlIlIlIllIIlll(), this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl);
    }

    private int IllIIIllIIIIlIlIlIllIIlll() {
        if (this.lllIIIllIIIIlllIlIIllIIll.llIlllIlIIllIlIIIIllIIlIl() && this.llIIllIllIlIIlIIllIllllll) {
            int n = (int)this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
            Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), n, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl));
            int n2 = 0;
            do {
                if (class_05492 != Blocks.IIIllIllIIlIlIlIlIllllIIl && class_05492 != Blocks.IllIIIllIIIIlIlIlIllIIlll) {
                    return n;
                }
                class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), ++n, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl));
            } while (++n2 <= 16);
            return (int)this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return (int)(this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5);
    }

    private boolean lIIIIlIlIIlllllIIllIIlIII() {
        return this.lllIIIllIIIIlllIlIIllIIll.llllllIlIllllIlIlIlIIIIlI || this.llIIllIllIlIIlIIllIllllll && this.llIIlllIllIllllIIIlIIIIII() || this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIllIIIlllIllIIlIllI() && this.lllIIIllIIIIlllIlIIllIIll instanceof class_0724 && this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1554;
    }

    private boolean llIIlllIllIllllIIIlIIIIII() {
        return this.lllIIIllIIIIlllIlIIllIIll.llIlllIlIIllIlIIIIllIIlIl() || this.lllIIIllIIIIlllIlIIllIIll.lIIlIlllIllIlIlllIIIIIIII();
    }

    private void llIIllIllIlIIlIIllIllllll() {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll), (int)(this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + 0.5), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl))) {
            for (int i = 0; i < this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                class_2120 class_21202 = this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(i);
                if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl(class_21202.lllIIIllIIIIlllIlIIllIIll, class_21202.lllIlIIlIIIlIlIIIllIlllIl, class_21202.IlIllllllIIlIIllllIIlIIIl)) continue;
                this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(i - 1);
                return;
            }
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642, class_0864 class_08643, int n, int n2, int n3) {
        int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIIIllIIIIlllIlIIllIIll);
        int n5 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08642.IlIllllllIIlIIllllIIlIIIl);
        double d = class_08643.lllIIIllIIIIlllIlIIllIIll - class_08642.lllIIIllIIIIlllIlIIllIIll;
        double d2 = class_08643.IlIllllllIIlIIllllIIlIIIl - class_08642.IlIllllllIIlIIllllIIlIIIl;
        double d3 = d * d + d2 * d2;
        if (d3 < 1.0E-8) {
            return false;
        }
        double d4 = 1.0 / Math.sqrt(d3);
        if (!this.lllIIIllIIIIlllIlIIllIIll(n4, (int)class_08642.lllIlIIlIIIlIlIIIllIlllIl, n5, n += 2, n2, n3 += 2, class_08642, d *= d4, d2 *= d4)) {
            return false;
        }
        n -= 2;
        n3 -= 2;
        double d5 = 1.0 / Math.abs(d);
        double d6 = 1.0 / Math.abs(d2);
        double d7 = (double)(n4 * 1) - class_08642.lllIIIllIIIIlllIlIIllIIll;
        double d8 = (double)(n5 * 1) - class_08642.IlIllllllIIlIIllllIIlIIIl;
        if (d >= 0.0) {
            d7 += 1.0;
        }
        if (d2 >= 0.0) {
            d8 += 1.0;
        }
        d7 /= d;
        d8 /= d2;
        int n6 = d < 0.0 ? -1 : 1;
        int n7 = d2 < 0.0 ? -1 : 1;
        int n8 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08643.lllIIIllIIIIlllIlIIllIIll);
        int n9 = MathHelper.IlIllllllIIlIIllllIIlIIIl(class_08643.IlIllllllIIlIIllllIIlIIIl);
        int n10 = n8 - n4;
        int n11 = n9 - n5;
        do {
            if (n10 * n6 <= 0 && n11 * n7 <= 0) {
                return true;
            }
            if (d7 < d8) {
                d7 += d5;
                n10 = n8 - (n4 += n6);
                continue;
            }
            d8 += d6;
            n11 = n9 - (n5 += n7);
        } while (this.lllIIIllIIIIlllIlIIllIIll(n4, (int)class_08642.lllIlIIlIIIlIlIIIllIlllIl, n5, n, n2, n3, class_08642, d, d2));
        return false;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6, class_0864 class_08642, double d, double d2) {
        int n7 = n - n4 / 2;
        int n8 = n3 - n6 / 2;
        if (!this.lllIlIIlIIIlIlIIIllIlllIl(n7, n2, n8, n4, n5, n6, class_08642, d, d2)) {
            return false;
        }
        for (int i = n7; i < n7 + n4; ++i) {
            for (int j = n8; j < n8 + n6; ++j) {
                double d3 = (double)i + 0.5 - class_08642.lllIIIllIIIIlllIlIIllIIll;
                double d4 = (double)j + 0.5 - class_08642.IlIllllllIIlIIllllIIlIIIl;
                if (!(d3 * d + d4 * d2 >= 0.0)) continue;
                Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(i, n2 - 1, j);
                class_1855 class_18552 = class_05492.lIllllIIlIIIlIllllllIIIll();
                if (class_18552 == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    return false;
                }
                if (class_18552 == class_1855.IllIIlllllllIIlIIlIIIIlIl && !this.lllIIIllIIIIlllIlIIllIIll.llIlllIlIIllIlIIIIllIIlIl()) {
                    return false;
                }
                if (class_18552 != class_1855.IIIllIllIIlIlIlIlIllllIIl) continue;
                return false;
            }
        }
        return true;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6, class_0864 class_08642, double d, double d2) {
        for (int i = n; i < n + n4; ++i) {
            for (int j = n2; j < n2 + n5; ++j) {
                for (int k = n3; k < n3 + n6; ++k) {
                    Block class_05492;
                    double d3 = (double)i + 0.5 - class_08642.lllIIIllIIIIlllIlIIllIIll;
                    double d4 = (double)k + 0.5 - class_08642.IlIllllllIIlIIllllIIlIIIl;
                    if (!(d3 * d + d4 * d2 >= 0.0) || (class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl.a_(i, j, k)).lllIIIllIIIIlllIlIIllIIll((class_1843)this.lllIlIIlIIIlIlIIIllIlllIl, i, j, k)) continue;
                    return false;
                }
            }
        }
        return true;
    }
}

