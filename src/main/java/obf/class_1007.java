package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.NoSuchElementException;

class class_1007
extends class_1453 {
    final class_0353[] lllIIIllIIIIlllIlIIllIIll;
    int lllIlIIlIIIlIlIIIllIlllIl;
    int IlIllllllIIlIIllllIIlIIIl;
    int lIlllIlllIIIIlIIlllIllIII = -1;

    public class_1007(class_0353[] arrclass_0353, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll = arrclass_0353;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = n2;
        this.lllIIIllIIIIlllIlIIllIIll();
    }

    private void lllIIIllIIIIlllIlIIllIIll() {
        while (this.IlIllllllIIlIIllllIIlIIIl != 0 && !this.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl].hasNext()) {
            --this.IlIllllllIIlIIllllIIlIIIl;
            ++this.lllIlIIlIIIlIlIIIllIlllIl;
        }
    }

    @Override
    public boolean hasNext() {
        return this.IlIllllllIIlIIllllIIlIIIl > 0;
    }

    public Object next() {
        if (!this.hasNext()) {
            throw new NoSuchElementException();
        }
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIlIIlIIIlIlIIIllIlllIl;
        Object e = this.lllIIIllIIIIlllIlIIllIIll[this.lIlllIlllIIIIlIIlllIllIII].next();
        this.lllIIIllIIIIlllIlIIllIIll();
        return e;
    }

    @Override
    public void remove() {
        if (this.lIlllIlllIIIIlIIlllIllIII == -1) {
            throw new IllegalStateException();
        }
        this.lllIIIllIIIIlllIlIIllIIll[this.lIlllIlllIIIIlIIlllIllIII].remove();
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.lIlllIlllIIIIlIIlllIllIII = -1;
        int n2 = 0;
        while (n2 < n && this.IlIllllllIIlIIllllIIlIIIl != 0) {
            n2 += this.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl].lllIlIIlIIIlIlIIIllIlllIl(n - n2);
            if (this.lllIIIllIIIIlllIlIIllIIll[this.lllIlIIlIIIlIlIIIllIlllIl].hasNext()) break;
            --this.IlIllllllIIlIIllllIIlIIIl;
            ++this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return n2;
    }
}

