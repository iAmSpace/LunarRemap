package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Iterator;
import java.util.ListIterator;

public class class_0548 {
    public static final class_1124 lllIIIllIIIIlllIlIIllIIll = new class_1124();

    private class_0548() {
    }

    public static class_0898 lllIIIllIIIIlllIlIIllIIll(Object object) {
        return new class_0121(object);
    }

    public static class_0898 lllIIIllIIIIlllIlIIllIIll(Object[] arrobject, int n, int n2) {
        class_0385.IlIIIIIllllllIIlllIllllll(arrobject, n, n2);
        return new class_0275(arrobject, n, n2);
    }

    public static class_0898 lllIIIllIIIIlllIlIIllIIll(Object[] arrobject) {
        return new class_0275(arrobject, 0, arrobject.length);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Iterator iterator, Object[] arrobject, int n, int n2) {
        if (n2 < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n2 + ") is negative");
        }
        if (n < 0 || n + n2 > arrobject.length) {
            throw new IllegalArgumentException();
        }
        int n3 = n2;
        while (n3-- != 0 && iterator.hasNext()) {
            arrobject[n++] = iterator.next();
        }
        return n2 - n3 - 1;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Iterator iterator, Object[] arrobject) {
        return class_0548.lllIIIllIIIIlllIlIIllIIll(iterator, arrobject, 0, arrobject.length);
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Iterator iterator, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n + ") is negative");
        }
        Object[] arrobject = new Object[16];
        int n2 = 0;
        while (n-- != 0 && iterator.hasNext()) {
            if (n2 == arrobject.length) {
                arrobject = class_0385.lllIlIIlIIIlIlIIIllIlllIl(arrobject, n2 + 1);
            }
            arrobject[n2++] = iterator.next();
        }
        return class_0385.IlIllllllIIlIIllllIIlIIIl(arrobject, n2);
    }

    public static Object[] lllIIIllIIIIlllIlIIllIIll(Iterator iterator) {
        return class_0548.lllIIIllIIIIlllIlIIllIIll(iterator, Integer.MAX_VALUE);
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Iterator iterator, class_1888 class_18882, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n + ") is negative");
        }
        int n2 = n;
        while (n2-- != 0 && iterator.hasNext()) {
            class_18882.add(iterator.next());
        }
        return n - n2 - 1;
    }

    public static long lllIIIllIIIIlllIlIIllIIll(Iterator iterator, class_1888 class_18882) {
        long l = 0L;
        while (iterator.hasNext()) {
            class_18882.add(iterator.next());
            ++l;
        }
        return l;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(Iterator iterator, class_1888 class_18882, int n) {
        if (n < 0) {
            throw new IllegalArgumentException("The maximum number of elements (" + n + ") is negative");
        }
        int n2 = n;
        while (n2-- != 0 && iterator.hasNext()) {
            class_18882.add(iterator.next());
        }
        return n - n2 - 1;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(Iterator iterator, class_1888 class_18882) {
        return class_0548.lllIlIIlIIIlIlIIIllIlllIl(iterator, class_18882, Integer.MAX_VALUE);
    }

    public static class_0266 lllIlIIlIIIlIlIIIllIlllIl(Iterator iterator, int n) {
        class_2034 class_20342 = new class_2034();
        class_0548.lllIlIIlIIIlIlIIIllIlllIl(iterator, class_20342, n);
        class_20342.IllIIlllllllIIlIIlIIIIlIl();
        return class_20342;
    }

    public static class_0266 lllIlIIlIIIlIlIIIllIlllIl(Iterator iterator) {
        return class_0548.lllIlIIlIIIlIlIIIllIlllIl(iterator, Integer.MAX_VALUE);
    }

    public static class_0353 IlIllllllIIlIIllllIIlIIIl(Iterator iterator) {
        if (iterator instanceof class_0353) {
            return (class_0353)iterator;
        }
        return new class_0391(iterator);
    }

    public static class_0898 lllIIIllIIIIlllIlIIllIIll(ListIterator listIterator) {
        if (listIterator instanceof class_0898) {
            return (class_0898)listIterator;
        }
        return new class_2212(listIterator);
    }

    public static class_0353 lllIIIllIIIIlllIlIIllIIll(class_0353[] arrclass_0353) {
        return class_0548.lllIIIllIIIIlllIlIIllIIll(arrclass_0353, 0, arrclass_0353.length);
    }

    public static class_0353 lllIIIllIIIIlllIlIIllIIll(class_0353[] arrclass_0353, int n, int n2) {
        return new class_1007(arrclass_0353, n, n2);
    }

    public static class_0353 lllIIIllIIIIlllIlIIllIIll(class_0353 class_03532) {
        return new class_2189(class_03532);
    }

    public static class_0771 lllIIIllIIIIlllIlIIllIIll(class_0771 class_07712) {
        return new class_2084(class_07712);
    }

    public static class_0898 lllIIIllIIIIlllIlIIllIIll(class_0898 class_08982) {
        return new class_0131(class_08982);
    }
}

