package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum class_1968 {
    lllIIIllIIIIlllIlIIllIIll("LEGACY", 0, "legacy"),
    lllIlIIlIIIlIlIIIllIlllIl("MOJANG", 1, "mojang");

    private static final Map IlIllllllIIlIIllllIIlIIIl;
    private final String lIlllIlllIIIIlIIlllIllIII;
    private static final class_1968[] IlIIIIIllllllIIlllIllllll;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1968(String string2) {
        void var5_-1;
        this.lIlllIlllIIIIlIIlllIllIII = var5_-1;
    }

    public static class_1968 func_152421_a(String string) {
        return (class_1968)((Object)IlIllllllIIlIIllllIIlIIIl.get(string.toLowerCase()));
    }

    static {
        IlIllllllIIlIIllllIIlIIIl = Maps.newHashMap();
        IlIIIIIllllllIIlllIllllll = new class_1968[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl};
        for (class_1968 class_19682 : class_1968.values()) {
            IlIllllllIIlIIllllIIlIIIl.put(class_19682.lIlllIlllIIIIlIIlllIllIII, class_19682);
        }
    }
}

