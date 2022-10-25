package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0126
extends class_0672 {
    protected class_0126(int n) {
        super(n);
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 2;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 1;
        this.llIIIlIlIlIIlIllIIIllIlIl.IlIIlllllIIlIlIlllllIllll = 1;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIlIlllIIllIlIlllIllI = 8;
        this.llIIIlIlIlIIlIllIIIllIlIl.IllIIIIllIIllIllIlllIlIIl = 10;
        this.llIIIlIlIlIIlIllIIIllIlIl.IIIIlIllIlIIlIIlIllIlIlll = 1;
        this.llIIIlIlIlIIlIllIIIllIlIl.lIlIllIIlIIlIIlIIlIIlIIll = 4;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIIlllIlllIlIllIIIIllIl = 0;
        this.llIIIlIlIlIIlIllIIIllIlIl.IIlIIlIlIlIllIIlIlIIIIlll = 0;
        this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 5;
        this.lIlllIIllIIIIIIlIlIIlIllI = 14745518;
        this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_2105.class, 1, 1, 1));
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return this.lIIIIllIIllIIIlIIIllIllII;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n, int n2, int n3) {
        double d = IllllIIlIIIllIlllIlllIllI.lllIIIllIIIIlllIlIIllIIll((double)n * 0.0225, (double)n3 * 0.0225);
        return d < -0.1 ? 5011004 : 6975545;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl(int n, int n2, int n3) {
        return 6975545;
    }

    @Override
    public String lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2, int n3) {
        return class_1209.llllllIlIllllIlIlIlIIIIlI[1];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, Block[] arrclass_0549, byte[] arrby, int n, int n2, double d) {
        double d2 = IllllIIlIIIllIlllIlllIllI.lllIIIllIIIIlllIlIIllIIll((double)n * 0.25, (double)n2 * 0.25);
        if (d2 > 0.0) {
            int n3 = n & 0xF;
            int n4 = n2 & 0xF;
            int n5 = arrclass_0549.length / 256;
            for (int i = 255; i >= 0; --i) {
                int n6 = (n4 * 16 + n3) * n5 + i;
                if (arrclass_0549[n6] != null && arrclass_0549[n6].lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
                if (i != 62 || arrclass_0549[n6] == Blocks.IllIIIllIIIIlIlIlIllIIlll) break;
                arrclass_0549[n6] = Blocks.IllIIIllIIIIlIlIlIllIIlll;
                if (!(d2 < 0.12)) break;
                arrclass_0549[n6 + 1] = Blocks.IlIIIIIIIIIIlIIlllIIIlIlI;
                break;
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, arrclass_0549, arrby, n, n2, d);
    }
}

