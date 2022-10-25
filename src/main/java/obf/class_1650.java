package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;

public class class_1650
implements Comparable {
    public int lllIIIllIIIIlllIlIIllIIll;
    public String lllIlIIlIIIlIlIIIllIlllIl;

    public class_1650(int n, String string) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = string;
    }

    public String toString() {
        return String.valueOf(this.lllIIIllIIIIlllIlIIllIIll) + ", " + this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1650 class_16502) {
        if (this.lllIIIllIIIIlllIlIIllIIll > class_16502.lllIIIllIIIIlllIlIIllIIll) {
            return 1;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll < class_16502.lllIIIllIIIIlllIlIIllIIll) {
            return -1;
        }
        return 0;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(List list, int n) {
        for (class_1650 class_16502 : list) {
            if (n > class_16502.lllIIIllIIIIlllIlIIllIIll) continue;
            return class_16502.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return "f";
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_1650)object);
    }
}

