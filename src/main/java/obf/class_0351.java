package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0351
extends Block {
    public static boolean llIlllIIllIlllIlIlIlIIIll;

    public class_0351() {
        super(class_1855.IlIlIIlIlIllIIlIlIIllIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public class_0351(class_1855 class_18552) {
        super(class_18552);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
        }
    }

    private void lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        if (class_0351.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 - 1, n3) && n2 >= 0) {
            int n4 = 32;
            if (!llIlllIIllIlllIlIlIlIIIll && class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - n4, n2 - n4, n3 - n4, n + n4, n2 + n4, n3 + n4)) {
                if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                    class_0543 class_05432 = new class_0543(class_13342, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, this, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
                    this.lllIIIllIIIIlllIlIIllIIll(class_05432);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(class_05432);
                }
            } else {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                while (class_0351.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2 - 1, n3) && n2 > 0) {
                    --n2;
                }
                if (n2 > 0) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this);
                }
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_0543 class_05432) {
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 2;
    }

    public static boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2, n3);
        if (class_05492.IlIlIIlllIllllllllIIIlIlI == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            return true;
        }
        if (class_05492 == Blocks.lIIlIlllIllIlIlllIIIIIIII) {
            return true;
        }
        class_1855 class_18552 = class_05492.IlIlIIlllIllllllllIIIlIlI;
        return class_18552 == class_1855.IllIIlllllllIIlIIlIIIIlIl ? true : class_18552 == class_1855.IIIllIllIIlIlIlIlIllllIIl;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
    }
}

