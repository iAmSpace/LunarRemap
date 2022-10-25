package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ListIterator;

class class_2212
extends class_0038 {
    final ListIterator lllIIIllIIIIlllIlIIllIIll;

    public class_2212(ListIterator listIterator) {
        this.lllIIIllIIIIlllIlIIllIIll = listIterator;
    }

    @Override
    public boolean hasNext() {
        return this.lllIIIllIIIIlllIlIIllIIll.hasNext();
    }

    @Override
    public boolean hasPrevious() {
        return this.lllIIIllIIIIlllIlIIllIIll.hasPrevious();
    }

    @Override
    public int nextIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.nextIndex();
    }

    @Override
    public int previousIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll.previousIndex();
    }

    @Override
    public void set(Object object) {
        this.lllIIIllIIIIlllIlIIllIIll.set(object);
    }

    @Override
    public void add(Object object) {
        this.lllIIIllIIIIlllIlIIllIIll.add(object);
    }

    @Override
    public void remove() {
        this.lllIIIllIIIIlllIlIIllIIll.remove();
    }

    public Object next() {
        return this.lllIIIllIIIIlllIlIIllIIll.next();
    }

    @Override
    public Object previous() {
        return this.lllIIIllIIIIlllIlIIllIIll.previous();
    }
}

