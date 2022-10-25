package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1108 {
    public final int lllIIIllIIIIlllIlIIllIIll;
    public final int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl = 0;

    public class_1108(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
    }

    public static long lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return (long)n & 0xFFFFFFFFL | ((long)n2 & 0xFFFFFFFFL) << 32;
    }

    public int hashCode() {
        if (this.IlIllllllIIlIIllllIIlIIIl == 0) {
            int n = 1664525 * this.lllIIIllIIIIlllIlIIllIIll + 1013904223;
            int n2 = 1664525 * (this.lllIlIIlIIIlIlIIIllIlllIl ^ 0xDEADBEEF) + 1013904223;
            this.IlIllllllIIlIIllllIIlIIIl = n ^ n2;
        }
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class_1108)) {
            return false;
        }
        class_1108 class_11082 = (class_1108)object;
        return this.lllIIIllIIIIlllIlIIllIIll == class_11082.lllIIIllIIIIlllIlIIllIIll && this.lllIlIIlIIIlIlIIIllIlllIl == class_11082.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return (this.lllIIIllIIIIlllIlIIllIIll << 4) + 8;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return (this.lllIlIIlIIIlIlIIIllIlllIl << 4) + 8;
    }

    public class_2137 lllIIIllIIIIlllIlIIllIIll(int n) {
        return new class_2137(this.lllIIIllIIIIlllIlIIllIIll(), n, this.lllIlIIlIIIlIlIIIllIlllIl());
    }

    public String toString() {
        return "[" + this.lllIIIllIIIIlllIlIIllIIll + ", " + this.lllIlIIlIIIlIlIIIllIlllIl + "]";
    }
}

