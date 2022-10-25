package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.List;
import java.util.Random;

public class class_0258
extends class_1437 {
    private static final class_0425[] lllIIIllIIIIlllIlIIllIIll = new class_0425[]{new class_0425(Items.diamond, 0, 1, 3, 3), new class_0425(Items.iron_ingot, 0, 1, 5, 10), new class_0425(Items.lIIIIlIlIIlllllIIllIIlIII, 0, 1, 3, 5), new class_0425(Items.bread, 0, 1, 3, 15), new class_0425(Items.IlIIIIIllllllIIlllIllllll, 0, 1, 3, 15), new class_0425(Items.lllIlIIlIIIlIlIIIllIlllIl, 0, 1, 1, 5), new class_0425(Items.llIIlllIllIllllIIIlIIIIII, 0, 1, 1, 5), new class_0425(Items.lIIIllIIIIIllllIlIlIllIll, 0, 1, 1, 5), new class_0425(Items.llIlllIlIIllIlIIIIllIIlIl, 0, 1, 1, 5), new class_0425(Items.lIIIlIIIlIlllIllIIIlIIIlI, 0, 1, 1, 5), new class_0425(Items.lIIlIlllIllIlIlllIIIIIIII, 0, 1, 1, 5), new class_0425(Item.getItemFromBlock(Blocks.obsidian), 0, 3, 7, 5), new class_0425(Item.getItemFromBlock(Blocks.IIIllIIlIIIIIIlIlIIllIIlI), 0, 3, 7, 5), new class_0425(Items.saddle, 0, 1, 1, 3), new class_0425(Items.IlIllIIIIllllIIllIllIIIIl, 0, 1, 1, 1), new class_0425(Items.lIlIlIIllIlIIIIIlIIlllIlI, 0, 1, 1, 1), new class_0425(Items.llllIllllllIllIIIlIlIIllI, 0, 1, 1, 1)};
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_0258() {
    }

    public class_0258(class_0206 class_02062, int n, Random random, class_2046 class_20462, int n2) {
        super(class_02062, n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
    }

    public static class_0258 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 0, 0, 10, 6, 7, n4);
        return class_0258.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null ? new class_0258(class_02062, n5, random, class_20462, n4) : null;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Chest", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Chest");
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        int n2;
        if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_20462);
            if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
                return true;
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(0, this.lIIIIlIlIIlllllIIllIIlIII - this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll + 6 - 1, 0);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 0, 9, 4, 6, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 9, 0, 6, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 4, 0, 9, 4, 6, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 5, 0, 9, 5, 6, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 5, 1, 8, 5, 5, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 0, 2, 3, 0, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 0, 0, 4, 0, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 0, 3, 4, 0, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 6, 0, 4, 6, Blocks.log, Blocks.log, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 3, 3, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, 2, 3, 3, 2, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 3, 5, 3, 3, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 1, 0, 3, 5, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, 6, 5, 3, 6, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 5, 1, 0, 5, 3, 0, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 1, 0, 9, 3, 0, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, 1, 4, 9, 4, 6, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIIlIlIIlllllIIllIIlIII, 0, 7, 1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIIlIlIIlllllIIllIIlIII, 0, 8, 1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, 9, 2, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IIIIIlllIIllllIlllIlllIIl, 0, 9, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 2, 4, 8, 2, 5, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, 6, 1, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.furnace, 0, 6, 2, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.furnace, 0, 6, 3, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIlIIIIIIIIIlllIIlIIIl, 0, 8, 1, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 0, 2, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 0, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 2, 2, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llllIIllllIllIlllllIIlIlI, 0, 4, 2, 6, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 2, 1, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIlIlIIllIIIlIIlIlIIIlII, 0, 2, 2, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 1, 1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IllllIIlIIIllIlllIlllIllI, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IllllIIlIIIllIlllIlllIllI, 3), 2, 1, 5, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.IllllIIlIIIllIlllIlllIllI, this.lllIIIllIIIIlllIlIIllIIll(Blocks.IllllIIlIIIllIlllIlllIllI, 1), 1, 1, 4, class_20462);
        if (!this.lllIlIIlIIIlIlIIIllIlllIl) {
            int n3;
            n2 = this.lllIIIllIIIIlllIlIIllIIll(1);
            n = this.lllIIIllIIIIlllIlIIllIIll(5, 5);
            if (class_20462.lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3 = this.lllIlIIlIIIlIlIIIllIlllIl(5, 5))) {
                this.lllIlIIlIIIlIlIIIllIlllIl = true;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 5, 1, 5, lllIIIllIIIIlllIlIIllIIll, 3 + random.nextInt(6));
            }
        }
        for (n2 = 6; n2 <= 8; ++n2) {
            if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, n2, 0, -1, class_20462).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll || this.lllIIIllIIIIlllIlIIllIIll(class_13342, n2, -1, -1, class_20462).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.llIIIlIlIlIIlIllIIIllIlIl, this.lllIIIllIIIIlllIlIIllIIll(Blocks.llIIIlIlIlIIlIllIIIllIlIl, 3), n2, 0, -1, class_20462);
        }
        for (n2 = 0; n2 < 7; ++n2) {
            for (n = 0; n < 10; ++n) {
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, 6, n2, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, Blocks.IlIIIIIllllllIIlllIllllll, 0, n, -1, n2, class_20462);
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 7, 1, 1, 1);
        return true;
    }

    @Override
    protected int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return 3;
    }
}

