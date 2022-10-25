package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0294
extends class_1067 {
    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = n;
        int n5 = n3;
        while (n2 < 128) {
            if (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
                for (int i = 2; i <= 5; ++i) {
                    if (!Blocks.lIIlIlllIIlIIIIlIlIIIIlll.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, i)) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 1 << class_1632.IlIIIIIllllllIIlllIllllll[class_0573.lllIIIllIIIIlllIlIIllIIll[i]], 2);
                    break;
                }
            } else {
                n = n4 + random.nextInt(4) - random.nextInt(4);
                n3 = n5 + random.nextInt(4) - random.nextInt(4);
            }
            ++n2;
        }
        return true;
    }
}

