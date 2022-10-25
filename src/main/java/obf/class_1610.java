package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1610
extends class_1899 {
    public static final int[][] llllllIlIllllIlIlIlIIIIlI = new int[][]{new int[0], {3, 1}, {2, 0}};

    public class_1610() {
        super("portal", class_1855.IIlIIlIlIlIllIIlIlIIIIlll, false);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
        if (class_13342.IlIlIIlllIIlIllIIIlllllIl.lIlllIlllIIIIlIIlllIllIII() && class_13342.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("doMobSpawning") && random.nextInt(2000) < class_13342.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll()) {
            class_1521 class_15212;
            int n4;
            for (n4 = n2; !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n4, n3) && n4 > 0; --n4) {
            }
            if (n4 > 0 && !class_13342.a_(n, n4 + 1, n3).IIIllIllIIlIlIlIlIllllIIl() && (class_15212 = class_2126.lllIIIllIIIIlllIlIIllIIll(class_13342, 57, (double)n + 0.5, (double)n4 + 1.1, (double)n3 + 0.5)) != null) {
                class_15212.lIIIlIIllIllIIlIIlIIIllII = class_15212.lIlllIIllIIIIIIlIlIIlIllI();
            }
        }
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_1610.IllIIlllllllIIlIIlIIIIlIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
        if (n4 == 0) {
            n4 = class_18432.a_(n - 1, n2, n3) != this && class_18432.a_(n + 1, n2, n3) != this ? 2 : 1;
            if (class_18432 instanceof class_1334 && !((class_1334)class_18432).IllIIIIllIIllIllIlllIlIIl) {
                ((class_1334)class_18432).lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 2);
            }
        }
        float f = 0.125f;
        float f2 = 0.125f;
        if (n4 == 1) {
            f = 0.5f;
        }
        if (n4 == 2) {
            f2 = 0.5f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f2, 0.5f + f, 1.0f, 0.5f + f2);
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    public boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        class_0930 class_09302 = new class_0930(class_13342, n, n2, n3, 1);
        class_0930 class_09303 = new class_0930(class_13342, n, n2, n3, 2);
        if (class_09302.lllIlIIlIIIlIlIIIllIlllIl() && class_0930.lllIIIllIIIIlllIlIIllIIll(class_09302) == 0) {
            class_09302.IlIllllllIIlIIllllIIlIIIl();
            return true;
        }
        if (class_09303.lllIlIIlIIIlIlIIIllIlllIl() && class_0930.lllIIIllIIIIlllIlIIllIIll(class_09303) == 0) {
            class_09303.IlIllllllIIlIIllllIIlIIIl();
            return true;
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        int n4 = class_1610.IllIIlllllllIIlIIlIIIIlIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
        class_0930 class_09302 = new class_0930(class_13342, n, n2, n3, 1);
        class_0930 class_09303 = new class_0930(class_13342, n, n2, n3, 2);
        if (!(n4 != 1 || class_09302.lllIlIIlIIIlIlIIIllIlllIl() && class_0930.lllIIIllIIIIlllIlIIllIIll(class_09302) >= class_0930.lllIlIIlIIIlIlIIIllIlllIl(class_09302) * class_0930.IlIllllllIIlIIllllIIlIIIl(class_09302))) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lllIIIllIIIIlllIlIIllIIll);
        } else if (!(n4 != 2 || class_09303.lllIlIIlIIIlIlIIIllIlllIl() && class_0930.lllIIIllIIIIlllIlIIllIIll(class_09303) >= class_0930.lllIlIIlIIIlIlIIIllIlllIl(class_09303) * class_0930.IlIllllllIIlIIllllIIlIIIl(class_09303))) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lllIIIllIIIIlllIlIIllIIll);
        } else if (n4 == 0 && !class_09302.lllIlIIlIIIlIlIIIllIlllIl() && !class_09303.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lllIIIllIIIIlllIlIIllIIll);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        boolean bl;
        int n5 = 0;
        if (class_18432.a_(n, n2, n3) == this) {
            n5 = class_1610.IllIIlllllllIIlIIlIIIIlIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
            if (n5 == 0) {
                return false;
            }
            if (n5 == 2 && n4 != 5 && n4 != 4) {
                return false;
            }
            if (n5 == 1 && n4 != 3 && n4 != 2) {
                return false;
            }
        }
        boolean bl2 = class_18432.a_(n - 1, n2, n3) == this && class_18432.a_(n - 2, n2, n3) != this;
        boolean bl3 = class_18432.a_(n + 1, n2, n3) == this && class_18432.a_(n + 2, n2, n3) != this;
        boolean bl4 = class_18432.a_(n, n2, n3 - 1) == this && class_18432.a_(n, n2, n3 - 2) != this;
        boolean bl5 = class_18432.a_(n, n2, n3 + 1) == this && class_18432.a_(n, n2, n3 + 2) != this;
        boolean bl6 = bl2 || bl3 || n5 == 1;
        boolean bl7 = bl = bl4 || bl5 || n5 == 2;
        return bl6 && n4 == 4 ? true : (bl6 && n4 == 5 ? true : (bl && n4 == 2 ? true : bl && n4 == 3));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public int lllllIlllIIllIlIIlIIIllII() {
        return 1;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        if (class_15212.IlIIIlIIIIllIIIllIIIIIIll == null && class_15212.lIlIlIIlIIIIlIIIIIlllIIII == null) {
            class_15212.lIlIIllIllIIIIIlIllllIIIl();
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (random.nextInt(100) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "portal.portal", 0.5f, random.nextFloat() * 0.4f + 0.8f, false);
        }
        for (int i = 0; i < 4; ++i) {
            double d = (float)n + random.nextFloat();
            double d2 = (float)n2 + random.nextFloat();
            double d3 = (float)n3 + random.nextFloat();
            double d4 = 0.0;
            double d5 = 0.0;
            double d6 = 0.0;
            int n4 = random.nextInt(2) * 2 - 1;
            d4 = ((double)random.nextFloat() - 0.5) * 0.5;
            d5 = ((double)random.nextFloat() - 0.5) * 0.5;
            d6 = ((double)random.nextFloat() - 0.5) * 0.5;
            if (class_13342.a_(n - 1, n2, n3) != this && class_13342.a_(n + 1, n2, n3) != this) {
                d = (double)n + 0.5 + 0.25 * (double)n4;
                d4 = random.nextFloat() * 2.0f * (float)n4;
            } else {
                d3 = (double)n3 + 0.5 + 0.25 * (double)n4;
                d6 = random.nextFloat() * 2.0f * (float)n4;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll("portal", d, d2, d3, d4, d5, d6);
        }
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return n & 3;
    }
}

