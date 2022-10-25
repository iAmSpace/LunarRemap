package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Maps
 */
import com.google.common.collect.Maps;
import java.util.Map;

public enum class_0617 {
    lllIIIllIIIIlllIlIIllIIll("master", 0),
    lllIlIIlIIIlIlIIIllIlllIl("music", 1),
    IlIllllllIIlIIllllIIlIIIl("record", 2),
    lIlllIlllIIIIlIIlllIllIII("weather", 3),
    IlIIIIIllllllIIlllIllllll("block", 4),
    lIllllIIlIIIlIllllllIIIll("hostile", 5),
    IIIllIIlIIIIIIlIlIIllIIlI("neutral", 6),
    IllIIlllllllIIlIIlIIIIlIl("player", 7),
    IIIllIllIIlIlIlIlIllllIIl("ambient", 8);

    private static final Map IllIIIllIIIIlIlIlIllIIlll;
    private static final Map lIIIIlIlIIlllllIIllIIlIII;
    private final String llIIlllIllIllllIIIlIIIIII;
    private final int llIIllIllIlIIlIIllIllllll;

    /*
     * WARNING - void declaration
     */
    private class_0617() {
        void var4_2;
        void var3_1;
        this.llIIlllIllIllllIIIlIIIIII = var3_1;
        this.llIIllIllIlIIlIIllIllllll = var4_2;
    }

    public String lllIIIllIIIIlllIlIIllIIll() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public static class_0617 lllIIIllIIIIlllIlIIllIIll(String string) {
        return (class_0617)((Object)IllIIIllIIIIlIlIlIllIIlll.get(string));
    }

    static {
        IllIIIllIIIIlIlIlIllIIlll = Maps.newHashMap();
        lIIIIlIlIIlllllIIllIIlIII = Maps.newHashMap();
        for (class_0617 class_06172 : class_0617.values()) {
            if (IllIIIllIIIIlIlIlIllIIlll.containsKey(class_06172.lllIIIllIIIIlllIlIIllIIll()) || lIIIIlIlIIlllllIIllIIlIII.containsKey(class_06172.lllIlIIlIIIlIlIIIllIlllIl())) {
                throw new Error("Clash in Sound Category ID & Name pools! Cannot insert " + (Object)((Object)class_06172));
            }
            IllIIIllIIIIlIlIlIllIIlll.put(class_06172.lllIIIllIIIIlllIlIIllIIll(), class_06172);
            lIIIIlIlIIlllllIIllIIlIII.put(class_06172.lllIlIIlIIIlIlIIIllIlllIl(), class_06172);
        }
    }
}

