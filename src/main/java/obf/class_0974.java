package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0974
extends Block {
    private class_2102[] llllllIlIllllIlIlIlIIIIlI;

    public class_0974(class_1855 class_18552) {
        super(class_18552);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.llllllIlIllllIlIlIlIIIIlI[n2 % this.llllllIlIllllIlIlIlIIIIlI.length];
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    public static int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return class_0974.IIIllIllIIlIlIlIlIllllIIl(n);
    }

    public static int IIIllIllIIlIlIlIlIllllIIl(int n) {
        return ~n & 0xF;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new class_2102[16];
        for (int i = 0; i < this.llllllIlIllllIlIlIlIIIIlI.length; ++i) {
            this.llllllIlIllllIlIlIlIIIIlI[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + class_1908.IllIIIllIIIIlIlIlIllIIlll[class_0974.IIIllIllIIlIlIlIlIllllIIl(i)]);
        }
    }

    @Override
    public class_1662 lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return class_1662.lllIIIllIIIIlllIlIIllIIll(n);
    }
}

