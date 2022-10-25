package obf;

import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0257
extends class_1272 {
    private final boolean IllIIIllIIIIlIlIlIllIIlll;
    private final class_2209 lIIIIlIlIIlllllIIllIIlIII;
    private final class_2209 llIIlllIllIllllIIIlIIIIII;

    public class_0257(Block class_05492, class_2209 class_22092, class_2209 class_22093, boolean bl) {
        super(class_05492);
        this.lIIIIlIlIIlllllIIllIIlIII = class_22092;
        this.llIIlllIllIllllIIIlIIIIII = class_22093;
        this.IllIIIllIIIIlIlIlIllIIlll = bl;
        this.IlIIIIIllllllIIlllIllllll(0);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public class_2102 IlIllllllIIlIIllllIIlIIIl(int n) {
        return Block.lllIIIllIIIIlllIlIIllIIll(this).lllIIIllIIIIlllIlIIllIIll(2, n);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(int n) {
        return n;
    }

    @Override
    public String IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        return this.lIIIIlIlIIlllllIIllIIlIII.IllIIlllllllIIlIIlIIIIlIl(class_08972.IllIIIllIIIIlIlIlIllIIlll());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3) {
        boolean bl;
        if (this.IllIIIllIIIIlIlIlIllIIlll) {
            return super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
        }
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            return false;
        }
        if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, class_08972)) {
            return false;
        }
        Block class_05492 = class_13342.a_(n, n2, n3);
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = n5 & 7;
        boolean bl2 = bl = (n5 & 8) != 0;
        if ((n4 == 1 && !bl || n4 == 0 && bl) && class_05492 == this.lIIIIlIlIIlllllIIllIIlIII && n6 == class_08972.IllIIIllIIIIlIlIlIllIIlll()) {
            if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3)) && class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.llIIlllIllIllllIIIlIIIIII, n6, 3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl.lllIlIIlIIIlIlIIIllIlllIl(), (this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 2.0f, this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.8f);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            return true;
        }
        return this.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, class_13342, n, n2, n3, n4) ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, class_13342, n, n2, n3, n4, f, f2, f3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142, ItemStack class_08972) {
        boolean bl;
        int n5 = n;
        int n6 = n2;
        int n7 = n3;
        Block class_05492 = class_13342.a_(n, n2, n3);
        int n8 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n9 = n8 & 7;
        boolean bl2 = bl = (n8 & 8) != 0;
        if ((n4 == 1 && !bl || n4 == 0 && bl) && class_05492 == this.lIIIIlIlIIlllllIIllIIlIII && n9 == class_08972.IllIIIllIIIIlIlIlIllIIlll()) {
            return true;
        }
        if (n4 == 0) {
            --n2;
        }
        if (n4 == 1) {
            ++n2;
        }
        if (n4 == 2) {
            --n3;
        }
        if (n4 == 3) {
            ++n3;
        }
        if (n4 == 4) {
            --n;
        }
        if (n4 == 5) {
            ++n;
        }
        Block class_05493 = class_13342.a_(n, n2, n3);
        int n10 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        n9 = n10 & 7;
        return class_05493 == this.lIIIIlIlIIlllllIIllIIlIII && n9 == class_08972.IllIIIllIIIIlIlIlIllIIlll() ? true : super.lllIIIllIIIIlllIlIIllIIll(class_13342, n5, n6, n7, n4, class_08142, class_08972);
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (n4 == 0) {
            --n2;
        }
        if (n4 == 1) {
            ++n2;
        }
        if (n4 == 2) {
            --n3;
        }
        if (n4 == 3) {
            ++n3;
        }
        if (n4 == 4) {
            --n;
        }
        if (n4 == 5) {
            ++n;
        }
        Block class_05492 = class_13342.a_(n, n2, n3);
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = n5 & 7;
        if (class_05492 == this.lIIIIlIlIIlllllIIllIIlIII && n6 == class_08972.IllIIIllIIIIlIlIlIllIIlll()) {
            if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3)) && class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.llIIlllIllIllllIIIlIIIIII, n6, 3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll((float)n + 0.5f, (double)((float)n2 + 0.5f), (double)((float)n3 + 0.5f), this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl.lllIlIIlIIIlIlIIIllIlllIl(), (this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl.IlIllllllIIlIIllllIIlIIIl() + 1.0f) / 2.0f, this.llIIlllIllIllllIIIlIIIIII.llIIIlllIlllIlIllIIIIllIl.lIlllIlllIIIIlIIlllIllIII() * 0.8f);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            return true;
        }
        return false;
    }
}

