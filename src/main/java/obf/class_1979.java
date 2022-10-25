package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class class_1979 {
    public static void lllIIIllIIIIlllIlIIllIIll() {
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_2170.class, "ViBH");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0017.class, "ViDF");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0007.class, "ViF");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1944.class, "ViL");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0731.class, "ViPH");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0620.class, "ViSH");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0293.class, "ViSmH");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1858.class, "ViST");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0258.class, "ViS");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0206.class, "ViStart");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_0276.class, "ViSR");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1898.class, "ViTRH");
        class_1756.lllIIIllIIIIlllIlIIllIIll(class_1235.class, "ViW");
    }

    public static List lllIIIllIIIIlllIlIIllIIll(Random random, int n) {
        ArrayList<class_2135> arrayList = new ArrayList<class_2135>();
        arrayList.add(new class_2135(class_0620.class, 4, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2 + n, 4 + n * 2)));
        arrayList.add(new class_2135(class_1858.class, 20, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 0 + n, 1 + n)));
        arrayList.add(new class_2135(class_2170.class, 20, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 0 + n, 2 + n)));
        arrayList.add(new class_2135(class_0293.class, 3, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2 + n, 5 + n * 3)));
        arrayList.add(new class_2135(class_0731.class, 15, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 0 + n, 2 + n)));
        arrayList.add(new class_2135(class_0017.class, 3, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 1 + n, 4 + n)));
        arrayList.add(new class_2135(class_0007.class, 3, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2 + n, 4 + n * 2)));
        arrayList.add(new class_2135(class_0258.class, 15, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 0, 1 + n)));
        arrayList.add(new class_2135(class_1898.class, 8, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 0 + n, 3 + n * 2)));
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            if (((class_2135)iterator.next()).lIlllIlllIIIIlIIlllIllIII != 0) continue;
            iterator.remove();
        }
        return arrayList;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(List list) {
        boolean bl = false;
        int n = 0;
        for (class_2135 class_21352 : list) {
            if (class_21352.lIlllIlllIIIIlIIlllIllIII > 0 && class_21352.IlIllllllIIlIIllllIIlIIIl < class_21352.lIlllIlllIIIIlIIlllIllIII) {
                bl = true;
            }
            n += class_21352.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return bl ? n : -1;
    }

    private static class_1437 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, class_2135 class_21352, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        Class class_ = class_21352.lllIIIllIIIIlllIlIIllIIll;
        class_1437 class_14372 = null;
        if (class_ == class_0620.class) {
            class_14372 = class_0620.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_1858.class) {
            class_14372 = class_1858.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_2170.class) {
            class_14372 = class_2170.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0293.class) {
            class_14372 = class_0293.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0731.class) {
            class_14372 = class_0731.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0017.class) {
            class_14372 = class_0017.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0007.class) {
            class_14372 = class_0007.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_0258.class) {
            class_14372 = class_0258.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        } else if (class_ == class_1898.class) {
            class_14372 = class_1898.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4, n5);
        }
        return class_14372;
    }

    private static class_1437 IlIllllllIIlIIllllIIlIIIl(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        int n6 = class_1979.lllIIIllIIIIlllIlIIllIIll(class_02062.IllIIlllllllIIlIIlIIIIlIl);
        if (n6 <= 0) {
            return null;
        }
        int n7 = 0;
        block0: while (n7 < 5) {
            ++n7;
            int n8 = random.nextInt(n6);
            for (class_2135 class_21352 : class_02062.IllIIlllllllIIlIIlIIIIlIl) {
                if ((n8 -= class_21352.lllIlIIlIIIlIlIIIllIlllIl) >= 0) continue;
                if (!class_21352.lllIIIllIIIIlllIlIIllIIll(n5) || class_21352 == class_02062.lIlllIlllIIIIlIIlllIllIII && class_02062.IllIIlllllllIIlIIlIIIIlIl.size() > 1) continue block0;
                class_1437 class_14372 = class_1979.lllIIIllIIIIlllIlIIllIIll(class_02062, class_21352, list, random, n, n2, n3, n4, n5);
                if (class_14372 == null) continue;
                ++class_21352.IlIllllllIIlIIllllIIlIIIl;
                class_02062.lIlllIlllIIIIlIIlllIllIII = class_21352;
                if (!class_21352.lllIIIllIIIIlllIlIIllIIll()) {
                    class_02062.IllIIlllllllIIlIIlIIIIlIl.remove(class_21352);
                }
                return class_14372;
            }
        }
        class_2046 class_20462 = class_1944.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4);
        if (class_20462 != null) {
            return new class_1944(class_02062, n5, random, class_20462, n4);
        }
        return null;
    }

    private static class_1036 lIlllIlllIIIIlIIlllIllIII(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 50) {
            return null;
        }
        if (Math.abs(n - class_02062.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll) <= 112 && Math.abs(n3 - class_02062.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl) <= 112) {
            class_1437 class_14372 = class_1979.IlIllllllIIlIIllllIIlIIIl(class_02062, list, random, n, n2, n3, n4, n5 + 1);
            if (class_14372 != null) {
                int n6;
                int n7 = (class_14372.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + class_14372.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII) / 2;
                int n8 = (class_14372.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + class_14372.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll) / 2;
                int n9 = class_14372.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - class_14372.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll;
                int n10 = class_14372.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - class_14372.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl;
                int n11 = n6 = n9 > n10 ? n9 : n10;
                if (class_02062.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(n7, n8, n6 / 2 + 4, class_1430.IlIIIIIllllllIIlllIllllll)) {
                    list.add(class_14372);
                    class_02062.IIIllIllIIlIlIlIlIllllIIl.add(class_14372);
                    return class_14372;
                }
            }
            return null;
        }
        return null;
    }

    private static class_1036 IlIIIIIllllllIIlllIllllll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        if (n5 > 3 + class_02062.IlIllllllIIlIIllllIIlIIIl) {
            return null;
        }
        if (Math.abs(n - class_02062.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll) <= 112 && Math.abs(n3 - class_02062.lllIlIIlIIIlIlIIIllIlllIl().IlIllllllIIlIIllllIIlIIIl) <= 112) {
            class_2046 class_20462 = class_0276.lllIIIllIIIIlllIlIIllIIll(class_02062, list, random, n, n2, n3, n4);
            if (class_20462 != null && class_20462.lllIlIIlIIIlIlIIIllIlllIl > 10) {
                int n6;
                class_0276 class_02762 = new class_0276(class_02062, n5, random, class_20462, n4);
                int n7 = (class_02762.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + class_02762.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII) / 2;
                int n8 = (class_02762.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + class_02762.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll) / 2;
                int n9 = class_02762.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - class_02762.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll;
                int n10 = class_02762.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - class_02762.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl;
                int n11 = n6 = n9 > n10 ? n9 : n10;
                if (class_02062.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(n7, n8, n6 / 2 + 4, class_1430.IlIIIIIllllllIIlllIllllll)) {
                    list.add(class_02762);
                    class_02062.IllIIIllIIIIlIlIlIllIIlll.add(class_02762);
                    return class_02762;
                }
            }
            return null;
        }
        return null;
    }

    static /* synthetic */ class_1036 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return class_1979.IlIIIIIllllllIIlllIllllll(class_02062, list, random, n, n2, n3, n4, n5);
    }

    static /* synthetic */ class_1036 lllIlIIlIIIlIlIIIllIlllIl(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        return class_1979.lIlllIlllIIIIlIIlllIllIII(class_02062, list, random, n, n2, n3, n4, n5);
    }
}

