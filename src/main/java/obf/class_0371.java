package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.Random;

abstract class class_0371
extends class_1036 {
    protected int lllIIIllIIIIlllIlIIllIIll;
    protected int lllIlIIlIIIlIlIIIllIlllIl;
    protected int IlIllllllIIlIIllllIIlIIIl;
    protected int lIlllIlllIIIIlIIlllIllIII = -1;

    public class_0371() {
    }

    protected class_0371(Random random, int n, int n2, int n3, int n4, int n5, int n6) {
        super(0);
        this.lllIIIllIIIIlllIlIIllIIll = n4;
        this.lllIlIIlIIIlIlIIIllIlllIl = n5;
        this.IlIllllllIIlIIllllIIlIIIl = n6;
        this.lIllllIIlIIIlIllllllIIIll = random.nextInt(4);
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: 
            case 2: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n, n2, n3, n + n4 - 1, n2 + n5 - 1, n3 + n6 - 1);
                break;
            }
            default: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n, n2, n3, n + n6 - 1, n2 + n5 - 1, n3 + n4 - 1);
            }
        }
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Width", this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Height", this.lllIlIIlIIIlIlIIIllIlllIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Depth", this.IlIllllllIIlIIllllIIlIIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("HPos", this.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("Width");
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lIllllIIlIIIlIllllllIIIll("Height");
        this.IlIllllllIIlIIllllIIlIIIl = class_07752.lIllllIIlIIIlIllllllIIIll("Depth");
        this.lIlllIlllIIIIlIIlllIllIII = class_07752.lIllllIIlIIIlIllllllIIIll("HPos");
    }

    protected boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_2046 class_20462, int n) {
        if (this.lIlllIlllIIIIlIIlllIllIII >= 0) {
            return true;
        }
        int n2 = 0;
        int n3 = 0;
        for (int i = this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl; i <= this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll; ++i) {
            for (int j = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll; j <= this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII; ++j) {
                if (!class_20462.lllIlIIlIIIlIlIIIllIlllIl(j, 64, i)) continue;
                n2 += Math.max(class_13342.IIIllIllIIlIlIlIlIllllIIl(j, i), class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl());
                ++n3;
            }
        }
        if (n3 == 0) {
            return false;
        }
        this.lIlllIlllIIIIlIIlllIllIII = n2 / n3;
        this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(0, this.lIlllIlllIIIIlIIlllIllIII - this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl + n, 0);
        return true;
    }
}

