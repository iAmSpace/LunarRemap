package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2208
implements Comparable {
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    public int IlIllllllIIlIIllllIIlIIIl;

    public class_2208() {
    }

    public class_2208(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
    }

    public class_2208(class_2208 class_22082) {
        this.lllIIIllIIIIlllIlIIllIIll = class_22082.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_22082.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl = class_22082.IlIllllllIIlIIllllIIlIIIl;
    }

    public boolean equals(Object object) {
        if (!(object instanceof class_2208)) {
            return false;
        }
        class_2208 class_22082 = (class_2208)object;
        return this.lllIIIllIIIIlllIlIIllIIll == class_22082.lllIIIllIIIIlllIlIIllIIll && this.lllIlIIlIIIlIlIIIllIlllIl == class_22082.lllIlIIlIIIlIlIIIllIlllIl && this.IlIllllllIIlIIllllIIlIIIl == class_22082.IlIllllllIIlIIllllIIlIIIl;
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll + this.IlIllllllIIlIIllllIIlIIIl << 8 + this.lllIlIIlIIIlIlIIIllIlllIl << 16;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_2208 class_22082) {
        return this.lllIlIIlIIIlIlIIIllIlllIl == class_22082.lllIlIIlIIIlIlIIIllIlllIl ? (this.IlIllllllIIlIIllllIIlIIIl == class_22082.IlIllllllIIlIIllllIIlIIIl ? this.lllIIIllIIIIlllIlIIllIIll - class_22082.lllIIIllIIIIlllIlIIllIIll : this.IlIllllllIIlIIllllIIlIIIl - class_22082.IlIllllllIIlIIllllIIlIIIl) : this.lllIlIIlIIIlIlIIIllIlllIl - class_22082.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        float f = this.lllIIIllIIIIlllIlIIllIIll - n;
        float f2 = this.lllIlIIlIIIlIlIIIllIlllIl - n2;
        float f3 = this.IlIllllllIIlIIllllIIlIIIl - n3;
        return f * f + f2 * f2 + f3 * f3;
    }

    public float lllIlIIlIIIlIlIIIllIlllIl(class_2208 class_22082) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_22082.lllIIIllIIIIlllIlIIllIIll, class_22082.lllIlIIlIIIlIlIIIllIlllIl, class_22082.IlIllllllIIlIIllllIIlIIIl);
    }

    public String toString() {
        return "Pos{x=" + this.lllIIIllIIIIlllIlIIllIIll + ", y=" + this.lllIlIIlIIIlIlIIIllIlllIl + ", z=" + this.IlIllllllIIlIIllllIIlIIIl + '}';
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2208)object);
    }
}

