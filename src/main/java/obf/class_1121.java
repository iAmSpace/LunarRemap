package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1121
extends class_1174 {
    public class_1121(boolean bl) {
        super(bl);
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(4) + 6;
        int n5 = 1 + random.nextInt(2);
        int n6 = n4 - n5;
        int n7 = 2 + random.nextInt(2);
        boolean bl = true;
        if (n2 >= 1 && n2 + n4 + 1 <= 256) {
            int n8;
            int n9;
            int n10;
            int n11;
            for (int i = n2; i <= n2 + 1 + n4 && bl; ++i) {
                n11 = 1;
                n10 = i - n2 < n5 ? 0 : n7;
                for (n9 = n - n10; n9 <= n + n10 && bl; ++n9) {
                    for (n8 = n3 - n10; n8 <= n3 + n10 && bl; ++n8) {
                        if (i >= 0 && i < 256) {
                            Block class_05492 = class_13342.a_(n9, i, n8);
                            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
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
                int n12;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
                n10 = random.nextInt(2);
                n9 = 1;
                n11 = 0;
                for (n12 = 0; n12 <= n6; ++n12) {
                    n8 = n2 + n4 - n12;
                    for (int i = n - n10; i <= n + n10; ++i) {
                        int n13 = i - n;
                        for (int j = n3 - n10; j <= n3 + n10; ++j) {
                            int n14 = j - n3;
                            if (Math.abs(n13) == n10 && Math.abs(n14) == n10 && n10 > 0 || class_13342.a_(i, n8, j).lllIIIllIIIIlllIlIIllIIll()) continue;
                            this.lllIIIllIIIIlllIlIIllIIll(class_13342, i, n8, j, Blocks.lIlIlIIlIIIIlIIIIIlllIIII, 1);
                        }
                    }
                    if (n10 >= n9) {
                        n10 = n11;
                        n11 = 1;
                        if (++n9 <= n7) continue;
                        n9 = n7;
                        continue;
                    }
                    ++n10;
                }
                n12 = random.nextInt(3);
                for (n8 = 0; n8 < n4 - n12; ++n8) {
                    Block class_05494 = class_13342.a_(n, n2 + n8, n3);
                    if (class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n8, n3, Blocks.log, 1);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

