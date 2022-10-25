package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

class class_0660
implements Comparator {
    final /* synthetic */ class_0172 lllIIIllIIIIlllIlIIllIIll;

    class_0660(class_0172 class_01722) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01722;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_2098 class_20982, class_2098 class_20983) {
        return class_20982 instanceof class_0224 && class_20983 instanceof class_0208 ? 1 : (class_20983 instanceof class_0224 && class_20982 instanceof class_0208 ? -1 : (class_20983.lllIIIllIIIIlllIlIIllIIll() < class_20982.lllIIIllIIIIlllIlIIllIIll() ? -1 : (class_20983.lllIIIllIIIIlllIlIIllIIll() > class_20982.lllIIIllIIIIlllIlIIllIIll() ? 1 : 0)));
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2098)object, (class_2098)object2);
    }
}

