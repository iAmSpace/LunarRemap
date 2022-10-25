package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0943
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll = Blocks.lIIllIlIIlIIlllllIlIIllIl;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0943(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        if (class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) {
            return false;
        }
        int n4 = random.nextInt(this.lllIlIIlIIIlIlIIIllIlllIl - 2) + 2;
        int n5 = 1;
        for (int i = n - n4; i <= n + n4; ++i) {
            for (int j = n3 - n4; j <= n3 + n4; ++j) {
                int n6 = i - n;
                int n7 = j - n3;
                if (n6 * n6 + n7 * n7 > n4 * n4) continue;
                for (int k = n2 - n5; k <= n2 + n5; ++k) {
                    Block class_05492 = class_13342.a_(i, k, j);
                    if (class_05492 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05492 != Blocks.lIIllIlIIlIIlllllIlIIllIl) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(i, k, j, this.lllIIIllIIIIlllIlIIllIIll, 0, 2);
                }
            }
        }
        return true;
    }
}

