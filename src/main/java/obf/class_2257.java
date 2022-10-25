package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_2257
extends Block
implements class_1770 {
    protected class_2257(class_1855 class_18552) {
        super(class_18552);
        this.llIllllIlIllIIIlIllIIlIlI = true;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        class_13342.llIIllIllIlIIlIIllIllllll(n, n2, n3);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, n4, n5);
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        return class_17742 != null ? class_17742.lllIlIIlIIIlIlIIIllIlllIl(n4, n5) : false;
    }
}

