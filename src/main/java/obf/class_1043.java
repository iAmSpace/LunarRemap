package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1043
extends class_0672 {
    private static final class_1704 lIIllIIlIIIlllIlllIIlIIlI = new class_1704();
    private static final class_1121 IllIIllIlIlllIllIllIlIIIl = new class_1121(false);
    private static final class_0392 IIIlIllllIIIlllllIllIlIII = new class_0392(false, false);
    private static final class_0392 IIIIIllIlIllIlIlIIlIllIIl = new class_0392(false, true);
    private static final class_0765 lIIllIlIIlIIlllllIlIIllIl = new class_0765(Blocks.llIlllIlIIllIlIIIIllIIlIl, 0);
    private int lIIlllIIlIlIlIIIlIlllIIll;

    public class_1043(int n, int n2) {
        super(n);
        this.lIIlllIIlIlIlIIIlIlllIIll = n2;
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1305.class, 8, 4, 4));
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = 10;
        if (n2 != 1 && n2 != 2) {
            this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 1;
            this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIlIlllIIllIlIlllIllI = 1;
        } else {
            this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 7;
            this.llIIIlIlIlIIlIllIIIllIlIl.IlIIlllllIIlIlIlllllIllll = 1;
            this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIlIlllIIllIlIlllIllI = 3;
        }
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return (this.lIIlllIIlIlIlIIIlIlllIIll == 1 || this.lIIlllIIlIlIlIIIlIlllIIll == 2) && random.nextInt(3) == 0 ? (this.lIIlllIIlIlIlIIIlIlllIIll != 2 && random.nextInt(13) != 0 ? IIIlIllllIIIlllllIllIlIII : IIIIIllIlIllIlIlIIlIllIIl) : (random.nextInt(3) == 0 ? lIIllIIlIIIlllIlllIIlIIlI : IllIIllIlIlllIllIllIlIIIl);
    }

    @Override
    public class_1067 lllIlIIlIIIlIlIIIllIlllIl(Random random) {
        return random.nextInt(5) > 0 ? new class_1448(Blocks.IlIlIIlllIllllllllIIIlIlI, 2) : new class_1448(Blocks.IlIlIIlllIllllllllIIIlIlI, 1);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        int n3;
        int n4;
        int n5;
        int n6;
        if (this.lIIlllIIlIlIlIIIlIlllIIll == 1 || this.lIIlllIIlIlIlIIIlIlllIIll == 2) {
            n6 = random.nextInt(3);
            for (n5 = 0; n5 < n6; ++n5) {
                n4 = n + random.nextInt(16) + 8;
                n3 = n2 + random.nextInt(16) + 8;
                int n7 = class_13342.lIllllIIlIIIlIllllllIIIll(n4, n3);
                lIIllIlIIlIIlllllIlIIllIl.a_(class_13342, random, n4, n7, n3);
            }
        }
        IllIlIlIIIlllIIllIIIIlIll.lllIIIllIIIIlllIlIIllIIll(3);
        for (n6 = 0; n6 < 7; ++n6) {
            n5 = n + random.nextInt(16) + 8;
            n4 = n2 + random.nextInt(16) + 8;
            n3 = random.nextInt(class_13342.lIllllIIlIIIlIllllllIIIll(n5, n4) + 32);
            IllIlIlIIIlllIIllIIIIlIll.a_(class_13342, random, n5, n3, n4);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, Block[] arrclass_0549, byte[] arrby, int n, int n2, double d) {
        if (this.lIIlllIIlIlIlIIIlIlllIIll == 1 || this.lIIlllIIlIlIlIIIlIlllIIll == 2) {
            this.IlllIIIllllIIllIllIlIIlIl = Blocks.IlIllllllIIlIIllllIIlIIIl;
            this.lllIIIlIIlIlIllIIIIIlIIll = 0;
            this.IIIlIlIllIlllllIlIllllllI = Blocks.lIlllIlllIIIIlIIlllIllIII;
            if (d > 1.75) {
                this.IlllIIIllllIIllIllIlIIlIl = Blocks.lIlllIlllIIIIlIIlllIllIII;
                this.lllIIIlIIlIlIllIIIIIlIIll = 1;
            } else if (d > -0.95) {
                this.IlllIIIllllIIllIllIlIIlIl = Blocks.lIlllIlllIIIIlIIlllIllIII;
                this.lllIIIlIIlIlIllIIIIIlIIll = 2;
            }
        }
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, arrclass_0549, arrby, n, n2, d);
    }

    @Override
    protected class_0672 lIIIIlIlIIlllllIIllIIlIII() {
        return this.lIlIllIIllIIIIlllIlIlllIl == class_0672.IIIIlIlIIlIIIIlIlllIlIIII.lIlIllIIllIIIIlllIlIlllIl ? new class_1043(this.lIlIllIIllIIIIlllIlIlllIl + 128, 2).lllIIIllIIIIlllIlIIllIIll(5858897, true).lllIIIllIIIIlllIlIIllIIll("Mega Spruce Taiga").lllIIIllIIIIlllIlIIllIIll(5159473).lllIIIllIIIIlllIlIIllIIll(0.25f, 0.8f).lllIIIllIIIIlllIlIIllIIll(new class_0753(this.llllIlIIllIIlllllIIllIIll, this.IlIlIllIIlIIIIlllIlIllIlI)) : super.lIIIIlIlIIlllllIIllIIlIII();
    }
}

