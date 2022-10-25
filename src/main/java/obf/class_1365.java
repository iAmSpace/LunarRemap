package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1365
extends class_1327 {
    public final class_0830 lllIIIllIIIIlllIlIIllIIll = new class_2173(this);
    private class_1252 lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private class_1521 IlIIIIIllllllIIlllIllllll;
    private float lIllllIIlIIIlIllllllIIIll;
    private class_2086 IIIllIIlIIIIIIlIlIIllIIlI;
    private class_1939 IllIIlllllllIIlIIlIIIIlIl;
    private Class IIIllIllIIlIlIlIlIllllIIl;

    public class_1365(class_1252 class_12522, Class class_, float f, double d, double d2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_12522;
        this.IIIllIllIIlIlIlIlIllllIIl = class_;
        this.lIllllIIlIIIlIllllllIIIll = f;
        this.IlIllllllIIlIIllllIIlIIIl = d;
        this.lIlllIlllIIIIlIIlllIllIII = d2;
        this.IllIIlllllllIIlIIlIIIIlIl = class_12522.IllIIIIllIIllIllIlllIlIIl();
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        Object object;
        if (this.IIIllIllIIlIlIlIlIllllIIl == class_0814.class) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl instanceof class_2094 && ((class_2094)this.lllIlIIlIIIlIlIIIllIlllIl).lllIIIIlIIllIIIlIllIlllII()) {
                return false;
            }
            this.IlIIIIIllllllIIlllIllllll = this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIlIIlIIIlIlIIIllIlllIl, (double)this.lIllllIIlIIIlIllllllIIIll);
            if (this.IlIIIIIllllllIIlllIllllll == null) {
                return false;
            }
        } else {
            object = this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, this.lllIlIIlIIIlIlIIIllIlllIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(this.lIllllIIlIIIlIllllllIIIll, 3.0, this.lIllllIIlIIIlIllllllIIIll), this.lllIIIllIIIIlllIlIIllIIll);
            if (object.isEmpty()) {
                return false;
            }
            this.IlIIIIIllllllIIlllIllllll = (class_1521)object.get(0);
        }
        if ((object = class_1008.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, 16, 7, class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll.IlIIlllllIIlIlIlllllIllll, this.IlIIIIIllllllIIlllIllllll.llIIlIlIlllIIllIlIlllIllI, this.IlIIIIIllllllIIlllIllllll.IllIIIIllIIllIllIlllIlIIl))) == null) {
            return false;
        }
        if (this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll(((class_0864)object).lllIIIllIIIIlllIlIIllIIll, ((class_0864)object).lllIlIIlIIIlIlIIIllIlllIl, ((class_0864)object).IlIllllllIIlIIllllIIlIIIl) < this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl)) {
            return false;
        }
        this.IIIllIIlIIIIIIlIlIIllIIlI = this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(((class_0864)object).lllIIIllIIIIlllIlIIllIIll, ((class_0864)object).lllIlIIlIIIlIlIIIllIlllIl, ((class_0864)object).IlIllllllIIlIIllllIIlIIIl);
        return this.IIIllIIlIIIIIIlIlIIllIIlI == null ? false : this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll((class_0864)object);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIIIIIllllllIIlllIllllll = null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(this.IlIIIIIllllllIIlllIllllll) < 49.0) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        }
    }

    static /* synthetic */ class_1252 lllIIIllIIIIlllIlIIllIIll(class_1365 class_13652) {
        return class_13652.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

