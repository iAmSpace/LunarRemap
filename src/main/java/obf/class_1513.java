package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1513 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;
    private boolean IlIllllllIIlIIllllIIlIIIl;

    public class_1513(String string, int n, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = bl;
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        class_1513 class_15132 = (class_1513)object;
        return this.lllIlIIlIIIlIlIIIllIlllIl == class_15132.lllIlIIlIIIlIlIIIllIlllIl && this.IlIllllllIIlIIllllIIlIIIl == class_15132.IlIllllllIIlIIllllIIlIIIl && this.lllIIIllIIIIlllIlIIllIIll.equals(class_15132.lllIIIllIIIIlllIlIIllIIll);
    }

    public int hashCode() {
        int n = this.lllIIIllIIIIlllIlIIllIIll.hashCode();
        n = 31 * n + this.lllIlIIlIIIlIlIIIllIlllIl;
        n = 31 * n + (this.IlIllllllIIlIIllllIIlIIIl ? 1 : 0);
        return n;
    }

    static /* synthetic */ String lllIIIllIIIIlllIlIIllIIll(class_1513 class_15132, String string) {
        class_15132.lllIIIllIIIIlllIlIIllIIll = string;
        return class_15132.lllIIIllIIIIlllIlIIllIIll;
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(class_1513 class_15132, int n) {
        class_15132.lllIlIIlIIIlIlIIIllIlllIl = n;
        return class_15132.lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ boolean lllIIIllIIIIlllIlIIllIIll(class_1513 class_15132, boolean bl) {
        class_15132.IlIllllllIIlIIllllIIlIIIl = bl;
        return class_15132.IlIllllllIIlIIllllIIlIIIl;
    }
}

