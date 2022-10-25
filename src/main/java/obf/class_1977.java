package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1977
implements Comparable {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final String IlIllllllIIlIIllllIIlIIIl;
    private final boolean lIlllIlllIIIIlIIlllIllIII;

    public class_1977(String string, String string2, String string3, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
        this.IlIllllllIIlIIllllIIlIIIl = string3;
        this.lIlllIlllIIIIlIIlllIllIII = bl;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public String toString() {
        return String.format("%s (%s)", this.IlIllllllIIlIIllllIIlIIIl, this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public boolean equals(Object object) {
        return this == object ? true : (!(object instanceof class_1977) ? false : this.lllIIIllIIIIlllIlIIllIIll.equals(((class_1977)object).lllIIIllIIIIlllIlIIllIIll));
    }

    public int hashCode() {
        return this.lllIIIllIIIIlllIlIIllIIll.hashCode();
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1977 class_19772) {
        return this.lllIIIllIIIIlllIlIIllIIll.compareTo(class_19772.lllIIIllIIIIlllIlIIllIIll);
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1977)object);
    }
}

