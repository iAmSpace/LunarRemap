package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import optifine.Config;
import net.minecraft.client.resources.DefaultResourcePack;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.List;
import java.util.Properties;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

public class class_1245 {
    private static class_1301[][] lllIIIllIIIIlllIlIIllIIll = null;
    private static class_1301[][] lllIlIIlIIIlIlIIIllIlllIl = null;
    private static boolean IlIllllllIIlIIllllIIlIIIl = false;
    private static final int lIlllIlllIIIIlIIlllIllIII = 0;
    private static final int IlIIIIIllllllIIlllIllllll = 1;
    private static final int lIllllIIlIIIlIllllllIIIll = 2;
    private static final int IIIllIIlIIIIIIlIlIIllIIlI = 3;
    private static final int IllIIlllllllIIlIIlIIIIlIl = 4;
    private static final int IIIllIllIIlIlIlIlIllllIIl = 5;
    private static final int IllIIIllIIIIlIlIlIllIIlll = 0;
    private static final int lIIIIlIlIIlllllIIllIIlIII = 1;
    private static final int llIIlllIllIllllIIIlIIIIII = 2;
    private static final int llIIllIllIlIIlIIllIllllll = 3;
    private static final int lllIIlIIIllllllIIIIlIlIlI = 4;
    private static final int IlIlllIIIIIIlIIllIIllIlll = 5;
    private static final int IlIlIIlIlIllIIlIlIIllIIIl = 0;
    private static final int lllllIlllIIllIlIIlIIIllII = 1;
    private static final int IlIlIIlllIIlIllIIIlllllIl = 2;
    private static final String[] lIIlIIIIIlIlllIlIIlIlIlll = new String[]{"", "a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    private static final int[] lIlIlIIlIIIIlIIIIIlllIIII = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 0, 0, 0, 0, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 0, 0, 0, 0, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 0, 0, 0, 0, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 0, 0, 0, 0, 0};

    public static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022) {
        class_2102 class_21023 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_18432, class_05492, n, n2, n3, n4, class_21022);
        if (class_05492.IlIlllIIIIIIlIIllIIllIlll() && ((class_1585)class_21023).IIlllIlIlllIllIIIlllIIlIl()) {
            return class_21022;
        }
        return class_21023;
    }

    private static class_2102 IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022) {
        class_2102 class_21023;
        if (class_18432 == null) {
            return class_21022;
        }
        class_2102 class_21024 = class_1245.lllIIIllIIIIlllIlIIllIIll(class_18432, class_05492, n, n2, n3, n4, class_21022, true);
        if (!IlIllllllIIlIIllllIIlIIIl) {
            return class_21024;
        }
        if (class_21024 == class_21022) {
            return class_21024;
        }
        class_2102 class_21025 = class_21024;
        for (int i = 0; i < 3 && (class_21023 = class_1245.lllIIIllIIIIlllIlIIllIIll(class_18432, class_05492, n, n2, n3, n4, class_21025, false)) != class_21025; ++i) {
            class_21025 = class_21023;
        }
        return class_21025;
    }

    public static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022, boolean bl) {
        int n5;
        Object object;
        class_1301[] arrclass_1301;
        if (!(class_21022 instanceof class_1585)) {
            return class_21022;
        }
        class_1585 class_15852 = (class_1585)class_21022;
        int n6 = class_15852.IlIlIIlIlIllIIlIlIIllIIIl();
        int n7 = -1;
        if (lllIlIIlIIIlIlIIIllIlllIl != null && class_0868.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl && n6 >= 0 && n6 < lllIlIIlIIIlIlIIIllIlllIl.length && (arrclass_1301 = lllIlIIlIIIlIlIIIllIlllIl[n6]) != null) {
            if (n7 < 0) {
                n7 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            }
            if ((object = class_1245.lllIIIllIIIIlllIlIIllIIll(arrclass_1301, class_18432, class_05492, n, n2, n3, n4, (class_2102)class_15852, n7)) != null) {
                return object;
            }
        }
        if (lllIIIllIIIIlllIlIIllIIll != null && bl && (n5 = Block.lllIIIllIIIIlllIlIIllIIll(class_05492)) >= 0 && n5 < lllIIIllIIIIlllIlIIllIIll.length && (object = lllIIIllIIIIlllIlIIllIIll[n5]) != null) {
            class_2102 class_21023;
            if (n7 < 0) {
                n7 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            }
            if ((class_21023 = class_1245.lllIIIllIIIIlllIlIIllIIll(object, class_18432, class_05492, n, n2, n3, n4, (class_2102)class_15852, n7)) != null) {
                return class_21023;
            }
        }
        return class_21022;
    }

    public static class_1301 lllIlIIlIIIlIlIIIllIlllIl(class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022) {
        int n5;
        Object object;
        class_1301[] arrclass_1301;
        if (class_18432 == null) {
            return null;
        }
        if (!(class_21022 instanceof class_1585)) {
            return null;
        }
        class_1585 class_15852 = (class_1585)class_21022;
        int n6 = class_15852.IlIlIIlIlIllIIlIlIIllIIIl();
        int n7 = -1;
        if (lllIlIIlIIIlIlIIIllIlllIl != null && class_0868.IlIIIIIllllllIIlllIllllll.IllIIlllllllIIlIIlIIIIlIl && n6 >= 0 && n6 < lllIlIIlIIIlIlIIIllIlllIl.length && (arrclass_1301 = lllIlIIlIIIlIlIIIllIlllIl[n6]) != null) {
            if (n7 < 0) {
                n7 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            }
            if ((object = class_1245.lllIlIIlIIIlIlIIIllIlllIl(arrclass_1301, class_18432, class_05492, n, n2, n3, n4, (class_2102)class_15852, n7)) != null) {
                return object;
            }
        }
        if (lllIIIllIIIIlllIlIIllIIll != null && (n5 = Block.lllIIIllIIIIlllIlIIllIIll(class_05492)) >= 0 && n5 < lllIIIllIIIIlllIlIIllIIll.length && (object = lllIIIllIIIIlllIlIIllIIll[n5]) != null) {
            class_1301 class_13012;
            if (n7 < 0) {
                n7 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            }
            if ((class_13012 = class_1245.lllIlIIlIIIlIlIIIllIlllIl(object, class_18432, class_05492, n, n2, n3, n4, (class_2102)class_15852, n7)) != null) {
                return class_13012;
            }
        }
        return null;
    }

    private static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1301[] arrclass_1301, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022, int n5) {
        for (int i = 0; i < arrclass_1301.length; ++i) {
            class_2102 class_21023;
            class_1301 class_13012 = arrclass_1301[i];
            if (class_13012 == null || (class_21023 = class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, class_18432, class_05492, n, n2, n3, n4, class_21022, n5)) == null) continue;
            return class_21023;
        }
        return null;
    }

    private static class_1301 lllIlIIlIIIlIlIIIllIlllIl(class_1301[] arrclass_1301, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022, int n5) {
        for (int i = 0; i < arrclass_1301.length; ++i) {
            class_2102 class_21023;
            class_1301 class_13012 = arrclass_1301[i];
            if (class_13012 == null || (class_21023 = class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, class_18432, class_05492, n, n2, n3, n4, class_21022, n5)) == null) continue;
            return class_13012;
        }
        return null;
    }

    private static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022, int n5) {
        int n6;
        int n7;
        if (n2 < class_13012.lIIIIlIlIIlllllIIllIIlIII || n2 > class_13012.llIIlllIllIllllIIIlIIIIII) {
            return null;
        }
        if (class_13012.IllIIIllIIIIlIlIlIllIIlll != null) {
            class_0672 class_06722 = class_18432.a_(n, n3);
            n7 = 0;
            for (n6 = 0; n6 < class_13012.IllIIIllIIIIlIlIlIllIIlll.length; ++n6) {
                class_0672 class_06723 = class_13012.IllIIIllIIIIlIlIlIllIIlll[n6];
                if (class_06722 != class_06723) continue;
                n7 = 1;
                break;
            }
            if (n7 == 0) {
                return null;
            }
        }
        int n8 = 0;
        n7 = n5;
        if (class_05492 instanceof class_1988) {
            n8 = class_1245.lllIlIIlIIIlIlIIIllIlllIl(n4, n5);
            n7 &= 3;
        }
        if (class_05492 instanceof class_0865) {
            n8 = class_1245.IlIllllllIIlIIllllIIlIIIl(n4, n5);
            if (n7 > 2) {
                n7 = 2;
            }
        }
        if (n4 >= 0 && class_13012.IllIIlllllllIIlIIlIIIIlIl != 63) {
            n6 = n4;
            if (n8 != 0) {
                n6 = class_1245.lllIIIllIIIIlllIlIIllIIll(n4, n8);
            }
            if ((1 << n6 & class_13012.IllIIlllllllIIlIIlIIIIlIl) == 0) {
                return null;
            }
        }
        if (class_13012.IIIllIllIIlIlIlIlIllllIIl != null) {
            int[] arrn = class_13012.IIIllIllIIlIlIlIlIllllIIl;
            boolean bl = false;
            for (int i = 0; i < arrn.length; ++i) {
                if (arrn[i] != n7) continue;
                bl = true;
                break;
            }
            if (!bl) {
                return null;
            }
        }
        switch (class_13012.IlIIIIIllllllIIlllIllllll) {
            case 1: {
                return class_1245.lllIlIIlIIIlIlIIIllIlllIl(class_13012, class_18432, class_05492, n, n2, n3, n4, class_21022, n5);
            }
            case 2: {
                return class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, class_18432, class_05492, n, n2, n3, n8, n4, class_21022, n5);
            }
            case 6: {
                return class_1245.lllIlIIlIIIlIlIIIllIlllIl(class_13012, class_18432, class_05492, n, n2, n3, n8, n4, class_21022, n5);
            }
            case 3: {
                return class_1245.IlIIIIIllllllIIlllIllllll(class_13012, class_18432, class_05492, n, n2, n3, n8, n4, class_21022, n5);
            }
            case 4: {
                return class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, n, n2, n3, n4);
            }
            case 5: {
                return class_1245.lllIlIIlIIIlIlIIIllIlllIl(class_13012, n, n2, n3, n4);
            }
            case 7: {
                return class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012);
            }
            case 8: {
                return class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3, n8, n4, class_21022, n5);
            }
            case 9: {
                return class_1245.lIlllIlllIIIIlIIlllIllIII(class_13012, class_18432, class_05492, n, n2, n3, n8, n4, class_21022, n5);
            }
        }
        return null;
    }

    private static int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        switch (n2) {
            case 0: {
                return n;
            }
            case 1: {
                switch (n) {
                    case 0: {
                        return 2;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 1;
                    }
                    case 3: {
                        return 0;
                    }
                }
                return n;
            }
            case 2: {
                switch (n) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 5;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: {
                        return 0;
                    }
                }
                return n;
            }
        }
        return n;
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3 = (n2 & 0xC) >> 2;
        switch (n3) {
            case 1: {
                return 2;
            }
            case 2: {
                return 1;
            }
        }
        return 0;
    }

    private static int IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        switch (n2) {
            case 3: {
                return 2;
            }
            case 4: {
                return 1;
            }
        }
        return 0;
    }

    private static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1301 class_13012, int n, int n2, int n3, int n4) {
        if (class_13012.IIlllIlIlllIllIIIlllIIlIl.length == 1) {
            return class_13012.IIlllIlIlllIllIIIlllIIlIl[0];
        }
        int n5 = n4 / class_13012.IlIlIIlllIIlIllIIIlllllIl * class_13012.IlIlIIlllIIlIllIIIlllllIl;
        int n6 = Config.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5) & Integer.MAX_VALUE;
        int n7 = 0;
        if (class_13012.lllllIlllIIllIlIIlIIIllII == null) {
            n7 = n6 % class_13012.IIlllIlIlllIllIIIlllIIlIl.length;
        } else {
            int n8 = n6 % class_13012.lIlIlIIlIIIIlIIIIIlllIIII;
            int[] arrn = class_13012.lIIlIIIIIlIlllIlIIlIlIlll;
            for (int i = 0; i < arrn.length; ++i) {
                if (n8 >= arrn[i]) continue;
                n7 = i;
                break;
            }
        }
        return class_13012.IIlllIlIlllIllIIIlllIIlIl[n7];
    }

    private static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1301 class_13012) {
        return class_13012.IIlllIlIlllIllIIIlllIIlIl[0];
    }

    private static class_2102 lllIlIIlIIIlIlIIIllIlllIl(class_1301 class_13012, int n, int n2, int n3, int n4) {
        if (class_13012.IIlllIlIlllIllIIIlllIIlIl.length == 1) {
            return class_13012.IIlllIlIlllIllIIIlllIIlIl[0];
        }
        int n5 = 0;
        int n6 = 0;
        switch (n4) {
            case 0: {
                n5 = n;
                n6 = n3;
                break;
            }
            case 1: {
                n5 = n;
                n6 = n3;
                break;
            }
            case 2: {
                n5 = -n - 1;
                n6 = -n2;
                break;
            }
            case 3: {
                n5 = n;
                n6 = -n2;
                break;
            }
            case 4: {
                n5 = n3;
                n6 = -n2;
                break;
            }
            case 5: {
                n5 = -n3 - 1;
                n6 = -n2;
            }
        }
        n6 %= class_13012.IlIlIIlIlIllIIlIlIIllIIIl;
        if ((n5 %= class_13012.IlIlllIIIIIIlIIllIIllIlll) < 0) {
            n5 += class_13012.IlIlllIIIIIIlIIllIIllIlll;
        }
        if (n6 < 0) {
            n6 += class_13012.IlIlIIlIlIllIIlIlIIllIIIl;
        }
        int n7 = n6 * class_13012.IlIlllIIIIIIlIIllIIllIlll + n5;
        return class_13012.IIlllIlIlllIllIIIlllIIlIl[n7];
    }

    private static class_2102 lllIlIIlIIIlIlIIIllIlllIl(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022, int n5) {
        boolean[] arrbl = new boolean[6];
        switch (n4) {
            case 0: 
            case 1: {
                arrbl[0] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n4, class_21022, n5);
                arrbl[1] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n4, class_21022, n5);
                arrbl[2] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n4, class_21022, n5);
                arrbl[3] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n4, class_21022, n5);
                break;
            }
            case 2: {
                arrbl[0] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n4, class_21022, n5);
                arrbl[1] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n4, class_21022, n5);
                arrbl[2] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n4, class_21022, n5);
                arrbl[3] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n4, class_21022, n5);
                break;
            }
            case 3: {
                arrbl[0] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n4, class_21022, n5);
                arrbl[1] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n4, class_21022, n5);
                arrbl[2] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n4, class_21022, n5);
                arrbl[3] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n4, class_21022, n5);
                break;
            }
            case 4: {
                arrbl[0] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n4, class_21022, n5);
                arrbl[1] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n4, class_21022, n5);
                arrbl[2] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n4, class_21022, n5);
                arrbl[3] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n4, class_21022, n5);
                break;
            }
            case 5: {
                arrbl[0] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n4, class_21022, n5);
                arrbl[1] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n4, class_21022, n5);
                arrbl[2] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n4, class_21022, n5);
                arrbl[3] = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n4, class_21022, n5);
            }
        }
        int n6 = 0;
        if (arrbl[0] & !arrbl[1] & !arrbl[2] & !arrbl[3]) {
            n6 = 3;
        } else if (!arrbl[0] & arrbl[1] & !arrbl[2] & !arrbl[3]) {
            n6 = 1;
        } else if (!arrbl[0] & !arrbl[1] & arrbl[2] & !arrbl[3]) {
            n6 = 12;
        } else if (!arrbl[0] & !arrbl[1] & !arrbl[2] & arrbl[3]) {
            n6 = 36;
        } else if (arrbl[0] & arrbl[1] & !arrbl[2] & !arrbl[3]) {
            n6 = 2;
        } else if (!arrbl[0] & !arrbl[1] & arrbl[2] & arrbl[3]) {
            n6 = 24;
        } else if (arrbl[0] & !arrbl[1] & arrbl[2] & !arrbl[3]) {
            n6 = 15;
        } else if (arrbl[0] & !arrbl[1] & !arrbl[2] & arrbl[3]) {
            n6 = 39;
        } else if (!arrbl[0] & arrbl[1] & arrbl[2] & !arrbl[3]) {
            n6 = 13;
        } else if (!arrbl[0] & arrbl[1] & !arrbl[2] & arrbl[3]) {
            n6 = 37;
        } else if (!arrbl[0] & arrbl[1] & arrbl[2] & arrbl[3]) {
            n6 = 25;
        } else if (arrbl[0] & !arrbl[1] & arrbl[2] & arrbl[3]) {
            n6 = 27;
        } else if (arrbl[0] & arrbl[1] & !arrbl[2] & arrbl[3]) {
            n6 = 38;
        } else if (arrbl[0] & arrbl[1] & arrbl[2] & !arrbl[3]) {
            n6 = 14;
        } else if (arrbl[0] & arrbl[1] & arrbl[2] & arrbl[3]) {
            n6 = 26;
        }
        if (n6 == 0) {
            return class_13012.IIlllIlIlllIllIIIlllIIlIl[n6];
        }
        if (!Config.IIIIIIlIIIIIIIIIIlIlIlIlI()) {
            return class_13012.IIlllIlIlllIllIIIlllIIlIl[n6];
        }
        boolean[] arrbl2 = new boolean[6];
        switch (n4) {
            case 0: 
            case 1: {
                arrbl2[0] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3 + 1, n4, class_21022, n5);
                arrbl2[1] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3 + 1, n4, class_21022, n5);
                arrbl2[2] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3 - 1, n4, class_21022, n5);
                arrbl2[3] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3 - 1, n4, class_21022, n5);
                break;
            }
            case 2: {
                arrbl2[0] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2 - 1, n3, n4, class_21022, n5);
                arrbl2[1] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2 - 1, n3, n4, class_21022, n5);
                arrbl2[2] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2 + 1, n3, n4, class_21022, n5);
                arrbl2[3] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2 + 1, n3, n4, class_21022, n5);
                break;
            }
            case 3: {
                arrbl2[0] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2 - 1, n3, n4, class_21022, n5);
                arrbl2[1] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2 - 1, n3, n4, class_21022, n5);
                arrbl2[2] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2 + 1, n3, n4, class_21022, n5);
                arrbl2[3] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2 + 1, n3, n4, class_21022, n5);
                break;
            }
            case 4: {
                arrbl2[0] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3 + 1, n4, class_21022, n5);
                arrbl2[1] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3 - 1, n4, class_21022, n5);
                arrbl2[2] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3 + 1, n4, class_21022, n5);
                arrbl2[3] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3 - 1, n4, class_21022, n5);
                break;
            }
            case 5: {
                arrbl2[0] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3 - 1, n4, class_21022, n5);
                arrbl2[1] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3 + 1, n4, class_21022, n5);
                arrbl2[2] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3 - 1, n4, class_21022, n5);
                boolean bl = arrbl2[3] = !class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3 + 1, n4, class_21022, n5);
            }
        }
        if (n6 == 13 && arrbl2[0]) {
            n6 = 4;
        } else if (n6 == 15 && arrbl2[1]) {
            n6 = 5;
        } else if (n6 == 37 && arrbl2[2]) {
            n6 = 16;
        } else if (n6 == 39 && arrbl2[3]) {
            n6 = 17;
        } else if (n6 == 14 && arrbl2[0] && arrbl2[1]) {
            n6 = 7;
        } else if (n6 == 25 && arrbl2[0] && arrbl2[2]) {
            n6 = 6;
        } else if (n6 == 27 && arrbl2[3] && arrbl2[1]) {
            n6 = 19;
        } else if (n6 == 38 && arrbl2[3] && arrbl2[2]) {
            n6 = 18;
        } else if (n6 == 14 && !arrbl2[0] && arrbl2[1]) {
            n6 = 31;
        } else if (n6 == 25 && arrbl2[0] && !arrbl2[2]) {
            n6 = 30;
        } else if (n6 == 27 && !arrbl2[3] && arrbl2[1]) {
            n6 = 41;
        } else if (n6 == 38 && arrbl2[3] && !arrbl2[2]) {
            n6 = 40;
        } else if (n6 == 14 && arrbl2[0] && !arrbl2[1]) {
            n6 = 29;
        } else if (n6 == 25 && !arrbl2[0] && arrbl2[2]) {
            n6 = 28;
        } else if (n6 == 27 && arrbl2[3] && !arrbl2[1]) {
            n6 = 43;
        } else if (n6 == 38 && !arrbl2[3] && arrbl2[2]) {
            n6 = 42;
        } else if (n6 == 26 && arrbl2[0] && arrbl2[1] && arrbl2[2] && arrbl2[3]) {
            n6 = 46;
        } else if (n6 == 26 && !arrbl2[0] && arrbl2[1] && arrbl2[2] && arrbl2[3]) {
            n6 = 9;
        } else if (n6 == 26 && arrbl2[0] && !arrbl2[1] && arrbl2[2] && arrbl2[3]) {
            n6 = 21;
        } else if (n6 == 26 && arrbl2[0] && arrbl2[1] && !arrbl2[2] && arrbl2[3]) {
            n6 = 8;
        } else if (n6 == 26 && arrbl2[0] && arrbl2[1] && arrbl2[2] && !arrbl2[3]) {
            n6 = 20;
        } else if (n6 == 26 && arrbl2[0] && arrbl2[1] && !arrbl2[2] && !arrbl2[3]) {
            n6 = 11;
        } else if (n6 == 26 && !arrbl2[0] && !arrbl2[1] && arrbl2[2] && arrbl2[3]) {
            n6 = 22;
        } else if (n6 == 26 && !arrbl2[0] && arrbl2[1] && !arrbl2[2] && arrbl2[3]) {
            n6 = 23;
        } else if (n6 == 26 && arrbl2[0] && !arrbl2[1] && arrbl2[2] && !arrbl2[3]) {
            n6 = 10;
        } else if (n6 == 26 && arrbl2[0] && !arrbl2[1] && !arrbl2[2] && arrbl2[3]) {
            n6 = 34;
        } else if (n6 == 26 && !arrbl2[0] && arrbl2[1] && arrbl2[2] && !arrbl2[3]) {
            n6 = 35;
        } else if (n6 == 26 && arrbl2[0] && !arrbl2[1] && !arrbl2[2] && !arrbl2[3]) {
            n6 = 32;
        } else if (n6 == 26 && !arrbl2[0] && arrbl2[1] && !arrbl2[2] && !arrbl2[3]) {
            n6 = 33;
        } else if (n6 == 26 && !arrbl2[0] && !arrbl2[1] && arrbl2[2] && !arrbl2[3]) {
            n6 = 44;
        } else if (n6 == 26 && !arrbl2[0] && !arrbl2[1] && !arrbl2[2] && arrbl2[3]) {
            n6 = 45;
        }
        return class_13012.IIlllIlIlllIllIIIlllIIlIl[n6];
    }

    private static boolean IlIllllllIIlIIllllIIlIIIl(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, class_2102 class_21022, int n5) {
        Block class_05493 = class_18432.a_(n, n2, n3);
        if (class_13012.IIIllIIlIIIIIIlIlIIllIIlI == 2) {
            if (class_05493 == null) {
                return false;
            }
            int n6 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            class_2102 class_21023 = n4 >= 0 ? class_05493.lllIIIllIIIIlllIlIIllIIll(n4, n6) : class_05493.lllIIIllIIIIlllIlIIllIIll(1, n6);
            return class_21023 == class_21022;
        }
        if (class_13012.IIIllIIlIIIIIIlIlIIllIIlI == 3) {
            if (class_05493 == null) {
                return false;
            }
            return class_05493.lIllllIIlIIIlIllllllIIIll() == class_05492.lIllllIIlIIIlIllllllIIIll();
        }
        return class_05493 == class_05492 && class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) == n5;
    }

    private static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, int n5, class_2102 class_21022, int n6) {
        boolean bl = false;
        boolean bl2 = false;
        block0 : switch (n4) {
            case 0: {
                switch (n5) {
                    case 0: 
                    case 1: {
                        return null;
                    }
                    case 2: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n5, class_21022, n6);
                        break block0;
                    }
                    case 3: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n5, class_21022, n6);
                        break block0;
                    }
                    case 4: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n5, class_21022, n6);
                        break block0;
                    }
                    case 5: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n5, class_21022, n6);
                    }
                }
                break;
            }
            case 1: {
                switch (n5) {
                    case 2: 
                    case 3: {
                        return null;
                    }
                    case 0: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n5, class_21022, n6);
                        break block0;
                    }
                    case 1: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n5, class_21022, n6);
                        break block0;
                    }
                    case 4: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n5, class_21022, n6);
                        break block0;
                    }
                    case 5: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n5, class_21022, n6);
                    }
                }
                break;
            }
            case 2: {
                switch (n5) {
                    case 4: 
                    case 5: {
                        return null;
                    }
                    case 2: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n5, class_21022, n6);
                        break block0;
                    }
                    case 3: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n5, class_21022, n6);
                        break block0;
                    }
                    case 0: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n5, class_21022, n6);
                        break block0;
                    }
                    case 1: {
                        bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n5, class_21022, n6);
                        bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n5, class_21022, n6);
                    }
                }
            }
        }
        int n7 = 3;
        n7 = bl ? (bl2 ? 1 : 2) : (bl2 ? 0 : 3);
        return class_13012.IIlllIlIlllIllIIIlllIIlIl[n7];
    }

    private static class_2102 lllIlIIlIIIlIlIIIllIlllIl(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, int n5, class_2102 class_21022, int n6) {
        boolean bl = false;
        boolean bl2 = false;
        switch (n4) {
            case 0: {
                if (n5 == 1 || n5 == 0) {
                    return null;
                }
                bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 - 1, n3, n5, class_21022, n6);
                bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n5, class_21022, n6);
                break;
            }
            case 1: {
                if (n5 == 3 || n5 == 2) {
                    return null;
                }
                bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 - 1, n5, class_21022, n6);
                bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n5, class_21022, n6);
                break;
            }
            case 2: {
                if (n5 == 5 || n5 == 4) {
                    return null;
                }
                bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n - 1, n2, n3, n5, class_21022, n6);
                bl2 = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n5, class_21022, n6);
            }
        }
        int n7 = 3;
        n7 = bl ? (bl2 ? 1 : 2) : (bl2 ? 0 : 3);
        return class_13012.IIlllIlIlllIllIIIlllIIlIl[n7];
    }

    private static class_2102 IlIllllllIIlIIllllIIlIIIl(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, int n5, class_2102 class_21022, int n6) {
        class_2102[] arrclass_2102 = class_13012.IIlllIlIlllIllIIIlllIIlIl;
        class_2102 class_21023 = class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, class_18432, class_05492, n, n2, n3, n4, n5, class_21022, n6);
        if (class_21023 != null && class_21023 != class_21022 && class_21023 != arrclass_2102[3]) {
            return class_21023;
        }
        class_2102 class_21024 = class_1245.lllIlIIlIIIlIlIIIllIlllIl(class_13012, class_18432, class_05492, n, n2, n3, n4, n5, class_21022, n6);
        if (class_21024 == arrclass_2102[0]) {
            return arrclass_2102[4];
        }
        if (class_21024 == arrclass_2102[1]) {
            return arrclass_2102[5];
        }
        if (class_21024 == arrclass_2102[2]) {
            return arrclass_2102[6];
        }
        return class_21024;
    }

    private static class_2102 lIlllIlllIIIIlIIlllIllIII(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, int n5, class_2102 class_21022, int n6) {
        class_2102[] arrclass_2102 = class_13012.IIlllIlIlllIllIIIlllIIlIl;
        class_2102 class_21023 = class_1245.lllIlIIlIIIlIlIIIllIlllIl(class_13012, class_18432, class_05492, n, n2, n3, n4, n5, class_21022, n6);
        if (class_21023 != null && class_21023 != class_21022 && class_21023 != arrclass_2102[3]) {
            return class_21023;
        }
        class_2102 class_21024 = class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, class_18432, class_05492, n, n2, n3, n4, n5, class_21022, n6);
        if (class_21024 == arrclass_2102[0]) {
            return arrclass_2102[4];
        }
        if (class_21024 == arrclass_2102[1]) {
            return arrclass_2102[5];
        }
        if (class_21024 == arrclass_2102[2]) {
            return arrclass_2102[6];
        }
        return class_21024;
    }

    private static class_2102 IlIIIIIllllllIIlllIllllll(class_1301 class_13012, class_1843 class_18432, Block class_05492, int n, int n2, int n3, int n4, int n5, class_2102 class_21022, int n6) {
        boolean bl = false;
        switch (n4) {
            case 0: {
                if (n5 == 1 || n5 == 0) {
                    return null;
                }
                bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2 + 1, n3, n5, class_21022, n6);
                break;
            }
            case 1: {
                if (n5 == 3 || n5 == 2) {
                    return null;
                }
                bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n, n2, n3 + 1, n5, class_21022, n6);
                break;
            }
            case 2: {
                if (n5 == 5 || n5 == 4) {
                    return null;
                }
                bl = class_1245.IlIllllllIIlIIllllIIlIIIl(class_13012, class_18432, class_05492, n + 1, n2, n3, n5, class_21022, n6);
            }
        }
        if (bl) {
            return class_13012.IIlllIlIlllIllIIIlllIIlIl[0];
        }
        return null;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1511 class_15112) {
        lllIIIllIIIIlllIlIIllIIll = null;
        lllIlIIlIIIlIlIIIllIlllIl = null;
        class_0449[] arrclass_0449 = Config.lIIlIlllIllIlIlllIIIIIIII();
        for (int i = arrclass_0449.length - 1; i >= 0; --i) {
            class_0449 class_04492 = arrclass_0449[i];
            class_1245.lllIIIllIIIIlllIlIIllIIll(class_15112, class_04492);
        }
        class_1245.lllIIIllIIIIlllIlIIllIIll(class_15112, Config.IllllIIlIIIllIlllIlllIllI());
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1511 class_15112, class_0449 class_04492) {
        Object[] arrobject = class_1245.lllIIIllIIIIlllIlIIllIIll(class_04492, "mcpatcher/ctm/", ".properties");
        Arrays.sort(arrobject);
        List list = class_1245.lllIIIllIIIIlllIlIIllIIll(lllIlIIlIIIlIlIIIllIlllIl);
        List list2 = class_1245.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
        for (int i = 0; i < arrobject.length; ++i) {
            Object object = arrobject[i];
            Config.lllIIIllIIIIlllIlIIllIIll("ConnectedTextures: " + (String)object);
            try {
                ResourceLocation class_17732 = new ResourceLocation((String)object);
                InputStream inputStream = class_04492.lllIIIllIIIIlllIlIIllIIll(class_17732);
                if (inputStream == null) {
                    Config.lllIlIIlIIIlIlIIIllIlllIl("ConnectedTextures file not found: " + (String)object);
                    continue;
                }
                Properties properties = new Properties();
                properties.load(inputStream);
                class_1301 class_13012 = new class_1301(properties, (String)object);
                if (!class_13012.lllIIIllIIIIlllIlIIllIIll((String)object)) continue;
                class_13012.lllIIIllIIIIlllIlIIllIIll(class_15112);
                class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, list);
                class_1245.lllIlIIlIIIlIlIIIllIlllIl(class_13012, list2);
                continue;
            }
            catch (FileNotFoundException fileNotFoundException) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("ConnectedTextures file not found: " + (String)object);
                continue;
            }
            catch (IOException iOException) {
                iOException.printStackTrace();
            }
        }
        lllIIIllIIIIlllIlIIllIIll = class_1245.lllIIIllIIIIlllIlIIllIIll(list2);
        lllIlIIlIIIlIlIIIllIlllIl = class_1245.lllIIIllIIIIlllIlIIllIIll(list);
        IlIllllllIIlIIllllIIlIIIl = class_1245.lllIIIllIIIIlllIlIIllIIll();
        Config.lllIIIllIIIIlllIlIIllIIll("Multipass connected textures: " + IlIllllllIIlIIllllIIlIIIl);
    }

    private static List lllIIIllIIIIlllIlIIllIIll(class_1301[][] arrclass_1301) {
        ArrayList<ArrayList<class_1301>> arrayList = new ArrayList<ArrayList<class_1301>>();
        if (arrclass_1301 != null) {
            for (int i = 0; i < arrclass_1301.length; ++i) {
                class_1301[] arrclass_13012 = arrclass_1301[i];
                ArrayList<class_1301> arrayList2 = null;
                if (arrclass_13012 != null) {
                    arrayList2 = new ArrayList<class_1301>(Arrays.asList(arrclass_13012));
                }
                arrayList.add(arrayList2);
            }
        }
        return arrayList;
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll() {
        Object object;
        int n;
        ArrayList<class_1301> arrayList = new ArrayList<class_1301>();
        for (n = 0; n < lllIlIIlIIIlIlIIIllIlllIl.length; ++n) {
            object = lllIlIIlIIIlIlIIIllIlllIl[n];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        for (n = 0; n < lllIIIllIIIIlllIlIIllIIll.length; ++n) {
            object = lllIIIllIIIIlllIlIIllIIll[n];
            if (object == null) continue;
            arrayList.addAll(Arrays.asList(object));
        }
        class_1301[] arrclass_1301 = arrayList.toArray(new class_1301[arrayList.size()]);
        object = new HashSet();
        HashSet<class_2102> hashSet = new HashSet<class_2102>();
        for (int i = 0; i < arrclass_1301.length; ++i) {
            class_1301 class_13012 = arrclass_1301[i];
            if (class_13012.IlIIIlIIIIllIIIllIIIIIIll != null) {
                object.addAll(Arrays.asList(class_13012.IlIIIlIIIIllIIIllIIIIIIll));
            }
            if (class_13012.IIlllIlIlllIllIIIlllIIlIl == null) continue;
            hashSet.addAll(Arrays.asList(class_13012.IIlllIlIlllIllIIIlllIIlIl));
        }
        object.retainAll(hashSet);
        return !object.isEmpty();
    }

    private static class_1301[][] lllIIIllIIIIlllIlIIllIIll(List list) {
        class_1301[][] arrclass_1301 = new class_1301[list.size()][];
        for (int i = 0; i < list.size(); ++i) {
            List list2 = (List)list.get(i);
            if (list2 == null) continue;
            class_1301[] arrclass_13012 = list2.toArray(new class_1301[list2.size()]);
            arrclass_1301[i] = arrclass_13012;
        }
        return arrclass_1301;
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_1301 class_13012, List list) {
        if (class_13012.IlIIIlIIIIllIIIllIIIIIIll == null) {
            return;
        }
        for (int i = 0; i < class_13012.IlIIIlIIIIllIIIllIIIIIIll.length; ++i) {
            class_2102 class_21022 = class_13012.IlIIIlIIIIllIIIllIIIIIIll[i];
            if (!(class_21022 instanceof class_1585)) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("IIcon is not TextureAtlasSprite: " + class_21022 + ", name: " + class_21022.IIIllIIlIIIIIIlIlIIllIIlI());
                continue;
            }
            class_1585 class_15852 = (class_1585)class_21022;
            int n = class_15852.IlIlIIlIlIllIIlIlIIllIIIl();
            if (n < 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid tile ID: " + n + ", icon: " + class_15852.IIIllIIlIIIIIIlIlIIllIIlI());
                continue;
            }
            class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, list, n);
        }
    }

    private static void lllIlIIlIIIlIlIIIllIlllIl(class_1301 class_13012, List list) {
        if (class_13012.IlIllllllIIlIIllllIIlIIIl == null) {
            return;
        }
        for (int i = 0; i < class_13012.IlIllllllIIlIIllllIIlIIIl.length; ++i) {
            int n = class_13012.IlIllllllIIlIIllllIIlIIIl[i];
            if (n < 0) {
                Config.lllIlIIlIIIlIlIIIllIlllIl("Invalid block ID: " + n);
                continue;
            }
            class_1245.lllIIIllIIIIlllIlIIllIIll(class_13012, list, n);
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(class_1301 class_13012, List list, int n) {
        while (n >= list.size()) {
            list.add(null);
        }
        ArrayList<class_1301> arrayList = (ArrayList<class_1301>)list.get(n);
        if (arrayList == null) {
            arrayList = new ArrayList<class_1301>();
            list.set(n, arrayList);
        }
        arrayList.add(class_13012);
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492, String string, String string2) {
        if (class_04492 instanceof DefaultResourcePack) {
            return class_1245.lllIIIllIIIIlllIlIIllIIll(class_04492);
        }
        if (!(class_04492 instanceof class_0821)) {
            return new String[0];
        }
        class_0821 class_08212 = (class_0821)class_04492;
        File file = class_0179.lllIIIllIIIIlllIlIIllIIll(class_08212);
        if (file == null) {
            return new String[0];
        }
        if (file.isDirectory()) {
            return class_1245.lllIIIllIIIIlllIlIIllIIll(file, "", string, string2);
        }
        if (file.isFile()) {
            return class_1245.lllIIIllIIIIlllIlIIllIIll(file, string, string2);
        }
        return new String[0];
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(class_0449 class_04492) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] arrstring = class_1245.lllIlIIlIIIlIlIIIllIlllIl();
        for (int i = 0; i < arrstring.length; ++i) {
            String string = arrstring[i];
            ResourceLocation class_17732 = new ResourceLocation(string);
            if (!class_04492.lllIlIIlIIIlIlIIIllIlllIl(class_17732)) continue;
            arrayList.add(string);
        }
        String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring2;
    }

    private static String[] lllIlIIlIIIlIlIIIllIlllIl() {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string = "mcpatcher/ctm/default/";
        if (Config.lIlllIlllIIIIlIIlllIllIII(new ResourceLocation("textures/blocks/glass.png"))) {
            arrayList.add(string + "glass.properties");
            arrayList.add(string + "glasspane.properties");
        }
        if (Config.lIlllIlllIIIIlIIlllIllIII(new ResourceLocation("textures/blocks/bookshelf.png"))) {
            arrayList.add(string + "bookshelf.properties");
        }
        if (Config.lIlllIlllIIIIlIIlllIllIII(new ResourceLocation("textures/blocks/sandstone_normal.png"))) {
            arrayList.add(string + "sandstone.properties");
        }
        String[] arrstring = new String[]{"white", "orange", "magenta", "light_blue", "yellow", "lime", "pink", "gray", "silver", "cyan", "purple", "blue", "brown", "green", "red", "black"};
        for (int i = 0; i < arrstring.length; ++i) {
            String string2 = arrstring[i];
            if (!Config.lIlllIlllIIIIlIIlllIllIII(new ResourceLocation("textures/blocks/glass_" + string2 + ".png"))) continue;
            arrayList.add(string + i + "_glass_" + string2 + "/glass_" + string2 + ".properties");
            arrayList.add(string + i + "_glass_" + string2 + "/glass_pane_" + string2 + ".properties");
        }
        String[] arrstring2 = arrayList.toArray(new String[arrayList.size()]);
        return arrstring2;
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(File file, String string, String string2, String string3) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string4 = "assets/minecraft/";
        File[] arrfile = file.listFiles();
        if (arrfile == null) {
            return new String[0];
        }
        for (int i = 0; i < arrfile.length; ++i) {
            String string5;
            File file2 = arrfile[i];
            if (file2.isFile()) {
                string5 = string + file2.getName();
                if (!string5.startsWith(string4) || !(string5 = string5.substring(string4.length())).startsWith(string2) || !string5.endsWith(string3)) continue;
                arrayList.add(string5);
                continue;
            }
            if (!file2.isDirectory()) continue;
            string5 = string + file2.getName() + "/";
            String[] arrstring = class_1245.lllIIIllIIIIlllIlIIllIIll(file2, string5, string2, string3);
            for (int j = 0; j < arrstring.length; ++j) {
                String string6 = arrstring[j];
                arrayList.add(string6);
            }
        }
        String[] arrstring = arrayList.toArray(new String[arrayList.size()]);
        return arrstring;
    }

    private static String[] lllIIIllIIIIlllIlIIllIIll(File file, String string, String string2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        String string3 = "assets/minecraft/";
        try {
            ZipFile zipFile = new ZipFile(file);
            Enumeration<? extends ZipEntry> enumeration = zipFile.entries();
            while (enumeration.hasMoreElements()) {
                ZipEntry zipEntry = enumeration.nextElement();
                String string4 = zipEntry.getName();
                if (!string4.startsWith(string3) || !(string4 = string4.substring(string3.length())).startsWith(string) || !string4.endsWith(string2)) continue;
                arrayList.add(string4);
            }
            zipFile.close();
            return arrayList.toArray(new String[arrayList.size()]);
        }
        catch (IOException iOException) {
            iOException.printStackTrace();
            return new String[0];
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2 && bl) {
            if (bl3) {
                if (bl4) {
                    return 34;
                }
                return 50;
            }
            if (bl4) {
                return 18;
            }
            return 2;
        }
        if (bl2 && !bl) {
            if (bl3) {
                if (bl4) {
                    return 35;
                }
                return 51;
            }
            if (bl4) {
                return 19;
            }
            return 3;
        }
        if (!bl2 && bl) {
            if (bl3) {
                if (bl4) {
                    return 33;
                }
                return 49;
            }
            if (bl4) {
                return 17;
            }
            return 1;
        }
        if (bl3) {
            if (bl4) {
                return 32;
            }
            return 48;
        }
        if (bl4) {
            return 16;
        }
        return 0;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = n % 16;
        if (n2 == 1) {
            return n + 2;
        }
        if (n2 == 3) {
            return n - 2;
        }
        return n;
    }

    public static class_2102 lllIIIllIIIIlllIlIIllIIll(class_1301 class_13012, int n, class_2102 class_21022) {
        if (class_13012.IlIIIIIllllllIIlllIllllll != 1) {
            return class_21022;
        }
        if (n < 0 || n >= lIlIlIIlIIIIlIIIIIlllIIII.length) {
            return class_21022;
        }
        int n2 = lIlIlIIlIIIIlIIIIIlllIIII[n];
        class_2102[] arrclass_2102 = class_13012.IIlllIlIlllIllIIIlllIIlIl;
        if (n2 < 0 || n2 >= arrclass_2102.length) {
            return class_21022;
        }
        return arrclass_2102[n2];
    }
}

