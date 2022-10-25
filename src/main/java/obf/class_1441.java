package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class class_1441
implements Comparator {
    private class_1521 lllIIIllIIIIlllIlIIllIIll;

    public class_1441(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0734[] arrclass_0734, int n) {
        for (int i = 0; i < n; ++i) {
            class_0734 class_07342 = arrclass_0734[i];
            class_07342.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0734 class_07342, class_0734 class_07343) {
        float f = class_07342.llllllIlIllllIlIlIlIIIIlI;
        float f2 = class_07343.llllllIlIllllIlIlIlIIIIlI;
        return f == f2 ? 0 : (f > f2 ? 1 : -1);
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0734)object, (class_0734)object2);
    }
}

