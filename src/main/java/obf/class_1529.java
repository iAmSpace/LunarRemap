package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1529 {
    public final int lllIIIllIIIIlllIlIIllIIll;
    public final int lllIlIIlIIIlIlIIIllIlllIl;
    public final int IlIllllllIIlIIllllIIlIIIl;
    public final int lIlllIlllIIIIlIIlllIllIII;
    public final int IlIIIIIllllllIIlllIllllll;
    public int lIllllIIlIIIlIllllllIIIll;
    public boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;

    public class_1529(int n, int n2, int n3, int n4, int n5, int n6) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
        this.lIlllIlllIIIIlIIlllIllIII = n4;
        this.IlIIIIIllllllIIlllIllllll = n5;
        this.lIllllIIlIIIlIllllllIIIll = n6;
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        int n4 = n - this.lllIIIllIIIIlllIlIIllIIll;
        int n5 = n2 - this.lllIlIIlIIIlIlIIIllIlllIl;
        int n6 = n3 - this.IlIllllllIIlIIllllIIlIIIl;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        int n4 = n - this.lllIIIllIIIIlllIlIIllIIll - this.lIlllIlllIIIIlIIlllIllIII;
        int n5 = n2 - this.lllIlIIlIIIlIlIIIllIlllIl;
        int n6 = n3 - this.IlIllllllIIlIIllllIIlIIIl - this.IlIIIIIllllllIIlllIllllll;
        return n4 * n4 + n5 * n5 + n6 * n6;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll + this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl + this.IlIIIIIllllllIIlllIllllll;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = n - this.lllIIIllIIIIlllIlIIllIIll;
        int n4 = n2 - this.IlIllllllIIlIIllllIIlIIIl;
        return n3 * this.lIlllIlllIIIIlIIlllIllIII + n4 * this.IlIIIIIllllllIIlllIllllll >= 0;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        this.IllIIlllllllIIlIIlIIIIlIl = 0;
    }

    public void IlIIIIIllllllIIlllIllllll() {
        ++this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }
}

