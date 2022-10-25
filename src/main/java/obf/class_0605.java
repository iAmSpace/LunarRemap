package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.Stack;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0605 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();

    public static class_2037 lllIIIllIIIIlllIlIIllIIll(String string) {
        int n = class_0605.lllIlIIlIIIlIlIIIllIlllIl(string = string.trim());
        if (n != 1) {
            throw new class_1323("Encountered multiple top tags, only one expected");
        }
        class_1517 class_15172 = null;
        class_15172 = string.startsWith("{") ? class_0605.lllIIIllIIIIlllIlIIllIIll("tag", string) : class_0605.lllIIIllIIIIlllIlIIllIIll(class_0605.lllIlIIlIIIlIlIIIllIlllIl(string, false), class_0605.IlIllllllIIlIIllllIIlIIIl(string, false));
        return class_15172.lllIIIllIIIIlllIlIIllIIll();
    }

    static int lllIlIIlIIIlIlIIIllIlllIl(String string) {
        int n = 0;
        boolean bl = false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < string.length(); ++i) {
            char c = string.charAt(i);
            if (c == '\"') {
                if (i > 0 && string.charAt(i - 1) == '\\') {
                    if (bl) continue;
                    throw new class_1323("Illegal use of \\\": " + string);
                }
                bl = !bl;
                continue;
            }
            if (bl) continue;
            if (c != '{' && c != '[') {
                if (c == '}' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '{')) {
                    throw new class_1323("Unbalanced curly brackets {}: " + string);
                }
                if (c != ']' || !stack.isEmpty() && ((Character)stack.pop()).charValue() == '[') continue;
                throw new class_1323("Unbalanced square brackets []: " + string);
            }
            if (stack.isEmpty()) {
                ++n;
            }
            stack.push(Character.valueOf(c));
        }
        if (bl) {
            throw new class_1323("Unbalanced quotation: " + string);
        }
        if (!stack.isEmpty()) {
            throw new class_1323("Unbalanced brackets: " + string);
        }
        if (n == 0 && !string.isEmpty()) {
            return 1;
        }
        return n;
    }

    static class_1517 lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        string2 = string2.trim();
        class_0605.lllIlIIlIIIlIlIIIllIlllIl(string2);
        if (string2.startsWith("{")) {
            if (!string2.endsWith("}")) {
                throw new class_1323("Unable to locate ending bracket for: " + string2);
            }
            string2 = string2.substring(1, string2.length() - 1);
            class_1191 class_11912 = new class_1191(string);
            while (string2.length() > 0) {
                String string3 = class_0605.lllIIIllIIIIlllIlIIllIIll(string2, false);
                if (string3.length() <= 0) continue;
                String string4 = class_0605.lllIlIIlIIIlIlIIIllIlllIl(string3, false);
                String string5 = class_0605.IlIllllllIIlIIllllIIlIIIl(string3, false);
                class_11912.lllIlIIlIIIlIlIIIllIlllIl.add(class_0605.lllIIIllIIIIlllIlIIllIIll(string4, string5));
                if (string2.length() < string3.length() + 1) break;
                char c = string2.charAt(string3.length());
                if (c != ',' && c != '{' && c != '}' && c != '[' && c != ']') {
                    throw new class_1323("Unexpected token '" + c + "' at: " + string2.substring(string3.length()));
                }
                string2 = string2.substring(string3.length() + 1);
            }
            return class_11912;
        }
        if (string2.startsWith("[") && !string2.matches("\\[[-\\d|,\\s]+\\]")) {
            if (!string2.endsWith("]")) {
                throw new class_1323("Unable to locate ending bracket for: " + string2);
            }
            string2 = string2.substring(1, string2.length() - 1);
            class_1396 class_13962 = new class_1396(string);
            while (string2.length() > 0) {
                String string6 = class_0605.lllIIIllIIIIlllIlIIllIIll(string2, true);
                if (string6.length() > 0) {
                    String string7 = class_0605.lllIlIIlIIIlIlIIIllIlllIl(string6, true);
                    String string8 = class_0605.IlIllllllIIlIIllllIIlIIIl(string6, true);
                    class_13962.lllIlIIlIIIlIlIIIllIlllIl.add(class_0605.lllIIIllIIIIlllIlIIllIIll(string7, string8));
                    if (string2.length() < string6.length() + 1) break;
                    char c = string2.charAt(string6.length());
                    if (c != ',' && c != '{' && c != '}' && c != '[' && c != ']') {
                        throw new class_1323("Unexpected token '" + c + "' at: " + string2.substring(string6.length()));
                    }
                    string2 = string2.substring(string6.length() + 1);
                    continue;
                }
                lllIIIllIIIIlllIlIIllIIll.debug(string2);
            }
            return class_13962;
        }
        return new class_0509(string, string2);
    }

    private static String lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        int n;
        int n2 = class_0605.lllIIIllIIIIlllIlIIllIIll(string, ':');
        if (n2 < 0 && !bl) {
            throw new class_1323("Unable to locate name/value separator for string: " + string);
        }
        int n3 = class_0605.lllIIIllIIIIlllIlIIllIIll(string, ',');
        if (n3 >= 0 && n3 < n2 && !bl) {
            throw new class_1323("Name error at: " + string);
        }
        if (bl && (n2 < 0 || n2 > n3)) {
            n2 = -1;
        }
        Stack<Character> stack = new Stack<Character>();
        boolean bl2 = false;
        boolean bl3 = false;
        boolean bl4 = false;
        int n4 = 0;
        for (n = n2 + 1; n < string.length(); ++n) {
            char c = string.charAt(n);
            if (c == '\"') {
                if (n > 0 && string.charAt(n - 1) == '\\') {
                    if (!bl2) {
                        throw new class_1323("Illegal use of \\\": " + string);
                    }
                } else {
                    boolean bl5 = bl2 = !bl2;
                    if (bl2 && !bl4) {
                        bl3 = true;
                    }
                    if (!bl2) {
                        n4 = n;
                    }
                }
            } else if (!bl2) {
                if (c != '{' && c != '[') {
                    if (c == '}' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '{')) {
                        throw new class_1323("Unbalanced curly brackets {}: " + string);
                    }
                    if (c == ']' && (stack.isEmpty() || ((Character)stack.pop()).charValue() != '[')) {
                        throw new class_1323("Unbalanced square brackets []: " + string);
                    }
                    if (c == ',' && stack.isEmpty()) {
                        return string.substring(0, n);
                    }
                } else {
                    stack.push(Character.valueOf(c));
                }
            }
            if (Character.isWhitespace(c)) continue;
            if (!bl2 && bl3 && n4 != n) {
                return string.substring(0, n4 + 1);
            }
            bl4 = true;
        }
        return string.substring(0, n);
    }

    private static String lllIlIIlIIIlIlIIIllIlllIl(String string, boolean bl) {
        if (bl && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return "";
        }
        int n = string.indexOf(58);
        if (n < 0) {
            if (bl) {
                return "";
            }
            throw new class_1323("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(0, n).trim();
    }

    private static String IlIllllllIIlIIllllIIlIIIl(String string, boolean bl) {
        if (bl && ((string = string.trim()).startsWith("{") || string.startsWith("["))) {
            return string;
        }
        int n = string.indexOf(58);
        if (n < 0) {
            if (bl) {
                return string;
            }
            throw new class_1323("Unable to locate name/value separator for string: " + string);
        }
        return string.substring(n + 1).trim();
    }

    private static int lllIIIllIIIIlllIlIIllIIll(String string, char c) {
        boolean bl = false;
        for (int i = 0; i < string.length(); ++i) {
            char c2 = string.charAt(i);
            if (c2 == '\"') {
                if (i > 0 && string.charAt(i - 1) == '\\') continue;
                bl = !bl;
                continue;
            }
            if (bl) continue;
            if (c2 == c) {
                return i;
            }
            if (c2 != '{' && c2 != '[') continue;
            return -1;
        }
        return -1;
    }
}

