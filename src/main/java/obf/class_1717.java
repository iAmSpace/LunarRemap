package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import optifine.Config;
import net.minecraft.util.MathHelper;

import java.util.HashSet;
import java.util.Set;

public class class_1717 {
    private class_1521 lllIIIllIIIIlllIlIIllIIll = null;
    private double lllIlIIlIIIlIlIIIllIlllIl = 0.0;
    private double IlIllllllIIlIIllllIIlIIIl = -2.147483648E9;
    private double lIlllIlllIIIIlIIlllIllIII = -2.147483648E9;
    private double IlIIIIIllllllIIlllIllllll = -2.147483648E9;
    private int lIllllIIlIIIlIllllllIIIll = 0;
    private boolean IIIllIIlIIIIIIlIlIIllIIlI = false;
    private long IllIIlllllllIIlIIlIIIIlIl = 0L;
    private Set IIIllIllIIlIlIlIlIllllIIl = new HashSet();

    public class_1717(class_1521 class_15212) {
        this.lllIIIllIIIIlllIlIIllIIll = class_15212;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_15212.llIIllIllIlIIlIIllIllllll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142) {
        if (Config.llIllIlllIllIlIIIIlIIlIII()) {
            long l = System.currentTimeMillis();
            if (l < this.IllIIlllllllIIlIIlIIIIlIl + 500L) {
                return;
            }
            this.IllIIlllllllIIlIIlIIIIlIl = l;
        }
        double d = this.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll - 0.5;
        double d2 = this.lllIIIllIIIIlllIlIIllIIll.llIIlIlIlllIIllIlIlllIllI - 0.5 + this.lllIlIIlIIIlIlIIIllIlllIl;
        double d3 = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl - 0.5;
        int n = class_1825.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
        double d4 = d - this.IlIllllllIIlIIllllIIlIIIl;
        double d5 = d2 - this.lIlllIlllIIIIlIIlllIllIII;
        double d6 = d3 - this.IlIIIIIllllllIIlllIllllll;
        double d7 = 0.1;
        if (Math.abs(d4) > d7 || Math.abs(d5) > d7 || Math.abs(d6) > d7 || this.lIllllIIlIIIlIllllllIIIll != n) {
            Object object;
            this.IlIllllllIIlIIllllIIlIIIl = d;
            this.lIlllIlllIIIIlIIlllIllIII = d2;
            this.IlIIIIIllllllIIlllIllllll = d3;
            this.lIllllIIlIIIlIllllllIIIll = n;
            this.IIIllIIlIIIIIIlIlIIllIIlI = false;
            class_0564 class_05642 = class_11142.lllIlIIlIIIlIlIIIllIlllIl;
            if (class_05642 != null) {
                object = class_05642.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(d), MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), MathHelper.IlIllllllIIlIIllllIIlIIIl(d3));
                this.IIIllIIlIIIIIIlIlIIllIIlI = object == Blocks.IllIIIllIIIIlIlIlIllIIlll;
            }
            object = new HashSet();
            if (n > 0) {
                class_1188 class_11882 = (MathHelper.IlIllllllIIlIIllllIIlIIIl(d) & 0xF) >= 8 ? class_1188.IlIIIIIllllllIIlllIllllll : class_1188.lIllllIIlIIIlIllllllIIIll;
                class_1188 class_11883 = (MathHelper.IlIllllllIIlIIllllIIlIIIl(d2) & 0xF) >= 8 ? class_1188.lllIlIIlIIIlIlIIIllIlllIl : class_1188.lllIIIllIIIIlllIlIIllIIll;
                class_1188 class_11884 = (MathHelper.IlIllllllIIlIIllllIIlIIIl(d3) & 0xF) >= 8 ? class_1188.lIlllIlllIIIIlIIlllIllIII : class_1188.IlIllllllIIlIIllllIIlIIIl;
                class_11882 = this.lllIIIllIIIIlllIlIIllIIll(class_11882);
                class_2020 class_20202 = new class_2020(MathHelper.IlIllllllIIlIIllllIIlIIIl(d), MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), MathHelper.IlIllllllIIlIIllllIIlIIIl(d3));
                class_2020 class_20203 = new class_2020(MathHelper.lllIIIllIIIIlllIlIIllIIll(class_20202.lllIIIllIIIIlllIlIIllIIll(), 16) * 16, MathHelper.lllIIIllIIIIlllIlIIllIIll(class_20202.lllIlIIlIIIlIlIIIllIlllIl(), 16) * 16, MathHelper.lllIIIllIIIIlllIlIIllIIll(class_20202.IlIllllllIIlIIllllIIlIIIl(), 16) * 16);
                class_2020 class_20204 = class_1717.lllIIIllIIIIlllIlIIllIIll(class_20203, class_11882);
                class_2020 class_20205 = class_1717.lllIIIllIIIIlllIlIIllIIll(class_20203, class_11884);
                class_2020 class_20206 = class_1717.lllIIIllIIIIlllIlIIllIIll(class_20204, class_11884);
                class_2020 class_20207 = class_1717.lllIIIllIIIIlllIlIIllIIll(class_20203, class_11883);
                class_2020 class_20208 = class_1717.lllIIIllIIIIlllIlIIllIIll(class_20207, class_11882);
                class_2020 class_20209 = class_1717.lllIIIllIIIIlllIlIIllIIll(class_20207, class_11884);
                class_2020 class_202010 = class_1717.lllIIIllIIIIlllIlIIllIIll(class_20208, class_11884);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20203, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20204, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20205, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20206, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20207, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20208, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20209, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
                this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_202010, this.IIIllIllIIlIlIlIlIllllIIl, (Set)object);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(class_11142);
            this.IIIllIllIIlIlIlIlIllllIIl = object;
        }
    }

    private class_1188 lllIIIllIIIIlllIlIIllIIll(class_1188 class_11882) {
        switch (class_11882) {
            case lllIIIllIIIIlllIlIIllIIll: {
                return class_1188.lllIlIIlIIIlIlIIIllIlllIl;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                return class_1188.lllIIIllIIIIlllIlIIllIIll;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                return class_1188.lIlllIlllIIIIlIIlllIllIII;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                return class_1188.IlIllllllIIlIIllllIIlIIIl;
            }
            case IlIIIIIllllllIIlllIllllll: {
                return class_1188.lIllllIIlIIIlIllllllIIIll;
            }
            case lIllllIIlIIIlIllllllIIIll: {
                return class_1188.IlIIIIIllllllIIlllIllllll;
            }
        }
        return class_1188.lllIIIllIIIIlllIlIIllIIll;
    }

    private static class_2020 lllIIIllIIIIlllIlIIllIIll(class_2020 class_20202, class_1188 class_11882) {
        return new class_2020(class_20202.lllIIIllIIIIlllIlIIllIIll() + class_11882.lllIIIllIIIIlllIlIIllIIll() * 16, class_20202.lllIlIIlIIIlIlIIIllIlllIl() + class_11882.lllIlIIlIIIlIlIIIllIlllIl() * 16, class_20202.IlIllllllIIlIIllllIIlIIIl() + class_11882.IlIllllllIIlIIllllIIlIIIl() * 16);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142, class_2020 class_20202, Set set, Set set2) {
        if (class_20202 != null) {
            class_11142.lllIIIllIIIIlllIlIIllIIll(class_20202.lllIIIllIIIIlllIlIIllIIll() + 8, class_20202.lllIlIIlIIIlIlIIIllIlllIl() + 8, class_20202.IlIllllllIIlIIllllIIlIIIl() + 8);
            if (set != null) {
                set.remove(class_20202);
            }
            if (set2 != null) {
                set2.add(class_20202);
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1114 class_11142) {
        for (class_2020 class_20202 : this.IIIllIllIIlIlIlIlIllllIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_11142, class_20202, null, null);
        }
    }

    public class_1521 lllIIIllIIIIlllIlIIllIIll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public double lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public double IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public double lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public double IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public String toString() {
        return "Entity: " + this.lllIIIllIIIIlllIlIIllIIll + ", offsetY: " + this.lllIlIIlIIIlIlIIIllIlllIl;
    }
}

