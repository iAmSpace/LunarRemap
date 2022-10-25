package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0429
extends class_1407 {
    boolean IIIllIllIIlIlIlIlIllllIIl;
    int IllIIIllIIIIlIlIlIllIIlll;

    public class_0429(class_0339 class_03392, boolean bl) {
        super(class_03392);
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
        this.IIIllIllIIlIlIlIlIllllIIl = bl;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl && this.IllIIIllIIIIlIlIlIllIIlll > 0 && super.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IllIIIllIIIIlIlIlIllIIlll = 20;
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, true);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.IIIllIllIIlIlIlIlIllllIIl) {
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, false);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        --this.IllIIIllIIIIlIlIlIllIIlll;
        super.lIlllIlllIIIIlIIlllIllIII();
    }
}

