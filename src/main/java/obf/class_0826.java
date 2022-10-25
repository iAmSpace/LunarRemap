package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0826
extends class_1327 {
    private class_1252 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;

    public class_0826(class_1252 class_12522, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12522;
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll.llIlIIIlllIIIllIllllIIIll() == null && !this.lllIIIllIIIIlllIlIIllIIll.llIIIIIlIIlIIIIllIIIlIIII()) {
            return false;
        }
        class_0864 class_08642 = class_1008.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 5, 4);
        if (class_08642 == null) {
            return false;
        }
        this.IlIllllllIIlIIllllIIlIIIl = class_08642.lllIIIllIIIIlllIlIIllIIll;
        this.lIlllIlllIIIIlIIlllIllIII = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIIIIIllllllIIlllIllllll = class_08642.IlIllllllIIlIIllllIIlIIIl;
        return true;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll();
    }
}

