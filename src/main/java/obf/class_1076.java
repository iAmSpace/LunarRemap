package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.crash.CrashReport;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class class_1076 {
    private class_0689 lllIIIllIIIIlllIlIIllIIll;
    private class_0689 lllIlIIlIIIlIlIIIllIlllIl;
    private class_2147 IlIllllllIIlIIllllIIlIIIl = new class_2147(this);
    private List lIlllIlllIIIIlIIlllIllIII = new ArrayList();

    protected class_1076() {
        this.lIlllIlllIIIIlIIlllIllIII.add(class_0672.lIIlIIIIIlIlllIlIIlIlIlll);
        this.lIlllIlllIIIIlIIlllIllIII.add(class_0672.IlIlIIlIlIllIIlIlIIllIIIl);
        this.lIlllIlllIIIIlIIlllIllIII.add(class_0672.lIlIlIIlIIIIlIIIIIlllIIII);
        this.lIlllIlllIIIIlIIlllIllIII.add(class_0672.IlIlIIlllIllllllllIIIlIlI);
        this.lIlllIlllIIIIlIIlllIllIII.add(class_0672.IIIIlIllIlIIlIIlIllIlIlll);
        this.lIlllIlllIIIIlIIlllIllIII.add(class_0672.llIIIIllIIIIIIIlIIIlIIIIl);
        this.lIlllIlllIIIIlIIlllIllIII.add(class_0672.IIllIllIIllIIlllIIIlIlllI);
    }

    public class_1076(long l, class_1074 class_10742) {
        this();
        class_0689[] arrclass_0689 = class_0689.lllIIIllIIIIlllIlIIllIIll(l, class_10742);
        this.lllIIIllIIIIlllIlIIllIIll = arrclass_0689[0];
        this.lllIlIIlIIIlIlIIIllIlllIl = arrclass_0689[1];
    }

    public class_1076(class_1334 class_13342) {
        this(class_13342.lIlIlIIlIIIIlIIIIIlllIIII(), class_13342.lIlllIlllIlIIIIlllIlIlIIl().IlIIIlIIIIllIIIllIIIIIIll());
    }

    public List lllIIIllIIIIlllIlIIllIIll() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public class_0672 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(n, n2);
    }

    public float[] lllIIIllIIIIlllIlIIllIIll(float[] arrf, int n, int n2, int n3, int n4) {
        class_0256.lllIIIllIIIIlllIlIIllIIll();
        if (arrf == null || arrf.length < n3 * n4) {
            arrf = new float[n3 * n4];
        }
        int[] arrn = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            try {
                float f = (float)class_0672.lIlllIlllIIIIlIIlllIllIII(arrn[i]).IllIIlllllllIIlIIlIIIIlIl() / 65536.0f;
                if (f > 1.0f) {
                    f = 1.0f;
                }
                arrf[i] = f;
                continue;
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Invalid Biome id");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("DownfallBlock");
                class_07992.lllIIIllIIIIlllIlIIllIIll("biome id", i);
                class_07992.lllIIIllIIIIlllIlIIllIIll("downfalls[] size", arrf.length);
                class_07992.lllIIIllIIIIlllIlIIllIIll("x", n);
                class_07992.lllIIIllIIIIlllIlIIllIIll("z", n2);
                class_07992.lllIIIllIIIIlllIlIIllIIll("w", n3);
                class_07992.lllIIIllIIIIlllIlIIllIIll("h", n4);
                throw new class_0892(class_02232);
            }
        }
        return arrf;
    }

    public float lllIIIllIIIIlllIlIIllIIll(float f, int n) {
        return f;
    }

    public class_0672[] lllIIIllIIIIlllIlIIllIIll(class_0672[] arrclass_0672, int n, int n2, int n3, int n4) {
        class_0256.lllIIIllIIIIlllIlIIllIIll();
        if (arrclass_0672 == null || arrclass_0672.length < n3 * n4) {
            arrclass_0672 = new class_0672[n3 * n4];
        }
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        try {
            for (int i = 0; i < n3 * n4; ++i) {
                arrclass_0672[i] = class_0672.lIlllIlllIIIIlIIlllIllIII(arrn[i]);
            }
            return arrclass_0672;
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Invalid Biome id");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("RawBiomeBlock");
            class_07992.lllIIIllIIIIlllIlIIllIIll("biomes[] size", arrclass_0672.length);
            class_07992.lllIIIllIIIIlllIlIIllIIll("x", n);
            class_07992.lllIIIllIIIIlllIlIIllIIll("z", n2);
            class_07992.lllIIIllIIIIlllIlIIllIIll("w", n3);
            class_07992.lllIIIllIIIIlllIlIIllIIll("h", n4);
            throw new class_0892(class_02232);
        }
    }

    public class_0672[] lllIlIIlIIIlIlIIIllIlllIl(class_0672[] arrclass_0672, int n, int n2, int n3, int n4) {
        return this.lllIIIllIIIIlllIlIIllIIll(arrclass_0672, n, n2, n3, n4, true);
    }

    public class_0672[] lllIIIllIIIIlllIlIIllIIll(class_0672[] arrclass_0672, int n, int n2, int n3, int n4, boolean bl) {
        class_0256.lllIIIllIIIIlllIlIIllIIll();
        if (arrclass_0672 == null || arrclass_0672.length < n3 * n4) {
            arrclass_0672 = new class_0672[n3 * n4];
        }
        if (bl && n3 == 16 && n4 == 16 && (n & 0xF) == 0 && (n2 & 0xF) == 0) {
            class_0672[] arrclass_06722 = this.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(n, n2);
            System.arraycopy(arrclass_06722, 0, arrclass_0672, 0, n3 * n4);
            return arrclass_0672;
        }
        int[] arrn = this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4);
        for (int i = 0; i < n3 * n4; ++i) {
            arrclass_0672[i] = class_0672.lIlllIlllIIIIlIIlllIllIII(arrn[i]);
        }
        return arrclass_0672;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, List list) {
        class_0256.lllIIIllIIIIlllIlIIllIIll();
        int n4 = n - n3 >> 2;
        int n5 = n2 - n3 >> 2;
        int n6 = n + n3 >> 2;
        int n7 = n2 + n3 >> 2;
        int n8 = n6 - n4 + 1;
        int n9 = n7 - n5 + 1;
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n4, n5, n8, n9);
        try {
            for (int i = 0; i < n8 * n9; ++i) {
                class_0672 class_06722 = class_0672.lIlllIlllIIIIlIIlllIllIII(arrn[i]);
                if (list.contains(class_06722)) continue;
                return false;
            }
            return true;
        }
        catch (Throwable throwable) {
            CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Invalid Biome id");
            class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Layer");
            class_07992.lllIIIllIIIIlllIlIIllIIll("Layer", this.lllIIIllIIIIlllIlIIllIIll.toString());
            class_07992.lllIIIllIIIIlllIlIIllIIll("x", n);
            class_07992.lllIIIllIIIIlllIlIIllIIll("z", n2);
            class_07992.lllIIIllIIIIlllIlIIllIIll("radius", n3);
            class_07992.lllIIIllIIIIlllIlIIllIIll("allowed", list);
            throw new class_0892(class_02232);
        }
    }

    public class_2137 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, List list, Random random) {
        class_0256.lllIIIllIIIIlllIlIIllIIll();
        int n4 = n - n3 >> 2;
        int n5 = n2 - n3 >> 2;
        int n6 = n + n3 >> 2;
        int n7 = n2 + n3 >> 2;
        int n8 = n6 - n4 + 1;
        int n9 = n7 - n5 + 1;
        int[] arrn = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(n4, n5, n8, n9);
        class_2137 class_21372 = null;
        int n10 = 0;
        for (int i = 0; i < n8 * n9; ++i) {
            int n11 = n4 + i % n8 << 2;
            int n12 = n5 + i / n8 << 2;
            class_0672 class_06722 = class_0672.lIlllIlllIIIIlIIlllIllIII(arrn[i]);
            if (!list.contains(class_06722) || class_21372 != null && random.nextInt(n10 + 1) != 0) continue;
            class_21372 = new class_2137(n11, 0, n12);
            ++n10;
        }
        return class_21372;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll();
    }
}

