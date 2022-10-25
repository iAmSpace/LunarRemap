package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;

import java.util.List;
import java.util.Random;

public abstract class class_2209
extends Block {
    protected final boolean llllllIlIllllIlIlIlIIIIlI;

    public class_2209(boolean bl, class_1855 class_18552) {
        super(class_18552);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        if (bl) {
            this.IlIlllIIIIIIlIIllIIllIlll = true;
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
        this.IlIllllllIIlIIllllIIlIIIl(255);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            boolean bl;
            boolean bl2 = bl = (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) != 0;
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f, 0.0f, 1.0f, 1.0f, 1.0f);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
            }
        }
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        return this.llllllIlIllllIlIlIlIIIIlI ? n5 : (n4 != 0 && (n4 == 1 || (double)f2 <= 0.5) ? n5 : n5 | 8);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return this.llllllIlIllllIlIlIlIIIIlI ? 2 : 1;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n & 7;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return this.llllllIlIllllIlIlIlIIIIlI;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        boolean bl;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            return super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4);
        }
        if (n4 != 1 && n4 != 0 && !super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4)) {
            return false;
        }
        int n5 = n + class_0573.lllIlIIlIIIlIlIIIllIlllIl[class_0573.lllIIIllIIIIlllIlIIllIIll[n4]];
        int n6 = n2 + class_0573.IlIllllllIIlIIllllIIlIIIl[class_0573.lllIIIllIIIIlllIlIIllIIll[n4]];
        int n7 = n3 + class_0573.lIlllIlllIIIIlIIlllIllIII[class_0573.lllIIIllIIIIlllIlIIllIIll[n4]];
        boolean bl2 = bl = (class_18432.IlIllllllIIlIIllllIIlIIIl(n5, n6, n7) & 8) != 0;
        return bl ? (n4 == 0 ? true : (n4 == 1 && super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4) ? true : !class_2209.IlIllllllIIlIIllllIIlIIIl(class_18432.a_(n, n2, n3)) || (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) == 0)) : (n4 == 1 ? true : (n4 == 0 && super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4) ? true : !class_2209.IlIllllllIIlIIllllIIlIIIl(class_18432.a_(n, n2, n3)) || (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) != 0));
    }

    private static boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.IIIIlIlIIlIIIIlIlllIlIIII || class_05492 == Blocks.lIIlIlllIIlllIIlllIIlIlII;
    }

    public abstract String IllIIlllllllIIlIIlIIIIlIl(int var1);

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        return super.IllIIlllllllIIlIIlIIIIlIl(class_13342, n, n2, n3) & 7;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return class_2209.IlIllllllIIlIIllllIIlIIIl(this) ? Item.getItemFromBlock(this) : (this == Blocks.llllIlIIIIIIIIIlllIIlIIIl ? Item.getItemFromBlock(Blocks.IIIIlIlIIlIIIIlIlllIlIIII) : (this == Blocks.lllIIIlllIlllIIlIllllIIlI ? Item.getItemFromBlock(Blocks.lIIlIlllIIlllIIlllIIlIlII) : Item.getItemFromBlock(Blocks.IIIIlIlIIlIIIIlIlllIlIIII)));
    }
}

