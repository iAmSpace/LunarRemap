package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;

final class class_1450
extends class_0219 {
    final /* synthetic */ class_1427 lllIIIllIIIIlllIlIIllIIll;

    private class_1450(class_1427 class_14272) {
        this.lllIIIllIIIIlllIlIIllIIll = class_14272;
    }

    @Override
    public class_0353 lllIIIllIIIIlllIlIIllIIll() {
        return new class_1288(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public int size() {
        return this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlIlIllIIlIlIIllIIIl;
    }

    @Override
    public boolean contains(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.containsKey(object);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        int n = this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlIlIllIIlIlIIllIIIl;
        this.lllIIIllIIIIlllIlIIllIIll.remove(object);
        return this.lllIIIllIIIIlllIlIIllIIll.IlIlIIlIlIllIIlIlIIllIIIl != n;
    }

    @Override
    public void clear() {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
    }

    @Override
    public /* synthetic */ Iterator iterator() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }

    /* synthetic */ class_1450(class_1427 class_14272, class_1547 class_15472) {
        this(class_14272);
    }
}

