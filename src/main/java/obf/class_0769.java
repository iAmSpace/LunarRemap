package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import com.google.common.collect.Lists;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import net.minecraft.crash.CrashReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0769
implements class_1848 {
    private static final Logger lllIlIIlIIIlIlIIIllIlllIl = LogManager.getLogger();
    private Set IlIllllllIIlIIllllIIlIIIl = Collections.newSetFromMap(new ConcurrentHashMap());
    private class_0723 lIlllIlllIIIIlIIlllIllIII;
    private class_1848 IlIIIIIllllllIIlllIllllll;
    private class_1831 lIllllIIlIIIlIllllllIIIll;
    public boolean lllIIIllIIIIlllIlIIllIIll = true;
    private class_1562 IIIllIIlIIIIIIlIlIIllIIlI = new class_1562();
    private List IllIIlllllllIIlIIlIIIIlIl = new ArrayList();
    private class_0976 IIIllIllIIlIlIlIlIllllIIl;

    public class_0769(class_0976 class_09762, class_1831 class_18312, class_1848 class_18482) {
        this.lIlllIlllIIIIlIIlllIllIII = new class_1279(class_09762, 0, 0);
        this.IIIllIllIIlIlIlIlIllllIIl = class_09762;
        this.lIllllIIlIIIlIllllllIIIll = class_18312;
        this.IlIIIIIllllllIIlllIllllll = class_18482;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2));
    }

    public List lIllllIIlIIIlIllllllIIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        if (this.IIIllIllIIlIlIlIlIllllIIl.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll()) {
            class_2208 class_22082 = this.IIIllIllIIlIlIlIlIllllIIl.lIlIllIIlIIlIIlIIlIIlIIll();
            int n3 = n * 16 + 8 - class_22082.lllIIIllIIIIlllIlIIllIIll;
            int n4 = n2 * 16 + 8 - class_22082.IlIllllllIIlIIllllIIlIIIl;
            int n5 = 128;
            if (n3 < -n5 || n3 > n5 || n4 < -n5 || n4 > n5) {
                this.IlIllllllIIlIIllllIIlIIIl.add(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2));
            }
        } else {
            this.IlIllllllIIlIIllllIIlIIIl.add(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2));
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        for (class_0723 class_07232 : this.IllIIlllllllIIlIIlIIIIlIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07232.IIIllIIlIIIIIIlIlIIllIIlI, class_07232.IllIIlllllllIIlIIlIIIIlIl);
        }
    }

    @Override
    public class_0723 IlIllllllIIlIIllllIIlIIIl(int n, int n2) {
        long l = class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2);
        this.IlIllllllIIlIIllllIIlIIIl.remove(l);
        class_0723 class_07232 = (class_0723)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(l);
        if (class_07232 == null) {
            class_07232 = this.lIllllIIlIIIlIllllllIIIll(n, n2);
            if (class_07232 == null) {
                if (this.IlIIIIIllllllIIlllIllllll == null) {
                    class_07232 = this.lIlllIlllIIIIlIIlllIllIII;
                } else {
                    try {
                        class_07232 = this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(n, n2);
                    }
                    catch (Throwable throwable) {
                        CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception generating new chunk");
                        class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Chunk to be generated");
                        class_07992.lllIIIllIIIIlllIlIIllIIll("Location", String.format("%d,%d", n, n2));
                        class_07992.lllIIIllIIIIlllIlIIllIIll("Position hash", l);
                        class_07992.lllIIIllIIIIlllIlIIllIIll("Generator", this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
                        throw new class_0892(class_02232);
                    }
                }
            }
            this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(l, class_07232);
            this.IllIIlllllllIIlIIlIIIIlIl.add(class_07232);
            class_07232.IlIIIIIllllllIIlllIllllll();
            class_07232.lllIIIllIIIIlllIlIIllIIll(this, this, n, n2);
        }
        return class_07232;
    }

    @Override
    public class_0723 lIlllIlllIIIIlIIlllIllIII(int n, int n2) {
        class_0723 class_07232 = (class_0723)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2));
        return class_07232 == null ? (!this.IIIllIllIIlIlIlIlIllllIIl.lIlIllIIlIIlIIlIIlIIlIIll && !this.lllIIIllIIIIlllIlIIllIIll ? this.lIlllIlllIIIIlIIlllIllIII : this.IlIllllllIIlIIllllIIlIIIl(n, n2)) : class_07232;
    }

    private class_0723 lIllllIIlIIIlIllllllIIIll(int n, int n2) {
        if (this.lIllllIIlIIIlIllllllIIIll == null) {
            return null;
        }
        try {
            class_0723 class_07232 = this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, n, n2);
            if (class_07232 != null) {
                class_07232.IlIlIIlIlIllIIlIlIIllIIIl = this.IIIllIllIIlIlIlIlIllllIIl.IlIIIlIIIIllIIIllIIIIIIll();
                if (this.IlIIIIIllllllIIlllIllllll != null) {
                    this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll(n, n2);
                }
            }
            return class_07232;
        }
        catch (Exception exception) {
            lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't load chunk", (Throwable)exception);
            return null;
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_0723 class_07232) {
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            try {
                this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IIIllIllIIlIlIlIlIllllIIl, class_07232);
            }
            catch (Exception exception) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't save entities", (Throwable)exception);
            }
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_0723 class_07232) {
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            try {
                class_07232.IlIlIIlIlIllIIlIlIIllIIIl = this.IIIllIllIIlIlIlIlIllllIIl.IlIIIlIIIIllIIIllIIIIIIll();
                this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl, class_07232);
            }
            catch (IOException iOException) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't save chunk", (Throwable)iOException);
            }
            catch (class_1038 class_10382) {
                lllIlIIlIIIlIlIIIllIlllIl.error("Couldn't save chunk; already in use by another instance of Minecraft?", (Throwable)class_10382);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1848 class_18482, int n, int n2) {
        class_0723 class_07232 = this.lIlllIlllIIIIlIIlllIllIII(n, n2);
        if (!class_07232.lIIIIlIlIIlllllIIllIIlIII) {
            class_07232.lllIIlIIIllllllIIIIlIlIlI();
            if (this.IlIIIIIllllllIIlllIllllll != null) {
                this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_18482, n, n2);
                class_07232.IIIllIIlIIIIIIlIlIIllIIlI();
            }
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(boolean bl, class_1832 class_18322) {
        int n = 0;
        ArrayList arrayList = Lists.newArrayList((Iterable)this.IllIIlllllllIIlIIlIIIIlIl);
        for (int i = 0; i < arrayList.size(); ++i) {
            class_0723 class_07232 = (class_0723)arrayList.get(i);
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_07232);
            }
            if (!class_07232.lllIIIllIIIIlllIlIIllIIll(bl)) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_07232);
            class_07232.lllIIlIIIllllllIIIIlIlIlI = false;
            if (++n != 24 || bl) continue;
            return false;
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll() {
        if (this.lIllllIIlIIIlIllllllIIIll != null) {
            this.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl();
        }
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        if (!this.IIIllIllIIlIlIlIlIllllIIl.llllIIIIlIIIlIIIIIIlIllll) {
            for (int i = 0; i < 100; ++i) {
                if (this.IlIllllllIIlIIllllIIlIIIl.isEmpty()) continue;
                Long l = (Long)this.IlIllllllIIlIIllllIIlIIIl.iterator().next();
                class_0723 class_07232 = (class_0723)this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(l);
                if (class_07232 != null) {
                    class_07232.lIllllIIlIIIlIllllllIIIll();
                    this.lllIlIIlIIIlIlIIIllIlllIl(class_07232);
                    this.lllIIIllIIIIlllIlIIllIIll(class_07232);
                    this.IllIIlllllllIIlIIlIIIIlIl.remove(class_07232);
                }
                this.IlIllllllIIlIIllllIIlIIIl.remove(l);
                this.IIIllIIlIIIIIIlIlIIllIIlI.lIlllIlllIIIIlIIlllIllIII(l);
            }
            if (this.lIllllIIlIIIlIllllllIIIll != null) {
                this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl();
            }
        }
        return this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl();
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl() {
        return !this.IIIllIllIIlIlIlIlIllllIIl.llllIIIIlIIIlIIIIIIlIllll;
    }

    @Override
    public String lIlllIlllIIIIlIIlllIllIII() {
        return "ServerChunkCache: " + this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll() + " Drop: " + this.IlIllllllIIlIIllllIIlIIIl.size();
    }

    @Override
    public List lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122, int n, int n2, int n3) {
        return this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_10122, n, n2, n3);
    }

    @Override
    public class_2137 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, String string, int n, int n2, int n3) {
        return this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_13342, string, n, n2, n3);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll(int n, int n2) {
    }
}

