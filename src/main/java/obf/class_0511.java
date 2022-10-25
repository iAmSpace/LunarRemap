package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_0511 {
    final int lllIIIllIIIIlllIlIIllIIll;
    Object lllIlIIlIIIlIlIIIllIlllIl;
    class_0511 IlIllllllIIlIIllllIIlIIIl;
    final int lIlllIlllIIIIlIIlllIllIII;

    class_0511(int n, int n2, Object object, class_0511 class_05112) {
        this.lllIlIIlIIIlIlIIIllIlllIl = object;
        this.IlIllllllIIlIIllllIIlIIIl = class_05112;
        this.lllIIIllIIIIlllIlIIllIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public final int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public final Object lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        Integer n;
        if (!(object instanceof class_0511)) {
            return false;
        }
        class_0511 class_05112 = (class_0511)object;
        Integer n2 = this.lllIIIllIIIIlllIlIIllIIll();
        return (n2 == (n = Integer.valueOf(class_05112.lllIIIllIIIIlllIlIIllIIll())) || n2 != null && n2.equals(n)) && ((object3 = this.lllIlIIlIIIlIlIIIllIlllIl()) == (object2 = class_05112.lllIlIIlIIIlIlIIIllIlllIl()) || object3 != null && object3.equals(object2));
    }

    public final int hashCode() {
        return class_1890.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public final String toString() {
        return this.lllIIIllIIIIlllIlIIllIIll() + "=" + this.lllIlIIlIIIlIlIIIllIlllIl();
    }
}

