package obf;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1349
extends class_1252
implements class_1463 {
    public class_1349(class_1334 class_13342) {
        super(class_13342);
    }

    @Override
    public boolean IlIIIIIIIIIIlIIlllIIIlIlI() {
        return true;
    }

    @Override
    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI);
    }

    @Override
    public int IIllIllIIllIIlllIIIlIlllI() {
        return 120;
    }

    @Override
    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return true;
    }

    @Override
    protected int IlIIIIIllllllIIlllIllllll(class_0814 class_08142) {
        return 1 + this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextInt(3);
    }

    @Override
    public void lllIIIIIIlIlllIIlIlIIIllI() {
        int n = this.lIlIllIIllIIIIlllIlIlllIl();
        super.lllIIIIIIlIlllIIlIlIIIllI();
        if (this.IlllIIlllllllIIllIlIllllI() && !this.llIlllIlIIllIlIIIIllIIlIl()) {
            this.IllIIlllllllIIlIIlIIIIlIl(--n);
            if (this.lIlIllIIllIIIIlllIlIlllIl() == -20) {
                this.IllIIlllllllIIlIIlIIIIlIl(0);
                this.lllIIIllIIIIlllIlIIllIIll(class_0058.IlIIIIIllllllIIlllIllllll, 2.0f);
            }
        } else {
            this.IllIIlllllllIIlIIlIIIIlIl(300);
        }
    }
}

