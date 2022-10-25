package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1369
implements class_0850 {
    private String lllIIIllIIIIlllIlIIllIIll;
    private class_0850 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0850 IlIllllllIIlIIllllIIlIIIl;

    public class_1369(String string, class_0850 class_08502, class_0850 class_08503) {
        this.lllIIIllIIIIlllIlIIllIIll = string;
        if (class_08502 == null) {
            class_08502 = class_08503;
        }
        if (class_08503 == null) {
            class_08503 = class_08502;
        }
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08502;
        this.IlIllllllIIlIIllllIIlIIIl = class_08503;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll() + this.IlIllllllIIlIIllllIIlIIIl.IlIIIIIllllllIIlllIllllll();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl == class_08502 || this.IlIllllllIIlIIllllIIlIIIl == class_08502;
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.IIlllIlIlllIllIIIlllIIlIl() ? this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll() : (this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl() ? this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll() : this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.IIlllIlIlllIllIIIlllIIlIl() || this.IlIllllllIIlIIllllIIlIIIl.IIlllIlIlllIllIIIlllIIlIl();
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return n >= this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll() ? this.IlIllllllIIlIIllllIIlIIIl.llIIllIllIlIIlIIllIllllll(n - this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll()) : this.lllIlIIlIIIlIlIIIllIlllIl.llIIllIllIlIIlIIllIllllll(n);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n >= this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll() ? this.IlIllllllIIlIIllllIIlIIIl.lllIIIllIIIIlllIlIIllIIll(n - this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(), n2) : this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        return n >= this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll() ? this.IlIllllllIIlIIllllIIlIIIl.lllIIlIIIllllllIIIIlIlIlI(n - this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll()) : this.lllIlIIlIIIlIlIIIllIlllIl.lllIIlIIIllllllIIIIlIlIlI(n);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        if (n >= this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll()) {
            this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl(n - this.lllIlIIlIIIlIlIIIllIlllIl.IlIIIIIllllllIIlllIllllll(), class_08972);
        } else {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIlIIlIIIlIlIIIllIlllIl(n, class_08972);
        }
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI();
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
        this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIllIllllIlIIIIlIIlll();
        this.IlIllllllIIlIIllllIIlIIIl.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIIIIlIIlllIllIII(class_08142) && this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
        this.lllIlIIlIIIlIlIIIllIlllIl.llIllllIlIllIIIlIllIIlIlI();
        this.IlIllllllIIlIIllllIIlIIIl.llIllllIlIllIIIlIllIIlIlI();
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.lllIlIIlIIIlIlIIIllIlllIl.lIlllIlllIlIIIIlllIlIlIIl();
        this.IlIllllllIIlIIllllIIlIIIl.lIlllIlllIlIIIIlllIlIlIIl();
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return true;
    }
}

