package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1625
extends class_1291 {
    private final class_1086 lllIIIllIIIIlllIlIIllIIll;
    private class_0814 lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIllllllIIlIIllllIIlIIIl;
    private final class_1510 lIlllIlllIIIIlIIlllIllIII;

    public class_1625(class_0814 class_08142, class_1510 class_15102, class_1086 class_10862, int n, int n2, int n3) {
        super(class_10862, n, n2, n3);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08142;
        this.lIlllIlllIIIIlIIlllIllIII = class_15102;
        this.lllIIIllIIIIlllIlIIllIIll = class_10862;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return false;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n) {
        if (this.lllIlIIlIIIlIlIIIllIlllIl()) {
            this.IlIllllllIIlIIllllIIlIIIl += Math.min(n, this.lllIIIllIIIIlllIlIIllIIll().lllIlIIlIIIlIlIIIllIlllIl);
        }
        return super.lllIIIllIIIIlllIlIIllIIll(n);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n) {
        this.IlIllllllIIlIIllllIIlIIIl += n;
        this.lIlllIlllIIIIlIIlllIllIII(class_08972);
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972) {
        class_08972.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl);
        this.IlIllllllIIlIIllllIIlIIIl = 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, ItemStack class_08972) {
        ItemStack class_08973;
        ItemStack class_08974;
        this.lIlllIlllIIIIlIIlllIllIII(class_08972);
        class_2187 class_21872 = this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl();
        if (class_21872 != null && (this.lllIIIllIIIIlllIlIIllIIll(class_21872, class_08974 = this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(0), class_08973 = this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(1)) || this.lllIIIllIIIIlllIlIIllIIll(class_21872, class_08973, class_08974))) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(class_21872);
            if (class_08974 != null && class_08974.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                class_08974 = null;
            }
            if (class_08973 != null && class_08973.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                class_08973 = null;
            }
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(0, class_08974);
            this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(1, class_08973);
        }
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_2187 class_21872, ItemStack class_08972, ItemStack class_08973) {
        ItemStack class_08974 = class_21872.lllIIIllIIIIlllIlIIllIIll();
        ItemStack class_08975 = class_21872.lllIlIIlIIIlIlIIIllIlllIl();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == class_08974.lllIIIllIIIIlllIlIIllIIll()) {
            if (class_08975 != null && class_08973 != null && class_08975.lllIIIllIIIIlllIlIIllIIll() == class_08973.lllIIIllIIIIlllIlIIllIIll()) {
                class_08972.lllIlIIlIIIlIlIIIllIlllIl -= class_08974.lllIlIIlIIIlIlIIIllIlllIl;
                class_08973.lllIlIIlIIIlIlIIIllIlllIl -= class_08975.lllIlIIlIIIlIlIIIllIlllIl;
                return true;
            }
            if (class_08975 == null && class_08973 == null) {
                class_08972.lllIlIIlIIIlIlIIIllIlllIl -= class_08974.lllIlIIlIIIlIlIIIllIlllIl;
                return true;
            }
        }
        return false;
    }
}

