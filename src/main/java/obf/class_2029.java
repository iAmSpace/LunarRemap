package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class class_2029
implements Callable {
    final /* synthetic */ AtomicInteger lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ LinkedBlockingQueue IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ int[] lIlllIlllIIIIlIIlllIllIII;

    class_2029(AtomicInteger atomicInteger, int n, LinkedBlockingQueue linkedBlockingQueue, int[] arrn) {
        this.lllIIIllIIIIlllIlIIllIIll = atomicInteger;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = linkedBlockingQueue;
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
    }

    public Void lllIIIllIIIIlllIlIIllIIll() {
        int[] arrn = new int[256];
        int[] arrn2 = new int[256];
        while (true) {
            int n;
            class_0467 class_04672;
            if (this.lllIIIllIIIIlllIlIIllIIll.get() == 0) {
                int n2 = this.lllIlIIlIIIlIlIIIllIlllIl;
                while (n2-- != 0) {
                    this.IlIllllllIIlIIllllIIlIIIl.add(class_1741.lllIlIIlIIIlIlIIIllIlllIl);
                }
            }
            if ((class_04672 = (class_0467)this.IlIllllllIIlIIllllIIlIIIl.take()) == class_1741.lllIlIIlIIIlIlIIIllIlllIl) {
                return null;
            }
            int n3 = class_04672.lllIIIllIIIIlllIlIIllIIll;
            int n4 = class_04672.lllIlIIlIIIlIlIIIllIlllIl;
            int n5 = class_04672.IlIllllllIIlIIllllIIlIIIl;
            int n6 = n5 % 4 == 0 ? 128 : 0;
            int n7 = (3 - n5 % 4) * 8;
            int n8 = n3 + n4;
            while (n8-- != n3) {
                int n9 = this.lIlllIlllIIIIlIIlllIllIII[n8] >>> n7 & 0xFF ^ n6;
                arrn[n9] = arrn[n9] + 1;
            }
            n8 = -1;
            int n10 = n3;
            for (n = 0; n < 256; ++n) {
                if (arrn[n] != 0) {
                    n8 = n;
                }
                arrn2[n] = n10 += arrn[n];
            }
            n = n3 + n4 - arrn[n8];
            int n11 = -1;
            for (n10 = n3; n10 <= n; n10 += arrn[n11]) {
                int n12 = this.lIlllIlllIIIIlIIlllIllIII[n10];
                n11 = n12 >>> n7 & 0xFF ^ n6;
                if (n10 < n) {
                    while (true) {
                        int n13 = n11;
                        int n14 = arrn2[n13] - 1;
                        arrn2[n13] = n14;
                        int n15 = n14;
                        if (n14 <= n10) break;
                        int n16 = n12;
                        n12 = this.lIlllIlllIIIIlIIlllIllIII[n15];
                        this.lIlllIlllIIIIlIIlllIllIII[n15] = n16;
                        n11 = n12 >>> n7 & 0xFF ^ n6;
                    }
                    this.lIlllIlllIIIIlIIlllIllIII[n10] = n12;
                }
                if (n5 < 3 && arrn[n11] > 1) {
                    if (arrn[n11] < 1024) {
                        class_1741.IIIllIIlIIIIIIlIlIIllIIlI(this.lIlllIlllIIIIlIIlllIllIII, n10, n10 + arrn[n11]);
                    } else {
                        this.lllIIIllIIIIlllIlIIllIIll.incrementAndGet();
                        this.IlIllllllIIlIIllllIIlIIIl.add(new class_0467(n10, arrn[n11], n5 + 1));
                    }
                }
                arrn[n11] = 0;
            }
            this.lllIIIllIIIIlllIlIIllIIll.decrementAndGet();
        }
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

