package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_2125
extends Block {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"default", "chiseled", "smooth"};
    private static final String[] lIlIIllllIlIIIIllIIIIlIIl = new String[]{"normal", "carved", "smooth"};
    private class_2102[] llIlllIIllIlllIlIlIlIIIll;
    private class_2102 IIIIlIIlIIIllIIIIllIIIlII;
    private class_2102 lllIIIIIIlIlllIIlIlIIIllI;

    public class_2125() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n != 1 && (n != 0 || n2 != 1 && n2 != 2)) {
            if (n == 0) {
                return this.lllIIIIIIlIlllIIlIlIIIllI;
            }
            if (n2 < 0 || n2 >= this.llIlllIIllIlllIlIlIlIIIll.length) {
                n2 = 0;
            }
            return this.llIlllIIllIlllIlIlIlIIIll[n2];
        }
        return this.IIIIlIIlIIIllIIIIllIIIlII;
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
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = new class_2102[lIlIIllllIlIIIIllIIIIlIIl.length];
        for (int i = 0; i < this.llIlllIIllIlllIlIlIlIIIll.length; ++i) {
            this.llIlllIIllIlllIlIlIlIIIll[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + lIlIIllllIlIIIIllIIIIlIIl[i]);
        }
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lllIIIIIIlIlllIIlIlIIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_bottom");
    }
}

