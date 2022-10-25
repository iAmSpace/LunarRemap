package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class class_0668 {
    public static final String lllIIIllIIIIlllIlIIllIIll = null;
    public static final String lllIlIIlIIIlIlIIIllIlllIl;
    public static final String IlIllllllIIlIIllllIIlIIIl = "+0-1-2-3&4-4+13";
    public static final String lIlllIlllIIIIlIIlllIllIII;
    public static final String IlIIIIIllllllIIlllIllllll;
    public static final String lIllllIIlIIIlIllllllIIIll;
    public static final String IIIllIIlIIIIIIlIlIIllIIlI;
    public static final String IllIIlllllllIIlIIlIIIIlIl;
    public static final String IIIllIllIIlIlIlIlIllllIIl;
    public static final String IllIIIllIIIIlIlIlIllIIlll;
    public static final String lIIIIlIlIIlllllIIllIIlIII;
    public static final String llIIlllIllIllllIIIlIIIIII;
    public static final String llIIllIllIlIIlIIllIllllll;
    private static final HashMap lllIIlIIIllllllIIIIlIlIlI;
    private static final HashMap IlIlllIIIIIIlIIllIIllIlll;
    private static final HashMap IlIlIIlIlIllIIlIlIIllIIIl;
    private static final String[] lllllIlllIIllIlIIlIIIllII;

    public static boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return (n & 1 << n2) != 0;
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return class_0668.lllIIIllIIIIlllIlIIllIIll(n, n2) ? 1 : 0;
    }

    private static int IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        return class_0668.lllIIIllIIIIlllIlIIllIIll(n, n2) ? 0 : 1;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        return class_0668.lllIIIllIIIIlllIlIIllIIll(n, 5, 4, 3, 2, 1);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Collection collection) {
        int n = 3694022;
        if (collection != null && !collection.isEmpty()) {
            float f = 0.0f;
            float f2 = 0.0f;
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (class_1852 class_18522 : collection) {
                int n2 = class_0700.lllIIIllIIIIlllIlIIllIIll[class_18522.lllIIIllIIIIlllIlIIllIIll()].IIIllIllIIlIlIlIlIllllIIl();
                for (int i = 0; i <= class_18522.IlIllllllIIlIIllllIIlIIIl(); ++i) {
                    f += (float)(n2 >> 16 & 0xFF) / 255.0f;
                    f2 += (float)(n2 >> 8 & 0xFF) / 255.0f;
                    f3 += (float)(n2 >> 0 & 0xFF) / 255.0f;
                    f4 += 1.0f;
                }
            }
            f = f / f4 * 255.0f;
            f2 = f2 / f4 * 255.0f;
            f3 = f3 / f4 * 255.0f;
            return (int)f << 16 | (int)f2 << 8 | (int)f3;
        }
        return n;
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(Collection collection) {
        class_1852 class_18522;
        Iterator iterator = collection.iterator();
        do {
            if (iterator.hasNext()) continue;
            return true;
        } while ((class_18522 = (class_1852)iterator.next()).lIlllIlllIIIIlIIlllIllIII());
        return false;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, boolean bl) {
        if (!bl) {
            if (IlIlIIlIlIllIIlIlIIllIIIl.containsKey(n)) {
                return (Integer)IlIlIIlIlIllIIlIlIIllIIIl.get(n);
            }
            int n2 = class_0668.lllIIIllIIIIlllIlIIllIIll(class_0668.lllIlIIlIIIlIlIIIllIlllIl(n, false));
            IlIlIIlIlIllIIlIlIIllIIIl.put(n, n2);
            return n2;
        }
        return class_0668.lllIIIllIIIIlllIlIIllIIll(class_0668.lllIlIIlIIIlIlIIIllIlllIl(n, bl));
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = class_0668.lllIIIllIIIIlllIlIIllIIll(n);
        return lllllIlllIIllIlIIlIIIllII[n2];
    }

    private static int lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2, boolean bl3, int n, int n2, int n3, int n4) {
        int n5 = 0;
        if (bl) {
            n5 = class_0668.IlIllllllIIlIIllllIIlIIIl(n4, n2);
        } else if (n != -1) {
            if (n == 0 && class_0668.IlIllllllIIlIIllllIIlIIIl(n4) == n2) {
                n5 = 1;
            } else if (n == 1 && class_0668.IlIllllllIIlIIllllIIlIIIl(n4) > n2) {
                n5 = 1;
            } else if (n == 2 && class_0668.IlIllllllIIlIIllllIIlIIIl(n4) < n2) {
                n5 = 1;
            }
        } else {
            n5 = class_0668.lllIlIIlIIIlIlIIIllIlllIl(n4, n2);
        }
        if (bl2) {
            n5 *= n3;
        }
        if (bl3) {
            n5 *= -1;
        }
        return n5;
    }

    private static int IlIllllllIIlIIllllIIlIIIl(int n) {
        int n2 = 0;
        while (n > 0) {
            n &= n - 1;
            ++n2;
        }
        return n2;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2, int n3) {
        if (n < string.length() && n2 >= 0 && n < n2) {
            int n4 = string.indexOf(124, n);
            if (n4 >= 0 && n4 < n2) {
                int n5 = class_0668.lllIIIllIIIIlllIlIIllIIll(string, n, n4 - 1, n3);
                if (n5 > 0) {
                    return n5;
                }
                int n6 = class_0668.lllIIIllIIIIlllIlIIllIIll(string, n4 + 1, n2, n3);
                return n6 > 0 ? n6 : 0;
            }
            int n7 = string.indexOf(38, n);
            if (n7 >= 0 && n7 < n2) {
                int n8 = class_0668.lllIIIllIIIIlllIlIIllIIll(string, n, n7 - 1, n3);
                if (n8 <= 0) {
                    return 0;
                }
                int n9 = class_0668.lllIIIllIIIIlllIlIIllIIll(string, n7 + 1, n2, n3);
                return n9 <= 0 ? 0 : (n8 > n9 ? n8 : n9);
            }
            boolean bl = false;
            boolean bl2 = false;
            boolean bl3 = false;
            boolean bl4 = false;
            boolean bl5 = false;
            int n10 = -1;
            int n11 = 0;
            int n12 = 0;
            int n13 = 0;
            for (int i = n; i < n2; ++i) {
                char c = string.charAt(i);
                if (c >= '0' && c <= '9') {
                    if (bl) {
                        n12 = c - 48;
                        bl2 = true;
                        continue;
                    }
                    n11 *= 10;
                    n11 += c - 48;
                    bl3 = true;
                    continue;
                }
                if (c == '*') {
                    bl = true;
                    continue;
                }
                if (c == '!') {
                    if (bl3) {
                        n13 += class_0668.lllIIIllIIIIlllIlIIllIIll(bl4, bl2, bl5, n10, n11, n12, n3);
                        bl4 = false;
                        bl5 = false;
                        bl = false;
                        bl2 = false;
                        bl3 = false;
                        n12 = 0;
                        n11 = 0;
                        n10 = -1;
                    }
                    bl4 = true;
                    continue;
                }
                if (c == '-') {
                    if (bl3) {
                        n13 += class_0668.lllIIIllIIIIlllIlIIllIIll(bl4, bl2, bl5, n10, n11, n12, n3);
                        bl4 = false;
                        bl5 = false;
                        bl = false;
                        bl2 = false;
                        bl3 = false;
                        n12 = 0;
                        n11 = 0;
                        n10 = -1;
                    }
                    bl5 = true;
                    continue;
                }
                if (c != '=' && c != '<' && c != '>') {
                    if (c != '+' || !bl3) continue;
                    n13 += class_0668.lllIIIllIIIIlllIlIIllIIll(bl4, bl2, bl5, n10, n11, n12, n3);
                    bl4 = false;
                    bl5 = false;
                    bl = false;
                    bl2 = false;
                    bl3 = false;
                    n12 = 0;
                    n11 = 0;
                    n10 = -1;
                    continue;
                }
                if (bl3) {
                    n13 += class_0668.lllIIIllIIIIlllIlIIllIIll(bl4, bl2, bl5, n10, n11, n12, n3);
                    bl4 = false;
                    bl5 = false;
                    bl = false;
                    bl2 = false;
                    bl3 = false;
                    n12 = 0;
                    n11 = 0;
                    n10 = -1;
                }
                if (c == '=') {
                    n10 = 0;
                    continue;
                }
                if (c == '<') {
                    n10 = 2;
                    continue;
                }
                if (c != '>') continue;
                n10 = 1;
            }
            if (bl3) {
                n13 += class_0668.lllIIIllIIIIlllIlIIllIIll(bl4, bl2, bl5, n10, n11, n12, n3);
            }
            return n13;
        }
        return 0;
    }

    public static List lllIlIIlIIIlIlIIIllIlllIl(int n, boolean bl) {
        ArrayList<class_1852> arrayList = null;
        for (class_0700 class_07002 : class_0700.lllIIIllIIIIlllIlIIllIIll) {
            int n2;
            String string;
            if (class_07002 == null || class_07002.IllIIlllllllIIlIIlIIIIlIl() && !bl || (string = (String)lllIIlIIIllllllIIIIlIlIlI.get(class_07002.lllIIIllIIIIlllIlIIllIIll())) == null || (n2 = class_0668.lllIIIllIIIIlllIlIIllIIll(string, 0, string.length(), n)) <= 0) continue;
            int n3 = 0;
            String string2 = (String)IlIlllIIIIIIlIIllIIllIlll.get(class_07002.lllIIIllIIIIlllIlIIllIIll());
            if (string2 != null && (n3 = class_0668.lllIIIllIIIIlllIlIIllIIll(string2, 0, string2.length(), n)) < 0) {
                n3 = 0;
            }
            if (class_07002.lllIlIIlIIIlIlIIIllIlllIl()) {
                n2 = 1;
            } else {
                n2 = 1200 * (n2 * 3 + (n2 - 1) * 2);
                n2 >>= n3;
                n2 = (int)Math.round((double)n2 * class_07002.IIIllIIlIIIIIIlIlIIllIIlI());
                if ((n & 0x4000) != 0) {
                    n2 = (int)Math.round((double)n2 * 0.75 + 0.5);
                }
            }
            if (arrayList == null) {
                arrayList = new ArrayList<class_1852>();
            }
            class_1852 class_18522 = new class_1852(class_07002.lllIIIllIIIIlllIlIIllIIll(), n2, n3);
            if ((n & 0x4000) != 0) {
                class_18522.lllIIIllIIIIlllIlIIllIIll(true);
            }
            arrayList.add(class_18522);
        }
        return arrayList;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, boolean bl, boolean bl2, boolean bl3) {
        if (bl3) {
            if (!class_0668.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
                return 0;
            }
        } else {
            n = bl ? (n &= ~(1 << n2)) : (bl2 ? ((n & 1 << n2) == 0 ? (n |= 1 << n2) : (n &= ~(1 << n2))) : (n |= 1 << n2));
        }
        return n;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, String string) {
        int n2 = 0;
        int n3 = string.length();
        boolean bl = false;
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n4 = 0;
        for (int i = n2; i < n3; ++i) {
            char c = string.charAt(i);
            if (c >= '0' && c <= '9') {
                n4 *= 10;
                n4 += c - 48;
                bl = true;
                continue;
            }
            if (c == '!') {
                if (bl) {
                    n = class_0668.lllIIIllIIIIlllIlIIllIIll(n, n4, bl3, bl2, bl4);
                    bl4 = false;
                    bl2 = false;
                    bl3 = false;
                    bl = false;
                    n4 = 0;
                }
                bl2 = true;
                continue;
            }
            if (c == '-') {
                if (bl) {
                    n = class_0668.lllIIIllIIIIlllIlIIllIIll(n, n4, bl3, bl2, bl4);
                    bl4 = false;
                    bl2 = false;
                    bl3 = false;
                    bl = false;
                    n4 = 0;
                }
                bl3 = true;
                continue;
            }
            if (c == '+') {
                if (!bl) continue;
                n = class_0668.lllIIIllIIIIlllIlIIllIIll(n, n4, bl3, bl2, bl4);
                bl4 = false;
                bl2 = false;
                bl3 = false;
                bl = false;
                n4 = 0;
                continue;
            }
            if (c != '&') continue;
            if (bl) {
                n = class_0668.lllIIIllIIIIlllIlIIllIIll(n, n4, bl3, bl2, bl4);
                bl4 = false;
                bl2 = false;
                bl3 = false;
                bl = false;
                n4 = 0;
            }
            bl4 = true;
        }
        if (bl) {
            n = class_0668.lllIIIllIIIIlllIlIIllIIll(n, n4, bl3, bl2, bl4);
        }
        return n & 0x7FFF;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, int n4, int n5, int n6) {
        return (class_0668.lllIIIllIIIIlllIlIIllIIll(n, n2) ? 16 : 0) | (class_0668.lllIIIllIIIIlllIlIIllIIll(n, n3) ? 8 : 0) | (class_0668.lllIIIllIIIIlllIlIIllIIll(n, n4) ? 4 : 0) | (class_0668.lllIIIllIIIIlllIlIIllIIll(n, n5) ? 2 : 0) | (class_0668.lllIIIllIIIIlllIlIIllIIll(n, n6) ? 1 : 0);
    }

    static {
        lllIIlIIIllllllIIIIlIlIlI = new HashMap();
        IlIlllIIIIIIlIIllIIllIlll = new HashMap();
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(), "0 & !1 & !2 & !3 & 0+6");
        lllIlIIlIIIlIlIIIllIlllIl = "-0+1-2-3&4-4+13";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(), "!0 & 1 & !2 & !3 & 1+6");
        IllIIlllllllIIlIIlIIIIlIl = "+0+1-2-3&4-4+13";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(), "0 & 1 & !2 & !3 & 0+6");
        lIllllIIlIIIlIllllllIIIll = "+0-1+2-3&4-4+13";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), "0 & !1 & 2 & !3");
        lIlllIlllIIIIlIIlllIllIII = "-0-1+2-3&4-4+13";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(), "!0 & !1 & 2 & !3 & 2+6");
        IlIIIIIllllllIIlllIllllll = "-0+3-4+13";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.lIlIlIIlIIIIlIIIIIlllIIII.lllIIIllIIIIlllIlIIllIIll(), "!0 & !1 & !2 & 3 & 3+6");
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(), "!0 & !1 & 2 & 3");
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(), "!0 & 1 & !2 & 3 & 3+6");
        IIIllIIlIIIIIIlIlIIllIIlI = "+0-1-2+3&4-4+13";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), "0 & !1 & !2 & 3 & 3+6");
        llIIlllIllIllllIIIlIIIIII = "-0+1+2-3+13&4-4";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IlIlIIlllIIlIllIIIlllllIl.lllIIIllIIIIlllIlIIllIIll(), "!0 & 1 & 2 & !3 & 2+6");
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll(), "!0 & 1 & 2 & 3 & 2+6");
        llIIllIllIlIIlIIllIllllll = "+0-1+2+3+13&4-4";
        lllIIlIIIllllllIIIIlIlIlI.put(class_0700.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(), "0 & !1 & 2 & 3 & 2+6");
        IllIIIllIIIIlIlIlIllIIlll = "+5-6-7";
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(), "5");
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(), "5");
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(), "5");
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.llIIlllIllIllllIIIlIIIIII.lllIIIllIIIIlllIlIIllIIll(), "5");
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(), "5");
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(), "5");
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.llIIllIllIlIIlIIllIllllll.lllIIIllIIIIlllIlIIllIIll(), "5");
        IlIlllIIIIIIlIIllIIllIlll.put(class_0700.IlIIIlIIIIllIIIllIIIIIIll.lllIIIllIIIIlllIlIIllIIll(), "5");
        IIIllIllIIlIlIlIlIllllIIl = "-5+6-7";
        lIIIIlIlIIlllllIIllIIlIII = "+14&13-13";
        IlIlIIlIlIllIIlIlIIllIIIl = new HashMap();
        lllllIlllIIllIlIIlIIIllII = new String[]{"potion.prefix.mundane", "potion.prefix.uninteresting", "potion.prefix.bland", "potion.prefix.clear", "potion.prefix.milky", "potion.prefix.diffuse", "potion.prefix.artless", "potion.prefix.thin", "potion.prefix.awkward", "potion.prefix.flat", "potion.prefix.bulky", "potion.prefix.bungling", "potion.prefix.buttered", "potion.prefix.smooth", "potion.prefix.suave", "potion.prefix.debonair", "potion.prefix.thick", "potion.prefix.elegant", "potion.prefix.fancy", "potion.prefix.charming", "potion.prefix.dashing", "potion.prefix.refined", "potion.prefix.cordial", "potion.prefix.sparkling", "potion.prefix.potent", "potion.prefix.foul", "potion.prefix.odorless", "potion.prefix.rank", "potion.prefix.harsh", "potion.prefix.acrid", "potion.prefix.gross", "potion.prefix.stinky"};
    }
}

