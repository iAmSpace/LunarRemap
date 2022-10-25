package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface class_0266
extends class_1888,
Comparable,
List {
    public class_0898 IlIIIIIllllllIIlllIllllll();

    @Deprecated
    public class_0898 lIlllIlllIIIIlIIlllIllIII();

    @Deprecated
    public class_0898 lIlllIlllIIIIlIIlllIllIII(int var1);

    public class_0898 lIllllIIlIIIlIllllllIIIll();

    public class_0898 IlIIIIIllllllIIlllIllllll(int var1);

    @Deprecated
    public class_0266 lllIlIIlIIIlIlIIIllIlllIl(int var1, int var2);

    public class_0266 lllIIIllIIIIlllIlIIllIIll(int var1, int var2);

    public void lIllllIIlIIIlIllllllIIIll(int var1);

    public void lllIlIIlIIIlIlIIIllIlllIl(int var1, Object[] var2, int var3, int var4);

    public void IlIllllllIIlIIllllIIlIIIl(int var1, int var2);

    public void lllIIIllIIIIlllIlIIllIIll(int var1, Object[] var2);

    public void lllIIIllIIIIlllIlIIllIIll(int var1, Object[] var2, int var3, int var4);

    default public /* synthetic */ List subList(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    default public /* synthetic */ ListIterator listIterator(int n) {
        return this.IlIIIIIllllllIIlllIllllll(n);
    }

    default public /* synthetic */ ListIterator listIterator() {
        return this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    default public /* synthetic */ Iterator iterator() {
        return this.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    default public /* synthetic */ class_0353 lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll();
    }
}

