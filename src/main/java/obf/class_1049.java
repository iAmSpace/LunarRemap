package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1049
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll = Blocks.lllIlIlIIIlIllllIlllIlIlI;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_1049(int n) {
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        while (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) && n2 > 2) {
            --n2;
        }
        if (class_13342.a_(n, n2, n3) != Blocks.IIIlIllllIIIlllllIllIlIII) {
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
                    if (class_05492 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05492 != Blocks.IIIlIllllIIIlllllIllIlIII && class_05492 != Blocks.IllIIllIlIlllIllIllIlIIIl) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(i, k, j, this.lllIIIllIIIIlllIlIIllIIll, 0, 2);
                }
            }
        }
        return true;
    }
}

