package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0937
extends class_2092 {
    private static final IIcon[] llllllIlIllllIlIlIlIIIIlI = new IIcon[16];
    private static final IIcon[] lIlIIllllIlIIIIllIIIIlIIl = new IIcon[16];

    public class_0937() {
        super("glass", "glass_pane_top", class_1855.lIIlIIIIIlIlllIlIIlIlIlll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public IIcon lllIlIIlIIIlIlIIIllIlllIl(int n, int n2) {
        return llllllIlIllllIlIlIlIIIIlI[n2 % llllllIlIllllIlIlIlIIIIlI.length];
    }

    public IIcon IllIIlllllllIIlIIlIIIIlIl(int n) {
        return lIlIIllllIlIIIIllIIIIlIIl[~n & 0xF];
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(n, ~n2 & 0xF);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    public static int IIIllIllIIlIlIlIlIllllIIl(int n) {
        return n & 0xF;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public int lllllIlllIIllIlIIlIIIllII() {
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        super.lllIIIllIIIIlllIlIIllIIll(class_08872);
        for (int i = 0; i < llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            class_0937.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + class_1908.IllIIIllIIIIlIlIlIllIIlll[class_0937.IIIllIllIIlIlIlIlIllllIIl(i)]);
            class_0937.lIlIIllllIlIIIIllIIIIlIIl[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_pane_top_" + class_1908.IllIIIllIIIIlIlIlIllIIlll[class_0937.IIIllIllIIlIlIlIlIllllIIl(i)]);
        }
    }
}

