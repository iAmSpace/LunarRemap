package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0737
extends class_1975 {
    public static final String[] llIlllIIllIlllIlIlIlIIIll = new String[]{"acacia", "big_oak"};

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new class_2102[llIlllIIllIlllIlIlIlIIIll.length];
        this.lIlIIllllIlIIIIllIIIIlIIl = new class_2102[llIlllIIllIlllIlIlIlIIIll.length];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + llIlllIIllIlllIlIlIlIIIll[i]);
            this.lIlIIllllIlIIIIllIIIIlIIl[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + llIlllIIllIlllIlIlIlIIIll[i] + "_top");
        }
    }
}

