package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.lang.reflect.Array;
import java.util.Comparator;
import java.util.Random;
import java.util.concurrent.ForkJoinPool;

public class class_0385 {
    public static final Object[] lllIIIllIIIIlllIlIIllIIll = new Object[0];
    private static final int IlIllllllIIlIIllllIIlIIIl = 16;
    private static final int lIlllIlllIIIIlIIlllIllIII = 8192;
    private static final int IlIIIIIllllllIIlllIllllll = 128;
    private static final int lIllllIIlIIIlIllllllIIIll = 16;
    public static final class_0808 lllIlIIlIIIlIlIIIllIlllIl = new class_1955(null);

    private class_0385() {
    }

    private static Object[] IlIIIIIllllllIIlllIllllll(Object[] arrobject, int n) {
        Class<?> class_ = arrobject.getClass();
        if (class_ == Object[].class) {
            return n == 0 ? lllIIIllIIIIlllIlIIllIIll : new Object[n];
        }
        return (Object[])Array.newInstance(class_.getComponentType(), n);
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n) {
        if (n > arrobject.length) {
            Object[] arrobject2 = class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n);
            System.arraycopy(arrobject, 0, arrobject2, 0, arrobject.length);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2) {
        if (n > arrobject.length) {
            Object[] arrobject2 = class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n);
            System.arraycopy(arrobject, 0, arrobject2, 0, n2);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, int n) {
        if (n > arrobject.length) {
            int n2 = (int)Math.max(Math.min(2L * (long)arrobject.length, 0x7FFFFFF7L), (long)n);
            Object[] arrobject2 = class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n2);
            System.arraycopy(arrobject, 0, arrobject2, 0, arrobject.length);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, int n, int n2) {
        if (n > arrobject.length) {
            int n3 = (int)Math.max(Math.min(2L * (long)arrobject.length, 0x7FFFFFF7L), (long)n);
            Object[] arrobject2 = class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n3);
            System.arraycopy(arrobject, 0, arrobject2, 0, n2);
            return arrobject2;
        }
        return arrobject;
    }

    public static Object[] IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, int n) {
        if (n >= arrobject.length) {
            return arrobject;
        }
        Object[] arrobject2 = class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n);
        System.arraycopy(arrobject, 0, arrobject2, 0, n);
        return arrobject2;
    }

    public static Object[] lIlllIlllIIIIlIIlllIllIII(Object[] arrobject, int n) {
        if (n == arrobject.length) {
            return arrobject;
        }
        if (n < arrobject.length) {
            return class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, n);
        }
        return class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n);
    }

    public static Object[] IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, int n, int n2) {
        class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n, n2);
        Object[] arrobject2 = class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n2);
        System.arraycopy(arrobject, n, arrobject2, 0, n2);
        return arrobject2;
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject) {
        return (Object[])arrobject.clone();
    }

    @Deprecated
    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object object) {
        int n = arrobject.length;
        while (n-- != 0) {
            arrobject[n] = object;
        }
    }

    @Deprecated
    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, Object object) {
        class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, n, n2);
        if (n == 0) {
            while (n2-- != 0) {
                arrobject[n2] = object;
            }
        } else {
            for (int i = n; i < n2; ++i) {
                arrobject[i] = object;
            }
        }
    }

    @Deprecated
    public static boolean lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object[] arrobject2) {
        int n = arrobject.length;
        if (n != arrobject2.length) {
            return false;
        }
        while (n-- != 0) {
            if (arrobject[n] != null ? arrobject[n].equals(arrobject2[n]) : arrobject2[n] == null) continue;
            return false;
        }
        return true;
    }

    public static void lIlllIlllIIIIlIIlllIllIII(Object[] arrobject, int n, int n2) {
        class_0214.lllIIIllIIIIlllIlIIllIIll(arrobject.length, n, n2);
    }

    public static void IlIIIIIllllllIIlllIllllll(Object[] arrobject, int n, int n2) {
        class_0214.lllIlIIlIIIlIlIIIllIlllIl(arrobject.length, n, n2);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, Object[] arrobject2) {
        if (arrobject.length != arrobject2.length) {
            throw new IllegalArgumentException("Array size mismatch: " + arrobject.length + " != " + arrobject2.length);
        }
    }

    public static void lIllllIIlIIIlIllllllIIIll(Object[] arrobject, int n, int n2) {
        Object object = arrobject[n];
        arrobject[n] = arrobject[n2];
        arrobject[n2] = object;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            class_0385.lIllllIIlIIIlIllllllIIIll(arrobject, n, n2);
            ++n4;
            ++n;
            ++n2;
        }
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, int n, int n2, int n3, Comparator comparator) {
        int n4 = comparator.compare(arrobject[n], arrobject[n2]);
        int n5 = comparator.compare(arrobject[n], arrobject[n3]);
        int n6 = comparator.compare(arrobject[n2], arrobject[n3]);
        return n4 < 0 ? (n6 < 0 ? n2 : (n5 < 0 ? n3 : n)) : (n6 > 0 ? n2 : (n5 > 0 ? n3 : n));
    }

    private static void lIlllIlllIIIIlIIlllIllIII(Object[] arrobject, int n, int n2, Comparator comparator) {
        for (int i = n; i < n2 - 1; ++i) {
            int n3 = i;
            for (int j = i + 1; j < n2; ++j) {
                if (comparator.compare(arrobject[j], arrobject[n3]) >= 0) continue;
                n3 = j;
            }
            if (n3 == i) continue;
            Object object = arrobject[i];
            arrobject[i] = arrobject[n3];
            arrobject[n3] = object;
        }
    }

    private static void IlIIIIIllllllIIlllIllllll(Object[] arrobject, int n, int n2, Comparator comparator) {
        int n3 = n;
        while (++n3 < n2) {
            Object object = arrobject[n3];
            int n4 = n3;
            Object object2 = arrobject[n4 - 1];
            while (comparator.compare(object, object2) < 0) {
                arrobject[n4] = object2;
                if (n == n4 - 1) {
                    --n4;
                    break;
                }
                object2 = arrobject[--n4 - 1];
            }
            arrobject[n4] = object;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, Comparator comparator) {
        int n3;
        int n4;
        int n5;
        int n6 = n2 - n;
        if (n6 < 16) {
            class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, n, n2, comparator);
            return;
        }
        int n7 = n + n6 / 2;
        int n8 = n;
        int n9 = n2 - 1;
        if (n6 > 128) {
            int n10 = n6 / 8;
            n8 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, n8, n8 + n10, n8 + 2 * n10, comparator);
            n7 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, n7 - n10, n7, n7 + n10, comparator);
            n9 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, n9 - 2 * n10, n9 - n10, n9, comparator);
        }
        n7 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, n8, n7, n9, comparator);
        Object object = arrobject[n7];
        int n11 = n5 = n;
        int n12 = n4 = n2 - 1;
        while (true) {
            if (n11 <= n4 && (n3 = comparator.compare(arrobject[n11], object)) <= 0) {
                if (n3 == 0) {
                    class_0385.lIllllIIlIIIlIllllllIIIll(arrobject, n5++, n11);
                }
                ++n11;
                continue;
            }
            while (n4 >= n11 && (n3 = comparator.compare(arrobject[n4], object)) >= 0) {
                if (n3 == 0) {
                    class_0385.lIllllIIlIIIlIllllllIIIll(arrobject, n4, n12--);
                }
                --n4;
            }
            if (n11 > n4) break;
            class_0385.lIllllIIlIIIlIllllllIIIll(arrobject, n11++, n4--);
        }
        n3 = Math.min(n5 - n, n11 - n5);
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n, n11 - n3, n3);
        n3 = Math.min(n12 - n4, n2 - n12 - 1);
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n11, n2 - n3, n3);
        n3 = n11 - n5;
        if (n3 > 1) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n, n + n3, comparator);
        }
        if ((n3 = n12 - n4) > 1) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n2 - n3, n2, comparator);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Comparator comparator) {
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, 0, arrobject.length, comparator);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, int n, int n2, Comparator comparator) {
        if (n2 - n < 8192) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n, n2, comparator);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new class_1034(arrobject, n, n2, comparator));
            forkJoinPool.shutdown();
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, Comparator comparator) {
        class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, 0, arrobject.length, comparator);
    }

    private static int IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, int n, int n2, int n3) {
        int n4 = ((Comparable)arrobject[n]).compareTo(arrobject[n2]);
        int n5 = ((Comparable)arrobject[n]).compareTo(arrobject[n3]);
        int n6 = ((Comparable)arrobject[n2]).compareTo(arrobject[n3]);
        return n4 < 0 ? (n6 < 0 ? n2 : (n5 < 0 ? n3 : n)) : (n6 > 0 ? n2 : (n5 > 0 ? n3 : n));
    }

    private static void lIIIIlIlIIlllllIIllIIlIII(Object[] arrobject, int n, int n2) {
        for (int i = n; i < n2 - 1; ++i) {
            int n3 = i;
            for (int j = i + 1; j < n2; ++j) {
                if (((Comparable)arrobject[j]).compareTo(arrobject[n3]) >= 0) continue;
                n3 = j;
            }
            if (n3 == i) continue;
            Object object = arrobject[i];
            arrobject[i] = arrobject[n3];
            arrobject[n3] = object;
        }
    }

    private static void llIIlllIllIllllIIIlIIIIII(Object[] arrobject, int n, int n2) {
        int n3 = n;
        while (++n3 < n2) {
            Object object = arrobject[n3];
            int n4 = n3;
            Object object2 = arrobject[n4 - 1];
            while (((Comparable)object).compareTo(object2) < 0) {
                arrobject[n4] = object2;
                if (n == n4 - 1) {
                    --n4;
                    break;
                }
                object2 = arrobject[--n4 - 1];
            }
            arrobject[n4] = object;
        }
    }

    public static void IIIllIIlIIIIIIlIlIIllIIlI(Object[] arrobject, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = n2 - n;
        if (n6 < 16) {
            class_0385.lIIIIlIlIIlllllIIllIIlIII(arrobject, n, n2);
            return;
        }
        int n7 = n + n6 / 2;
        int n8 = n;
        int n9 = n2 - 1;
        if (n6 > 128) {
            int n10 = n6 / 8;
            n8 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, n8, n8 + n10, n8 + 2 * n10);
            n7 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, n7 - n10, n7, n7 + n10);
            n9 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, n9 - 2 * n10, n9 - n10, n9);
        }
        n7 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, n8, n7, n9);
        Object object = arrobject[n7];
        int n11 = n5 = n;
        int n12 = n4 = n2 - 1;
        while (true) {
            if (n11 <= n4 && (n3 = ((Comparable)arrobject[n11]).compareTo(object)) <= 0) {
                if (n3 == 0) {
                    class_0385.lIllllIIlIIIlIllllllIIIll(arrobject, n5++, n11);
                }
                ++n11;
                continue;
            }
            while (n4 >= n11 && (n3 = ((Comparable)arrobject[n4]).compareTo(object)) >= 0) {
                if (n3 == 0) {
                    class_0385.lIllllIIlIIIlIllllllIIIll(arrobject, n4, n12--);
                }
                --n4;
            }
            if (n11 > n4) break;
            class_0385.lIllllIIlIIIlIllllllIIIll(arrobject, n11++, n4--);
        }
        n3 = Math.min(n5 - n, n11 - n5);
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n, n11 - n3, n3);
        n3 = Math.min(n12 - n4, n2 - n12 - 1);
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n11, n2 - n3, n3);
        n3 = n11 - n5;
        if (n3 > 1) {
            class_0385.IIIllIIlIIIIIIlIlIIllIIlI(arrobject, n, n + n3);
        }
        if ((n3 = n12 - n4) > 1) {
            class_0385.IIIllIIlIIIIIIlIlIIllIIlI(arrobject, n2 - n3, n2);
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject) {
        class_0385.IIIllIIlIIIIIIlIlIIllIIlI(arrobject, 0, arrobject.length);
    }

    public static void IllIIlllllllIIlIIlIIIIlIl(Object[] arrobject, int n, int n2) {
        if (n2 - n < 8192) {
            class_0385.IIIllIIlIIIIIIlIlIIllIIlI(arrobject, n, n2);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new class_1920(arrobject, n, n2));
            forkJoinPool.shutdown();
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(Object[] arrobject) {
        class_0385.IllIIlllllllIIlIIlIIIIlIl(arrobject, 0, arrobject.length);
    }

    private static int lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, Object[] arrobject, int n, int n2, int n3) {
        Object object = arrobject[arrn[n]];
        Object object2 = arrobject[arrn[n2]];
        Object object3 = arrobject[arrn[n3]];
        int n4 = ((Comparable)object).compareTo(object2);
        int n5 = ((Comparable)object).compareTo(object3);
        int n6 = ((Comparable)object2).compareTo(object3);
        return n4 < 0 ? (n6 < 0 ? n2 : (n5 < 0 ? n3 : n)) : (n6 > 0 ? n2 : (n5 > 0 ? n3 : n));
    }

    private static void lIlllIlllIIIIlIIlllIllIII(int[] arrn, Object[] arrobject, int n, int n2) {
        int n3 = n;
        while (++n3 < n2) {
            int n4 = arrn[n3];
            int n5 = n3;
            int n6 = arrn[n5 - 1];
            while (((Comparable)arrobject[n4]).compareTo(arrobject[n6]) < 0) {
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

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, Object[] arrobject, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = n2 - n;
        if (n6 < 16) {
            class_0385.lIlllIlllIIIIlIIlllIllIII(arrn, arrobject, n, n2);
            return;
        }
        int n7 = n + n6 / 2;
        int n8 = n;
        int n9 = n2 - 1;
        if (n6 > 128) {
            int n10 = n6 / 8;
            n8 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrobject, n8, n8 + n10, n8 + 2 * n10);
            n7 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrobject, n7 - n10, n7, n7 + n10);
            n9 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrobject, n9 - 2 * n10, n9 - n10, n9);
        }
        n7 = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrobject, n8, n7, n9);
        Object object = arrobject[arrn[n7]];
        int n11 = n5 = n;
        int n12 = n4 = n2 - 1;
        while (true) {
            if (n11 <= n4 && (n3 = ((Comparable)arrobject[arrn[n11]]).compareTo(object)) <= 0) {
                if (n3 == 0) {
                    class_1741.lIllllIIlIIIlIllllllIIIll(arrn, n5++, n11);
                }
                ++n11;
                continue;
            }
            while (n4 >= n11 && (n3 = ((Comparable)arrobject[arrn[n4]]).compareTo(object)) >= 0) {
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
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrn, arrobject, n, n + n3);
        }
        if ((n3 = n12 - n4) > 1) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrn, arrobject, n2 - n3, n2);
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(int[] arrn, Object[] arrobject) {
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrn, arrobject, 0, arrobject.length);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, Object[] arrobject, int n, int n2) {
        if (n2 - n < 8192) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrn, arrobject, n, n2);
        } else {
            ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
            forkJoinPool.invoke(new class_1097(arrn, arrobject, n, n2));
            forkJoinPool.shutdown();
        }
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(int[] arrn, Object[] arrobject) {
        class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrobject, 0, arrobject.length);
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int[] arrn, Object[] arrobject, int n, int n2) {
        int n3 = n;
        for (int i = n + 1; i < n2; ++i) {
            if (arrobject[arrn[i]] == arrobject[arrn[n3]]) continue;
            if (i - n3 > 1) {
                class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, n3, i);
            }
            n3 = i;
        }
        if (n2 - n3 > 1) {
            class_1741.IllIIlllllllIIlIIlIIIIlIl(arrn, n3, n2);
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(int[] arrn, Object[] arrobject) {
        class_0385.IlIllllllIIlIIllllIIlIIIl(arrn, arrobject, 0, arrn.length);
    }

    private static int IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, Object[] arrobject2, int n, int n2, int n3) {
        int n4;
        int n5 = ((Comparable)arrobject[n]).compareTo(arrobject[n2]);
        int n6 = n5 == 0 ? ((Comparable)arrobject2[n]).compareTo(arrobject2[n2]) : n5;
        n5 = ((Comparable)arrobject[n]).compareTo(arrobject[n3]);
        int n7 = n5 == 0 ? ((Comparable)arrobject2[n]).compareTo(arrobject2[n3]) : n5;
        n5 = ((Comparable)arrobject[n2]).compareTo(arrobject[n3]);
        int n8 = n4 = n5 == 0 ? ((Comparable)arrobject2[n2]).compareTo(arrobject2[n3]) : n5;
        return n6 < 0 ? (n4 < 0 ? n2 : (n7 < 0 ? n3 : n)) : (n4 > 0 ? n2 : (n7 > 0 ? n3 : n));
    }

    private static void lIlllIlllIIIIlIIlllIllIII(Object[] arrobject, Object[] arrobject2, int n, int n2) {
        Object object = arrobject[n];
        Object object2 = arrobject2[n];
        arrobject[n] = arrobject[n2];
        arrobject2[n] = arrobject2[n2];
        arrobject[n2] = object;
        arrobject2[n2] = object2;
    }

    private static void lIlllIlllIIIIlIIlllIllIII(Object[] arrobject, Object[] arrobject2, int n, int n2, int n3) {
        int n4 = 0;
        while (n4 < n3) {
            class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n, n2);
            ++n4;
            ++n;
            ++n2;
        }
    }

    private static void IlIIIIIllllllIIlllIllllll(Object[] arrobject, Object[] arrobject2, int n, int n2) {
        for (int i = n; i < n2 - 1; ++i) {
            int n3 = i;
            for (int j = i + 1; j < n2; ++j) {
                int n4 = ((Comparable)arrobject[j]).compareTo(arrobject[n3]);
                if (n4 >= 0 && (n4 != 0 || ((Comparable)arrobject2[j]).compareTo(arrobject2[n3]) >= 0)) continue;
                n3 = j;
            }
            if (n3 == i) continue;
            Object object = arrobject[i];
            arrobject[i] = arrobject[n3];
            arrobject[n3] = object;
            object = arrobject2[i];
            arrobject2[i] = arrobject2[n3];
            arrobject2[n3] = object;
        }
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object[] arrobject2, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6 = n2 - n;
        if (n6 < 16) {
            class_0385.IlIIIIIllllllIIlllIllllll(arrobject, arrobject2, n, n2);
            return;
        }
        int n7 = n + n6 / 2;
        int n8 = n;
        int n9 = n2 - 1;
        if (n6 > 128) {
            int n10 = n6 / 8;
            n8 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n8, n8 + n10, n8 + 2 * n10);
            n7 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n7 - n10, n7, n7 + n10);
            n9 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n9 - 2 * n10, n9 - n10, n9);
        }
        n7 = class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n8, n7, n9);
        Object object = arrobject[n7];
        Object object2 = arrobject2[n7];
        int n11 = n5 = n;
        int n12 = n4 = n2 - 1;
        while (true) {
            int n13;
            if (n11 <= n4 && (n3 = (n13 = ((Comparable)arrobject[n11]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n11]).compareTo(object2) : n13) <= 0) {
                if (n3 == 0) {
                    class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n5++, n11);
                }
                ++n11;
                continue;
            }
            while (n4 >= n11 && (n3 = (n13 = ((Comparable)arrobject[n4]).compareTo(object)) == 0 ? ((Comparable)arrobject2[n4]).compareTo(object2) : n13) >= 0) {
                if (n3 == 0) {
                    class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n4, n12--);
                }
                --n4;
            }
            if (n11 > n4) break;
            class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n11++, n4--);
        }
        n3 = Math.min(n5 - n, n11 - n5);
        class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n, n11 - n3, n3);
        n3 = Math.min(n12 - n4, n2 - n12 - 1);
        class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n11, n2 - n3, n3);
        n3 = n11 - n5;
        if (n3 > 1) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, n, n + n3);
        }
        if ((n3 = n12 - n4) > 1) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, n2 - n3, n2);
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, Object[] arrobject2) {
        class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, arrobject2);
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, 0, arrobject.length);
    }

    public static void lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, Object[] arrobject2, int n, int n2) {
        if (n2 - n < 8192) {
            class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, arrobject2, n, n2);
        }
        ForkJoinPool forkJoinPool = new ForkJoinPool(Runtime.getRuntime().availableProcessors());
        forkJoinPool.invoke(new class_1452(arrobject, arrobject2, n, n2));
        forkJoinPool.shutdown();
    }

    public static void lIlllIlllIIIIlIIlllIllIII(Object[] arrobject, Object[] arrobject2) {
        class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, arrobject2);
        class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, arrobject2, 0, arrobject.length);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, Object[] arrobject2) {
        int n3 = n2 - n;
        if (n3 < 16) {
            class_0385.llIIlllIllIllllIIIlIIIIII(arrobject, n, n2);
            return;
        }
        int n4 = n + n2 >>> 1;
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject2, n, n4, arrobject);
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject2, n4, n2, arrobject);
        if (((Comparable)arrobject2[n4 - 1]).compareTo(arrobject2[n4]) <= 0) {
            System.arraycopy(arrobject2, n, arrobject, n, n3);
            return;
        }
        int n5 = n;
        int n6 = n4;
        for (int i = n; i < n2; ++i) {
            arrobject[i] = n6 >= n2 || n5 < n4 && ((Comparable)arrobject2[n5]).compareTo(arrobject2[n6]) <= 0 ? arrobject2[n5++] : arrobject2[n6++];
        }
    }

    public static void IIIllIllIIlIlIlIlIllllIIl(Object[] arrobject, int n, int n2) {
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n, n2, (Object[])arrobject.clone());
    }

    public static void lIlllIlllIIIIlIIlllIllIII(Object[] arrobject) {
        class_0385.IIIllIllIIlIlIlIlIllllIIl(arrobject, 0, arrobject.length);
    }

    public static void lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, Comparator comparator, Object[] arrobject2) {
        int n3 = n2 - n;
        if (n3 < 16) {
            class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n, n2, comparator);
            return;
        }
        int n4 = n + n2 >>> 1;
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject2, n, n4, comparator, arrobject);
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject2, n4, n2, comparator, arrobject);
        if (comparator.compare(arrobject2[n4 - 1], arrobject2[n4]) <= 0) {
            System.arraycopy(arrobject2, n, arrobject, n, n3);
            return;
        }
        int n5 = n;
        int n6 = n4;
        for (int i = n; i < n2; ++i) {
            arrobject[i] = n6 >= n2 || n5 < n4 && comparator.compare(arrobject2[n5], arrobject2[n6]) <= 0 ? arrobject2[n5++] : arrobject2[n6++];
        }
    }

    public static void IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, int n, int n2, Comparator comparator) {
        class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, n, n2, comparator, (Object[])arrobject.clone());
    }

    public static void IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, Comparator comparator) {
        class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, 0, arrobject.length, comparator);
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, int n, int n2, Object object) {
        --n2;
        while (n <= n2) {
            int n3 = n + n2 >>> 1;
            Object object2 = arrobject[n3];
            int n4 = ((Comparable)object2).compareTo(object);
            if (n4 < 0) {
                n = n3 + 1;
                continue;
            }
            if (n4 > 0) {
                n2 = n3 - 1;
                continue;
            }
            return n3;
        }
        return -(n + 1);
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, Object object) {
        return class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, 0, arrobject.length, object);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, Object object, Comparator comparator) {
        --n2;
        while (n <= n2) {
            int n3 = n + n2 >>> 1;
            Object object2 = arrobject[n3];
            int n4 = comparator.compare(object2, object);
            if (n4 < 0) {
                n = n3 + 1;
                continue;
            }
            if (n4 > 0) {
                n2 = n3 - 1;
                continue;
            }
            return n3;
        }
        return -(n + 1);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object object, Comparator comparator) {
        return class_0385.lllIIIllIIIIlllIlIIllIIll(arrobject, 0, arrobject.length, object, comparator);
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, Random random) {
        int n3 = n2 - n;
        while (n3-- != 0) {
            int n4 = random.nextInt(n3 + 1);
            Object object = arrobject[n + n3];
            arrobject[n + n3] = arrobject[n + n4];
            arrobject[n + n4] = object;
        }
        return arrobject;
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Random random) {
        int n = arrobject.length;
        while (n-- != 0) {
            int n2 = random.nextInt(n + 1);
            Object object = arrobject[n];
            arrobject[n] = arrobject[n2];
            arrobject[n2] = object;
        }
        return arrobject;
    }

    public static Object[] IlIIIIIllllllIIlllIllllll(Object[] arrobject) {
        int n = arrobject.length;
        int n2 = n / 2;
        while (n2-- != 0) {
            Object object = arrobject[n - n2 - 1];
            arrobject[n - n2 - 1] = arrobject[n2];
            arrobject[n2] = object;
        }
        return arrobject;
    }

    public static Object[] IllIIIllIIIIlIlIlIllIIlll(Object[] arrobject, int n, int n2) {
        int n3 = n2 - n;
        int n4 = n3 / 2;
        while (n4-- != 0) {
            Object object = arrobject[n + n3 - n4 - 1];
            arrobject[n + n3 - n4 - 1] = arrobject[n + n4];
            arrobject[n + n4] = object;
        }
        return arrobject;
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2, int n3, Comparator comparator) {
        return class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, n, n2, n3, comparator);
    }

    static /* synthetic */ int lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, int n, int n2, int n3) {
        return class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, n, n2, n3);
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(int[] arrn, Object[] arrobject, int n, int n2, int n3) {
        return class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrn, arrobject, n, n2, n3);
    }

    static /* synthetic */ int lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, Object[] arrobject2, int n, int n2, int n3) {
        return class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, arrobject2, n, n2, n3);
    }

    static /* synthetic */ void IlIllllllIIlIIllllIIlIIIl(Object[] arrobject, Object[] arrobject2, int n, int n2) {
        class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n, n2);
    }

    static /* synthetic */ void lllIlIIlIIIlIlIIIllIlllIl(Object[] arrobject, Object[] arrobject2, int n, int n2, int n3) {
        class_0385.lIlllIlllIIIIlIIlllIllIII(arrobject, arrobject2, n, n2, n3);
    }
}

