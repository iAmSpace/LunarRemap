package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public abstract class class_0120
extends class_1174 {
    protected final int lllIIIllIIIIlllIlIIllIIll;
    protected final int lllIlIIlIIIlIlIIIllIlllIl;
    protected final int IlIllllllIIlIIllllIIlIIIl;
    protected int lIlllIlllIIIIlIIlllIllIII;

    public class_0120(boolean bl, int n, int n2, int n3, int n4) {
        super(bl);
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lIlllIlllIIIIlIIlllIllIII = n2;
        this.lllIlIIlIIIlIlIIIllIlllIl = n3;
        this.IlIllllllIIlIIllllIIlIIIl = n4;
    }

    protected int lllIIIllIIIIlllIlIIllIIll(Random random) {
        int n = random.nextInt(3) + this.lllIIIllIIIIlllIlIIllIIll;
        if (this.lIlllIlllIIIIlIIlllIllIII > 1) {
            n += random.nextInt(this.lIlllIlllIIIIlIIlllIllIII);
        }
        return n;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3, int n4) {
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
            for (int i = n2; i <= n2 + 1 + n4; ++i) {
                int n5 = 2;
                if (i == n2) {
                    n5 = 1;
                }
                if (i >= n2 + 1 + n4 - 2) {
                    n5 = 2;
                }
                for (int j = n - n5; j <= n + n5 && bl; ++j) {
                    for (int k = n3 - n5; k <= n3 + n5 && bl; ++k) {
                        if (i >= 0 && i < 256) {
                            Block class_05492 = class_13342.a_(j, i, k);
                            if (this.lllIIIllIIIIlllIlIIllIIll(class_05492)) continue;
                            bl = false;
                            continue;
                        }
                        bl = false;
                    }
                }
            }
            return bl;
        }
        return false;
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2 - 1, n3);
        if ((class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII) && n2 >= 2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII, 0, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII, 0, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3 + 1, Blocks.lIlllIlllIIIIlIIlllIllIII, 0, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 - 1, n3 + 1, Blocks.lIlllIlllIIIIlIIlllIllIII, 0, 2);
            return true;
        }
        return false;
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3, int n4) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, n, n2, n3, n4) && this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, n, n2, n3);
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, Random random) {
        int n5 = n4 * n4;
        for (int i = n - n4; i <= n + n4 + 1; ++i) {
            int n6 = i - n;
            for (int j = n3 - n4; j <= n3 + n4 + 1; ++j) {
                Block class_05492;
                int n7 = j - n3;
                int n8 = n6 - 1;
                int n9 = n7 - 1;
                if (n6 * n6 + n7 * n7 > n5 && n8 * n8 + n9 * n9 > n5 && n6 * n6 + n9 * n9 > n5 && n8 * n8 + n7 * n7 > n5 || (class_05492 = class_13342.a_(i, n2, j)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, i, n2, j, Blocks.lIlIlIIlIIIIlIIIIIlllIIII, this.IlIllllllIIlIIllllIIlIIIl);
            }
        }
    }

    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4, Random random) {
        int n5 = n4 * n4;
        for (int i = n - n4; i <= n + n4; ++i) {
            int n6 = i - n;
            for (int j = n3 - n4; j <= n3 + n4; ++j) {
                Block class_05492;
                int n7 = j - n3;
                if (n6 * n6 + n7 * n7 > n5 || (class_05492 = class_13342.a_(i, n2, j)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, i, n2, j, Blocks.lIlIlIIlIIIIlIIIIIlllIIII, this.IlIllllllIIlIIllllIIlIIIl);
            }
        }
    }
}

