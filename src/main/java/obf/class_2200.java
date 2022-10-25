package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2200
extends class_1860 {
    private final class_0484 lllIIIllIIIIlllIlIIllIIll = new class_1932(this);
    private int lllIlIIlIIIlIlIIIllIlllIl = 0;

    public class_2200(class_1334 class_13342) {
        super(class_13342);
    }

    public class_2200(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(23, "");
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(24, "");
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(23, this.IlIIIIIllllllIIlllIllllll().IlIllllllIIlIIllllIIlIIIl());
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(24, class_2095.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll().lllIlIIlIIIlIlIIIllIlllIl()));
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_07752);
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 6;
    }

    @Override
    public Block lIlllIlllIIIIlIIlllIllIII() {
        return Blocks.IlIlIIllIlIlIIIIIlIlllllI;
    }

    public class_0484 IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, boolean bl) {
        if (bl && this.IlllIIIllllIIllIllIlIIlIl - this.lllIlIIlIIIlIlIIIllIlllIl >= 4) {
            this.IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll);
            this.lllIlIIlIIIlIlIIIllIlllIl = this.IlllIIIllllIIllIllIlIIlIl;
        }
    }

    @Override
    public boolean b_(class_0814 class_08142) {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll());
        }
        return super.b_(class_08142);
    }

    @Override
    public void IllIIIllIIIIlIlIlIllIIlll(int n) {
        super.IllIIIllIIIIlIlIlIllIIlll(n);
        if (n == 24) {
            try {
                this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(class_2095.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl().IlIIIIIllllllIIlllIllllll(24)));
            }
            catch (Throwable throwable) {}
        } else if (n == 23) {
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(this.lIlIIllllIlIIIIllIIIIlIIl().IlIIIIIllllllIIlllIllllll(23));
        }
    }
}

