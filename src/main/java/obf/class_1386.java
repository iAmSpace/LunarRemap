package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_1386 {
    private final long lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final double IlIllllllIIlIIllllIIlIIIl;

    private class_1386(long l, int n, double d) {
        this.lllIIIllIIIIlllIlIIllIIll = l;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = d;
    }

    public class_1386 lllIIIllIIIIlllIlIIllIIll(long l) {
        return new class_1386(l + this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + 1, (l + this.lllIIIllIIIIlllIlIIllIIll) / (long)(this.lllIlIIlIIIlIlIIIllIlllIl + 1));
    }

    public long lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String toString() {
        return "{totalBytes=" + this.lllIIIllIIIIlllIlIIllIIll + ", count=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", averageBytes=" + this.IlIllllllIIlIIllllIIlIIIl + '}';
    }

    class_1386(long l, int n, double d, Object object) {
        this(l, n, d);
    }

    static /* synthetic */ long lllIIIllIIIIlllIlIIllIIll(class_1386 class_13862) {
        return class_13862.lllIIIllIIIIlllIlIIllIIll;
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(class_1386 class_13862) {
        return class_13862.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

