package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

final class class_0956
implements Comparator {
    class_0956() {
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0678 class_06782, class_0678 class_06783) {
        return class_06782.lllIlIIlIIIlIlIIIllIlllIl() > class_06783.lllIlIIlIIIlIlIIIllIlllIl() ? 1 : (class_06782.lllIlIIlIIIlIlIIIllIlllIl() < class_06783.lllIlIIlIIIlIlIIIllIlllIl() ? -1 : 0);
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0678)object, (class_0678)object2);
    }
}

