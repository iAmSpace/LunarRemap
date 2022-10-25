package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;

class class_0391
extends class_1453 {
    final Iterator lllIIIllIIIIlllIlIIllIIll;

    public class_0391(Iterator iterator) {
        this.lllIIIllIIIIlllIlIIllIIll = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.lllIIIllIIIIlllIlIIllIIll.hasNext();
    }

    @Override
    public void remove() {
        this.lllIIIllIIIIlllIlIIllIIll.remove();
    }

    public Object next() {
        return this.lllIIIllIIIIlllIlIIllIIll.next();
    }
}

