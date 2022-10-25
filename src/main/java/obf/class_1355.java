package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Predicate
 *  com.google.common.base.Predicates
 *  com.google.common.collect.Iterators
 *  com.google.common.collect.Lists
 */
import com.google.common.base.Predicate;
import com.google.common.base.Predicates;
import com.google.common.collect.Iterators;
import com.google.common.collect.Lists;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;

public class class_1355
implements class_2239 {
    private IdentityHashMap lllIIIllIIIIlllIlIIllIIll = new IdentityHashMap(512);
    private List lllIlIIlIIIlIlIIIllIlllIl = Lists.newArrayList();

    public void lllIIIllIIIIlllIlIIllIIll(Object object, int n) {
        this.lllIIIllIIIIlllIlIIllIIll.put(object, n);
        while (this.lllIlIIlIIIlIlIIIllIlllIl.size() <= n) {
            this.lllIlIIlIIIlIlIIIllIlllIl.add(null);
        }
        this.lllIlIIlIIIlIlIIIllIlllIl.set(n, object);
    }

    public int lllIIIllIIIIlllIlIIllIIll(Object object) {
        Integer n = (Integer)this.lllIIIllIIIIlllIlIIllIIll.get(object);
        return n == null ? -1 : n;
    }

    public Object lllIIIllIIIIlllIlIIllIIll(int n) {
        return n >= 0 && n < this.lllIlIIlIIIlIlIIIllIlllIl.size() ? this.lllIlIIlIIIlIlIIIllIlllIl.get(n) : null;
    }

    public Iterator iterator() {
        return Iterators.filter(this.lllIlIIlIIIlIlIIIllIlllIl.iterator(), (Predicate)Predicates.notNull());
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll(n) != null;
    }
}

