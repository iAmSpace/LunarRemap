package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class class_0284 {
    private ArrayList lllIIIllIIIIlllIlIIllIIll = null;
    private int lllIlIIlIIIlIlIIIllIlllIl = 0;
    private float IlIllllllIIlIIllllIIlIIIl = 1.0f;
    private int lIlllIlllIIIIlIIlllIllIII = 0;

    public class_0284() {
        this(10, 0.75f);
    }

    public class_0284(int n) {
        this(n, 0.75f);
    }

    public class_0284(int n, float f) {
        this.lllIIIllIIIIlllIlIIllIIll = new ArrayList(n);
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = f;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, Object object) {
        if (object != null) {
            ++this.lIlllIlllIIIIlIIlllIllIII;
        }
        this.lllIIIllIIIIlllIlIIllIIll.add(n, object);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(Object object) {
        if (object != null) {
            ++this.lIlllIlllIIIIlIIlllIllIII;
        }
        return this.lllIIIllIIIIlllIlIIllIIll.add(object);
    }

    public Object lllIlIIlIIIlIlIIIllIlllIl(int n, Object object) {
        Object object2 = this.lllIIIllIIIIlllIlIIllIIll.set(n, object);
        if (object != object2) {
            if (object2 == null) {
                ++this.lIlllIlllIIIIlIIlllIllIII;
            }
            if (object == null) {
                --this.lIlllIlllIIIIlIIlllIllIII;
            }
        }
        return object2;
    }

    public Object lllIIIllIIIIlllIlIIllIIll(int n) {
        Object e = this.lllIIIllIIIIlllIlIIllIIll.remove(n);
        if (e != null) {
            --this.lIlllIlllIIIIlIIlllIllIII;
        }
        return e;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.lllIIIllIIIIlllIlIIllIIll.clear();
        this.lIlllIlllIIIIlIIlllIllIII = 0;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        float f;
        if (this.lIlllIlllIIIIlIIlllIllIII <= 0 && this.lllIIIllIIIIlllIlIIllIIll.size() <= 0) {
            this.lllIIIllIIIIlllIlIIllIIll();
        } else if (this.lllIIIllIIIIlllIlIIllIIll.size() > this.lllIlIIlIIIlIlIIIllIlllIl && (f = (float)this.lIlllIlllIIIIlIIlllIllIII * 1.0f / (float)this.lllIIIllIIIIlllIlIIllIIll.size()) <= this.IlIllllllIIlIIllllIIlIIIl) {
            int n;
            int n2 = 0;
            for (n = 0; n < this.lllIIIllIIIIlllIlIIllIIll.size(); ++n) {
                Object e = this.lllIIIllIIIIlllIlIIllIIll.get(n);
                if (e == null) continue;
                if (n != n2) {
                    this.lllIIIllIIIIlllIlIIllIIll.set(n2, e);
                }
                ++n2;
            }
            for (n = this.lllIIIllIIIIlllIlIIllIIll.size() - 1; n >= n2; --n) {
                this.lllIIIllIIIIlllIlIIllIIll.remove(n);
            }
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll.contains(object);
    }

    public Object lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll.get(n);
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll.isEmpty();
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIIIllIIIIlllIlIIllIIll.size();
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }
}

