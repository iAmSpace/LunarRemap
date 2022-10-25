package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Array;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class class_1877 {
    private final Object[] lllIIIllIIIIlllIlIIllIIll;
    private final Class lllIlIIlIIIlIlIIIllIlllIl;
    private final ReadWriteLock IlIllllllIIlIIllllIIlIIIl = new ReentrantReadWriteLock();
    private int lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;

    public class_1877(Class class_, int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_;
        this.lllIIIllIIIIlllIlIIllIIll = (Object[])Array.newInstance(class_, n);
    }

    public Object lllIIIllIIIIlllIlIIllIIll(Object object) {
        this.IlIllllllIIlIIllllIIlIIIl.writeLock().lock();
        this.lllIIIllIIIIlllIlIIllIIll[this.IlIIIIIllllllIIlllIllllll] = object;
        this.IlIIIIIllllllIIlllIllllll = (this.IlIIIIIllllllIIlllIllllll + 1) % this.lllIIIllIIIIlllIlIIllIIll();
        if (this.lIlllIlllIIIIlIIlllIllIII < this.lllIIIllIIIIlllIlIIllIIll()) {
            ++this.lIlllIlllIIIIlIIlllIllIII;
        }
        this.IlIllllllIIlIIllllIIlIIIl.writeLock().unlock();
        return object;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        this.IlIllllllIIlIIllllIIlIIIl.readLock().lock();
        int n = this.lllIIIllIIIIlllIlIIllIIll.length;
        this.IlIllllllIIlIIllllIIlIIIl.readLock().unlock();
        return n;
    }

    public Object[] lllIlIIlIIIlIlIIIllIlllIl() {
        Object[] arrobject = (Object[])Array.newInstance(this.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII);
        this.IlIllllllIIlIIllllIIlIIIl.readLock().lock();
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII; ++i) {
            int n = (this.IlIIIIIllllllIIlllIllllll - this.lIlllIlllIIIIlIIlllIllIII + i) % this.lllIIIllIIIIlllIlIIllIIll();
            if (n < 0) {
                n += this.lllIIIllIIIIlllIlIIllIIll();
            }
            arrobject[i] = this.lllIIIllIIIIlllIlIIllIIll[n];
        }
        this.IlIllllllIIlIIllllIIlIIIl.readLock().unlock();
        return arrobject;
    }
}

