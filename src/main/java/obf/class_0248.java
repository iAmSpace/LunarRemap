package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum class_0248 {
    lllIIIllIIIIlllIlIIllIIll("SHOW_TEXT", 0, "show_text", true),
    lllIlIIlIIIlIlIIIllIlllIl("SHOW_ACHIEVEMENT", 1, "show_achievement", true),
    IlIllllllIIlIIllllIIlIIIl("SHOW_ITEM", 2, "show_item", true);

    private static final Map lIlllIlllIIIIlIIlllIllIII;
    private final boolean IlIIIIIllllllIIlllIllllll;
    private final String lIllllIIlIIIlIllllllIIIll;
    private static final class_0248[] IIIllIIlIIIIIIlIlIIllIIlI;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_0248(String string3, boolean bl) {
        void var6_4;
        void var5_3;
        this.lIllllIIlIIIlIllllllIIIll = var5_3;
        this.IlIIIIIllllllIIlllIllllll = var6_4;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public static class_0248 lllIIIllIIIIlllIlIIllIIll(String string) {
        return (class_0248)((Object)lIlllIlllIIIIlIIlllIllIII.get(string));
    }

    static {
        lIlllIlllIIIIlIIlllIllIII = Maps.newHashMap();
        IIIllIIlIIIIIIlIlIIllIIlI = new class_0248[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl};
        for (class_0248 class_02482 : class_0248.values()) {
            lIlllIlllIIIIlIIlllIllIII.put(class_02482.lllIlIIlIIIlIlIIIllIlllIl(), class_02482);
        }
    }
}

