package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0572
extends class_1067 {
    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4;
        int n5;
        while (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3) && n2 > 2) {
            --n2;
        }
        if (class_13342.a_(n, n2, n3) != Blocks.llIIllIllIlIIlIIllIllllll) {
            return false;
        }
        for (n5 = -2; n5 <= 2; ++n5) {
            for (n4 = -2; n4 <= 2; ++n4) {
                if (!class_13342.lIlllIlllIIIIlIIlllIllIII(n + n5, n2 - 1, n3 + n4) || !class_13342.lIlllIlllIIIIlIIlllIllIII(n + n5, n2 - 2, n3 + n4)) continue;
                return false;
            }
        }
        for (n5 = -1; n5 <= 0; ++n5) {
            for (n4 = -2; n4 <= 2; ++n4) {
                for (int i = -2; i <= 2; ++i) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + n4, n2 + n5, n3 + i, Blocks.IlIIlllllIIlIlIlllllIllll, 0, 2);
                }
            }
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.IIIllIllIIlIlIlIlIllllIIl, 0, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n - 1, n2, n3, Blocks.IIIllIllIIlIlIlIlIllllIIl, 0, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n + 1, n2, n3, Blocks.IIIllIllIIlIlIlIlIllllIIl, 0, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 - 1, Blocks.IIIllIllIIlIlIlIlIllllIIl, 0, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3 + 1, Blocks.IIIllIllIIlIlIlIlIllllIIl, 0, 2);
        for (n5 = -2; n5 <= 2; ++n5) {
            for (n4 = -2; n4 <= 2; ++n4) {
                if (n5 != -2 && n5 != 2 && n4 != -2 && n4 != 2) continue;
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + 1, n3 + n4, Blocks.IlIIlllllIIlIlIlllllIllll, 0, 2);
            }
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n + 2, n2 + 1, n3, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 1, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n - 2, n2 + 1, n3, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 1, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 + 2, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 1, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3 - 2, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 1, 2);
        for (n5 = -1; n5 <= 1; ++n5) {
            for (n4 = -1; n4 <= 1; ++n4) {
                if (n5 == 0 && n4 == 0) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + 4, n3 + n4, Blocks.IlIIlllllIIlIlIlllllIllll, 0, 2);
                    continue;
                }
                class_13342.lllIIIllIIIIlllIlIIllIIll(n + n5, n2 + 4, n3 + n4, Blocks.IIIIlIlIIlIIIIlIlllIlIIII, 1, 2);
            }
        }
        for (n5 = 1; n5 <= 3; ++n5) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + n5, n3 - 1, Blocks.IlIIlllllIIlIlIlllllIllll, 0, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n - 1, n2 + n5, n3 + 1, Blocks.IlIIlllllIIlIlIlllllIllll, 0, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + n5, n3 - 1, Blocks.IlIIlllllIIlIlIlllllIllll, 0, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll(n + 1, n2 + n5, n3 + 1, Blocks.IlIIlllllIIlIlIlllllIllll, 0, 2);
        }
        return true;
    }
}

