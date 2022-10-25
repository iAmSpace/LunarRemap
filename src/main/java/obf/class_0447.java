package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0447
extends class_0351 {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"default", "red"};
    private static class_2102 lIlIIllllIlIIIIllIIIIlIIl;
    private static class_2102 IIIIlIIlIIIllIIIIllIIIlII;

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 == 1 ? IIIIlIIlIIIllIIIIllIIIlII : lIlIIllllIlIIIIllIIIIlIIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("sand");
        IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll("red_sand");
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
    }

    @Override
    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return n == 1 ? class_1662.llIIlllIllIllllIIIlIIIIII : class_1662.lIlllIlllIIIIlIIlllIllIII;
    }
}

