package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1184
extends class_1975 {
    public static final String[] llIlllIIllIlllIlIlIlIIIll = new String[]{"oak", "spruce", "birch", "jungle"};

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
        list.add(new ItemStack(class_06112, 1, 2));
        list.add(new ItemStack(class_06112, 1, 3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new IIcon[llIlllIIllIlllIlIlIlIIIll.length];
        this.lIlIIllllIlIIIIllIIIIlIIl = new IIcon[llIlllIIllIlllIlIlIlIIIll.length];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + llIlllIIllIlllIlIlIlIIIll[i]);
            this.lIlIIllllIlIIIIllIIIIlIIl[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + llIlllIIllIlllIlIlIlIIIll[i] + "_top");
        }
    }
}

