package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0779
extends class_1327 {
    private class_1252 lllIIIllIIIIlllIlIIllIIll;
    private class_1965 lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;
    private float IIIllIIlIIIIIIlIlIIllIIlI;

    public class_0779(class_1252 class_12522, double d, float f) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12522;
        this.lIllllIIlIIIlIllllllIIIll = d;
        this.IIIllIIlIIIIIIlIlIIllIIlI = f;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll.IIIIlIllIlIIlIIlIllIlIlll();
        if (this.lllIlIIlIIIlIlIIIllIlllIl == null) {
            return false;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll) > (double)(this.IIIllIIlIIIIIIlIlIIllIIlI * this.IIIllIIlIIIIIIlIlIIllIIlI)) {
            return false;
        }
        class_0864 class_08642 = class_1008.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 16, 7, class_0864.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll, this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI, this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl));
        if (class_08642 == null) {
            return false;
        }
        this.IlIllllllIIlIIllllIIlIIIl = class_08642.lllIIIllIIIIlllIlIIllIIll;
        this.lIlllIlllIIIIlIIlllIllIII = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIIIIIllllllIIlllIllllll = class_08642.IlIllllllIIlIIllllIIlIIIl;
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll() && this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIlllllllIIllIlIllllI() && this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(this.lllIIIllIIIIlllIlIIllIIll) < (double)(this.IIIllIIlIIIIIIlIlIIllIIlI * this.IIIllIIlIIIIIIlIlIIllIIlI);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl = null;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll);
    }
}

