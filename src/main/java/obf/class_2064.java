package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_2064
extends class_1067 {
    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4;
        int n5;
        int n6;
        while (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) && n2 > 2) {
            --n2;
        }
        if (class_13342.a_(n, n2, n3) != Blocks.IIIlIllllIIIlllllIllIlIII) {
            return false;
        }
        n2 += random.nextInt(4);
        int n7 = random.nextInt(4) + 7;
        int n8 = n7 / 4 + random.nextInt(2);
        if (n8 > 1 && random.nextInt(60) == 0) {
            n2 += 10 + random.nextInt(30);
        }
        for (n6 = 0; n6 < n7; ++n6) {
            float f = (1.0f - (float)n6 / (float)n7) * (float)n8;
            n5 = MathHelper.lIllllIIlIIIlIllllllIIIll(f);
            for (n4 = -n5; n4 <= n5; ++n4) {
                float f2 = (float) MathHelper.lllIIIllIIIIlllIlIIllIIll(n4) - 0.25f;
                for (int i = -n5; i <= n5; ++i) {
                    float f3 = (float) MathHelper.lllIIIllIIIIlllIlIIllIIll(i) - 0.25f;
                    if ((n4 != 0 || i != 0) && !(f2 * f2 + f3 * f3 <= f * f) || (n4 == -n5 || n4 == n5 || i == -n5 || i == n5) && !(random.nextFloat() <= 0.75f)) continue;
                    Block class_05492 = class_13342.a_(n + n4, n2 + n6, n3 + i);
                    if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05492 == Blocks.IIIlIllllIIIlllllIllIlIII || class_05492 == Blocks.IllIIllIlIlllIllIllIlIIIl) {
                        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + n4, n2 + n6, n3 + i, Blocks.lllIlIlIIIlIllllIlllIlIlI);
                    }
                    if (n6 == 0 || n5 <= 1 || (class_05492 = class_13342.a_(n + n4, n2 - n6, n3 + i)).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_05492 != Blocks.lIlllIlllIIIIlIIlllIllIII && class_05492 != Blocks.IIIlIllllIIIlllllIllIlIII && class_05492 != Blocks.IllIIllIlIlllIllIllIlIIIl) continue;
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + n4, n2 - n6, n3 + i, Blocks.lllIlIlIIIlIllllIlllIlIlI);
                }
            }
        }
        n6 = n8 - 1;
        if (n6 < 0) {
            n6 = 0;
        } else if (n6 > 1) {
            n6 = 1;
        }
        for (int i = -n6; i <= n6; ++i) {
            for (n5 = -n6; n5 <= n6; ++n5) {
                Block class_05493;
                n4 = n2 - 1;
                int n9 = 50;
                if (Math.abs(i) == 1 && Math.abs(n5) == 1) {
                    n9 = random.nextInt(5);
                }
                while (n4 > 50 && ((class_05493 = class_13342.a_(n + i, n4, n3 + n5)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05493 == Blocks.lIlllIlllIIIIlIIlllIllIII || class_05493 == Blocks.IIIlIllllIIIlllllIllIlIII || class_05493 == Blocks.IllIIllIlIlllIllIllIlIIIl || class_05493 == Blocks.lllIlIlIIIlIllllIlllIlIlI)) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n + i, n4, n3 + n5, Blocks.lllIlIlIIIlIllllIlllIlIlI);
                    --n4;
                    if (--n9 > 0) continue;
                    n4 -= random.nextInt(5) + 1;
                    n9 = random.nextInt(5);
                }
            }
        }
        return true;
    }
}

