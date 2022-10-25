package obf;

import net.minecraft.block.Block;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0639
extends class_2257 {
    public class_0639() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        boolean bl = class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3);
        class_1394 class_13942 = (class_1394)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_13942 != null && class_13942.IIIllIllIIlIlIlIlIllllIIl != bl) {
            if (bl) {
                class_13942.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3);
            }
            class_13942.IIIllIllIIlIlIlIlIllllIIl = bl;
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl) {
            return true;
        }
        class_1394 class_13942 = (class_1394)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
        if (class_13942 != null) {
            class_13942.lllIIIllIIIIlllIlIIllIIll();
            class_13942.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3);
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
        class_1394 class_13942;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (class_13942 = (class_1394)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3)) != null) {
            class_13942.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3);
        }
    }

    @Override
    public class_1774 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n) {
        return new class_1394();
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        float f = (float)Math.pow(2.0, (double)(n5 - 12) / 12.0);
        String string = "harp";
        if (n4 == 1) {
            string = "bd";
        }
        if (n4 == 2) {
            string = "snare";
        }
        if (n4 == 3) {
            string = "hat";
        }
        if (n4 == 4) {
            string = "bassattack";
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "note." + string, 3.0f, f);
        class_13342.lllIIIllIIIIlllIlIIllIIll("note", (double)n + 0.5, (double)n2 + 1.2, (double)n3 + 0.5, (double)n5 / 24.0, 0.0, 0.0);
        return true;
    }
}

