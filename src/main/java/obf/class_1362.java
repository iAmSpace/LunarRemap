package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.Random;

public class class_1362
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll;
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_1362(Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Block class_05492, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        for (int i = 0; i < 64; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(8) - random.nextInt(8);
            if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5 = n2 + random.nextInt(4) - random.nextInt(4), n4 = n3 + random.nextInt(8) - random.nextInt(8)) || class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIIlIIIIIIlIlIIllIIlI && n5 >= 255 || !this.lllIIIllIIIIlllIlIIllIIll.lIllllIIlIIIlIllllllIIIll(class_13342, n6, n5, n4)) continue;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, 2);
        }
        return true;
    }
}

