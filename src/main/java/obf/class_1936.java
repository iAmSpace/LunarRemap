package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum class_1936 {
    lllIIIllIIIIlllIlIIllIIll("OPEN_URL", 0, "open_url", true),
    lllIlIIlIIIlIlIIIllIlllIl("OPEN_FILE", 1, "open_file", false),
    IlIllllllIIlIIllllIIlIIIl("RUN_COMMAND", 2, "run_command", true),
    lIlllIlllIIIIlIIlllIllIII("TWITCH_USER_INFO", 3, "twitch_user_info", false),
    IlIIIIIllllllIIlllIllllll("SUGGEST_COMMAND", 4, "suggest_command", true),
    lIllllIIlIIIlIllllllIIIll("UPLOAD_SCREENSHOT", 5, "upload_screenshot", false);

    private static final Map IIIllIIlIIIIIIlIlIIllIIlI;
    private final boolean IllIIlllllllIIlIIlIIIIlIl;
    private final String IIIllIllIIlIlIlIlIllllIIl;

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_1936(String string3, boolean bl) {
        void var6_4;
        void var5_3;
        this.IIIllIllIIlIlIlIlIllllIIl = var5_3;
        this.IllIIlllllllIIlIIlIIIIlIl = var6_4;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public String lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public static class_1936 lllIIIllIIIIlllIlIIllIIll(String string) {
        return (class_1936)((Object)IIIllIIlIIIIIIlIlIIllIIlI.get(string));
    }

    static {
        IIIllIIlIIIIIIlIlIIllIIlI = Maps.newHashMap();
        for (class_1936 class_19362 : class_1936.values()) {
            IIIllIIlIIIIIIlIlIIllIIlI.put(class_19362.lllIlIIlIIIlIlIIIllIlllIl(), class_19362);
        }
    }
}

