package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum class_1227 {
    lllIIIllIIIIlllIlIIllIIll('0'),
    lllIlIIlIIIlIlIIIllIlllIl('1'),
    IlIllllllIIlIIllllIIlIIIl('2'),
    lIlllIlllIIIIlIIlllIllIII('3'),
    IlIIIIIllllllIIlllIllllll('4'),
    lIllllIIlIIIlIllllllIIIll('5'),
    IIIllIIlIIIIIIlIlIIllIIlI('6'),
    IllIIlllllllIIlIIlIIIIlIl('7'),
    IIIllIllIIlIlIlIlIllllIIl('8'),
    IllIIIllIIIIlIlIlIllIIlll('9'),
    lIIIIlIlIIlllllIIllIIlIII('a'),
    llIIlllIllIllllIIIlIIIIII('b'),
    llIIllIllIlIIlIIllIllllll('c'),
    lllIIlIIIllllllIIIIlIlIlI('d'),
    IlIlllIIIIIIlIIllIIllIlll('e'),
    IlIlIIlIlIllIIlIlIIllIIIl('f'),
    lllllIlllIIllIlIIlIIIllII('k', true),
    IlIlIIlllIIlIllIIIlllllIl('l', true),
    lIIlIIIIIlIlllIlIIlIlIlll('m', true),
    lIlIlIIlIIIIlIIIIIlllIIII('n', true),
    IlIIIlIIIIllIIIllIIIIIIll('o', true),
    IIlllIlIlllIllIIIlllIIlIl('r');

    private static final Map lIlIllIIlIIlIIlIIlIIlIIll;
    private static final Map llIIlIllIllllIlIIIIlIIlll;
    private static final Pattern llIllllIlIllIIIlIllIIlIlI;
    private final char lIlllIlllIlIIIIlllIlIlIIl;
    private final boolean IlIIlllllIIlIlIlllllIllll;
    private final String llIIlIlIlllIIllIlIlllIllI;
    private static final Pattern IllIIIIllIIllIllIlllIlIIl;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1227() {
        this((String)var1_-1, (int)var2_-1, (char)var3_1, false);
        void var3_1;
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - void declaration
     */
    private class_1227() {
        void var4_2;
        void var3_1;
        this.lIlllIlllIlIIIIlllIlIlIIl = var3_1;
        this.IlIIlllllIIlIlIlllllIllll = var4_2;
        this.llIIlIlIlllIIllIlIlllIllI = "\u00a7" + (char)var3_1;
    }

    public char lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIlIIIIlllIlIlIIl;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIIlllllIIlIlIlllllIllll;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return !this.IlIIlllllIIlIlIlllllIllll && this != IIlllIlIlllIllIIIlllIIlIl;
    }

    public String lIlllIlllIIIIlIIlllIllIII() {
        return this.name().toLowerCase();
    }

    public String toString() {
        return this.llIIlIlIlllIIllIlIlllIllI;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        return string == null ? null : llIllllIlIllIIIlIllIIlIlI.matcher(string).replaceAll("");
    }

    public static class_1227 lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return string == null ? null : (class_1227)((Object)llIIlIllIllllIlIIIIlIIlll.get(string.toLowerCase()));
    }

    public static Collection lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2) {
        ArrayList<String> arrayList = new ArrayList<String>();
        for (class_1227 class_12272 : class_1227.values()) {
            if (class_12272.IlIllllllIIlIIllllIIlIIIl() && !bl || class_12272.lllIlIIlIIIlIlIIIllIlllIl() && !bl2) continue;
            arrayList.add(class_12272.lIlllIlllIIIIlIIlllIllIII());
        }
        return arrayList;
    }

    public static String IlIllllllIIlIIllllIIlIIIl(String string) {
        Matcher matcher = IllIIIIllIIllIllIlllIlIIl.matcher(string);
        String string2 = "";
        while (matcher.find()) {
            string2 = matcher.group();
        }
        return string2;
    }

    static {
        lIlIllIIlIIlIIlIIlIIlIIll = new HashMap();
        llIIlIllIllllIlIIIIlIIlll = new HashMap();
        llIllllIlIllIIIlIllIIlIlI = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FK-OR]");
        for (class_1227 class_12272 : class_1227.values()) {
            lIlIllIIlIIlIIlIIlIIlIIll.put(Character.valueOf(class_12272.lllIIIllIIIIlllIlIIllIIll()), class_12272);
            llIIlIllIllllIlIIIIlIIlll.put(class_12272.lIlllIlllIIIIlIIlllIllIII(), class_12272);
        }
        IllIIIIllIIllIllIlllIlIIl = Pattern.compile("(?i)" + String.valueOf('\u00a7') + "[0-9A-FR]");
    }
}

