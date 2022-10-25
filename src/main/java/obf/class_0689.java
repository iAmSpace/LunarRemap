package obf;

import net.minecraft.crash.CrashReport;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_0689 {
    private long IlIllllllIIlIIllllIIlIIIl;
    protected class_0689 lllIIIllIIIIlllIlIIllIIll;
    private long lIlllIlllIIIIlIIlllIllIII;
    protected long lllIlIIlIIIlIlIIIllIlllIl;

    public static class_0689[] lllIIIllIIIIlllIlIIllIIll(long l, class_1074 class_10742) {
        class_0689 class_06892;
        boolean bl = false;
        class_1485 class_14852 = new class_1485(1L);
        class_0532 class_05322 = new class_0532(2000L, class_14852);
        class_0095 class_00952 = new class_0095(1L, class_05322);
        class_0567 class_05672 = new class_0567(2001L, class_00952);
        class_00952 = new class_0095(2L, class_05672);
        class_00952 = new class_0095(50L, class_00952);
        class_00952 = new class_0095(70L, class_00952);
        class_1360 class_13602 = new class_1360(2L, class_00952);
        class_1571 class_15712 = new class_1571(2L, class_13602);
        class_00952 = new class_0095(3L, class_15712);
        class_1302 class_13022 = new class_1302(2L, class_00952, class_0436.lllIIIllIIIIlllIlIIllIIll);
        class_13022 = new class_1302(2L, class_13022, class_0436.lllIlIIlIIIlIlIIIllIlllIl);
        class_13022 = new class_1302(3L, class_13022, class_0436.IlIllllllIIlIIllllIIlIIIl);
        class_05672 = new class_0567(2002L, class_13022);
        class_05672 = new class_0567(2003L, class_05672);
        class_00952 = new class_0095(4L, class_05672);
        class_1951 class_19512 = new class_1951(5L, class_00952);
        class_1912 class_19122 = new class_1912(4L, class_19512);
        class_0689 class_06893 = class_0567.lllIIIllIIIIlllIlIIllIIll(1000L, class_19122, 0);
        int n = 4;
        if (class_10742 == class_1074.lIlllIlllIIIIlIIlllIllIII) {
            n = 6;
        }
        if (bl) {
            n = 4;
        }
        class_0689 class_06894 = class_0567.lllIIIllIIIIlllIlIIllIIll(1000L, class_06893, 0);
        class_0684 class_06842 = new class_0684(100L, class_06894);
        class_0689 class_06895 = new class_1316(200L, class_06893, class_10742);
        if (!bl) {
            class_06892 = class_0567.lllIIIllIIIIlllIlIIllIIll(1000L, class_06895, 2);
            class_06895 = new class_0982(1000L, class_06892);
        }
        class_06892 = class_0567.lllIIIllIIIIlllIlIIllIIll(1000L, class_06842, 2);
        class_0240 class_02402 = new class_0240(1000L, class_06895, class_06892);
        class_06894 = class_0567.lllIIIllIIIIlllIlIIllIIll(1000L, class_06842, 2);
        class_06894 = class_0567.lllIIIllIIIIlllIlIIllIIll(1000L, class_06894, n);
        class_0578 class_05782 = new class_0578(1L, class_06894);
        class_0417 class_04172 = new class_0417(1000L, class_05782);
        class_06895 = new class_0023(1001L, class_02402);
        for (int i = 0; i < n; ++i) {
            class_06895 = new class_0567(1000 + i, class_06895);
            if (i == 0) {
                class_06895 = new class_0095(3L, class_06895);
            }
            if (i != 1) continue;
            class_06895 = new class_1558(1000L, class_06895);
        }
        class_0417 class_04173 = new class_0417(1000L, class_06895);
        class_1850 class_18502 = new class_1850(100L, class_04173, class_04172);
        class_0488 class_04882 = new class_0488(10L, class_18502);
        class_18502.lllIIIllIIIIlllIlIIllIIll(l);
        class_04882.lllIIIllIIIIlllIlIIllIIll(l);
        return new class_0689[]{class_18502, class_04882, class_18502};
    }

    public class_0689(long l) {
        this.lllIlIIlIIIlIlIIIllIlllIl = l;
        this.lllIlIIlIIIlIlIIIllIlllIl *= this.lllIlIIlIIIlIlIIIllIlllIl * 6364136223846793005L + 1442695040888963407L;
        this.lllIlIIlIIIlIlIIIllIlllIl += l;
        this.lllIlIIlIIIlIlIIIllIlllIl *= this.lllIlIIlIIIlIlIIIllIlllIl * 6364136223846793005L + 1442695040888963407L;
        this.lllIlIIlIIIlIlIIIllIlllIl += l;
        this.lllIlIIlIIIlIlIIIllIlllIl *= this.lllIlIIlIIIlIlIIIllIlllIl * 6364136223846793005L + 1442695040888963407L;
        this.lllIlIIlIIIlIlIIIllIlllIl += l;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l) {
        this.IlIllllllIIlIIllllIIlIIIl = l;
        if (this.lllIIIllIIIIlllIlIIllIIll != null) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(l);
        }
        this.IlIllllllIIlIIllllIIlIIIl *= this.IlIllllllIIlIIllllIIlIIIl * 6364136223846793005L + 1442695040888963407L;
        this.IlIllllllIIlIIllllIIlIIIl += this.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl *= this.IlIllllllIIlIIllllIIlIIIl * 6364136223846793005L + 1442695040888963407L;
        this.IlIllllllIIlIIllllIIlIIIl += this.lllIlIIlIIIlIlIIIllIlllIl;
        this.IlIllllllIIlIIllllIIlIIIl *= this.IlIllllllIIlIIllllIIlIIIl * 6364136223846793005L + 1442695040888963407L;
        this.IlIllllllIIlIIllllIIlIIIl += this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public void lllIIIllIIIIlllIlIIllIIll(long l, long l2) {
        this.lIlllIlllIIIIlIIlllIllIII = this.IlIllllllIIlIIllllIIlIIIl;
        this.lIlllIlllIIIIlIIlllIllIII *= this.lIlllIlllIIIIlIIlllIllIII * 6364136223846793005L + 1442695040888963407L;
        this.lIlllIlllIIIIlIIlllIllIII += l;
        this.lIlllIlllIIIIlIIlllIllIII *= this.lIlllIlllIIIIlIIlllIllIII * 6364136223846793005L + 1442695040888963407L;
        this.lIlllIlllIIIIlIIlllIllIII += l2;
        this.lIlllIlllIIIIlIIlllIllIII *= this.lIlllIlllIIIIlIIlllIllIII * 6364136223846793005L + 1442695040888963407L;
        this.lIlllIlllIIIIlIIlllIllIII += l;
        this.lIlllIlllIIIIlIIlllIllIII *= this.lIlllIlllIIIIlIIlllIllIII * 6364136223846793005L + 1442695040888963407L;
        this.lIlllIlllIIIIlIIlllIllIII += l2;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(int n) {
        int n2 = (int)((this.lIlllIlllIIIIlIIlllIllIII >> 24) % (long)n);
        if (n2 < 0) {
            n2 += n;
        }
        this.lIlllIlllIIIIlIIlllIllIII *= this.lIlllIlllIIIIlIIlllIllIII * 6364136223846793005L + 1442695040888963407L;
        this.lIlllIlllIIIIlIIlllIllIII += this.IlIllllllIIlIIllllIIlIIIl;
        return n2;
    }

    public abstract int[] lllIIIllIIIIlllIlIIllIIll(int var1, int var2, int var3, int var4);

    protected static boolean lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n == n2) {
            return true;
        }
        if (n != class_0672.lIIIlIIIlIlllIllIIIlIIIlI.lIlIllIIllIIIIlllIlIlllIl && n != class_0672.lIIlIlllIllIlIlllIIIIIIII.lIlIllIIllIIIIlllIlIlllIl) {
            try {
                return class_0672.lIlllIlllIIIIlIIlllIllIII(n) != null && class_0672.lIlllIlllIIIIlIIlllIllIII(n2) != null ? class_0672.lIlllIlllIIIIlIIlllIllIII(n).lllIIIllIIIIlllIlIIllIIll(class_0672.lIlllIlllIIIIlIIlllIllIII(n2)) : false;
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Comparing biomes");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Biomes being compared");
                class_07992.lllIIIllIIIIlllIlIIllIIll("Biome A ID", n);
                class_07992.lllIIIllIIIIlllIlIIllIIll("Biome B ID", n2);
                class_07992.addCrashSectionCallable("Biome A", new class_1299(n));
                class_07992.addCrashSectionCallable("Biome B", new class_1984(n2));
                throw new class_0892(class_02232);
            }
        }
        return n2 == class_0672.lIIIlIIIlIlllIllIIIlIIIlI.lIlIllIIllIIIIlllIlIlllIl || n2 == class_0672.lIIlIlllIllIlIlllIIIIIIII.lIlIllIIllIIIIlllIlIlllIl;
    }

    protected static boolean lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n == class_0672.IlIlllIIIIIIlIIllIIllIlll.lIlIllIIllIIIIlllIlIlllIl || n == class_0672.lIlIIllllIlIIIIllIIIIlIIl.lIlIllIIllIIIIlllIlIlllIl || n == class_0672.llIllllIlIllIIIlIllIIlIlI.lIlIllIIllIIIIlllIlIlllIl;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(int ... arrn) {
        return arrn[this.lllIIIllIIIIlllIlIIllIIll(arrn.length)];
    }

    protected int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3, int n4) {
        return n2 == n3 && n3 == n4 ? n2 : (n == n2 && n == n3 ? n : (n == n2 && n == n4 ? n : (n == n3 && n == n4 ? n : (n == n2 && n3 != n4 ? n : (n == n3 && n2 != n4 ? n : (n == n4 && n2 != n3 ? n : (n2 == n3 && n != n4 ? n2 : (n2 == n4 && n != n3 ? n2 : (n3 == n4 && n != n2 ? n3 : this.lllIIIllIIIIlllIlIIllIIll(new int[]{n, n2, n3, n4}))))))))));
    }
}

