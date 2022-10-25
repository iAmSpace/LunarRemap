package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class class_0100
implements Comparator {
    private class_1965 lllIIIllIIIIlllIlIIllIIll;

    public class_0100(class_1965 class_19652) {
        this.lllIIIllIIIIlllIlIIllIIll = class_19652;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0734 class_07342, class_0734 class_07343) {
        double d;
        if (class_07342.IlIlllIIIIIIlIIllIIllIlll && !class_07343.IlIlllIIIIIIlIIllIIllIlll) {
            return 1;
        }
        if (class_07343.IlIlllIIIIIIlIIllIIllIlll && !class_07342.IlIlllIIIIIIlIIllIIllIlll) {
            return -1;
        }
        double d2 = class_07342.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll);
        return d2 < (d = (double)class_07343.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll)) ? 1 : (d2 > d ? -1 : (class_07342.IIlllIlIlllIllIIIlllIIlIl < class_07343.IIlllIlIlllIllIIIlllIIlIl ? 1 : -1));
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0734)object, (class_0734)object2);
    }
}

