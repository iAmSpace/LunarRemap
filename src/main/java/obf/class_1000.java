package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.Random;

public class class_1000 {
    protected int lllIIIllIIIIlllIlIIllIIll = 8;
    protected Random lllIlIIlIIIlIlIIIllIlllIl = new Random();
    protected class_1334 IlIllllllIIlIIllllIIlIIIl;

    public void lllIIIllIIIIlllIlIIllIIll(class_1848 class_18482, class_1334 class_13342, int n, int n2, Block[] arrclass_0549) {
        int n3 = this.lllIIIllIIIIlllIlIIllIIll;
        this.IlIllllllIIlIIllllIIlIIIl = class_13342;
        this.lllIlIIlIIIlIlIIIllIlllIl.setSeed(class_13342.lIlIlIIlIIIIlIIIIIlllIIII());
        long l = this.lllIlIIlIIIlIlIIIllIlllIl.nextLong();
        long l2 = this.lllIlIIlIIIlIlIIIllIlllIl.nextLong();
        for (int i = n - n3; i <= n + n3; ++i) {
            for (int j = n2 - n3; j <= n2 + n3; ++j) {
                long l3 = (long)i * l;
                long l4 = (long)j * l2;
                this.lllIlIIlIIIlIlIIIllIlllIl.setSeed(l3 ^ l4 ^ class_13342.lIlIlIIlIIIIlIIIIIlllIIII());
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, i, j, n, n2, arrclass_0549);
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, Block[] arrclass_0549) {
    }
}

