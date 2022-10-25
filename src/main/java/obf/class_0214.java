package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.concurrent.ForkJoinPool;

public class class_0214 {
    public static final int lllIIIllIIIIlllIlIIllIIll = 0x7FFFFFF7;
    private static final int lllIlIIlIIIlIlIIIllIlllIl = 16;
    private static final int IlIllllllIIlIIllllIIlIIIl = 16;
    private static final int lIlllIlllIIIIlIIlllIllIII = 8192;
    private static final int IlIIIIIllllllIIlllIllllll = 128;

    private class_0214() {
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        if (n2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Start index (" + n2 + ") is negative");
        }
        if (n2 > n3) {
            throw new IllegalArgumentException("Start index (" + n2 + ") is greater than end index (" + n3 + ")");
        }
        if (n3 > n) {
            throw new ArrayIndexOutOfBoundsException("End index (" + n3 + ") is greater than array length (" + n + ")");
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        if (n2 < 0) {
            throw new ArrayIndexOutOfBoundsException("Offset (" + n2 + ") is negative");
        }
        if (n3 < 0) {
            throw new IllegalArgumentException("Length (" + n3 + ") is negative");
        }
        if (n2 + n3 > n) {
            throw new ArrayIndexOutOfBoundsException("Last index (" + (n2 + n3) + ") is greater than array length (" + n + ")");
        }
    }

    private static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, class_1796 class_17962, class_2039 class_20392) {
        int n4;
        int n5;
        if (n >= n2 || n2 >= n3) {
            return;
        }
        if (n3 - n == 2) {
            if (class_17962.lllIIIllIIIIlllIlIIllIIll(n2, n) < 0) {
                class_20392.lllIIIllIIIIlllIlIIllIIll(n, n2);
            }
            return;
        }
        if (n2 - n > n3 - n2) {
            n5 = n + (n2 - n) / 2;
            n4 = class_0214.lllIlIIlIIIlIlIIIllIlllIl(n2, n3, n5, class_17962);
        } else {
            n4 = n2 + (n3 - n2) / 2;
            n5 = class_0214.IlIllllllIIlIIllllIIlIIIl(n, n2, n4, class_17962);
        }
        int n6 = n5;
        int n7 = n2;
        int n8 = n4;
        if (n7 != n6 && n7 != n8) {
            int n9 = n6;
            int n10 = n7;
            while (n9 < --n10) {
                class_20392.lllIIIllIIIIlllIlIIllIIll(n9++, n10);
            }
            n9 = n7;
            n10 = n8;
            while (n9 < --n10) {
                class_20392.lllIIIllIIIIlllIlIIllIIll(n9++, n10);
            }
            n9 = n6;
            n10 = n8;
            while (n9 < --n10) {
                class_20392.lllIIIllIIIIlllIlIIllIIll(n9++, n10);
            }
        }
        n2 = n5 + (n4 - n2);
        class_0214.lllIIIllIIIIlllIlIIllIIll(n, n5, n2, class_17962, class_20392);
        class_0214.lllIIIllIIIIlllIlIIllIIll(n2, n4, n3, class_17962, class_20392);
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, class_1796 class_17962) {
        int n4 = n2 - n;
        while (n4 > 0) {
            int n5 = n4 / 2;
            int n6 = n + n5;
            if (class_17962.lllIIIllIIIIlllIlIIllIIll(n6, n3) < 0) {
                n = n6 + 1;
                n4 -= n5 + 1;
                continue;
            }
            n4 = n5;
        }
        return n;
    }

    private static int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3, class_1796 class_17962) {
        int n4 = n2 - n;
        while (n4 > 0) {
            int n5 = n4 / 2;
            int n6 = n + n5;
            if (class_17962.lllIIIllIIIIlllIlIIllIIll(n3, n6) < 0) {
                n4 = n5;
                continue;
            }
            n = n6 + 1;
            n4 -= n5 + 1;
        }
        return n;
    }

    private static int lIlllIlllIIIIlIIlllIllIII(int n, int n2, int n3, class_1796 class_17962) {
        int n4 = class_17962.lllIIIllIIIIlllIlIIllIIll(n, n2);
        int n5 = class_17962.lllIIIllIIIIlllIlIIllIIll(n, n3);
        int n6 = class_17962.lllIIIllIIIIlllIlIIllIIll(n2, n3);
        return n4 < 0 ? (n6 < 0 ? n2 : (n5 < 0 ? n3 : n)) : (n6 > 0 ? n2 : (n5 > 0 ? n3 : n));
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int n, int n2, class_1796 class_17962, class_2039 class_20392) {
        int n3 = n2 - n;
        if (n3 < 16) {
            for (int i = n; i < n2; ++i) {
                for (int j = i; j > n && class_17962.lllIIIllIIIIlllIlIIllIIll(j - 1, j) > 0; --j) {
                    class_20392.lllIIIllIIIIlllIlIIllIIll(j, j - 1);
                }
            }
            return;
        }
        int n4 = n + n2 >>> 1;
        class_0214.lllIIIllIIIIlllIlIIllIIll(n, n4, class_17962, class_20392);
        class_0214.lllIIIllIIIIlllIlIIllIIll(n4, n2, class_17962, class_20392);
        if (class_17962.lllIIIllIIIIlllIlIIllIIll(n4 - 1, n4) <= 0) {
            return;
        }
        class_0214.lllIIIllIIIIlllIlIIllIIll(n, n4, n2, class_17962, class_20392);
    }

    protected static void lllIIIllIIIIlllIlIIllIIll(class_2039 class_20392, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            class_20392.lllIIIllIIIIlllIlIIllIIll(n, n2);
            ++n4;
            ++n;
            ++n2;
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, class_1796 class_17962, class_2039 class_20392) {
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        forkJoinPool.invoke(new class_2169(n, n2, class_17962, class_20392));
        forkJoinPool.shutdown();
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int n, int n2, class_1796 class_17962, class_2039 class_20392) {
        int n3;
        int n4;
        int n5;
        int n6 = n2 - n;
        if (n6 < 16) {
            for (int i = n; i < n2; ++i) {
                for (int j = i; j > n && class_17962.lllIIIllIIIIlllIlIIllIIll(j - 1, j) > 0; --j) {
                    class_20392.lllIIIllIIIIlllIlIIllIIll(j, j - 1);
                }
            }
            return;
        }
        int n7 = n + n6 / 2;
        int n8 = n;
        int n9 = n2 - 1;
        if (n6 > 128) {
            n5 = n6 / 8;
            n8 = class_0214.lIlllIlllIIIIlIIlllIllIII(n8, n8 + n5, n8 + 2 * n5, class_17962);
            n7 = class_0214.lIlllIlllIIIIlIIlllIllIII(n7 - n5, n7, n7 + n5, class_17962);
            n9 = class_0214.lIlllIlllIIIIlIIlllIllIII(n9 - 2 * n5, n9 - n5, n9, class_17962);
        }
        n7 = class_0214.lIlllIlllIIIIlIIlllIllIII(n8, n7, n9, class_17962);
        int n10 = n5 = n;
        int n11 = n4 = n2 - 1;
        while (true) {
            if (n10 <= n4 && (n3 = class_17962.lllIIIllIIIIlllIlIIllIIll(n10, n7)) <= 0) {
                if (n3 == 0) {
                    if (n5 == n7) {
                        n7 = n10;
                    } else if (n10 == n7) {
                        n7 = n5;
                    }
                    class_20392.lllIIIllIIIIlllIlIIllIIll(n5++, n10);
                }
                ++n10;
                continue;
            }
            while (n4 >= n10 && (n3 = class_17962.lllIIIllIIIIlllIlIIllIIll(n4, n7)) >= 0) {
                if (n3 == 0) {
                    if (n4 == n7) {
                        n7 = n11;
                    } else if (n11 == n7) {
                        n7 = n4;
                    }
                    class_20392.lllIIIllIIIIlllIlIIllIIll(n4, n11--);
                }
                --n4;
            }
            if (n10 > n4) break;
            if (n10 == n7) {
                n7 = n11;
            } else if (n4 == n7) {
                n7 = n4;
            }
            class_20392.lllIIIllIIIIlllIlIIllIIll(n10++, n4--);
        }
        n3 = Math.min(n5 - n, n10 - n5);
        class_0214.lllIIIllIIIIlllIlIIllIIll(class_20392, n, n10 - n3, n3);
        n3 = Math.min(n11 - n4, n2 - n11 - 1);
        class_0214.lllIIIllIIIIlllIlIIllIIll(class_20392, n10, n2 - n3, n3);
        n3 = n10 - n5;
        if (n3 > 1) {
            class_0214.IlIllllllIIlIIllllIIlIIIl(n, n + n3, class_17962, class_20392);
        }
        if ((n3 = n11 - n4) > 1) {
            class_0214.IlIllllllIIlIIllllIIlIIIl(n2 - n3, n2, class_17962, class_20392);
        }
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, class_1796 class_17962) {
        return class_0214.lIlllIlllIIIIlIIlllIllIII(n, n2, n3, class_17962);
    }
}

