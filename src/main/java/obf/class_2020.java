package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2020 {
    private final int lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;

    public class_2020(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
        this.IlIllllllIIlIIllllIIlIIIl = n3;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_2020 lllIIIllIIIIlllIlIIllIIll(class_2020 class_20202) {
        return new class_2020(this.lllIIIllIIIIlllIlIIllIIll + class_20202.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl + class_20202.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl + class_20202.IlIllllllIIlIIllllIIlIIIl);
    }

    public class_2020 lllIlIIlIIIlIlIIIllIlllIl(class_2020 class_20202) {
        return new class_2020(this.lllIIIllIIIIlllIlIIllIIll - class_20202.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl - class_20202.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl - class_20202.IlIllllllIIlIIllllIIlIIIl);
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (!(object instanceof class_2020)) {
            return false;
        }
        class_2020 class_20202 = (class_2020)object;
        return this.lllIIIllIIIIlllIlIIllIIll() != class_20202.lllIIIllIIIIlllIlIIllIIll() ? false : (this.lllIlIIlIIIlIlIIIllIlllIl() != class_20202.lllIlIIlIIIlIlIIIllIlllIl() ? false : this.IlIllllllIIlIIllllIIlIIIl() == class_20202.IlIllllllIIlIIllllIIlIIIl());
    }

    public int hashCode() {
        return (this.lllIlIIlIIIlIlIIIllIlllIl() + this.IlIllllllIIlIIllllIIlIIIl() * 31) * 31 + this.lllIIIllIIIIlllIlIIllIIll();
    }

    public String toString() {
        return "" + this.lllIIIllIIIIlllIlIIllIIll + ", " + this.lllIlIIlIIIlIlIIIllIlllIl + ", " + this.IlIllllllIIlIIllllIIlIIIl;
    }
}

