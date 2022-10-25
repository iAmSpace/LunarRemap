package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0794
extends Block {
    public class_0794() {
        super(class_1855.IlIlIIlIlIllIIlIlIIllIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        float f = 0.125f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n + 1, (float)(n2 + 1) - f, n3 + 1);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        class_15212.IIIIIIIIlIllIIllIIlllIllI *= 0.4;
        class_15212.llIIIlllIlllIlIllIIIIllIl *= 0.4;
    }
}

