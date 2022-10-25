package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1619
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll;

    public class_1619(Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        if (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) && class_13342.a_(n, n2 - 1, n3) == this.lllIIIllIIIIlllIlIIllIIll) {
            int n4;
            int n5;
            int n6;
            int n7;
            int n8 = random.nextInt(32) + 6;
            int n9 = random.nextInt(4) + 1;
            for (n7 = n - n9; n7 <= n + n9; ++n7) {
                for (n6 = n3 - n9; n6 <= n3 + n9; ++n6) {
                    n5 = n7 - n;
                    n4 = n6 - n3;
                    if (n5 * n5 + n4 * n4 > n9 * n9 + 1 || class_13342.a_(n7, n2 - 1, n6) == this.lllIIIllIIIIlllIlIIllIIll) continue;
                    return false;
                }
            }
            for (n7 = n2; n7 < n2 + n8 && n7 < 256; ++n7) {
                for (n6 = n - n9; n6 <= n + n9; ++n6) {
                    for (n5 = n3 - n9; n5 <= n3 + n9; ++n5) {
                        n4 = n6 - n;
                        int n10 = n5 - n3;
                        if (n4 * n4 + n10 * n10 > n9 * n9 + 1) continue;
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n7, n5, Blocks.obsidian, 0, 2);
                    }
                }
            }
            class_0355 class_03552 = new class_0355(class_13342);
            class_03552.lllIlIIlIIIlIlIIIllIlllIl((float)n + 0.5f, n2 + n8, (float)n3 + 0.5f, random.nextFloat() * 360.0f, 0.0f);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_03552);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + n8, n3, Blocks.IllIIlllllllIIlIIlIIIIlIl, 0, 2);
            return true;
        }
        return false;
    }
}

