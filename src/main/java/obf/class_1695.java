package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.Random;

public class class_1695
extends Block {
    private static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"skin_brown", "skin_red"};
    private final int lIlIIllllIlIIIIllIIIIlIIl;
    private IIcon[] llIlllIIllIlllIlIlIlIIIll;
    private IIcon IIIIlIIlIIIllIIIIllIIIlII;
    private IIcon lllIIIIIIlIlllIIlIlIIIllI;

    public class_1695(class_1855 class_18552, int n) {
        super(class_18552);
        this.lIlIIllllIlIIIIllIIIIlIIl = n;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 == 10 && n > 1 ? this.IIIIlIIlIIIllIIIIllIIIlII : (n2 >= 1 && n2 <= 9 && n == 1 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl] : (n2 >= 1 && n2 <= 3 && n == 2 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl] : (n2 >= 7 && n2 <= 9 && n == 3 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl] : ((n2 == 1 || n2 == 4 || n2 == 7) && n == 4 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl] : ((n2 == 3 || n2 == 6 || n2 == 9) && n == 5 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl] : (n2 == 14 ? this.llIlllIIllIlllIlIlIlIIIll[this.lIlIIllllIlIIIIllIIIIlIIl] : (n2 == 15 ? this.IIIIlIIlIIIllIIIIllIIIlII : this.lllIIIIIIlIlllIIlIlIIIllI)))))));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        int n = random.nextInt(10) - 7;
        if (n < 0) {
            n = 0;
        }
        return n;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(Blocks.lllIIIIIIlIlllIIlIlIIIllI) + this.lIlIIllllIlIIIIllIIIIlIIl);
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.lllIIIllIIIIlllIlIIllIIll(Block.lllIIIllIIIIlllIlIIllIIll(Blocks.lllIIIIIIlIlllIIlIlIIIllI) + this.lIlIIllllIlIIIIllIIIIlIIl);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = new IIcon[llllllIlIllllIlIlIlIIIIlI.length];
        for (int i = 0; i < this.llIlllIIllIlllIlIlIlIIIll.length; ++i) {
            this.llIlllIIllIlllIlIlIlIIIll[i] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_" + llllllIlIllllIlIlIlIIIIlI[i]);
        }
        this.lllIIIIIIlIlllIIlIlIIIllI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_inside");
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_skin_stem");
    }
}

