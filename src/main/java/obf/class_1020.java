package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1020
extends Block {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"default", "mossy", "cracked", "chiseled"};
    public static final String[] lIlIIllllIlIIIIllIIIIlIIl = new String[]{null, "mossy", "cracked", "carved"};
    private class_2102[] llIlllIIllIlllIlIlIlIIIll;

    public class_1020() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 < 0 || n2 >= lIlIIllllIlIIIIllIIIIlIIl.length) {
            n2 = 0;
        }
        return this.llIlllIIllIlllIlIlIlIIIll[n2];
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < 4; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = new class_2102[lIlIIllllIlIIIIllIIIIlIIl.length];
        for (int i = 0; i < this.llIlllIIllIlllIlIlIlIIIll.length; ++i) {
            String string = this.llllllIlIllllIlIlIlIIIIlI();
            if (lIlIIllllIlIIIIllIIIIlIIl[i] != null) {
                string = string + "_" + lIlIIllllIlIIIIllIIIIlIIl[i];
            }
            this.llIlllIIllIlllIlIlIlIIIll[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(string);
        }
    }
}

