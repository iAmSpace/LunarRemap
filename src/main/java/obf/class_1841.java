package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1841
extends Block {
    private class_2102 llllllIlIllllIlIlIlIIIIlI;
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1841() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : (n == 0 ? Blocks.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(n) : (n != 2 && n != 4 ? this.llIIIIllIIIIIIIlIIIlIIIIl : this.lIlIIllllIlIIIIllIIIIlIIl));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_front");
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3);
        return true;
    }
}

