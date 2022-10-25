package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0207
extends class_1219 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0207(int n, int n2) {
        super(false);
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
        this.lllIIIllIIIIlllIlIIllIIll = n2;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        Block class_05492;
        while (((class_05492 = class_13342.a_(n, n2, n3)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) && n2 > 0) {
            --n2;
        }
        Block class_05493 = class_13342.a_(n, n2, n3);
        if (class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05493 == Blocks.IlIllllllIIlIIllllIIlIIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, ++n2, n3, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
            for (int i = n2; i <= n2 + 2; ++i) {
                int n4 = i - n2;
                int n5 = 2 - n4;
                for (int j = n - n5; j <= n + n5; ++j) {
                    int n6 = j - n;
                    for (int k = n3 - n5; k <= n3 + n5; ++k) {
                        int n7 = k - n3;
                        if (Math.abs(n6) == n5 && Math.abs(n7) == n5 && random.nextInt(2) == 0 || class_13342.a_(j, i, k).lllIIIllIIIIlllIlIIllIIll()) continue;
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, j, i, k, Blocks.lIlIlIIlIIIIlIIIIIlllIIII, this.lllIIIllIIIIlllIlIIllIIll);
                    }
                }
            }
        }
        return true;
    }
}

