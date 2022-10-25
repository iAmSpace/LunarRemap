package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_2026
extends Item {
    public class_2026() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIIIIIllllllIIlllIllllll);
        this.lllIlIIlIIIlIlIIIllIlllIl(1);
        this.IlIIIIIllllllIIlllIllllll(25);
    }

    @Override
    public boolean IllIIlllllllIIlIIlIIIIlIl() {
        return true;
    }

    @Override
    public boolean IIIllIllIIlIlIlIlIllllIIl() {
        return true;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_0161 class_01612;
        if (class_08142.lIlIlIIllIIIlllIllIIlIllI() && class_08142.IlIIIlIIIIllIIIllIIIIIIll instanceof class_0161 && (class_01612 = (class_0161)class_08142.IlIIIlIIIIllIIIllIIIIIIll).lllIIIIlIIllIIIlIllIlllII().IllIIIllIIIIlIlIlIllIIlll() && class_08972.lIIIIlIlIIlllllIIllIIlIII() - class_08972.IllIIIllIIIIlIlIlIllIIlll() >= 7) {
            class_01612.lllIIIIlIIllIIIlIllIlllII().IIIllIllIIlIlIlIlIllllIIl();
            class_08972.lllIIIllIIIIlllIlIIllIIll(7, (class_1965)class_08142);
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                ItemStack class_08973 = new ItemStack(Items.llIllllIIIIIlIIlIlllIIlll);
                class_08973.lIlllIlllIIIIlIIlllIllIII(class_08972.lIlllIlllIIIIlIIlllIllIII);
                return class_08973;
            }
        }
        return class_08972;
    }
}

