package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Collection;
import java.util.Iterator;
import java.util.Random;

public class class_0242 {
    public static int lllIIIllIIIIlllIlIIllIIll(Collection collection) {
        int n = 0;
        for (class_1006 class_10062 : collection) {
            n += class_10062.lIlllIlllIIIIlIIlllIllIII;
        }
        return n;
    }

    public static class_1006 lllIIIllIIIIlllIlIIllIIll(Random random, Collection collection, int n) {
        class_1006 class_10062;
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int n2 = random.nextInt(n);
        Iterator iterator = collection.iterator();
        do {
            if (!iterator.hasNext()) {
                return null;
            }
            class_10062 = (class_1006)iterator.next();
        } while ((n2 -= class_10062.lIlllIlllIIIIlIIlllIllIII) >= 0);
        return class_10062;
    }

    public static class_1006 lllIIIllIIIIlllIlIIllIIll(Random random, Collection collection) {
        return class_0242.lllIIIllIIIIlllIlIIllIIll(random, collection, class_0242.lllIIIllIIIIlllIlIIllIIll(collection));
    }

    public static int lllIIIllIIIIlllIlIIllIIll(class_1006[] arrclass_1006) {
        int n = 0;
        class_1006[] arrclass_10062 = arrclass_1006;
        int n2 = arrclass_1006.length;
        for (int i = 0; i < n2; ++i) {
            class_1006 class_10062 = arrclass_10062[i];
            n += class_10062.lIlllIlllIIIIlIIlllIllIII;
        }
        return n;
    }

    public static class_1006 lllIIIllIIIIlllIlIIllIIll(Random random, class_1006[] arrclass_1006, int n) {
        if (n <= 0) {
            throw new IllegalArgumentException();
        }
        int n2 = random.nextInt(n);
        class_1006[] arrclass_10062 = arrclass_1006;
        int n3 = arrclass_1006.length;
        for (int i = 0; i < n3; ++i) {
            class_1006 class_10062 = arrclass_10062[i];
            if ((n2 -= class_10062.lIlllIlllIIIIlIIlllIllIII) >= 0) continue;
            return class_10062;
        }
        return null;
    }

    public static class_1006 lllIIIllIIIIlllIlIIllIIll(Random random, class_1006[] arrclass_1006) {
        return class_0242.lllIIIllIIIIlllIlIIllIIll(random, arrclass_1006, class_0242.lllIIIllIIIIlllIlIIllIIll(arrclass_1006));
    }
}

