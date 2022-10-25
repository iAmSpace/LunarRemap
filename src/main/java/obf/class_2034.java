package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.RandomAccess;

public class class_2034
extends class_0880
implements Serializable,
Cloneable,
RandomAccess {
    private static final long IlIIIIIllllllIIlllIllllll = -7046029254386353131L;
    public static final int lllIIIllIIIIlllIlIIllIIll = 16;
    protected final boolean lllIlIIlIIIlIlIIIllIlllIl;
    protected transient Object[] IlIllllllIIlIIllllIIlIIIl;
    protected int lIlllIlllIIIIlIIlllIllIII;
    private static final boolean lIllllIIlIIIlIllllllIIIll = false;

    protected class_2034(Object[] arrobject, boolean bl) {
        this.IlIllllllIIlIIllllIIlIIIl = arrobject;
        this.lllIlIIlIIIlIlIIIllIlllIl = true;
    }

    public class_2034(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n + ") is negative");
        }
        this.IlIllllllIIlIIllllIIlIIIl = new Object[n];
        this.lllIlIIlIIIlIlIIIllIlllIl = false;
    }

    public class_2034() {
        this(16);
    }

    public class_2034(Collection collection) {
        this(collection.size());
        this.lIlllIlllIIIIlIIlllIllIII = class_0548.lllIIIllIIIIlllIlIIllIIll(collection.iterator(), this.IlIllllllIIlIIllllIIlIIIl);
    }

    public class_2034(class_1888 class_18882) {
        this(class_18882.size());
        this.lIlllIlllIIIIlIIlllIllIII = class_0548.lllIIIllIIIIlllIlIIllIIll((Iterator)class_18882.lllIIIllIIIIlllIlIIllIIll(), this.IlIllllllIIlIIllllIIlIIIl);
    }

    public class_2034(class_0266 class_02662) {
        this(class_02662.size());
        this.lIlllIlllIIIIlIIlllIllIII = class_02662.size();
        class_02662.lllIlIIlIIIlIlIIIllIlllIl(0, this.IlIllllllIIlIIllllIIlIIIl, 0, this.lIlllIlllIIIIlIIlllIllIII);
    }

    public class_2034(Object[] arrobject) {
        this(arrobject, 0, arrobject.length);
    }

    public class_2034(Object[] arrobject, int n, int n2) {
        this(n2);
        System.arraycopy(arrobject, n, this.IlIllllllIIlIIllllIIlIIIl, 0, n2);
        this.lIlllIlllIIIIlIIlllIllIII = n2;
    }

    public class_2034(Iterator iterator) {
        this();
        while (iterator.hasNext()) {
            this.add(iterator.next());
        }
    }

    public class_2034(class_0353 class_03532) {
        this();
        while (class_03532.hasNext()) {
            this.add(class_03532.next());
        }
    }

    public Object[] IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public static class_2034 lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n) {
        if (n > arrobject.length) {
            throw new IllegalArgumentException("The specified length (" + n + ") is greater than the array size (" + arrobject.length + ")");
        }
        class_2034 class_20342 = new class_2034(arrobject, false);
        class_20342.lIlllIlllIIIIlIIlllIllIII = n;
        return class_20342;
    }

    public static class_2034 lllIIIllIIIIlllIlIIllIIll(Object[] arrobject) {
        return class_2034.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject.length);
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IlIllllllIIlIIllllIIlIIIl = class_0385.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, n, this.lIlllIlllIIIIlIIlllIllIII);
        } else if (n > this.IlIllllllIIlIIllllIIlIIIl.length) {
            Object[] arrobject = new Object[n];
            System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, 0, arrobject, 0, this.lIlllIlllIIIIlIIlllIllIII);
            this.IlIllllllIIlIIllllIIlIIIl = arrobject;
        }
    }

    private void IIIllIllIIlIlIlIlIllllIIl(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.IlIllllllIIlIIllllIIlIIIl = class_0385.lllIlIIlIIIlIlIIIllIlllIl(this.IlIllllllIIlIIllllIIlIIIl, n, this.lIlllIlllIIIIlIIlllIllIII);
        } else if (n > this.IlIllllllIIlIIllllIIlIIIl.length) {
            int n2 = (int)Math.max(Math.min(2L * (long)this.IlIllllllIIlIIllllIIlIIIl.length, 0x7FFFFFF7L), (long)n);
            Object[] arrobject = new Object[n2];
            System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, 0, arrobject, 0, this.lIlllIlllIIIIlIIlllIllIII);
            this.IlIllllllIIlIIllllIIlIIIl = arrobject;
        }
    }

    @Override
    public void add(int n, Object object) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.IIIllIllIIlIlIlIlIllllIIl(this.lIlllIlllIIIIlIIlllIllIII + 1);
        if (n != this.lIlllIlllIIIIlIIlllIllIII) {
            System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, n, this.IlIllllllIIlIIllllIIlIIIl, n + 1, this.lIlllIlllIIIIlIIlllIllIII - n);
        }
        this.IlIllllllIIlIIllllIIlIIIl[n] = object;
        ++this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public boolean add(Object object) {
        this.IIIllIllIIlIlIlIlIllllIIl(this.lIlllIlllIIIIlIIlllIllIII + 1);
        this.IlIllllllIIlIIllllIIlIIIl[this.lIlllIlllIIIIlIIlllIllIII++] = object;
        return true;
    }

    public Object get(int n) {
        if (n >= this.lIlllIlllIIIIlIIlllIllIII) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.lIlllIlllIIIIlIIlllIllIII + ")");
        }
        return this.IlIllllllIIlIIllllIIlIIIl[n];
    }

    @Override
    public int indexOf(Object object) {
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII; ++i) {
            if (!(object == null ? this.IlIllllllIIlIIllllIIlIIIl[i] == null : object.equals(this.IlIllllllIIlIIllllIIlIIIl[i]))) continue;
            return i;
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        int n = this.lIlllIlllIIIIlIIlllIllIII;
        while (n-- != 0) {
            if (!(object == null ? this.IlIllllllIIlIIllllIIlIIIl[n] == null : object.equals(this.IlIllllllIIlIIllllIIlIIIl[n]))) continue;
            return n;
        }
        return -1;
    }

    @Override
    public Object remove(int n) {
        if (n >= this.lIlllIlllIIIIlIIlllIllIII) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.lIlllIlllIIIIlIIlllIllIII + ")");
        }
        Object object = this.IlIllllllIIlIIllllIIlIIIl[n];
        --this.lIlllIlllIIIIlIIlllIllIII;
        if (n != this.lIlllIlllIIIIlIIlllIllIII) {
            System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, n + 1, this.IlIllllllIIlIIllllIIlIIIl, n, this.lIlllIlllIIIIlIIlllIllIII - n);
        }
        this.IlIllllllIIlIIllllIIlIIIl[this.lIlllIlllIIIIlIIlllIllIII] = null;
        return object;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        int n = this.indexOf(object);
        if (n == -1) {
            return false;
        }
        this.remove(n);
        return true;
    }

    @Override
    public boolean remove(Object object) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(object);
    }

    @Override
    public Object set(int n, Object object) {
        if (n >= this.lIlllIlllIIIIlIIlllIllIII) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.lIlllIlllIIIIlIIlllIllIII + ")");
        }
        Object object2 = this.IlIllllllIIlIIllllIIlIIIl[n];
        this.IlIllllllIIlIIllllIIlIIIl[n] = object;
        return object2;
    }

    @Override
    public void clear() {
        Arrays.fill(this.IlIllllllIIlIIllllIIlIIIl, 0, this.lIlllIlllIIIIlIIlllIllIII, null);
        this.lIlllIlllIIIIlIIlllIllIII = 0;
    }

    @Override
    public int size() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public void lIllllIIlIIIlIllllllIIIll(int n) {
        if (n > this.IlIllllllIIlIIllllIIlIIIl.length) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(n);
        }
        if (n > this.lIlllIlllIIIIlIIlllIllIII) {
            Arrays.fill(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, n, null);
        } else {
            Arrays.fill(this.IlIllllllIIlIIllllIIlIIIl, n, this.lIlllIlllIIIIlIIlllIllIII, null);
        }
        this.lIlllIlllIIIIlIIlllIllIII = n;
    }

    @Override
    public boolean isEmpty() {
        return this.lIlllIlllIIIIlIIlllIllIII == 0;
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.IllIIlllllllIIlIIlIIIIlIl(0);
    }

    public void IllIIlllllllIIlIIlIIIIlIl(int n) {
        if (n >= this.IlIllllllIIlIIllllIIlIIIl.length || this.lIlllIlllIIIIlIIlllIllIII == this.IlIllllllIIlIIllllIIlIIIl.length) {
            return;
        }
        Object[] arrobject = new Object[Math.max(n, this.lIlllIlllIIIIlIIlllIllIII)];
        System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, 0, arrobject, 0, this.lIlllIlllIIIIlIIlllIllIII);
        this.IlIllllllIIlIIllllIIlIIIl = arrobject;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, Object[] arrobject, int n2, int n3) {
        class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n2, n3);
        System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, n, arrobject, n2, n3);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        class_0214.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII, n, n2);
        System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, n2, this.IlIllllllIIlIIllllIIlIIIl, n, this.lIlllIlllIIIIlIIlllIllIII - n2);
        this.lIlllIlllIIIIlIIlllIllIII -= n2 - n;
        int n3 = n2 - n;
        while (n3-- != 0) {
            this.IlIllllllIIlIIllllIIlIIIl[this.lIlllIlllIIIIlIIlllIllIII + n3] = null;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, Object[] arrobject, int n2, int n3) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n2, n3);
        this.IIIllIllIIlIlIlIlIllllIIl(this.lIlllIlllIIIIlIIlllIllIII + n3);
        System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, n, this.IlIllllllIIlIIllllIIlIIIl, n + n3, this.lIlllIlllIIIIlIIlllIllIII - n);
        System.arraycopy(arrobject, n2, this.IlIllllllIIlIIllllIIlIIIl, n, n3);
        this.lIlllIlllIIIIlIIlllIllIII += n3;
    }

    @Override
    public boolean removeAll(Collection collection) {
        int n;
        Object[] arrobject = this.IlIllllllIIlIIllllIIlIIIl;
        int n2 = 0;
        for (n = 0; n < this.lIlllIlllIIIIlIIlllIllIII; n += 1) {
            if (collection.contains(arrobject[n])) continue;
            arrobject[n2++] = arrobject[n];
        }
        Arrays.fill(arrobject, n2, this.lIlllIlllIIIIlIIlllIllIII, null);
        n = this.lIlllIlllIIIIlIIlllIllIII != n2 ? 1 : 0;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        return n != 0;
    }

    @Override
    public class_0898 IlIIIIIllllllIIlllIllllll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        return new class_1083(this, n);
    }

    public class_2034 IIIllIllIIlIlIlIlIllllIIl() {
        class_2034 class_20342 = new class_2034(this.lIlllIlllIIIIlIIlllIllIII);
        System.arraycopy(this.IlIllllllIIlIIllllIIlIIIl, 0, class_20342.IlIllllllIIlIIllllIIlIIIl, 0, this.lIlllIlllIIIIlIIlllIllIII);
        class_20342.lIlllIlllIIIIlIIlllIllIII = this.lIlllIlllIIIIlIIlllIllIII;
        return class_20342;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_2034 class_20342) {
        if (class_20342 == this) {
            return true;
        }
        int n = this.size();
        if (n != class_20342.size()) {
            return false;
        }
        Object[] arrobject = this.IlIllllllIIlIIllllIIlIIIl;
        Object[] arrobject2 = class_20342.IlIllllllIIlIIllllIIlIIIl;
        while (n-- != 0) {
            if (this.lllIIIllIIIIlllIlIIllIIll(arrobject[n], arrobject2[n])) continue;
            return false;
        }
        return true;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(class_2034 class_20342) {
        int n;
        int n2 = this.size();
        int n3 = class_20342.size();
        Object[] arrobject = this.IlIllllllIIlIIllllIIlIIIl;
        Object[] arrobject2 = class_20342.IlIllllllIIlIIllllIIlIIIl;
        for (n = 0; n < n2 && n < n3; ++n) {
            Object object = arrobject[n];
            Object object2 = arrobject2[n];
            int n4 = ((Comparable)object).compareTo(object2);
            if (n4 == 0) continue;
            return n4;
        }
        return n < n3 ? -1 : (n < n2 ? 1 : 0);
    }

    private void lllIIIllIIIIlllIlIIllIIll(ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII; ++i) {
            objectOutputStream.writeObject(this.IlIllllllIIlIIllllIIlIIIl[i]);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.IlIllllllIIlIIllllIIlIIIl = new Object[this.lIlllIlllIIIIlIIlllIllIII];
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII; ++i) {
            this.IlIllllllIIlIIllllIIlIIIl[i] = objectInputStream.readObject();
        }
    }

    @Override
    public /* synthetic */ ListIterator listIterator(int n) {
        return this.IlIIIIIllllllIIlllIllllll(n);
    }

    public /* synthetic */ Object clone() {
        return this.IIIllIllIIlIlIlIlIllllIIl();
    }
}

