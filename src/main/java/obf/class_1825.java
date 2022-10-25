package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import optifine.Config;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class class_1825 {
    private static Map lllIIIllIIIIlllIlIIllIIll = new HashMap();
    private static long lllIlIIlIIIlIlIIIllIlllIl = 0L;
    private static final double IlIllllllIIlIIllllIIlIIIl = 7.5;
    private static final double lIlllIlllIIIIlIIlllIllIII = 56.25;
    private static final int IlIIIIIllllllIIlllIllllll = 15;
    private static final int lIllllIIlIIIlIllllllIIIll = 15;
    private static final int IIIllIIlIIIIIIlIlIIllIIlI = 10;
    private static final int IllIIlllllllIIlIIlIIIIlIl = 8;
    private static final int IIIllIllIIlIlIlIlIllllIIl = 13;
    private static final int IllIIIllIIIIlIlIlIllIIlll = 8;
    private static final int lIIIIlIlIIlllllIIllIIlIII = 8;

    public static void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_1114 class_11142) {
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, class_1114 class_11142) {
        Map map = lllIIIllIIIIlllIlIIllIIll;
        Map map2 = lllIIIllIIIIlllIlIIllIIll;
        synchronized (map2) {
            class_1717 class_17172 = (class_1717)lllIIIllIIIIlllIlIIllIIll.remove(class_1035.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI()));
            if (class_17172 != null) {
                class_17172.lllIlIIlIIIlIlIIIllIlllIl(class_11142);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void lllIIIllIIIIlllIlIIllIIll(class_1114 class_11142) {
        long l = System.currentTimeMillis();
        if (l >= lllIlIIlIIIlIlIIIllIlllIl + 50L) {
            lllIlIIlIIIlIlIIIllIlllIl = l;
            Map map = lllIIIllIIIIlllIlIIllIIll;
            Map map2 = lllIIIllIIIIlllIlIIllIIll;
            synchronized (map2) {
                class_1825.IlIllllllIIlIIllllIIlIIIl(class_11142);
                if (lllIIIllIIIIlllIlIIllIIll.size() > 0) {
                    Collection collection = lllIIIllIIIIlllIlIIllIIll.values();
                    for (class_1717 class_17172 : collection) {
                        class_17172.lllIIIllIIIIlllIlIIllIIll(class_11142);
                    }
                }
            }
        }
    }

    private static void IlIllllllIIlIIllllIIlIIIl(class_1114 class_11142) {
        class_0564 class_05642 = class_11142.lllIlIIlIIIlIlIIIllIlllIl;
        if (class_05642 != null) {
            List list = class_05642.IlIlIIlllIIlIllIIIlllllIl();
            for (class_1521 class_15212 : list) {
                class_1717 class_17172;
                Integer n;
                int n2 = class_1825.lllIIIllIIIIlllIlIIllIIll(class_15212);
                if (n2 > 0) {
                    n = class_1035.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI());
                    class_17172 = (class_1717)lllIIIllIIIIlllIlIIllIIll.get(n);
                    if (class_17172 != null) continue;
                    class_17172 = new class_1717(class_15212);
                    lllIIIllIIIIlllIlIIllIIll.put(n, class_17172);
                    continue;
                }
                n = class_1035.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI());
                class_17172 = (class_1717)lllIIIllIIIIlllIlIIllIIll.remove(n);
                if (class_17172 == null) continue;
                class_17172.lllIlIIlIIIlIlIIIllIlllIl(class_11142);
            }
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4) {
        double d = class_1825.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        n4 = class_1825.lllIIIllIIIIlllIlIIllIIll(d, n4);
        return n4;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n) {
        double d = class_1825.lllIIIllIIIIlllIlIIllIIll(class_15212);
        n = class_1825.lllIIIllIIIIlllIlIIllIIll(d, n);
        return n;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(double d, int n) {
        int n2;
        int n3;
        if (d > 0.0 && (n3 = (int)(d * 16.0)) > (n2 = n & 0xFF)) {
            n &= 0xFFFFFF00;
            n |= n3;
        }
        return n;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static double lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        double d = 0.0;
        Map map = lllIIIllIIIIlllIlIIllIIll;
        Map map2 = lllIIIllIIIIlllIlIIllIIll;
        synchronized (map2) {
            Collection collection = lllIIIllIIIIlllIlIIllIIll.values();
            for (class_1717 class_17172 : collection) {
                double d2;
                double d3;
                double d4;
                int n4 = class_17172.IlIIIIIllllllIIlllIllllll();
                if (n4 <= 0) continue;
                double d5 = class_17172.lllIlIIlIIIlIlIIIllIlllIl();
                double d6 = class_17172.IlIllllllIIlIIllllIIlIIIl();
                double d7 = class_17172.lIlllIlllIIIIlIIlllIllIII();
                double d8 = (double)n - d5;
                double d9 = (double)n2 - d6;
                double d10 = (double)n3 - d7;
                double d11 = d8 * d8 + d9 * d9 + d10 * d10;
                if (class_17172.lIllllIIlIIIlIllllllIIIll() && !Config.lIlllIIllIIIIIIlIlIIlIllI()) {
                    n4 = Config.lllIIIllIIIIlllIlIIllIIll(n4 - 2, 0, 15);
                    d11 *= 2.0;
                }
                if (!(d11 <= 56.25) || !((d4 = (d3 = 1.0 - (d2 = Math.sqrt(d11)) / 7.5) * (double)n4) > d)) continue;
                d = d4;
            }
        }
        double d12 = Config.lllIIIllIIIIlllIlIIllIIll(d, 0.0, 15.0);
        return d12;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        class_1272 class_12722;
        Block class_05492;
        if (class_08972 == null) {
            return 0;
        }
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        if (class_06112 instanceof class_1272 && (class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(class_12722 = (class_1272)class_06112)) != null) {
            return class_05492.lIlllIlllIIIIlIIlllIllIII();
        }
        return class_06112 == Items.lava_bucket ? Blocks.llIIlllIllIllllIIIlIIIIII.lIlllIlllIIIIlIIlllIllIII() : (class_06112 != Items.blaze_rod && class_06112 != Items.IIIlllllIIIIIllIllIIIIllI ? (class_06112 == Items.IIIIIIlIIIIIIIIIIlIlIlIlI ? 8 : (class_06112 == Items.IlIIIIIIllIIlIllIIllIllIl ? 8 : (class_06112 == Items.nether_star ? Blocks.beacon.lIlllIlllIIIIlIIlllIllIII() / 2 : 0))) : 10);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        Object object;
        if (class_15212 == Config.llIlllIlIIllIlIIIIllIIlIl().llIIlllIllIllllIIIlIIIIII && !Config.IlllIIIlIIlIIIIllllIllllI()) {
            return 0;
        }
        if (class_15212.llIIIIIlIIlIIIIllIIIlIIII()) {
            return 15;
        }
        if (class_15212 instanceof class_1937) {
            return 15;
        }
        if (class_15212 instanceof class_0034) {
            return 15;
        }
        if (class_15212 instanceof class_1819) {
            class_1819 class_18192 = (class_1819)class_15212;
            return class_18192.lllIIIlIllIlllIlIIllIllIl() ? 15 : 10;
        }
        if (class_15212 instanceof class_0882) {
            class_0882 class_08822 = (class_0882)class_15212;
            return (double)class_08822.lllIlIIlIIIlIlIIIllIlllIl > 0.6 ? 13 : 8;
        }
        if (class_15212 instanceof class_1234 && ((class_1234)(object = (class_1234)class_15212)).lIllIIlllIIIlIlIIIlllIlIl() > 0) {
            return 15;
        }
        if (class_15212 instanceof class_1965) {
            class_1965 class_19652 = (class_1965)class_15212;
            object = class_19652.lIIIIlIlIlIIIlIIllIIlIlIl();
            int n = class_1825.lllIIIllIIIIlllIlIIllIIll((ItemStack)object);
            ItemStack class_08972 = class_19652.IlIllllllIIlIIllllIIlIIIl(4);
            int n2 = class_1825.lllIIIllIIIIlllIlIIllIIll(class_08972);
            return Math.max(n, n2);
        }
        if (class_15212 instanceof class_1781) {
            class_1781 class_17812 = (class_1781)class_15212;
            object = class_1825.lllIIIllIIIIlllIlIIllIIll(class_17812);
            return class_1825.lllIIIllIIIIlllIlIIllIIll((ItemStack)object);
        }
        return 0;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void lllIlIIlIIIlIlIIIllIlllIl(class_1114 class_11142) {
        Map map = lllIIIllIIIIlllIlIIllIIll;
        Map map2 = lllIIIllIIIIlllIlIIllIIll;
        synchronized (map2) {
            Collection collection = lllIIIllIIIIlllIlIIllIIll.values();
            Iterator iterator = collection.iterator();
            while (iterator.hasNext()) {
                class_1717 class_17172 = (class_1717)iterator.next();
                iterator.remove();
                class_17172.lllIlIIlIIIlIlIIIllIlllIl(class_11142);
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static void lllIIIllIIIIlllIlIIllIIll() {
        Map map = lllIIIllIIIIlllIlIIllIIll;
        Map map2 = lllIIIllIIIIlllIlIIllIIll;
        synchronized (map2) {
            lllIIIllIIIIlllIlIIllIIll.clear();
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public static int lllIlIIlIIIlIlIIIllIlllIl() {
        Map map = lllIIIllIIIIlllIlIIllIIll;
        Map map2 = lllIIIllIIIIlllIlIIllIIll;
        synchronized (map2) {
            return lllIIIllIIIIlllIlIIllIIll.size();
        }
    }

    public static ItemStack lllIIIllIIIIlllIlIIllIIll(class_1781 class_17812) {
        ItemStack class_08972 = class_17812.lIlIIllllIlIIIIllIIIIlIIl().lIllllIIlIIIlIllllllIIIll(10);
        return class_08972;
    }
}

