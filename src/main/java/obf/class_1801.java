package obf;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1801
extends class_1327 {
    private class_1252 lllIIIllIIIIlllIlIIllIIll;
    private double lllIlIIlIIIlIlIIIllIlllIl;
    private double IlIllllllIIlIIllllIIlIIIl;
    private double lIlllIlllIIIIlIIlllIllIII;
    private double IlIIIIIllllllIIlllIllllll;
    private double lIllllIIlIIIlIllllllIIIll;
    private double IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0814 IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private boolean IllIIIllIIIIlIlIlIllIIlll;
    private Item lIIIIlIlIIlllllIIllIIlIII;
    private boolean llIIlllIllIllllIIIlIIIIII;
    private boolean llIIllIllIlIIlIIllIllllll;

    public class_1801(class_1252 class_12522, double d, Item class_06112, boolean bl) {
        this.lllIIIllIIIIlllIlIIllIIll = class_12522;
        this.lllIlIIlIIIlIlIIIllIlllIl = d;
        this.lIIIIlIlIIlllllIIllIIlIII = class_06112;
        this.llIIlllIllIllllIIIlIIIIII = bl;
        this.lllIIIllIIIIlllIlIIllIIll(3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.IIIllIllIIlIlIlIlIllllIIl > 0) {
            --this.IIIllIllIIlIlIlIlIllllIIl;
            return false;
        }
        this.IllIIlllllllIIlIIlIIIIlIl = this.lllIIIllIIIIlllIlIIllIIll.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this.lllIIIllIIIIlllIlIIllIIll, 10.0);
        if (this.IllIIlllllllIIlIIlIIIIlIl == null) {
            return false;
        }
        ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl.IllIlIlIIIlIllIlIlIIlllII();
        return class_08972 == null ? false : class_08972.lllIIIllIIIIlllIlIIllIIll() == this.lIIIIlIlIIlllllIIllIIlIII;
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        if (this.llIIlllIllIllllIIIlIIIIII) {
            if (this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll((class_1521)this.IllIIlllllllIIlIIlIIIIlIl) < 36.0) {
                if (this.IllIIlllllllIIlIIlIIIIlIl.lIllllIIlIIIlIllllllIIIll(this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.IlIIIIIllllllIIlllIllllll) > 0.010000000000000002) {
                    return false;
                }
                if (Math.abs((double)this.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIllllllllIIIlIlI - this.lIllllIIlIIIlIllllllIIIll) > 5.0 || Math.abs((double)this.IllIIlllllllIIlIIlIIIIlIl.IIIIlIllIlIIlIIlIllIlIlll - this.IIIllIIlIIIIIIlIlIIllIIlI) > 5.0) {
                    return false;
                }
            } else {
                this.IlIllllllIIlIIllllIIlIIIl = this.IllIIlllllllIIlIIlIIIIlIl.IlIIlllllIIlIlIlllllIllll;
                this.lIlllIlllIIIIlIIlllIllIII = this.IllIIlllllllIIlIIlIIIIlIl.llIIlIlIlllIIllIlIlllIllI;
                this.IlIIIIIllllllIIlllIllllll = this.IllIIlllllllIIlIIlIIIIlIl.IllIIIIllIIllIllIlllIlIIl;
            }
            this.lIllllIIlIIIlIllllllIIIll = this.IllIIlllllllIIlIIlIIIIlIl.IlIlIIlllIllllllllIIIlIlI;
            this.IIIllIIlIIIIIIlIlIIllIIlI = this.IllIIlllllllIIlIIlIIIIlIl.IIIIlIllIlIIlIIlIllIlIlll;
        }
        return this.lllIIIllIIIIlllIlIIllIIll();
    }

    @Override
    public void IlIIIIIllllllIIlllIllllll() {
        this.IlIllllllIIlIIllllIIlIIIl = this.IllIIlllllllIIlIIlIIIIlIl.IlIIlllllIIlIlIlllllIllll;
        this.lIlllIlllIIIIlIIlllIllIII = this.IllIIlllllllIIlIIlIIIIlIl.llIIlIlIlllIIllIlIlllIllI;
        this.IlIIIIIllllllIIlllIllllll = this.IllIIlllllllIIlIIlIIIIlIl.IllIIIIllIIllIllIlllIlIIl;
        this.IllIIIllIIIIlIlIlIllIIlll = true;
        this.llIIllIllIlIIlIIllIllllll = this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll();
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(false);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        this.IllIIlllllllIIlIIlIIIIlIl = null;
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
        this.IIIllIllIIlIlIlIlIllllIIl = 100;
        this.IllIIIllIIIIlIlIlIllIIlll = false;
        this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.llIIllIllIlIIlIIllIllllll);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII() {
        this.lllIIIllIIIIlllIlIIllIIll.llIllllIlIllIIIlIllIIlIlI().lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, 30.0f, (float)this.lllIIIllIIIIlllIlIIllIIll.IIIlllIlIIllIIlIlIllIlIIl());
        if (this.lllIIIllIIIIlllIlIIllIIll.IlIIIIIllllllIIlllIllllll((class_1521)this.IllIIlllllllIIlIIlIIIIlIl) < 6.25) {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().IIIllIIlIIIIIIlIlIIllIIlI();
        } else {
            this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl, this.lllIlIIlIIIlIlIIIllIlllIl);
        }
    }

    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }
}

