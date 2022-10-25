package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.HashMap;
import java.util.Map;

public class class_0384 {
    private static Map lllIIIllIIIIlllIlIIllIIll = null;

    public static void lllIIIllIIIIlllIlIIllIIll(class_1931 class_19312, class_2174 class_21742, float f, float f2) {
        class_1925 class_19252 = class_0384.lllIIIllIIIIlllIlIIllIIll(class_21742);
        if (class_19252 != null) {
            class_19252.lllIIIllIIIIlllIlIIllIIll(class_19312, class_21742, f, f2);
        }
    }

    public static synchronized class_1925 lllIIIllIIIIlllIlIIllIIll(class_2174 class_21742) {
        String string = class_21742.c_();
        if (string == null) {
            return null;
        }
        class_1925 class_19252 = (class_1925)class_0384.lllIIIllIIIIlllIlIIllIIll().get(string);
        if (class_19252 == null) {
            class_19252 = new class_1925();
            class_0384.lllIIIllIIIIlllIlIIllIIll().put(string, class_19252);
            class_1295 class_12952 = new class_1295(string);
            String string2 = "http://s.optifine.net/users/" + string + ".cfg";
            class_1115 class_11152 = new class_1115(string2, class_12952);
            class_11152.start();
        }
        return class_19252;
    }

    public static synchronized void lllIIIllIIIIlllIlIIllIIll(String string, class_1925 class_19252) {
        class_0384.lllIIIllIIIIlllIlIIllIIll().put(string, class_19252);
    }

    private static Map lllIIIllIIIIlllIlIIllIIll() {
        if (lllIIIllIIIIlllIlIIllIIll == null) {
            lllIIIllIIIIlllIlIIllIIll = new HashMap();
        }
        return lllIIIllIIIIlllIlIIllIIll;
    }
}

