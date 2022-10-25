package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1704
extends class_1174 {
    public class_1704() {
        super(false);
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = random.nextInt(5) + 7;
        int n5 = n4 - random.nextInt(2) - 3;
        int n6 = n4 - n5;
        int n7 = 1 + random.nextInt(n6 + 1);
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
            if ((class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII) && n2 < 256 - n4 - 1) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
                n10 = 0;
                for (n9 = n2 + n4; n9 >= n2 + n5; --n9) {
                    for (n8 = n - n10; n8 <= n + n10; ++n8) {
                        n11 = n8 - n;
                        for (int i = n3 - n10; i <= n3 + n10; ++i) {
                            int n12 = i - n3;
                            if (Math.abs(n11) == n10 && Math.abs(n12) == n10 && n10 > 0 || class_13342.a_(n8, n9, i).lllIIIllIIIIlllIlIIllIIll()) continue;
                            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n8, n9, i, Blocks.lIlIlIIlIIIIlIIIIIlllIIII, 1);
                        }
                    }
                    if (n10 >= 1 && n9 == n2 + n5 + 1) {
                        --n10;
                        continue;
                    }
                    if (n10 >= n7) continue;
                    ++n10;
                }
                for (n9 = 0; n9 < n4 - 1; ++n9) {
                    Block class_05494 = class_13342.a_(n, n2 + n9, n3);
                    if (class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05494.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n9, n3, Blocks.log, 1);
                }
                return true;
            }
            return false;
        }
        return false;
    }
}

