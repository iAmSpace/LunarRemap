package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1840
extends Block {
    private class_2102 llllllIlIllllIlIlIlIIIIlI;
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1840() {
        super(class_1855.IlIIlllllIIlIlIlllllIllll);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3)) {
            int n4 = 1;
            while (class_13342.a_(n, n2 - n4, n3) == this) {
                ++n4;
            }
            if (n4 < 3) {
                int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                if (n5 == 15) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, this);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 4);
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + 1, n3, this);
                } else {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 + 1, 4);
                }
            }
        }
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        float f = 0.0625f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (float)(n2 + 1) - f, (float)(n3 + 1) - f);
    }

    @Override
    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        float f = 0.0625f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, n2 + 1, (float)(n3 + 1) - f);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : (n == 0 ? this.lIlIIllllIlIIIIllIIIIlIIl : this.llIIIIllIIIIIIIlIIIlIIIIl);
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 13;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return !super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) ? false : this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, true);
        }
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.a_(n - 1, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            return false;
        }
        if (class_13342.a_(n + 1, n2, n3).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            return false;
        }
        if (class_13342.a_(n, n2, n3 - 1).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            return false;
        }
        if (class_13342.a_(n, n2, n3 + 1).lIllllIIlIIIlIllllllIIIll().lllIlIIlIIIlIlIIIllIlllIl()) {
            return false;
        }
        Block class_05492 = class_13342.a_(n, n2 - 1, n3);
        return class_05492 == Blocks.IIIIIllIlIllIlIlIIlIllIIl || class_05492 == Blocks.llIIllIllIlIIlIIllIllllll;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        class_15212.lllIIIllIIIIlllIlIIllIIll(class_0058.IIIllIIlIIIIIIlIlIIllIIlI, 1.0f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_bottom");
    }
}

