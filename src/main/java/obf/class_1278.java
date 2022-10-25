package obf;

import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1278
extends class_1469 {
    protected class_1278(int n, int n2) {
        super(n, n2, class_0841.IllIIlllllllIIlIIlIIIIlIl);
        this.lllIIIllIIIIlllIlIIllIIll("untouching");
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return 15;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return super.lllIIIllIIIIlllIlIIllIIll(n) + 50;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 1;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1469 class_14692) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_14692) && class_14692.IlIIlllllIIlIlIlllllIllll != class_1278.lIlIlIIlIIIIlIIIIIlllIIII.IlIIlllllIIlIlIlllllIllll;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972);
    }
}

