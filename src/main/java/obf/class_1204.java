package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1204
extends class_0672 {
    public class_1204(int n) {
        super(n);
        this.llIIIIIlIIlIIIIllIIIlIIII.clear();
        this.IlllIIIllllIIllIllIlIIlIl = Blocks.llIIllIllIlIIlIIllIllllll;
        this.IIIlIlIllIlllllIlIllllllI = Blocks.llIIllIllIlIIlIIllIllllll;
        this.llIIIlIlIlIIlIllIIIllIlIl.llIIlIllIllllIlIIIIlIIlll = -999;
        this.llIIIlIlIlIIlIllIIIllIlIl.IlIIlllllIIlIlIlllllIllll = 2;
        this.llIIIlIlIlIIlIllIIIllIlIl.IllIIIIllIIllIllIlllIlIIl = 50;
        this.llIIIlIlIlIIlIllIIIllIlIl.IIIIIIIIlIllIIllIIlllIllI = 10;
        this.llIIIIIlIIlIIIIllIIIlIIII.clear();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2);
        if (random.nextInt(1000) == 0) {
            int n3 = n + random.nextInt(16) + 8;
            int n4 = n2 + random.nextInt(16) + 8;
            class_0572 class_05722 = new class_0572();
            class_05722.a_(class_13342, random, n3, class_13342.lIllllIIlIIIlIllllllIIIll(n3, n4) + 1, n4);
        }
    }
}

