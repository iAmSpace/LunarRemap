package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_2092
extends Block {
    private final String llllllIlIllllIlIlIlIIIIlI;
    private final boolean lIlIIllllIlIIIIllIIIIlIIl;
    private final String llIlllIIllIlllIlIlIlIIIll;
    private class_2102 IIIIlIIlIIIllIIIIllIIIlII;

    protected class_2092(String string, String string2, class_1855 class_18552, boolean bl) {
        super(class_18552);
        this.llllllIlIllllIlIlIlIIIIlI = string2;
        this.lIlIIllllIlIIIIllIIIIlIIl = bl;
        this.llIlllIIllIlllIlIlIlIIIll = string;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return !this.lIlIIllllIlIIIIllIIIIlIIl ? null : super.lllIIIllIIIIlllIlIIllIIll(n, random, n2);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return this.IlIlIIlllIllllllllIIIlIlI == class_1855.lIIlIIIIIlIlllIlIIlIlIlll ? 41 : 18;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return class_18432.a_(n, n2, n3) == this ? false : super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1974 class_19742, List list, class_1521 class_15212) {
        boolean bl = this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2, n3 - 1));
        boolean bl2 = this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2, n3 + 1));
        boolean bl3 = this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n - 1, n2, n3));
        boolean bl4 = this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + 1, n2, n3));
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3 && !bl4) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.4375f, 0.5f, 1.0f, 0.5625f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
            } else if (!bl3 && bl4) {
                this.lllIIIllIIIIlllIlIIllIIll(0.5f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.4375f, 1.0f, 1.0f, 0.5625f);
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl && !bl2) {
                this.lllIIIllIIIIlllIlIIllIIll(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 0.5f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
            } else if (!bl && bl2) {
                this.lllIIIllIIIIlllIlIIllIIll(0.4375f, 0.0f, 0.5f, 0.5625f, 1.0f, 1.0f);
                super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
            }
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.4375f, 0.0f, 0.0f, 0.5625f, 1.0f, 1.0f);
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_19742, list, class_15212);
        }
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        float f = 0.4375f;
        float f2 = 0.5625f;
        float f3 = 0.4375f;
        float f4 = 0.5625f;
        boolean bl = this.IlIllllllIIlIIllllIIlIIIl(class_18432.a_(n, n2, n3 - 1));
        boolean bl2 = this.IlIllllllIIlIIllllIIlIIIl(class_18432.a_(n, n2, n3 + 1));
        boolean bl3 = this.IlIllllllIIlIIllllIIlIIIl(class_18432.a_(n - 1, n2, n3));
        boolean bl4 = this.IlIllllllIIlIIllllIIlIIIl(class_18432.a_(n + 1, n2, n3));
        if ((!bl3 || !bl4) && (bl3 || bl4 || bl || bl2)) {
            if (bl3 && !bl4) {
                f = 0.0f;
            } else if (!bl3 && bl4) {
                f2 = 1.0f;
            }
        } else {
            f = 0.0f;
            f2 = 1.0f;
        }
        if ((!bl || !bl2) && (bl3 || bl4 || bl || bl2)) {
            if (bl && !bl2) {
                f3 = 0.0f;
            } else if (!bl && bl2) {
                f4 = 1.0f;
            }
        } else {
            f3 = 0.0f;
            f4 = 1.0f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f3, f2, 1.0f, f4);
    }

    public class_2102 llIlllIIllIlllIlIlIlIIIll() {
        return this.IIIIlIIlIIIllIIIIllIIIlII;
    }

    public final boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492.lllIIIllIIIIlllIlIIllIIll() || class_05492 == this || class_05492 == Blocks.lIlIllIIlIIlIIlIIlIIlIIll || class_05492 == Blocks.IIIIlIIIIIIIllIlllIIlllII || class_05492 == Blocks.IIllllllllIlllIIllllllllI || class_05492 instanceof class_2092;
    }

    @Override
    protected boolean IlIIlllllIIlIlIlllllIllll() {
        return true;
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return new ItemStack(Item.getItemFromBlock(this), 1, n);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llIlllIIllIlllIlIlIlIIIll);
        this.IIIIlIIlIIIllIIIIllIIIlII = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI);
    }
}

