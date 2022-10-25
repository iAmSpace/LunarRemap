package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import java.util.Map;

final class class_0844
extends class_0219
implements class_0607 {
    final /* synthetic */ class_1427 lllIIIllIIIIlllIlIIllIIll;

    private class_0844(class_1427 class_14272) {
        this.lllIIIllIIIIlllIlIIllIIll = class_14272;
    }

    @Override
    public class_0353 lllIIIllIIIIlllIlIIllIIll() {
        return new class_0189(this.lllIIIllIIIIlllIlIIllIIll, null);
    }

    @Override
    public class_0353 lllIlIIlIIIlIlIIIllIlllIl() {
        return new class_1443(this.lllIIIllIIIIlllIlIIllIIll, null);
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k = entry.getKey();
        Object v = entry.getValue();
        if (k == null) {
            return this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll && (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI] == null ? v == null : this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI].equals(v));
        }
        Object[] arrobject = this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll;
        int n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(k.hashCode()) & this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII;
        Object object2 = arrobject[n];
        if (object2 == null) {
            return false;
        }
        if (k.equals(object2)) {
            return this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n] == null ? v == null : this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n].equals(v);
        }
        do {
            if ((object2 = arrobject[n = n + 1 & this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII]) != null) continue;
            return false;
        } while (!k.equals(object2));
        return this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n] == null ? v == null : this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n].equals(v);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        if (!(object instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry)object;
        Object k = entry.getKey();
        Object v = entry.getValue();
        if (k == null) {
            if (this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll && (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI] == null ? v == null : this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI].equals(v))) {
                class_1427.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
                return true;
            }
            return false;
        }
        Object[] arrobject = this.lllIIIllIIIIlllIlIIllIIll.IllIIIllIIIIlIlIlIllIIlll;
        int n = class_1652.lllIlIIlIIIlIlIIIllIlllIl(k.hashCode()) & this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII;
        Object object2 = arrobject[n];
        if (object2 == null) {
            return false;
        }
        if (object2.equals(k)) {
            if (this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n] == null ? v == null : this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n].equals(v)) {
                class_1427.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n);
                return true;
            }
            return false;
        }
        do {
            if ((object2 = arrobject[n = n + 1 & this.lllIIIllIIIIlllIlIIllIIll.llIIlllIllIllllIIIlIIIIII]) != null) continue;
            return false;
        } while (!object2.equals(k) || !(this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n] == null ? v == null : this.lllIIIllIIIIlllIlIIllIIll.lIIIIlIlIIlllllIIllIIlIII[n].equals(v)));
        class_1427.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n);
        return true;
    }

    @Override
    public int size() {
        return this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    @Override
    public void clear() {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }

    /* synthetic */ class_0844(class_1427 class_14272, class_1547 class_15472) {
        this(class_14272);
    }
}

