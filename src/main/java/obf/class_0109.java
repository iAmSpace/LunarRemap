package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_0109
extends class_1067 {
    private Block lllIIIllIIIIlllIlIIllIIll;

    public class_0109(Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll = class_05492;
    }

    @Override
    public boolean a_(class_1334 class_13342, Random random, int n, int n2, int n3) {
        if (class_13342.a_(n, n2 + 1, n3) != Blocks.lllIlIIlIIIlIlIIIllIlllIl) {
            return false;
        }
        if (class_13342.a_(n, n2 - 1, n3) != Blocks.lllIlIIlIIIlIlIIIllIlllIl) {
            return false;
        }
        if (class_13342.a_(n, n2, n3).lIllllIIlIIIlIllllllIIIll() != class_1855.lllIIIllIIIIlllIlIIllIIll && class_13342.a_(n, n2, n3) != Blocks.lllIlIIlIIIlIlIIIllIlllIl) {
            return false;
        }
        int n4 = 0;
        if (class_13342.a_(n - 1, n2, n3) == Blocks.lllIlIIlIIIlIlIIIllIlllIl) {
            ++n4;
        }
        if (class_13342.a_(n + 1, n2, n3) == Blocks.lllIlIIlIIIlIlIIIllIlllIl) {
            ++n4;
        }
        if (class_13342.a_(n, n2, n3 - 1) == Blocks.lllIlIIlIIIlIlIIIllIlllIl) {
            ++n4;
        }
        if (class_13342.a_(n, n2, n3 + 1) == Blocks.lllIlIIlIIIlIlIIIllIlllIl) {
            ++n4;
        }
        int n5 = 0;
        if (class_13342.lIlllIlllIIIIlIIlllIllIII(n - 1, n2, n3)) {
            ++n5;
        }
        if (class_13342.lIlllIlllIIIIlIIlllIllIII(n + 1, n2, n3)) {
            ++n5;
        }
        if (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 - 1)) {
            ++n5;
        }
        if (class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2, n3 + 1)) {
            ++n5;
        }
        if (n4 == 3 && n5 == 1) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.lllIIIllIIIIlllIlIIllIIll, 0, 2);
            class_13342.lllIlIIlIIIlIlIIIllIlllIl = true;
            this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, random);
            class_13342.lllIlIIlIIIlIlIIIllIlllIl = false;
        }
        return true;
    }
}

