package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.NoSuchElementException;

class class_0121
extends class_0038 {
    private final Object lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0121(Object object) {
        this.lllIIIllIIIIlllIlIIllIIll = object;
    }

    @Override
    public boolean hasNext() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == 0;
    }

    @Override
    public boolean hasPrevious() {
        return this.lllIlIIlIIIlIlIIIllIlllIl == 1;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = 1;
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public int nextIndex() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public int previousIndex() {
        return this.lllIlIIlIIIlIlIIIllIlllIl - 1;
    }
}

