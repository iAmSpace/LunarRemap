package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

abstract class class_0094
extends class_1036 {
    protected class_0462 lIlllIlllIIIIlIIlllIllIII = class_0462.lllIIIllIIIIlllIlIIllIIll;

    public class_0094() {
    }

    protected class_0094(int n) {
        super(n);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("EntryDoor", this.lIlllIlllIIIIlIIlllIllIII.name());
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        this.lIlllIlllIIIIlIIlllIllIII = class_0462.valueOf(class_07752.IllIIIllIIIIlIlIlIllIIlll("EntryDoor"));
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462, class_0462 class_04622, int n, int n2, int n3) {
        switch (class_04622) {
            default: {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, n, n2, n3, n + 3 - 1, n2 + 3 - 1, n3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
                break;
            }
            case lllIlIIlIIIlIlIIIllIlllIl: {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 1, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 2, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 2, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 2, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIllIlIlIllIIIlIIlIlIIl, 0, n + 1, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIllIlIlIllIIIlIIlIlIIl, 8, n + 1, n2 + 1, n3, class_20462);
                break;
            }
            case IlIllllllIIlIIllllIIlIIIl: {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, n + 1, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, n + 1, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, n, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, n, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, n, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, n + 1, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, n + 2, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, n + 2, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, n + 2, n2, n3, class_20462);
                break;
            }
            case lIlllIlllIIIIlIIlllIllIII: {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 1, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 2, n2 + 2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 2, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllllIllllIIIIllIIlIlIlII, 0, n + 2, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllIlllIIIIlIIIllIl, 0, n + 1, n2, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllIlllIIIIlIIIllIl, 8, n + 1, n2 + 1, n3, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIIllIIllIIIlIIIllIllII, this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIIIllIIllIIIlIIIllIllII, 4), n + 2, n2 + 1, n3 + 1, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIIllIIllIIIlIIIllIllII, this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIIIIllIIllIIIlIIIllIllII, 3), n + 2, n2 + 1, n3 - 1, class_20462);
            }
        }
    }

    protected class_0462 lllIIIllIIIIlllIlIIllIIll(Random random) {
        int n = random.nextInt(5);
        switch (n) {
            default: {
                return class_0462.lllIIIllIIIIlllIlIIllIIll;
            }
            case 2: {
                return class_0462.lllIlIIlIIIlIlIIIllIlllIl;
            }
            case 3: {
                return class_0462.IlIllllllIIlIIllllIIlIIIl;
            }
            case 4: 
        }
        return class_0462.lIlllIlllIIIIlIIlllIllIII;
    }

    protected class_1036 lllIIIllIIIIlllIlIIllIIll(class_1844 class_18442, List list, Random random, int n, int n2) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 1: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 2: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 3: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n2, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n, this.lIllllIIlIIIlIllllllIIIll, this.IlIllllllIIlIIllllIIlIIIl());
            }
        }
        return null;
    }

    protected class_1036 lllIlIIlIIIlIlIIIllIlllIl(class_1844 class_18442, List list, Random random, int n, int n2) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 1, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 1: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 2: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 1, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 3: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl());
            }
        }
        return null;
    }

    protected class_1036 IlIllllllIIlIIllllIIlIIIl(class_1844 class_18442, List list, Random random, int n, int n2) {
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 3, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 1: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 2: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + n2, 3, this.IlIllllllIIlIIllllIIlIIIl());
            }
            case 3: {
                return class_1942.lllIIIllIIIIlllIlIIllIIll(class_18442, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + n2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl());
            }
        }
        return null;
    }

    protected static boolean lllIIIllIIIIlllIlIIllIIll(class_2046 class_20462) {
        return class_20462 != null && class_20462.lllIlIIlIIIlIlIIIllIlllIl > 10;
    }
}

