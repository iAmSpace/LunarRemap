package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0088
extends class_2259 {
    public static final String[][] lllIIIIIIlIlllIIlIlIIIllI = new String[][]{{"leaves_acacia", "leaves_big_oak"}, {"leaves_acacia_opaque", "leaves_big_oak_opaque"}};
    public static final String[] llIIlIIllIIllIlIIllIIllII = new String[]{"acacia", "big_oak"};

    @Override
    protected void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        if ((n4 & 3) == 1 && class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(n5) == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Items.IlIIIIIllllllIIlllIllllll, 1, 0));
        }
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return super.IlIIIIIllllllIIlllIllllll(n) + 4;
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 3;
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return (n2 & 3) == 1 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl][1] : this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl][0];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
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

