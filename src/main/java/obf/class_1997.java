package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1997
extends class_1327 {
    private final class_0339 lllIIIllIIIIlllIlIIllIIll;
    private final class_2176 lllIlIIlIIIlIlIIIllIlllIl;
    private class_1965 IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII = -1;
    private double IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private float IIIllIllIIlIlIlIlIllllIIl;
    private float IllIIIllIIIIlIlIlIllIIlll;

    public class_1997(class_2176 class_21762, double d, int n, float f) {
        this(class_21762, d, n, n, f);
    }

    public class_1997(class_2176 class_21762, double d, int n, int n2, float f) {
        if (!(class_21762 instanceof class_1965)) {
            throw new IllegalArgumentException("ArrowAttackGoal requires Mob implements RangedAttackMob");
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_21762;
        this.lllIIIllIIIIlllIlIIllIIll = (class_0339)((Object)class_21762);
        this.IlIIIIIllllllIIlllIllllll = d;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        this.IllIIlllllllIIlIIlIIIIlIl = n2;
        this.IIIllIllIIlIlIlIlIllllIIl = f;
        this.IllIIIllIIIIlIlIlIllIIlll = f * f;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        class_1965 class_19652 = this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll();
        if (class_19652 == null) {
            return false;
        }
        this.IlIllllllIIlIIllllIIlIIIl = class_19652;
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll() || !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIllllllIIlIIllllIIlIIIl = null;
        this.lIllllIIlIIIlIllllllIIIll = 0;
        this.lIlllIlllIIIIlIIlllIllIII = -1;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        double d = this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll, this.IlIllllllIIlIIllllIIlIIIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl.IllIIIIllIIllIllIlllIlIIl);
        boolean bl = this.lllIIIllIIIIlllIlIIllIIll.IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        this.lIllllIIlIIIlIllllllIIIll = bl ? ++this.lIllllIIlIIIlIllllllIIIll : 0;
        if (d <= (double)this.IllIIIllIIIIlIlIlIllIIlll && this.lIllllIIlIIIlIllllllIIIll >= 20) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.IlIIIIIllllllIIlllIllllll);
        }
        this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 30.0f, 30.0f);
        if (--this.lIlllIlllIIIIlIIlllIllIII == 0) {
            float f;
            if (d > (double)this.IllIIIllIIIIlIlIlIllIIlll || !bl) {
                return;
            }
            float f2 = f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d) / this.IIIllIllIIlIlIlIlIllllIIl;
            if (f < 0.1f) {
                f2 = 0.1f;
            }
            if (f2 > 1.0f) {
                f2 = 1.0f;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, f2);
            this.lIlllIlllIIIIlIIlllIllIII = MathHelper.lIlllIlllIIIIlIIlllIllIII(f * (float)(this.IllIIlllllllIIlIIlIIIIlIl - this.IIIllIIlIIIIIIlIlIIllIIlI) + (float)this.IIIllIIlIIIIIIlIlIIllIIlI);
        } else if (this.lIlllIlllIIIIlIIlllIllIII < 0) {
            float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(d) / this.IIIllIllIIlIlIlIlIllllIIl;
            this.lIlllIlllIIIIlIIlllIllIII = MathHelper.lIlllIlllIIIIlIIlllIllIII(f * (float)(this.IllIIlllllllIIlIIlIIIIlIl - this.IIIllIIlIIIIIIlIlIIllIIlI) + (float)this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
    }
}

