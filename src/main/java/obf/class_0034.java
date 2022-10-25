package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0034
extends class_1521 {
    public int lllIIIllIIIIlllIlIIllIIll;
    private class_1965 lllIlIIlIIIlIlIIIllIlllIl;

    public class_0034(class_1334 class_13342) {
        super(class_13342);
        this.lIIlIIIIIlIlllIlIIlIlIlll = true;
        this.IlIIIIIllllllIIlllIllllll(0.98f, 0.98f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
    }

    public class_0034(class_1334 class_13342, double d, double d2, double d3, class_1965 class_19652) {
        this(class_13342);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        float f = (float)(Math.random() * Math.PI * 2.0);
        this.IIIIIIIIlIllIIllIIlllIllI = -((float)Math.sin(f)) * 0.02f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.2f;
        this.llIIIlllIlllIlIllIIIIllIl = -((float)Math.cos(f)) * 0.02f;
        this.lllIIIllIIIIlllIlIIllIIll = 80;
        this.llIIlIllIllllIlIIIIlIIlll = d;
        this.llIllllIlIllIIIlIllIIlIlI = d2;
        this.lIlllIlllIlIIIIlllIlIlIIl = d3;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_19652;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return !this.IllllIIIIlIIlIIIIlllIIIIl;
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)0.04f;
        this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
        this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.98f;
        this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
        this.llIIIlllIlllIlIllIIIIllIl *= (double)0.98f;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)0.7f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)0.7f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= -0.5;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll-- <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.lIlllIlllIIIIlIIlllIllIII();
            }
        } else {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("smoke", this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI + 0.5, this.IllIIIIllIIllIllIlllIlIIl, 0.0, 0.0, 0.0);
        }
    }

    private void lIlllIlllIIIIlIIlllIllIII() {
        float f = 4.0f;
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, f, true);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Fuse", (byte)this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIlllIlllIIIIlIIlllIllIII("Fuse");
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    public class_1965 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

