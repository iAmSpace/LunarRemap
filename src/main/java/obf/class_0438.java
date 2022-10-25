package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0438
extends class_1327 {
    class_1334 lllIIIllIIIIlllIlIIllIIll;
    class_0339 lllIlIIlIIIlIlIIIllIlllIl;
    class_1965 IlIllllllIIlIIllllIIlIIIl;
    int lIlllIlllIIIIlIIlllIllIII;

    public class_0438(class_0339 class_03392) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_03392;
        this.lllIIIllIIIIlllIlIIllIIll = class_03392.lIlIllIIlIIlIIlIIlIIlIIll;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        class_1965 class_19652 = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll();
        if (class_19652 == null) {
            return false;
        }
        this.IlIllllllIIlIIllllIIlIIIl = class_19652;
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.IlIllllllIIlIIllllIIlIIIl.IlllIIlllllllIIllIlIllllI() ? false : (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(this.IlIllllllIIlIIllllIIlIIIl) > 225.0 ? false : !this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll() || this.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIllllllIIlIIllllIIlIIIl = null;
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, 30.0f, 30.0f);
        double d = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f * this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f;
        double d2 = this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll(this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll, this.IlIllllllIIlIIllllIIlIIIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl.IllIIIIllIIllIllIlllIlIIl);
        double d3 = 0.8;
        if (d2 > d && d2 < 16.0) {
            d3 = 1.33;
        } else if (d2 < 225.0) {
            d3 = 0.6;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, d3);
        this.lIlllIlllIIIIlIIlllIllIII = Math.max(this.lIlllIlllIIIIlIIlllIllIII - 1, 0);
        if (d2 <= d && this.lIlllIlllIIIIlIIlllIllIII <= 0) {
            this.lIlllIlllIIIIlIIlllIllIII = 20;
            this.lllIlIIlIIIlIlIIIllIlllIl.llIIllIllIlIIlIIllIllllll(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }
}

