package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_0017
extends class_1437 {
    private Block lllIIIllIIIIlllIlIIllIIll;
    private Block lllIlIIlIIIlIlIIIllIlllIl;
    private Block IlIllllllIIlIIllllIIlIIIl;
    private Block lIlllIlllIIIIlIIlllIllIII;

    public class_0017() {
    }

    public class_0017(class_0206 class_02062, int n, Random random, class_2046 class_20462, int n2) {
        super(class_02062, n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.lllIlIIlIIIlIlIIIllIlllIl = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIllllllIIlIIllllIIlIIIl = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CA", Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll));
        class_07752.lllIIIllIIIIlllIlIIllIIll("CB", Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl));
        class_07752.lllIIIllIIIIlllIlIIllIIll("CC", Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(this.IlIllllllIIlIIllllIIlIIIl));
        class_07752.lllIIIllIIIIlllIlIIllIIll("CD", Block.blockRegistry.IlIllllllIIlIIllllIIlIIIl(this.lIlllIlllIIIIlIIlllIllIII));
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("CA"));
        this.lllIlIIlIIIlIlIIIllIlllIl = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("CB"));
        this.IlIllllllIIlIIllllIIlIIIl = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("CC"));
        this.lIlllIlllIIIIlIIlllIllIII = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("CD"));
    }

    private Block lllIIIllIIIIlllIlIIllIIll(Random random) {
        switch (random.nextInt(5)) {
            case 0: {
                return Blocks.lIlIIlIIlIIIIllIIlIllIlll;
            }
            case 1: {
                return Blocks.lIIlIlIlIlIllIIlIIllllIll;
            }
        }
        return Blocks.lllIIIlIIlIlIllIIIIIlIIll;
    }

    public static class_0017 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 0, 0, 13, 4, 9, n4);
        return class_0017.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0017(class_02062, n5, random, class_20462, n4) : null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_20462);
            if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
                return true;
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(0, this.lIIIIlIlIIlllllIIllIIlIII - this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll + 4 - 1, 0);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 0, 12, 4, 8, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 1, 2, 0, 7, Blocks.IIIlIlIllIlllllIlIllllllI, Blocks.IIIlIlIllIlllllIlIllllllI, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 0, 1, 5, 0, 7, Blocks.IIIlIlIllIlllllIlIllllllI, Blocks.IIIlIlIllIlllllIlIllllllI, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 0, 1, 8, 0, 7, Blocks.IIIlIlIllIlllllIlIllllllI, Blocks.IIIlIlIllIlllllIlIllllllI, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, 0, 1, 11, 0, 7, Blocks.IIIlIlIllIlllllIlIllllllI, Blocks.IIIlIlIllIlllllIlIllllllI, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 0, 0, 8, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, 0, 0, 6, 0, 8, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 0, 0, 12, 0, 8, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 0, 11, 0, 0, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 8, 11, 0, 8, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 0, 1, 3, 0, 7, Blocks.IllIIIllIIIIlIlIlIllIIlll, Blocks.IllIIIllIIIIlIlIlIllIIlll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 0, 1, 9, 0, 7, Blocks.IllIIIllIIIIlIlIlIllIIlll, Blocks.IllIIIllIIIIlIlIlIllIIlll, false);
        for (n = 1; n <= 7; ++n) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.lllIIIllIIIIlllIlIIllIIll, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 1, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.lllIIIllIIIIlllIlIIllIIll, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 2, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.lllIlIIlIIIlIlIIIllIlllIl, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 4, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.lllIlIIlIIIlIlIIIllIlllIl, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 5, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.IlIllllllIIlIIllllIIlIIIl, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 7, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.IlIllllllIIlIIllllIIlIIIl, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 8, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.lIlllIlllIIIIlIIlllIllIII, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 10, 1, n, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, this.lIlllIlllIIIIlIIlllIllIII, MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 2, 7), 11, 1, n, class_20462);
        }
        for (n = 0; n < 9; ++n) {
            for (int i = 0; i < 13; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, i, 4, n, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.lIlllIlllIIIIlIIlllIllIII, 0, i, -1, n, class_20462);
            }
        }
        return true;
    }
}

