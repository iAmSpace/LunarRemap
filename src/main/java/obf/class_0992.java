package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0992
extends class_1067 {
    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        for (int i = 0; i < 10; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(8) - random.nextInt(8);
            if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5 = n2 + random.nextInt(4) - random.nextInt(4), n4 = n3 + random.nextInt(8) - random.nextInt(8)) || !Blocks.IlIIIIIIIIIIlIIlllIIIlIlI.IlIIIIIllllllIIlllIllllll(class_13342, n6, n5, n4)) continue;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, Blocks.IlIIIIIIIIIIlIIlllIIIlIlI, 0, 2);
        }
        return true;
    }
}

