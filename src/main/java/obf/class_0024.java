package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0024
extends class_1327 {
    private class_1627 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;

    public class_0024(class_1627 class_16272, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = class_16272;
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        this.lllIIIllIIIIlllIlIIllIIll(1);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIllIlIIIIIlIIlllIlI() && this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII != null) {
            class_0864 class_08642 = class_1008.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, 5, 4);
            if (class_08642 == null) {
                return false;
            }
            this.IlIllllllIIlIIllllIIlIIIl = class_08642.lllIIIllIIIIlllIlIIllIIll;
            this.lIlllIlllIIIIlIIlllIllIII = class_08642.lllIlIIlIIIlIlIIIllIlllIl;
            this.IlIIIIIllllllIIlllIllllll = class_08642.IlIllllllIIlIIllllIIlIIIl;
            return true;
        }
        return false;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll() && this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII != null;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        if (this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(50) == 0) {
            if (this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII instanceof class_0814) {
                int n = this.lllIIIllIIIIlllIlIIllIIll.lllIlIlIIIlIllllIlllIlIlI();
                int n2 = this.lllIIIllIIIIlllIlIIllIIll.lIlIIlIIllIllllllIIIIlllI();
                if (n2 > 0 && this.lllIIIllIIIIlllIlIIllIIll.IlllIIIlIIlIIIIllllIllllI().nextInt(n2) < n) {
                    this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl((class_0814)this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII);
                    this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll, (byte)7);
                    return;
                }
                this.lllIIIllIIIIlllIlIIllIIll.IIlllIlIlllIllIIIlllIIlIl(5);
            }
            this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll((class_1521)null);
            this.lllIIIllIIIIlllIlIIllIIll.lIlIlIIlIIIIlIIIIIlllIIII = null;
            this.lllIIIllIIIIlllIlIIllIIll.IIIlIlIIllllIlllllllIIlll();
            this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll, (byte)6);
        }
    }
}

