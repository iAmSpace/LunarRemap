package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_1482
extends Block {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"normal", "mossy"};

    public class_1482(Block class_05492) {
        super(class_05492.IlIlIIlllIllllllllIIIlIlI);
        this.IlIllllllIIlIIllllIIlIIIl(class_05492.lIlIlIIlIIIIlIIIIIlllIIII);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_05492.IlIIIlIIIIllIIIllIIIIIIll / 3.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_05492.llIIIlllIlllIlIllIIIIllIl);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n2 == 1 ? Blocks.llIlllIlIIllIlIIIIllIIlIl.lIlllIlllIIIIlIIlllIllIII(n) : Blocks.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII(n);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 32;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        return false;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        boolean bl = this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3 - 1);
        boolean bl2 = this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3 + 1);
        boolean bl3 = this.IlIIIIIllllllIIlllIllllll(class_18432, n - 1, n2, n3);
        boolean bl4 = this.IlIIIIIllllllIIlllIllllll(class_18432, n + 1, n2, n3);
        float f = 0.25f;
        float f2 = 0.75f;
        float f3 = 0.25f;
        float f4 = 0.75f;
        float f5 = 1.0f;
        if (bl) {
            f3 = 0.0f;
        }
        if (bl2) {
            f4 = 1.0f;
        }
        if (bl3) {
            f = 0.0f;
        }
        if (bl4) {
            f2 = 1.0f;
        }
        if (bl && bl2 && !bl3 && !bl4) {
            f5 = 0.8125f;
            f = 0.3125f;
            f2 = 0.6875f;
        } else if (!bl && !bl2 && bl3 && bl4) {
            f5 = 0.8125f;
            f3 = 0.3125f;
            f4 = 0.6875f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f3, f2, f5, f4);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        this.IIIIIIIIlIllIIllIIlllIllI = 1.5;
        return super.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3);
    }

    public boolean IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        Block class_05492 = class_18432.a_(n, n2, n3);
        return class_05492 != this && class_05492 != Blocks.IIIlIIllIIlIlIIlIIllIIIIl ? (class_05492.IlIlIIlllIllllllllIIIlIlI.IllIIIllIIIIlIlIlIllIIlll() && class_05492.IllIIIllIIIIlIlIlIllIIlll() ? class_05492.IlIlIIlllIllllllllIIIlIlI != class_1855.IllIIIIllIIllIllIlllIlIIl : false) : true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        list.add(new ItemStack(class_06112, 1, 0));
        list.add(new ItemStack(class_06112, 1, 1));
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 == 0 ? super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, n4) : true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

