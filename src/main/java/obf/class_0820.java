package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0820
extends class_1327 {
    private class_2094 lIlllIlllIIIIlIIlllIllIII;
    private class_1965 IlIIIIIllllllIIlllIllllll;
    class_1334 lllIIIllIIIIlllIlIIllIIll;
    private double lIllllIIlIIIlIllllllIIIll;
    private class_1939 IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    float lllIlIIlIIIlIlIIIllIlllIl;
    float IlIllllllIIlIIllllIIlIIIl;
    private boolean IIIllIllIIlIlIlIlIllllIIl;

    public class_0820(class_2094 class_20942, double d, float f, float f2) {
        this.lIlllIlllIIIIlIIlllIllIII = class_20942;
        this.lllIIIllIIIIlllIlIIllIIll = class_20942.lIlIllIIlIIlIIlIIlIIlIIll;
        this.lIllllIIlIIIlIllllllIIIll = d;
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_20942.IllIIIIllIIllIllIlllIlIIl();
        this.IlIllllllIIlIIllllIIlIIIl = f;
        this.lllIlIIlIIIlIlIIIllIlllIl = f2;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        class_1965 class_19652 = this.lIlllIlllIIIIlIIlllIllIII.lIlIlIIllIlIIIIIlIIlllIlI();
        if (class_19652 == null) {
            return false;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.IlIllIIIIllllIIllIllIIIIl()) {
            return false;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll((class_1521)class_19652) < (double)(this.IlIllllllIIlIIllllIIlIIIl * this.IlIllllllIIlIIllllIIlIIIl)) {
            return false;
        }
        this.IlIIIIIllllllIIlllIllllll = class_19652;
        return true;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return !this.IIIllIIlIIIIIIlIlIIllIIlI.lIllllIIlIIIlIllllllIIIll() && this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll((class_1521)this.IlIIIIIllllllIIlllIllllll) > (double)(this.lllIlIIlIIIlIlIIIllIlllIl * this.lllIlIIlIIIlIlIIIllIlllIl) && !this.lIlllIlllIIIIlIIlllIllIII.IlIllIIIIllllIIllIllIIIIl();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IllIIlllllllIIlIIlIIIIlIl = 0;
        this.IIIllIllIIlIlIlIlIllllIIl = this.lIlllIlllIIIIlIIlllIllIII.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll();
        this.lIlllIlllIIIIlIIlllIllIII.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(false);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IlIIIIIllllllIIlllIllllll = null;
        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI();
        this.lIlllIlllIIIIlIIlllIllIII.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IIIllIllIIlIlIlIlIllllIIl);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lIlllIlllIIIIlIIlllIllIII.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, 10.0f, (float)this.lIlllIlllIIIIlIIlllIllIII.IIIlllIlIIllIIlIlIllIlIIl());
        if (!this.lIlllIlllIIIIlIIlllIllIII.IlIllIIIIllllIIllIllIIIIl() && --this.IllIIlllllllIIlIIlIIIIlIl <= 0) {
            this.IllIIlllllllIIlIIlIIIIlIl = 10;
            if (!this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(this.IlIIIIIllllllIIlllIllllll, this.lIllllIIlIIIlIllllllIIIll) && !this.lIlllIlllIIIIlIIlllIllIII.lIIIIIlIllIllIlIlIIllllll() && this.lIlllIlllIIIIlIIlllIllIII.IlIIIIIllllllIIlllIllllll((class_1521)this.IlIIIIIllllllIIlllIllllll) >= 144.0) {
                int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll.IlIIlllllIIlIlIlllllIllll) - 2;
                int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll.IllIIIIllIIllIllIlllIlIIl) - 2;
                int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIIIIllllllIIlllIllllll.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl);
                for (int i = 0; i <= 4; ++i) {
                    for (int j = 0; j <= 4; ++j) {
                        if (i >= 1 && j >= 1 && i <= 3 && j <= 3 || !class_1334.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n + i, n3 - 1, n2 + j) || this.lllIIIllIIIIlllIlIIllIIll.a_(n + i, n3, n2 + j).IIIllIllIIlIlIlIlIllllIIl() || this.lllIIIllIIIIlllIlIIllIIll.a_(n + i, n3 + 1, n2 + j).IIIllIllIIlIlIlIlIllllIIl()) continue;
                        this.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl((float)(n + i) + 0.5f, n3, (float)(n2 + j) + 0.5f, this.lIlllIlllIIIIlIIlllIllIII.IIIIlIllIlIIlIIlIllIlIlll, this.lIlllIlllIIIIlIIlllIllIII.IlIlIIlllIllllllllIIIlIlI);
                        this.IIIllIIlIIIIIIlIlIIllIIlI.IIIllIIlIIIIIIlIlIIllIIlI();
                        return;
                    }
                }
            }
        }
    }
}

