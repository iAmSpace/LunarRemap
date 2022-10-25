package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.crash.CrashReport;

import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class class_1340
extends class_1000 {
    private class_1693 IlIIIIIllllllIIlllIllllll;
    protected Map lIlllIlllIIIIlIIlllIllIII = new HashMap();

    public abstract String lllIIIllIIIIlllIlIIllIIll();

    @Override
    protected final void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, Block[] arrclass_0549) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342);
        if (!this.lIlllIlllIIIIlIIlllIllIII.containsKey(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2))) {
            this.lllIlIIlIIIlIlIIIllIlllIl.nextInt();
            try {
                if (this.lllIIIllIIIIlllIlIIllIIll(n, n2)) {
                    class_1099 class_10992 = this.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
                    this.lIlllIlllIIIIlIIlllIllIII.put(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2), class_10992);
                    this.lllIIIllIIIIlllIlIIllIIll(n, n2, class_10992);
                }
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Exception preparing structure feature");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Feature being prepared");
                class_07992.addCrashSectionCallable("Is feature chunk", new class_1629(this, n, n2));
                class_07992.lllIIIllIIIIlllIlIIllIIll("Chunk location", String.format("%d,%d", n, n2));
                class_07992.addCrashSectionCallable("Chunk pos hash", new class_0048(this, n, n2));
                class_07992.addCrashSectionCallable("Structure type", new class_1816(this));
                throw new class_0892(class_02232);
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342);
        int n3 = (n << 4) + 8;
        int n4 = (n2 << 4) + 8;
        boolean bl = false;
        for (class_1099 class_10992 : this.lIlllIlllIIIIlIIlllIllIII.values()) {
            if (!class_10992.lllIIIllIIIIlllIlIIllIIll() || !class_10992.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(n3, n4, n3 + 15, n4 + 15)) continue;
            class_10992.lllIIIllIIIIlllIlIIllIIll(class_13342, random, new class_2046(n3, n4, n3 + 15, n4 + 15));
            bl = true;
            this.lllIIIllIIIIlllIlIIllIIll(class_10992.IlIIIIIllllllIIlllIllllll(), class_10992.lIllllIIlIIIlIllllllIIIll(), class_10992);
        }
        return bl;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        return this.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) != null;
    }

    protected class_1099 IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        for (class_1099 class_10992 : this.lIlllIlllIIIIlIIlllIllIII.values()) {
            if (!class_10992.lllIIIllIIIIlllIlIIllIIll() || !class_10992.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(n, n3, n, n3)) continue;
            for (class_1036 class_10362 : class_10992.IlIllllllIIlIIllllIIlIIIl()) {
                if (!class_10362.lllIlIIlIIIlIlIIIllIlllIl().lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) continue;
                return class_10992;
            }
        }
        return null;
    }

    public boolean lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3) {
        class_1099 class_10992;
        this.lllIIIllIIIIlllIlIIllIIll(this.IlIllllllIIlIIllllIIlIIIl);
        Iterator iterator = this.lIlllIlllIIIIlIIlllIllIII.values().iterator();
        do {
            if (iterator.hasNext()) continue;
            return false;
        } while (!(class_10992 = (class_1099)iterator.next()).lllIIIllIIIIlllIlIIllIIll());
        return class_10992.lllIlIIlIIIlIlIIIllIlllIl().lllIIIllIIIIlllIlIIllIIll(n, n3, n, n3);
    }

    public class_2137 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        double d;
        int n4;
        int n5;
        int n6;
        class_2137 class_21372;
        Object object;
        Object object22;
        this.IlIllllllIIlIIllllIIlIIIl = class_13342;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342);
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed(class_13342.lIlIlIIlIIIIlIIIIIlllIIII());
        long l = this.lllIlIIlIIIlIlIIIllIlllIl.nextLong();
        long l2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextLong();
        long l3 = (long)(n >> 4) * l;
        long l4 = (long)(n3 >> 4) * l2;
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed(l3 ^ l4 ^ class_13342.lIlIlIIlIIIIlIIIIIlllIIII());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n >> 4, n3 >> 4, 0, 0, null);
        double d2 = Double.MAX_VALUE;
        class_2137 class_21373 = null;
        for (Object object22 : this.lIlllIlllIIIIlIIlllIllIII.values()) {
            if (!((class_1099)object22).lllIIIllIIIIlllIlIIllIIll()) continue;
            object = (class_1036)((class_1099)object22).IlIllllllIIlIIllllIIlIIIl().get(0);
            class_21372 = ((class_1036)object).lIlllIlllIIIIlIIlllIllIII();
            n6 = class_21372.lllIIIllIIIIlllIlIIllIIll - n;
            n5 = class_21372.lllIlIIlIIIlIlIIIllIlllIl - n2;
            n4 = class_21372.IlIllllllIIlIIllllIIlIIIl - n3;
            d = n6 * n6 + n5 * n5 + n4 * n4;
            if (!(d < d2)) continue;
            d2 = d;
            class_21373 = class_21372;
        }
        if (class_21373 != null) {
            return class_21373;
        }
        object22 = this.lllIlIIlIIIlIlIIIllIlllIl();
        if (object22 != null) {
            object = null;
            Iterator iterator = object22.iterator();
            while (iterator.hasNext()) {
                class_21372 = (class_2137)iterator.next();
                n6 = class_21372.lllIIIllIIIIlllIlIIllIIll - n;
                n5 = class_21372.lllIlIIlIIIlIlIIIllIlllIl - n2;
                n4 = class_21372.IlIllllllIIlIIllllIIlIIIl - n3;
                d = n6 * n6 + n5 * n5 + n4 * n4;
                if (!(d < d2)) continue;
                d2 = d;
                object = class_21372;
            }
            return object;
        }
        return null;
    }

    protected List lllIlIIlIIIlIlIIIllIlllIl() {
        return null;
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        if (this.IlIIIIIllllllIIlllIllllll == null) {
            this.IlIIIIIllllllIIlllIllllll = (class_1693)class_13342.lllIIIllIIIIlllIlIIllIIll(class_1693.class, this.lllIIIllIIIIlllIlIIllIIll());
            if (this.IlIIIIIllllllIIlllIllllll == null) {
                this.IlIIIIIllllllIIlllIllllll = new class_1693(this.lllIIIllIIIIlllIlIIllIIll());
                class_13342.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll(), this.IlIIIIIllllllIIlllIllllll);
            } else {
                class_0775 class_07752 = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll();
                for (String string : class_07752.lIlllIlllIIIIlIIlllIllIII()) {
                    class_0775 class_07753;
                    class_2037 class_20372 = class_07752.lllIIIllIIIIlllIlIIllIIll(string);
                    if (class_20372.lllIIIllIIIIlllIlIIllIIll() != 10 || !(class_07753 = (class_0775)class_20372).IlIllllllIIlIIllllIIlIIIl("ChunkX") || !class_07753.IlIllllllIIlIIllllIIlIIIl("ChunkZ")) continue;
                    int n = class_07753.lIllllIIlIIIlIllllllIIIll("ChunkX");
                    int n2 = class_07753.lIllllIIlIIIlIllllllIIIll("ChunkZ");
                    class_1099 class_10992 = class_1756.lllIIIllIIIIlllIlIIllIIll(class_07753, class_13342);
                    if (class_10992 == null) continue;
                    this.lIlllIlllIIIIlIIlllIllIII.put(class_1108.lllIIIllIIIIlllIlIIllIIll(n, n2), class_10992);
                }
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_1099 class_10992) {
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(class_10992.lllIIIllIIIIlllIlIIllIIll(n, n2), n, n2);
        this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII();
    }

    protected abstract boolean lllIIIllIIIIlllIlIIllIIll(int var1, int var2);

    protected abstract class_1099 lllIlIIlIIIlIlIIIllIlllIl(int var1, int var2);
}

