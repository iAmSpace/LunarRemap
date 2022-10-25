package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0765
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0765(Block class_05492, int n) {
        super(false);
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        Block class_05492;
        while (n2 > 3 && (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3) || (class_05492 = class_13342.a_(n, n2 - 1, n3)) != Blocks.IlIllllllIIlIIllllIIlIIIl && class_05492 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05492 != Blocks.lllIlIIlIIIlIlIIIllIlllIl)) {
            --n2;
        }
        if (n2 <= 3) {
            return false;
        }
        int n4 = this.lllIlIIlIIIlIlIIIllIlllIl;
        for (int i = 0; n4 >= 0 && i < 3; ++i) {
            int n5 = n4 + random.nextInt(2);
            int n6 = n4 + random.nextInt(2);
            int n7 = n4 + random.nextInt(2);
            float f = (float)(n5 + n6 + n7) * 0.333f + 0.5f;
            for (int j = n - n5; j <= n + n5; ++j) {
                for (int k = n3 - n7; k <= n3 + n7; ++k) {
                    for (int i2 = n2 - n6; i2 <= n2 + n6; ++i2) {
                        float f2 = j - n;
                        float f3 = k - n3;
                        float f4 = i2 - n2;
                        if (!(f2 * f2 + f3 * f3 + f4 * f4 <= f * f)) continue;
                        class_13342.lllIIIllIIIIlllIlIIllIIll(j, i2, k, this.lllIIIllIIIIlllIlIIllIIll, 0, 4);
                    }
                }
            }
            n += -(n4 + 1) + random.nextInt(2 + n4 * 2);
            n3 += -(n4 + 1) + random.nextInt(2 + n4 * 2);
            n2 += 0 - random.nextInt(2);
        }
        return true;
    }
}

