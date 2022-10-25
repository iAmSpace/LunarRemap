package obf;

import net.minecraft.util.MathHelper;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1778
extends class_1327 {
    class_1334 lllIIIllIIIIlllIlIIllIIll;
    class_1252 lllIlIIlIIIlIlIIIllIlllIl;
    int IlIllllllIIlIIllllIIlIIIl;
    double lIlllIlllIIIIlIIlllIllIII;
    boolean IlIIIIIllllllIIlllIllllll;
    class_2086 lIllllIIlIIIlIllllllIIIll;
    Class IIIllIIlIIIIIIlIlIIllIIlI;
    private int IllIIlllllllIIlIIlIIIIlIl;
    private double IIIllIllIIlIlIlIlIllllIIl;
    private double IllIIIllIIIIlIlIlIllIIlll;
    private double lIIIIlIlIIlllllIIllIIlIII;

    public class_1778(class_1252 class_12522, Class class_, double d, boolean bl) {
        this(class_12522, d, bl);
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_;
    }

    public class_1778(class_1252 class_12522, double d, boolean bl) {
        this.lllIlIIlIIIlIlIIIllIlllIl = class_12522;
        this.lllIIIllIIIIlllIlIIllIIll = class_12522.lIlIllIIlIIlIIlIIlIIlIIll;
        this.lIlllIlllIIIIlIIlllIllIII = d;
        this.IlIIIIIllllllIIlllIllllll = bl;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        class_1965 class_19652 = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll();
        if (class_19652 == null) {
            return false;
        }
        if (!class_19652.IlllIIlllllllIIllIlIllllI()) {
            return false;
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI != null && !this.IIIllIIlIIIIIIlIlIIllIIlI.isAssignableFrom(class_19652.getClass())) {
            return false;
        }
        this.lIllllIIlIIIlIllllllIIIll = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(class_19652);
        return this.lIllllIIlIIIlIllllllIIIll != null;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        class_1965 class_19652 = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll();
        return class_19652 == null ? false : (!class_19652.IlllIIlllllllIIllIlIllllI() ? false : (!this.IlIIIIIllllllIIlllIllllll ? !this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lIllllIIlIIIlIllllllIIIll() : this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(class_19652.IllIIIIllIIllIllIlllIlIIl))));
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll, this.lIlllIlllIIIIlIIlllIllIII);
        this.IllIIlllllllIIlIIlIIIIlIl = 0;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        class_1965 class_19652 = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIllIlIIlIIlIllIlIlll();
        this.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(class_19652, 30.0f, 30.0f);
        double d = this.lllIlIIlIIIlIlIIIllIlllIl.lIllllIIlIIIlIllllllIIIll(class_19652.IlIIlllllIIlIlIlllllIllll, class_19652.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl, class_19652.IllIIIIllIIllIllIlllIlIIl);
        double d2 = this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f * this.lllIlIIlIIIlIlIIIllIlllIl.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f + class_19652.IIIIlIlIIlIIIIlIlllIlIIII;
        --this.IllIIlllllllIIlIIlIIIIlIl;
        if ((this.IlIIIIIllllllIIlllIllllll || this.lllIlIIlIIIlIlIIIllIlllIl.IIIIIIIIlIllIIllIIlllIllI().lllIIIllIIIIlllIlIIllIIll(class_19652)) && this.IllIIlllllllIIlIIlIIIIlIl <= 0 && (this.IIIllIllIIlIlIlIlIllllIIl == 0.0 && this.IllIIIllIIIIlIlIlIllIIlll == 0.0 && this.lIIIIlIlIIlllllIIllIIlIII == 0.0 || class_19652.lIllllIIlIIIlIllllllIIIll(this.IIIllIllIIlIlIlIlIllllIIl, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII) >= 1.0 || this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIlIIlIIIIllllIllllI().nextFloat() < 0.05f)) {
            this.IIIllIllIIlIlIlIlIllllIIl = class_19652.IlIIlllllIIlIlIlllllIllll;
            this.IllIIIllIIIIlIlIlIllIIlll = class_19652.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl;
            this.lIIIIlIlIIlllllIIllIIlIII = class_19652.IllIIIIllIIllIllIlllIlIIl;
            this.IllIIlllllllIIlIIlIIIIlIl = 4 + this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIIlIIlIIIIllllIllllI().nextInt(7);
            if (d > 1024.0) {
                this.IllIIlllllllIIlIIlIIIIlIl += 10;
            } else if (d > 256.0) {
                this.IllIIlllllllIIlIIlIIIIlIl += 5;
            }
            if (!this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(class_19652, this.lIlllIlllIIIIlIIlllIllIII)) {
                this.IllIIlllllllIIlIIlIIIIlIl += 15;
            }
        }
        this.IlIllllllIIlIIllllIIlIIIl = Math.max(this.IlIllllllIIlIIllllIIlIIIl - 1, 0);
        if (d <= d2 && this.IlIllllllIIlIIllllIIlIIIl <= 20) {
            this.IlIllllllIIlIIllllIIlIIIl = 20;
            if (this.lllIlIIlIIIlIlIIIllIlllIl.lIIIIlIlIlIIIlIIllIIlIlIl() != null) {
                this.lllIlIIlIIIlIlIIIllIlllIl.lIIlIIIIIlIlllIlIIlIlIlll();
            }
            this.lllIlIIlIIIlIlIIIllIlllIl.llIIllIllIlIIlIIllIllllll(class_19652);
        }
    }
}

