package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_1733
extends class_1469 {
    protected class_1733(int n, int n2) {
        super(n, n2, class_0841.IllIIIllIIIIlIlIlIllIIlll);
        this.lllIIIllIIIIlllIlIIllIIll("durability");
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n) {
        return 5 + (n - 1) * 8;
    }

    @Override
    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return super.lllIIIllIIIIlllIlIIllIIll(n) + 50;
    }

    @Override
    public int IlIllllllIIlIIllllIIlIIIl() {
        return 3;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        return class_08972.lIllllIIlIIIlIllllllIIIll() ? true : super.lllIIIllIIIIlllIlIIllIIll(class_08972);
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, int n, Random random) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor && random.nextFloat() < 0.6f ? false : random.nextInt(n + 1) > 0;
    }
}

