package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_0338
extends class_1327 {
    private class_1817 lllIIIllIIIIlllIlIIllIIll;
    private class_1965 lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_0338(class_1817 class_18172, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = class_18172;
        this.IlIllllllIIlIIllllIIlIIIl = d;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        Object object2;
        if (this.lllIIIllIIIIlllIlIIllIIll.u_() >= 0) {
            return false;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(400) != 0) {
            return false;
        }
        List list = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1817.class, this.lllIIIllIIIIlllIlIIllIIll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(6.0, 3.0, 6.0));
        double d = Double.MAX_VALUE;
        for (Object object2 : list) {
            double d2;
            if (object2 == this.lllIIIllIIIIlllIlIIllIIll || ((class_1817)object2).lIllIIlllIIIlIlIIIlllIlIl() || ((class_0650)object2).u_() >= 0 || !((d2 = ((class_1521)object2).IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll)) <= d)) continue;
            d = d2;
            this.lllIlIIlIIIlIlIIIllIlllIl = object2;
        }
        return this.lllIlIIlIIIlIlIIIllIlllIl != null || (object2 = class_1008.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 16, 3)) != null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII > 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll(true);
        }
        this.lIlllIlllIIIIlIIlllIllIII = 1000;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll(false);
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        --this.lIlllIlllIIIIlIIlllIllIII;
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            if (this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl) > 4.0) {
                this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
            }
        } else if (this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll()) {
            class_0864 class_08642 = class_1008.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 16, 3);
            if (class_08642 == null) {
                return;
            }
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl, this.IlIllllllIIlIIllllIIlIIIl);
        }
    }
}

