package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0741
extends Block {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"default", "default", "podzol"};
    private class_2102 lIlIIllllIlIIIIllIIIIlIIl;
    private class_2102 llIlllIIllIlllIlIlIlIIIll;

    protected class_0741() {
        super(class_1855.IlIllllllIIlIIllllIIlIIIl);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 == 2) {
            if (n == 1) {
                return this.lIlIIllllIlIIIIllIIIIlIIl;
            }
            if (n != 0) {
                return this.llIlllIIllIlllIlIlIlIIIll;
            }
        }
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    @Override
    public class_2102 IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n5 == 2) {
            if (n4 == 1) {
                return this.lIlIIllllIlIIIIllIIIIlIIl;
            }
            if (n4 != 0) {
                class_1855 class_18552 = class_18432.a_(n, n2 + 1, n3).lIllllIIlIIIlIllllllIIIll();
                if (class_18552 == class_1855.llIllllIlIllIIIlIllIIlIlI || class_18552 == class_1855.lIlllIlllIlIIIIlllIlIlIIl) {
                    return Blocks.IlIllllllIIlIIllllIIlIIIl.IlIllllllIIlIIllllIIlIIIl(class_18432, n, n2, n3, n4);
                }
                Block class_05492 = class_18432.a_(n, n2 + 1, n3);
                if (class_05492 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05492 != Blocks.IlIllllllIIlIIllllIIlIIIl) {
                    return this.llIlllIIllIlllIlIlIlIIIll;
                }
            }
        }
        return this.llIIIIllIIIIIIIlIIIlIIIIl;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return 0;
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        if (n == 1) {
            n = 0;
        }
        return super.IIIllIIlIIIIIIlIlIIllIIlI(n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(this, 1, 0));
        list.add(new ItemStack(this, 1, 2));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_podzol_top");
        this.llIlllIIllIlllIlIlIlIIIll = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_podzol_side");
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 == 1) {
            n4 = 0;
        }
        return n4;
    }
}

