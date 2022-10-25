package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.regex.Pattern;

public class class_1911 {
    private static final Pattern lllIIIllIIIIlllIlIIllIIll = Pattern.compile("(?i)\\u00A7[0-9A-FK-OR]");

    public static String lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = n / 20;
        int n3 = n2 / 60;
        return (n2 %= 60) < 10 ? n3 + ":0" + n2 : n3 + ":" + n2;
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        return lllIIIllIIIIlllIlIIllIIll.matcher(string).replaceAll("");
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return string == null || "".equals(string);
    }
}

