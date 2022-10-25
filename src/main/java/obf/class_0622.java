package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0622
extends class_0608 {
    private int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0622() {
    }

    public class_0622(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIlIIlIIIlIlIIIllIlllIl = random.nextInt();
    }

    public static class_0622 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -3, 0, 5, 10, 8, n4);
        return class_0622.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0622(n5, random, class_20462, n4) : null;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("Seed");
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Seed", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        int n3;
        Random random2 = new Random(this.lllIlIIlIIIlIlIIIllIlllIl);
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 3; n2 <= 4; ++n2) {
                n = random2.nextInt(8);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n3, n2, 0, n3, n2, n, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            }
        }
        n3 = random2.nextInt(8);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 0, 0, 5, n3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        n3 = random2.nextInt(8);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 5, 0, 4, 5, n3, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        for (n3 = 0; n3 <= 4; ++n3) {
            n2 = random2.nextInt(5);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n3, 2, 0, n3, 2, n2, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
        }
        for (n3 = 0; n3 <= 4; ++n3) {
            for (n2 = 0; n2 <= 1; ++n2) {
                n = random2.nextInt(3);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n3, n2, 0, n3, n2, n, Blocks.llIllIllIllIlIlIllIlIIIIl, Blocks.llIllIllIllIlIlIllIlIIIIl, false);
            }
        }
        return true;
    }
}

