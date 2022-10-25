package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2166
extends class_1937 {
    public class_2166(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.3125f, 0.3125f);
    }

    public class_2166(class_1334 class_13342, class_1965 class_19652, double d, double d2, double d3) {
        super(class_13342, class_19652, d, d2, d3);
        this.IlIIIIIllllllIIlllIllllll(0.3125f, 0.3125f);
    }

    @Override
    protected float IlIllllllIIlIIllllIIlIIIl() {
        return this.lIlllIlllIIIIlIIlllIllIII() ? 0.73f : super.IlIllllllIIlIIllllIIlIIIl();
    }

    public class_2166(class_1334 class_13342, double d, double d2, double d3, double d4, double d5, double d6) {
        super(class_13342, d, d2, d3, d4, d5, d6);
        this.IlIIIIIllllllIIlllIllllll(0.3125f, 0.3125f);
    }

    @Override
    public boolean llIIIIIlIIlIIIIllIIIlIIII() {
        return false;
    }

    @Override
    public float lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132, class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        float f = super.lllIIIllIIIIlllIlIIllIIll(class_10132, class_13342, n, n2, n3, class_05492);
        if (this.lIlllIlllIIIIlIIlllIllIII() && class_05492 != Blocks.IllIIlllllllIIlIIlIIIIlIl && class_05492 != Blocks.IllIIIIIllIlIIllIllllllIl && class_05492 != Blocks.IIIlllllIIIIIllIllIIIIllI && class_05492 != Blocks.IlIlIIllIlIlIIIIIlIlllllI) {
            f = Math.min(0.8f, f);
        }
        return f;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1112 class_11122) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI != null) {
                if (this.lllIIIllIIIIlllIlIIllIIll != null) {
                    if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll), 8.0f) && !class_11122.IIIllIIlIIIIIIlIlIIllIIlI.IlllIIlllllllIIllIlIllllI()) {
                        this.lllIIIllIIIIlllIlIIllIIll.IlIllllllIIlIIllllIIlIIIl(5.0f);
                    }
                } else {
                    class_11122.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_0058.lIIIIlIlIIlllllIIllIIlIII, 5.0f);
                }
                if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI instanceof class_1965) {
                    int n = 0;
                    if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.IlIllllllIIlIIllllIIlIIIl) {
                        n = 10;
                    } else if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII) {
                        n = 40;
                    }
                    if (n > 0) {
                        ((class_1965)class_11122.IIIllIIlIIIIIIlIlIIllIIlI).lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.IIlllIlIlllIllIIIlllIIlIl.IlIlIIlllIllllllllIIIlIlI, 20 * n, 1));
                    }
                }
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, 1.0f, false, this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing"));
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

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(10, (Object)0);
    }

    public boolean lIlllIlllIIIIlIIlllIllIII() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(10) == 1;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(10, (byte)(bl ? 1 : 0));
    }
}

