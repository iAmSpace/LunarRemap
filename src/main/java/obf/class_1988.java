package obf;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public abstract class class_1988
extends Block {
    protected IIcon IIIIlIIlIIIllIIIIllIIIlII;

    protected class_1988(class_1855 class_18552) {
        super(class_18552);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 31;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = n5 & 3;
        int n7 = 0;
        switch (n4) {
            case 0: 
            case 1: {
                n7 = 0;
                break;
            }
            case 2: 
            case 3: {
                n7 = 8;
                break;
            }
            case 4: 
            case 5: {
                n7 = 4;
            }
        }
        return n6 | n7;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        int n3 = n2 & 0xC;
        int n4 = n2 & 3;
        return n3 == 0 && (n == 1 || n == 0) ? this.IllIIIllIIIIlIlIlIllIIlll(n4) : (n3 == 4 && (n == 5 || n == 4) ? this.IllIIIllIIIIlIlIlIllIIlll(n4) : (n3 == 8 && (n == 2 || n == 3) ? this.IllIIIllIIIIlIlIlIllIIlll(n4) : this.IllIIlllllllIIlIIlIIIIlIl(n4)));
    }

    protected abstract IIcon IllIIlllllllIIlIIlIIIIlIl(int var1);

    protected IIcon IllIIIllIIIIlIlIlIllIIlll(int n) {
        return this.IIIIlIIlIIIllIIIIllIIIlII;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n & 3;
    }

    public int lIIIIlIlIIlllllIIllIIlIII(int n) {
        return n & 3;
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return new ItemStack(Item.getItemFromBlock(this), 1, this.lIIIIlIlIIlllllIIllIIlIII(n));
    }
}

