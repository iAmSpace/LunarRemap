package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 */
import com.google.common.collect.Sets;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class class_0762
implements class_1574 {
    private final List lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private final int lIlllIlllIIIIlIIlllIllIII;

    public class_0762(List list, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll = list;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lIlllIlllIIIIlIIlllIllIII = n3;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll.size();
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    private class_1451 lIlllIlllIIIIlIIlllIllIII(int n) {
        return (class_1451)this.lllIIIllIIIIlllIlIIllIIll.get(n);
    }

    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        class_1451 class_14512 = this.lIlllIlllIIIIlIIlllIllIII(n);
        return class_14512.lllIIIllIIIIlllIlIIllIIll() ? this.lIlllIlllIIIIlIIlllIllIII : class_14512.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return !((class_1451)this.lllIIIllIIIIlllIlIIllIIll.get(n)).lllIIIllIIIIlllIlIIllIIll();
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n) {
        return ((class_1451)this.lllIIIllIIIIlllIlIIllIIll.get(n)).IlIllllllIIlIIllllIIlIIIl();
    }

    public Set IlIIIIIllllllIIlllIllllll() {
        HashSet hashSet = Sets.newHashSet();
        for (class_1451 class_14512 : this.lllIIIllIIIIlllIlIIllIIll) {
            hashSet.add(class_14512.IlIllllllIIlIIllllIIlIIIl());
        }
        return hashSet;
    }
}

