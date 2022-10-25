package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0286
extends class_0703 {
    private int lllIIIllIIIIlllIlIIllIIll;
    private ItemStack lllIlIIlIIIlIlIIIllIlllIl;

    public class_0286() {
    }

    public class_0286(int n, ItemStack class_08972) {
        this.lllIIIllIIIIlllIlIIllIIll = n;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08972 != null ? class_08972.llIIlllIllIllllIIIlIIIIII() : null;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1829 class_18292) {
        class_18292.lllIIIllIIIIlllIlIIllIIll(this);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0181 class_01812) {
        this.lllIIIllIIIIlllIlIIllIIll = class_01812.readShort();
        this.lllIlIIlIIIlIlIIIllIlllIl = class_01812.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0181 class_01812) {
        class_01812.writeShort(this.lllIIIllIIIIlllIlIIllIIll);
        class_01812.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public ItemStack lIlllIlllIIIIlIIlllIllIII() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_2075 class_20752) {
        this.lllIIIllIIIIlllIlIIllIIll((class_1829)class_20752);
    }
}

