package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1467
extends class_0672 {
    private class_1067 lIIllIIlIIIlllIlllIIlIIlI = new class_1580(Blocks.lIIIIlIlIlIIIlIIllIIlIlIl, 8);
    private class_1121 IllIIllIlIlllIllIllIlIIIl = new class_1121(false);
    private int IIIlIllllIIIlllllIllIlIII = 0;
    private int IIIIIllIlIllIlIlIIlIllIIl = 1;
    private int lIIllIlIIlIIlllllIlIIllIl = 2;
    private int lIIlllIIlIlIlIIIlIlllIIll = this.IIIlIllllIIIlllllIllIlIII;

    protected class_1467(int n, boolean bl) {
        super(n);
        if (bl) {
            this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 3;
            this.lIIlllIIlIlIlIIIlIlllIIll = this.IIIIIllIlIllIlIlIIlIllIIl;
        }
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return random.nextInt(3) > 0 ? this.IllIIllIlIlllIllIllIlIIIl : super.lllIIIllIIIIlllIlIIllIIll(random);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        int n3;
        int n4;
        int n5;
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
        int n6 = 3 + random.nextInt(6);
        for (n5 = 0; n5 < n6; ++n5) {
            int n7;
            n4 = n + random.nextInt(16);
            if (class_13342.a_(n4, n3 = random.nextInt(28) + 4, n7 = n2 + random.nextInt(16)) != Blocks.lllIlIIlIIIlIlIIIllIlllIl) continue;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n4, n3, n7, Blocks.lIIIIlIIIIllIlIIllllIlIII, 0, 2);
        }
        for (n6 = 0; n6 < 7; ++n6) {
            n5 = n + random.nextInt(16);
            n4 = random.nextInt(64);
            n3 = n2 + random.nextInt(16);
            this.lIIllIIlIIIlllIlllIIlIIlI.a_(class_13342, random, n5, n4, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, Block[] arrclass_0549, byte[] arrby, int n, int n2, double d) {
        this.IlllIIIllllIIllIllIlIIlIl = Blocks.IlIllllllIIlIIllllIIlIIIl;
        this.lllIIIlIIlIlIllIIIIIlIIll = 0;
        this.IIIlIlIllIlllllIlIllllllI = Blocks.lIlllIlllIIIIlIIlllIllIII;
        if ((d < -1.0 || d > 2.0) && this.lIIlllIIlIlIlIIIlIlllIIll == this.lIIllIlIIlIIlllllIlIIllIl) {
            this.IlllIIIllllIIllIllIlIIlIl = Blocks.lllIIlIIIllllllIIIIlIlIlI;
            this.IIIlIlIllIlllllIlIllllllI = Blocks.lllIIlIIIllllllIIIIlIlIlI;
        } else if (d > 1.0 && this.lIIlllIIlIlIlIIIlIlllIIll != this.IIIIIllIlIllIlIlIIlIllIIl) {
            this.IlllIIIllllIIllIllIlIIlIl = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
            this.IIIlIlIllIlllllIlIllllllI = Blocks.lllIlIIlIIIlIlIIIllIlllIl;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, arrclass_0549, arrby, n, n2, d);
    }

    private class_1467 lllIlIIlIIIlIlIIIllIlllIl(class_0672 class_06722) {
        this.lIIlllIIlIlIlIIIlIlllIIll = this.lIIllIlIIlIIlllllIlIIllIl;
        this.lllIIIllIIIIlllIlIIllIIll(class_06722.llllIIllIlIlllllllIIlIIlI, true);
        this.lllIIIllIIIIlllIlIIllIIll(class_06722.IlIIIlIllIIIllIIIIlIIlIll + " M");
        this.lllIIIllIIIIlllIlIIllIIll(new class_0753(class_06722.llllIlIIllIIlllllIIllIIll, class_06722.IlIlIllIIlIIIIlllIlIllIlI));
        this.lllIIIllIIIIlllIlIIllIIll(class_06722.IlIIllIlIlIllIIIlIIlIlIIl, class_06722.lIlIIllIllIIIIIlIllllIIIl);
        return this;
    }

    @Override
    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        return new class_1467(this.lIlIllIIllIIIIlllIlIlllIl + 128, false).lllIlIIlIIIlIlIIIllIlllIl(this);
    }
}

