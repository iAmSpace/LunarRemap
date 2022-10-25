package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1899
extends Block {
    private boolean llllllIlIllllIlIlIlIIIIlI;
    private String lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1899(String string, class_1855 class_18552, boolean bl) {
        super(class_18552);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        this.lIlIIllllIlIIIIllIIIIlIIl = string;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        if (this == Blocks.lIlIllIIlIIlIIlIIlIIlIIll || this == Blocks.IIIIlIIIIIIIllIlllIIlllII) {
            if (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) != class_18432.IlIllllllIIlIIllllIIlIIIl(n - class_0573.lllIlIIlIIIlIlIIIllIlllIl[n4], n2 - class_0573.IlIllllllIIlIIllllIIlIIIl[n4], n3 - class_0573.lIlllIlllIIIIlIIlllIllIII[n4])) {
                return true;
            }
            if (class_05492 == this) {
                return false;
            }
        }
        return !this.llllllIlIllllIlIlIlIIIIlI && class_05492 == this ? false : super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl);
    }
}

