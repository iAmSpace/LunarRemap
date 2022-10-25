package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1291 {
    private final int lllIIIllIIIIlllIlIIllIIll;
    public final class_0850 lIllllIIlIIIlIllllllIIIll;
    public int IIIllIIlIIIIIIlIlIIllIIlI;
    public int IllIIlllllllIIlIIlIIIIlIl;
    public int IIIllIllIIlIlIlIlIllllIIl;

    public class_1291(class_0850 class_08502, int n, int n2, int n3) {
        this.lIllllIIlIIIlIllllllIIIll = class_08502;
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.IllIIlllllllIIlIIlIIIIlIl = n2;
        this.IIIllIllIIlIlIlIlIllllIIl = n3;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973) {
        int n;
        if (class_08972 != null && class_08973 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == class_08973.lllIIIllIIIIlllIlIIllIIll() && (n = class_08973.lllIlIIlIIIlIlIIIllIlllIl - class_08972.lllIlIIlIIIlIlIIIllIlllIl) > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_08972, n);
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
    }

    protected void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972) {
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, ItemStack class_08972) {
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return true;
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll() {
        return this.lIllllIIlIIIlIllllllIIIll.llIIllIllIlIIlIIllIllllll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl() {
        return this.lllIIIllIIIIlllIlIIllIIll() != null;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIIIllIIIIlllIlIIllIIll, class_08972);
        this.IlIllllllIIlIIllllIIlIIIl();
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lIllllIIlIIIlIllllllIIIll.llIIlIllIllllIlIIIIlIIlll();
    }

    public int lIlllIlllIIIIlIIlllIllIII() {
        return this.lIllllIIlIIIlIllllllIIIll.llIIlIlIlllIIllIlIlllIllI();
    }

    public class_2102 IlIIIIIllllllIIlllIllllll() {
        return null;
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n) {
        return this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, n);
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502, int n) {
        return class_08502 == this.lIllllIIlIIIlIllllllIIIll && n == this.lllIIIllIIIIlllIlIIllIIll;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return true;
    }

    public boolean lIllllIIlIIIlIllllllIIIll() {
        return true;
    }
}

