package obf;

import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1394
extends class_1774 {
    public byte IllIIlllllllIIlIIlIIIIlIl;
    public boolean IIIllIllIIlIlIlIlIllllIIl;

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("note", this.IllIIlllllllIIlIIlIIIIlIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.lIlllIlllIIIIlIIlllIllIII("note");
        if (this.IllIIlllllllIIlIIlIIIIlIl < 0) {
            this.IllIIlllllllIIlIIlIIIIlIl = 0;
        }
        if (this.IllIIlllllllIIlIIlIIIIlIl > 24) {
            this.IllIIlllllllIIlIIlIIIIlIl = (byte)24;
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll() {
        this.IllIIlllllllIIlIIlIIIIlIl = (byte)((this.IllIIlllllllIIlIIlIIIIlIl + 1) % 25);
        this.llIIlIllIllllIlIIIIlIIlll();
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        if (class_13342.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) {
            class_1855 class_18552 = class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll();
            int n4 = 0;
            if (class_18552 == class_1855.IlIIIIIllllllIIlllIllllll) {
                n4 = 1;
            }
            if (class_18552 == class_1855.IlIlIIlIlIllIIlIlIIllIIIl) {
                n4 = 2;
            }
            if (class_18552 == class_1855.lIIlIIIIIlIlllIlIIlIlIlll) {
                n4 = 3;
            }
            if (class_18552 == class_1855.lIlllIlllIIIIlIIlllIllIII) {
                n4 = 4;
            }
            class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3, Blocks.llIIlIlIlllIIllIlIlllIllI, n4, this.IllIIlllllllIIlIIlIIIIlIl);
        }
    }
}

