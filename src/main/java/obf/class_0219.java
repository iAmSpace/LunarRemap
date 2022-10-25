package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public abstract class class_0219
extends class_0487
implements class_1729,
Cloneable {
    protected class_0219() {
    }

    @Override
    public abstract class_0353 lllIIIllIIIIlllIlIIllIIll();

    @Override
    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof Set)) {
            return false;
        }
        Set set = (Set)object;
        if (set.size() != this.size()) {
            return false;
        }
        return this.containsAll((Collection)set);
    }

    @Override
    public int hashCode() {
        int n = 0;
        int n2 = this.size();
        class_0353 class_03532 = this.lllIIIllIIIIlllIlIIllIIll();
        while (n2-- != 0) {
            Object e = class_03532.next();
            n += e == null ? 0 : e.hashCode();
        }
        return n;
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

