package obf;

import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0355
extends class_1521 {
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0355(class_1334 class_13342) {
        super(class_13342);
        this.lIIlIIIIIlIlllIlIIlIlIlll = true;
        this.IlIIIIIllllllIIlllIllllll(2.0f, 2.0f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
        this.lllIlIIlIIIlIlIIIllIlllIl = 5;
        this.lllIIIllIIIIlllIlIIllIIll = this.IlllIIlllllllIIllIlIllllI.nextInt(100000);
    }

    public class_0355(class_1334 class_13342, double d, double d2, double d3) {
        this(class_13342);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(8, (Object)this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public void s_() {
        this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
        this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
        this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
        ++this.lllIIIllIIIIlllIlIIllIIll;
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(8, this.lllIlIIlIIIlIlIIIllIlllIl);
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI);
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlllIIlIllIIIlllllIl instanceof class_1863 && this.lIlIllIIlIIlIIlIIlIIlIIll.a_(n, n2, n3) != Blocks.lIIlIlllIllIlIlllIIIIIIII) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIlIlllIllIlIlllIIIIIIII);
        }
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    @Override
    public boolean IllllIIlIIIllIlllIlllIllI() {
        return true;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (!this.IllllIIIIlIIlIIIIlllIIIIl && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIlIIlIIIlIlIIIllIlllIl = 0;
            if (this.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                this.IIIIlIIlIIIllIIIIllIIIlII();
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)null, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, 6.0f, true);
                }
            }
        }
        return true;
    }
}

