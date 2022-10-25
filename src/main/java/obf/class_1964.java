package obf;

import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1964
extends Item {
    public static final String[] IIIllIllIIlIlIlIlIllllIIl = new String[]{"pulling_0", "pulling_1", "pulling_2"};
    private class_2102[] IllIIIllIIIIlIlIlIllIIlll;

    public class_1964() {
        this.lIlllIlllIIIIlIIlllIllIII = 1;
        this.IlIIIIIllllllIIlllIllllll(384);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IllIIIllIIIIlIlIlIllIIlll);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142, int n) {
        boolean bl;
        boolean bl2 = bl = class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII || class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.llIIlIllIllllIlIIIIlIIlll.IlIIlllllIIlIlIlllllIllll, class_08972) > 0;
        if (bl || class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(Items.arrow)) {
            int n2;
            int n3;
            int n4 = this.lIllllIIlIIIlIllllllIIIll(class_08972) - n;
            float f = (float)n4 / 20.0f;
            if ((double)(f = (f * f + f * 2.0f) / 3.0f) < 0.1) {
                return;
            }
            if (f > 1.0f) {
                f = 1.0f;
            }
            class_0369 class_03692 = new class_0369(class_13342, class_08142, f * 2.0f);
            if (f == 1.0f) {
                class_03692.lllIIIllIIIIlllIlIIllIIll(true);
            }
            if ((n3 = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IlIIIlIIIIllIIIllIIIIIIll.IlIIlllllIIlIlIlllllIllll, class_08972)) > 0) {
                class_03692.lllIlIIlIIIlIlIIIllIlllIl(class_03692.IlIllllllIIlIIllllIIlIIIl() + (double)n3 * 0.5 + 0.5);
            }
            if ((n2 = class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.IIlllIlIlllIllIIIlllIIlIl.IlIIlllllIIlIlIlllllIllll, class_08972)) > 0) {
                class_03692.lllIIIllIIIIlllIlIIllIIll(n2);
            }
            if (class_1250.lllIIIllIIIIlllIlIIllIIll(class_1469.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll, class_08972) > 0) {
                class_03692.IlIIIIIllllllIIlllIllllll(100);
            }
            class_08972.lllIIIllIIIIlllIlIIllIIll(1, (class_1965)class_08142);
            class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.bow", 1.0f, 1.0f / (IlIllllllIIlIIllllIIlIIIl.nextFloat() * 0.4f + 1.2f) + f * 0.5f);
            if (bl) {
                class_03692.lllIIIllIIIIlllIlIIllIIll = 2;
            } else {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(Items.arrow);
            }
            if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(class_03692);
            }
        }
    }

    @Override
    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        return class_08972;
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(ItemStack class_08972) {
        return 72000;
    }

    @Override
    public class_1484 IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        return class_1484.IlIIIIIllllllIIlllIllllll;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, class_1334 class_13342, class_0814 class_08142) {
        if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII || class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(Items.arrow)) {
            class_08142.IlIllllllIIlIIllllIIlIIIl(class_08972, this.lIllllIIlIIIlIllllllIIIll(class_08972));
        }
        return class_08972;
    }

    @Override
    public int IlIlllIIIIIIlIIllIIllIlll() {
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_standby");
        this.IllIIIllIIIIlIlIlIllIIlll = new class_2102[IIIllIllIIlIlIlIlIllllIIl.length];
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            this.IllIIIllIIIIlIlIlIllIIlll[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.lIlIlIIlIIIIlIIIIIlllIIII() + "_" + IIIllIllIIlIlIlIlIllllIIl[i]);
        }
    }

    public class_2102 lIllllIIlIIIlIllllllIIIll(int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll[n];
    }
}

