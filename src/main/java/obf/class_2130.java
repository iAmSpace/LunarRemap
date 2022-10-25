package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_2130
extends Block {
    public class_2130() {
        super(class_1855.IlIIIIIllllllIIlllIllllll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return this == Blocks.lllllIlllIIllIlIIlIIIllII ? Items.IllIIlllllllIIlIIlIIIIlIl : (this == Blocks.diamond_ore ? Items.diamond : (this == Blocks.llIIlIllIllllIlIIIIlIIlll ? Items.dye : (this == Blocks.lIIIIlIIIIllIlIIllllIlIII ? Items.IIllllIIlIlIlIlllIIIllIIl : (this == Blocks.lIlIlIIllIlIIIIIlIIlllIlI ? Items.lIllIIlllIIIlIlIIIlllIlIl : Item.getItemFromBlock(this)))));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return this == Blocks.llIIlIllIllllIlIIIIlIIlll ? 4 + random.nextInt(5) : 1;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(int n, Random random) {
        if (n > 0 && Item.getItemFromBlock(this) != this.lllIIIllIIIIlllIlIIllIIll(0, random, n)) {
            int n2 = random.nextInt(n + 2) - 1;
            if (n2 < 0) {
                n2 = 0;
            }
            return this.lllIIIllIIIIlllIlIIllIIll(random) * (n2 + 1);
        }
        return this.lllIIIllIIIIlllIlIIllIIll(random);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, f, n5);
        if (this.lllIIIllIIIIlllIlIIllIIll(n4, class_13342.lllllIlllIIllIlIIlIIIllII, n5) != Item.getItemFromBlock(this)) {
            int n6 = 0;
            if (this == Blocks.lllllIlllIIllIlIIlIIIllII) {
                n6 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_13342.lllllIlllIIllIlIIlIIIllII, 0, 2);
            } else if (this == Blocks.diamond_ore) {
                n6 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_13342.lllllIlllIIllIlIIlIIIllII, 3, 7);
            } else if (this == Blocks.lIIIIlIIIIllIlIIllllIlIII) {
                n6 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_13342.lllllIlllIIllIlIIlIIIllII, 3, 7);
            } else if (this == Blocks.llIIlIllIllllIlIIIIlIIlll) {
                n6 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_13342.lllllIlllIIllIlIIlIIIllII, 2, 5);
            } else if (this == Blocks.lIlIlIIllIlIIIIIlIIlllIlI) {
                n6 = MathHelper.lllIIIllIIIIlllIlIIllIIll(class_13342.lllllIlllIIllIlIIlIIIllII, 2, 5);
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, n6);
        }
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return this == Blocks.llIIlIllIllllIlIIIIlIIlll ? 4 : 0;
    }
}

