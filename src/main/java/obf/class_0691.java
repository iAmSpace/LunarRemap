package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0691
extends Block {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"oak", "spruce", "birch", "jungle", "acacia", "big_oak"};
    private IIcon[] lIlIIllllIlIIIIllIIIIlIIl;

    public class_0691() {
        super(class_1855.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 < 0 || n2 >= this.lIlIIllllIlIIIIllIIIIlIIl.length) {
            n2 = 0;
        }
        return this.lIlIIllllIlIIIIllIIIIlIIl[n2];
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
        list.add(new ItemStack(class_06112, 1, 2));
        list.add(new ItemStack(class_06112, 1, 3));
        list.add(new ItemStack(class_06112, 1, 4));
        list.add(new ItemStack(class_06112, 1, 5));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.lIlIIllllIlIIIIllIIIIlIIl = new IIcon[llllllIlIllllIlIlIlIIIIlI.length];
        for (int i = 0; i < this.lIlIIllllIlIIIIllIIIIlIIl.length; ++i) {
            this.lIlIIllllIlIIIIllIIIIlIIl[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + llllllIlIllllIlIlIlIIIIlI[i]);
        }
    }
}

