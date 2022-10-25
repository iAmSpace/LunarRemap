package net.minecraft.util;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

public class MathHelper {
    private static final int lIllllIIlIIIlIllllllIIIll = 12;
    private static final int IIIllIIlIIIIIIlIlIIllIIlI = 4095;
    private static final int IllIIlllllllIIlIIlIIIIlIl = 4096;
    public static final float lllIIIllIIIIlllIlIIllIIll = (float)Math.PI;
    public static final float lllIlIIlIIIlIlIIIllIlllIl = (float)Math.PI * 2;
    public static final float IlIllllllIIlIIllllIIlIIIl = 1.5707964f;
    private static final float IIIllIllIIlIlIlIlIllllIIl = (float)Math.PI * 2;
    private static final float IllIIIllIIIIlIlIlIllIIlll = 360.0f;
    private static final float lIIIIlIlIIlllllIIllIIlIII = 651.8986f;
    private static final float llIIlllIllIllllIIIlIIIIII = 11.377778f;
    public static final float lIlllIlllIIIIlIIlllIllIII = (float)Math.PI / 180;
    private static final float[] llIIllIllIlIIlIIllIllllll;
    public static boolean IlIIIIIllllllIIlllIllllll;
    private static float[] lllIIlIIIllllllIIIIlIlIlI;
    private static final int[] IlIlllIIIIIIlIIllIIllIlll;

    public static final float lllIIIllIIIIlllIlIIllIIll(float f) {
        return IlIIIIIllllllIIlllIllllll ? llIIllIllIlIIlIIllIllllll[(int)(f * 651.8986f) & 0xFFF] : lllIIlIIIllllllIIIIlIlIlI[(int)(f * 10430.378f) & 0xFFFF];
    }

    public static final float lllIlIIlIIIlIlIIIllIlllIl(float f) {
        return IlIIIIIllllllIIlllIllllll ? llIIllIllIlIIlIIllIllllll[(int)((f + 1.5707964f) * 651.8986f) & 0xFFF] : lllIIlIIIllllllIIIIlIlIlI[(int)(f * 10430.378f + 16384.0f) & 0xFFFF];
    }

    public static final float IlIllllllIIlIIllllIIlIIIl(float f) {
        return (float)Math.sqrt(f);
    }

    public static final float lllIIIllIIIIlllIlIIllIIll(double d) {
        return (float)Math.sqrt(d);
    }

    public static int lIlllIlllIIIIlIIlllIllIII(float f) {
        int n = (int)f;
        return f < (float)n ? n - 1 : n;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(double d) {
        return (int)(d + 1024.0) - 1024;
    }

    public static int IlIllllllIIlIIllllIIlIIIl(double d) {
        int n = (int)d;
        return d < (double)n ? n - 1 : n;
    }

    public static long lIlllIlllIIIIlIIlllIllIII(double d) {
        long l = (long)d;
        return d < (double)l ? l - 1L : l;
    }

    public static int IlIIIIIllllllIIlllIllllll(double d) {
        return (int)(d >= 0.0 ? d : -d + 1.0);
    }

    public static float IlIIIIIllllllIIlllIllllll(float f) {
        return f >= 0.0f ? f : -f;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n) {
        return n >= 0 ? n : -n;
    }

    public static int lIllllIIlIIIlIllllllIIIll(float f) {
        int n = (int)f;
        return f > (float)n ? n + 1 : n;
    }

    public static int lIllllIIlIIIlIllllllIIIll(double d) {
        int n = (int)d;
        return d > (double)n ? n + 1 : n;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        return n < n2 ? n2 : (n > n3 ? n3 : n);
    }

    public static float clamp_float(float f, float f2, float f3) {
        return f < f2 ? f2 : (f > f3 ? f3 : f);
    }

    public static double lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3) {
        return d < d2 ? d2 : (d > d3 ? d3 : d);
    }

    public static double lllIlIIlIIIlIlIIIllIlllIl(double d, double d2, double d3) {
        return d3 < 0.0 ? d : (d3 > 1.0 ? d2 : d + (d2 - d) * d3);
    }

    public static double lllIIIllIIIIlllIlIIllIIll(double d, double d2) {
        if (d < 0.0) {
            d = -d;
        }
        if (d2 < 0.0) {
            d2 = -d2;
        }
        return d > d2 ? d : d2;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n < 0 ? -((-n - 1) / n2) - 1 : n / n2;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(String string) {
        return string == null || string.length() == 0;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2) {
        return n >= n2 ? n : random.nextInt(n2 - n + 1) + n;
    }

    public static float lllIIIllIIIIlllIlIIllIIll(Random random, float f, float f2) {
        return f >= f2 ? f : random.nextFloat() * (f2 - f) + f;
    }

    public static double lllIIIllIIIIlllIlIIllIIll(Random random, double d, double d2) {
        return d >= d2 ? d : random.nextDouble() * (d2 - d) + d;
    }

    public static double lllIIIllIIIIlllIlIIllIIll(long[] arrl) {
        long l = 0L;
        long[] arrl2 = arrl;
        int n = arrl.length;
        for (int i = 0; i < n; ++i) {
            long l2 = arrl2[i];
            l += l2;
        }
        return (double)l / (double)arrl.length;
    }

    public static float IIIllIIlIIIIIIlIlIIllIIlI(float f) {
        if ((f %= 360.0f) >= 180.0f) {
            f -= 360.0f;
        }
        if (f < -180.0f) {
            f += 360.0f;
        }
        return f;
    }

    public static double IIIllIIlIIIIIIlIlIIllIIlI(double d) {
        if ((d %= 360.0) >= 180.0) {
            d -= 360.0;
        }
        if (d < -180.0) {
            d += 360.0;
        }
        return d;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(String string, int n) {
        int n2 = n;
        try {
            n2 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return n2;
    }

    public static int lllIIIllIIIIlllIlIIllIIll(String string, int n, int n2) {
        int n3 = n;
        try {
            n3 = Integer.parseInt(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (n3 < n2) {
            n3 = n2;
        }
        return n3;
    }

    public static double lllIIIllIIIIlllIlIIllIIll(String string, double d) {
        double d2 = d;
        try {
            d2 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        return d2;
    }

    public static double lllIIIllIIIIlllIlIIllIIll(String string, double d, double d2) {
        double d3 = d;
        try {
            d3 = Double.parseDouble(string);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (d3 < d2) {
            d3 = d2;
        }
        return d3;
    }

    public static int roundUpToPowerOfTwo(int n) {
        int n2 = n - 1;
        n2 |= n2 >> 1;
        n2 |= n2 >> 2;
        n2 |= n2 >> 4;
        n2 |= n2 >> 8;
        n2 |= n2 >> 16;
        return n2 + 1;
    }

    private static boolean lIlllIlllIIIIlIIlllIllIII(int n) {
        return n != 0 && (n & n - 1) == 0;
    }

    private static int IlIIIIIllllllIIlllIllllll(int n) {
        n = MathHelper.lIlllIlllIIIIlIIlllIllIII(n) ? n : MathHelper.roundUpToPowerOfTwo(n);
        return IlIlllIIIIIIlIIllIIllIlll[(int)((long)n * 125613361L >> 27) & 0x1F];
    }

    public static int IlIllllllIIlIIllllIIlIIIl(int n) {
        return MathHelper.IlIIIIIllllllIIlllIllllll(n) - (MathHelper.lIlllIlllIIIIlIIlllIllIII(n) ? 0 : 1);
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        int n3;
        if (n2 == 0) {
            return 0;
        }
        if (n < 0) {
            n2 *= -1;
        }
        return (n3 = n % n2) == 0 ? n : n + n2 - n3;
    }

    static {
        int n;
        llIIllIllIlIIlIIllIllllll = new float[4096];
        IlIIIIIllllllIIlllIllllll = false;
        lllIIlIIIllllllIIIIlIlIlI = new float[65536];
        for (n = 0; n < 65536; ++n) {
            MathHelper.lllIIlIIIllllllIIIIlIlIlI[n] = (float)Math.sin((double)n * Math.PI * 2.0 / 65536.0);
        }
        IlIlllIIIIIIlIIllIIllIlll = new int[]{0, 1, 28, 2, 29, 14, 24, 3, 30, 22, 20, 15, 25, 17, 4, 8, 31, 27, 13, 23, 21, 19, 16, 7, 26, 12, 18, 6, 11, 5, 10, 9};
        for (n = 0; n < 4096; ++n) {
            MathHelper.llIIllIllIlIIlIIllIllllll[n] = (float)Math.sin(((float)n + 0.5f) / 4096.0f * ((float)Math.PI * 2));
        }
        for (n = 0; n < 360; n += 90) {
            MathHelper.llIIllIllIlIIlIIllIllllll[(int)((float)n * 11.377778f) & 4095] = (float)Math.sin((float)n * ((float)Math.PI / 180));
        }
    }
}

