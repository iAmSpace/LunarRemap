package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeMap;

public class class_0938 {
    private class_1334 lllIIIllIIIIlllIlIIllIIll;
    private final List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private final class_2208 IlIllllllIIlIIllllIIlIIIl = new class_2208(0, 0, 0);
    private final class_2208 lIlllIlllIIIIlIIlllIllIII = new class_2208(0, 0, 0);
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll;
    private int IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private TreeMap IllIIIllIIIIlIlIlIllIIlll = new TreeMap();
    private List lIIIIlIlIIlllllIIllIIlIII = new ArrayList();
    private int llIIlllIllIllllIIIlIIIIII;

    public class_0938() {
    }

    public class_0938(class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        this.lllIIIllIIIIlllIlIIllIIll = class_13342;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        class_0864 class_08642;
        int n2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = n;
        this.llIIllIllIlIIlIIllIllllll();
        this.llIIlllIllIllllIIIlIIIIII();
        if (n % 20 == 0) {
            this.lIIIIlIlIIlllllIIllIIlIII();
        }
        if (n % 30 == 0) {
            this.IllIIIllIIIIlIlIlIllIIlll();
        }
        if (this.llIIlllIllIllllIIIlIIIIII < (n2 = this.IllIIlllllllIIlIIlIIIIlIl / 10) && this.lllIlIIlIIIlIlIIIllIlllIl.size() > 20 && this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(7000) == 0 && (class_08642 = this.lllIIIllIIIIlllIlIIllIIll(MathHelper.lIlllIlllIIIIlIIlllIllIII((float)this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll), MathHelper.lIlllIlllIIIIlIIlllIllIII((float)this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl), MathHelper.lIlllIlllIIIIlIIlllIllIII((float)this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl), 2, 4, 2)) != null) {
            class_0991 class_09912 = new class_0991(this.lllIIIllIIIIlllIlIIllIIll);
            class_09912.IlIllllllIIlIIllllIIlIIIl(class_08642.lllIIIllIIIIlllIlIIllIIll, class_08642.lllIlIIlIIIlIlIIIllIlllIl, class_08642.IlIllllllIIlIIllllIIlIIIl);
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_09912);
            ++this.llIIlllIllIllllIIIlIIIIII;
        }
    }

    private class_0864 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        for (int i = 0; i < 10; ++i) {
            int n7;
            int n8;
            int n9 = n + this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(16) - 8;
            if (!this.lllIIIllIIIIlllIlIIllIIll(n9, n8 = n2 + this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(6) - 3, n7 = n3 + this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(16) - 8) || !this.lllIlIIlIIIlIlIIIllIlllIl(n9, n8, n7, n4, n5, n6)) continue;
            return class_0864.lllIIIllIIIIlllIlIIllIIll(n9, n8, n7);
        }
        return null;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4, int n5, int n6) {
        if (!class_1334.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n, n2 - 1, n3)) {
            return false;
        }
        int n7 = n - n4 / 2;
        int n8 = n3 - n6 / 2;
        for (int i = n7; i < n7 + n4; ++i) {
            for (int j = n2; j < n2 + n5; ++j) {
                for (int k = n8; k < n8 + n6; ++k) {
                    if (!this.lllIIIllIIIIlllIlIIllIIll.a_(i, j, k).IIIllIllIIlIlIlIlIllllIIl()) continue;
                    return false;
                }
            }
        }
        return true;
    }

    private void IllIIIllIIIIlIlIlIllIIlll() {
        List list = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_0991.class, class_1974.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll - this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl - 4, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl - this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll + this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl + 4, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl + this.IlIIIIIllllllIIlllIllllll));
        this.llIIlllIllIllllIIIlIIIIII = list.size();
    }

    private void lIIIIlIlIIlllllIIllIIlIII() {
        List list = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_1817.class, class_1974.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll - this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl - 4, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl - this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll + this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl + 4, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl + this.IlIIIIIllllllIIlllIllllll));
        this.IllIIlllllllIIlIIlIIIIlIl = list.size();
        if (this.IllIIlllllllIIlIIlIIIIlIl == 0) {
            this.IllIIIllIIIIlIlIlIllIIlll.clear();
        }
    }

    public class_2208 lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.size();
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI - this.lIllllIIlIIIlIllllllIIIll;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3) < (float)(this.IlIIIIIllllllIIlllIllllll * this.IlIIIIIllllllIIlllIllllll);
    }

    public List lIllllIIlIIIlIllllllIIIll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_1529 lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        class_1529 class_15292 = null;
        int n4 = Integer.MAX_VALUE;
        for (class_1529 class_15293 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            int n5 = class_15293.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            if (n5 >= n4) continue;
            class_15292 = class_15293;
            n4 = n5;
        }
        return class_15292;
    }

    public class_1529 IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        class_1529 class_15292 = null;
        int n4 = Integer.MAX_VALUE;
        for (class_1529 class_15293 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            int n5 = class_15293.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
            n5 = n5 > 256 ? (n5 *= 1000) : class_15293.lIllllIIlIIIlIllllllIIIll();
            if (n5 >= n4) continue;
            class_15292 = class_15293;
            n4 = n5;
        }
        return class_15292;
    }

    public class_1529 lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        class_1529 class_15292;
        if (this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3) > (float)(this.IlIIIIIllllllIIlllIllllll * this.IlIIIIIllllllIIlllIllllll)) {
            return null;
        }
        Iterator iterator = this.lllIlIIlIIIlIlIIIllIlllIl.iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            class_15292 = (class_1529)iterator.next();
        } while (class_15292.lllIIIllIIIIlllIlIIllIIll != n || class_15292.IlIllllllIIlIIllllIIlIIIl != n3 || Math.abs(class_15292.lllIlIIlIIIlIlIIIllIlllIl - n2) > 1);
        return class_15292;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1529 class_15292) {
        this.lllIlIIlIIIlIlIIIllIlllIl.add(class_15292);
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll += class_15292.lllIIIllIIIIlllIlIIllIIll;
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl += class_15292.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl += class_15292.IlIllllllIIlIIllllIIlIIIl;
        this.lllIIlIIIllllllIIIIlIlIlI();
        this.lIllllIIlIIIlIllllllIIIll = class_15292.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.isEmpty();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        class_2155 class_21552;
        Iterator iterator = this.lIIIIlIlIIlllllIIllIIlIII.iterator();
        do {
            if (!iterator.hasNext()) {
                this.lIIIIlIlIIlllllIIllIIlIII.add(new class_2155(this, class_19652, this.IIIllIIlIIIIIIlIlIIllIIlI));
                return;
            }
            class_21552 = (class_2155)iterator.next();
        } while (class_21552.lllIIIllIIIIlllIlIIllIIll != class_19652);
        class_21552.lllIlIIlIIIlIlIIIllIlllIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public class_1965 lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        double d = Double.MAX_VALUE;
        class_2155 class_21552 = null;
        for (int i = 0; i < this.lIIIIlIlIIlllllIIllIIlIII.size(); ++i) {
            class_2155 class_21553 = (class_2155)this.lIIIIlIlIIlllllIIllIIlIII.get(i);
            double d2 = class_21553.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll(class_19652);
            if (!(d2 <= d)) continue;
            class_21552 = class_21553;
            d = d2;
        }
        return class_21552 != null ? class_21552.lllIIIllIIIIlllIlIIllIIll : null;
    }

    public class_0814 IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652) {
        double d = Double.MAX_VALUE;
        class_0814 class_08142 = null;
        for (String string : this.IllIIIllIIIIlIlIlIllIIlll.keySet()) {
            double d2;
            class_0814 class_08143;
            if (!this.lllIlIIlIIIlIlIIIllIlllIl(string) || (class_08143 = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(string)) == null || !((d2 = class_08143.IlIIIIIllllllIIlllIllllll(class_19652)) <= d)) continue;
            class_08142 = class_08143;
            d = d2;
        }
        return class_08142;
    }

    private void llIIlllIllIllllIIIlIIIIII() {
        Iterator iterator = this.lIIIIlIlIIlllllIIllIIlIII.iterator();
        while (iterator.hasNext()) {
            class_2155 class_21552 = (class_2155)iterator.next();
            if (class_21552.lllIIIllIIIIlllIlIIllIIll.IlllIIlllllllIIllIlIllllI() && Math.abs(this.IIIllIIlIIIIIIlIlIIllIIlI - class_21552.lllIlIIlIIIlIlIIIllIlllIl) <= 300) continue;
            iterator.remove();
        }
    }

    private void llIIllIllIlIIlIIllIllllll() {
        boolean bl = false;
        boolean bl2 = this.lllIIIllIIIIlllIlIIllIIll.lllllIlllIIllIlIIlIIIllII.nextInt(50) == 0;
        Iterator iterator = this.lllIlIIlIIIlIlIIIllIlllIl.iterator();
        while (iterator.hasNext()) {
            class_1529 class_15292 = (class_1529)iterator.next();
            if (bl2) {
                class_15292.lIlllIlllIIIIlIIlllIllIII();
            }
            if (this.IlIIIIIllllllIIlllIllllll(class_15292.lllIIIllIIIIlllIlIIllIIll, class_15292.lllIlIIlIIIlIlIIIllIlllIl, class_15292.IlIllllllIIlIIllllIIlIIIl) && Math.abs(this.IIIllIIlIIIIIIlIlIIllIIlI - class_15292.lIllllIIlIIIlIllllllIIIll) <= 1200) continue;
            this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll -= class_15292.lllIIIllIIIIlllIlIIllIIll;
            this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl -= class_15292.lllIlIIlIIIlIlIIIllIlllIl;
            this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl -= class_15292.IlIllllllIIlIIllllIIlIIIl;
            bl = true;
            class_15292.IIIllIIlIIIIIIlIlIIllIIlI = true;
            iterator.remove();
        }
        if (bl) {
            this.lllIIlIIIllllllIIIIlIlIlI();
        }
    }

    private boolean IlIIIIIllllllIIlllIllllll(int n, int n2, int n3) {
        return this.lllIIIllIIIIlllIlIIllIIll.a_(n, n2, n3) == Blocks.IlIIllIlIlIllIIIlIIlIlIIl;
    }

    private void lllIIlIIIllllllIIIIlIlIlI() {
        int n = this.lllIlIIlIIIlIlIIIllIlllIl.size();
        if (n == 0) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(0, 0, 0);
            this.IlIIIIIllllllIIlllIllllll = 0;
        } else {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll / n, this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl / n, this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl / n);
            int n2 = 0;
            for (class_1529 class_15292 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                n2 = Math.max(class_15292.lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll, this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl, this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl), n2);
            }
            this.IlIIIIIllllllIIlllIllllll = Math.max(32, (int)Math.sqrt(n2) + 1);
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string) {
        Integer n = (Integer)this.IllIIIllIIIIlIlIlIllIIlll.get(string);
        return n != null ? n : 0;
    }

    public int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        int n2 = this.lllIIIllIIIIlllIlIIllIIll(string);
        int n3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(n2 + n, -30, 10);
        this.IllIIIllIIIIlIlIlIllIIlll.put(string, n3);
        return n3;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return this.lllIIIllIIIIlllIlIIllIIll(string) <= -15;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        Object object;
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lIllllIIlIIIlIllllllIIIll("PopSize");
        this.IlIIIIIllllllIIlllIllllll = class_07752.lIllllIIlIIIlIllllllIIIll("Radius");
        this.llIIlllIllIllllIIIlIIIIII = class_07752.lIllllIIlIIIlIllllllIIIll("Golems");
        this.lIllllIIlIIIlIllllllIIIll = class_07752.lIllllIIlIIIlIllllllIIIll("Stable");
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.lIllllIIlIIIlIllllllIIIll("Tick");
        this.IIIllIllIIlIlIlIlIllllIIl = class_07752.lIllllIIlIIIlIllllllIIIll("MTick");
        this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("CX");
        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("CY");
        this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("CZ");
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("ACX");
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("ACY");
        this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("ACZ");
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Doors", 10);
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            object = new class_1529(class_07753.lIllllIIlIIIlIllllllIIIll("X"), class_07753.lIllllIIlIIIlIllllllIIIll("Y"), class_07753.lIllllIIlIIIlIllllllIIIll("Z"), class_07753.lIllllIIlIIIlIllllllIIIll("IDX"), class_07753.lIllllIIlIIIlIllllllIIIll("IDZ"), class_07753.lIllllIIlIIIlIllllllIIIll("TS"));
            this.lllIlIIlIIIlIlIIIllIlllIl.add(object);
        }
        class_2145 class_21453 = class_07752.IlIllllllIIlIIllllIIlIIIl("Players", 10);
        for (int i = 0; i < class_21453.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            object = class_21453.lllIlIIlIIIlIlIIIllIlllIl(i);
            this.IllIIIllIIIIlIlIlIllIIlll.put(((class_0775)object).IllIIIllIIIIlIlIlIllIIlll("Name"), ((class_0775)object).lIllllIIlIIIlIllllllIIIll("S"));
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        Object object2;
        class_07752.lllIIIllIIIIlllIlIIllIIll("PopSize", this.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Radius", this.IlIIIIIllllllIIlllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Golems", this.llIIlllIllIllllIIIlIIIIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Stable", this.lIllllIIlIIIlIllllllIIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Tick", this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("MTick", this.IIIllIllIIlIlIlIlIllllIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CX", this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CY", this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CZ", this.lIlllIlllIIIIlIIlllIllIII.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ACX", this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ACY", this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("ACZ", this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl);
        class_2145 class_21452 = new class_2145();
        for (Object object2 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("X", ((class_1529)object2).lllIIIllIIIIlllIlIIllIIll);
            class_07753.lllIIIllIIIIlllIlIIllIIll("Y", ((class_1529)object2).lllIlIIlIIIlIlIIIllIlllIl);
            class_07753.lllIIIllIIIIlllIlIIllIIll("Z", ((class_1529)object2).IlIllllllIIlIIllllIIlIIIl);
            class_07753.lllIIIllIIIIlllIlIIllIIll("IDX", ((class_1529)object2).lIlllIlllIIIIlIIlllIllIII);
            class_07753.lllIIIllIIIIlllIlIIllIIll("IDZ", ((class_1529)object2).IlIIIIIllllllIIlllIllllll);
            class_07753.lllIIIllIIIIlllIlIIllIIll("TS", ((class_1529)object2).lIllllIIlIIIlIllllllIIIll);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Doors", class_21452);
        object2 = new class_2145();
        for (String string : this.IllIIIllIIIIlIlIlIllIIlll.keySet()) {
            class_0775 class_07754 = new class_0775();
            class_07754.lllIIIllIIIIlllIlIIllIIll("Name", string);
            class_07754.lllIIIllIIIIlllIlIIllIIll("S", (Integer)this.IllIIIllIIIIlIlIlIllIIlll.get(string));
            ((class_2145)object2).lllIIIllIIIIlllIlIIllIIll(class_07754);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Players", (class_2037)object2);
    }

    public void IllIIlllllllIIlIIlIIIIlIl() {
        this.IIIllIllIIlIlIlIlIllllIIl = this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl == 0 || this.IIIllIIlIIIIIIlIlIIllIIlI - this.IIIllIllIIlIlIlIlIllllIIl >= 3600;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        for (String string : this.IllIIIllIIIIlIlIlIllIIlll.keySet()) {
            this.lllIIIllIIIIlllIlIIllIIll(string, n);
        }
    }
}

