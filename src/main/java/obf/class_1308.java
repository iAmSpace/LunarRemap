package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;

import java.util.Random;

public class class_1308
extends class_1899 {
    public class_1308() {
        super("ice", class_1855.lIlIllIIlIIlIIlIIlIIlIIll, false);
        this.llllIIIIlIIIlIIIIIIlIllll = 0.98f;
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    public int lllllIlllIIllIlIIlIIIllII() {
        return 1;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return super.lllIIIllIIIIlllIlIIllIIll(class_18432, n, n2, n3, 1 - n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
        class_08142.IlIIIIIllllllIIlllIllllll(0.025f);
        if (this.IlIIlllllIIlIlIlllllIllll() && class_1250.lIlllIlllIIIIlIIlllIllIII(class_08142)) {
            ItemStack class_08972 = this.IIIllIIlIIIIIIlIlIIllIIlI(n4);
            if (class_08972 != null) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08972);
            }
        } else {
            if (class_13342.IlIlIIlllIIlIllIIIlllllIl.lIllllIIlIIIlIllllllIIIll) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                return;
            }
            int n5 = class_1250.IlIIIIIllllllIIlllIllllll(class_08142);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, n5);
            class_1855 class_18552 = class_13342.a_(n, n2 - 1, n3).lIllllIIlIIIlIllllllIIIll();
            if (class_18552.lIlllIlllIIIIlIIlllIllIII() || class_18552.lllIIIllIIIIlllIlIIllIIll()) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IIIllIllIIlIlIlIlIllllIIl);
            }
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(class_1346.lllIlIIlIIIlIlIIIllIlllIl, n, n2, n3) > 11 - this.lllIlIIlIIIlIlIIIllIlllIl()) {
            if (class_13342.IlIlIIlllIIlIllIIIlllllIl.lIllllIIlIIIlIllllllIIIll) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                return;
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IllIIIllIIIIlIlIlIllIIlll);
        }
    }

    @Override
    public int llIIIlllIlllIlIllIIIIllIl() {
        return 0;
    }
}

