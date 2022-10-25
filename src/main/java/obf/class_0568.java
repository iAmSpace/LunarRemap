package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0568
implements class_2098 {
    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, class_1334 class_13342) {
        int n = 0;
        ItemStack class_08972 = null;
        for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
            ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(i);
            if (class_08973 == null) continue;
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.lIIIlllllllIlllIIllllllll) {
                if (class_08972 != null) {
                    return false;
                }
                class_08972 = class_08973;
                continue;
            }
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() != Items.lIIIIlIIIIllIlIIllllIlIII) {
                return false;
            }
            ++n;
        }
        return class_08972 != null && n > 0;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132) {
        int n = 0;
        ItemStack class_08972 = null;
        for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll(); ++i) {
            ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(i);
            if (class_08973 == null) continue;
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() == Items.lIIIlllllllIlllIIllllllll) {
                if (class_08972 != null) {
                    return null;
                }
                class_08972 = class_08973;
                continue;
            }
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() != Items.lIIIIlIIIIllIlIIllllIlIII) {
                return null;
            }
            ++n;
        }
        if (class_08972 != null && n >= 1) {
            ItemStack class_08974 = new ItemStack(Items.lIIIlllllllIlllIIllllllll, n + 1);
            class_08974.lIlllIlllIIIIlIIlllIllIII((class_0775)class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl());
            if (class_08972.IlIIIlIIIIllIIIllIIIIIIll()) {
                class_08974.lllIIIllIIIIlllIlIIllIIll(class_08972.lIIlIIIIIlIlllIlIIlIlIlll());
            }
            return class_08974;
        }
        return null;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll() {
        return 9;
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl() {
        return null;
    }
}

