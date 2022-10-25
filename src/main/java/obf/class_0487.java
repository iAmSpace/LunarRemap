package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public abstract class class_0487
extends AbstractCollection
implements class_1888 {
    protected class_0487() {
    }

    @Override
    public Object[] toArray() {
        Object[] arrobject = new Object[this.size()];
        class_0548.lllIIIllIIIIlllIlIIllIIll((Iterator)this.lllIIIllIIIIlllIlIIllIIll(), arrobject);
        return arrobject;
    }

    @Override
    public Object[] toArray(Object[] arrobject) {
        int n = this.size();
        if (arrobject.length < n) {
            arrobject = (Object[])Array.newInstance(arrobject.getClass().getComponentType(), n);
        }
        class_0548.lllIIIllIIIIlllIlIIllIIll((Iterator)this.lllIIIllIIIIlllIlIIllIIll(), arrobject);
        if (n < arrobject.length) {
            arrobject[n] = null;
        }
        return arrobject;
    }

    public boolean addAll(Collection collection) {
        boolean bl = false;
        Iterator iterator = collection.iterator();
        int n = collection.size();
        while (n-- != 0) {
            if (!this.add(iterator.next())) continue;
            bl = true;
        }
        return bl;
    }

    public boolean add(Object object) {
        throw new UnsupportedOperationException();
    }

    @Override
    @Deprecated
    public class_0353 IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public abstract class_0353 lllIIIllIIIIlllIlIIllIIll();

    @Override
    public boolean remove(Object object) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(object);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        class_0353 class_03532 = this.lllIIIllIIIIlllIlIIllIIll();
        while (class_03532.hasNext()) {
            if (object != class_03532.next()) continue;
            class_03532.remove();
            return true;
        }
        return false;
    }

    public boolean containsAll(Collection collection) {
        int n = collection.size();
        Iterator iterator = collection.iterator();
        while (n-- != 0) {
            if (this.contains(iterator.next())) continue;
            return false;
        }
        return true;
    }

    public boolean retainAll(Collection collection) {
        boolean bl = false;
        int n = this.size();
        class_0353 class_03532 = this.lllIIIllIIIIlllIlIIllIIll();
        while (n-- != 0) {
            if (collection.contains(class_03532.next())) continue;
            class_03532.remove();
            bl = true;
        }
        return bl;
    }

    public boolean removeAll(Collection collection) {
        boolean bl = false;
        int n = collection.size();
        Iterator iterator = collection.iterator();
        while (n-- != 0) {
            if (!this.remove(iterator.next())) continue;
            bl = true;
        }
        return bl;
    }

    @Override
    public boolean isEmpty() {
        return this.size() == 0;
    }

    @Override
    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        class_0353 class_03532 = this.lllIIIllIIIIlllIlIIllIIll();
        int n = this.size();
        boolean bl = true;
        stringBuilder.append("{");
        while (n-- != 0) {
            if (bl) {
                bl = false;
            } else {
                stringBuilder.append(", ");
            }
            Object e = class_03532.next();
            if (this == e) {
                stringBuilder.append("(this collection)");
                continue;
            }
            stringBuilder.append(String.valueOf(e));
        }
        stringBuilder.append("}");
        return stringBuilder.toString();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

