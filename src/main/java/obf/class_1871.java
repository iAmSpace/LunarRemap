package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.util.MathHelper;

import java.util.Random;

class class_1871 {
    double lllIIIllIIIIlllIlIIllIIll;
    double lllIlIIlIIIlIlIIIllIlllIl;

    class_1871() {
    }

    class_1871(double d, double d2) {
        this.lllIIIllIIIIlllIlIIllIIll = d;
        this.lllIlIIlIIIlIlIIIllIlllIl = d2;
    }

    double lllIIIllIIIIlllIlIIllIIll(class_1871 class_18712) {
        double d = this.lllIIIllIIIIlllIlIIllIIll - class_18712.lllIIIllIIIIlllIlIIllIIll;
        double d2 = this.lllIlIIlIIIlIlIIIllIlllIl - class_18712.lllIlIIlIIIlIlIIIllIlllIl;
        return Math.sqrt(d * d + d2 * d2);
    }

    void lllIIIllIIIIlllIlIIllIIll() {
        double d = this.lllIlIIlIIIlIlIIIllIlllIl();
        this.lllIIIllIIIIlllIlIIllIIll /= d;
        this.lllIlIIlIIIlIlIIIllIlllIl /= d;
    }

    float lllIlIIlIIIlIlIIIllIlllIl() {
        return MathHelper.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll * this.lllIIIllIIIIlllIlIIllIIll + this.lllIlIIlIIIlIlIIIllIlllIl * this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1871 class_18712) {
        this.lllIIIllIIIIlllIlIIllIIll -= class_18712.lllIIIllIIIIlllIlIIllIIll;
        this.lllIlIIlIIIlIlIIIllIlllIl -= class_18712.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, double d4) {
        boolean bl = false;
        if (this.lllIIIllIIIIlllIlIIllIIll < d) {
            this.lllIIIllIIIIlllIlIIllIIll = d;
            bl = true;
        } else if (this.lllIIIllIIIIlllIlIIllIIll > d3) {
            this.lllIIIllIIIIlllIlIIllIIll = d3;
            bl = true;
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl < d2) {
            this.lllIlIIlIIIlIlIIIllIlllIl = d2;
            bl = true;
        } else if (this.lllIlIIlIIIlIlIIIllIlllIl > d4) {
            this.lllIlIIlIIIlIlIIIllIlllIl = d4;
            bl = true;
        }
        return bl;
    }

    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl);
        for (int i = 256; i > 0; --i) {
            if (class_13342.a_(n, i, n2).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
            return i + 1;
        }
        return 257;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342) {
        int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIIIllIIIIlllIlIIllIIll);
        int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.lllIlIIlIIIlIlIIIllIlllIl);
        int n3 = 256;
        if (n3 <= 0) {
            return false;
        }
        class_1855 class_18552 = class_13342.a_(n, n3, n2).lIllllIIlIIIlIllllllIIIll();
        return !class_18552.lllIIIllIIIIlllIlIIllIIll() && class_18552 != class_1855.IlIlllIIIIIIlIIllIIllIlll;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Random random, double d, double d2, double d3, double d4) {
        this.lllIIIllIIIIlllIlIIllIIll = MathHelper.lllIIIllIIIIlllIlIIllIIll(random, d, d3);
        this.lllIlIIlIIIlIlIIIllIlllIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(random, d2, d4);
    }
}

