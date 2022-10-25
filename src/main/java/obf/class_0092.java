package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0092
extends class_1067 {
    private int lllIIIllIIIIlllIlIIllIIll;

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        boolean bl = false;
        for (int i = 0; i < 64; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(8) - random.nextInt(8);
            if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5 = n2 + random.nextInt(4) - random.nextInt(4), n4 = n3 + random.nextInt(8) - random.nextInt(8)) || class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI && n5 >= 254 || !Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI.IlIIIIIllllllIIlllIllllll(class_13342, n6, n5, n4)) continue;
            Blocks.IIIlIlIIlIIlIlIIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl(class_13342, n6, n5, n4, this.lllIIIllIIIIlllIlIIllIIll, 2);
            bl = true;
        }
        return bl;
    }
}

