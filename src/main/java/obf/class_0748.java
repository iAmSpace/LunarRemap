package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0748
implements Comparable {
    private final String lllIIIllIIIIlllIlIIllIIll;
    private final String lllIlIIlIIIlIlIIIllIlllIl;
    private final long IlIllllllIIlIIllllIIlIIIl;
    private final long lIlllIlllIIIIlIIlllIllIII;
    private final boolean IlIIIIIllllllIIlllIllllll;
    private final class_2243 lIllllIIlIIIlIllllllIIIll;
    private final boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private final boolean IllIIlllllllIIlIIlIIIIlIl;

    public class_0748(String string, String string2, long l, long l2, class_2243 class_22432, boolean bl, boolean bl2, boolean bl3) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = string2;
        this.IlIllllllIIlIIllllIIlIIIl = l;
        this.lIlllIlllIIIIlIIlllIllIII = l2;
        this.lIllllIIlIIIlIllllllIIIll = class_22432;
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl2;
        this.IllIIlllllllIIlIIlIIIIlIl = bl3;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public long IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public long IlIIIIIllllllIIlllIllllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0748 class_07482) {
        return this.IlIllllllIIlIIllllIIlIIIl < class_07482.IlIllllllIIlIIllllIIlIIIl ? 1 : (this.IlIllllllIIlIIllllIIlIIIl > class_07482.IlIllllllIIlIIllllIIlIIIl ? -1 : this.lllIIIllIIIIlllIlIIllIIll.compareTo(class_07482.lllIIIllIIIIlllIlIIllIIll));
    }

    public class_2243 lIllllIIlIIIlIllllllIIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0748)object);
    }
}

