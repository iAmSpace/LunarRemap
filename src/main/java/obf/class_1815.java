package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1815
extends class_0208 {
    public class_1815() {
        super(3, 3, new ItemStack[]{new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl), new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl), new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl), new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl), new ItemStack(Items.IIIIIlllIIllllIlllIlllIIl, 0, 32767), new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl), new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl), new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl), new ItemStack(Items.IIIIIllIlIllIlIlIIlIllIIl)}, new ItemStack(Items.lIlIIIlIlIllIlIlIIIlIlIII, 0, 0));
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132, class_1334 class_13342) {
        if (!super.lllIIIllIIIIlllIlIIllIIll(class_00132, class_13342)) {
            return false;
        }
        ItemStack class_08972 = null;
        for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll() && class_08972 == null; ++i) {
            ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(i);
            if (class_08973 == null || class_08973.lllIIIllIIIIlllIlIIllIIll() != Items.IIIIIlllIIllllIlllIlllIIl) continue;
            class_08972 = class_08973;
        }
        if (class_08972 == null) {
            return false;
        }
        class_0963 class_09632 = Items.IIIIIlllIIllllIlllIlllIIl.lllIIIllIIIIlllIlIIllIIll(class_08972, class_13342);
        return class_09632 == null ? false : class_09632.IlIIIIIllllllIIlllIllllll < 4;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0013 class_00132) {
        ItemStack class_08972 = null;
        for (int i = 0; i < class_00132.IlIIIIIllllllIIlllIllllll() && class_08972 == null; ++i) {
            ItemStack class_08973 = class_00132.llIIllIllIlIIlIIllIllllll(i);
            if (class_08973 == null || class_08973.lllIIIllIIIIlllIlIIllIIll() != Items.IIIIIlllIIllllIlllIlllIIl) continue;
            class_08972 = class_08973;
        }
        class_08972 = class_08972.llIIlllIllIllllIIIlIIIIII();
        class_08972.lllIlIIlIIIlIlIIIllIlllIl = 1;
        if (class_08972.lllllIlllIIllIlIIlIIIllII() == null) {
            class_08972.lIlllIlllIIIIlIIlllIllIII(new class_0775());
        }
        class_08972.lllllIlllIIllIlIIlIIIllII().lllIIIllIIIIlllIlIIllIIll("map_is_scaling", true);
        return class_08972;
    }
}

