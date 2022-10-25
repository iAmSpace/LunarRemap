package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1652 {
    public static final Object lllIIIllIIIIlllIlIIllIIll = new Object();
    private static final int lllIlIIlIIIlIlIIIllIlllIl = -1640531527;
    private static final int IlIllllllIIlIIllllIIlIIIl = 340573321;
    private static final long lIlllIlllIIIIlIIlllIllIII = -7046029254386353131L;
    private static final long IlIIIIIllllllIIlllIllllll = -1018231460777725123L;

    protected class_1652() {
    }

    public static final int lllIIIllIIIIlllIlIIllIIll(int n) {
        n ^= n >>> 16;
        n *= -2048144789;
        n ^= n >>> 13;
        n *= -1028477387;
        n ^= n >>> 16;
        return n;
    }

    public static final long lllIIIllIIIIlllIlIIllIIll(long l) {
        l ^= l >>> 33;
        l *= -49064778989728563L;
        l ^= l >>> 33;
        l *= -4265267296055464877L;
        l ^= l >>> 33;
        return l;
    }

    public static final int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        int n2 = n * -1640531527;
        return n2 ^ n2 >>> 16;
    }

    public static final int IlIllllllIIlIIllllIIlIIIl(int n) {
        return (n ^ n >>> 16) * 340573321;
    }

    public static final long lllIlIIlIIIlIlIIIllIlllIl(long l) {
        long l2 = l * -7046029254386353131L;
        l2 ^= l2 >>> 32;
        return l2 ^ l2 >>> 16;
    }

    public static final long IlIllllllIIlIIllllIIlIIIl(long l) {
        l ^= l >>> 32;
        l ^= l >>> 16;
        return (l ^ l >>> 32) * -1018231460777725123L;
    }

    public static final int lllIIIllIIIIlllIlIIllIIll(float f) {
        return Float.floatToRawIntBits(f);
    }

    public static final int lllIIIllIIIIlllIlIIllIIll(double d) {
        long l = Double.doubleToRawLongBits(d);
        return (int)(l ^ l >>> 32);
    }

    public static final int lIlllIlllIIIIlIIlllIllIII(long l) {
        return (int)(l ^ l >>> 32);
    }

    public static int lIlllIlllIIIIlIIlllIllIII(int n) {
        if (n == 0) {
            return 1;
        }
        --n;
        n |= n >> 1;
        n |= n >> 2;
        n |= n >> 4;
        n |= n >> 8;
        return (n | n >> 16) + 1;
    }

    public static long IlIIIIIllllllIIlllIllllll(long l) {
        if (l == 0L) {
            return 1L;
        }
        --l;
        l |= l >> 1;
        l |= l >> 2;
        l |= l >> 4;
        l |= l >> 8;
        l |= l >> 16;
        return (l | l >> 32) + 1L;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, float f) {
        return Math.min((int)Math.ceil((float)n * f), n - 1);
    }

    public static long lllIIIllIIIIlllIlIIllIIll(long l, float f) {
        return Math.min((long)Math.ceil((float)l * f), l - 1L);
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n, float f) {
        long l = Math.max(2L, class_1652.IlIIIIIllllllIIlllIllllll((long)Math.ceil((float)n / f)));
        if (l > 0x40000000L) {
            throw new IllegalArgumentException("Too large (" + n + " expected elements with load factor " + f + ")");
        }
        return (int)l;
    }

    public static long lllIlIIlIIIlIlIIIllIlllIl(long l, float f) {
        return class_1652.IlIIIIIllllllIIlllIllllll((long)Math.ceil((float)l / f));
    }
}

