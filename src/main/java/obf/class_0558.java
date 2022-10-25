package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0558
extends class_1327 {
    private class_0339 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_0558(class_0339 class_03392) {
        this.lllIIIllIIIIlllIlIIllIIll = class_03392;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextFloat() < 0.02f;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII >= 0;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        double d = Math.PI * 2 * this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextDouble();
        this.lllIlIIlIIIlIlIIIllIlllIl = Math.cos(d);
        this.IlIllllllIIlIIllllIIlIIIl = Math.sin(d);
        this.lIlllIlllIIIIlIIlllIllIII = 20 + this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(20);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        --this.lIlllIlllIIIIlIIlllIllIII;
        this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll + this.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI + (double)this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(), this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl + this.IlIllllllIIlIIllllIIlIIIl, 10.0f, this.lllIIIllIIIIlllIlIIllIIll.IIIlllIlIIllIIlIlIllIlIIl());
    }
}

