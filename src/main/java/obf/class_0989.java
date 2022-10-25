package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_0989
extends class_2209 {
    public static final String[] lIlIIllllIlIIIIllIIIIlIIl = new String[]{"stone", "sand", "wood", "cobble", "brick", "smoothStoneBrick", "netherBrick", "quartz"};
    private class_2102 llIlllIIllIlllIlIlIlIIIll;

    public class_0989(boolean bl) {
        super(bl, class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = n2 & 7;
        if (this.llllllIlIllllIlIlIlIIIIlI && (n2 & 8) != 0) {
            n = 1;
        }
        return n3 == 0 ? (n != 1 && n != 0 ? this.llIlllIIllIlllIlIlIlIIIll : this.llIIIIllIIIIIIIlIIIlIIIIl) : (n3 == 1 ? Blocks.IlIIlllllIIlIlIlllllIllll.lIlllIlllIIIIlIIlllIllIII(n) : (n3 == 2 ? Blocks.lIllllIIlIIIlIllllllIIIll.lIlllIlllIIIIlIIlllIllIII(n) : (n3 == 3 ? Blocks.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(n) : (n3 == 4 ? Blocks.lllIIIIlIlIIlIIlllIIIIIIl.lIlllIlllIIIIlIIlllIllIII(n) : (n3 == 5 ? Blocks.lllllIllllIIIIllIIlIlIlII.lllIIIllIIIIlllIlIIllIIll(n, 0) : (n3 == 6 ? Blocks.llIllIllIllIlIlIllIlIIIIl.lIlllIlllIIIIlIIlllIllIII(1) : (n3 == 7 ? Blocks.IIlIlIIIlIIllIlIlIlIlIIll.lIlllIlllIIIIlIIlllIllIII(n) : this.llIIIIllIIIIIIIlIIIlIIIIl)))))));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("stone_slab_top");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll("stone_slab_side");
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(Blocks.IIIIlIlIIlIIIIlIlllIlIIII);
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return new ItemStack(Item.getItemFromBlock(Blocks.IIIIlIlIIlIIIIlIlllIlIIII), 2, n & 7);
    }

    @Override
    public String IllIIlllllllIIlIIlIIIIlIl(int n) {
        if (n < 0 || n >= lIlIIllllIlIIIIllIIIIlIIl.length) {
            n = 0;
        }
        return super.IllIIIIllIIllIllIlllIlIIl() + "." + lIlIIllllIlIIIIllIIIIlIIl[n];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        if (class_06112 != Item.getItemFromBlock(Blocks.llllIlIIIIIIIIIlllIIlIIIl)) {
            for (int i = 0; i <= 7; ++i) {
                if (i == 2) continue;
                list.add(new ItemStack(class_06112, 1, i));
            }
        }
    }
}

