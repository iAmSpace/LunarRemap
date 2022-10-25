package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_2048 {
    final long lllIIIllIIIIlllIlIIllIIll;
    Object lllIlIIlIIIlIlIIIllIlllIl;
    class_2048 IlIllllllIIlIIllllIIlIIIl;
    final int lIlllIlllIIIIlIIlllIllIII;

    class_2048(int n, long l, Object object, class_2048 class_20482) {
        this.lllIlIIlIIIlIlIIIllIlllIl = object;
        this.IlIllllllIIlIIllllIIlIIIl = class_20482;
        this.lllIIIllIIIIlllIlIIllIIll = l;
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    public final long lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public final Object lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        Long l;
        if (!(object instanceof class_2048)) {
            return false;
        }
        class_2048 class_20482 = (class_2048)object;
        Long l2 = this.lllIIIllIIIIlllIlIIllIIll();
        return (l2 == (l = Long.valueOf(class_20482.lllIIIllIIIIlllIlIIllIIll())) || l2 != null && l2.equals(l)) && ((object3 = this.lllIlIIlIIIlIlIIIllIlllIl()) == (object2 = class_20482.lllIlIIlIIIlIlIIIllIlllIl()) || object3 != null && object3.equals(object2));
    }

    public final int hashCode() {
        return class_1562.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public final String toString() {
        return this.lllIIIllIIIIlllIlIIllIIll() + "=" + this.lllIlIIlIIIlIlIIIllIlllIl();
    }
}

