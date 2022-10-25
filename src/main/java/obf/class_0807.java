package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;

import java.util.List;
import java.util.Random;

public class class_0807
extends class_0094 {
    private static final class_0425[] lllIIIllIIIIlllIlIIllIIll = new class_0425[]{new class_0425(Items.book, 0, 1, 3, 20), new class_0425(Items.IIIIIllIlIllIlIlIIlIllIIl, 0, 2, 7, 20), new class_0425(Items.lIlIIIlIlIllIlIlIIIlIlIII, 0, 1, 1, 1), new class_0425(Items.lllllllIlIIlIlIIIlIlIIlll, 0, 1, 1, 1)};
    private boolean lllIlIIlIIIlIlIIIllIlllIl;

    public class_0807() {
    }

    public class_0807(int n, Random random, class_2046 class_20462, int n2) {
        super(n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.lIlllIlllIIIIlIIlllIllIII = this.lllIIIllIIIIlllIlIIllIIll(random);
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_20462.IlIllllllIIlIIllllIIlIIIl() > 6;
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Tall", this.lllIlIIlIIIlIlIIIllIlllIl);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIlIIlIIIlIlIIIllIlllIl = class_07752.lllIIlIIIllllllIIIIlIlIlI("Tall");
    }

    public static class_0807 lllIIIllIIIIlllIlIIllIIll(List list, Random random, int n, int n2, int n3, int n4, int n5) {
        class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -4, -1, 0, 14, 11, 15, n4);
        if (!(class_0807.lllIIIllIIIIlllIlIIllIIll(class_20462) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null || class_0807.lllIIIllIIIIlllIlIIllIIll(class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, -4, -1, 0, 14, 6, 15, n4)) && class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) == null)) {
            return null;
        }
        return new class_0807(n5, random, class_20462, n4);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        int n;
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        int n2 = 11;
        if (!this.lllIlIIlIIIlIlIIIllIlllIl) {
            n2 = 6;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 13, n2 - 1, 14, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 4, 1, 0);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 0.07f, 2, 1, 1, 11, 4, 13, Blocks.IIIIlIllIlIIlIIlIllIlIlll, Blocks.IIIIlIllIlIIlIIlIllIlIlll, false);
        boolean bl = true;
        boolean bl2 = true;
        for (n = 1; n <= 13; ++n) {
            if ((n - 1) % 4 == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, n, 1, 4, n, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 1, n, 12, 4, n, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 2, 3, n, class_20462);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 11, 3, n, class_20462);
                if (!this.lllIlIIlIIIlIlIIIllIlllIl) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 6, n, 1, 9, n, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 6, n, 12, 9, n, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
                continue;
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 1, n, 1, 4, n, Blocks.bookshelf, Blocks.bookshelf, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 1, n, 12, 4, n, Blocks.bookshelf, Blocks.bookshelf, false);
            if (!this.lllIlIIlIIIlIlIIIllIlllIl) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 6, n, 1, 9, n, Blocks.bookshelf, Blocks.bookshelf, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 12, 6, n, 12, 9, n, Blocks.bookshelf, Blocks.bookshelf, false);
        }
        for (n = 3; n < 12; n += 2) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 1, n, 4, 3, n, Blocks.bookshelf, Blocks.bookshelf, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 6, 1, n, 7, 3, n, Blocks.bookshelf, Blocks.bookshelf, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 9, 1, n, 10, 3, n, Blocks.bookshelf, Blocks.bookshelf, false);
        }
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 5, 1, 3, 5, 13, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, 5, 1, 12, 5, 13, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 5, 1, 9, 5, 2, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 5, 12, 9, 5, 13, Blocks.lIllllIIlIIIlIllllllIIIll, Blocks.lIllllIIlIIIlIllllllIIIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 9, 5, 11, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 8, 5, 11, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIllllIIlIIIlIllllllIIIll, 0, 9, 5, 10, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 3, 6, 2, 3, 6, 12, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 10, 6, 2, 10, 6, 10, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 6, 2, 9, 6, 2, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 6, 12, 8, 6, 12, Blocks.lIlIIIllIIllIIlIllllllIll, Blocks.lIlIIIllIIllIIlIllllllIll, false);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 9, 6, 11, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 8, 6, 11, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 9, 6, 10, class_20462);
            n = this.lllIIIllIIIIlllIlIIllIIll(Blocks.lIlIIllIllIIIIIlIllllIIIl, 3);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 10, 1, 13, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 10, 2, 13, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 10, 3, 13, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 10, 4, 13, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 10, 5, 13, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 10, 6, 13, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIllIllIIIIIlIllllIIIl, n, 10, 7, 13, class_20462);
            int n3 = 7;
            int n4 = 7;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3 - 1, 9, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3, 9, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3 - 1, 8, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3, 8, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3 - 1, 7, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3, 7, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3 - 2, 7, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3 + 1, 7, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3 - 1, 7, n4 - 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3 - 1, 7, n4 + 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3, 7, n4 - 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, n3, 7, n4 + 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, n3 - 2, 8, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, n3 + 1, 8, n4, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, n3 - 1, 8, n4 - 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, n3 - 1, 8, n4 + 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, n3, 8, n4 - 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, n3, 8, n4 + 1, class_20462);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 3, 3, 5, class_0425.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random, 1, 5, 2)), 1 + random.nextInt(4));
        if (this.lllIlIIlIIIlIlIIIllIlllIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 12, 9, 1, class_20462);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, random, 12, 8, 1, class_0425.lllIIIllIIIIlllIlIIllIIll(lllIIIllIIIIlllIlIIllIIll, Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(random, 1, 5, 2)), 1 + random.nextInt(4));
        }
        return true;
    }
}

