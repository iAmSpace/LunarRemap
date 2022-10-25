package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0971
implements class_0850 {
    private ItemStack[] lllIIIllIIIIlllIlIIllIIll = new ItemStack[1];

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 1;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return this.lllIIIllIIIIlllIlIIllIIll[0];
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return "Result";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return false;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lllIIIllIIIIlllIlIIllIIll[0] != null) {
            ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll[0];
            this.lllIIIllIIIIlllIlIIllIIll[0] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.lllIIIllIIIIlllIlIIllIIll[0] != null) {
            ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll[0];
            this.lllIIIllIIIIlllIlIIllIIll[0] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll[0] = class_08972;
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return true;
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return true;
    }
}

