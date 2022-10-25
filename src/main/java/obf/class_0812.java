package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.ArrayList;

public class class_0812 {
    public static ArrayList lllIIIllIIIIlllIlIIllIIll = new ArrayList();

    public static void lllIIIllIIIIlllIlIIllIIll(String string, boolean bl) {
        class_0562 class_05622 = class_0812.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_05622 != null) {
            class_05622.lllIlIIlIIIlIlIIIllIlllIl = bl;
        } else {
            lllIIIllIIIIlllIlIIllIIll.add(new class_0562(string, bl));
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(String string, boolean bl, boolean bl2) {
        class_0562 class_05622 = class_0812.lllIIIllIIIIlllIlIIllIIll(string);
        if (class_05622 != null) {
            class_05622.IlIllllllIIlIIllllIIlIIIl = bl;
            class_05622.lIlllIlllIIIIlIIlllIllIII = bl2;
        } else {
            lllIIIllIIIIlllIlIIllIIll.add(new class_0562(string, bl, bl2));
        }
    }

    public static class_0562 lllIIIllIIIIlllIlIIllIIll(String string) {
        for (class_0562 class_05622 : lllIIIllIIIIlllIlIIllIIll) {
            if (!class_05622.lllIIIllIIIIlllIlIIllIIll.equals(string)) continue;
            return class_05622;
        }
        return null;
    }
}

