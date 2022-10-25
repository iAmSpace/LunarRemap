package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import java.util.List;
import java.util.Random;

public class class_1501
extends class_0094 {
    private static final class_0425[] lllIIIllIIIIlllIlIIllIIll = new class_0425[]{new class_0425(Items.IlIIIIIIIIIIlIIlllIIIlIlI, 0, 1, 1, 10), new class_0425(Items.diamond, 0, 1, 3, 3), new class_0425(Items.iron_ingot, 0, 1, 5, 10), new class_0425(Items.lIIIIlIlIIlllllIIllIIlIII, 0, 1, 3, 5), new class_0425(Items.lIIIlIIllIllIIlIIlIIIllII, 0, 4, 9, 5), new class_0425(Items.bread, 0, 1, 3, 15), new class_0425(Items.IlIIIIIllllllIIlllIllllll, 0, 1, 3, 15), new class_0425(Items.lllIlIIlIIIlIlIIIllIlllIl, 0, 1, 1, 5), new class_0425(Items.llIIlllIllIllllIIIlIIIIII, 0, 1, 1, 5), new class_0425(Items.lIIIllIIIIIllllIlIlIllIll, 0, 1, 1, 5), new class_0425(Items.llIlllIlIIllIlIIIIllIIlIl, 0, 1, 1, 5), new class_0425(Items.lIIIlIIIlIlllIllIIIlIIIlI, 0, 1, 1, 5), new class_0425(Items.lIIlIlllIllIlIlllIIIIIIII, 0, 1, 1, 5), new class_0425(Items.IlIIllIlIlIllIIIlIIlIlIIl, 0, 1, 1, 1), new class_0425(Items.saddle, 0, 1, 1, 1), new class_0425(Items.IlIllIIIIllllIIllIllIIIIl, 0, 1, 1, 1), new class_0425(Items.lIlIlIIllIlIIIIIlIIlllIlI, 0, 1, 1, 1), new class_0425(Items.llllIllllllIllIIIlIlIIllI, 0, 1, 1, 1)};
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_1501() {
    }

    public class_1501(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Chest", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Chest");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1844)class_10362, list, random, 1, 1);
    }

    public static class_1501 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -1, 0, 5, 5, 7, n4);
        return class_1501.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_1501(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 4, 6, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 1, 1, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, class_0462.lllIIIllIIIIlllIlIIllIIll, 1, 1, 6);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 2, 3, 1, 4, Blocks.lllllIllllIIIIllIIlIlIlII, Blocks.lllllIllllIIIIllIIlIlIlII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 5, 3, 1, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 5, 3, 1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 5, 3, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 5, 3, 2, 4, class_20462);
        for (n = 2; n <= 4; ++n) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 5, 2, 1, n, class_20462);
        }
        if (!this.lllIlIIlIIIlIlIIIllIlllIl) {
            int n2;
            n = this.lllIIIllIIIIlllIlIIllIIll(2);
            int n3 = this.lllIIIllIIIIlllIlIIllIIll(3, 3);
            if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n3, n, n2 = this.lllIlIIlIIIlIlIIIllIlllIl(3, 3))) {
                this.lllIlIIlIIIlIlIIIllIlllIl = true;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 3, 2, 3, class_0425.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random)), 2 + random.nextInt(2));
            }
        }
        return true;
    }
}

