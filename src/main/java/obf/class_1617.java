package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1617
extends class_0512 {
    public class_1617(class_1334 class_13342) {
        super(class_13342);
    }

    public class_1617(class_1334 class_13342, class_1965 class_19652) {
        super(class_13342, class_19652);
    }

    public class_1617(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342, d, d2, d3);
    }

    @Override
    protected float IlIllllllIIlIIllllIIlIIIl() {
        return 0.07f;
    }

    @Override
    protected float lIlllIlllIIIIlIIlllIllIII() {
        return 0.7f;
    }

    @Override
    protected float IlIIIIIllllllIIlllIllllll() {
        return -20.0f;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_1112 class_11122) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            int n;
            this.lIlIllIIlIIlIIlIIlIIlIIll.IlIllllllIIlIIllllIIlIIIl(2002, (int)Math.round(this.IlIIlllllIIlIlIlllllIllll), (int)Math.round(this.llIIlIlIlllIIllIlIlllIllI), (int)Math.round(this.IllIIIIllIIllIllIlllIlIIl), 0);
            for (int i = 3 + this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(5) + this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(5); i > 0; i -= n) {
                n = class_1138.lllIIIllIIIIlllIlIIllIIll(i);
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1138(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, n));
            }
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }
}

