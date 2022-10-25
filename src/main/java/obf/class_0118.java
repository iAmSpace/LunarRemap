package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ComparisonChain
 */
import com.google.common.collect.ComparisonChain;
import java.util.Comparator;

public class class_0118
implements Comparator {
    int lllIIIllIIIIlllIlIIllIIll;
    int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0118(int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = n2;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_2000 class_20002, class_2000 class_20003) {
        int n = class_20002.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        int n2 = class_20002.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        int n3 = class_20003.lllIIIllIIIIlllIlIIllIIll - this.lllIIIllIIIIlllIlIIllIIll;
        int n4 = class_20003.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
        int n5 = n * n + n2 * n2;
        int n6 = n3 * n3 + n4 * n4;
        return ComparisonChain.start().compare(n6, n5).result();
    }

    public int compare(Object object, Object object2) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_2000)object, (class_2000)object2);
    }
}

