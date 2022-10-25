package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0235
extends class_1327 {
    private class_0339 lllIlIIlIIIlIlIIIllIlllIl;
    protected class_1521 lllIIIllIIIIlllIlIIllIIll;
    private float IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;
    private float IlIIIIIllllllIIlllIllllll;
    private Class lIllllIIlIIIlIllllllIIIll;

    public class_0235(class_0339 class_03392, Class class_, float f) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_03392;
        this.lIllllIIlIIIlIllllllIIIll = class_;
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.IlIIIIIllllllIIlllIllllll = 0.02f;
        this.lllIIIllIIIIlllIlIIllIIll(2);
    }

    public class_0235(class_0339 class_03392, Class class_, float f, float f2) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_03392;
        this.lIllllIIlIIIlIllllllIIIll = class_;
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.IlIIIIIllllllIIlllIllllll = f2;
        this.lllIIIllIIIIlllIlIIllIIll(2);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIlIIlIIIIllllIllllI().nextFloat() >= this.IlIIIIIllllllIIlllIllllll) {
            return false;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll() != null) {
            this.lllIIIllIIIIlllIlIIllIIll = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll();
        }
        this.lllIIIllIIIIlllIlIIllIIll = this.lIllllIIlIIIlIllllllIIIll == class_0814.class ? this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIlIIlIIIlIlIIIllIlllIl, (double)this.IlIllllllIIlIIllllIIlIIIl) : this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lllIlIIlIIIlIlIIIllIlllIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl, 3.0, this.IlIllllllIIlIIllllIIlIIIl), (class_1521)this.lllIlIIlIIIlIlIIIllIlllIl);
        return this.lllIIIllIIIIlllIlIIllIIll != null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.IlllIIlllllllIIllIlIllllI() ? false : (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll) > (double)(this.IlIllllllIIlIIllllIIlIIIl * this.IlIllllllIIlIIllllIIlIIIl) ? false : this.lIlllIlllIIIIlIIlllIllIII > 0);
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lIlllIlllIIIIlIIlllIllIII = 40 + this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIlIIlIIIIllllIllllI().nextInt(40);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll = null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll, this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI + (double)this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(), this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl, 10.0f, this.lllIlIIlIIIlIlIIIllIlllIl.IIIlllIlIIllIIlIlIllIlIIl());
        --this.lIlllIlllIIIIlIIlllIllIII;
    }
}

