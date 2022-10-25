package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.ChatComponentTranslation;

import java.util.Random;

public class class_0736
extends class_0143 {
    public static final int[][] llllllIlIllllIlIlIlIIIIlI = new int[][]{{0, 1}, {-1, 0}, {0, -1}, {1, 0}};
    private IIcon[] lIlIIllllIlIIIIllIIIIlIIl;
    private IIcon[] llIlllIIllIlllIlIlIlIIIll;
    private IIcon[] IIIIlIIlIIIllIIIIllIIIlII;

    public class_0736() {
        super(class_1855.lllIIlIIIllllllIIIIlIlIlI);
        this.llIlllIIllIlllIlIlIlIIIll();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (!class_0736.IllIIlllllllIIlIIlIIIIlIl(n5)) {
            int n6 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n5);
            if (class_13342.a_(n += llllllIlIllllIlIlIlIIIIlI[n6][0], n2, n3 += llllllIlIllllIlIlIlIIIIlI[n6][1]) != this) {
                return true;
            }
            n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        }
        if (class_13342.IlIlIIlllIIlIllIIIlllllIl.IlIIIIIllllllIIlllIllllll() && class_13342.a_(n, n3) != class_0672.lIlIllIIlIIlIIlIIlIIlIIll) {
            class_0690 class_06902;
            if (class_0736.IIIllIllIIlIlIlIlIllllIIl(n5)) {
                class_0814 class_08143 = null;
                for (class_0814 class_08144 : class_13342.lIllllIIlIIIlIllllllIIIll) {
                    if (!class_08144.IIIIIllIIlIlIlIIlIlIlIllI()) continue;
                    class_2208 class_22082 = class_08144.lIlIIIlIlIllIlIlIIIlIlIII;
                    if (class_22082.lllIIIllIIIIlllIlIIllIIll != n || class_22082.lllIlIIlIIIlIlIIIllIlllIl != n2 || class_22082.IlIllllllIIlIIllllIIlIIIl != n3) continue;
                    class_08143 = class_08144;
                }
                if (class_08143 != null) {
                    class_08142.lllIlIIlIIIlIlIIIllIlllIl(new ChatComponentTranslation("tile.bed.occupied", new Object[0]));
                    return true;
                }
                class_0736.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, false);
            }
            if ((class_06902 = class_08142.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) == class_0690.lllIIIllIIIIlllIlIIllIIll) {
                class_0736.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, true);
                return true;
            }
            if (class_06902 == class_0690.IlIllllllIIlIIllllIIlIIIl) {
                class_08142.lllIlIIlIIIlIlIIIllIlllIl(new ChatComponentTranslation("tile.bed.noSleep", new Object[0]));
            } else if (class_06902 == class_0690.lIllllIIlIIIlIllllllIIIll) {
                class_08142.lllIlIIlIIIlIlIIIllIlllIl(new ChatComponentTranslation("tile.bed.notSafe", new Object[0]));
            }
            return true;
        }
        double d = (double)n + 0.5;
        double d2 = (double)n2 + 0.5;
        double d3 = (double)n3 + 0.5;
        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        int n7 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n5);
        if (class_13342.a_(n += llllllIlIllllIlIlIlIIIIlI[n7][0], n2, n3 += llllllIlIllllIlIlIlIIIIlI[n7][1]) == this) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            d = (d + (double)n + 0.5) / 2.0;
            d2 = (d2 + (double)n2 + 0.5) / 2.0;
            d3 = (d3 + (double)n3 + 0.5) / 2.0;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)null, (double)((float)n + 0.5f), (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), 5.0f, true, true);
        return true;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3;
        if (n == 0) {
            return Blocks.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(n);
        }
        int n4 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n2);
        int n5 = class_1632.IIIllIllIIlIlIlIlIllllIIl[n4][n];
        int n6 = n3 = class_0736.IllIIlllllllIIlIIlIIIIlIl(n2) ? 1 : 0;
        return !(n3 == 1 && n5 == 2 || n3 == 0 && n5 == 3) ? (n5 != 5 && n5 != 4 ? this.IIIIlIIlIIIllIIIIllIIIlII[n3] : this.llIlllIIllIlllIlIlIlIIIll[n3]) : this.lIlIIllllIlIIIIllIIIIlIIl[n3];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.IIIIlIIlIIIllIIIIllIIIlII = new IIcon[]{class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_feet_top"), class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_head_top")};
        this.lIlIIllllIlIIIIllIIIIlIIl = new IIcon[]{class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_feet_end"), class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_head_end")};
        this.llIlllIIllIlllIlIlIlIIIll = new IIcon[]{class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_feet_side"), class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_head_side")};
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 14;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.llIlllIIllIlllIlIlIlIIIll();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n4);
        if (class_0736.IllIIlllllllIIlIIlIIIIlIl(n4)) {
            if (class_13342.a_(n - llllllIlIllllIlIlIlIIIIlI[n5][0], n2, n3 - llllllIlIllllIlIlIlIIIIlI[n5][1]) != this) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
        } else if (class_13342.a_(n + llllllIlIllllIlIlIlIIIIlI[n5][0], n2, n3 + llllllIlIllllIlIlIlIIIIlI[n5][1]) != this) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
            }
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return class_0736.IllIIlllllllIIlIIlIIIIlIl(n) ? Item.lllIIIllIIIIlllIlIIllIIll(0) : Items.lllllIllllIIIIllIIlIlIlII;
    }

    private void llIlllIIllIlllIlIlIlIIIll() {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5625f, 1.0f);
    }

    public static boolean IllIIlllllllIIlIIlIIIIlIl(int n) {
        return (n & 8) != 0;
    }

    public static boolean IIIllIllIIlIlIlIlIllllIIl(int n) {
        return (n & 4) != 0;
    }

    public static void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        n4 = bl ? (n4 |= 4) : (n4 &= 0xFFFFFFFB);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 4);
    }

    public static class_2208 IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = class_0143.IllIIIllIIIIlIlIlIllIIlll(n5);
        for (int i = 0; i <= 1; ++i) {
            int n7 = n - llllllIlIllllIlIlIlIIIIlI[n6][0] * i - 1;
            int n8 = n3 - llllllIlIllllIlIlIlIIIIlI[n6][1] * i - 1;
            int n9 = n7 + 2;
            int n10 = n8 + 2;
            for (int j = n7; j <= n9; ++j) {
                for (int k = n8; k <= n10; ++k) {
                    if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, j, n2 - 1, k) || class_13342.a_(j, n2, k).lIllllIIlIIIlIllllllIIIll().IllIIIllIIIIlIlIlIllIIlll() || class_13342.a_(j, n2 + 1, k).lIllllIIlIIIlIllllllIIIll().IllIIIllIIIIlIlIlIllIIlll()) continue;
                    if (n4 <= 0) {
                        return new class_2208(j, n2, k);
                    }
                    --n4;
                }
            }
        }
        return null;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        if (!class_0736.IllIIlllllllIIlIIlIIIIlIl(n4)) {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, 0);
        }
    }

    @Override
    public int llIIIlllIlllIlIllIIIIllIl() {
        return 1;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.lllllIllllIIIIllIIlIlIlII;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        int n5;
        if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && class_0736.IllIIlllllllIIlIIlIIIIlIl(n4) && class_13342.a_(n -= llllllIlIllllIlIlIlIIIIlI[n5 = class_0736.IllIIIllIIIIlIlIlIllIIlll(n4)][0], n2, n3 -= llllllIlIllllIlIlIlIIIIlI[n5][1]) == this) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }
}

