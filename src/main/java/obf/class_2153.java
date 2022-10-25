package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_2153
extends Item {
    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll(ItemStack class_08972) {
        return true;
    }

    @Override
    public boolean llIIlllIllIllllIIIlIIIIII(ItemStack class_08972) {
        return false;
    }

    @Override
    public EnumRarity lIIIIlIlIIlllllIIllIIlIII(ItemStack class_08972) {
        return this.llIIllIllIlIIlIIllIllllll(class_08972).lIlllIlllIIIIlIIlllIllIII() > 0 ? EnumRarity.uncommon : super.lIIIIlIlIIlllllIIllIIlIII(class_08972);
    }

    public class_2145 llIIllIllIlIIlIIllIllllll(ItemStack class_08972) {
        return class_08972.lIlllIlllIIIIlIIlllIllIII != null && class_08972.lIlllIlllIIIIlIIlllIllIII.lllIlIIlIIIlIlIIIllIlllIl("StoredEnchantments", 9) ? (class_2145)class_08972.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll("StoredEnchantments") : new class_2145();
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_0814 class_08142, List list, boolean bl) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08142, list, bl);
        class_2145 class_21452 = this.llIIllIllIlIIlIIllIllllll(class_08972);
        if (class_21452 != null) {
            for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
                short s = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("id");
                short s2 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i).IlIIIIIllllllIIlllIllllll("lvl");
                if (class_1469.lllIIIllIIIIlllIlIIllIIll[s] == null) continue;
                list.add(class_1469.lllIIIllIIIIlllIlIIllIIll[s].IlIllllllIIlIIllllIIlIIIl(s2));
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1129 class_11292) {
        class_2145 class_21452 = this.llIIllIllIlIIlIIllIllllll(class_08972);
        boolean bl = true;
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            if (class_07752.IlIIIIIllllllIIlllIllllll("id") != class_11292.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll) continue;
            if (class_07752.IlIIIIIllllllIIlllIllllll("lvl") < class_11292.lllIlIIlIIIlIlIIIllIlllIl) {
                class_07752.lllIIIllIIIIlllIlIIllIIll("lvl", (short)class_11292.lllIlIIlIIIlIlIIIllIlllIl);
            }
            bl = false;
            break;
        }
        if (bl) {
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("id", (short)class_11292.lllIIIllIIIIlllIlIIllIIll.IlIIlllllIIlIlIlllllIllll);
            class_07753.lllIIIllIIIIlllIlIIllIIll("lvl", (short)class_11292.lllIlIIlIIIlIlIIIllIlllIl);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        if (!class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
            class_08972.lIlllIlllIIIIlIIlllIllIII(new class_0775());
        }
        class_08972.lllllIlllIIllIlIIlIIIllII().lllIIIllIIIIlllIlIIllIIll("StoredEnchantments", class_21452);
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_1129 class_11292) {
        ItemStack class_08972 = new ItemStack(this);
        this.lllIIIllIIIIlllIlIIllIIll(class_08972, class_11292);
        return class_08972;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692, List list) {
        for (int i = class_14692.lllIlIIlIIIlIlIIIllIlllIl(); i <= class_14692.IlIllllllIIlIIllllIIlIIIl(); ++i) {
            list.add(this.lllIIIllIIIIlllIlIIllIIll(new class_1129(class_14692, i)));
        }
    }

    public class_0425 lllIIIllIIIIlllIlIIllIIll(Random random) {
        return this.lllIIIllIIIIlllIlIIllIIll(random, 1, 1, 1);
    }

    public class_0425 lllIIIllIIIIlllIlIIllIIll(Random random, int n, int n2, int n3) {
        ItemStack class_08972 = new ItemStack(Items.book, 1, 0);
        class_1250.lllIIIllIIIIlllIlIIllIIll(random, class_08972, 30);
        return new class_0425(class_08972, n, n2, n3);
    }
}

