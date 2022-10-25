package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class class_1250 {
    private static final Random lllIIIllIIIIlllIlIIllIIll = new Random();
    private static final class_0961 lllIlIIlIIIlIlIIIllIlllIl = new class_0961(null);
    private static final class_0979 IlIllllllIIlIIllllIIlIIIl = new class_0979(null);
    private static final class_2023 lIlllIlllIIIIlIIlllIllIII = new class_2023(null);
    private static final class_2213 IlIIIIIllllllIIlllIllllll = new class_2213(null);

    public static int lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
        if (class_08972 == null) {
            return 0;
        }
        class_2145 class_21452 = class_08972.IlIlIIlllIIlIllIIIlllllIl();
        if (class_21452 == null) {
            return 0;
        }
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            short s = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("id");
            short s2 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("lvl");
            if (s != n) continue;
            return s2;
        }
        return 0;
    }

    public static Map lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        class_2145 class_21452;
        LinkedHashMap<Integer, Integer> linkedHashMap = new LinkedHashMap<Integer, Integer>();
        class_2145 class_21453 = class_21452 = class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIllIlIlIIIIlIlIIlIlIlllI ? Items.lIllIlIlIIIIlIlIIlIlIlllI.llIIllIllIlIIlIIllIllllll(class_08972) : class_08972.IlIlIIlllIIlIllIIIlllllIl();
        if (class_21452 != null) {
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                short s = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("id");
                short s2 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("lvl");
                linkedHashMap.put(Integer.valueOf(s), Integer.valueOf(s2));
            }
        }
        return linkedHashMap;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Map map, ItemStack class_08972) {
        class_2145 class_21452 = new class_2145();
        Iterator iterator = map.keySet().iterator();
        while (iterator.hasNext()) {
            int n = (Integer)iterator.next();
            class_0775 class_07752 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("id", (short)n);
            class_07752.lllIIIllIIIIlllIlIIllIIll("lvl", (short)((Integer)map.get(n)).intValue());
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
            if (class_08972.lllIIIllIIIIlllIlIIllIIll() != Items.lIllIlIlIIIIlIlIIlIlIlllI) continue;
            Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(class_08972, new class_1129(n, (int)((Integer)map.get(n))));
        }
        if (class_21452.lIlllIlllIIIIlIIlllIllIII() > 0) {
            if (class_08972.lllIIIllIIIIlllIlIIllIIll() != Items.lIllIlIlIIIIlIlIIlIlIlllI) {
                class_08972.lllIIIllIIIIlllIlIIllIIll("ench", class_21452);
            }
        } else if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
            class_08972.lllllIlllIIllIlIIlIIIllII().IlIlllIIIIIIlIIllIIllIlll("ench");
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, ItemStack[] arrclass_0897) {
        if (arrclass_0897 == null) {
            return 0;
        }
        int n2 = 0;
        ItemStack[] arrclass_08972 = arrclass_0897;
        int n3 = arrclass_0897.length;
        for (int i = 0; i < n3; ++i) {
            ItemStack class_08972 = arrclass_08972[i];
            int n4 = class_1250.lllIIIllIIIIlllIlIIllIIll(n, class_08972);
            if (n4 <= n2) continue;
            n2 = n4;
        }
        return n2;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_0167 class_01672, ItemStack class_08972) {
        class_2145 class_21452;
        if (class_08972 != null && (class_21452 = class_08972.IlIlIIlllIIlIllIIIlllllIl()) != null) {
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                short s = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("id");
                short s2 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("lvl");
                if (class_1469.lllIIIllIIIIlllIlIIllIIll[s] == null) continue;
                class_01672.lllIIIllIIIIlllIlIIllIIll(class_1469.lllIIIllIIIIlllIlIIllIIll[s], s2);
            }
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_0167 class_01672, ItemStack[] arrclass_0897) {
        ItemStack[] arrclass_08972 = arrclass_0897;
        int n = arrclass_0897.length;
        for (int i = 0; i < n; ++i) {
            ItemStack class_08972 = arrclass_08972[i];
            class_1250.lllIIIllIIIIlllIlIIllIIll(class_01672, class_08972);
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(ItemStack[] arrclass_0897, class_0058 class_00582) {
        class_1250.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll = 0;
        class_1250.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl = class_00582;
        class_1250.lllIIIllIIIIlllIlIIllIIll((class_0167)lllIlIIlIIIlIlIIIllIlllIl, arrclass_0897);
        if (class_1250.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll > 25) {
            class_1250.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll = 25;
        }
        return (class_1250.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll + 1 >> 1) + lllIIIllIIIIlllIlIIllIIll.nextInt((class_1250.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll >> 1) + 1);
    }

    public static float lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1965 class_19653) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_19652.lIIIIlIlIlIIIlIIllIIlIlIl(), class_19653.IIlllllIIlIIlIlIIlIIlIlII());
    }

    public static float lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0529 class_05292) {
        class_1250.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll = 0.0f;
        class_1250.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl = class_05292;
        class_1250.lllIIIllIIIIlllIlIIllIIll((class_0167)IlIllllllIIlIIllllIIlIIIl, class_08972);
        return class_1250.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652, class_1521 class_15212) {
        class_1250.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl = class_15212;
        class_1250.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll = class_19652;
        class_1250.lllIIIllIIIIlllIlIIllIIll((class_0167)lIlllIlllIIIIlIIlllIllIII, class_19652.lIIlIIlIllIlIIlIlIIlIlIlI());
        if (class_15212 instanceof class_0814) {
            class_1250.lllIIIllIIIIlllIlIIllIIll((class_0167)lIlllIlllIIIIlIIlllIllIII, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, class_1521 class_15212) {
        class_1250.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll = class_19652;
        class_1250.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl = class_15212;
        class_1250.lllIIIllIIIIlllIlIIllIIll((class_0167)IlIIIIIllllllIIlllIllllll, class_19652.lIIlIIlIllIlIIlIlIIlIlIlI());
        if (class_19652 instanceof class_0814) {
            class_1250.lllIIIllIIIIlllIlIIllIIll((class_0167)IlIIIIIllllllIIlllIllllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
        }
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652, class_1965 class_19653) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lllIIlIIIllllllIIIIlIlIlI.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IlIlllIIIIIIlIIllIIllIlll.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IllIIlllllllIIlIIlIIIIlIl.IlIIlllllIIlIlIlllllIllll, class_19652.lIIlIIlIllIlIIlIlIIlIlIlI());
    }

    public static int IlIllllllIIlIIllllIIlIIIl(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lllllIlllIIllIlIIlIIIllII.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
    }

    public static boolean lIlllIlllIIIIlIIlllIllIII(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IlIlIIlllIIlIllIIIlllllIl.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl()) > 0;
    }

    public static int IlIIIIIllllllIIlllIllllll(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lIlIlIIlIIIIlIIIIIlllIIII.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
    }

    public static int lIllllIIlIIIlIllllllIIIll(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.llIllllIlIllIIIlIllIIlIlI.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
    }

    public static int IIIllIIlIIIIIIlIlIIllIIlI(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lIlllIlllIlIIIIlllIlIlIIl.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IlIlIIlIlIllIIlIlIIllIIIl.IlIIlllllIIlIlIlllllIllll, class_19652.lIIIIlIlIlIIIlIIllIIlIlIl());
    }

    public static boolean IIIllIllIIlIlIlIlIllllIIl(class_1965 class_19652) {
        return class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IIIllIllIIlIlIlIlIllllIIl.IlIIlllllIIlIlIlllllIllll, class_19652.lIIlIIlIllIlIIlIlIIlIlIlI()) > 0;
    }

    public static ItemStack lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692, class_1965 class_19652) {
        for (ItemStack class_08972 : class_19652.lIIlIIlIllIlIIlIlIIlIlIlI()) {
            if (class_08972 == null || class_1250.lllIIIllIIIIlllIlIIllIIll(class_14692.IlIIlllllIIlIlIlllllIllll, class_08972) <= 0) continue;
            return class_08972;
        }
        return null;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2, ItemStack class_08972) {
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        int n3 = class_06112.IlIlllIIIIIIlIIllIIllIlll();
        if (n3 <= 0) {
            return 0;
        }
        if (n2 > 15) {
            n2 = 15;
        }
        int n4 = random.nextInt(8) + 1 + (n2 >> 1) + random.nextInt(n2 + 1);
        return n == 0 ? Math.max(n4 / 3, 1) : (n == 1 ? n4 * 2 / 3 + 1 : Math.max(n4, n2 * 2));
    }

    public static ItemStack lllIIIllIIIIlllIlIIllIIll(Random random, ItemStack class_08972, int n) {
        boolean bl;
        List list = class_1250.lllIlIIlIIIlIlIIIllIlllIl(random, class_08972, n);
        boolean bl2 = bl = class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.book;
        if (bl) {
            class_08972.lllIIIllIIIIlllIlIIllIIll(Items.lIllIlIlIIIIlIlIIlIlIlllI);
        }
        if (list != null) {
            for (class_1129 class_11292 : list) {
                if (bl) {
                    Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(class_08972, class_11292);
                    continue;
                }
                class_08972.lllIIIllIIIIlllIlIIllIIll(class_11292.lllIIIllIIIIlllIlIIllIIll, class_11292.lllIlIIlIIIlIlIIIllIlllIl);
            }
        }
        return class_08972;
    }

    public static List lllIlIIlIIIlIlIIIllIlllIl(Random random, ItemStack class_08972, int n) {
        class_1129 class_11292;
        float f;
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        int n2 = class_06112.IlIlllIIIIIIlIIllIIllIlll();
        if (n2 <= 0) {
            return null;
        }
        n2 /= 2;
        int n3 = (n2 = 1 + random.nextInt((n2 >> 1) + 1) + random.nextInt((n2 >> 1) + 1)) + n;
        int n4 = (int)((float)n3 * (1.0f + (f = (random.nextFloat() + random.nextFloat() - 1.0f) * 0.15f)) + 0.5f);
        if (n4 < 1) {
            n4 = 1;
        }
        ArrayList<Object> arrayList = null;
        Map map = class_1250.lllIlIIlIIIlIlIIIllIlllIl(n4, class_08972);
        if (map != null && !map.isEmpty() && (class_11292 = (class_1129)class_0242.lllIIIllIIIIlllIlIIllIIll(random, map.values())) != null) {
            arrayList = new ArrayList<Object>();
            arrayList.add(class_11292);
            for (int i = n4; random.nextInt(50) <= i; i >>= 1) {
                Object object;
                Iterator iterator = map.keySet().iterator();
                while (iterator.hasNext()) {
                    object = (Integer)iterator.next();
                    boolean bl = true;
                    for (class_1129 class_11293 : arrayList) {
                        if (class_11293.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_1469.lllIIIllIIIIlllIlIIllIIll[(Integer)object])) continue;
                        bl = false;
                        break;
                    }
                    if (bl) continue;
                    iterator.remove();
                }
                if (map.isEmpty()) continue;
                object = (class_1129)class_0242.lllIIIllIIIIlllIlIIllIIll(random, map.values());
                arrayList.add(object);
            }
        }
        return arrayList;
    }

    public static Map lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        HashMap<Integer, class_1129> hashMap = null;
        boolean bl = class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.book;
        for (class_1469 class_14692 : class_1469.lllIIIllIIIIlllIlIIllIIll) {
            if (class_14692 == null || !class_14692.llIIlIlIlllIIllIlIlllIllI.lllIIIllIIIIlllIlIIllIIll(class_06112) && !bl) continue;
            for (int i = class_14692.lllIlIIlIIIlIlIIIllIlllIl(); i <= class_14692.IlIllllllIIlIIllllIIlIIIl(); ++i) {
                if (n < class_14692.lllIIIllIIIIlllIlIIllIIll(i) || n > class_14692.lllIlIIlIIIlIlIIIllIlllIl(i)) continue;
                if (hashMap == null) {
                    hashMap = new HashMap<Integer, class_1129>();
                }
                hashMap.put(class_14692.IlIIlllllIIlIlIlllllIllll, new class_1129(class_14692, i));
            }
        }
        return hashMap;
    }
}

