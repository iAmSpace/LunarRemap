package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_1942 {
    private static final class_0018[] lllIlIIlIIIlIlIIIllIlllIl = new class_0018[]{new class_0018(class_0157.class, 40, 0), new class_0018(class_2206.class, 5, 5), new class_0018(class_0246.class, 20, 0), new class_0018(class_0354.class, 20, 0), new class_0018(class_1455.class, 10, 6), new class_0018(class_2131.class, 5, 5), new class_0018(class_0787.class, 5, 5), new class_0018(class_0838.class, 5, 4), new class_0018(class_1501.class, 5, 4), new class_0592(class_0807.class, 10, 2), new class_1047(class_1090.class, 20, 1)};
    private static List IlIllllllIIlIIllllIIlIIIl;
    private static Class lIlllIlllIIIIlIIlllIllIII;
    static int lllIIIllIIIIlllIlIIllIIll;
    private static final class_1651 IlIIIIIllllllIIlllIllllll;

    public static void lllIIIllIIIIlllIlIIllIIll() {
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1501.class, "SHCC");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1535.class, "SHFC");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0838.class, "SH5C");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0246.class, "SHLT");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0807.class, "SHLi");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1090.class, "SHPR");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_2206.class, "SHPH");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0354.class, "SHRT");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1455.class, "SHRC");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0787.class, "SHSD");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1844.class, "SHStart");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0157.class, "SHS");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_2131.class, "SHSSD");
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl() {
        IlIllllllIIlIIllllIIlIIIl = new ArrayList();
        for (class_0018 class_00182 : lllIlIIlIIIlIlIIIllIlllIl) {
            class_00182.IlIllllllIIlIIllllIIlIIIl = 0;
            IlIllllllIIlIIllllIIlIIIl.add(class_00182);
        }
        lIlllIlllIIIIlIIlllIllIII = null;
    }

    private static boolean lIlllIlllIIIIlIIlllIllIII() {
        boolean bl = false;
        lllIIIllIIIIlllIlIIllIIll = 0;
        for (class_0018 class_00182 : IlIllllllIIlIIllllIIlIIIl) {
            if (class_00182.lIlllIlllIIIIlIIlllIllIII > 0 && class_00182.IlIllllllIIlIIllllIIlIIIl < class_00182.lIlllIlllIIIIlIIlllIllIII) {
                bl = true;
            }
            lllIIIllIIIIlllIlIIllIIll += class_00182.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return bl;
    }

    private static class_0094 lllIIIllIIIIlllIlIIllIIll(Class class_, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_0094 class_00942 = null;
        if (class_ == class_0157.class) {
            class_00942 = class_0157.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_2206.class) {
            class_00942 = class_2206.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0246.class) {
            class_00942 = class_0246.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0354.class) {
            class_00942 = class_0354.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_1455.class) {
            class_00942 = class_1455.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_2131.class) {
            class_00942 = class_2131.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0787.class) {
            class_00942 = class_0787.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0838.class) {
            class_00942 = class_0838.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_1501.class) {
            class_00942 = class_1501.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0807.class) {
            class_00942 = class_0807.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_1090.class) {
            class_00942 = class_1090.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4, n5);
        }
        return class_00942;
    }

    private static class_0094 lllIlIIlIIIlIlIIIllIlllIl(class_1844 class_18442, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (!class_1942.lIlllIlllIIIIlIIlllIllIII()) {
            return null;
        }
        if (lIlllIlllIIIIlIIlllIllIII != null) {
            class_0094 class_00942 = class_1942.lllIIIllIIIIlllIlIIllIIll(lIlllIlllIIIIlIIlllIllIII, list, random, n, n2, n3, n4, n5);
            lIlllIlllIIIIlIIlllIllIII = null;
            if (class_00942 != null) {
                return class_00942;
            }
        }
        int n6 = 0;
        block0: while (n6 < 5) {
            ++n6;
            int n7 = random.nextInt(lllIIIllIIIIlllIlIIllIIll);
            for (class_0018 class_00182 : IlIllllllIIlIIllllIIlIIIl) {
                if ((n7 -= class_00182.lllIlIIlIIIlIlIIIllIlllIl) >= 0) continue;
                if (!class_00182.lllIIIllIIIIlllIlIIllIIll(n5) || class_00182 == class_18442.lllIIIllIIIIlllIlIIllIIll) continue block0;
                class_0094 class_00943 = class_1942.lllIIIllIIIIlllIlIIllIIll(class_00182.lllIIIllIIIIlllIlIIllIIll, list, random, n, n2, n3, n4, n5);
                if (class_00943 == null) continue;
                ++class_00182.IlIllllllIIlIIllllIIlIIIl;
                class_18442.lllIIIllIIIIlllIlIIllIIll = class_00182;
                if (!class_00182.lllIIIllIIIIlllIlIIllIIll()) {
                    IlIllllllIIlIIllllIIlIIIl.remove(class_00182);
                }
                return class_00943;
            }
        }
        class_2046 class_20462 = class_1535.lllIIIllIIIIlllIlIIllIIll(list, random, n, n2, n3, n4);
        if (class_20462 != null && class_20462.lllIlIIlIIIlIlIIIllIlllIl > 1) {
            return new class_1535(n5, random, class_20462, n4);
        }
        return null;
    }

    private static class_1036 IlIllllllIIlIIllllIIlIIIl(class_1844 class_18442, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n - class_18442.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll) <= 112 && Math.abs(n3 - class_18442.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl) <= 112) {
            class_0094 class_00942 = class_1942.lllIlIIlIIIlIlIIIllIlllIl(class_18442, list, random, n, n2, n3, n4, n5 + 1);
            if (class_00942 != null) {
                list.add(class_00942);
                class_18442.IlIllllllIIlIIllllIIlIIIl.add(class_00942);
            }
            return class_00942;
        }
        return null;
    }

    static /* synthetic */ class_1651 IlIllllllIIlIIllllIIlIIIl() {
        return IlIIIIIllllllIIlllIllllll;
    }

    static /* synthetic */ Class lllIIIllIIIIlllIlIIllIIll(Class class_) {
        lIlllIlllIIIIlIIlllIllIII = class_;
        return lIlllIlllIIIIlIIlllIllIII;
    }

    static /* synthetic */ class_1036 lllIIIllIIIIlllIlIIllIIll(class_1844 class_18442, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return class_1942.IlIllllllIIlIIllllIIlIIIl(class_18442, list, random, n, n2, n3, n4, n5);
    }

    static {
        IlIIIIIllllllIIlllIllllll = new class_1651(null);
    }
}

