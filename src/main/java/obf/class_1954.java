package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_1954
extends class_1327 {
    class_0003 lllIIIllIIIIlllIlIIllIIll;
    class_0003 lllIlIIlIIIlIlIIIllIlllIl;
    double IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_1954(class_0003 class_00032, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = class_00032;
        this.IlIllllllIIlIIllllIIlIIIl = d;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll.u_() >= 0) {
            return false;
        }
        List list = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.getClass(), this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(8.0, 4.0, 8.0));
        class_0003 class_00032 = null;
        double d = Double.MAX_VALUE;
        for (class_0003 class_00033 : list) {
            double d2;
            if (class_00033.u_() < 0 || !((d2 = this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(class_00033)) <= d)) continue;
            d = d2;
            class_00032 = class_00033;
        }
        if (class_00032 == null) {
            return false;
        }
        if (d < 9.0) {
            return false;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_00032;
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        if (!this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIlllllllIIllIlIllllI()) {
            return false;
        }
        double d = this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl);
        return d >= 9.0 && d <= 256.0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lIlllIlllIIIIlIIlllIllIII = 0;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        if (--this.lIlllIlllIIIIlIIlllIllIII <= 0) {
            this.lIlllIlllIIIIlIIlllIllIII = 10;
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
        }
    }
}

