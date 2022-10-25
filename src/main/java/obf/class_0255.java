package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0255
extends class_1949 {
    public class_0255(int n, float f, boolean bl) {
        super(n, f, bl);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll(ItemStack class_08972) {
        return class_08972.IllIIIllIIIIlIlIlIllIIlll() > 0;
    }

    @Override
    public class_0552 lIIIIlIlIIlllllIIllIIlIII(ItemStack class_08972) {
        return class_08972.IllIIIllIIIIlIlIlIllIIlll() == 0 ? class_0552.IlIllllllIIlIIllllIIlIIIl : class_0552.lIlllIlllIIIIlIIlllIllIII;
    }

    @Override
    protected void lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.llIIlIllIllllIlIIIIlIIlll.IlIlIIlllIllllllllIIIlIlI, 2400, 0));
        }
        if (class_08972.IllIIIllIIIIlIlIlIllIIlll() > 0) {
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.llIIlllIllIllllIIIlIIIIII.IlIlIIlllIllllllllIIIlIlI, 600, 4));
                class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.llIIllIllIlIIlIIllIllllll.IlIlIIlllIllllllllIIIlIlI, 6000, 0));
                class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.lllIIlIIIllllllIIIIlIlIlI.IlIlIIlllIllllllllIIIlIlI, 6000, 0));
            }
        } else {
            super.lIlllIlllIIIIlIIlllIllIII(class_08972, class_13342, class_08142);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
    }
}

