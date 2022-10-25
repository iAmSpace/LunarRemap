package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1742
extends class_1469 {
    protected class_1742(int n, int n2) {
        super(n, n2, class_0841.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIIIllIIIIlllIlIIllIIll("digging");
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return 1 + 10 * (n - 1);
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return super.lllIIIllIIIIlllIlIIllIIll(n) + 50;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 5;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972);
    }
}

