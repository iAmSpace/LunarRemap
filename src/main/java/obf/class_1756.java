package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.HashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1756 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private static Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private static Map IlIllllllIIlIIllllIIlIIIl = new HashMap();
    private static Map lIlllIlllIIIIlIIlllIllIII = new HashMap();
    private static Map IlIIIIIllllllIIlllIllllll = new HashMap();

    private static void lllIlIIlIIIlIlIIIllIlllIl(Class class_, String string) {
        lllIlIIlIIIlIlIIIllIlllIl.put(string, class_);
        IlIllllllIIlIIllllIIlIIIl.put(class_, string);
    }

    static void lllIIIllIIIIlllIlIIllIIll(Class class_, String string) {
        lIlllIlllIIIIlIIlllIllIII.put(string, class_);
        IlIIIIIllllllIIlllIllllll.put(class_, string);
    }

    public static String lllIIIllIIIIlllIlIIllIIll(class_1099 class_10992) {
        return (String)IlIllllllIIlIIllllIIlIIIl.get(class_10992.getClass());
    }

    public static String lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362) {
        return (String)IlIIIIIllllllIIlllIllllll.get(class_10362.getClass());
    }

    public static class_1099 lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752, class_1334 class_13342) {
        class_1099 class_10992 = null;
        try {
            Class class_ = (Class)lllIlIIlIIIlIlIIIllIlllIl.get(class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
            if (class_ != null) {
                class_10992 = (class_1099)class_.newInstance();
            }
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.warn("Failed Start with id " + class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
            exception.printStackTrace();
        }
        if (class_10992 != null) {
            class_10992.lllIIIllIIIIlllIlIIllIIll(class_13342, class_07752);
        } else {
            lllIIIllIIIIlllIlIIllIIll.warn("Skipping Structure with id " + class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
        }
        return class_10992;
    }

    public static class_1036 lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752, class_1334 class_13342) {
        class_1036 class_10362 = null;
        try {
            Class class_ = (Class)lIlllIlllIIIIlIIlllIllIII.get(class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
            if (class_ != null) {
                class_10362 = (class_1036)class_.newInstance();
            }
        }
        catch (Exception exception) {
            lllIIIllIIIIlllIlIIllIIll.warn("Failed Piece with id " + class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
            exception.printStackTrace();
        }
        if (class_10362 != null) {
            class_10362.lllIIIllIIIIlllIlIIllIIll(class_13342, class_07752);
        } else {
            lllIIIllIIIIlllIlIIllIIll.warn("Skipping Piece with id " + class_07752.IllIIIllIIIIlIlIlIllIIlll("id"));
        }
        return class_10362;
    }

    static {
        class_1756.lllIlIIlIIIlIlIIIllIlllIl(class_0311.class, "Mineshaft");
        class_1756.lllIlIIlIIIlIlIIIllIlllIl(class_0566.class, "Village");
        class_1756.lllIlIIlIIIlIlIIIllIlllIl(class_1385.class, "Fortress");
        class_1756.lllIlIIlIIIlIlIIIllIlllIl(class_0082.class, "Stronghold");
        class_1756.lllIlIIlIIIlIlIIIllIlllIl(class_1814.class, "Temple");
        class_1657.lllIIIllIIIIlllIlIIllIIll();
        class_1979.lllIIIllIIIIlllIlIIllIIll();
        class_0415.lllIIIllIIIIlllIlIIllIIll();
        class_1942.lllIIIllIIIIlllIlIIllIIll();
        class_0581.lllIIIllIIIIlllIlIIllIIll();
    }
}

