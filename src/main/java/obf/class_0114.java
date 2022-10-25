package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class class_0114
implements Comparator {
    private final class_2208 lllIIIllIIIIlllIlIIllIIll;

    public class_0114(class_2208 class_22082) {
        this.lllIIIllIIIIlllIlIIllIIll = class_22082;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, class_1822 class_18223) {
        double d;
        double d2 = class_18222.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl);
        return d2 < (d = class_18223.lIllllIIlIIIlIllllllIIIll(this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl, this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl)) ? -1 : (d2 > d ? 1 : 0);
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1822)object, (class_1822)object2);
    }
}

