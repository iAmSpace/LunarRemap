package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.atomic.AtomicReference;

class class_2230 {
    private AtomicReference[] lllIIIllIIIIlllIlIIllIIll = new AtomicReference[100];

    public class_2230() {
        for (int i = 0; i < 100; ++i) {
            this.lllIIIllIIIIlllIlIIllIIll[i] = new AtomicReference<class_1386>(new class_1386(0L, 0, 0.0, null));
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, long l) {
        block4: {
            try {
                class_1386 class_13862;
                class_1386 class_13863;
                if (n < 0 || n >= 100) {
                    return;
                }
                while (!this.lllIIIllIIIIlllIlIIllIIll[n].compareAndSet(class_13863 = (class_1386)this.lllIIIllIIIIlllIlIIllIIll[n].get(), class_13862 = class_13863.lllIIIllIIIIlllIlIIllIIll(l))) {
                }
            }
            catch (Exception exception) {
                if (!class_0670.IIIllIllIIlIlIlIlIllllIIl().isDebugEnabled()) break block4;
                class_0670.IIIllIllIIlIlIlIlIllllIIl().debug(class_0670.IllIIIllIIIIlIlIlIllIIlll(), "NetStat failed with packetId: " + n, (Throwable)exception);
            }
        }
    }

    public long lllIIIllIIIIlllIlIIllIIll() {
        long l = 0L;
        for (int i = 0; i < 100; ++i) {
            l += ((class_1386)this.lllIIIllIIIIlllIlIIllIIll[i].get()).lllIIIllIIIIlllIlIIllIIll();
        }
        return l;
    }

    public long lllIlIIlIIIlIlIIIllIlllIl() {
        long l = 0L;
        for (int i = 0; i < 100; ++i) {
            l += (long)((class_1386)this.lllIIIllIIIIlllIlIIllIIll[i].get()).lllIlIIlIIIlIlIIIllIlllIl();
        }
        return l;
    }

    public class_2063 IlIllllllIIlIIllllIIlIIIl() {
        int n = -1;
        class_1386 class_13862 = new class_1386(-1L, -1, 0.0, null);
        for (int i = 0; i < 100; ++i) {
            class_1386 class_13863 = (class_1386)this.lllIIIllIIIIlllIlIIllIIll[i].get();
            if (class_1386.lllIIIllIIIIlllIlIIllIIll(class_13863) <= class_1386.lllIIIllIIIIlllIlIIllIIll(class_13862)) continue;
            n = i;
            class_13862 = class_13863;
        }
        return new class_2063(n, class_13862);
    }

    public class_2063 lIlllIlllIIIIlIIlllIllIII() {
        int n = -1;
        class_1386 class_13862 = new class_1386(-1L, -1, 0.0, null);
        for (int i = 0; i < 100; ++i) {
            class_1386 class_13863 = (class_1386)this.lllIIIllIIIIlllIlIIllIIll[i].get();
            if (class_1386.lllIlIIlIIIlIlIIIllIlllIl(class_13863) <= class_1386.lllIlIIlIIIlIlIIIllIlllIl(class_13862)) continue;
            n = i;
            class_13862 = class_13863;
        }
        return new class_2063(n, class_13862);
    }

    public class_2063 lllIIIllIIIIlllIlIIllIIll(int n) {
        return n >= 0 && n < 100 ? new class_2063(n, (class_1386)this.lllIIIllIIIIlllIlIIllIIll[n].get()) : null;
    }
}

