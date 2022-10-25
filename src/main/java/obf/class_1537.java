package obf;/*
 * Decompiled with CFR 0.150.
 */
import optifine.Config;

import java.util.List;

public class class_1537
implements class_0119 {
    private long lllIIIllIIIIlllIlIIllIIll = 0L;
    private long lllIlIIlIIIlIlIIIllIlllIl = 0L;
    private long IlIllllllIIlIIllllIIlIIIl = 10000000L;
    private class_0171 lIlllIlllIIIIlIIlllIllIII = null;
    private int IlIIIIIllllllIIlllIllllll = 0;
    private int lIllllIIlIIIlIllllllIIIll = 0;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
    }

    @Override
    public void IIIllIIlIIIIIIlIlIIllIIlI() {
    }

    @Override
    public class_0734 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, List list, int n, int n2, int n3, int n4) {
        return new class_0171(class_13342, list, n, n2, n3, n4);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142, class_1965 class_19652, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = this.lllIlIIlIIIlIlIIIllIlllIl;
        this.lllIlIIlIIIlIlIIIllIlllIl = System.nanoTime();
        long l = this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl;
        int n = Config.lIlIllIIlIIlIIlIIlIIlIIll();
        if (Config.llIIlIllIllllIlIIIIlIIlll() && !class_11142.lllIIIllIIIIlllIlIIllIIll(class_19652)) {
            n *= 3;
        }
        this.IlIIIIIllllllIIlllIllllll = 0;
        do {
            this.lIllllIIlIIIlIllllllIIIll = 0;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_11142, class_19652, bl);
        } while (this.lIllllIIlIIIlIllllllIIIll > 0 && System.nanoTime() - l < 0L);
        if (this.lIllllIIlIIIlIllllllIIIll > 0) {
            n = Math.min(n, this.lIllllIIlIIIlIllllllIIIll);
            long l2 = 400000L;
            if (this.IlIIIIIllllllIIlllIllllll > n) {
                this.IlIllllllIIlIIllllIIlIIIl -= 2L * l2;
            }
            if (this.IlIIIIIllllllIIlllIllllll < n) {
                this.IlIllllllIIlIIllllIIlIIIl += l2;
            }
        } else {
            this.IlIllllllIIlIIllllIIlIIIl = 0L;
            this.IlIllllllIIlIIllllIIlIIIl -= 200000L;
        }
        if (this.IlIllllllIIlIIllllIIlIIIl < 0L) {
            this.IlIllllllIIlIIllllIIlIIIl = 0L;
        }
        return this.IlIIIIIllllllIIlllIllllll > 0;
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1114 class_11142, class_1965 class_19652, boolean bl) {
        this.lIllllIIlIIIlIllllllIIIll = 0;
        boolean bl2 = true;
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            ++this.lIllllIIlIIIlIllllllIIIll;
            bl2 = this.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII);
            if (bl2) {
                ++this.IlIIIIIllllllIIlllIllllll;
            }
        }
        if (class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() > 0) {
            float f;
            int n;
            int n2 = 4;
            class_0171 class_01712 = null;
            float f2 = Float.MAX_VALUE;
            int n3 = -1;
            for (n = 0; n < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(); ++n) {
                class_0171 class_01713 = (class_0171)class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n);
                if (class_01713 == null) continue;
                ++this.lIllllIIlIIIlIllllllIIIll;
                if (!class_01713.lIlIlIIlIIIIlIIIIIlllIIII) {
                    class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n, null);
                    continue;
                }
                f = class_01713.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652);
                if (f <= 256.0f && class_11142.IllIIIllIIIIlIlIlIllIIlll()) {
                    class_01713.IllIIlllllllIIlIIlIIIIlIl();
                    class_01713.lIlIlIIlIIIIlIIIIIlllIIII = false;
                    class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n, null);
                    ++this.IlIIIIIllllllIIlllIllllll;
                    continue;
                }
                if (!class_01713.IlIlllIIIIIIlIIllIIllIlll) {
                    f *= (float)n2;
                }
                if (class_01712 == null) {
                    class_01712 = class_01713;
                    f2 = f;
                    n3 = n;
                    continue;
                }
                if (!(f < f2)) continue;
                class_01712 = class_01713;
                f2 = f;
                n3 = n;
            }
            if (this.lIlllIlllIIIIlIIlllIllIII == null || bl2) {
                if (class_01712 != null) {
                    class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n3, null);
                    if (!this.lllIIIllIIIIlllIlIIllIIll(class_01712)) {
                        return;
                    }
                    ++this.IlIIIIIllllllIIlllIllllll;
                    if (System.nanoTime() > this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl) {
                        return;
                    }
                    f = f2 / 5.0f;
                    for (int i = 0; i < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                        float f3;
                        class_0171 class_01714 = (class_0171)class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i);
                        if (class_01714 == null) continue;
                        float f4 = class_01714.lllIIIllIIIIlllIlIIllIIll((class_1521)class_19652);
                        if (!class_01714.IlIlllIIIIIIlIIllIIllIlll) {
                            f4 *= (float)n2;
                        }
                        if (!((f3 = Math.abs(f4 - f2)) < f)) continue;
                        class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(i, null);
                        if (!this.lllIIIllIIIIlllIlIIllIIll(class_01714)) {
                            return;
                        }
                        ++this.IlIIIIIllllllIIlllIllllll;
                        if (System.nanoTime() > this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl) break;
                    }
                }
                if (this.lIllllIIlIIIlIllllllIIIll == 0) {
                    class_11142.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
                }
                if (class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() > 100 && this.lIllllIIlIIIlIllllllIIIll < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() * 4 / 5) {
                    int n4;
                    n = 0;
                    for (n4 = 0; n4 < class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(); ++n4) {
                        Object object = class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n4);
                        if (object == null) continue;
                        if (n4 != n) {
                            class_11142.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n, object);
                        }
                        ++n;
                    }
                    for (n4 = class_11142.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII() - 1; n4 >= n; --n4) {
                        class_11142.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(n4);
                    }
                }
            }
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0171 class_01712) {
        long l = this.lllIlIIlIIIlIlIIIllIlllIl + this.IlIllllllIIlIIllllIIlIIIl;
        class_01712.lIlIlIIlIIIIlIIIIIlllIIII = false;
        boolean bl = class_01712.lllIIIllIIIIlllIlIIllIIll(l);
        if (!bl) {
            this.lIlllIlllIIIIlIIlllIllIII = class_01712;
            return false;
        }
        class_01712.IIIllIllIIlIlIlIlIllllIIl();
        this.lIlllIlllIIIIlIIlllIllIII = null;
        return true;
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        if (this.lIlllIlllIIIIlIIlllIllIII != null) {
            this.lIlllIlllIIIIlIIlllIllIII.IllIIlllllllIIlIIlIIIIlIl();
            this.lIlllIlllIIIIlIIlllIllIII = null;
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142, class_1965 class_19652) {
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public void lIllllIIlIIIlIllllllIIIll() {
        this.IlIIIIIllllllIIlllIllllll();
    }
}

