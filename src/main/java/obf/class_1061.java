package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1061
extends class_0672 {
    private boolean lIIllIIlIIIlllIlllIIlIIlI;

    public class_1061(int n, boolean bl) {
        super(n);
        this.lIIllIIlIIIlllIlllIIlIIlI = bl;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = bl ? 2 : 50;
        this.llIIIlIlIlIIlIllIIIllIlIl.lIlllIlllIlIIIIlllIlIlIIl = 25;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIllllIlIllIIIlIllIIlIlI = 4;
        if (!bl) {
            this.lIIlIIlIllIlIIlIlIIlIlIlI.add(new class_0920(class_0673.class, 2, 1, 1));
        }
        this.llIIIIIlIIlIIIIllIIIlIIII.add(new class_0920(class_1554.class, 10, 4, 4));
    }

    @Override
    public class_1174 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return random.nextInt(10) == 0 ? this.lIIllllllllIlIllllllllIlI : (random.nextInt(2) == 0 ? new class_0207(3, 0) : (!this.lIIllIIlIIIlllIlllIIlIIlI && random.nextInt(3) == 0 ? new class_0637(false, 10, 20, 3, 3) : new class_1219(false, 4 + random.nextInt(7), 3, 3, true)));
    }

    @Override
    public class_1067 lllIlIIlIIIlIlIIIllIlllIl(Random random) {
        return random.nextInt(4) == 0 ? new class_1448(Blocks.IlIlIIlllIllllllllIIIlIlI, 2) : new class_1448(Blocks.IlIlIIlllIllllllllIIIlIlI, 1);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
        int n3 = n + random.nextInt(16) + 8;
        int n4 = n2 + random.nextInt(16) + 8;
        int n5 = random.nextInt(class_13342.lIllllIIlIIIlIllllllIIIll(n3, n4) * 2);
        new class_2250().a_(class_13342, random, n3, n5, n4);
        class_0294 class_02942 = new class_0294();
        for (n4 = 0; n4 < 50; ++n4) {
            n5 = n + random.nextInt(16) + 8;
            int n6 = 128;
            int n7 = n2 + random.nextInt(16) + 8;
            class_02942.a_(class_13342, random, n5, n6, n7);
        }
    }
}

