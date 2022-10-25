package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class class_1136
extends class_0880
implements Serializable {
    private static final long lIlllIlllIIIIlIIlllIllIII = -7046029254386353129L;
    protected final class_0266 lllIIIllIIIIlllIlIIllIIll;
    protected final int lllIlIIlIIIlIlIIIllIlllIl;
    protected int IlIllllllIIlIIllllIIlIIIl;
    private static final boolean IlIIIIIllllllIIlllIllllll = false;

    public class_1136(class_0266 class_02662, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = class_02662;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
    }

    @Override
    public boolean add(Object object) {
        this.lllIIIllIIIIlllIlIIllIIll.add(this.IlIllllllIIlIIllllIIlIIIl, object);
        ++this.IlIllllllIIlIIllllIIlIIIl;
        return true;
    }

    @Override
    public void add(int n, Object object) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.lllIIIllIIIIlllIlIIllIIll.add(this.lllIlIIlIIIlIlIIIllIlllIl + n, object);
        ++this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public boolean addAll(int n, Collection collection) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.IlIllllllIIlIIllllIIlIIIl += collection.size();
        return this.lllIIIllIIIIlllIlIIllIIll.addAll(this.lllIlIIlIIIlIlIIIllIlllIl + n, collection);
    }

    public Object get(int n) {
        this.IlIllllllIIlIIllllIIlIIIl(n);
        return this.lllIIIllIIIIlllIlIIllIIll.get(this.lllIlIIlIIIlIlIIIllIlllIl + n);
    }

    @Override
    public Object remove(int n) {
        this.IlIllllllIIlIIllllIIlIIIl(n);
        --this.IlIllllllIIlIIllllIIlIIIl;
        return this.lllIIIllIIIIlllIlIIllIIll.remove(this.lllIlIIlIIIlIlIIIllIlllIl + n);
    }

    @Override
    public Object set(int n, Object object) {
        this.IlIllllllIIlIIllllIIlIIIl(n);
        return this.lllIIIllIIIIlllIlIIllIIll.set(this.lllIlIIlIIIlIlIIIllIlllIl + n, object);
    }

    @Override
    public void clear() {
        this.IlIllllllIIlIIllllIIlIIIl(0, this.size());
    }

    @Override
    public int size() {
        return this.IlIllllllIIlIIllllIIlIIIl - this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, Object[] arrobject, int n2, int n3) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        if (n + n3 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + n + n3 + ") is greater than list size (" + this.size() + ")");
        }
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl + n, arrobject, n2, n3);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.lllIlIIlIIIlIlIIIllIlllIl(n2);
        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl + n, this.lllIlIIlIIIlIlIIIllIlllIl + n2);
        this.IlIllllllIIlIIllllIIlIIIl -= n2 - n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, Object[] arrobject, int n2, int n3) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl + n, arrobject, n2, n3);
        this.IlIllllllIIlIIllllIIlIIIl += n3;
    }

    @Override
    public class_0898 IlIIIIIllllllIIlllIllllll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        return new class_0238(this, n);
    }

    @Override
    public class_0266 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.lllIlIIlIIIlIlIIIllIlllIl(n2);
        if (n > n2) {
            throw new IllegalArgumentException("Start index (" + n + ") is greater than end index (" + n2 + ")");
        }
        return new class_1136(this, n, n2);
    }

    @Override
    public boolean remove(Object object) {
        int n = this.indexOf(object);
        if (n == -1) {
            return false;
        }
        this.remove(n);
        return true;
    }

    @Override
    public /* synthetic */ List subList(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n) {
        return this.IlIIIIIllllllIIlllIllllll(n);
    }

    @Override
    public /* synthetic */ ListIterator listIterator() {
        return super.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return super.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public /* synthetic */ int compareTo(Object object) {
        return super.lllIIIllIIIIlllIlIIllIIll((List)object);
    }

    @Override
    public /* synthetic */ class_0353 lllIIIllIIIIlllIlIIllIIll() {
        return super.IlIIIIIllllllIIlllIllllll();
    }
}

