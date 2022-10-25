package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class class_1776
implements Comparator {
    private final class_1521 lllIIIllIIIIlllIlIIllIIll;

    public class_1776(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1521 class_15213) {
        double d;
        double d2 = this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(class_15212);
        return d2 < (d = this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(class_15213)) ? -1 : (d2 > d ? 1 : 0);
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1521)object, (class_1521)object2);
    }
}

