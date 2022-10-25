package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import net.minecraft.profiler.Profiler;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_0772 {
    private static final Logger lllIIIllIIIIlllIlIIllIIll = LogManager.getLogger();
    private List lllIlIIlIIIlIlIIIllIlllIl = new ArrayList();
    private List IlIllllllIIlIIllllIIlIIIl = new ArrayList();
    private final Profiler lIlllIlllIIIIlIIlllIllIII;
    private int IlIIIIIllllllIIlllIllllll;
    private int lIllllIIlIIIlIllllllIIIll = 3;

    public class_0772(Profiler class_12422) {
        this.lIlllIlllIIIIlIIlllIllIII = class_12422;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, class_1327 class_13272) {
        this.lllIlIIlIIIlIlIIIllIlllIl.add(new class_0215(this, n, class_13272));
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1327 class_13272) {
        Iterator iterator = this.lllIlIIlIIIlIlIIIllIlllIl.iterator();
        while (iterator.hasNext()) {
            class_0215 class_02152 = (class_0215)iterator.next();
            class_1327 class_13273 = class_02152.lllIIIllIIIIlllIlIIllIIll;
            if (class_13273 != class_13272) continue;
            if (this.IlIllllllIIlIIllllIIlIIIl.contains(class_02152)) {
                class_13273.IlIllllllIIlIIllllIIlIIIl();
                this.IlIllllllIIlIIllllIIlIIIl.remove(class_02152);
            }
            iterator.remove();
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        ArrayList<class_0215> arrayList = new ArrayList<class_0215>();
        if (this.IlIIIIIllllllIIlllIllllll++ % this.lIllllIIlIIIlIllllllIIIll == 0) {
            for (class_0215 class_02152 : this.lllIlIIlIIIlIlIIIllIlllIl) {
                boolean bl = this.IlIllllllIIlIIllllIIlIIIl.contains(class_02152);
                if (bl) {
                    if (this.lllIlIIlIIIlIlIIIllIlllIl(class_02152) && this.lllIIIllIIIIlllIlIIllIIll(class_02152)) continue;
                    class_02152.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl();
                    this.IlIllllllIIlIIllllIIlIIIl.remove(class_02152);
                }
                if (!this.lllIlIIlIIIlIlIIIllIlllIl(class_02152) || !class_02152.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll()) continue;
                arrayList.add(class_02152);
                this.IlIllllllIIlIIllllIIlIIIl.add(class_02152);
            }
        } else {
            Iterator iterator = this.IlIllllllIIlIIllllIIlIIIl.iterator();
            while (iterator.hasNext()) {
                class_0215 class_02152;
                class_02152 = (class_0215)iterator.next();
                if (class_02152.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl()) continue;
                class_02152.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl();
                iterator.remove();
            }
        }
        this.lIlllIlllIIIIlIIlllIllIII.startSection("goalStart");
        for (class_0215 class_02152 : arrayList) {
            this.lIlllIlllIIIIlIIlllIllIII.startSection(class_02152.lllIIIllIIIIlllIlIIllIIll.getClass().getSimpleName());
            class_02152.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll();
            this.lIlllIlllIIIIlIIlllIllIII.endSection();
        }
        this.lIlllIlllIIIIlIIlllIllIII.endSection();
        this.lIlllIlllIIIIlIIlllIllIII.startSection("goalTick");
        for (class_0215 class_02152 : this.IlIllllllIIlIIllllIIlIIIl) {
            class_02152.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
        }
        this.lIlllIlllIIIIlIIlllIllIII.endSection();
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0215 class_02152) {
        this.lIlllIlllIIIIlIIlllIllIII.startSection("canContinue");
        boolean bl = class_02152.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlllIlllIIIIlIIlllIllIII.endSection();
        return bl;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_0215 class_02152) {
        this.lIlllIlllIIIIlIIlllIllIII.startSection("canUse");
        for (class_0215 class_02153 : this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_02153 == class_02152) continue;
            if (class_02152.lllIlIIlIIIlIlIIIllIlllIl >= class_02153.lllIlIIlIIIlIlIIIllIlllIl) {
                if (!this.IlIllllllIIlIIllllIIlIIIl.contains(class_02153) || this.lllIIIllIIIIlllIlIIllIIll(class_02152, class_02153)) continue;
                this.lIlllIlllIIIIlIIlllIllIII.endSection();
                return false;
            }
            if (!this.IlIllllllIIlIIllllIIlIIIl.contains(class_02153) || class_02153.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll()) continue;
            this.lIlllIlllIIIIlIIlllIllIII.endSection();
            return false;
        }
        this.lIlllIlllIIIIlIIlllIllIII.endSection();
        return true;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0215 class_02152, class_0215 class_02153) {
        return (class_02152.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI() & class_02153.lllIIIllIIIIlllIlIIllIIll.IIIllIIlIIIIIIlIlIIllIIlI()) == 0;
    }
}

