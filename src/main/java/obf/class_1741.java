package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Arrays;
import java.util.Random;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.atomic.AtomicInteger;

public class class_1741 {
    public static final int[] lllIIIllIIIIlllIlIIllIIll = new int[0];
    private static final int lIlllIlllIIIIlIIlllIllIII = 16;
    private static final int IlIIIIIllllllIIlllIllllll = 8192;
    private static final int lIllllIIlIIIlIllllllIIIll = 128;
    private static final int IIIllIIlIIIIIIlIlIIllIIlI = 16;
    private static final int IllIIlllllllIIlIIlIIIIlIl = 8;
    private static final int IIIllIllIIlIlIlIlIllllIIl = 255;
    private static final int IllIIIllIIIIlIlIlIllIIlll = 4;
    private static final int lIIIIlIlIIlllllIIllIIlIII = 1024;
    private static final int llIIlllIllIllllIIIlIIIIII = 1024;
    protected static final class_0467 lllIlIIlIIIlIlIIIllIlllIl = new class_0467(-1, -1, -1);
    public static final class_0808 IlIllllllIIlIIllllIIlIIIl = new class_0349(null);

    private class_1741() {
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n) {
        if (n > arrn.length) {
            int[] arrn2 = new int[n];
            System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
            return arrn2;
        }
        return arrn;
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2) {
        if (n > arrn.length) {
            int[] arrn2 = new int[n];
            System.arraycopy(arrn, 0, arrn2, 0, n2);
            return arrn2;
        }
        return arrn;
    }

    public static int[] lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int n) {
        if (n > arrn.length) {
            int n2 = (int)Math.max(Math.min(2L * (long)arrn.length, 0x7FFFFFF7L), (long)n);
            int[] arrn2 = new int[n2];
            System.arraycopy(arrn, 0, arrn2, 0, arrn.length);
            return arrn2;
        }
        return arrn;
    }

    public static int[] lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int n, int n2) {
        if (n > arrn.length) {
            int n3 = (int)Math.max(Math.min(2L * (long)arrn.length, 0x7FFFFFF7L), (long)n);
            int[] arrn2 = new int[n3];
            System.arraycopy(arrn, 0, arrn2, 0, n2);
            return arrn2;
        }
        return arrn;
    }

    public static int[] IlIllllllIIlIIllllIIlIIIl(int[] arrn, int n) {
        if (n >= arrn.length) {
            return arrn;
        }
        int[] arrn2 = n == 0 ? lllIIIllIIIIlllIlIIllIIll : new int[n];
        System.arraycopy(arrn, 0, arrn2, 0, n);
        return arrn2;
    }

    public static int[] lIlllIlllIIIIlIIlllIllIII(int[] arrn, int n) {
        if (n == arrn.length) {
            return arrn;
        }
        if (n < arrn.length) {
            return class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, n);
        }
        return class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n);
    }

    public static int[] IlIllllllIIlIIllllIIlIIIl(int[] arrn, int n, int n2) {
        class_1741.IlIIIIIllllllIIlllIllllll(arrn, n, n2);
        int[] arrn2 = n2 == 0 ? lllIIIllIIIIlllIlIIllIIll : new int[n2];
        System.arraycopy(arrn, n, arrn2, 0, n2);
        return arrn2;
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn) {
        return (int[])arrn.clone();
    }

    @Deprecated
    public static void IlIIIIIllllllIIlllIllllll(int[] arrn, int n) {
        int n2 = arrn.length;
        while (n2-- != 0) {
            arrn[n2] = n;
        }
    }

    @Deprecated
    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, int n3) {
        class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, n, n2);
        if (n == 0) {
            while (n2-- != 0) {
                arrn[n2] = n3;
            }
        } else {
            for (int i = n; i < n2; ++i) {
                arrn[i] = n3;
            }
        }
    }

    @Deprecated
    public static boolean lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2) {
        int n = arrn.length;
        if (n != arrn2.length) {
            return false;
        }
        while (n-- != 0) {
            if (arrn[n] == arrn2[n]) continue;
            return false;
        }
        return true;
    }

    public static void lIlllIlllIIIIlIIlllIllIII(int[] arrn, int n, int n2) {
        class_0214.lllIIIllIIIIlllIlIIllIIll(arrn.length, n, n2);
    }

    public static void IlIIIIIllllllIIlllIllllll(int[] arrn, int n, int n2) {
        class_0214.lllIlIIlIIIlIlIIIllIlllIl(arrn.length, n, n2);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int[] arrn2) {
        if (arrn.length != arrn2.length) {
            throw new IllegalArgumentException("Array size mismatch: " + arrn.length + " != " + arrn2.length);
        }
    }

    public static void lIllllIIlIIIlIllllllIIIll(int[] arrn, int n, int n2) {
        int n3 = arrn[n];
        arrn[n] = arrn[n2];
        arrn[n2] = n3;
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n, n2);
            ++n4;
            ++n;
            ++n2;
        }
    }

    private static int IlIllllllIIlIIllllIIlIIIl(int[] arrn, int n, int n2, int n3, class_1796 class_17962) {
        int n4 = class_17962.lllIIIllIIIIlllIlIIllIIll(arrn[n], arrn[n2]);
        int n5 = class_17962.lllIIIllIIIIlllIlIIllIIll(arrn[n], arrn[n3]);
        int n6 = class_17962.lllIIIllIIIIlllIlIIllIIll(arrn[n2], arrn[n3]);
        return n4 < 0 ? (n6 < 0 ? n2 : (n5 < 0 ? n3 : n)) : (n6 > 0 ? n2 : (n5 > 0 ? n3 : n));
    }

    private static void lIlllIlllIIIIlIIlllIllIII(int[] arrn, int n, int n2, class_1796 class_17962) {
        for (int i = n; i < n2 - 1; ++i) {
            int n3;
            int n4 = i;
            for (n3 = i + 1; n3 < n2; ++n3) {
                if (class_17962.lllIIIllIIIIlllIlIIllIIll(arrn[n3], arrn[n4]) >= 0) continue;
                n4 = n3;
            }
            if (n4 == i) continue;
            n3 = arrn[i];
            arrn[i] = arrn[n4];
            arrn[n4] = n3;
        }
    }

    private static void IlIIIIIllllllIIlllIllllll(int[] arrn, int n, int n2, class_1796 class_17962) {
        int n3 = n;
        while (++n3 < n2) {
            int n4 = arrn[n3];
            int n5 = n3;
            int n6 = arrn[n5 - 1];
            while (class_17962.lllIIIllIIIIlllIlIIllIIll(n4, n6) < 0) {
                arrn[n5] = n6;
                if (n == n5 - 1) {
                    --n5;
                    break;
                }
                n6 = arrn[--n5 - 1];
            }
            arrn[n5] = n4;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, class_1796 class_17962) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = n2 - n;
        if (n7 < 16) {
            class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, n, n2, class_17962);
            return;
        }
        int n8 = n + n7 / 2;
        int n9 = n;
        int n10 = n2 - 1;
        if (n7 > 128) {
            n6 = n7 / 8;
            n9 = class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, n9, n9 + n6, n9 + 2 * n6, class_17962);
            n8 = class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, n8 - n6, n8, n8 + n6, class_17962);
            n10 = class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, n10 - 2 * n6, n10 - n6, n10, class_17962);
        }
        n8 = class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, n9, n8, n10, class_17962);
        n6 = arrn[n8];
        int n11 = n5 = n;
        int n12 = n4 = n2 - 1;
        while (true) {
            if (n11 <= n4 && (n3 = class_17962.lllIIIllIIIIlllIlIIllIIll(arrn[n11], n6)) <= 0) {
                if (n3 == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n5++, n11);
                }
                ++n11;
                continue;
            }
            while (n4 >= n11 && (n3 = class_17962.lllIIIllIIIIlllIlIIllIIll(arrn[n4], n6)) >= 0) {
                if (n3 == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n4, n12--);
                }
                --n4;
            }
            if (n11 > n4) break;
            class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n11++, n4--);
        }
        n3 = Math.min(n5 - n, n11 - n5);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n, n11 - n3, n3);
        n3 = Math.min(n12 - n4, n2 - n12 - 1);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n11, n2 - n3, n3);
        n3 = n11 - n5;
        if (n3 > 1) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n, n + n3, class_17962);
        }
        if ((n3 = n12 - n4) > 1) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n2 - n3, n2, class_17962);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, class_1796 class_17962) {
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, 0, arrn.length, class_17962);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int n, int n2, class_1796 class_17962) {
        if (n2 - n < 8192) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n, n2, class_17962);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new class_2004(arrn, n, n2, class_17962));
            forkJoinPool.shutdown();
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, class_1796 class_17962) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, 0, arrn.length, class_17962);
    }

    private static int IlIIIIIllllllIIlllIllllll(int[] arrn, int n, int n2, int n3) {
        int n4 = Integer.compare(arrn[n], arrn[n2]);
        int n5 = Integer.compare(arrn[n], arrn[n3]);
        int n6 = Integer.compare(arrn[n2], arrn[n3]);
        return n4 < 0 ? (n6 < 0 ? n2 : (n5 < 0 ? n3 : n)) : (n6 > 0 ? n2 : (n5 > 0 ? n3 : n));
    }

    private static void llIIllIllIlIIlIIllIllllll(int[] arrn, int n, int n2) {
        for (int i = n; i < n2 - 1; ++i) {
            int n3;
            int n4 = i;
            for (n3 = i + 1; n3 < n2; ++n3) {
                if (arrn[n3] >= arrn[n4]) continue;
                n4 = n3;
            }
            if (n4 == i) continue;
            n3 = arrn[i];
            arrn[i] = arrn[n4];
            arrn[n4] = n3;
        }
    }

    private static void lllIIlIIIllllllIIIIlIlIlI(int[] arrn, int n, int n2) {
        int n3 = n;
        while (++n3 < n2) {
            int n4 = arrn[n3];
            int n5 = n3;
            int n6 = arrn[n5 - 1];
            while (n4 < n6) {
                arrn[n5] = n6;
                if (n == n5 - 1) {
                    --n5;
                    break;
                }
                n6 = arrn[--n5 - 1];
            }
            arrn[n5] = n4;
        }
    }

    public static void IIIllIIlIIIIIIlIlIIllIIlI(int[] arrn, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = n2 - n;
        if (n7 < 16) {
            class_1741.llIIllIllIlIIlIIllIllllll(arrn, n, n2);
            return;
        }
        int n8 = n + n7 / 2;
        int n9 = n;
        int n10 = n2 - 1;
        if (n7 > 128) {
            n6 = n7 / 8;
            n9 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, n9, n9 + n6, n9 + 2 * n6);
            n8 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, n8 - n6, n8, n8 + n6);
            n10 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, n10 - 2 * n6, n10 - n6, n10);
        }
        n8 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, n9, n8, n10);
        n6 = arrn[n8];
        int n11 = n5 = n;
        int n12 = n4 = n2 - 1;
        while (true) {
            if (n11 <= n4 && (n3 = Integer.compare(arrn[n11], n6)) <= 0) {
                if (n3 == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n5++, n11);
                }
                ++n11;
                continue;
            }
            while (n4 >= n11 && (n3 = Integer.compare(arrn[n4], n6)) >= 0) {
                if (n3 == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n4, n12--);
                }
                --n4;
            }
            if (n11 > n4) break;
            class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n11++, n4--);
        }
        n3 = Math.min(n5 - n, n11 - n5);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n, n11 - n3, n3);
        n3 = Math.min(n12 - n4, n2 - n12 - 1);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n11, n2 - n3, n3);
        n3 = n11 - n5;
        if (n3 > 1) {
            class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, n, n + n3);
        }
        if ((n3 = n12 - n4) > 1) {
            class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, n2 - n3, n2);
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn) {
        class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, 0, arrn.length);
    }

    public static void IllIIlllllllIIlIIlIIIIlIl(int[] arrn, int n, int n2) {
        if (n2 - n < 8192) {
            class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, n, n2);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new class_1572(arrn, n, n2));
            forkJoinPool.shutdown();
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int[] arrn) {
        class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, 0, arrn.length);
    }

    private static int lIlllIlllIIIIlIIlllIllIII(int[] arrn, int[] arrn2, int n, int n2, int n3) {
        int n4 = arrn2[arrn[n]];
        int n5 = arrn2[arrn[n2]];
        int n6 = arrn2[arrn[n3]];
        int n7 = Integer.compare(n4, n5);
        int n8 = Integer.compare(n4, n6);
        int n9 = Integer.compare(n5, n6);
        return n7 < 0 ? (n9 < 0 ? n2 : (n8 < 0 ? n3 : n)) : (n9 > 0 ? n2 : (n8 > 0 ? n3 : n));
    }

    private static void IIIllIllIIlIlIlIlIllllIIl(int[] arrn, int[] arrn2, int n, int n2) {
        int n3 = n;
        while (++n3 < n2) {
            int n4 = arrn[n3];
            int n5 = n3;
            int n6 = arrn[n5 - 1];
            while (arrn2[n4] < arrn2[n6]) {
                arrn[n5] = n6;
                if (n == n5 - 1) {
                    --n5;
                    break;
                }
                n6 = arrn[--n5 - 1];
            }
            arrn[n5] = n4;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = n2 - n;
        if (n7 < 16) {
            class_1741.IIIllIllIIlIlIlIlIllllIIl(arrn, arrn2, n, n2);
            return;
        }
        int n8 = n + n7 / 2;
        int n9 = n;
        int n10 = n2 - 1;
        if (n7 > 128) {
            n6 = n7 / 8;
            n9 = class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n9, n9 + n6, n9 + 2 * n6);
            n8 = class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n8 - n6, n8, n8 + n6);
            n10 = class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n10 - 2 * n6, n10 - n6, n10);
        }
        n8 = class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n9, n8, n10);
        n6 = arrn2[arrn[n8]];
        int n11 = n5 = n;
        int n12 = n4 = n2 - 1;
        while (true) {
            if (n11 <= n4 && (n3 = Integer.compare(arrn2[arrn[n11]], n6)) <= 0) {
                if (n3 == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n5++, n11);
                }
                ++n11;
                continue;
            }
            while (n4 >= n11 && (n3 = Integer.compare(arrn2[arrn[n4]], n6)) >= 0) {
                if (n3 == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n4, n12--);
                }
                --n4;
            }
            if (n11 > n4) break;
            class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n11++, n4--);
        }
        n3 = Math.min(n5 - n, n11 - n5);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n, n11 - n3, n3);
        n3 = Math.min(n12 - n4, n2 - n12 - 1);
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, n11, n2 - n3, n3);
        n3 = n11 - n5;
        if (n3 > 1) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, n, n + n3);
        }
        if ((n3 = n12 - n4) > 1) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, n2 - n3, n2);
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int[] arrn, int[] arrn2) {
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, 0, arrn2.length);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int[] arrn2, int n, int n2) {
        if (n2 - n < 8192) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, n, n2);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new class_0953(arrn, arrn2, n, n2));
            forkJoinPool.shutdown();
        }
    }

    public static void lIlllIlllIIIIlIIlllIllIII(int[] arrn, int[] arrn2) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, 0, arrn2.length);
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int[] arrn, int[] arrn2, int n, int n2) {
        int n3 = n;
        for (int i = n + 1; i < n2; ++i) {
            if (arrn2[arrn[i]] == arrn2[arrn[n3]]) continue;
            if (i - n3 > 1) {
                class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, n3, i);
            }
            n3 = i;
        }
        if (n2 - n3 > 1) {
            class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, n3, n2);
        }
    }

    public static void IlIIIIIllllllIIlllIllllll(int[] arrn, int[] arrn2) {
        class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, arrn2, 0, arrn.length);
    }

    private static int IlIIIIIllllllIIlllIllllll(int[] arrn, int[] arrn2, int n, int n2, int n3) {
        int n4;
        int n5 = Integer.compare(arrn[n], arrn[n2]);
        int n6 = n5 == 0 ? Integer.compare(arrn2[n], arrn2[n2]) : n5;
        n5 = Integer.compare(arrn[n], arrn[n3]);
        int n7 = n5 == 0 ? Integer.compare(arrn2[n], arrn2[n3]) : n5;
        n5 = Integer.compare(arrn[n2], arrn[n3]);
        int n8 = n4 = n5 == 0 ? Integer.compare(arrn2[n2], arrn2[n3]) : n5;
        return n6 < 0 ? (n4 < 0 ? n2 : (n7 < 0 ? n3 : n)) : (n4 > 0 ? n2 : (n7 > 0 ? n3 : n));
    }

    private static void IllIIIllIIIIlIlIlIllIIlll(int[] arrn, int[] arrn2, int n, int n2) {
        int n3 = arrn[n];
        int n4 = arrn2[n];
        arrn[n] = arrn[n2];
        arrn2[n] = arrn2[n2];
        arrn[n2] = n3;
        arrn2[n2] = n4;
    }

    private static void lIllllIIlIIIlIllllllIIIll(int[] arrn, int[] arrn2, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            class_1741.IllIIIllIIIIlIlIlIllIIlll(arrn, arrn2, n, n2);
            ++n4;
            ++n;
            ++n2;
        }
    }

    private static void lIIIIlIlIIlllllIIllIIlIII(int[] arrn, int[] arrn2, int n, int n2) {
        for (int i = n; i < n2 - 1; ++i) {
            int n3;
            int n4 = i;
            for (n3 = i + 1; n3 < n2; ++n3) {
                int n5 = Integer.compare(arrn[n3], arrn[n4]);
                if (n5 >= 0 && (n5 != 0 || arrn2[n3] >= arrn2[n4])) continue;
                n4 = n3;
            }
            if (n4 == i) continue;
            n3 = arrn[i];
            arrn[i] = arrn[n4];
            arrn[n4] = n3;
            n3 = arrn2[i];
            arrn2[i] = arrn2[n4];
            arrn2[n4] = n3;
        }
    }

    public static void lIlllIlllIIIIlIIlllIllIII(int[] arrn, int[] arrn2, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        int n7 = n2 - n;
        if (n7 < 16) {
            class_1741.lIIIIlIlIIlllllIIllIIlIII(arrn, arrn2, n, n2);
            return;
        }
        int n8 = n + n7 / 2;
        int n9 = n;
        int n10 = n2 - 1;
        if (n7 > 128) {
            n6 = n7 / 8;
            n9 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, arrn2, n9, n9 + n6, n9 + 2 * n6);
            n8 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, arrn2, n8 - n6, n8, n8 + n6);
            n10 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, arrn2, n10 - 2 * n6, n10 - n6, n10);
        }
        n8 = class_1741.IlIIIIIllllllIIlllIllllll(arrn, arrn2, n9, n8, n10);
        n6 = arrn[n8];
        int n11 = arrn2[n8];
        int n12 = n5 = n;
        int n13 = n4 = n2 - 1;
        while (true) {
            int n14;
            if (n12 <= n4 && (n3 = (n14 = Integer.compare(arrn[n12], n6)) == 0 ? Integer.compare(arrn2[n12], n11) : n14) <= 0) {
                if (n3 == 0) {
                    class_1741.IllIIIllIIIIlIlIlIllIIlll(arrn, arrn2, n5++, n12);
                }
                ++n12;
                continue;
            }
            while (n4 >= n12 && (n3 = (n14 = Integer.compare(arrn[n4], n6)) == 0 ? Integer.compare(arrn2[n4], n11) : n14) >= 0) {
                if (n3 == 0) {
                    class_1741.IllIIIllIIIIlIlIlIllIIlll(arrn, arrn2, n4, n13--);
                }
                --n4;
            }
            if (n12 > n4) break;
            class_1741.IllIIIllIIIIlIlIlIllIIlll(arrn, arrn2, n12++, n4--);
        }
        n3 = Math.min(n5 - n, n12 - n5);
        class_1741.lIllllIIlIIIlIllllllIIIll(arrn, arrn2, n, n12 - n3, n3);
        n3 = Math.min(n13 - n4, n2 - n13 - 1);
        class_1741.lIllllIIlIIIlIllllllIIIll(arrn, arrn2, n12, n2 - n3, n3);
        n3 = n12 - n5;
        if (n3 > 1) {
            class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n, n + n3);
        }
        if ((n3 = n13 - n4) > 1) {
            class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n2 - n3, n2);
        }
    }

    public static void lIllllIIlIIIlIllllllIIIll(int[] arrn, int[] arrn2) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2);
        class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, 0, arrn.length);
    }

    public static void IlIIIIIllllllIIlllIllllll(int[] arrn, int[] arrn2, int n, int n2) {
        if (n2 - n < 8192) {
            class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n, n2);
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        forkJoinPool.invoke(new class_1659(arrn, arrn2, n, n2));
        forkJoinPool.shutdown();
    }

    public static void IIIllIIlIIIIIIlIlIIllIIlI(int[] arrn, int[] arrn2) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2);
        class_1741.IlIIIIIllllllIIlllIllllll(arrn, arrn2, 0, arrn.length);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, int[] arrn2) {
        int n3 = n2 - n;
        if (n3 < 16) {
            class_1741.lllIIlIIIllllllIIIIlIlIlI(arrn, n, n2);
            return;
        }
        int n4 = n + n2 >>> 1;
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn2, n, n4, arrn);
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn2, n4, n2, arrn);
        if (arrn2[n4 - 1] <= arrn2[n4]) {
            System.arraycopy(arrn2, n, arrn, n, n3);
            return;
        }
        int n5 = n;
        int n6 = n4;
        for (int i = n; i < n2; ++i) {
            arrn[i] = n6 >= n2 || n5 < n4 && arrn2[n5] <= arrn2[n6] ? arrn2[n5++] : arrn2[n6++];
        }
    }

    public static void IIIllIllIIlIlIlIlIllllIIl(int[] arrn, int n, int n2) {
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n, n2, (int[])arrn.clone());
    }

    public static void lIlllIlllIIIIlIIlllIllIII(int[] arrn) {
        class_1741.IIIllIllIIlIlIlIlIllllIIl(arrn, 0, arrn.length);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, class_1796 class_17962, int[] arrn2) {
        int n3 = n2 - n;
        if (n3 < 16) {
            class_1741.IlIIIIIllllllIIlllIllllll(arrn, n, n2, class_17962);
            return;
        }
        int n4 = n + n2 >>> 1;
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn2, n, n4, class_17962, arrn);
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn2, n4, n2, class_17962, arrn);
        if (class_17962.lllIIIllIIIIlllIlIIllIIll(arrn2[n4 - 1], arrn2[n4]) <= 0) {
            System.arraycopy(arrn2, n, arrn, n, n3);
            return;
        }
        int n5 = n;
        int n6 = n4;
        for (int i = n; i < n2; ++i) {
            arrn[i] = n6 >= n2 || n5 < n4 && class_17962.lllIIIllIIIIlllIlIIllIIll(arrn2[n5], arrn2[n6]) <= 0 ? arrn2[n5++] : arrn2[n6++];
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int[] arrn, int n, int n2, class_1796 class_17962) {
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n, n2, class_17962, (int[])arrn.clone());
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int[] arrn, class_1796 class_17962) {
        class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, 0, arrn.length, class_17962);
    }

    public static int IlIllllllIIlIIllllIIlIIIl(int[] arrn, int n, int n2, int n3) {
        --n2;
        while (n <= n2) {
            int n4 = n + n2 >>> 1;
            int n5 = arrn[n4];
            if (n5 < n3) {
                n = n4 + 1;
                continue;
            }
            if (n5 > n3) {
                n2 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n + 1);
    }

    public static int lIllllIIlIIIlIllllllIIIll(int[] arrn, int n) {
        return class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, 0, arrn.length, n);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, int n3, class_1796 class_17962) {
        --n2;
        while (n <= n2) {
            int n4 = n + n2 >>> 1;
            int n5 = arrn[n4];
            int n6 = class_17962.lllIIIllIIIIlllIlIIllIIll(n5, n3);
            if (n6 < 0) {
                n = n4 + 1;
                continue;
            }
            if (n6 > 0) {
                n2 = n4 - 1;
                continue;
            }
            return n4;
        }
        return -(n + 1);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, class_1796 class_17962) {
        return class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, 0, arrn.length, n, class_17962);
    }

    public static void IlIIIIIllllllIIlllIllllll(int[] arrn) {
        class_1741.IllIIIllIIIIlIlIlIllIIlll(arrn, 0, arrn.length);
    }

    public static void IllIIIllIIIIlIlIlIllIIlll(int[] arrn, int n, int n2) {
        if (n2 - n < 1024) {
            class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, n, n2);
            return;
        }
        int n3 = 3;
        int n4 = 766;
        int n5 = 0;
        int[] arrn2 = new int[766];
        int[] arrn3 = new int[766];
        int[] arrn4 = new int[766];
        arrn2[n5] = n;
        arrn3[n5] = n2 - n;
        arrn4[n5++] = 0;
        int[] arrn5 = new int[256];
        int[] arrn6 = new int[256];
        while (n5 > 0) {
            int n6;
            int n7 = arrn2[--n5];
            int n8 = arrn3[n5];
            int n9 = arrn4[n5];
            int n10 = n9 % 4 == 0 ? 128 : 0;
            int n11 = (3 - n9 % 4) * 8;
            int n12 = n7 + n8;
            while (n12-- != n7) {
                int n13 = arrn[n12] >>> n11 & 0xFF ^ n10;
                arrn5[n13] = arrn5[n13] + 1;
            }
            n12 = -1;
            int n14 = n7;
            for (n6 = 0; n6 < 256; ++n6) {
                if (arrn5[n6] != 0) {
                    n12 = n6;
                }
                arrn6[n6] = n14 += arrn5[n6];
            }
            n6 = n7 + n8 - arrn5[n12];
            int n15 = -1;
            for (n14 = n7; n14 <= n6; n14 += arrn5[n15]) {
                int n16 = arrn[n14];
                n15 = n16 >>> n11 & 0xFF ^ n10;
                if (n14 < n6) {
                    while (true) {
                        int n17 = n15;
                        int n18 = arrn6[n17] - 1;
                        arrn6[n17] = n18;
                        int n19 = n18;
                        if (n18 <= n14) break;
                        int n20 = n16;
                        n16 = arrn[n19];
                        arrn[n19] = n20;
                        n15 = n16 >>> n11 & 0xFF ^ n10;
                    }
                    arrn[n14] = n16;
                }
                if (n9 < 3 && arrn5[n15] > 1) {
                    if (arrn5[n15] < 1024) {
                        class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, n14, n14 + arrn5[n15]);
                    } else {
                        arrn2[n5] = n14;
                        arrn3[n5] = arrn5[n15];
                        arrn4[n5++] = n9 + 1;
                    }
                }
                arrn5[n15] = 0;
            }
        }
    }

    public static void lIIIIlIlIIlllllIIllIIlIII(int[] arrn, int n, int n2) {
        if (n2 - n < 1024) {
            class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, n, n2);
            return;
        }
        int n3 = 3;
        LinkedBlockingQueue<class_0467> linkedBlockingQueue = new LinkedBlockingQueue<class_0467>();
        linkedBlockingQueue.add(new class_0467(n, n2 - n, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n4 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n4, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int n5 = n4;
        while (n5-- != 0) {
            executorCompletionService.submit(new class_2029(atomicInteger, n4, linkedBlockingQueue, arrn));
        }
        Throwable throwable = null;
        int n6 = n4;
        while (n6-- != 0) {
            try {
                executorCompletionService.take().get();
            }
            catch (Exception exception) {
                throwable = exception.getCause();
            }
        }
        executorService.shutdown();
        if (throwable != null) {
            throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
        }
    }

    public static void lIllllIIlIIIlIllllllIIIll(int[] arrn) {
        class_1741.lIIIIlIlIIlllllIIllIIlIII(arrn, 0, arrn.length);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, boolean bl) {
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, 0, arrn.length, bl);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int n, int n2, boolean bl) {
        int[] arrn3;
        if (n2 - n < 1024) {
            class_1741.IIIllIllIIlIlIlIlIllllIIl(arrn, arrn2, n, n2);
            return;
        }
        int n3 = 3;
        int n4 = 766;
        int n5 = 0;
        int[] arrn4 = new int[766];
        int[] arrn5 = new int[766];
        int[] arrn6 = new int[766];
        arrn4[n5] = n;
        arrn5[n5] = n2 - n;
        arrn6[n5++] = 0;
        int[] arrn7 = new int[256];
        int[] arrn8 = new int[256];
        int[] arrn9 = arrn3 = bl ? new int[arrn.length] : null;
        while (n5 > 0) {
            int n6;
            int n7;
            int n8 = arrn4[--n5];
            int n9 = arrn5[n5];
            int n10 = arrn6[n5];
            int n11 = n10 % 4 == 0 ? 128 : 0;
            int n12 = (3 - n10 % 4) * 8;
            int n13 = n8 + n9;
            while (n13-- != n8) {
                int n14 = arrn2[arrn[n13]] >>> n12 & 0xFF ^ n11;
                arrn7[n14] = arrn7[n14] + 1;
            }
            n13 = -1;
            int n15 = n7 = bl ? 0 : n8;
            for (n6 = 0; n6 < 256; ++n6) {
                if (arrn7[n6] != 0) {
                    n13 = n6;
                }
                arrn8[n6] = n7 += arrn7[n6];
            }
            if (bl) {
                n6 = n8 + n9;
                while (n6-- != n8) {
                    int n16 = arrn2[arrn[n6]] >>> n12 & 0xFF ^ n11;
                    int n17 = arrn8[n16] - 1;
                    arrn8[n16] = n17;
                    arrn3[n17] = arrn[n6];
                }
                System.arraycopy(arrn3, 0, arrn, n8, n9);
                n7 = n8;
                for (n6 = 0; n6 <= n13; ++n6) {
                    if (n10 < 3 && arrn7[n6] > 1) {
                        if (arrn7[n6] < 1024) {
                            class_1741.IIIllIllIIlIlIlIlIllllIIl(arrn, arrn2, n7, n7 + arrn7[n6]);
                        } else {
                            arrn4[n5] = n7;
                            arrn5[n5] = arrn7[n6];
                            arrn6[n5++] = n10 + 1;
                        }
                    }
                    n7 += arrn7[n6];
                }
                Arrays.fill(arrn7, 0);
                continue;
            }
            n6 = n8 + n9 - arrn7[n13];
            int n18 = -1;
            for (n7 = n8; n7 <= n6; n7 += arrn7[n18]) {
                int n19 = arrn[n7];
                n18 = arrn2[n19] >>> n12 & 0xFF ^ n11;
                if (n7 < n6) {
                    while (true) {
                        int n20 = n18;
                        int n21 = arrn8[n20] - 1;
                        arrn8[n20] = n21;
                        int n22 = n21;
                        if (n21 <= n7) break;
                        int n23 = n19;
                        n19 = arrn[n22];
                        arrn[n22] = n23;
                        n18 = arrn2[n19] >>> n12 & 0xFF ^ n11;
                    }
                    arrn[n7] = n19;
                }
                if (n10 < 3 && arrn7[n18] > 1) {
                    if (arrn7[n18] < 1024) {
                        class_1741.IIIllIllIIlIlIlIlIllllIIl(arrn, arrn2, n7, n7 + arrn7[n18]);
                    } else {
                        arrn4[n5] = n7;
                        arrn5[n5] = arrn7[n18];
                        arrn6[n5++] = n10 + 1;
                    }
                }
                arrn7[n18] = 0;
            }
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int[] arrn2, int n, int n2, boolean bl) {
        if (n2 - n < 1024) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, n, n2, bl);
            return;
        }
        int n3 = 3;
        LinkedBlockingQueue<class_0467> linkedBlockingQueue = new LinkedBlockingQueue<class_0467>();
        linkedBlockingQueue.add(new class_0467(n, n2 - n, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n4 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n4, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int[] arrn3 = bl ? new int[arrn.length] : null;
        int n5 = n4;
        while (n5-- != 0) {
            executorCompletionService.submit(new class_1223(atomicInteger, n4, linkedBlockingQueue, arrn2, arrn, bl, arrn3));
        }
        Throwable throwable = null;
        int n6 = n4;
        while (n6-- != 0) {
            try {
                executorCompletionService.take().get();
            }
            catch (Exception exception) {
                throwable = exception.getCause();
            }
        }
        executorService.shutdown();
        if (throwable != null) {
            throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int[] arrn2, boolean bl) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2, 0, arrn2.length, bl);
    }

    public static void IllIIlllllllIIlIIlIIIIlIl(int[] arrn, int[] arrn2) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2);
        class_1741.lIllllIIlIIIlIllllllIIIll(arrn, arrn2, 0, arrn.length);
    }

    public static void lIllllIIlIIIlIllllllIIIll(int[] arrn, int[] arrn2, int n, int n2) {
        if (n2 - n < 1024) {
            class_1741.lIIIIlIlIIlllllIIllIIlIII(arrn, arrn2, n, n2);
            return;
        }
        int n3 = 2;
        int n4 = 7;
        int n5 = 1786;
        int n6 = 0;
        int[] arrn3 = new int[1786];
        int[] arrn4 = new int[1786];
        int[] arrn5 = new int[1786];
        arrn3[n6] = n;
        arrn4[n6] = n2 - n;
        arrn5[n6++] = 0;
        int[] arrn6 = new int[256];
        int[] arrn7 = new int[256];
        while (n6 > 0) {
            int n7;
            int n8 = arrn3[--n6];
            int n9 = arrn4[n6];
            int n10 = arrn5[n6];
            int n11 = n10 % 4 == 0 ? 128 : 0;
            int[] arrn8 = n10 < 4 ? arrn : arrn2;
            int n12 = (3 - n10 % 4) * 8;
            int n13 = n8 + n9;
            while (n13-- != n8) {
                int n14 = arrn8[n13] >>> n12 & 0xFF ^ n11;
                arrn6[n14] = arrn6[n14] + 1;
            }
            n13 = -1;
            int n15 = n8;
            for (n7 = 0; n7 < 256; ++n7) {
                if (arrn6[n7] != 0) {
                    n13 = n7;
                }
                arrn7[n7] = n15 += arrn6[n7];
            }
            n7 = n8 + n9 - arrn6[n13];
            int n16 = -1;
            for (n15 = n8; n15 <= n7; n15 += arrn6[n16]) {
                int n17 = arrn[n15];
                int n18 = arrn2[n15];
                n16 = arrn8[n15] >>> n12 & 0xFF ^ n11;
                if (n15 < n7) {
                    while (true) {
                        int n19 = n16;
                        int n20 = arrn7[n19] - 1;
                        arrn7[n19] = n20;
                        int n21 = n20;
                        if (n20 <= n15) break;
                        n16 = arrn8[n21] >>> n12 & 0xFF ^ n11;
                        int n22 = n17;
                        n17 = arrn[n21];
                        arrn[n21] = n22;
                        n22 = n18;
                        n18 = arrn2[n21];
                        arrn2[n21] = n22;
                    }
                    arrn[n15] = n17;
                    arrn2[n15] = n18;
                }
                if (n10 < 7 && arrn6[n16] > 1) {
                    if (arrn6[n16] < 1024) {
                        class_1741.lIIIIlIlIIlllllIIllIIlIII(arrn, arrn2, n15, n15 + arrn6[n16]);
                    } else {
                        arrn3[n6] = n15;
                        arrn4[n6] = arrn6[n16];
                        arrn5[n6++] = n10 + 1;
                    }
                }
                arrn6[n16] = 0;
            }
        }
    }

    public static void IIIllIIlIIIIIIlIlIIllIIlI(int[] arrn, int[] arrn2, int n, int n2) {
        if (n2 - n < 1024) {
            class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n, n2);
            return;
        }
        int n3 = 2;
        if (arrn.length != arrn2.length) {
            throw new IllegalArgumentException("Array size mismatch.");
        }
        int n4 = 7;
        LinkedBlockingQueue<class_0467> linkedBlockingQueue = new LinkedBlockingQueue<class_0467>();
        linkedBlockingQueue.add(new class_0467(n, n2 - n, 0));
        AtomicInteger atomicInteger = new AtomicInteger(1);
        int n5 = Runtime.getRuntime().availableProcessors();
        ExecutorService executorService = Executors.newFixedThreadPool(n5, Executors.defaultThreadFactory());
        ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
        int n6 = n5;
        while (n6-- != 0) {
            executorCompletionService.submit(new class_1787(atomicInteger, n5, linkedBlockingQueue, arrn, arrn2));
        }
        Throwable throwable = null;
        int n7 = n5;
        while (n7-- != 0) {
            try {
                executorCompletionService.take().get();
            }
            catch (Exception exception) {
                throwable = exception.getCause();
            }
        }
        executorService.shutdown();
        if (throwable != null) {
            throw throwable instanceof RuntimeException ? (RuntimeException)throwable : new RuntimeException(throwable);
        }
    }

    public static void IIIllIllIIlIlIlIlIllllIIl(int[] arrn, int[] arrn2) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrn2);
        class_1741.IIIllIIlIIIIIIlIlIIllIIlI(arrn, arrn2, 0, arrn.length);
    }

    private static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int[] arrn3, int n, int n2) {
        int n3 = n;
        while (++n3 < n2) {
            int n4 = arrn[n3];
            int n5 = n3;
            int n6 = arrn[n5 - 1];
            while (arrn2[n4] < arrn2[n6] || arrn2[n4] == arrn2[n6] && arrn3[n4] < arrn3[n6]) {
                arrn[n5] = n6;
                if (n == n5 - 1) {
                    --n5;
                    break;
                }
                n6 = arrn[--n5 - 1];
            }
            arrn[n5] = n4;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int[] arrn3, boolean bl) {
        class_1741.lllIlIIlIIIlIlIIIllIlllIl(arrn2, arrn3);
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, arrn3, 0, arrn2.length, bl);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int[] arrn3, int n, int n2, boolean bl) {
        int[] arrn4;
        if (n2 - n < 1024) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, arrn3, n, n2);
            return;
        }
        int n3 = 2;
        int n4 = 7;
        int n5 = 1786;
        int n6 = 0;
        int[] arrn5 = new int[1786];
        int[] arrn6 = new int[1786];
        int[] arrn7 = new int[1786];
        arrn5[n6] = n;
        arrn6[n6] = n2 - n;
        arrn7[n6++] = 0;
        int[] arrn8 = new int[256];
        int[] arrn9 = new int[256];
        int[] arrn10 = arrn4 = bl ? new int[arrn.length] : null;
        while (n6 > 0) {
            int n7;
            int n8;
            int n9 = arrn5[--n6];
            int n10 = arrn6[n6];
            int n11 = arrn7[n6];
            int n12 = n11 % 4 == 0 ? 128 : 0;
            int[] arrn11 = n11 < 4 ? arrn2 : arrn3;
            int n13 = (3 - n11 % 4) * 8;
            int n14 = n9 + n10;
            while (n14-- != n9) {
                int n15 = arrn11[arrn[n14]] >>> n13 & 0xFF ^ n12;
                arrn8[n15] = arrn8[n15] + 1;
            }
            n14 = -1;
            int n16 = n8 = bl ? 0 : n9;
            for (n7 = 0; n7 < 256; ++n7) {
                if (arrn8[n7] != 0) {
                    n14 = n7;
                }
                arrn9[n7] = n8 += arrn8[n7];
            }
            if (bl) {
                n7 = n9 + n10;
                while (n7-- != n9) {
                    int n17 = arrn11[arrn[n7]] >>> n13 & 0xFF ^ n12;
                    int n18 = arrn9[n17] - 1;
                    arrn9[n17] = n18;
                    arrn4[n18] = arrn[n7];
                }
                System.arraycopy(arrn4, 0, arrn, n9, n10);
                n8 = n9;
                for (n7 = 0; n7 < 256; ++n7) {
                    if (n11 < 7 && arrn8[n7] > 1) {
                        if (arrn8[n7] < 1024) {
                            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, arrn3, n8, n8 + arrn8[n7]);
                        } else {
                            arrn5[n6] = n8;
                            arrn6[n6] = arrn8[n7];
                            arrn7[n6++] = n11 + 1;
                        }
                    }
                    n8 += arrn8[n7];
                }
                Arrays.fill(arrn8, 0);
                continue;
            }
            n7 = n9 + n10 - arrn8[n14];
            int n19 = -1;
            for (n8 = n9; n8 <= n7; n8 += arrn8[n19]) {
                int n20 = arrn[n8];
                n19 = arrn11[n20] >>> n13 & 0xFF ^ n12;
                if (n8 < n7) {
                    while (true) {
                        int n21 = n19;
                        int n22 = arrn9[n21] - 1;
                        arrn9[n21] = n22;
                        int n23 = n22;
                        if (n22 <= n8) break;
                        int n24 = n20;
                        n20 = arrn[n23];
                        arrn[n23] = n24;
                        n19 = arrn11[n20] >>> n13 & 0xFF ^ n12;
                    }
                    arrn[n8] = n20;
                }
                if (n11 < 7 && arrn8[n19] > 1) {
                    if (arrn8[n19] < 1024) {
                        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, arrn2, arrn3, n8, n8 + arrn8[n19]);
                    } else {
                        arrn5[n6] = n8;
                        arrn6[n6] = arrn8[n19];
                        arrn7[n6++] = n11 + 1;
                    }
                }
                arrn8[n19] = 0;
            }
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(int[][] arrn, int n, int n2, int n3) {
        int n4 = arrn.length;
        int n5 = n3 / 4;
        for (int i = n; i < n2 - 1; ++i) {
            int n6;
            int n7;
            int n8 = i;
            block1: for (n7 = i + 1; n7 < n2; ++n7) {
                for (n6 = n5; n6 < n4; ++n6) {
                    if (arrn[n6][n7] < arrn[n6][n8]) {
                        n8 = n7;
                        continue block1;
                    }
                    if (arrn[n6][n7] > arrn[n6][n8]) continue block1;
                }
            }
            if (n8 == i) continue;
            n7 = n4;
            while (n7-- != 0) {
                n6 = arrn[n7][i];
                arrn[n7][i] = arrn[n7][n8];
                arrn[n7][n8] = n6;
            }
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[][] arrn) {
        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, 0, arrn[0].length);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[][] arrn, int n, int n2) {
        if (n2 - n < 1024) {
            class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n, n2, 0);
            return;
        }
        int n3 = arrn.length;
        int n4 = 4 * n3 - 1;
        int n5 = n3;
        int n6 = arrn[0].length;
        while (n5-- != 0) {
            if (arrn[n5].length == n6) continue;
            throw new IllegalArgumentException("The array of index " + n5 + " has not the same length of the array of index 0.");
        }
        n5 = 255 * (n3 * 4 - 1) + 1;
        n6 = 0;
        int[] arrn2 = new int[n5];
        int[] arrn3 = new int[n5];
        int[] arrn4 = new int[n5];
        arrn2[n6] = n;
        arrn3[n6] = n2 - n;
        arrn4[n6++] = 0;
        int[] arrn5 = new int[256];
        int[] arrn6 = new int[256];
        int[] arrn7 = new int[n3];
        while (n6 > 0) {
            int n7;
            int n8 = arrn2[--n6];
            int n9 = arrn3[n6];
            int n10 = arrn4[n6];
            int n11 = n10 % 4 == 0 ? 128 : 0;
            int[] arrn8 = arrn[n10 / 4];
            int n12 = (3 - n10 % 4) * 8;
            int n13 = n8 + n9;
            while (n13-- != n8) {
                int n14 = arrn8[n13] >>> n12 & 0xFF ^ n11;
                arrn5[n14] = arrn5[n14] + 1;
            }
            n13 = -1;
            int n15 = n8;
            for (n7 = 0; n7 < 256; ++n7) {
                if (arrn5[n7] != 0) {
                    n13 = n7;
                }
                arrn6[n7] = n15 += arrn5[n7];
            }
            n7 = n8 + n9 - arrn5[n13];
            int n16 = -1;
            for (n15 = n8; n15 <= n7; n15 += arrn5[n16]) {
                int n17 = n3;
                while (n17-- != 0) {
                    arrn7[n17] = arrn[n17][n15];
                }
                n16 = arrn8[n15] >>> n12 & 0xFF ^ n11;
                if (n15 < n7) {
                    block6: while (true) {
                        int n18 = n16;
                        int n19 = arrn6[n18] - 1;
                        arrn6[n18] = n19;
                        int n20 = n19;
                        if (n19 <= n15) break;
                        n16 = arrn8[n20] >>> n12 & 0xFF ^ n11;
                        n17 = n3;
                        while (true) {
                            if (n17-- == 0) continue block6;
                            int n21 = arrn7[n17];
                            arrn7[n17] = arrn[n17][n20];
                            arrn[n17][n20] = n21;
                        }
                        break;
                    }
                    n17 = n3;
                    while (n17-- != 0) {
                        arrn[n17][n15] = arrn7[n17];
                    }
                }
                if (n10 < n4 && arrn5[n16] > 1) {
                    if (arrn5[n16] < 1024) {
                        class_1741.lllIIIllIIIIlllIlIIllIIll(arrn, n15, n15 + arrn5[n16], n10 + 1);
                    } else {
                        arrn2[n6] = n15;
                        arrn3[n6] = arrn5[n16];
                        arrn4[n6++] = n10 + 1;
                    }
                }
                arrn5[n16] = 0;
            }
        }
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn, int n, int n2, Random random) {
        int n3 = n2 - n;
        while (n3-- != 0) {
            int n4 = random.nextInt(n3 + 1);
            int n5 = arrn[n + n3];
            arrn[n + n3] = arrn[n + n4];
            arrn[n + n4] = n5;
        }
        return arrn;
    }

    public static int[] lllIIIllIIIIlllIlIIllIIll(int[] arrn, Random random) {
        int n = arrn.length;
        while (n-- != 0) {
            int n2 = random.nextInt(n + 1);
            int n3 = arrn[n];
            arrn[n] = arrn[n2];
            arrn[n2] = n3;
        }
        return arrn;
    }

    public static int[] IIIllIIlIIIIIIlIlIIllIIlI(int[] arrn) {
        int n = arrn.length;
        int n2 = n / 2;
        while (n2-- != 0) {
            int n3 = arrn[n - n2 - 1];
            arrn[n - n2 - 1] = arrn[n2];
            arrn[n2] = n3;
        }
        return arrn;
    }

    public static int[] llIIlllIllIllllIIIlIIIIII(int[] arrn, int n, int n2) {
        int n3 = n2 - n;
        int n4 = n3 / 2;
        while (n4-- != 0) {
            int n5 = arrn[n + n3 - n4 - 1];
            arrn[n + n3 - n4 - 1] = arrn[n + n4];
            arrn[n + n4] = n5;
        }
        return arrn;
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int n, int n2, int n3, class_1796 class_17962) {
        return class_1741.IlIllllllIIlIIllllIIlIIIl(arrn, n, n2, n3, class_17962);
    }

    static /* synthetic */ int lIlllIlllIIIIlIIlllIllIII(int[] arrn, int n, int n2, int n3) {
        return class_1741.IlIIIIIllllllIIlllIllllll(arrn, n, n2, n3);
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(int[] arrn, int[] arrn2, int n, int n2, int n3) {
        return class_1741.lIlllIlllIIIIlIIlllIllIII(arrn, arrn2, n, n2, n3);
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, int[] arrn2, int n, int n2, int n3) {
        return class_1741.IlIIIIIllllllIIlllIllllll(arrn, arrn2, n, n2, n3);
    }

    static /* synthetic */ void IllIIlllllllIIlIIlIIIIlIl(int[] arrn, int[] arrn2, int n, int n2) {
        class_1741.IllIIIllIIIIlIlIlIllIIlll(arrn, arrn2, n, n2);
    }

    static /* synthetic */ void IlIllllllIIlIIllllIIlIIIl(int[] arrn, int[] arrn2, int n, int n2, int n3) {
        class_1741.lIllllIIlIIIlIllllllIIIll(arrn, arrn2, n, n2, n3);
    }
}

