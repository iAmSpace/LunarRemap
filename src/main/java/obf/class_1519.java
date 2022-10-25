package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1519 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_1519(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = Math.min(n, n2);
        this.lllIlIIlIIIlIlIIIllIlllIl = Math.max(n, n2);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n) {
        return n < this.lllIIIllIIIIlllIlIIllIIll ? false : n <= this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String toString() {
        return "min: " + this.lllIIIllIIIIlllIlIIllIIll + ", max: " + this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

