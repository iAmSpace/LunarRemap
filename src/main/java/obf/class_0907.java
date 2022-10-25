package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public final class class_0907 {
    private HashMap lllIIIllIIIIlllIlIIllIIll = new HashMap();
    private Map lllIlIIlIIIlIlIIIllIlllIl = new HashMap();
    private int IlIllllllIIlIIllllIIlIIIl = Integer.MAX_VALUE;
    private int lIlllIlllIIIIlIIlllIllIII = Integer.MAX_VALUE;

    protected static class_2137 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2) {
        class_0723 class_07232 = class_13342.IlIIIIIllllllIIlllIllllll(n, n2);
        int n3 = n * 16 + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16);
        int n4 = n2 * 16 + class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16);
        int n5 = class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(class_07232 == null ? class_13342.IIlIIlIlIlIllIIlIlIIIIlll() : class_07232.lllIIIllIIIIlllIlIIllIIll() + 16 - 1);
        return new class_2137(n3, n5, n4);
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_0976 class_09762, boolean bl, boolean bl2, boolean bl3) {
        boolean bl4;
        int n;
        Object object;
        int n2;
        if (!bl && !bl2) {
            return 0;
        }
        class_0814 class_08142 = null;
        if (class_09762.lIllllIIlIIIlIllllllIIIll.size() == 1) {
            class_08142 = (class_0814)class_09762.lIllllIIlIIIlIllllllIIIll.get(0);
        }
        if (class_08142 == null || class_08142.lIlIIllIllIIIIIlIllllIIIl != this.IlIllllllIIlIIllllIIlIIIl || class_08142.llIIIlIlIlIIlIllIIIllIlIl != this.lIlllIlllIIIIlIIlllIllIII || this.lllIIIllIIIIlllIlIIllIIll.size() <= 0) {
            this.lllIIIllIIIIlllIlIIllIIll.clear();
            for (n2 = 0; n2 < class_09762.lIllllIIlIIIlIllllllIIIll.size(); ++n2) {
                object = (class_0814)class_09762.lIllllIIlIIIlIllllllIIIll.get(n2);
                int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(((class_0814)object).IlIIlllllIIlIlIlllllIllll / 16.0);
                int n4 = MathHelper.IlIllllllIIlIIllllIIlIIIl(((class_0814)object).IllIIIIllIIllIllIlllIlIIl / 16.0);
                int n5 = 8;
                for (int i = -n5; i <= n5; ++i) {
                    for (n = -n5; n <= n5; ++n) {
                        bl4 = i == -n5 || i == n5 || n == -n5 || n == n5;
                        class_1108 class_11082 = new class_1108(i + n3, n + n4);
                        if (!bl4) {
                            this.lllIIIllIIIIlllIlIIllIIll.put(class_11082, false);
                            continue;
                        }
                        if (this.lllIIIllIIIIlllIlIIllIIll.containsKey(class_11082)) continue;
                        this.lllIIIllIIIIlllIlIIllIIll.put(class_11082, true);
                    }
                }
            }
            if (class_08142 != null) {
                this.IlIllllllIIlIIllllIIlIIIl = class_08142.lIlIIllIllIIIIIlIllllIIIl;
                this.lIlllIlllIIIIlIIlllIllIII = class_08142.llIIIlIlIlIIlIllIIIllIlIl;
            }
        }
        n2 = 0;
        object = class_09762.lIlIllIIlIIlIIlIIlIIlIIll();
        for (class_1012 class_10122 : class_1012.values()) {
            bl4 = false;
            n = class_09762.lllIIIllIIIIlllIlIIllIIll(class_10122.lllIIIllIIIIlllIlIIllIIll());
            if (class_10122.lIlllIlllIIIIlIIlllIllIII() && !bl2 || !class_10122.lIlllIlllIIIIlIIlllIllIII() && !bl || class_10122.IlIIIIIllllllIIlllIllllll() && !bl3 || n > class_10122.lllIlIIlIIIlIlIIIllIlllIl() * this.lllIIIllIIIIlllIlIIllIIll.size() / 256) continue;
            block6: for (class_1108 class_11082 : this.lllIIIllIIIIlllIlIIllIIll.keySet()) {
                if (((Boolean)this.lllIIIllIIIIlllIlIIllIIll.get(class_11082)).booleanValue()) continue;
                class_0723 class_07232 = class_09762.IlIIIIIllllllIIlllIllllll(class_11082.lllIIIllIIIIlllIlIIllIIll, class_11082.lllIlIIlIIIlIlIIIllIlllIl);
                int n6 = class_11082.lllIIIllIIIIlllIlIIllIIll * 16 + class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(16);
                int n7 = class_11082.lllIlIIlIIIlIlIIIllIlllIl * 16 + class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(16);
                int n8 = class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(class_07232 == null ? class_09762.IIlIIlIlIlIllIIlIlIIIIlll() : class_07232.lllIIIllIIIIlllIlIIllIIll() + 16 - 1);
                if (class_09762.a_(n6, n8, n7).IIIllIllIIlIlIlIlIllllIIl() || class_09762.a_(n6, n8, n7).lIllllIIlIIIlIllllllIIIll() != class_10122.IlIllllllIIlIIllllIIlIIIl()) continue;
                int n9 = 0;
                block7: for (int i = 0; i < 3; ++i) {
                    int n10 = n6;
                    int n11 = n8;
                    int n12 = n7;
                    int n13 = 6;
                    class_0920 class_09202 = null;
                    class_2025 class_20252 = null;
                    for (int j = 0; j < 4; ++j) {
                        class_0339 class_03392;
                        float f;
                        float f2;
                        float f3;
                        float f4;
                        float f5;
                        float f6;
                        float f7;
                        if (!class_0907.lllIIIllIIIIlllIlIIllIIll(class_10122, class_09762, n10 += class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(n13) - class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(n13), n11 += class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(1) - class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(1), n12 += class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(n13) - class_09762.lllllIlllIIllIlIIlIIIllII.nextInt(n13)) || class_09762.lllIIIllIIIIlllIlIIllIIll(f7 = (float)n10 + 0.5f, f6 = (float)n11, (double)(f5 = (float)n12 + 0.5f), 24.0) != null || !((f4 = (f3 = f7 - (float)((class_2208)object).lllIIIllIIIIlllIlIIllIIll) * f3 + (f2 = f6 - (float)((class_2208)object).lllIlIIlIIIlIlIIIllIlllIl) * f2 + (f = f5 - (float)((class_2208)object).IlIllllllIIlIIllllIIlIIIl) * f) >= 576.0f)) continue;
                        if (class_09202 == null && (class_09202 = class_09762.lllIIIllIIIIlllIlIIllIIll(class_10122, n10, n11, n12)) == null) continue block7;
                        try {
                            class_03392 = (class_0339)this.lllIlIIlIIIlIlIIIllIlllIl.get(class_09202.lllIIIllIIIIlllIlIIllIIll);
                            if (class_03392 == null) {
                                class_03392 = (class_0339)class_09202.lllIIIllIIIIlllIlIIllIIll.getConstructor(class_1334.class).newInstance(class_09762);
                                this.lllIlIIlIIIlIlIIIllIlllIl.put(class_09202.lllIIIllIIIIlllIlIIllIIll, class_03392);
                            }
                        }
                        catch (Exception exception) {
                            exception.printStackTrace();
                            return n2;
                        }
                        class_03392.lllIlIIlIIIlIlIIIllIlllIl(f7, f6, f5, class_09762.lllllIlllIIllIlIIlIIIllII.nextFloat() * 360.0f, 0.0f);
                        boolean bl5 = false;
                        bl5 = class_03392.lllIIlIIIllllllIIIIlIlIlI();
                        if (bl5) {
                            this.lllIlIIlIIIlIlIIIllIlllIl.put(class_09202.lllIIIllIIIIlllIlIIllIIll, null);
                            class_09762.lllIIIllIIIIlllIlIIllIIll(class_03392);
                            class_20252 = class_03392.lllIIIllIIIIlllIlIIllIIll(class_20252);
                            if (++n9 >= class_03392.llIIIlIIllIIllIllIIlIlllI()) continue block6;
                        }
                        n2 += n9;
                    }
                }
            }
        }
        return n2;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1012 class_10122, class_1334 class_13342, int n, int n2, int n3) {
        if (class_10122.IlIllllllIIlIIllllIIlIIIl() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            return class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll() && class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll() && !class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl();
        }
        if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3)) {
            return false;
        }
        Block class_05492 = class_13342.a_(n, n2 - 1, n3);
        return class_05492 != Blocks.IllIIlllllllIIlIIlIIIIlIl && !class_13342.a_(n, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && !class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIIIllIIIIlllIlIIllIIll() && !class_13342.a_(n, n2 + 1, n3).IIIllIllIIlIlIlIlIllllIIl();
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0672 class_06722, int n, int n2, int n3, int n4, Random random) {
        List list = class_06722.lllIIIllIIIIlllIlIIllIIll(class_1012.lllIlIIlIIIlIlIIIllIlllIl);
        if (!list.isEmpty()) {
            while (random.nextFloat() < class_06722.IIIllIIlIIIIIIlIlIIllIIlI()) {
                class_0920 class_09202 = (class_0920)class_0242.lllIIIllIIIIlllIlIIllIIll(class_13342.lllllIlllIIllIlIIlIIIllII, list);
                class_2025 class_20252 = null;
                int n5 = class_09202.lllIlIIlIIIlIlIIIllIlllIl + random.nextInt(1 + class_09202.IlIllllllIIlIIllllIIlIIIl - class_09202.lllIlIIlIIIlIlIIIllIlllIl);
                int n6 = n + random.nextInt(n3);
                int n7 = n2 + random.nextInt(n4);
                int n8 = n6;
                int n9 = n7;
                for (int i = 0; i < n5; ++i) {
                    boolean bl = false;
                    for (int j = 0; !bl && j < 4; ++j) {
                        int n10 = class_13342.IIIllIllIIlIlIlIlIllllIIl(n6, n7);
                        if (class_0907.lllIIIllIIIIlllIlIIllIIll(class_1012.lllIlIIlIIIlIlIIIllIlllIl, class_13342, n6, n10, n7)) {
                            class_0339 class_03392;
                            float f = (float)n6 + 0.5f;
                            float f2 = n10;
                            float f3 = (float)n7 + 0.5f;
                            try {
                                class_03392 = (class_0339)class_09202.lllIIIllIIIIlllIlIIllIIll.getConstructor(class_1334.class).newInstance(class_13342);
                            }
                            catch (Exception exception) {
                                exception.printStackTrace();
                                continue;
                            }
                            class_03392.lllIlIIlIIIlIlIIIllIlllIl(f, f2, f3, random.nextFloat() * 360.0f, 0.0f);
                            class_13342.lllIIIllIIIIlllIlIIllIIll(class_03392);
                            class_20252 = class_03392.lllIIIllIIIIlllIlIIllIIll(class_20252);
                            bl = true;
                        }
                        n6 += random.nextInt(5) - random.nextInt(5);
                        n7 += random.nextInt(5) - random.nextInt(5);
                        while (n6 < n || n6 >= n + n3 || n7 < n2 || n7 >= n2 + n3) {
                            n6 = n8 + random.nextInt(5) - random.nextInt(5);
                            n7 = n9 + random.nextInt(5) - random.nextInt(5);
                        }
                    }
                }
            }
        }
    }
}

