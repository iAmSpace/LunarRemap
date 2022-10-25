package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.BiMap
 *  com.google.common.collect.HashBiMap
 *  com.google.common.collect.Iterables
 *  com.google.common.collect.Maps
 *  gnu.trove.map.TIntObjectMap
 *  gnu.trove.map.hash.TIntObjectHashMap
 *  org.apache.logging.log4j.LogManager
 */
import com.google.common.collect.BiMap;
import com.google.common.collect.HashBiMap;
import com.google.common.collect.Iterables;
import com.google.common.collect.Maps;
import gnu.trove.map.TIntObjectMap;
import gnu.trove.map.hash.TIntObjectHashMap;
import java.util.Map;
import org.apache.logging.log4j.LogManager;

public class class_0546
extends Enum {
    public static final /* enum */ class_0546 lllIIIllIIIIlllIlIIllIIll = new class_1367("HANDSHAKING", 0, -1, null);
    public static final /* enum */ class_0546 lllIlIIlIIIlIlIIIllIlllIl = new class_2041("PLAY", 1, 0, null);
    public static final /* enum */ class_0546 IlIllllllIIlIIllllIIlIIIl = new class_0497("STATUS", 2, 1, null);
    public static final /* enum */ class_0546 lIlllIlllIIIIlIIlllIllIII = new class_0057("LOGIN", 3, 2, null);
    private static final TIntObjectMap IlIIIIIllllllIIlllIllllll;
    private static final Map lIllllIIlIIIlIllllllIIIll;
    private final int IIIllIIlIIIIIIlIlIIllIIlI;
    private final BiMap IllIIlllllllIIlIIlIIIIlIl = HashBiMap.create();
    private final BiMap IIIllIllIIlIlIlIlIllllIIl = HashBiMap.create();
    private static final /* synthetic */ class_0546[] IllIIIllIIIIlIlIlIllIIlll;

    public static class_0546[] values() {
        return (class_0546[])IllIIIllIIIIlIlIlIllIIlll.clone();
    }

    public static class_0546 valueOf(String string) {
        return Enum.valueOf(class_0546.class, string);
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_0546() {
        void var3_1;
        void var2_-1;
        void var1_-1;
        this.IIIllIIlIIIIIIlIlIIllIIlI = var3_1;
    }

    protected class_0546 lllIIIllIIIIlllIlIIllIIll(int n, Class class_) {
        if (this.IllIIlllllllIIlIIlIIIIlIl.containsKey((Object)n)) {
            String string = "Serverbound packet ID " + n + " is already assigned to " + this.IllIIlllllllIIlIIlIIIIlIl.get((Object)n) + "; cannot re-assign to " + class_;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl.containsValue((Object)class_)) {
            String string = "Serverbound packet " + class_ + " is already assigned to ID " + this.IllIIlllllllIIlIIlIIIIlIl.inverse().get((Object)class_) + "; cannot re-assign to " + n;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        this.IllIIlllllllIIlIIlIIIIlIl.put((Object)n, (Object)class_);
        return this;
    }

    protected class_0546 lllIlIIlIIIlIlIIIllIlllIl(int n, Class class_) {
        if (this.IIIllIllIIlIlIlIlIllllIIl.containsKey((Object)n)) {
            String string = "Clientbound packet ID " + n + " is already assigned to " + this.IIIllIllIIlIlIlIlIllllIIl.get((Object)n) + "; cannot re-assign to " + class_;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        if (this.IIIllIllIIlIlIlIlIllllIIl.containsValue((Object)class_)) {
            String string = "Clientbound packet " + class_ + " is already assigned to ID " + this.IIIllIllIIlIlIlIlIllllIIl.inverse().get((Object)class_) + "; cannot re-assign to " + n;
            LogManager.getLogger().fatal(string);
            throw new IllegalArgumentException(string);
        }
        this.IIIllIllIIlIlIlIlIllllIIl.put((Object)n, (Object)class_);
        return this;
    }

    public BiMap lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public BiMap lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public BiMap lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        return bl ? this.lllIlIIlIIIlIlIIIllIlllIl() : this.lllIIIllIIIIlllIlIIllIIll();
    }

    public BiMap lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        return bl ? this.lllIIIllIIIIlllIlIIllIIll() : this.lllIlIIlIIIlIlIIIllIlllIl();
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public static class_0546 lllIIIllIIIIlllIlIIllIIll(int n) {
        return (class_0546)((Object)IlIIIIIllllllIIlllIllllll.get(n));
    }

    public static class_0546 lllIIIllIIIIlllIlIIllIIll(class_0703 class_07032) {
        return (class_0546)((Object)lIllllIIlIIIlIllllllIIIll.get(class_07032.getClass()));
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private class_0546(int n2, Object object) {
        this((String)var1_-1, n, (int)var5_4);
        void var5_4;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    /* synthetic */ class_0546(String string, int n, int n2, Object object, class_1367 class_13672) {
        this((String)var1_-1, n, (String)n2, (int)object, (int)class_13672, var6_5);
        void var6_5;
        void var1_-1;
    }

    static {
        IllIIIllIIIIlIlIlIllIIlll = new class_0546[]{lllIIIllIIIIlllIlIIllIIll, lllIlIIlIIIlIlIIIllIlllIl, IlIllllllIIlIIllllIIlIIIl, lIlllIlllIIIIlIIlllIllIII};
        IlIIIIIllllllIIlllIllllll = new TIntObjectHashMap();
        lIllllIIlIIIlIllllllIIIll = Maps.newHashMap();
        for (class_0546 class_05462 : class_0546.values()) {
            IlIIIIIllllllIIlllIllllll.put(class_05462.IlIllllllIIlIIllllIIlIIIl(), (Object)class_05462);
            for (Class class_ : Iterables.concat((Iterable)class_05462.lllIlIIlIIIlIlIIIllIlllIl().values(), (Iterable)class_05462.lllIIIllIIIIlllIlIIllIIll().values())) {
                if (lIllllIIlIIIlIllllllIIIll.containsKey(class_) && lIllllIIlIIIlIllllllIIIll.get(class_) != class_05462) {
                    throw new Error("Packet " + class_ + " is already assigned to protocol " + lIllllIIlIIIlIllllllIIIll.get(class_) + " - can't reassign to " + (Object)((Object)class_05462));
                }
                lIllllIIlIIIlIllllllIIIll.put(class_, class_05462);
            }
        }
    }
}

