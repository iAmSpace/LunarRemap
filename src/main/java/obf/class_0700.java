package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;
import java.util.UUID;

public class class_0700 {
    public static final class_0700[] lllIIIllIIIIlllIlIIllIIll = new class_0700[32];
    public static final class_0700 lllIlIIlIIIlIlIIIllIlllIl = null;
    public static final class_0700 IlIllllllIIlIIllllIIlIIIl = new class_0700(1, false, 8171462).lllIIIllIIIIlllIlIIllIIll("potion.moveSpeed").lllIIIllIIIIlllIlIIllIIll(0, 0).lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII, "91AEAA56-376B-4498-935B-2F7F68070635", 0.2f, 2);
    public static final class_0700 lIlllIlllIIIIlIIlllIllIII = new class_0700(2, true, 5926017).lllIIIllIIIIlllIlIIllIIll("potion.moveSlowdown").lllIIIllIIIIlllIlIIllIIll(1, 0).lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII, "7107DE5E-7CE8-4030-940E-514C1F160890", -0.15f, 2);
    public static final class_0700 IlIIIIIllllllIIlllIllllll = new class_0700(3, false, 14270531).lllIIIllIIIIlllIlIIllIIll("potion.digSpeed").lllIIIllIIIIlllIlIIllIIll(2, 0).lllIIIllIIIIlllIlIIllIIll(1.5);
    public static final class_0700 lIllllIIlIIIlIllllllIIIll = new class_0700(4, true, 4866583).lllIIIllIIIIlllIlIIllIIll("potion.digSlowDown").lllIIIllIIIIlllIlIIllIIll(3, 0);
    public static final class_0700 IIIllIIlIIIIIIlIlIIllIIlI = new class_0424(5, false, 9643043).lllIIIllIIIIlllIlIIllIIll("potion.damageBoost").lllIIIllIIIIlllIlIIllIIll(4, 0).lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll, "648D7064-6A60-4F59-8ABE-C2C23A6DD7A9", 3.0, 2);
    public static final class_0700 IllIIlllllllIIlIIlIIIIlIl = new class_1570(6, false, 16262179).lllIIIllIIIIlllIlIIllIIll("potion.heal");
    public static final class_0700 IIIllIllIIlIlIlIlIllllIIl = new class_1570(7, true, 4393481).lllIIIllIIIIlllIlIIllIIll("potion.harm");
    public static final class_0700 IllIIIllIIIIlIlIlIllIIlll = new class_0700(8, false, 7889559).lllIIIllIIIIlllIlIIllIIll("potion.jump").lllIIIllIIIIlllIlIIllIIll(2, 1);
    public static final class_0700 lIIIIlIlIIlllllIIllIIlIII = new class_0700(9, true, 5578058).lllIIIllIIIIlllIlIIllIIll("potion.confusion").lllIIIllIIIIlllIlIIllIIll(3, 1).lllIIIllIIIIlllIlIIllIIll(0.25);
    public static final class_0700 llIIlllIllIllllIIIlIIIIII = new class_0700(10, false, 13458603).lllIIIllIIIIlllIlIIllIIll("potion.regeneration").lllIIIllIIIIlllIlIIllIIll(7, 0).lllIIIllIIIIlllIlIIllIIll(0.25);
    public static final class_0700 llIIllIllIlIIlIIllIllllll = new class_0700(11, false, 10044730).lllIIIllIIIIlllIlIIllIIll("potion.resistance").lllIIIllIIIIlllIlIIllIIll(6, 1);
    public static final class_0700 lllIIlIIIllllllIIIIlIlIlI = new class_0700(12, false, 14981690).lllIIIllIIIIlllIlIIllIIll("potion.fireResistance").lllIIIllIIIIlllIlIIllIIll(7, 1);
    public static final class_0700 IlIlllIIIIIIlIIllIIllIlll = new class_0700(13, false, 3035801).lllIIIllIIIIlllIlIIllIIll("potion.waterBreathing").lllIIIllIIIIlllIlIIllIIll(0, 2);
    public static final class_0700 IlIlIIlIlIllIIlIlIIllIIIl = new class_0700(14, false, 8356754).lllIIIllIIIIlllIlIIllIIll("potion.invisibility").lllIIIllIIIIlllIlIIllIIll(0, 1);
    public static final class_0700 lllllIlllIIllIlIIlIIIllII = new class_0700(15, true, 2039587).lllIIIllIIIIlllIlIIllIIll("potion.blindness").lllIIIllIIIIlllIlIIllIIll(5, 1).lllIIIllIIIIlllIlIIllIIll(0.25);
    public static final class_0700 IlIlIIlllIIlIllIIIlllllIl = new class_0700(16, false, 0x1F1FA1).lllIIIllIIIIlllIlIIllIIll("potion.nightVision").lllIIIllIIIIlllIlIIllIIll(4, 1);
    public static final class_0700 lIIlIIIIIlIlllIlIIlIlIlll = new class_0700(17, true, 5797459).lllIIIllIIIIlllIlIIllIIll("potion.hunger").lllIIIllIIIIlllIlIIllIIll(1, 1);
    public static final class_0700 lIlIlIIlIIIIlIIIIIlllIIII = new class_0424(18, true, 0x484D48).lllIIIllIIIIlllIlIIllIIll("potion.weakness").lllIIIllIIIIlllIlIIllIIll(5, 0).lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll, "22653B89-116E-49DC-9B6B-9971489B5BE5", 2.0, 0);
    public static final class_0700 IlIIIlIIIIllIIIllIIIIIIll = new class_0700(19, true, 5149489).lllIIIllIIIIlllIlIIllIIll("potion.poison").lllIIIllIIIIlllIlIIllIIll(6, 0).lllIIIllIIIIlllIlIIllIIll(0.25);
    public static final class_0700 IIlllIlIlllIllIIIlllIIlIl = new class_0700(20, true, 3484199).lllIIIllIIIIlllIlIIllIIll("potion.wither").lllIIIllIIIIlllIlIIllIIll(1, 2).lllIIIllIIIIlllIlIIllIIll(0.25);
    public static final class_0700 lIlIllIIlIIlIIlIIlIIlIIll = new class_0544(21, false, 16284963).lllIIIllIIIIlllIlIIllIIll("potion.healthBoost").lllIIIllIIIIlllIlIIllIIll(2, 2).lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll, "5D6F0BA2-1186-46AC-B896-C61C5CEE99CC", 4.0, 0);
    public static final class_0700 llIIlIllIllllIlIIIIlIIlll = new class_0328(22, false, 0x2552A5).lllIIIllIIIIlllIlIIllIIll("potion.absorption").lllIIIllIIIIlllIlIIllIIll(2, 2);
    public static final class_0700 llIllllIlIllIIIlIllIIlIlI = new class_1570(23, false, 16262179).lllIIIllIIIIlllIlIIllIIll("potion.saturation");
    public static final class_0700 lIlllIlllIlIIIIlllIlIlIIl = null;
    public static final class_0700 IlIIlllllIIlIlIlllllIllll = null;
    public static final class_0700 llIIlIlIlllIIllIlIlllIllI = null;
    public static final class_0700 IllIIIIllIIllIllIlllIlIIl = null;
    public static final class_0700 IIIIIIIIlIllIIllIIlllIllI = null;
    public static final class_0700 IIlIIlIlIlIllIIlIlIIIIlll = null;
    public static final class_0700 llIIIlllIlllIlIllIIIIllIl = null;
    public static final class_0700 IIIIlIllIlIIlIIlIllIlIlll = null;
    public final int IlIlIIlllIllllllllIIIlIlI;
    private final Map llllIIIIlIIIlIIIIIIlIllll = Maps.newHashMap();
    private final boolean llIIIIllIIIIIIIlIIIlIIIIl;
    private final int IIllIllIIllIIlllIIIlIlllI;
    private String llllllIlIllllIlIlIlIIIIlI = "";
    private int lIlIIllllIlIIIIllIIIIlIIl = -1;
    private double llIlllIIllIlllIlIlIlIIIll;
    private boolean IIIIlIIlIIIllIIIIllIIIlII;

    protected class_0700(int n, boolean bl, int n2) {
        this.IlIlIIlllIllllllllIIIlIlI = n;
        class_0700.lllIIIllIIIIlllIlIIllIIll[n] = this;
        this.llIIIIllIIIIIIIlIIIlIIIIl = bl;
        this.llIlllIIllIlllIlIlIlIIIll = bl ? 0.5 : 1.0;
        this.IIllIllIIllIIlllIIIlIlllI = n2;
    }

    protected class_0700 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        this.lIlIIllllIlIIIIllIIIIlIIl = n + n2 * 8;
        return this;
    }

    public int lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIlIIlllIllllllllIIIlIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, int n) {
        if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.llIIlllIllIllllIIIlIIIIII.IlIlIIlllIllllllllIIIlIlI) {
            if (class_19652.lllIIIlllIlllIIlIllllIIlI() < class_19652.IIllllIIlIlIlIlllIIIllIIl()) {
                class_19652.IlIllllllIIlIIllllIIlIIIl(1.0f);
            }
        } else if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI) {
            if (class_19652.lllIIIlllIlllIIlIllllIIlI() > 1.0f) {
                class_19652.lllIIIllIIIIlllIlIIllIIll(class_0058.lIIIIlIlIIlllllIIllIIlIII, 1.0f);
            }
        } else if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlllIllllllllIIIlIlI) {
            class_19652.lllIIIllIIIIlllIlIIllIIll(class_0058.llIIlllIllIllllIIIlIIIIII, 1.0f);
        } else if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.lIIlIIIIIlIlllIlIIlIlIlll.IlIlIIlllIllllllllIIIlIlI && class_19652 instanceof class_0814) {
            ((class_0814)class_19652).IlIIIIIllllllIIlllIllllll(0.025f * (float)(n + 1));
        } else if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.llIllllIlIllIIIlIllIIlIlI.IlIlIIlllIllllllllIIIlIlI && class_19652 instanceof class_0814) {
            if (!class_19652.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                ((class_0814)class_19652).lIllIIlllIIIlIlIIIlllIlIl().lllIIIllIIIIlllIlIIllIIll(n + 1, 1.0f);
            }
        } else if (!(this.IlIlIIlllIllllllllIIIlIlI == class_0700.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIllllllllIIIlIlI && !class_19652.lIIIlIllllIlllIIIIIllIIIl() || this.IlIlIIlllIllllllllIIIlIlI == class_0700.IIIllIllIIlIlIlIlIllllIIl.IlIlIIlllIllllllllIIIlIlI && class_19652.lIIIlIllllIlllIIIIIllIIIl())) {
            if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.IIIllIllIIlIlIlIlIllllIIl.IlIlIIlllIllllllllIIIlIlI && !class_19652.lIIIlIllllIlllIIIIIllIIIl() || this.IlIlIIlllIllllllllIIIlIlI == class_0700.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIllllllllIIIlIlI && class_19652.lIIIlIllllIlllIIIIIllIIIl()) {
                class_19652.lllIIIllIIIIlllIlIIllIIll(class_0058.lIIIIlIlIIlllllIIllIIlIII, (float)(6 << n));
            }
        } else {
            class_19652.IlIllllllIIlIIllllIIlIIIl((float)Math.max(4 << n, 0));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1965 class_19653, int n, double d) {
        if (!(this.IlIlIIlllIllllllllIIIlIlI == class_0700.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIllllllllIIIlIlI && !class_19653.lIIIlIllllIlllIIIIIllIIIl() || this.IlIlIIlllIllllllllIIIlIlI == class_0700.IIIllIllIIlIlIlIlIllllIIl.IlIlIIlllIllllllllIIIlIlI && class_19653.lIIIlIllllIlllIIIIIllIIIl())) {
            if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.IIIllIllIIlIlIlIlIllllIIl.IlIlIIlllIllllllllIIIlIlI && !class_19653.lIIIlIllllIlllIIIIIllIIIl() || this.IlIlIIlllIllllllllIIIlIlI == class_0700.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIllllllllIIIlIlI && class_19653.lIIIlIllllIlllIIIIIllIIIl()) {
                int n2 = (int)(d * (double)(6 << n) + 0.5);
                if (class_19652 == null) {
                    class_19653.lllIIIllIIIIlllIlIIllIIll(class_0058.lIIIIlIlIIlllllIIllIIlIII, (float)n2);
                } else {
                    class_19653.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIlIIlIIIlIlIIIllIlllIl(class_19653, class_19652), (float)n2);
                }
            }
        } else {
            int n3 = (int)(d * (double)(4 << n) + 0.5);
            class_19653.IlIllllllIIlIIllllIIlIIIl((float)n3);
        }
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return false;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.llIIlllIllIllllIIIlIIIIII.IlIlIIlllIllllllllIIIlIlI) {
            int n3 = 50 >> n2;
            return n3 > 0 ? n % n3 == 0 : true;
        }
        if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.IlIIIlIIIIllIIIllIIIIIIll.IlIlIIlllIllllllllIIIlIlI) {
            int n4 = 25 >> n2;
            return n4 > 0 ? n % n4 == 0 : true;
        }
        if (this.IlIlIIlllIllllllllIIIlIlI == class_0700.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlllIllllllllIIIlIlI) {
            int n5 = 40 >> n2;
            return n5 > 0 ? n % n5 == 0 : true;
        }
        return this.IlIlIIlllIllllllllIIIlIlI == class_0700.lIIlIIIIIlIlllIlIIlIlIlll.IlIlIIlllIllllllllIIIlIlI;
    }

    public class_0700 lllIIIllIIIIlllIlIIllIIll(String string) {
        this.llllllIlIllllIlIlIlIIIIlI = string;
        return this;
    }

    public String IlIllllllIIlIIllllIIlIIIl() {
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.lIlIIllllIlIIIIllIIIIlIIl >= 0;
    }

    public int IlIIIIIllllllIIlllIllllll() {
        return this.lIlIIllllIlIIIIllIIIIlIIl;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(class_1852 class_18522) {
        if (class_18522.lIllllIIlIIIlIllllllIIIll()) {
            return "**:**";
        }
        int n = class_18522.lllIlIIlIIIlIlIIIllIlllIl();
        return class_1911.lllIIIllIIIIlllIlIIllIIll(n);
    }

    protected class_0700 lllIIIllIIIIlllIlIIllIIll(double d) {
        this.llIlllIIllIlllIlIlIlIIIll = d;
        return this;
    }

    public double IIIllIIlIIIIIIlIlIIllIIlI() {
        return this.llIlllIIllIlllIlIlIlIIIll;
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIIlIIlIIIllIIIIllIIIlII;
    }

    public int IIIllIllIIlIlIlIlIllllIIl() {
        return this.IIllIllIIllIIlllIIIlIlllI;
    }

    public class_0700 lllIIIllIIIIlllIlIIllIIll(class_2191 class_21912, String string, double d, int n) {
        class_1256 class_12562 = new class_1256(UUID.fromString(string), this.IlIllllllIIlIIllllIIlIIIl(), d, n);
        this.llllIIIIlIIIlIIIIIIlIllll.put(class_21912, class_12562);
        return this;
    }

    public Map IllIIIllIIIIlIlIlIllIIlll() {
        return this.llllIIIIlIIIlIIIIIIlIllll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1901 class_19012, int n) {
        for (Map.Entry entry : this.llllIIIIlIIIlIIIIIIlIllll.entrySet()) {
            class_1685 class_16852 = class_19012.lllIIIllIIIIlllIlIIllIIll((class_2191)entry.getKey());
            if (class_16852 == null) continue;
            class_16852.lllIlIIlIIIlIlIIIllIlllIl((class_1256)entry.getValue());
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, class_1901 class_19012, int n) {
        for (Map.Entry entry : this.llllIIIIlIIIlIIIIIIlIllll.entrySet()) {
            class_1685 class_16852 = class_19012.lllIIIllIIIIlllIlIIllIIll((class_2191)entry.getKey());
            if (class_16852 == null) continue;
            class_1256 class_12562 = (class_1256)entry.getValue();
            class_16852.lllIlIIlIIIlIlIIIllIlllIl(class_12562);
            class_16852.lllIIIllIIIIlllIlIIllIIll(new class_1256(class_12562.lllIIIllIIIIlllIlIIllIIll(), this.IlIllllllIIlIIllllIIlIIIl() + " " + n, this.lllIIIllIIIIlllIlIIllIIll(n, class_12562), class_12562.IlIllllllIIlIIllllIIlIIIl()));
        }
    }

    public double lllIIIllIIIIlllIlIIllIIll(int n, class_1256 class_12562) {
        return class_12562.lIlllIlllIIIIlIIlllIllIII() * (double)(n + 1);
    }
}

