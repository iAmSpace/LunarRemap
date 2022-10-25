package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class class_0180
extends class_0469 {
    private class_1334 lllIlIIlIIIlIlIIIllIlllIl;
    private final List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private final List lIlllIlllIIIIlIIlllIllIII = new ArrayList();
    private final List IlIIIIIllllllIIlllIllllll = new ArrayList();
    private int lIllllIIlIIIlIllllllIIIll;

    public class_0180(String string) {
        super(string);
    }

    public class_0180(class_1334 class_13342) {
        super("villages");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13342;
        this.lIlllIlllIIIIlIIlllIllIII();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_13342;
        for (class_0938 class_09382 : this.IlIIIIIllllllIIlllIllllll) {
            class_09382.lllIIIllIIIIlllIlIIllIIll(class_13342);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (this.IlIllllllIIlIIllllIIlIIIl.size() <= 64 && !this.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
            this.IlIllllllIIlIIllllIIlIIIl.add(new class_2208(n, n2, n3));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ++this.lIllllIIlIIIlIllllllIIIll;
        for (class_0938 class_09382 : this.IlIIIIIllllllIIlllIllllll) {
            class_09382.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll);
        }
        this.IlIllllllIIlIIllllIIlIIIl();
        this.lIllllIIlIIIlIllllllIIIll();
        this.IIIllIIlIIIIIIlIlIIllIIlI();
        if (this.lIllllIIlIIIlIllllllIIIll % 400 == 0) {
            this.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    private void IlIllllllIIlIIllllIIlIIIl() {
        Iterator iterator = this.IlIIIIIllllllIIlllIllllll.iterator();
        while (iterator.hasNext()) {
            class_0938 class_09382 = (class_0938)iterator.next();
            if (!class_09382.IIIllIIlIIIIIIlIlIIllIIlI()) continue;
            iterator.remove();
            this.lIlllIlllIIIIlIIlllIllIII();
        }
    }

    public List lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public class_0938 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        class_0938 class_09382 = null;
        float f = Float.MAX_VALUE;
        for (class_0938 class_09383 : this.IlIIIIIllllllIIlllIllllll) {
            float f2;
            float f3 = class_09383.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
            if (!(f3 < f) || !(f3 <= (f2 = (float)(n4 + class_09383.lllIlIIlIIIlIlIIIllIlllIl())) * f2)) continue;
            class_09382 = class_09383;
            f = f3;
        }
        return class_09382;
    }

    private void lIllllIIlIIIlIllllllIIIll() {
        if (!this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) {
            this.lllIIIllIIIIlllIlIIllIIll((class_2208)this.IlIllllllIIlIIllllIIlIIIl.remove(0));
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI() {
        for (int i = 0; i < this.lIlllIlllIIIIlIIlllIllIII.size(); ++i) {
            class_0938 class_093822;
            class_1529 class_15292 = (class_1529)this.lIlllIlllIIIIlIIlllIllIII.get(i);
            boolean bl = false;
            for (class_0938 class_093822 : this.IlIIIIIllllllIIlllIllllll) {
                int n;
                int n2 = (int)class_093822.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(class_15292.lllIIIllIIIIlllIlIIllIIll, class_15292.lllIlIIlIIIlIlIIIllIlllIl, class_15292.IlIllllllIIlIIllllIIlIIIl);
                if (n2 > (n = 32 + class_093822.lllIlIIlIIIlIlIIIllIlllIl()) * n) continue;
                class_093822.lllIIIllIIIIlllIlIIllIIll(class_15292);
                bl = true;
                break;
            }
            if (bl) continue;
            class_093822 = new class_0938(this.lllIlIIlIIIlIlIIIllIlllIl);
            class_093822.lllIIIllIIIIlllIlIIllIIll(class_15292);
            this.IlIIIIIllllllIIlllIllllll.add(class_093822);
            this.lIlllIlllIIIIlIIlllIllIII();
        }
        this.lIlllIlllIIIIlIIlllIllIII.clear();
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_2208 class_22082) {
        int n = 16;
        int n2 = 4;
        int n3 = 16;
        for (int i = class_22082.lllIIIllIIIIlllIlIIllIIll - n; i < class_22082.lllIIIllIIIIlllIlIIllIIll + n; ++i) {
            for (int j = class_22082.lllIlIIlIIIlIlIIIllIlllIl - n2; j < class_22082.lllIlIIlIIIlIlIIIllIlllIl + n2; ++j) {
                for (int k = class_22082.IlIllllllIIlIIllllIIlIIIl - n3; k < class_22082.IlIllllllIIlIIllllIIlIIIl + n3; ++k) {
                    if (!this.IlIIIIIllllllIIlllIllllll(i, j, k)) continue;
                    class_1529 class_15292 = this.lllIlIIlIIIlIlIIIllIlllIl(i, j, k);
                    if (class_15292 == null) {
                        this.IlIllllllIIlIIllllIIlIIIl(i, j, k);
                        continue;
                    }
                    class_15292.lIllllIIlIIIlIllllllIIIll = this.lIllllIIlIIIlIllllllIIIll;
                }
            }
        }
    }

    private class_1529 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        class_1529 class_15292;
        Iterator iterator = this.lIlllIlllIIIIlIIlllIllIII.iterator();
        do {
            if (!iterator.hasNext()) {
                class_0938 class_09382;
                class_1529 class_15293;
                iterator = this.IlIIIIIllllllIIlllIllllll.iterator();
                do {
                    if (iterator.hasNext()) continue;
                    return null;
                } while ((class_15293 = (class_09382 = (class_0938)iterator.next()).lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) == null);
                return class_15293;
            }
            class_15292 = (class_1529)iterator.next();
        } while (class_15292.lllIIIllIIIIlllIlIIllIIll != n || class_15292.IlIllllllIIlIIllllIIlIIIl != n3 || Math.abs(class_15292.lllIlIIlIIIlIlIIIllIlllIl - n2) > 1);
        return class_15292;
    }

    private void IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        int n4 = ((class_2089) Blocks.IlIIllIlIlIllIIIlIIlIlIIl).IlIIIIIllllllIIlllIllllll((class_1843)this.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3);
        if (n4 != 0 && n4 != 2) {
            int n5;
            int n6 = 0;
            for (n5 = -5; n5 < 0; ++n5) {
                if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl(n, n2, n3 + n5)) continue;
                --n6;
            }
            for (n5 = 1; n5 <= 5; ++n5) {
                if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl(n, n2, n3 + n5)) continue;
                ++n6;
            }
            if (n6 != 0) {
                this.lIlllIlllIIIIlIIlllIllIII.add(new class_1529(n, n2, n3, 0, n6 > 0 ? -2 : 2, this.lIllllIIlIIIlIllllllIIIll));
            }
        } else {
            int n7;
            int n8 = 0;
            for (n7 = -5; n7 < 0; ++n7) {
                if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl(n + n7, n2, n3)) continue;
                --n8;
            }
            for (n7 = 1; n7 <= 5; ++n7) {
                if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIlllllllIIlIIlIIIIlIl(n + n7, n2, n3)) continue;
                ++n8;
            }
            if (n8 != 0) {
                this.lIlllIlllIIIIlIIlllIllIII.add(new class_1529(n, n2, n3, n8 > 0 ? -2 : 2, 0, this.lIllllIIlIIIlIllllllIIIll));
            }
        }
    }

    private boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        class_2208 class_22082;
        Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl.iterator();
        do {
            if (!iterator.hasNext()) {
                return false;
            }
            class_22082 = (class_2208)iterator.next();
        } while (class_22082.lllIIIllIIIIlllIlIIllIIll != n || class_22082.lllIlIIlIIIlIlIIIllIlllIl != n2 || class_22082.IlIllllllIIlIIllllIIlIIIl != n3);
        return true;
    }

    private boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.a_(n, n2, n3) == Blocks.IlIIllIlIlIllIIIlIIlIlIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.lIllllIIlIIIlIllllllIIIll = class_07752.lIllllIIlIIIlIllllllIIIll("Tick");
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Villages", 10);
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            class_0938 class_09382 = new class_0938();
            class_09382.lllIIIllIIIIlllIlIIllIIll(class_07753);
            this.IlIIIIIllllllIIlllIllllll.add(class_09382);
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Tick", this.lIllllIIlIIIlIllllllIIIll);
        class_2145 class_21452 = new class_2145();
        for (class_0938 class_09382 : this.IlIIIIIllllllIIlllIllllll) {
            class_0775 class_07753 = new class_0775();
            class_09382.lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Villages", class_21452);
    }
}

