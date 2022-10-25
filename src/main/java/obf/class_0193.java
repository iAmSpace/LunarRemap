package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.Random;

public class class_0193
extends Block {
    private final boolean llllllIlIllllIlIlIlIIIIlI;

    public class_0193(boolean bl) {
        super(class_1855.lIlIlIIlIIIIlIIIIIlllIIII);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            if (this.llllllIlIllllIlIlIlIIIIlI && !class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, 4);
            } else if (!this.llllllIlIllllIlIlIlIIIIlI && class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIIlIllllIlllIIIIIllIIIl, 0, 2);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            if (this.llllllIlIllllIlIlIlIIIIlI && !class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, 4);
            } else if (!this.llllllIlIllllIlIlIlIIIIlI && class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lIIIlIllllIlllIIIIIllIIIl, 0, 2);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && this.llllllIlIllllIlIlIlIIIIlI && !class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IIllIIIlIIllllIIIIIIIIlll, 0, 2);
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(Blocks.IIllIIIlIIllllIIIIIIIIlll);
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Item.getItemFromBlock(Blocks.IIllIIIlIIllllIIIIIIIIlll);
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return new ItemStack(Blocks.IIllIIIlIIllllIIIIIIIIlll);
    }
}

