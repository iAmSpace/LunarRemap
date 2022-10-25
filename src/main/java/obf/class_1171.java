package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1171
extends Block {
    private class_2102 llllllIlIllllIlIlIlIIIIlI;
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1171() {
        super(class_1855.IlIllllllIIlIIllllIIlIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.9375f, 1.0f);
        this.IlIllllllIIlIIllllIIlIIIl(255);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return class_1974.lllIIIllIIIIlllIlIIllIIll(n + 0, n2 + 0, n3 + 0, n + 1, n2 + 1, n3 + 1);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? (n2 > 0 ? this.llllllIlIllllIlIlIlIIIIlI : this.lIlIIllllIlIIIIllIIIIlIIl) : Blocks.lIlllIlllIIIIlIIlllIllIII.lIlllIlllIIIIlIIlllIllIII(n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3) && !class_13342.IIlllIlIlllIllIIIlllIIlIl(n, n2 + 1, n3)) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            if (n4 > 0) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 - 1, 2);
            } else if (!this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
            }
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 7, 2);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212, float f) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() < f - 0.5f) {
            if (!(class_15212 instanceof class_0814) && !class_13342.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
                return;
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    private boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = 0;
        for (int i = n - n4; i <= n + n4; ++i) {
            for (int j = n3 - n4; j <= n3 + n4; ++j) {
                Block class_05492 = class_13342.a_(i, n2 + 1, j);
                if (class_05492 != Blocks.lllIIIlIIlIlIllIIIIIlIIll && class_05492 != Blocks.IIIlIllIlllIlIIIlIlIIllII && class_05492 != Blocks.lIIIllIlIlIlIIIllIlIlIllI && class_05492 != Blocks.lIIlIlIlIlIllIIlIIllllIll && class_05492 != Blocks.lIlIIlIIlIIIIllIIlIllIlll) continue;
                return true;
            }
        }
        return false;
    }

    private boolean lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        for (int i = n - 4; i <= n + 4; ++i) {
            for (int j = n2; j <= n2 + 1; ++j) {
                for (int k = n3 - 4; k <= n3 + 4; ++k) {
                    if (class_13342.a_(i, j, k).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIlllllllIIlIIlIIIIlIl) continue;
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492);
        class_1855 class_18552 = class_13342.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll();
        if (class_18552.lllIlIIlIIIlIlIIIllIlllIl()) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIlllIlllIIIIlIIlllIllIII);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Blocks.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(0, random, n2);
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.getItemFromBlock(Blocks.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_wet");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_dry");
    }
}

