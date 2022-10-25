package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_0637
extends class_0120 {
    public class_0637(boolean bl, int n, int n2, int n3, int n4) {
        super(bl, n, n2, n3, n4);
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4;
        int n5 = this.lllIIIllIIIIlllIlIIllIIll(random);
        if (!this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, n, n2, n3, n5)) {
            return false;
        }
        this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n3, n2 + n5, 2, random);
        for (n4 = n2 + n5 - 2 - random.nextInt(4); n4 > n2 + n5 / 2; n4 -= 2 + random.nextInt(4)) {
            int n6;
            float f = random.nextFloat() * (float)Math.PI * 2.0f;
            int n7 = n + (int)(0.5f + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * 4.0f);
            int n8 = n3 + (int)(0.5f + MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * 4.0f);
            for (n6 = 0; n6 < 5; ++n6) {
                n7 = n + (int)(1.5f + MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f) * (float)n6);
                n8 = n3 + (int)(1.5f + MathHelper.lllIIIllIIIIlllIlIIllIIll(f) * (float)n6);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n7, n4 - 3 + n6 / 2, n8, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            n6 = 1 + random.nextInt(2);
            int n9 = n4;
            for (int i = n4 - n6; i <= n9; ++i) {
                int n10 = i - n9;
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n7, i, n8, 1 - n10, random);
            }
        }
        for (n4 = 0; n4 < n5; ++n4) {
            Block class_05492 = class_13342.a_(n, n2 + n4, n3);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n4, n3, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
                if (n4 > 0) {
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n - 1, n2 + n4, n3)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n - 1, n2 + n4, n3, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 8);
                    }
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + n4, n3 - 1)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n4, n3 - 1, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 1);
                    }
                }
            }
            if (n4 >= n5 - 1) continue;
            class_05492 = class_13342.a_(n + 1, n2 + n4, n3);
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 + n4, n3, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
                if (n4 > 0) {
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n + 2, n2 + n4, n3)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 2, n2 + n4, n3, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 2);
                    }
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n + 1, n2 + n4, n3 - 1)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 + n4, n3 - 1, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 1);
                    }
                }
            }
            if ((class_05492 = class_13342.a_(n + 1, n2 + n4, n3 + 1)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 + n4, n3 + 1, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
                if (n4 > 0) {
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n + 2, n2 + n4, n3 + 1)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 2, n2 + n4, n3 + 1, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 2);
                    }
                    if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n + 1, n2 + n4, n3 + 2)) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2 + n4, n3 + 2, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 4);
                    }
                }
            }
            if ((class_05492 = class_13342.a_(n, n2 + n4, n3 + 1)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05492.lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n4, n3 + 1, Blocks.log, this.lllIlIIlIIIlIlIIIllIlllIl);
            if (n4 <= 0) continue;
            if (random.nextInt(3) > 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n - 1, n2 + n4, n3 + 1)) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n - 1, n2 + n4, n3 + 1, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 8);
            }
            if (random.nextInt(3) <= 0 || !class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + n4, n3 + 2)) continue;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 + n4, n3 + 2, Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 4);
        }
        return true;
    }

    private void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4, Random random) {
        int n5 = 2;
        for (int i = n3 - n5; i <= n3; ++i) {
            int n6 = i - n3;
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, i, n2, n4 + 1 - n6, random);
        }
    }
}

