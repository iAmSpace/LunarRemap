package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class class_1910 {
    private Class lllIIIllIIIIlllIlIIllIIll = null;
    private int lllIlIIlIIIlIlIIIllIlllIl = 0;
    private ArrayDeque IlIllllllIIlIIllllIIlIIIl = new ArrayDeque();

    public class_1910(Class class_, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    public synchronized Object lllIIIllIIIIlllIlIIllIIll(int n) {
        Object object = this.IlIllllllIIlIIllllIIlIIIl.pollLast();
        if (object == null || Array.getLength(object) < n) {
            object = Array.newInstance(this.lllIIIllIIIIlllIlIIllIIll, n);
        }
        return object;
    }

    public synchronized void lllIIIllIIIIlllIlIIllIIll(Object object) {
        if (object != null) {
            Class<?> class_ = object.getClass();
            if (class_.getComponentType() != this.lllIIIllIIIIlllIlIIllIIll) {
                throw new IllegalArgumentException("Wrong component type");
            }
            if (this.IlIllllllIIlIIllllIIlIIIl.size() < this.lllIlIIlIIIlIlIIIllIlllIl) {
                this.IlIllllllIIlIIllllIIlIIIl.add(object);
            }
        }
    }
}

