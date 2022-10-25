package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashSet;
import java.util.Set;

public class class_1890 {
    private transient class_0511[] lllIIIllIIIIlllIlIIllIIll = new class_0511[16];
    private transient int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl = 12;
    private final float lIlllIlllIIIIlIIlllIllIII = 0.75f;
    private volatile transient int IlIIIIIllllllIIlllIllllll;
    private Set lIllllIIlIIIlIllllllIIIll = new HashSet();

    private static int IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        n ^= n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n & n2 - 1;
    }

    public Object lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = class_1890.IIIllIIlIIIIIIlIlIIllIIlI(n);
        class_0511 class_05112 = this.lllIIIllIIIIlllIlIIllIIll[class_1890.lllIIIllIIIIlllIlIIllIIll(n2, this.lllIIIllIIIIlllIlIIllIIll.length)];
        while (class_05112 != null) {
            if (class_05112.lllIIIllIIIIlllIlIIllIIll == n) {
                return class_05112.lllIlIIlIIIlIlIIIllIlllIl;
            }
            class_05112 = class_05112.IlIllllllIIlIIllllIIlIIIl;
        }
        return null;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.IlIllllllIIlIIllllIIlIIIl(n) != null;
    }

    final class_0511 IlIllllllIIlIIllllIIlIIIl(int n) {
        int n2 = class_1890.IIIllIIlIIIIIIlIlIIllIIlI(n);
        class_0511 class_05112 = this.lllIIIllIIIIlllIlIIllIIll[class_1890.lllIIIllIIIIlllIlIIllIIll(n2, this.lllIIIllIIIIlllIlIIllIIll.length)];
        while (class_05112 != null) {
            if (class_05112.lllIIIllIIIIlllIlIIllIIll == n) {
                return class_05112;
            }
            class_05112 = class_05112.IlIllllllIIlIIllllIIlIIIl;
        }
        return null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, Object object) {
        this.lIllllIIlIIIlIllllllIIIll.add(n);
        int n2 = class_1890.IIIllIIlIIIIIIlIlIIllIIlI(n);
        int n3 = class_1890.lllIIIllIIIIlllIlIIllIIll(n2, this.lllIIIllIIIIlllIlIIllIIll.length);
        class_0511 class_05112 = this.lllIIIllIIIIlllIlIIllIIll[n3];
        while (class_05112 != null) {
            if (class_05112.lllIIIllIIIIlllIlIIllIIll == n) {
                class_05112.lllIlIIlIIIlIlIIIllIlllIl = object;
                return;
            }
            class_05112 = class_05112.IlIllllllIIlIIllllIIlIIIl;
        }
        ++this.IlIIIIIllllllIIlllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll(n2, n, object, n3);
    }

    private void IllIIlllllllIIlIIlIIIIlIl(int n) {
        class_0511[] arrclass_0511 = this.lllIIIllIIIIlllIlIIllIIll;
        int n2 = arrclass_0511.length;
        if (n2 == 0x40000000) {
            this.IlIllllllIIlIIllllIIlIIIl = Integer.MAX_VALUE;
        } else {
            class_0511[] arrclass_05112 = new class_0511[n];
            this.lllIIIllIIIIlllIlIIllIIll(arrclass_05112);
            this.lllIIIllIIIIlllIlIIllIIll = arrclass_05112;
            float f = n;
            this.getClass();
            this.IlIllllllIIlIIllllIIlIIIl = (int)(f * 0.75f);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0511[] arrclass_0511) {
        class_0511[] arrclass_05112 = this.lllIIIllIIIIlllIlIIllIIll;
        int n = arrclass_0511.length;
        for (int i = 0; i < arrclass_05112.length; ++i) {
            class_0511 class_05112;
            class_0511 class_05113 = arrclass_05112[i];
            if (class_05113 == null) continue;
            arrclass_05112[i] = null;
            do {
                class_05112 = class_05113.IlIllllllIIlIIllllIIlIIIl;
                int n2 = class_1890.lllIIIllIIIIlllIlIIllIIll(class_05113.lIlllIlllIIIIlIIlllIllIII, n);
                class_05113.IlIllllllIIlIIllllIIlIIIl = arrclass_0511[n2];
                arrclass_0511[n2] = class_05113;
                class_05113 = class_05112;
            } while (class_05112 != null);
        }
    }

    public Object lIlllIlllIIIIlIIlllIllIII(int n) {
        this.lIllllIIlIIIlIllllllIIIll.remove(n);
        class_0511 class_05112 = this.IlIIIIIllllllIIlllIllllll(n);
        return class_05112 == null ? null : class_05112.lllIlIIlIIIlIlIIIllIlllIl;
    }

    final class_0511 IlIIIIIllllllIIlllIllllll(int n) {
        class_0511 class_05112;
        int n2 = class_1890.IIIllIIlIIIIIIlIlIIllIIlI(n);
        int n3 = class_1890.lllIIIllIIIIlllIlIIllIIll(n2, this.lllIIIllIIIIlllIlIIllIIll.length);
        class_0511 class_05113 = class_05112 = this.lllIIIllIIIIlllIlIIllIIll[n3];
        while (class_05113 != null) {
            class_0511 class_05114 = class_05113.IlIllllllIIlIIllllIIlIIIl;
            if (class_05113.lllIIIllIIIIlllIlIIllIIll == n) {
                ++this.IlIIIIIllllllIIlllIllllll;
                --this.lllIlIIlIIIlIlIIIllIlllIl;
                if (class_05112 == class_05113) {
                    this.lllIIIllIIIIlllIlIIllIIll[n3] = class_05114;
                } else {
                    class_05112.IlIllllllIIlIIllllIIlIIIl = class_05114;
                }
                return class_05113;
            }
            class_05112 = class_05113;
            class_05113 = class_05114;
        }
        return class_05113;
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ++this.IlIIIIIllllllIIlllIllllll;
        class_0511[] arrclass_0511 = this.lllIIIllIIIIlllIlIIllIIll;
        for (int i = 0; i < arrclass_0511.length; ++i) {
            arrclass_0511[i] = null;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = 0;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, Object object, int n3) {
        class_0511 class_05112 = this.lllIIIllIIIIlllIlIIllIIll[n3];
        this.lllIIIllIIIIlllIlIIllIIll[n3] = new class_0511(n, n2, object, class_05112);
        if (this.lllIlIIlIIIlIlIIIllIlllIl++ >= this.IlIllllllIIlIIllllIIlIIIl) {
            this.IllIIlllllllIIlIIlIIIIlIl(2 * this.lllIIIllIIIIlllIlIIllIIll.length);
        }
    }

    static /* synthetic */ int lIllllIIlIIIlIllllllIIIll(int n) {
        return class_1890.IIIllIIlIIIIIIlIlIIllIIlI(n);
    }
}

