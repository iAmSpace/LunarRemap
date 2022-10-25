package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Comparator;

public class class_1722
implements Comparator {
    private double lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;

    public class_1722(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll = -class_15212.IlIIlllllIIlIlIlllllIllll;
        this.lllIlIIlIIIlIlIIIllIlllIl = -class_15212.llIIlIlIlllIIllIlIlllIllI;
        this.IlIllllllIIlIIllllIIlIIIl = -class_15212.IllIIIIllIIllIllIlllIlIIl;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0734 class_07342, class_0734 class_07343) {
        double d = (double)class_07342.lllllIlllIIllIlIIlIIIllII + this.lllIIIllIIIIlllIlIIllIIll;
        double d2 = (double)class_07342.IlIlIIlllIIlIllIIIlllllIl + this.lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = (double)class_07342.lIIlIIIIIlIlllIlIIlIlIlll + this.IlIllllllIIlIIllllIIlIIIl;
        double d4 = (double)class_07343.lllllIlllIIllIlIIlIIIllII + this.lllIIIllIIIIlllIlIIllIIll;
        double d5 = (double)class_07343.IlIlIIlllIIlIllIIIlllllIl + this.lllIlIIlIIIlIlIIIllIlllIl;
        double d6 = (double)class_07343.lIIlIIIIIlIlllIlIIlIlIlll + this.IlIllllllIIlIIllllIIlIIIl;
        return (int)((d * d + d2 * d2 + d3 * d3 - (d4 * d4 + d5 * d5 + d6 * d6)) * 1024.0);
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0734)object, (class_0734)object2);
    }
}

