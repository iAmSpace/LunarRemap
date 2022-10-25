package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0245
extends Block {
    protected boolean IIIIlIIlIIIllIIIIllIIIlII;

    protected class_0245(class_1855 class_18552, boolean bl) {
        super(class_18552);
        this.IIIIlIIlIIIllIIIIllIIIlII = bl;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        return !this.IIIIlIIlIIIllIIIIllIIIlII && class_05492 == this ? false : super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4);
    }
}

