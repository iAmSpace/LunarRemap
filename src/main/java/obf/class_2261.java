package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_2261
extends class_2209 {
    public static final String[] lIlIIllllIlIIIIllIIIIlIIl = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "big_oak"};

    public class_2261(boolean bl) {
        super(bl, class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return Blocks.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(n, n2 & 7);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(Blocks.lIIlIlllIIlllIIlllIIlIlII);
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return new ItemStack(Item.getItemFromBlock(Blocks.lIIlIlllIIlllIIlllIIlIlII), 2, n & 7);
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
        if (class_06112 != Item.getItemFromBlock(Blocks.lllIIIlllIlllIIlIllllIIlI)) {
            for (int i = 0; i < lIlIIllllIlIIIIllIIIIlIIl.length; ++i) {
                list.add(new ItemStack(class_06112, 1, i));
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

