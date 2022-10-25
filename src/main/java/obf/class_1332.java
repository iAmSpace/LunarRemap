package obf;

import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1332
extends class_1937 {
    public class_1332(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.3125f, 0.3125f);
    }

    public class_1332(class_1334 class_13342, class_1965 class_19652, double d, double d2, double d3) {
        super(class_13342, class_19652, d, d2, d3);
        this.IlIIIIIllllllIIlllIllllll(0.3125f, 0.3125f);
    }

    public class_1332(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IlIIIIIllllllIIlllIllllll(0.3125f, 0.3125f);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1112 class_11122) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI != null) {
                if (!class_11122.IIIllIIlIIIIIIlIlIIllIIlI.llIlIIlllIIIIIllIIlIlIIII() && class_11122.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this, (class_1521)this.lllIIIllIIIIlllIlIIllIIll), 5.0f)) {
                    class_11122.IIIllIIlIIIIIIlIlIIllIIlI.IlIIIIIllllllIIlllIllllll(5);
                }
            } else {
                int n = class_11122.lllIlIIlIIIlIlIIIllIlllIl;
                int n2 = class_11122.IlIllllllIIlIIllllIIlIIIl;
                int n3 = class_11122.lIlllIlllIIIIlIIlllIllIII;
                switch (class_11122.IlIIIIIllllllIIlllIllllll) {
                    case 0: {
                        --n2;
                        break;
                    }
                    case 1: {
                        ++n2;
                        break;
                    }
                    case 2: {
                        --n3;
                        break;
                    }
                    case 3: {
                        ++n3;
                        break;
                    }
                    case 4: {
                        --n;
                        break;
                    }
                    case 5: {
                        ++n;
                    }
                }
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(n, n2, n3)) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIlIlllIllIlIlllIIIIIIII);
                }
            }
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        return false;
    }
}

