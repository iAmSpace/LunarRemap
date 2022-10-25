package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_0719
extends class_2257 {
    public class_0719() {
        super(class_1855.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_1345();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            boolean bl;
            boolean bl2 = class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3);
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            boolean bl3 = bl = (n4 & 1) != 0;
            if (bl2 && !bl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 | 1, 4);
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
            } else if (!bl2 && bl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 & 0xFFFFFFFE, 4);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_17742 != null && class_17742 instanceof class_1345) {
            class_0484 class_04842 = ((class_1345)class_17742).lllIIIllIIIIlllIlIIllIIll();
            class_04842.lllIIIllIIIIlllIlIIllIIll(class_13342);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, this);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 1;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        class_1345 class_13452 = (class_1345)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_13452 != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_13452);
        }
        return true;
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return class_17742 != null && class_17742 instanceof class_1345 ? ((class_1345)class_17742).lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll() : 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        class_1345 class_13452 = (class_1345)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
            class_13452.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }
}

