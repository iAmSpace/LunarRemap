package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0862
extends class_1067 {
    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
            return false;
        }
        if (class_13342.a_(n, n2 + 1, n3) != Blocks.lllllllIlIIlIlIIIlIlIIlll) {
            return false;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IIIIlllIIlIllllllIllIIlll, 0, 2);
        for (int i = 0; i < 1500; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(8) - random.nextInt(8);
            if (class_13342.a_(n6, n5 = n2 - random.nextInt(12), n4 = n3 + random.nextInt(8) - random.nextInt(8)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
            int n7 = 0;
            for (int j = 0; j < 6; ++j) {
                Block class_05492 = null;
                if (j == 0) {
                    class_05492 = class_13342.a_(n6 - 1, n5, n4);
                }
                if (j == 1) {
                    class_05492 = class_13342.a_(n6 + 1, n5, n4);
                }
                if (j == 2) {
                    class_05492 = class_13342.a_(n6, n5 - 1, n4);
                }
                if (j == 3) {
                    class_05492 = class_13342.a_(n6, n5 + 1, n4);
                }
                if (j == 4) {
                    class_05492 = class_13342.a_(n6, n5, n4 - 1);
                }
                if (j == 5) {
                    class_05492 = class_13342.a_(n6, n5, n4 + 1);
                }
                if (class_05492 != Blocks.IIIIlllIIlIllllllIllIIlll) continue;
                ++n7;
            }
            if (n7 != true) continue;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, Blocks.IIIIlllIIlIllllllIllIIlll, 0, 2);
        }
        return true;
    }
}

