package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0460 {
    private int lllIlIIlIIIlIlIIIllIlllIl = -1;
    private int IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl = class_0994.lllIIIllIIIIlllIlIIllIIll(16384);
    private int lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl + 16384;
    public static final int lllIIIllIIIIlllIlIIllIIll = 16384;

    public boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.IlIllllllIIlIIllllIIlIIIl + n < this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (!this.lllIIIllIIIIlllIlIIllIIll(n)) {
            return -1;
        }
        int n2 = this.IlIllllllIIlIIllllIIlIIIl;
        this.IlIllllllIIlIIllllIIlIIIl += n;
        return n2;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        class_0994.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

