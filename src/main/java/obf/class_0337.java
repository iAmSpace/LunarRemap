package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;

import java.util.Random;

public class class_0337
extends Block {
    protected class_0337() {
        super(class_1855.llIllllIlIllIIIlIllIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
        this.IllIIlllllllIIlIIlIIIIlIl(0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll("snow");
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
        float f = 0.125f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll((double)n + this.lIlllIlllIlIIIIlllIlIlIIl, (double)n2 + this.IlIIlllllIIlIlIlllllIllll, (double)n3 + this.llIIlIlIlllIIllIlIlllIllI, (double)n + this.IllIIIIllIIllIllIlllIlIIl, (float)n2 + (float)n4 * f, (double)n3 + this.IIlIIlIlIlIllIIlIlIIIIlll);
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
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.IllIIlllllllIIlIIlIIIIlIl(0);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.IllIIlllllllIIlIIlIIIIlIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    protected void IllIIlllllllIIlIIlIIIIlIl(int n) {
        int n2 = n & 7;
        float f = (float)(2 * (1 + n2)) / 16.0f;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        Block class_05492 = class_13342.a_(n, n2 - 1, n3);
        return class_05492 != Blocks.IllIIllIlIlllIllIllIlIIIl && class_05492 != Blocks.lllIlIlIIIlIllllIlllIlIlI ? (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll ? true : (class_05492 == this && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3) & 7) == 7 ? true : class_05492.IlIlllIIIIIIlIIllIIllIlll() && class_05492.IlIlIIlllIllllllllIIIlIlI.lIlllIlllIIIIlIIlllIllIII())) : false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    private boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return false;
        }
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        int n5 = n4 & 7;
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Items.snowball, n5 + 1, 0));
        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.snowball;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3) > 11) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 == 1 ? true : super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4);
    }
}

