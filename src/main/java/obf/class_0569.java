package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0569
extends Item {
    public class_0569() {
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIIIIlIlIIlllllIIllIIlIII);
    }

    @Override
    public IIcon IlIllllllIIlIIllllIIlIIIl(int n) {
        return Items.potionitem.IlIllllllIIlIIllllIIlIIIl(0);
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        class_1112 class_11122 = this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, true);
        if (class_11122 == null) {
            return class_08972;
        }
        if (class_11122.lllIIIllIIIIlllIlIIllIIll == class_1431.lllIlIIlIIIlIlIIIllIlllIl) {
            int n = class_11122.lllIlIIlIIIlIlIIIllIlllIl;
            int n2 = class_11122.IlIllllllIIlIIllllIIlIIIl;
            int n3 = class_11122.lIlllIlllIIIIlIIlllIllIII;
            if (!class_13342.lllIIIllIIIIlllIlIIllIIll(class_08142, n, n2, n3)) {
                return class_08972;
            }
            if (!class_08142.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, class_11122.IlIIIIIllllllIIlllIllllll, class_08972)) {
                return class_08972;
            }
            if (class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIlllllllIIlIIlIIIIlIl) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                    return new ItemStack(Items.potionitem);
                }
                if (!class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.potionitem))) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Items.potionitem, 1, 0), false);
                }
            }
        }
        return class_08972;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

