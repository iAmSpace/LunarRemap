package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_0212
extends Block {
    protected class_0212() {
        super(class_1855.lIIIIlIlIIlllllIIllIIlIII);
        float f = 0.375f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, 1.0f, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if ((class_13342.a_(n, n2 - 1, n3) == Blocks.lIIlllIIlIlIlIIIlIlllIIll || this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3)) {
            int n4 = 1;
            while (class_13342.a_(n, n2 - n4, n3) == this) {
                ++n4;
            }
            if (n4 < 3) {
                int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
                if (n5 == 15) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, this);
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 4);
                } else {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 + 1, 4);
                }
            }
        }
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2 - 1, n3);
        return class_05492 == this ? true : (class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl && class_05492 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05492 != Blocks.llIIllIllIlIIlIIllIllllll ? false : (class_13342.a_(n - 1, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl ? true : (class_13342.a_(n + 1, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl ? true : (class_13342.a_(n, n2 - 1, n3 - 1).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl ? true : class_13342.a_(n, n2 - 1, n3 + 1).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl))));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    protected final boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return false;
        }
        return true;
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.IIIlIllllIIIlllllIllIlIII;
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
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 1;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.IIIlIllllIIIlllllIllIlIII;
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        return class_18432.a_(n, n3).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }
}

