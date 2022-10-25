package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0247
extends class_1067 {
    private final class_0425[] lllIIIllIIIIlllIlIIllIIll;
    private final int lllIlIIlIIIlIlIIIllIlllIl;

    public class_0247(class_0425[] arrclass_0425, int n) {
        this.lllIIIllIIIIlllIlIIllIIll = arrclass_0425;
        this.lllIlIIlIIIlIlIIIllIlllIl = n;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        Block class_05492;
        while (((class_05492 = class_13342.a_(n, n2, n3)).lIllllIIlIIIlIllllllIIIll() == class_1855.lllIIIllIIIIlllIlIIllIIll || class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) && n2 > 1) {
            --n2;
        }
        if (n2 < 1) {
            return false;
        }
        ++n2;
        for (int i = 0; i < 4; ++i) {
            int n4;
            int n5;
            int n6 = n + random.nextInt(4) - random.nextInt(4);
            if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5 = n2 + random.nextInt(3) - random.nextInt(3), n4 = n3 + random.nextInt(4) - random.nextInt(4)) || !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n6, n5 - 1, n4)) continue;
            class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4, Blocks.IllIlIlIIIlllIIllIIIIlIll, 0, 2);
            class_0071 class_00712 = (class_0071)class_13342.lllIlIIlIIIlIlIIIllIlllIl(n6, n5, n4);
            if (class_00712 != null && class_00712 != null) {
                class_0425.lllIIIllIIIIlllIlIIllIIll(random, this.lllIIIllIIIIlllIlIIllIIll, class_00712, this.lllIlIIlIIIlIlIIIllIlllIl);
            }
            if (class_13342.lIlllIlllIIIIlIIlllIllIII(n6 - 1, n5, n4) && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n6 - 1, n5 - 1, n4)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n6 - 1, n5, n4, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 2);
            }
            if (class_13342.lIlllIlllIIIIlIIlllIllIII(n6 + 1, n5, n4) && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n6 - 1, n5 - 1, n4)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n6 + 1, n5, n4, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 2);
            }
            if (class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5, n4 - 1) && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n6 - 1, n5 - 1, n4)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4 - 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 2);
            }
            if (class_13342.lIlllIlllIIIIlIIlllIllIII(n6, n5, n4 + 1) && class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n6 - 1, n5 - 1, n4)) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n6, n5, n4 + 1, Blocks.lIIIlIIIlIlllIllIIIlIIIlI, 0, 2);
            }
            return true;
        }
        return false;
    }
}

