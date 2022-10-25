package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.NoSuchElementException;

class class_0275
extends class_0038 {
    private final Object[] lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;
    private final int IlIllllllIIlIIllllIIlIIIl;
    private int lIlllIlllIIIIlIIlllIllIII;

    public class_0275(Object[] arrobject, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = arrobject;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
    }

    @Override
    public boolean hasNext() {
        return this.lIlllIlllIIIIlIIlllIllIII < this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public boolean hasPrevious() {
        return this.lIlllIlllIIIIlIIlllIllIII > 0;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        return this.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl + this.lIlllIlllIIIIlIIlllIllIII++];
    }

    @Override
    public Object previous() {
        if (!this.hasPrevious()) {
            throw new NoSuchElementException();
        }
        return this.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl + --this.lIlllIlllIIIIlIIlllIllIII];
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        if (n <= this.IlIllllllIIlIIllllIIlIIIl - this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII += n;
            return n;
        }
        n = this.IlIllllllIIlIIllllIIlIIIl - this.lIlllIlllIIIIlIIlllIllIII;
        this.lIlllIlllIIIIlIIlllIllIII = this.IlIllllllIIlIIllllIIlIIIl;
        return n;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        if (n <= this.lIlllIlllIIIIlIIlllIllIII) {
            this.lIlllIlllIIIIlIIlllIllIII -= n;
            return n;
        }
        n = this.lIlllIlllIIIIlIIlllIllIII;
        this.lIlllIlllIIIIlIIlllIllIII = 0;
        return n;
    }

    @Override
    public int nextIndex() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    public int previousIndex() {
        return this.lIlllIlllIIIIlIIlllIllIII - 1;
    }
}

