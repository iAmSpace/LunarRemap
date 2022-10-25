package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0787
extends class_0094 {
    private boolean lllIIIllIIIIlllIlIIllIIll;

    public class_0787() {
    }

    public class_0787(int n, Random random, int n2, int n3) {
        super(n);
        this.lllIIIllIIIIlllIlIIllIIll = true;
        this.lIllllIIlIIIlIllllllIIIll = random.nextInt(4);
        this.lIlllIlllIIIIlIIlllIllIII = class_0462.lllIIIllIIIIlllIlIIllIIll;
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: 
            case 2: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
                break;
            }
            default: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n2, 64, n3, n2 + 5 - 1, 74, n3 + 5 - 1);
            }
        }
    }

    public class_0787(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lllIIIllIIIIlllIlIIllIIll = false;
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Source", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lllIIlIIIllllllIIIIlIlIlI("Source");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        if (this.lllIIIllIIIIlllIlIIllIIll) {
            class_1942.lllIIIllIIIIlllIlIIllIIll(class_0838.class);
        }
        this.lllIIIllIIIIlllIlIIllIIll((class_1844)class_10362, list, random, 1, 1);
    }

    public static class_0787 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -1, -7, 0, 5, 11, 5, n4);
        return class_0787.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0787(n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 10, 4, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 1, 7, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, class_0462.lllIIIllIIIIlllIlIIllIIll, 1, 1, 4);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 2, 6, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 5, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 1, 6, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 5, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 4, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 1, 5, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 2, 4, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3, 3, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 3, 4, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3, 3, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 3, 2, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 3, 3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 2, 2, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 1, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 1, 2, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, 1, 1, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 0, 1, 1, 3, class_20462);
        return true;
    }
}

