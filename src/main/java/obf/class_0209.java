package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.AbstractSet;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class class_0209
extends AbstractSet {
    private class_1562 lllIIIllIIIIlllIlIIllIIll = new class_1562();
    private int lllIlIIlIIIlIlIIIllIlllIl = 0;
    private HashSet IlIllllllIIlIIllllIIlIIIl = new HashSet();

    public class_0209(Set set) {
        this.addAll(set);
    }

    @Override
    public int size() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public boolean contains(Object object) {
        if (!(object instanceof class_1505)) {
            return false;
        }
        class_1505 class_15052 = (class_1505)object;
        if (class_15052 == null) {
            return false;
        }
        long l = class_1108.lllIIIllIIIIlllIlIIllIIll(class_15052.lllIIIllIIIIlllIlIIllIIll >> 4, class_15052.IlIllllllIIlIIllllIIlIIIl >> 4);
        HashSet hashSet = (HashSet)this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(l);
        return hashSet == null ? false : hashSet.contains(class_15052);
    }

    @Override
    public boolean add(Object object) {
        boolean bl;
        if (!(object instanceof class_1505)) {
            return false;
        }
        class_1505 class_15052 = (class_1505)object;
        if (class_15052 == null) {
            return false;
        }
        long l = class_1108.lllIIIllIIIIlllIlIIllIIll(class_15052.lllIIIllIIIIlllIlIIllIIll >> 4, class_15052.IlIllllllIIlIIllllIIlIIIl >> 4);
        HashSet<class_1505> hashSet = (HashSet<class_1505>)this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(l);
        if (hashSet == null) {
            hashSet = new HashSet<class_1505>();
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(l, hashSet);
        }
        if (bl = hashSet.add(class_15052)) {
            ++this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return bl;
    }

    @Override
    public boolean remove(Object object) {
        if (!(object instanceof class_1505)) {
            return false;
        }
        class_1505 class_15052 = (class_1505)object;
        if (class_15052 == null) {
            return false;
        }
        long l = class_1108.lllIIIllIIIIlllIlIIllIIll(class_15052.lllIIIllIIIIlllIlIIllIIll >> 4, class_15052.IlIllllllIIlIIllllIIlIIIl >> 4);
        HashSet hashSet = (HashSet)this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(l);
        if (hashSet == null) {
            return false;
        }
        boolean bl = hashSet.remove(class_15052);
        if (bl) {
            --this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return bl;
    }

    public Iterator lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        HashSet hashSet = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
        return hashSet.iterator();
    }

    public HashSet lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        long l = class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2);
        HashSet hashSet = (HashSet)this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(l);
        if (hashSet == null) {
            hashSet = this.IlIllllllIIlIIllllIIlIIIl;
        }
        return hashSet;
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not implemented");
    }
}

