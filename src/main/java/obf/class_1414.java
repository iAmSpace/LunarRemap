package obf;

import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1414
extends class_1071 {
    public class_0013 lllIIIllIIIIlllIlIIllIIll = new class_0013(this, 2, 2);
    public class_0850 lIllllIIlIIIlIllllllIIIll = new class_0971();
    public boolean IIIllIIlIIIIIIlIlIIllIIlI;
    private final class_0814 IllIIlllllllIIlIIlIIIIlIl;

    public class_1414(class_0503 class_05032, boolean bl, class_0814 class_08142) {
        int n;
        int n2;
        this.IIIllIIlIIIIIIlIlIIllIIlI = bl;
        this.IllIIlllllllIIlIIlIIIIlIl = class_08142;
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_1373(class_05032.lIlllIlllIIIIlIIlllIllIII, this.lllIIIllIIIIlllIlIIllIIll, this.lIllllIIlIIIlIllllllIIIll, 0, 144, 36));
        for (n2 = 0; n2 < 2; ++n2) {
            for (n = 0; n < 2; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(this.lllIIIllIIIIlllIlIIllIIll, n + n2 * 2, 88 + n * 18, 26 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 4; ++n2) {
            int n3 = n2;
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1371(this, class_05032, class_05032.IlIIIIIllllllIIlllIllllll() - 1 - n2, 8, 8 + n2 * 18, n3));
        }
        for (n2 = 0; n2 < 3; ++n2) {
            for (n = 0; n < 9; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n + (n2 + 1) * 9, 8 + n * 18, 84 + n2 * 18));
            }
        }
        for (n2 = 0; n2 < 9; ++n2) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n2, 8 + n2 * 18, 142));
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0, class_0172.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll, this.IllIIlllllllIIlIIlIIIIlIl.lIlIllIIlIIlIIlIIlIIlIIll));
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142);
        for (int i = 0; i < 4; ++i) {
            ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI(i);
            if (class_08972 == null) continue;
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972, false);
        }
        this.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl(0, null);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return true;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        ItemStack class_08972 = null;
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            int n2;
            ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
            if (n == 0) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 9, 45, true)) {
                    return null;
                }
                class_12912.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972);
            } else if (n >= 1 && n < 5 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 9, 45, false) : (n >= 5 && n < 9 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 9, 45, false) : (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor && !((class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(5 + ((ItemArmor)class_08972.lllIIIllIIIIlllIlIIllIIll()).IllIIIllIIIIlIlIlIllIIlll)).lllIlIIlIIIlIlIIIllIlllIl() ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, n2 = 5 + ((ItemArmor)class_08972.lllIIIllIIIIlllIlIIllIIll()).IllIIIllIIIIlIlIlIllIIlll, n2 + 1, false) : (n >= 9 && n < 36 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 36, 45, false) : (n >= 36 && n < 45 ? !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 9, 36, false) : !this.lllIIIllIIIIlllIlIIllIIll(class_08973, 9, 45, false)))))) {
                return null;
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_12912.lllIlIIlIIIlIlIIIllIlllIl(null);
            } else {
                class_12912.IlIllllllIIlIIllllIIlIIIl();
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                return null;
            }
            class_12912.lllIIIllIIIIlllIlIIllIIll(class_08142, class_08973);
        }
        return class_08972;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1291 class_12912) {
        return class_12912.lIllllIIlIIIlIllllllIIIll != this.lIllllIIlIIIlIllllllIIIll && super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_12912);
    }
}

