package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0133
extends class_2259 {
    public static final String[][] lllIIIIIIlIlllIIlIlIIIllI = new String[][]{{"leaves_oak", "leaves_spruce", "leaves_birch", "leaves_jungle"}, {"leaves_oak_opaque", "leaves_spruce_opaque", "leaves_birch_opaque", "leaves_jungle_opaque"}};
    public static final String[] llIIlIIllIIllIlIIllIIllII = new String[]{"oak", "spruce", "birch", "jungle"};

    @Override
    public int lIllllIIlIIIlIllllllIIIll(int n) {
        return (n & 3) == 1 ? class_0828.lllIIIllIIIIlllIlIIllIIll() : ((n & 3) == 2 ? class_0828.lllIlIIlIIIlIlIIIllIlllIl() : super.lIllllIIlIIIlIllllllIIIll(n));
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return (n4 & 3) == 1 ? class_0828.lllIIIllIIIIlllIlIIllIIll() : ((n4 & 3) == 2 ? class_0828.lllIlIIlIIIlIlIIIllIlllIl() : super.lIlllIlllIIIIlIIlllIllIII(class_18432, n, n2, n3));
    }

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        if ((n4 & 3) == 0 && class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(n5) == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Items.IlIIIIIllllllIIlllIllllll, 1, 0));
        }
    }

    @Override
    protected int IllIIlllllllIIlIIlIIIIlIl(int n) {
        int n2 = super.IllIIlllllllIIlIIlIIIIlIl(n);
        if ((n & 3) == 3) {
            n2 = 40;
        }
        return n2;
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return (n2 & 3) == 1 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl][1] : ((n2 & 3) == 3 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl][3] : ((n2 & 3) == 2 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl][2] : this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl][0]));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
        list.add(new ItemStack(class_06112, 1, 2));
        list.add(new ItemStack(class_06112, 1, 3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        for (int i = 0; i < lllIIIIIIlIlllIIlIlIIIllI.length; ++i) {
            this.llIlllIIllIlllIlIlIlIIIll[i] = new class_2102[lllIIIIIIlIlllIIlIlIIIllI[i].length];
            for (int j = 0; j < lllIIIIIIlIlllIIlIlIIIllI[i].length; ++j) {
                this.llIlllIIllIlllIlIlIlIIIll[i][j] = class_08872.lllIIIllIIIIlllIlIIllIIll(lllIIIIIIlIlllIIlIlIIIllI[i][j]);
            }
        }
    }

    @Override
    public String[] llIlllIIllIlllIlIlIlIIIll() {
        return llIIlIIllIIllIlIIllIIllII;
    }
}

