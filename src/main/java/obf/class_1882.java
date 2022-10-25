package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  com.google.common.collect.Maps
 *  com.google.common.collect.Sets
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.google.common.collect.Sets;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1882
implements class_0334 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private final class_0233 IlIllllllIIlIIllllIIlIIIl;
    private String lIlllIlllIIIIlIIlllIllIII;
    protected static final class_1715 lllIIIllIIIIlllIlIIllIIll = new class_1715();
    private Map IlIIIIIllllllIIlllIllllll = Maps.newHashMap();

    public class_1882(class_0233 class_02332, String string) {
        this.IlIllllllIIlIIllllIIlIIIl = class_02332;
        this.lIlllIlllIIIIlIIlllIllIII = string;
        class_0616.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll);
    }

    public void lllIIIllIIIIlllIlIIllIIll(List list) {
        this.IlIIIIIllllllIIlllIllllll.clear();
        for (class_0449 class_04492 : list) {
            try {
                class_1566 class_15662 = (class_1566)class_04492.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl, "language");
                if (class_15662 == null) continue;
                for (class_1977 class_19772 : class_15662.lllIIIllIIIIlllIlIIllIIll()) {
                    if (this.IlIIIIIllllllIIlllIllllll.containsKey(class_19772.lllIIIllIIIIlllIlIIllIIll())) continue;
                    this.IlIIIIIllllllIIlllIllllll.put(class_19772.lllIIIllIIIIlllIlIIllIIll(), class_19772);
                }
            }
            catch (RuntimeException runtimeException) {
                lllIlIIlIIIlIlIIIllIlllIl.warn("Unable to parse metadata section of resourcepack: " + class_04492.IlIllllllIIlIIllllIIlIIIl(), (Throwable)runtimeException);
            }
            catch (IOException iOException) {
                lllIlIIlIIIlIlIIIllIlllIl.warn("Unable to parse metadata section of resourcepack: " + class_04492.IlIllllllIIlIIllllIIlIIIl(), (Throwable)iOException);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0947 class_09472) {
        ArrayList arrayList = Lists.newArrayList((Object[])new String[]{"en_US"});
        if (!"en_US".equals(this.lIlllIlllIIIIlIIlllIllIII)) {
            arrayList.add(this.lIlllIlllIIIIlIIlllIllIII);
        }
        lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_09472, arrayList);
        class_1311.lllIIIllIIIIlllIlIIllIIll(class_1882.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.IlIllllllIIlIIllllIIlIIIl() != null && this.IlIllllllIIlIIllllIIlIIIl().lllIlIIlIIIlIlIIIllIlllIl();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1977 class_19772) {
        this.lIlllIlllIIIIlIIlllIllIII = class_19772.lllIIIllIIIIlllIlIIllIIll();
    }

    public class_1977 IlIllllllIIlIIllllIIlIIIl() {
        return this.IlIIIIIllllllIIlllIllllll.containsKey(this.lIlllIlllIIIIlIIlllIllIII) ? (class_1977)this.IlIIIIIllllllIIlllIllllll.get(this.lIlllIlllIIIIlIIlllIllIII) : (class_1977)this.IlIIIIIllllllIIlllIllllll.get("en_US");
    }

    public SortedSet lIlllIlllIIIIlIIlllIllIII() {
        return Sets.newTreeSet(this.IlIIIIIllllllIIlllIllllll.values());
    }
}

