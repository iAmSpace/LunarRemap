package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.NoSuchElementException;

class class_2242
extends class_0038 {
    int lllIIIllIIIIlllIlIIllIIll;
    int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ int IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ class_0880 lIlllIlllIIIIlIIlllIllIII;

    class_2242(class_0880 class_08802, int n) {
        this.lIlllIlllIIIIlIIlllIllIII = class_08802;
        this.IlIllllllIIlIIllllIIlIIIl = n;
        this.lllIIIllIIIIlllIlIIllIIll = this.IlIllllllIIlIIllllIIlIIIl;
        this.lllIlIIlIIIlIlIIIllIlllIl = -1;
    }

    @Override
    public boolean hasNext() {
        return this.lllIIIllIIIIlllIlIIllIIll < this.lIlllIlllIIIIlIIlllIllIII.size();
    }

    @Override
    public boolean hasPrevious() {
        return this.lllIIIllIIIIlllIlIIllIIll > 0;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll++;
        return this.lIlllIlllIIIIlIIlllIllIII.get(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = --this.lllIIIllIIIIlllIlIIllIIll;
        return this.lIlllIlllIIIIlIIlllIllIII.get(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public int nextIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public int previousIndex() {
        return this.lllIIIllIIIIlllIlIIllIIll - 1;
    }

    @Override
    public void add(Object object) {
        this.lIlllIlllIIIIlIIlllIllIII.add(this.lllIIIllIIIIlllIlIIllIIll++, object);
        this.lllIlIIlIIIlIlIIIllIlllIl = -1;
    }

    @Override
    public void set(Object object) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl == -1) {
            throw new IllegalStateException();
        }
        this.lIlllIlllIIIIlIIlllIllIII.set(this.lllIlIIlIIIlIlIIIllIlllIl, object);
    }

    @Override
    public void remove() {
        if (this.lllIlIIlIIIlIlIIIllIlllIl == -1) {
            throw new IllegalStateException();
        }
        this.lIlllIlllIIIIlIIlllIllIII.remove(this.lllIlIIlIIIlIlIIIllIlllIl);
        if (this.lllIlIIlIIIlIlIIIllIlllIl < this.lllIIIllIIIIlllIlIIllIIll) {
            --this.lllIIIllIIIIlllIlIIllIIll;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = -1;
    }
}

