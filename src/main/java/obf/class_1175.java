package obf;

/*
 * Decompiled with CFR 0.150.
 */
class class_1175
extends class_1453 {
    final class_0353 lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ class_1803 lllIlIIlIIIlIlIIIllIlllIl;

    class_1175(class_1803 class_18032) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_18032;
        this.lllIIIllIIIIlllIlIIllIIll = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll();
    }

    public Object next() {
        return ((class_1690)this.lllIIIllIIIIlllIlIIllIIll.next()).getKey();
    }

    @Override
    public boolean hasNext() {
        return this.lllIIIllIIIIlllIlIIllIIll.hasNext();
    }

    @Override
    public void remove() {
        this.lllIIIllIIIIlllIlIIllIIll.remove();
    }
}

