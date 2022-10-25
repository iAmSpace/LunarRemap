package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1119
extends class_0609 {
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;

    protected class_1119() {
        super(false);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 >= 6 ? this.lIlIIllllIlIIIIllIIIIlIIl : this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_turned");
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, int n5, Block class_05492) {
        if (class_05492.llIllllIlIllIIIlIllIIlIlI() && new class_0818(this, class_13342, n, n2, n3).lllIIIllIIIIlllIlIIllIIll() == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, false);
        }
    }
}

