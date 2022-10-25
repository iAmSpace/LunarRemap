package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.io.Serializable;
import java.util.NoSuchElementException;

public class class_1124
extends class_0038
implements Serializable,
Cloneable {
    private static final long lllIIIllIIIIlllIlIIllIIll = -7046029254386353129L;

    protected class_1124() {
    }

    @Override
    public boolean hasNext() {
        return false;
    }

    @Override
    public boolean hasPrevious() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    @Override
    public Object previous() {
        throw new NoSuchElementException();
    }

    @Override
    public int nextIndex() {
        return 0;
    }

    @Override
    public int previousIndex() {
        return -1;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return 0;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return 0;
    }

    public Object clone() {
        return class_0548.lllIIIllIIIIlllIlIIllIIll;
    }

    private Object lllIIIllIIIIlllIlIIllIIll() {
        return class_0548.lllIIIllIIIIlllIlIIllIIll;
    }
}

