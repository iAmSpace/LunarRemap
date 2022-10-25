package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1135
extends class_1747 {
    protected class_1135() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        ItemStack class_08973 = new ItemStack(Items.IIIIIlllIIllllIlllIlllIIl, 1, class_13342.IlIllllllIIlIIllllIIlIIIl("map"));
        String string = "map_" + class_08973.IllIIIllIIIIlIlIlIllIIlll();
        class_0963 class_09632 = new class_0963(string);
        class_13342.lllIIIllIIIIlllIlIIllIIll(string, class_09632);
        class_09632.IlIIIIIllllllIIlllIllllll = 0;
        int n = 128 * (1 << class_09632.IlIIIIIllllllIIlllIllllll);
        class_09632.lllIlIIlIIIlIlIIIllIlllIl = (int)(Math.round(class_08142.IlIIlllllIIlIlIlllllIllll / (double)n) * (long)n);
        class_09632.IlIllllllIIlIIllllIIlIIIl = (int)(Math.round(class_08142.IllIIIIllIIllIllIlllIlIIl / (double)n) * (long)n);
        class_09632.lIlllIlllIIIIlIIlllIllIII = (byte)class_13342.IlIlIIlllIIlIllIIIlllllIl.IIIllIllIIlIlIlIlIllllIIl;
        class_09632.lIlllIlllIIIIlIIlllIllIII();
        --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
            return class_08973;
        }
        if (!class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_08973.llIIlllIllIllllIIIlIIIIII())) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_08973, false);
        }
        return class_08972;
    }
}

