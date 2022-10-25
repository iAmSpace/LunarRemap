package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1562 {
    private transient class_2048[] lllIIIllIIIIlllIlIIllIIll = new class_2048[1024];
    private transient int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl = (int)(0.75f * (float)this.lllIIIllIIIIlllIlIIllIIll.length);
    private final float lIlllIlllIIIIlIIlllIllIII;
    private volatile transient int IlIIIIIllllllIIlllIllllll;

    public class_1562() {
        this.lIlllIlllIIIIlIIlllIllIII = 0.75f;
    }

    private static int IIIllIIlIIIIIIlIlIIllIIlI(long l) {
        return (int)(l ^ l >>> 27);
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n) {
        n ^= n >>> 20 ^ n >>> 12;
        return n ^ n >>> 7 ^ n >>> 4;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n & n2 - 1;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public Object lllIIIllIIIIlllIlIIllIIll(long l) {
        int n = class_1562.IIIllIIlIIIIIIlIlIIllIIlI(l);
        class_2048 class_20482 = this.lllIIIllIIIIlllIlIIllIIll[class_1562.lllIIIllIIIIlllIlIIllIIll(n, this.lllIIIllIIIIlllIlIIllIIll.length)];
        while (class_20482 != null) {
            if (class_20482.lllIIIllIIIIlllIlIIllIIll == l) {
                return class_20482.lllIlIIlIIIlIlIIIllIlllIl;
            }
            class_20482 = class_20482.IlIllllllIIlIIllllIIlIIIl;
        }
        return null;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(long l) {
        return this.IlIllllllIIlIIllllIIlIIIl(l) != null;
    }

    final class_2048 IlIllllllIIlIIllllIIlIIIl(long l) {
        int n = class_1562.IIIllIIlIIIIIIlIlIIllIIlI(l);
        class_2048 class_20482 = this.lllIIIllIIIIlllIlIIllIIll[class_1562.lllIIIllIIIIlllIlIIllIIll(n, this.lllIIIllIIIIlllIlIIllIIll.length)];
        while (class_20482 != null) {
            if (class_20482.lllIIIllIIIIlllIlIIllIIll == l) {
                return class_20482;
            }
            class_20482 = class_20482.IlIllllllIIlIIllllIIlIIIl;
        }
        return null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l, Object object) {
        int n = class_1562.IIIllIIlIIIIIIlIlIIllIIlI(l);
        int n2 = class_1562.lllIIIllIIIIlllIlIIllIIll(n, this.lllIIIllIIIIlllIlIIllIIll.length);
        class_2048 class_20482 = this.lllIIIllIIIIlllIlIIllIIll[n2];
        while (class_20482 != null) {
            if (class_20482.lllIIIllIIIIlllIlIIllIIll == l) {
                class_20482.lllIlIIlIIIlIlIIIllIlllIl = object;
                return;
            }
            class_20482 = class_20482.IlIllllllIIlIIllllIIlIIIl;
        }
        ++this.IlIIIIIllllllIIlllIllllll;
        this.lllIIIllIIIIlllIlIIllIIll(n, l, object, n2);
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        class_2048[] arrclass_2048 = this.lllIIIllIIIIlllIlIIllIIll;
        int n2 = arrclass_2048.length;
        if (n2 == 0x40000000) {
            this.IlIllllllIIlIIllllIIlIIIl = Integer.MAX_VALUE;
        } else {
            class_2048[] arrclass_20482 = new class_2048[n];
            this.lllIIIllIIIIlllIlIIllIIll(arrclass_20482);
            this.lllIIIllIIIIlllIlIIllIIll = arrclass_20482;
            float f = n;
            this.getClass();
            this.IlIllllllIIlIIllllIIlIIIl = (int)(f * 0.75f);
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2048[] arrclass_2048) {
        class_2048[] arrclass_20482 = this.lllIIIllIIIIlllIlIIllIIll;
        int n = arrclass_2048.length;
        for (int i = 0; i < arrclass_20482.length; ++i) {
            class_2048 class_20482;
            class_2048 class_20483 = arrclass_20482[i];
            if (class_20483 == null) continue;
            arrclass_20482[i] = null;
            do {
                class_20482 = class_20483.IlIllllllIIlIIllllIIlIIIl;
                int n2 = class_1562.lllIIIllIIIIlllIlIIllIIll(class_20483.lIlllIlllIIIIlIIlllIllIII, n);
                class_20483.IlIllllllIIlIIllllIIlIIIl = arrclass_2048[n2];
                arrclass_2048[n2] = class_20483;
                class_20483 = class_20482;
            } while (class_20482 != null);
        }
    }

    public Object lIlllIlllIIIIlIIlllIllIII(long l) {
        class_2048 class_20482 = this.IlIIIIIllllllIIlllIllllll(l);
        return class_20482 == null ? null : class_20482.lllIlIIlIIIlIlIIIllIlllIl;
    }

    final class_2048 IlIIIIIllllllIIlllIllllll(long l) {
        class_2048 class_20482;
        int n = class_1562.IIIllIIlIIIIIIlIlIIllIIlI(l);
        int n2 = class_1562.lllIIIllIIIIlllIlIIllIIll(n, this.lllIIIllIIIIlllIlIIllIIll.length);
        class_2048 class_20483 = class_20482 = this.lllIIIllIIIIlllIlIIllIIll[n2];
        while (class_20483 != null) {
            class_2048 class_20484 = class_20483.IlIllllllIIlIIllllIIlIIIl;
            if (class_20483.lllIIIllIIIIlllIlIIllIIll == l) {
                ++this.IlIIIIIllllllIIlllIllllll;
                --this.lllIlIIlIIIlIlIIIllIlllIl;
                if (class_20482 == class_20483) {
                    this.lllIIIllIIIIlllIlIIllIIll[n2] = class_20484;
                } else {
                    class_20482.IlIllllllIIlIIllllIIlIIIl = class_20484;
                }
                return class_20483;
            }
            class_20482 = class_20483;
            class_20483 = class_20484;
        }
        return class_20483;
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, long l, Object object, int n2) {
        class_2048 class_20482 = this.lllIIIllIIIIlllIlIIllIIll[n2];
        this.lllIIIllIIIIlllIlIIllIIll[n2] = new class_2048(n, l, object, class_20482);
        if (this.lllIlIIlIIIlIlIIIllIlllIl++ >= this.IlIllllllIIlIIllllIIlIIIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl(2 * this.lllIIIllIIIIlllIlIIllIIll.length);
        }
    }

    public double lllIlIIlIIIlIlIIIllIlllIl() {
        int n = 0;
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i] == null) continue;
            ++n;
        }
        return 1.0 * (double)n / (double)this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    static /* synthetic */ int lIllllIIlIIIlIllllllIIIll(long l) {
        return class_1562.IIIllIIlIIIIIIlIlIIllIIlI(l);
    }
}

