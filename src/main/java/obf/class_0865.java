package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0865
extends Block {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"default", "chiseled", "lines"};
    private static final String[] lIlIIllllIlIIIIllIIIIlIIl = new String[]{"side", "chiseled", "lines", null, null};
    private IIcon[] llIlllIIllIlllIlIlIlIIIll;
    private IIcon IIIIlIIlIIIllIIIIllIIIlII;
    private IIcon lllIIIIIIlIlllIIlIlIIIllI;
    private IIcon llIIlIIllIIllIlIIllIIllII;
    private IIcon lIlIlIIIIIIlIIllllIlIIllI;

    public class_0865() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n2 != 2 && n2 != 3 && n2 != 4) {
            if (n != 1 && (n != 0 || n2 != 1)) {
                if (n == 0) {
                    return this.lIlIlIIIIIIlIIllllIlIIllI;
                }
                if (n2 < 0 || n2 >= this.llIlllIIllIlllIlIlIlIIIll.length) {
                    n2 = 0;
                }
                return this.llIlllIIllIlllIlIlIlIIIll[n2];
            }
            return n2 == 1 ? this.IIIIlIIlIIIllIIIIllIIIlII : this.llIIlIIllIIllIlIIllIIllII;
        }
        return n2 == 2 && (n == 1 || n == 0) ? this.lllIIIIIIlIlllIIlIlIIIllI : (n2 == 3 && (n == 5 || n == 4) ? this.lllIIIIIIlIlllIIlIlIIIllI : (n2 == 4 && (n == 2 || n == 3) ? this.lllIIIIIIlIlllIIlIlIIIllI : this.llIlllIIllIlllIlIlIlIIIll[n2]));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        if (n5 == 2) {
            switch (n4) {
                case 0: 
                case 1: {
                    n5 = 2;
                    break;
                }
                case 2: 
                case 3: {
                    n5 = 4;
                    break;
                }
                case 4: 
                case 5: {
                    n5 = 3;
                }
            }
        }
        return n5;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n != 3 && n != 4 ? n : 2;
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return n != 3 && n != 4 ? super.IIIllIIlIIIIIIlIlIIllIIlI(n) : new ItemStack(Item.getItemFromBlock(this), 1, 2);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 39;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
        list.add(new ItemStack(class_06112, 1, 2));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = new IIcon[lIlIIllllIlIIIIllIIIIlIIl.length];
        for (int i = 0; i < this.llIlllIIllIlllIlIlIlIIIll.length; ++i) {
            this.llIlllIIllIlllIlIlIlIIIll[i] = lIlIIllllIlIIIIllIIIIlIIl[i] == null ? this.llIlllIIllIlllIlIlIlIIIll[i - 1] : class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + lIlIIllllIlIIIIllIIIIlIIl[i]);
        }
        this.llIIlIIllIIllIlIIllIIllII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_chiseled_top");
        this.lllIIIIIIlIlllIIlIlIIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_lines_top");
        this.lIlIlIIIIIIlIIllllIlIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_bottom");
    }

    @Override
    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return class_1662.IlIlIIlIlIllIIlIlIIllIIIl;
    }
}

