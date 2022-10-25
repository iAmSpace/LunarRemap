package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

class class_1651
extends class_0068 {
    private class_1651() {
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2, int n3, boolean bl) {
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll = Blocks.lllllIllllIIIIllIIlIlIlII;
            float f = random.nextFloat();
            if (f < 0.2f) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 2;
            } else if (f < 0.5f) {
                this.lllIlIIlIIIlIlIIIllIlllIl = 1;
            } else if (f < 0.55f) {
                this.lllIIIllIIIIlllIlIIllIIll = Blocks.lIIIIlIlIlIIIlIIllIIlIlIl;
                this.lllIlIIlIIIlIlIIIllIlllIl = 2;
            } else {
                this.lllIlIIlIIIlIlIIIllIlllIl = 0;
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll = Blocks.lllIIIllIIIIlllIlIIllIIll;
            this.lllIlIIlIIIlIlIIIllIlllIl = 0;
        }
    }

    class_1651(Object object) {
        this();
    }
}

