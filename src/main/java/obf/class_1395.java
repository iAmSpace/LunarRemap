package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1395 {
    public static final char[] lllIIIllIIIIlllIlIIllIIll = new char[]{'/', '\n', '\r', '\t', '\u0000', '\f', '`', '?', '*', '\\', '<', '>', '|', '\"', ':'};

    public static boolean lllIIIllIIIIlllIlIIllIIll(char c) {
        return c != '\u00a7' && c >= ' ' && c != '\u007f';
    }

    public static String lllIIIllIIIIlllIlIIllIIll(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (char c : string.toCharArray()) {
            if (!class_1395.lllIIIllIIIIlllIlIIllIIll(c)) continue;
            stringBuilder.append(c);
        }
        return stringBuilder.toString();
    }
}

