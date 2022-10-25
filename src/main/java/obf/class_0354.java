package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_0354
extends class_0246 {
    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        if (this.lIllllIIlIIIlIllllllIIIll != 2 && this.lIllllIIlIIIlIllllllIIIll != 3) {
            this.lllIlIIlIIIlIlIIIllIlllIl((class_1844)class_10362, list, random, 1, 1);
        } else {
            this.IlIllllllIIlIIllllIIlIIIl((class_1844)class_10362, list, random, 1, 1);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462)) {
            return false;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 0, 0, 4, 4, 4, true, random, class_1942.IlIllllllIIlIIllllIIlIIIl());
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, random, class_20462, this.lIlllIlllIIIIlIIlllIllIII, 1, 1, 0);
        if (this.lIllllIIlIIIlIllllllIIIll != 2 && this.lIllllIIlIIIlIllllllIIIll != 3) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 0, 1, 1, 0, 3, 3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 4, 1, 1, 4, 3, 3, Blocks.lllIIIllIIIIlllIlIIllIIll, Blocks.lllIIIllIIIIlllIlIIllIIll, false);
        }
        return true;
    }
}

