package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;

public abstract class class_0880
extends class_0487
implements class_1757,
class_0266 {
    protected class_0880() {
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is negative");
        }
        if (n > this.size()) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than list size (" + this.size() + ")");
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(int n) {
        if (n < 0) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is negative");
        }
        if (n >= this.size()) {
            throw new IndexOutOfBoundsException("Index (" + n + ") is greater than or equal to list size (" + this.size() + ")");
        }
    }

    public void add(int n, Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean add(Object object) {
        this.add(this.size(), object);
        return true;
    }

    public Object remove(int n) {
        throw new UnsupportedOperationException();
    }

    public Object set(int n, Object object) {
        throw new UnsupportedOperationException();
    }

    public boolean addAll(int n, Collection collection) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        int n2 = collection.size();
        if (n2 == 0) {
            return false;
        }
        Iterator iterator = collection.iterator();
        while (n2-- != 0) {
            this.add(n++, iterator.next());
        }
        return true;
    }

    @Override
    public boolean addAll(Collection collection) {
        return this.addAll(this.size(), collection);
    }

    @Override
    @Deprecated
    public class_0898 lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    @Deprecated
    public class_0898 lIlllIlllIIIIlIIlllIllIII(int n) {
        return this.IlIIIIIllllllIIlllIllllll(n);
    }

    @Override
    public class_0898 IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll();
    }

    @Override
    public class_0898 lIllllIIlIIIlIllllllIIIll() {
        return this.IlIIIIIllllllIIlllIllllll(0);
    }

    @Override
    public class_0898 IlIIIIIllllllIIlllIllllll(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        return new class_2242(this, n);
    }

    @Override
    public boolean contains(Object object) {
        return this.indexOf(object) >= 0;
    }

    @Override
    public int indexOf(Object object) {
        class_0898 class_08982 = this.lIllllIIlIIIlIllllllIIIll();
        while (class_08982.hasNext()) {
            Object e = class_08982.next();
            if (!(object == null ? e == null : object.equals(e))) continue;
            return class_08982.previousIndex();
        }
        return -1;
    }

    @Override
    public int lastIndexOf(Object object) {
        class_0898 class_08982 = this.IlIIIIIllllllIIlllIllllll(this.size());
        while (class_08982.hasPrevious()) {
            Object e = class_08982.previous();
            if (!(object == null ? e == null : object.equals(e))) continue;
            return class_08982.nextIndex();
        }
        return -1;
    }

    @Override
    public void lIllllIIlIIIlIllllllIIIll(int n) {
        int n2 = this.size();
        if (n > n2) {
            while (n2++ < n) {
                this.add((Object)null);
            }
        } else {
            while (n2-- != n) {
                this.remove(n2);
            }
        }
    }

    @Override
    public class_0266 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        this.lllIlIIlIIIlIlIIIllIlllIl(n2);
        if (n > n2) {
            throw new IndexOutOfBoundsException("Start index (" + n + ") is greater than end index (" + n2 + ")");
        }
        return new class_1136(this, n, n2);
    }

    @Override
    @Deprecated
    public class_0266 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return this.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n2);
        class_0898 class_08982 = this.IlIIIIIllllllIIlllIllllll(n);
        int n3 = n2 - n;
        if (n3 < 0) {
            throw new IllegalArgumentException("Start index (" + n + ") is greater than end index (" + n2 + ")");
        }
        while (n3-- != 0) {
            class_08982.next();
            class_08982.remove();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, Object[] arrobject, int n2, int n3) {
        this.lllIlIIlIIIlIlIIIllIlllIl(n);
        if (n2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n2 + ") is negative");
        }
        if (n2 + n3 > arrobject.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n2 + n3) + ") is greater than array length (" + arrobject.length + ")");
        }
        while (n3-- != 0) {
            this.add(n++, arrobject[n2++]);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, Object[] arrobject) {
        this.lllIIIllIIIIlllIlIIllIIll(n, arrobject, 0, arrobject.length);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, Object[] arrobject, int n2, int n3) {
        class_0898 class_08982 = this.IlIIIIIllllllIIlllIllllll(n);
        if (n2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n2 + ") is negative");
        }
        if (n2 + n3 > arrobject.length) {
            throw new ArrayIndexOutOfBoundsException("End index (" + (n2 + n3) + ") is greater than array length (" + arrobject.length + ")");
        }
        if (n + n3 > this.size()) {
            throw new IndexOutOfBoundsException("End index (" + (n + n3) + ") is greater than list size (" + this.size() + ")");
        }
        while (n3-- != 0) {
            arrobject[n2++] = class_08982.next();
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(Object object, Object object2) {
        return object == null ? object2 == null : object.equals(object2);
    }

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof List)) {
            return false;
        }
        List list = (List)object;
        int n = this.size();
        if (n != list.size()) {
            return false;
        }
        class_0898 class_08982 = this.lIllllIIlIIIlIllllllIIIll();
        ListIterator listIterator = list.listIterator();
        while (n-- != 0) {
            if (this.lllIIIllIIIIlllIlIIllIIll(class_08982.next(), listIterator.next())) continue;
            return false;
        }
        return true;
    }

    public int lllIIIllIIIIlllIlIIllIIll(List list) {
        if (list == this) {
            return 0;
        }
        if (list instanceof class_0266) {
            class_0898 class_08982 = this.lIllllIIlIIIlIllllllIIIll();
            class_0898 class_08983 = ((class_0266)list).lIllllIIlIIIlIllllllIIIll();
            while (class_08982.hasNext() && class_08983.hasNext()) {
                Object e;
                Object e2 = class_08982.next();
                int n = ((Comparable)e2).compareTo(e = class_08983.next());
                if (n == 0) continue;
                return n;
            }
            return class_08983.hasNext() ? -1 : (class_08982.hasNext() ? 1 : 0);
        }
        class_0898 class_08984 = this.lIllllIIlIIIlIllllllIIIll();
        ListIterator listIterator = list.listIterator();
        while (class_08984.hasNext() && listIterator.hasNext()) {
            int n = ((Comparable)class_08984.next()).compareTo(listIterator.next());
            if (n == 0) continue;
            return n;
        }
        return listIterator.hasNext() ? -1 : (class_08984.hasNext() ? 1 : 0);
    }

    @Override
    public int hashCode() {
        class_0898 class_08982 = this.IlIIIIIllllllIIlllIllllll();
        int n = 1;
        int n2 = this.size();
        while (n2-- != 0) {
            Object e = class_08982.next();
            n = 31 * n + (e == null ? 0 : e.hashCode());
        }
        return n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Object object) {
        this.add(object);
    }

    @Override
    public Object b_() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.remove(this.size() - 1);
    }

    @Override
    public Object lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.isEmpty()) {
            throw new NoSuchElementException();
        }
        return this.get(this.size() - 1);
    }

    @Override
    public Object lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.get(this.size() - 1 - n);
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        class_0898 class_08982 = this.IlIIIIIllllllIIlllIllllll();
        int n = this.size();
        boolean bl = true;
        stringBuilder.append("[");
        while (n-- != 0) {
            if (bl) {
                bl = false;
            } else {
                stringBuilder.append(", ");
            }
            Object e = class_08982.next();
            if (this == e) {
                stringBuilder.append("(this list)");
                continue;
            }
            stringBuilder.append(String.valueOf(e));
        }
        stringBuilder.append("]");
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ class_0353 lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.IlIIIIIllllllIIlllIllllll();
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
        return this.lIllllIIlIIIlIllllllIIIll();
    }

    public /* synthetic */ int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((List)object);
    }
}

