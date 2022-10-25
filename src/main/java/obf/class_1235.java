package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;

import java.util.List;
import java.util.Random;

public class class_1235
extends class_1437 {
    public class_1235() {
    }

    public class_1235(class_0206 class_02062, int n, Random random, int n2, int n3) {
        super(class_02062, n);
        this.lIllllIIlIIIlIllllllIIIll = random.nextInt(4);
        switch (this.lIllllIIlIIIlIllllllIIIll) {
            case 0: 
            case 2: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
                break;
            }
            default: {
                this.IlIIIIIllllllIIlllIllllll = new class_2046(n2, 64, n3, n2 + 6 - 1, 78, n3 + 6 - 1);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll - 4, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 1, this.IlIllllllIIlIIllllIIlIIIl());
        class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll - 4, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl + 1, 3, this.IlIllllllIIlIIllllIIlIIIl());
        class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll - 4, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl());
        class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll + 1, this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll - 4, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl());
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
            this.lIIIIlIlIIlllllIIllIIlIII = this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, class_20462);
            if (this.lIIIIlIlIIlllllIIllIIlIII < 0) {
                return true;
            }
            this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll(0, this.lIIIIlIlIIlllllIIllIIlIII - this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll + 3, 0);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 0, 1, 4, 12, 4, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IIIllIllIIlIlIlIlIllllIIl, false);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2, 12, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 3, 12, 2, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2, 12, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 3, 12, 3, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 1, 13, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 1, 14, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 13, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 14, 1, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 1, 13, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 1, 14, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 13, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lIlIIIllIIllIIlIllllllIll, 0, 4, 14, 4, class_20462);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, class_20462, 1, 15, 1, 4, 15, 4, Blocks.IlIIIIIllllllIIlllIllllll, Blocks.IlIIIIIllllllIIlllIllllll, false);
        for (int i = 0; i <= 5; ++i) {
            for (int j = 0; j <= 5; ++j) {
                if (j != 0 && j != 5 && i != 0 && i != 5) continue;
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, Blocks.lllIIlIIIllllllIIIIlIlIlI, 0, j, 11, i, class_20462);
                this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, j, 12, i, class_20462);
            }
        }
        return true;
    }
}

