package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1614
extends class_1469 {
    protected class_1614(int n, int n2, class_0841 class_08412) {
        super(n, n2, class_08412);
        this.lllIIIllIIIIlllIlIIllIIll("fishingSpeed");
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return 15 + (n - 1) * 9;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return super.lllIIIllIIIIlllIlIIllIIll(n) + 50;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 3;
    }
}

