package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import net.minecraft.crash.CrashReport;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1105 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private final class_0976 lllIlIIlIIIlIlIIIllIlllIl;
    private Set IlIllllllIIlIIllllIIlIIIl = new HashSet();
    private class_1890 lIlllIlllIIIIlIIlllIllIII = new class_1890();
    private int IlIIIIIllllllIIlllIllllll;

    public class_1105(class_0976 class_09762) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_09762;
        this.IlIIIIIllllllIIlllIllllll = class_09762.llIIlIIllIIllIlIIllIIllII().lIIIllIIIIIllllIlIlIllIll().lIlllIlllIIIIlIIlllIllIII();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212) {
        if (class_15212 instanceof class_1822) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 512, 2);
            class_1822 class_18222 = (class_1822)class_15212;
            for (class_0739 class_07392 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (class_07392.lllIIIllIIIIlllIlIIllIIll == class_18222) continue;
                class_07392.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
            }
        } else if (class_15212 instanceof class_2050) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 5, true);
        } else if (class_15212 instanceof class_0369) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 20, false);
        } else if (class_15212 instanceof class_1332) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, false);
        } else if (class_15212 instanceof class_1937) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, false);
        } else if (class_15212 instanceof class_0333) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, true);
        } else if (class_15212 instanceof class_1918) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, true);
        } else if (class_15212 instanceof class_0093) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 4, true);
        } else if (class_15212 instanceof class_0525) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, true);
        } else if (class_15212 instanceof class_0426) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, true);
        } else if (class_15212 instanceof class_1617) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, true);
        } else if (class_15212 instanceof class_1800) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 10, true);
        } else if (class_15212 instanceof class_1781) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 20, true);
        } else if (class_15212 instanceof class_1860) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 80, 3, true);
        } else if (class_15212 instanceof class_2263) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 80, 3, true);
        } else if (class_15212 instanceof class_0002) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 64, 3, true);
        } else if (class_15212 instanceof class_0590) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 80, 3, false);
        } else if (class_15212 instanceof class_0453) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 80, 3, false);
        } else if (class_15212 instanceof class_1463) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 80, 3, true);
        } else if (class_15212 instanceof class_1221) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 160, 3, true);
        } else if (class_15212 instanceof class_0034) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 160, 10, true);
        } else if (class_15212 instanceof class_0543) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 160, 20, true);
        } else if (class_15212 instanceof class_1309) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 160, Integer.MAX_VALUE, false);
        } else if (class_15212 instanceof class_1138) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 160, 20, true);
        } else if (class_15212 instanceof class_0355) {
            this.lllIIIllIIIIlllIlIIllIIll(class_15212, 256, Integer.MAX_VALUE, false);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll(class_15212, n, n2, false);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, int n, int n2, boolean bl) {
        if (n > this.IlIIIIIllllllIIlllIllllll) {
            n = this.IlIIIIIllllllIIlllIllllll;
        }
        try {
            if (this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl(class_15212.llllllIlIllllIlIlIlIIIIlI())) {
                throw new IllegalStateException("Entity is already tracked!");
            }
            class_0739 class_07392 = new class_0739(class_15212, n, n2, bl);
            this.IlIllllllIIlIIllllIIlIIIl.add(class_07392);
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI(), class_07392);
            class_07392.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll);
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Adding entity to track");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Entity To Track");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Tracking range", n + " blocks");
            class_07992.addCrashSectionCallable("Update statusUpdateInterval", new class_1428(this, n2));
            class_15212.lllIIIllIIIIlllIlIIllIIll(class_07992);
            class_0799 class_07993 = class_02232.lllIIIllIIIIlllIlIIllIIll("Entity That Is Already Tracked");
            ((class_0739)this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll((int)class_15212.llllllIlIllllIlIlIlIIIIlI())).lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07993);
            try {
                throw new class_0892(class_02232);
            }
            catch (class_0892 class_08922) {
                lllIIIllIIIIlllIlIIllIIll.error("\"Silently\" catching entity tracking error.", (Throwable)class_08922);
            }
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212) {
        Object object;
        if (class_15212 instanceof class_1822) {
            object = (class_1822)class_15212;
            for (class_0739 class_07392 : this.IlIllllllIIlIIllllIIlIIIl) {
                class_07392.lllIIIllIIIIlllIlIIllIIll((class_1822)object);
            }
        }
        if ((object = (class_0739)this.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(class_15212.llllllIlIllllIlIlIlIIIIlI())) != null) {
            this.IlIllllllIIlIIllllIIlIIIl.remove(object);
            ((class_0739)object).lllIIIllIIIIlllIlIIllIIll();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ArrayList<class_1822> arrayList = new ArrayList<class_1822>();
        for (class_0739 class_07392 : this.IlIllllllIIlIIllllIIlIIIl) {
            class_07392.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll);
            if (!class_07392.lllIIlIIIllllllIIIIlIlIlI || !(class_07392.lllIIIllIIIIlllIlIIllIIll instanceof class_1822)) continue;
            arrayList.add((class_1822)class_07392.lllIIIllIIIIlllIlIIllIIll);
        }
        for (int i = 0; i < arrayList.size(); ++i) {
            class_1822 class_18222 = (class_1822)arrayList.get(i);
            for (class_0739 class_07393 : this.IlIllllllIIlIIllllIIlIIIl) {
                if (class_07393.lllIIIllIIIIlllIlIIllIIll == class_18222) continue;
                class_07393.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, class_0703 class_07032) {
        class_0739 class_07392 = (class_0739)this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI());
        if (class_07392 != null) {
            class_07392.lllIIIllIIIIlllIlIIllIIll(class_07032);
        }
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, class_0703 class_07032) {
        class_0739 class_07392 = (class_0739)this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_15212.llllllIlIllllIlIlIlIIIIlI());
        if (class_07392 != null) {
            class_07392.lllIlIIlIIIlIlIIIllIlllIl(class_07032);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222) {
        for (class_0739 class_07392 : this.IlIllllllIIlIIllllIIlIIIl) {
            class_07392.IlIllllllIIlIIllllIIlIIIl(class_18222);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1822 class_18222, class_0723 class_07232) {
        for (class_0739 class_07392 : this.IlIllllllIIlIIllllIIlIIIl) {
            if (class_07392.lllIIIllIIIIlllIlIIllIIll == class_18222 || class_07392.lllIIIllIIIIlllIlIIllIIll.lIlIIllIllIIIIIlIllllIIIl != class_07232.IIIllIIlIIIIIIlIlIIllIIlI || class_07392.lllIIIllIIIIlllIlIIllIIll.llIIIlIlIlIIlIllIIIllIlIl != class_07232.IllIIlllllllIIlIIlIIIIlIl) continue;
            class_07392.lllIlIIlIIIlIlIIIllIlllIl(class_18222);
        }
    }
}

