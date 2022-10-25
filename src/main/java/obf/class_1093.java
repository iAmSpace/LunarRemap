package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.IChatComponent;
import net.minecraft.util.MathHelper;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class class_1093 {
    private static final Pattern lllIIIllIIIIlllIlIIllIIll = Pattern.compile("^@([parf])(?:\\[([\\w=,!-]*)\\])?$");
    private static final Pattern lllIlIIlIIIlIlIIIllIlllIl = Pattern.compile("\\G([-!]?[\\w-]*)(?:$|,)");
    private static final Pattern IlIllllllIIlIIllllIIlIIIl = Pattern.compile("\\G(\\w+)=([-!]?[\\w-]*)(?:$|,)");

    public static class_1822 lllIIIllIIIIlllIlIIllIIll(class_1969 class_19692, String string) {
        class_1822[] arrclass_1822 = class_1093.IlIllllllIIlIIllllIIlIIIl(class_19692, string);
        return arrclass_1822 != null && arrclass_1822.length == 1 ? arrclass_1822[0] : null;
    }

    public static IChatComponent lllIlIIlIIIlIlIIIllIlllIl(class_1969 class_19692, String string) {
        class_1822[] arrclass_1822 = class_1093.IlIllllllIIlIIllllIIlIIIl(class_19692, string);
        if (arrclass_1822 != null && arrclass_1822.length != 0) {
            IChatComponent[] arrclass_2255 = new IChatComponent[arrclass_1822.length];
            for (int i = 0; i < arrclass_2255.length; ++i) {
                arrclass_2255[i] = arrclass_1822[i].llIIIIllIIIIIIIlIIIlIIIIl();
            }
            return class_1246.lllIIIllIIIIlllIlIIllIIll(arrclass_2255);
        }
        return null;
    }

    public static class_1822[] IlIllllllIIlIIllllIIlIIIl(class_1969 class_19692, String string) {
        Matcher matcher = lllIIIllIIIIlllIlIIllIIll.matcher(string);
        if (matcher.matches()) {
            class_1334 class_13342;
            Map map = class_1093.IllIIlllllllIIlIIlIIIIlIl(matcher.group(2));
            String string2 = matcher.group(1);
            int n = class_1093.IlIllllllIIlIIllllIIlIIIl(string2);
            int n2 = class_1093.lIlllIlllIIIIlIIlllIllIII(string2);
            int n3 = class_1093.lIllllIIlIIIlIllllllIIIll(string2);
            int n4 = class_1093.IlIIIIIllllllIIlllIllllll(string2);
            int n5 = class_1093.IIIllIIlIIIIIIlIlIIllIIlI(string2);
            int n6 = class_2243.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
            class_2208 class_22082 = class_19692.lllIIlIIIllllllIIIIlIlIlI();
            Map map2 = class_1093.lllIIIllIIIIlllIlIIllIIll(map);
            String string3 = null;
            String string4 = null;
            boolean bl = false;
            if (map.containsKey("rm")) {
                n = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("rm"), n);
                bl = true;
            }
            if (map.containsKey("r")) {
                n2 = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("r"), n2);
                bl = true;
            }
            if (map.containsKey("lm")) {
                n3 = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("lm"), n3);
            }
            if (map.containsKey("l")) {
                n4 = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("l"), n4);
            }
            if (map.containsKey("x")) {
                class_22082.lllIIIllIIIIlllIlIIllIIll = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("x"), class_22082.lllIIIllIIIIlllIlIIllIIll);
                bl = true;
            }
            if (map.containsKey("y")) {
                class_22082.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("y"), class_22082.lllIlIIlIIIlIlIIIllIlllIl);
                bl = true;
            }
            if (map.containsKey("z")) {
                class_22082.IlIllllllIIlIIllllIIlIIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("z"), class_22082.IlIllllllIIlIIllllIIlIIIl);
                bl = true;
            }
            if (map.containsKey("m")) {
                n6 = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("m"), n6);
            }
            if (map.containsKey("c")) {
                n5 = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("c"), n5);
            }
            if (map.containsKey("team")) {
                string4 = (String)map.get("team");
            }
            if (map.containsKey("name")) {
                string3 = (String)map.get("name");
            }
            class_1334 class_13343 = class_13342 = bl ? class_19692.IIllIllIIllIIlllIIIlIlllI() : null;
            if (!string2.equals("p") && !string2.equals("a")) {
                if (string2.equals("r")) {
                    List list = class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_22082, n, n2, 0, n6, n3, n4, map2, string3, string4, class_13342);
                    Collections.shuffle(list);
                    list = list.subList(0, Math.min(n5, list.size()));
                    return list.isEmpty() ? new class_1822[0] : list.toArray(new class_1822[list.size()]);
                }
                return null;
            }
            List list = class_0220.IlIIlllllIIlIlIlllllIllll().lIIIllIIIIIllllIlIlIllIll().lllIIIllIIIIlllIlIIllIIll(class_22082, n, n2, n5, n6, n3, n4, map2, string3, string4, class_13342);
            return list.isEmpty() ? new class_1822[0] : list.toArray(new class_1822[list.size()]);
        }
        return null;
    }

    public static Map lllIIIllIIIIlllIlIIllIIll(Map map) {
        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();
        for (String string : map.keySet()) {
            if (!string.startsWith("score_") || string.length() <= "score_".length()) continue;
            String string2 = string.substring("score_".length());
            hashMap.put(string2, MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get(string), 1));
        }
        return hashMap;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        Matcher matcher = lllIIIllIIIIlllIlIIllIIll.matcher(string);
        if (matcher.matches()) {
            Map map = class_1093.IllIIlllllllIIlIIlIIIIlIl(matcher.group(2));
            String string2 = matcher.group(1);
            int n = class_1093.IIIllIIlIIIIIIlIlIIllIIlI(string2);
            if (map.containsKey("c")) {
                n = MathHelper.lllIIIllIIIIlllIlIIllIIll((String)map.get("c"), n);
            }
            return n != 1;
        }
        return false;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string, String string2) {
        Matcher matcher = lllIIIllIIIIlllIlIIllIIll.matcher(string);
        if (matcher.matches()) {
            String string3 = matcher.group(1);
            return string2 == null || string2.equals(string3);
        }
        return false;
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(String string) {
        return class_1093.lllIIIllIIIIlllIlIIllIIll(string, (String)null);
    }

    private static final int IlIllllllIIlIIllllIIlIIIl(String string) {
        return 0;
    }

    private static final int lIlllIlllIIIIlIIlllIllIII(String string) {
        return 0;
    }

    private static final int IlIIIIIllllllIIlllIllllll(String string) {
        return Integer.MAX_VALUE;
    }

    private static final int lIllllIIlIIIlIllllllIIIll(String string) {
        return 0;
    }

    private static final int IIIllIIlIIIIIIlIlIIllIIlI(String string) {
        return string.equals("a") ? 0 : 1;
    }

    private static Map IllIIlllllllIIlIIlIIIIlIl(String string) {
        HashMap<String, String> hashMap = new HashMap<String, String>();
        if (string == null) {
            return hashMap;
        }
        Matcher matcher = lllIlIIlIIIlIlIIIllIlllIl.matcher(string);
        int n = 0;
        int n2 = -1;
        while (matcher.find()) {
            String string2 = null;
            switch (n++) {
                case 0: {
                    string2 = "x";
                    break;
                }
                case 1: {
                    string2 = "y";
                    break;
                }
                case 2: {
                    string2 = "z";
                    break;
                }
                case 3: {
                    string2 = "r";
                }
            }
            if (string2 != null && matcher.group(1).length() > 0) {
                hashMap.put(string2, matcher.group(1));
            }
            n2 = matcher.end();
        }
        if (n2 < string.length()) {
            matcher = IlIllllllIIlIIllllIIlIIIl.matcher(n2 == -1 ? string : string.substring(n2));
            while (matcher.find()) {
                hashMap.put(matcher.group(1), matcher.group(2));
            }
        }
        return hashMap;
    }
}

