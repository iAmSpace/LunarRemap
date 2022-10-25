package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1828
extends class_1067 {
    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        for (int i = 0; i < 20; ++i) {
            int n4 = n + random.nextInt(4) - random.nextInt(4);
            int n5 = n2;
            int n6 = n3 + random.nextInt(4) - random.nextInt(4);
            if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n4, n2, n6) || class_13342.a_(n4 - 1, n2 - 1, n6).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl && class_13342.a_(n4 + 1, n2 - 1, n6).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl && class_13342.a_(n4, n2 - 1, n6 - 1).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl && class_13342.a_(n4, n2 - 1, n6 + 1).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) continue;
            int n7 = 2 + random.nextInt(random.nextInt(3) + 1);
            for (int j = 0; j < n7; ++j) {
                if (!Blocks.lIIlllIIlIlIlIIIlIlllIIll.lIllllIIlIIIlIllllllIIIll(class_13342, n4, n5 + j, n6)) continue;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n5 + j, n6, Blocks.lIIlllIIlIlIlIIIlIlllIIll, 0, 2);
            }
        }
        return true;
    }
}

