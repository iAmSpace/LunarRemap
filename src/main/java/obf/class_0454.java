package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0454
extends class_1327 {
    private class_1252 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;

    public class_0454(class_1252 class_12522, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12522;
        this.IlIIIIIllllllIIlllIllllll = d;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll.IIIlllllIIIIIllIllIIIIllI() >= 100) {
            return false;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(120) != 0) {
            return false;
        }
        class_0864 class_08642 = class_1008.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 10, 7);
        if (class_08642 == null) {
            return false;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08642.lllIIIllIIIIlllIlIIllIIll;
        this.IlIllllllIIlIIllllIIlIIIl = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
        this.lIlllIlllIIIIlIIlllIllIII = class_08642.IlIllllllIIlIIllllIIlIIIl;
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll);
    }
}

