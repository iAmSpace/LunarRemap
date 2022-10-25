package obf;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0752
extends class_1469 {
    protected class_0752(int n, int n2, class_0841 class_08412) {
        super(n, n2, class_08412);
        if (class_08412 == class_0841.IllIIlllllllIIlIIlIIIIlIl) {
            this.lllIIIllIIIIlllIlIIllIIll("lootBonusDigger");
        } else if (class_08412 == class_0841.IIIllIllIIlIlIlIlIllllIIl) {
            this.lllIIIllIIIIlllIlIIllIIll("lootBonusFishing");
        } else {
            this.lllIIIllIIIIlllIlIIllIIll("lootBonus");
        }
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

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_14692) && class_14692.IlIIlllllIIlIlIlllllIllll != class_0752.IlIlIIlllIIlIllIIIlllllIl.IlIIlllllIIlIlIlllllIllll;
    }
}

