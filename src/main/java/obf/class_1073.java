package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1073
extends Block {
    protected class_1073() {
        super(class_1855.IlIlIIlllIIlIllIIIlllllIl);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.0625f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
        this.IllIIlllllllIIlIIlIIIIlIl(0);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return Blocks.llllllIlIllllIlIlIlIIIIlI.lllIIIllIIIIlllIlIIllIIll(n, n2);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        boolean bl = false;
        float f = 0.0625f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll((double)n + this.lIlllIlllIlIIIIlllIlIlIIl, (double)n2 + this.IlIIlllllIIlIlIlllllIllll, (double)n3 + this.llIIlIlIlllIIllIlIlllIllI, (double)n + this.IllIIIIllIIllIllIlllIlIIl, (float)n2 + (float)bl * f, (double)n3 + this.IIlIIlIlIlIllIIlIlIIIIlll);
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
        int n2 = 0;
        float f = (float)(1 * (1 + n2)) / 16.0f;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) && this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
    }

    private boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return false;
        }
        return true;
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        return !class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 - 1, n3);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 == 1 ? true : super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < 16; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

