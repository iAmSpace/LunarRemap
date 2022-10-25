package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_2258
extends class_1899 {
    private static final class_2102[] llllllIlIllllIlIlIlIIIIlI = new class_2102[16];

    public class_2258(class_1855 class_18552) {
        super("glass", class_18552, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return llllllIlIllllIlIlIlIIIIlI[n2 % llllllIlIllllIlIlIlIIIIlI.length];
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return ~n & 0xF;
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
        for (int i = 0; i < llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            class_2258.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + class_1908.IllIIIllIIIIlIlIlIllIIlll[class_2258.IllIIlllllllIIlIIlIIIIlIl(i)]);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    protected boolean IlIIlllllIIlIlIlllllIllll() {
        return true;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }
}

