package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Doubles
 */
import com.google.common.primitives.Doubles;
import net.minecraft.block.Block;
import net.minecraft.util.IChatComponent;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentTranslation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class class_1246
implements class_0291 {
    private static class_1622 lllIIIllIIIIlllIlIIllIIll;

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return 4;
    }

    @Override
    public List IlIllllllIIlIIllllIIlIIIl() {
        return null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692) {
        return class_19692.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl(), this.lllIIIllIIIIlllIlIIllIIll());
    }

    @Override
    public List lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring) {
        return null;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string) {
        try {
            return Integer.parseInt(string);
        }
        catch (NumberFormatException numberFormatException) {
            throw new class_1956("commands.generic.num.invalid", string);
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string, int n) {
        return class_1246.lllIIIllIIIIlllIlIIllIIll(class_19692, string, n, Integer.MAX_VALUE);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string, int n, int n2) {
        int n3 = class_1246.lllIIIllIIIIlllIlIIllIIll(class_19692, string);
        if (n3 < n) {
            throw new class_1956("commands.generic.num.tooSmall", n3, n);
        }
        if (n3 > n2) {
            throw new class_1956("commands.generic.num.tooBig", n3, n2);
        }
        return n3;
    }

    public static double lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String string) {
        try {
            double d = Double.parseDouble(string);
            if (!Doubles.isFinite((double)d)) {
                throw new class_1956("commands.generic.num.invalid", string);
            }
            return d;
        }
        catch (NumberFormatException numberFormatException) {
            throw new class_1956("commands.generic.num.invalid", string);
        }
    }

    public static double lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string, double d) {
        return class_1246.lllIIIllIIIIlllIlIIllIIll(class_19692, string, d, Double.MAX_VALUE);
    }

    public static double lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string, double d, double d2) {
        double d3 = class_1246.lllIlIIlIIIlIlIIIllIlllIl(class_19692, string);
        if (d3 < d) {
            throw new class_1956("commands.generic.double.tooSmall", d3, d);
        }
        if (d3 > d2) {
            throw new class_1956("commands.generic.double.tooBig", d3, d2);
        }
        return d3;
    }

    public static boolean IlIllllllIIlIIllllIIlIIIl(class_1969 class_19692, String string) {
        if (!string.equals("true") && !string.equals("1")) {
            if (!string.equals("false") && !string.equals("0")) {
                throw new class_1953("commands.generic.boolean.invalid", string);
            }
            return false;
        }
        return true;
    }

    public static class_1822 IlIllllllIIlIIllllIIlIIIl(class_1969 class_19692) {
        if (class_19692 instanceof class_1822) {
            return (class_1822)class_19692;
        }
        throw new class_0340("You must specify which player you wish to perform this action on.", new Object[0]);
    }

    public static class_1822 lIlllIlllIIIIlIIlllIllIII(class_1969 class_19692, String string) {
        class_1822 class_18222 = class_1093.lllIIIllIIIIlllIlIIllIIll(class_19692, string);
        if (class_18222 != null) {
            return class_18222;
        }
        class_18222 = class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(string);
        if (class_18222 == null) {
            throw new class_0340();
        }
        return class_18222;
    }

    public static String IlIIIIIllllllIIlllIllllll(class_1969 class_19692, String string) {
        class_1822 class_18222 = class_1093.lllIIIllIIIIlllIlIIllIIll(class_19692, string);
        if (class_18222 != null) {
            return class_18222.llllIIIIlIIIlIIIIIIlIllll();
        }
        if (class_1093.lllIlIIlIIIlIlIIIllIlllIl(string)) {
            throw new class_0340();
        }
        return string;
    }

    public static IChatComponent lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring, int n) {
        return class_1246.lllIIIllIIIIlllIlIIllIIll(class_19692, arrstring, n, false);
    }

    public static IChatComponent lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String[] arrstring, int n, boolean bl) {
        class_0722 class_07222 = new class_0722("");
        for (int i = n; i < arrstring.length; ++i) {
            if (i > n) {
                class_07222.lllIIIllIIIIlllIlIIllIIll(" ");
            }
            IChatComponent class_22552 = new class_0722(arrstring[i]);
            if (bl) {
                IChatComponent class_22553 = class_1093.lllIlIIlIIIlIlIIIllIlllIl(class_19692, arrstring[i]);
                if (class_22553 != null) {
                    class_22552 = class_22553;
                } else if (class_1093.lllIlIIlIIIlIlIIIllIlllIl(arrstring[i])) {
                    throw new class_0340();
                }
            }
            class_07222.lllIIIllIIIIlllIlIIllIIll(class_22552);
        }
        return class_07222;
    }

    public static String lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String[] arrstring, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = n; i < arrstring.length; ++i) {
            if (i > n) {
                stringBuilder.append(" ");
            }
            String string = arrstring[i];
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static double lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, double d, String string) {
        return class_1246.lllIIIllIIIIlllIlIIllIIll(class_19692, d, string, -30000000, 30000000);
    }

    public static double lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, double d, String string, int n, int n2) {
        double d2;
        boolean bl = string.startsWith("~");
        if (bl && Double.isNaN(d)) {
            throw new class_1956("commands.generic.num.invalid", d);
        }
        double d3 = d2 = bl ? d : 0.0;
        if (!bl || string.length() > 1) {
            boolean bl2 = string.contains(".");
            if (bl) {
                string = string.substring(1);
            }
            d2 += class_1246.lllIlIIlIIIlIlIIIllIlllIl(class_19692, string);
            if (!bl2 && !bl) {
                d2 += 0.5;
            }
        }
        if (n != 0 || n2 != 0) {
            if (d2 < (double)n) {
                throw new class_1956("commands.generic.double.tooSmall", d2, n);
            }
            if (d2 > (double)n2) {
                throw new class_1956("commands.generic.double.tooBig", d2, n2);
            }
        }
        return d2;
    }

    public static Item lIllllIIlIIIlIllllllIIIll(class_1969 class_19692, String string) {
        Item class_06112 = (Item) Item.lllIIIllIIIIlllIlIIllIIll.getObject(string);
        if (class_06112 == null) {
            try {
                Item class_06113 = Item.lllIIIllIIIIlllIlIIllIIll(Integer.parseInt(string));
                if (class_06113 != null) {
                    ChatComponentTranslation class_17902 = new ChatComponentTranslation("commands.generic.deprecatedId", Item.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_06113));
                    class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.GRAY);
                    class_19692.lllIIIllIIIIlllIlIIllIIll(class_17902);
                }
                class_06112 = class_06113;
            }
            catch (NumberFormatException numberFormatException) {
                // empty catch block
            }
        }
        if (class_06112 == null) {
            throw new class_1956("commands.give.notFound", string);
        }
        return class_06112;
    }

    public static Block IIIllIIlIIIIIIlIlIIllIIlI(class_1969 class_19692, String string) {
        if (Block.blockRegistry.lllIlIIlIIIlIlIIIllIlllIl(string)) {
            return (Block) Block.blockRegistry.getObject(string);
        }
        try {
            int n = Integer.parseInt(string);
            if (Block.blockRegistry.lllIlIIlIIIlIlIIIllIlllIl(n)) {
                Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(n);
                ChatComponentTranslation class_17902 = new ChatComponentTranslation("commands.generic.deprecatedId", Block.blockRegistry.lllIlIIlIIIlIlIIIllIlllIl(class_05492));
                class_17902.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(EnumChatFormatting.GRAY);
                class_19692.lllIIIllIIIIlllIlIIllIIll(class_17902);
                return class_05492;
            }
        }
        catch (NumberFormatException numberFormatException) {
            // empty catch block
        }
        throw new class_1956("commands.give.notFound", string);
    }

    public static String lllIIIllIIIIlllIlIIllIIll(Object[] arrobject) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrobject.length; ++i) {
            String string = arrobject[i].toString();
            if (i > 0) {
                if (i == arrobject.length - 1) {
                    stringBuilder.append(" and ");
                } else {
                    stringBuilder.append(", ");
                }
            }
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static IChatComponent lllIIIllIIIIlllIlIIllIIll(IChatComponent[] arrclass_2255) {
        class_0722 class_07222 = new class_0722("");
        for (int i = 0; i < arrclass_2255.length; ++i) {
            if (i > 0) {
                if (i == arrclass_2255.length - 1) {
                    class_07222.lllIIIllIIIIlllIlIIllIIll(" and ");
                } else if (i > 0) {
                    class_07222.lllIIIllIIIIlllIlIIllIIll(", ");
                }
            }
            class_07222.lllIIIllIIIIlllIlIIllIIll(arrclass_2255[i]);
        }
        return class_07222;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(Collection collection) {
        return class_1246.lllIIIllIIIIlllIlIIllIIll(collection.toArray(new String[collection.size()]));
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        return string2.regionMatches(true, 0, string, 0, string.length());
    }

    public static List lllIIIllIIIIlllIlIIllIIll(String[] arrstring, String ... arrstring2) {
        String string = arrstring[arrstring.length - 1];
        ArrayList<String> arrayList = new ArrayList<String>();
        String[] arrstring3 = arrstring2;
        int n = arrstring2.length;
        for (int i = 0; i < n; ++i) {
            String string2 = arrstring3[i];
            if (!class_1246.lllIIIllIIIIlllIlIIllIIll(string, string2)) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    public static List lllIIIllIIIIlllIlIIllIIll(String[] arrstring, Iterable iterable) {
        String string = arrstring[arrstring.length - 1];
        ArrayList<String> arrayList = new ArrayList<String>();
        for (String string2 : iterable) {
            if (!class_1246.lllIIIllIIIIlllIlIIllIIll(string, string2)) continue;
            arrayList.add(string2);
        }
        return arrayList;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(String[] arrstring, int n) {
        return false;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, class_0291 class_02912, String string, Object ... arrobject) {
        class_1246.lllIIIllIIIIlllIlIIllIIll(class_19692, class_02912, 0, string, arrobject);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, class_0291 class_02912, int n, String string, Object ... arrobject) {
        if (lllIIIllIIIIlllIlIIllIIll != null) {
            lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_19692, class_02912, n, string, arrobject);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1622 class_16222) {
        lllIIIllIIIIlllIlIIllIIll = class_16222;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0291 class_02912) {
        return this.lllIIIllIIIIlllIlIIllIIll().compareTo(class_02912.lllIIIllIIIIlllIlIIllIIll());
    }

    public int compareTo(Object object) {
        return this.lllIIIllIIIIlllIlIIllIIll((class_0291)object);
    }
}

