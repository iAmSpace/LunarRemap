package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0392
extends class_0120 {
    private boolean IlIIIIIllllllIIlllIllllll;

    public class_0392(boolean bl, boolean bl2) {
        super(bl, 13, 15, 1, 1);
        this.IlIIIIIllllllIIlllIllllll = bl2;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = this.lllIIIllIIIIlllIlIIllIIll(random);
        if (!this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2, n3, n4)) {
            return false;
        }
        this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n3, n2 + n4, 0, random);
        for (int i = 0; i < n4; ++i) {
            Block class_05492 = class_13342.a_(n, n2 + i, n3);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + i, n3, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (i >= n4 - 1) continue;
            class_05492 = class_13342.a_(n + 1, n2 + i, n3);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 + i, n3, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if ((class_05492 = class_13342.a_(n + 1, n2 + i, n3 + 1)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 + i, n3 + 1, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if ((class_05492 = class_13342.a_(n, n2 + i, n3 + 1)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + i, n3 + 1, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
        }
        return true;
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4, Random random) {
        int n5 = random.nextInt(5);
        n5 = this.IlIIIIIllllllIIlllIllllll ? (n5 += this.lllIIIllIIIIlllIlIIllIIll) : (n5 += 3);
        int n6 = 0;
        for (int i = n3 - n5; i <= n3; ++i) {
            int n7 = n3 - i;
            int n8 = n4 + MathHelper.lIlllIlllIIIIlIIlllIllIII((float)n7 / (float)n5 * 3.5f);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, i, n2, n8 + (n7 > 0 && n8 == n6 && (i & 1) == 0 ? 1 : 0), random);
            n6 = n8;
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, n - 1, n2, n3 - 1);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, n + 2, n2, n3 - 1);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, n - 1, n2, n3 + 2);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, n + 2, n2, n3 + 2);
        for (int i = 0; i < 5; ++i) {
            int n4 = random.nextInt(64);
            int n5 = n4 % 8;
            int n6 = n4 / 8;
            if (n5 != 0 && n5 != 7 && n6 != 0 && n6 != 7) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, random, n - 3 + n5, n2, n3 - 3 + n6);
        }
    }

    private void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        for (int i = -2; i <= 2; ++i) {
            for (int j = -2; j <= 2; ++j) {
                if (Math.abs(i) == 2 && Math.abs(j) == 2) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + i, n2, n3 + j);
            }
        }
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3) {
        for (int i = n2 + 2; i >= n2 - 3; --i) {
            Block class_05492 = class_13342.a_(n, i, n3);
            if (class_05492 == Blocks.IlIllllllIIlIIllllIIlIIIl || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, i, n3, Blocks.lIlllIlllIIIIlIIlllIllIII, 2);
                break;
            }
            if (class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && i < n2) break;
        }
    }
}

