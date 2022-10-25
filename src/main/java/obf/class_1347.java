package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1347
extends class_1174 {
    private boolean lllIIIllIIIIlllIlIIllIIll;

    public class_1347(boolean bl, boolean bl2) {
        super(bl);
        this.lllIIIllIIIIlllIlIIllIIll = bl2;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(3) + 5;
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            n4 += random.nextInt(7);
        }
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
            int n5;
            int n6;
            int n7;
            for (int i = n2; i <= n2 + 1 + n4; ++i) {
                n7 = 1;
                if (i == n2) {
                    n7 = 0;
                }
                if (i >= n2 + 1 + n4 - 2) {
                    n7 = 2;
                }
                for (n6 = n - n7; n6 <= n + n7 && bl; ++n6) {
                    for (n5 = n3 - n7; n5 <= n3 + n7 && bl; ++n5) {
                        if (i >= 0 && i < 256) {
                            Block class_05492 = class_13342.a_(n6, i, n5);
                            if (this.lllIIIllIIIIlllIlIIllIIll(class_05492)) continue;
                            bl = false;
                            continue;
                        }
                        bl = false;
                    }
                }
            }
            if (!bl) {
                return false;
            }
            Block class_05493 = class_13342.a_(n, n2 - 1, n3);
            if ((class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05493 == Blocks.IIIlIlIllIlllllIlIllllllI) && n2 < 256 - n4 - 1) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
                for (n7 = n2 - 3 + n4; n7 <= n2 + n4; ++n7) {
                    n6 = n7 - (n2 + n4);
                    n5 = 1 - n6 / 2;
                    for (int i = n - n5; i <= n + n5; ++i) {
                        int n8 = i - n;
                        for (int j = n3 - n5; j <= n3 + n5; ++j) {
                            Block class_05494;
                            int n9 = j - n3;
                            if (Math.abs(n8) == n5 && Math.abs(n9) == n5 && (random.nextInt(2) == 0 || n6 == 0) || (class_05494 = class_13342.a_(i, n7, j)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                            this.lllIIIllIIIIlllIlIIllIIll(class_13342, i, n7, j, Blocks.lIlIlIIlIIIIlIIIIIlllIIII, 2);
                        }
                    }
                }
                for (n7 = 0; n7 < n4; ++n7) {
                    Block class_05495 = class_13342.a_(n, n2 + n7, n3);
                    if (class_05495.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05495.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n7, n3, Blocks.log, 2);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

