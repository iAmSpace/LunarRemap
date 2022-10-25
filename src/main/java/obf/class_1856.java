package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1856
extends class_0816 {
    protected class_1856(class_1855 class_18552) {
        super(class_18552);
        this.lllIIIllIIIIlllIlIIllIIll(false);
        if (class_18552 == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(true);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492);
        if (class_13342.a_(n, n2, n3) == this) {
            this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3);
        }
    }

    private void llIIlllIllIllllIIIlIIIIII(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Block.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(this) - 1), n4, 2);
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, Block.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(this) - 1), this.lllIIIllIIIIlllIlIIllIIll(class_13342));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
            int n4;
            int n5 = random.nextInt(3);
            for (n4 = 0; n4 < n5; ++n4) {
                Block class_05492 = class_13342.a_(n += random.nextInt(3) - 1, ++n2, n3 += random.nextInt(3) - 1);
                if (class_05492.IlIlIIlllIllllllllIIIlIlI == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    if (!this.llIIllIllIlIIlIIllIllllll(class_13342, n - 1, n2, n3) && !this.llIIllIllIlIIlIIllIllllll(class_13342, n + 1, n2, n3) && !this.llIIllIllIlIIlIIllIllllll(class_13342, n, n2, n3 - 1) && !this.llIIllIllIlIIlIIllIllllll(class_13342, n, n2, n3 + 1) && !this.llIIllIllIlIIlIIllIllllll(class_13342, n, n2 - 1, n3) && !this.llIIllIllIlIIlIIllIllllll(class_13342, n, n2 + 1, n3)) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIlIlllIllIlIlllIIIIIIII);
                    return;
                }
                if (!class_05492.IlIlIIlllIllllllllIIIlIlI.lIlllIlllIIIIlIIlllIllIII()) continue;
                return;
            }
            if (n5 == 0) {
                n4 = n;
                int n6 = n3;
                for (int i = 0; i < 3; ++i) {
                    n = n4 + random.nextInt(3) - 1;
                    if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3 = n6 + random.nextInt(3) - 1) || !this.llIIllIllIlIIlIIllIllllll(class_13342, n, n2, n3)) continue;
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, Blocks.lIIlIlllIllIlIlllIIIIIIII);
                }
            }
        }
    }

    private boolean llIIllIllIlIIlIIllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll().IIIllIIlIIIIIIlIlIIllIIlI();
    }
}

