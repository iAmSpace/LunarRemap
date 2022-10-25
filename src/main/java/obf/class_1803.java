package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;

class class_1803
extends class_0219 {
    final /* synthetic */ class_1183 lllIIIllIIIIlllIlIIllIIll;

    class_1803(class_1183 class_11832) {
        this.lllIIIllIIIIlllIlIIllIIll = class_11832;
    }

    @Override
    public boolean contains(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.containsKey(object);
    }

    @Override
    public int size() {
        return this.lllIIIllIIIIlllIlIIllIIll.size();
    }

    @Override
    public void clear() {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
    }

    @Override
    public class_0353 lllIIIllIIIIlllIlIIllIIll() {
        return new class_1175(this);
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

