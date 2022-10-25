package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2086 {
    private final class_2120[] lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;

    public class_2086(class_2120[] arrclass_2120) {
        this.lllIIIllIIIIlllIlIIllIIll = arrclass_2120;
        this.IlIllllllIIlIIllllIIlIIIl = arrclass_2120.length;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ++this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl >= this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_2120 IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl > 0 ? this.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl - 1] : null;
    }

    public class_2120 lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll[n];
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.IlIllllllIIlIIllllIIlIIIl = n;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public class_0864 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n) {
        double d = (double)this.lllIIIllIIIIlllIlIIllIIll[n].lllIIIllIIIIlllIlIIllIIll + (double)((int)(class_15212.IIIIlIlIIlIIIIlIlllIlIIII + 1.0f)) * 0.5;
        double d2 = this.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = (double)this.lllIIIllIIIIlllIlIIllIIll[n].IlIllllllIIlIIllllIIlIIIl + (double)((int)(class_15212.IIIIlIlIIlIIIIlIlllIlIIII + 1.0f)) * 0.5;
        return class_0864.lllIIIllIIIIlllIlIIllIIll(d, d2, d3);
    }

    public class_0864 lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        return this.lllIIIllIIIIlllIlIIllIIll(class_15212, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2086 class_20862) {
        if (class_20862 == null) {
            return false;
        }
        if (class_20862.lllIIIllIIIIlllIlIIllIIll.length != this.lllIIIllIIIIlllIlIIllIIll.length) {
            return false;
        }
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll == class_20862.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll && this.lllIIIllIIIIlllIlIIllIIll[i].lllIlIIlIIIlIlIIIllIlllIl == class_20862.lllIIIllIIIIlllIlIIllIIll[i].lllIlIIlIIIlIlIIIllIlllIl && this.lllIIIllIIIIlllIlIIllIIll[i].IlIllllllIIlIIllllIIlIIIl == class_20862.lllIIIllIIIIlllIlIIllIIll[i].IlIllllllIIlIIllllIIlIIIl) continue;
            return false;
        }
        return true;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0864 class_08642) {
        class_2120 class_21202 = this.IlIllllllIIlIIllllIIlIIIl();
        return class_21202 == null ? false : class_21202.lllIIIllIIIIlllIlIIllIIll == (int)class_08642.lllIIIllIIIIlllIlIIllIIll && class_21202.IlIllllllIIlIIllllIIlIIIl == (int)class_08642.IlIllllllIIlIIllllIIlIIIl;
    }
}

