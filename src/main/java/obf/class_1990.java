package obf;/*
 * Decompiled with CFR 0.150.
 */
import java.util.List;
import java.util.Random;

public class class_1990
extends class_0609 {
    private class_2102[] lIlIIllllIlIIIIllIIIIlIIl;

    public class_1990() {
        super(true);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 20;
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        int n4;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && ((n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) & 8) == 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && ((n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) & 8) != 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
        }
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) != 0 ? 15 : 0;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) == 0 ? 0 : (n4 == 1 ? 15 : 0);
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        boolean bl = (n4 & 8) != 0;
        boolean bl2 = false;
        float f = 0.125f;
        List list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_1860.class, class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (float)(n2 + 1) - f, (float)(n3 + 1) - f));
        if (!list.isEmpty()) {
            bl2 = true;
        }
        if (bl2 && !bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 | 8, 3);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
        }
        if (!bl2 && bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 & 7, 3);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
        }
        if (bl2) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
        }
        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3, this);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    @Override
    public boolean IIllIllIIllIIlllIIIlIlllI() {
        return true;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if ((class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) > 0) {
            float f = 0.125f;
            List list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_2200.class, class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (float)(n2 + 1) - f, (float)(n3 + 1) - f));
            if (list.size() > 0) {
                return ((class_2200)list.get(0)).IlIIIIIllllllIIlllIllllll().lllIIIllIIIIlllIlIIllIIll();
            }
            List list2 = class_13342.lllIIIllIIIIlllIlIIllIIll(class_1860.class, class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (float)(n2 + 1) - f, (float)(n3 + 1) - f), class_0830.IlIllllllIIlIIllllIIlIIIl);
            if (list2.size() > 0) {
                return class_1071.lllIlIIlIIIlIlIIIllIlllIl((class_0850)list2.get(0));
            }
        }
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.lIlIIllllIlIIIIllIIIIlIIl = new class_2102[2];
        this.lIlIIllllIlIIIIllIIIIlIIl[0] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI());
        this.lIlIIllllIlIIIIllIIIIlIIl[1] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_powered");
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return (n2 & 8) != 0 ? this.lIlIIllllIlIIIIllIIIIlIIl[1] : this.lIlIIllllIlIIIIllIIIIlIIl[0];
    }
}

