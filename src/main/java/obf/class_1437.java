package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

abstract class class_1437
extends class_1036 {
    protected int lIIIIlIlIIlllllIIllIIlIII = -1;
    private int lllIIIllIIIIlllIlIIllIIll;
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_1437() {
    }

    protected class_1437(class_0206 class_02062, int n) {
        super(n);
        if (class_02062 != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl = class_02062.lllIlIIlIIIlIlIIIllIlllIl;
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("HPos", this.lIIIIlIlIIlllllIIllIIlIII);
        class_07752.lllIIIllIIIIlllIlIIllIIll("VCount", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Desert", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        this.lIIIIlIlIIlllllIIllIIlIII = class_07752.lIllllIIlIIIlIllllllIIIll("HPos");
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("VCount");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Desert");
    }

    protected class_1036 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 1, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 1: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 2: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 1, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 3: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl());
            }
        }
        return null;
    }

    protected class_1036 lllIlIIlIIIlIlIIIllIlllIl(class_0206 class_02062, List list, Random random, int n, int n2) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 3, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 1: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 2: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 3, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 3: {
                return class_1979.lllIlIIlIIIlIlIIIllIlllIl(class_02062, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl());
            }
        }
        return null;
    }

    protected int lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, class_2046 class_20462) {
        int n = 0;
        int n2 = 0;
        for (int i = this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl; i <= this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll; ++i) {
            for (int j = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll; j <= this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII; ++j) {
                if (!class_20462.lllIlIIlIIIlIlIIIllIlllIl(j, 64, i)) continue;
                n += Math.max(class_13342.IIIllIllIIlIlIlIlIllllIIl(j, i), class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl());
                ++n2;
            }
        }
        if (n2 == 0) {
            return -1;
        }
        return n / n2;
    }

    protected static boolean lllIIIllIIIIlllIlIIllIIll(class_2046 class_20462) {
        return class_20462 != null && class_20462.lllIlIIlIIIlIlIIIllIlllIl > 10;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n, int n2, int n3, int n4) {
        if (this.lllIIIllIIIIlllIlIIllIIll < n4) {
            int n5;
            int n6;
            int n7;
            for (int i = this.lllIIIllIIIIlllIlIIllIIll; i < n4 && class_20462.lllIlIIlIIIlIlIIIllIlllIl(n7 = this.lllIIIllIIIIlllIlIIllIIll(n + i, n3), n6 = this.lllIIIllIIIIlllIlIIllIIll(n2), n5 = this.lllIlIIlIIIlIlIIIllIlllIl(n + i, n3)); ++i) {
                ++this.lllIIIllIIIIlllIlIIllIIll;
                class_1817 class_18172 = new class_1817(class_13342, this.lllIlIIlIIIlIlIIIllIlllIl(i));
                class_18172.lllIlIIlIIIlIlIIIllIlllIl((double)n7 + 0.5, n6, (double)n5 + 0.5, 0.0f, 0.0f);
                class_13342.lllIIIllIIIIlllIlIIllIIll(class_18172);
            }
        }
    }

    protected int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return 0;
    }

    protected Block lllIlIIlIIIlIlIIIllIlllIl(Block class_05492, int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_05492 == Blocks.log || class_05492 == Blocks.lIIlIIIIIlIlllIlIIlIlIlll) {
                return Blocks.IlIIlllllIIlIlIlllllIllll;
            }
            if (class_05492 == Blocks.IlIIIIIllllllIIlllIllllll) {
                return Blocks.IlIIlllllIIlIlIlllllIllll;
            }
            if (class_05492 == Blocks.lIllllIIlIIIlIllllllIIIll) {
                return Blocks.IlIIlllllIIlIlIlllllIllll;
            }
            if (class_05492 == Blocks.IllllIIlIIIllIlllIlllIllI) {
                return Blocks.lIIlIlIIIIIllIIIIllIlIlII;
            }
            if (class_05492 == Blocks.llIIIlIlIlIIlIllIIIllIlIl) {
                return Blocks.lIIlIlIIIIIllIIIIllIlIlII;
            }
            if (class_05492 == Blocks.lllIIlIIIllllllIIIIlIlIlI) {
                return Blocks.IlIIlllllIIlIlIlllllIllll;
            }
        }
        return class_05492;
    }

    protected int IlIllllllIIlIIllllIIlIIIl(Block class_05492, int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            if (class_05492 == Blocks.log || class_05492 == Blocks.lIIlIIIIIlIlllIlIIlIlIlll) {
                return 0;
            }
            if (class_05492 == Blocks.IlIIIIIllllllIIlllIllllll) {
                return 0;
            }
            if (class_05492 == Blocks.lIllllIIlIIIlIllllllIIIll) {
                return 2;
            }
        }
        return n;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Block class_05492, int n, int n2, int n3, int n4, class_2046 class_20462) {
        Block class_05493 = this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, n);
        int n5 = this.IlIllllllIIlIIllllIIlIIIl(class_05492, n);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, class_05493, n5, n2, n3, n4, class_20462);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n, int n2, int n3, int n4, int n5, int n6, Block class_05492, Block class_05493, boolean bl) {
        Block class_05494 = this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, 0);
        int n7 = this.IlIllllllIIlIIllllIIlIIIl(class_05492, 0);
        Block class_05495 = this.lllIlIIlIIIlIlIIIllIlllIl(class_05493, 0);
        int n8 = this.IlIllllllIIlIIllllIIlIIIl(class_05493, 0);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n, n2, n3, n4, n5, n6, class_05494, n7, class_05495, n8, bl);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Block class_05492, int n, int n2, int n3, int n4, class_2046 class_20462) {
        Block class_05493 = this.lllIlIIlIIIlIlIIIllIlllIl(class_05492, n);
        int n5 = this.IlIllllllIIlIIllllIIlIIIl(class_05492, n);
        super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_05493, n5, n2, n3, n4, class_20462);
    }
}

