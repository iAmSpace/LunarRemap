package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

final class class_1223
implements Callable {
    final /* synthetic */ AtomicInteger lllIIIllIIIIlllIlIIllIIll;
    final /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl;
    final /* synthetic */ LinkedBlockingQueue IlIllllllIIlIIllllIIlIIIl;
    final /* synthetic */ int[] lIlllIlllIIIIlIIlllIllIII;
    final /* synthetic */ int[] IlIIIIIllllllIIlllIllllll;
    final /* synthetic */ boolean lIllllIIlIIIlIllllllIIIll;
    final /* synthetic */ int[] IIIllIIlIIIIIIlIlIIllIIlI;

    class_1223(AtomicInteger atomicInteger, int n, LinkedBlockingQueue linkedBlockingQueue, int[] arrn, int[] arrn2, boolean bl, int[] arrn3) {
        this.lllIIIllIIIIlllIlIIllIIll = atomicInteger;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.IlIllllllIIlIIllllIIlIIIl = linkedBlockingQueue;
        this.lIlllIlllIIIIlIIlllIllIII = arrn;
        this.IlIIIIIllllllIIlllIllllll = arrn2;
        this.lIllllIIlIIIlIllllllIIIll = bl;
        this.IIIllIIlIIIIIIlIlIIllIIlI = arrn3;
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
                int n9 = this.lIlllIlllIIIIlIIlllIllIII[this.IlIIIIIllllllIIlllIllllll[n8]] >>> n7 & 0xFF ^ n6;
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
            if (this.lIllllIIlIIIlIllllllIIIll) {
                n = n3 + n4;
                while (n-- != n3) {
                    int n11 = this.lIlllIlllIIIIlIIlllIllIII[this.IlIIIIIllllllIIlllIllllll[n]] >>> n7 & 0xFF ^ n6;
                    int n12 = arrn2[n11] - 1;
                    arrn2[n11] = n12;
                    this.IIIllIIlIIIIIIlIlIIllIIlI[n12] = this.IlIIIIIllllllIIlllIllllll[n];
                }
                System.arraycopy(this.IIIllIIlIIIIIIlIlIIllIIlI, n3, this.IlIIIIIllllllIIlllIllllll, n3, n4);
                n10 = n3;
                for (n = 0; n <= n8; ++n) {
                    if (n5 < 3 && arrn[n] > 1) {
                        if (arrn[n] < 1024) {
                            class_1741.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII, n10, n10 + arrn[n], this.lIllllIIlIIIlIllllllIIIll);
                        } else {
                            this.lllIIIllIIIIlllIlIIllIIll.incrementAndGet();
                            this.IlIllllllIIlIIllllIIlIIIl.add(new class_0467(n10, arrn[n], n5 + 1));
                        }
                    }
                    n10 += arrn[n];
                }
                Arrays.fill(arrn, 0);
            } else {
                n = n3 + n4 - arrn[n8];
                int n13 = -1;
                for (n10 = n3; n10 <= n; n10 += arrn[n13]) {
                    int n14 = this.IlIIIIIllllllIIlllIllllll[n10];
                    n13 = this.lIlllIlllIIIIlIIlllIllIII[n14] >>> n7 & 0xFF ^ n6;
                    if (n10 < n) {
                        while (true) {
                            int n15 = n13;
                            int n16 = arrn2[n15] - 1;
                            arrn2[n15] = n16;
                            int n17 = n16;
                            if (n16 <= n10) break;
                            int n18 = n14;
                            n14 = this.IlIIIIIllllllIIlllIllllll[n17];
                            this.IlIIIIIllllllIIlllIllllll[n17] = n18;
                            n13 = this.lIlllIlllIIIIlIIlllIllIII[n14] >>> n7 & 0xFF ^ n6;
                        }
                        this.IlIIIIIllllllIIlllIllllll[n10] = n14;
                    }
                    if (n5 < 3 && arrn[n13] > 1) {
                        if (arrn[n13] < 1024) {
                            class_1741.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.lIlllIlllIIIIlIIlllIllIII, n10, n10 + arrn[n13], this.lIllllIIlIIIlIllllllIIIll);
                        } else {
                            this.lllIIIllIIIIlllIlIIllIIll.incrementAndGet();
                            this.IlIllllllIIlIIllllIIlIIIl.add(new class_0467(n10, arrn[n13], n5 + 1));
                        }
                    }
                    arrn[n13] = 0;
                }
            }
            this.lllIIIllIIIIlllIlIIllIIll.decrementAndGet();
        }
    }

    public /* synthetic */ Object call() {
        return this.lllIIIllIIIIlllIlIIllIIll();
    }
}

