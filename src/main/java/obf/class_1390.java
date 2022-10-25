package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1390
extends class_0854
implements class_0588 {
    protected class_1390() {
        float f = 0.2f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f * 2.0f, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (random.nextInt(25) == 0) {
            int n4;
            int n5;
            int n6;
            int n7 = 4;
            int n8 = 5;
            for (n6 = n - n7; n6 <= n + n7; ++n6) {
                for (n5 = n3 - n7; n5 <= n3 + n7; ++n5) {
                    for (n4 = n2 - 1; n4 <= n2 + 1; ++n4) {
                        if (class_13342.a_(n6, n4, n5) != this || --n8 > 0) continue;
                        return;
                    }
                }
            }
            n6 = n + random.nextInt(3) - 1;
            n5 = n2 + random.nextInt(2) - random.nextInt(2);
            n4 = n3 + random.nextInt(3) - 1;
            for (int i = 0; i < 4; ++i) {
                if (class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5, n4) && this.lIllllIIlIIIlIllllllIIIll(class_13342, n6, n5, n4)) {
                    n = n6;
                    n2 = n5;
                    n3 = n4;
                }
                n6 = n + random.nextInt(3) - 1;
                n5 = n2 + random.nextInt(2) - random.nextInt(2);
                n4 = n3 + random.nextInt(3) - 1;
            }
            if (class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5, n4) && this.lIllllIIlIIIlIllllllIIIll(class_13342, n6, n5, n4)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, this, 0, 2);
            }
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) && this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3);
    }

    @Override
    protected boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        if (n2 >= 0 && n2 < 256) {
            Block class_05492 = class_13342.a_(n, n2 - 1, n3);
            return class_05492 == Blocks.lIIIlllIlIIIlIllIIIlIllll || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3) == 2 || class_13342.IIIllIllIIlIlIlIlIllllIIl(n, n2, n3) < 13 && this.IlIllllllIIlIIllllIIlIIIl(class_05492);
        }
        return false;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        class_0049 class_00492 = null;
        if (this == Blocks.lllIIIIIIlIlllIIlIlIIIllI) {
            class_00492 = new class_0049(0);
        } else if (this == Blocks.llIIlIIllIIllIlIIllIIllII) {
            class_00492 = new class_0049(1);
        }
        if (class_00492 != null && class_00492.a_(class_13342, random, n, n2, n3)) {
            return true;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this, n4, 3);
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, random);
    }
}

