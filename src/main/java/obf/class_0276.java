package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.Random;

public class class_0276
extends class_0615 {
    private int lllIIIllIIIIlllIlIIllIIll;

    public class_0276() {
    }

    public class_0276(class_0206 class_02062, int n, Random random, class_2046 class_20462, int n2) {
        super(class_02062, n);
        this.lIllllIIlIIIlIllllllIIIll = n2;
        this.IlIIIIIllllllIIlllIllllll = class_20462;
        this.lllIIIllIIIIlllIlIIllIIll = Math.max(class_20462.lllIlIIlIIIlIlIIIllIlllIl(), class_20462.lIlllIlllIIIIlIIlllIllIII());
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Length", this.lllIIIllIIIIlllIlIIllIIll);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIllllIIlIIIlIllllllIIIll("Length");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1036 class_10362, List list, Random random) {
        class_1036 class_10363;
        int n;
        boolean bl = false;
        for (n = random.nextInt(5); n < this.lllIIIllIIIIlllIlIIllIIll - 8; n += 2 + random.nextInt(5)) {
            class_10363 = this.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, 0, n);
            if (class_10363 == null) continue;
            n += Math.max(class_10363.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(), class_10363.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
            bl = true;
        }
        for (n = random.nextInt(5); n < this.lllIIIllIIIIlllIlIIllIIll - 8; n += 2 + random.nextInt(5)) {
            class_10363 = this.lllIlIIlIIIlIlIIIllIlllIl((class_0206)class_10362, list, random, 0, n);
            if (class_10363 == null) continue;
            n += Math.max(class_10363.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl(), class_10363.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII());
            bl = true;
        }
        if (bl && random.nextInt(3) > 0) {
            switch (this.lIllllIIlIIIlIllllllIIIll) {
                case 0: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 2, 1, this.IlIllllllIIlIIllllIIlIIIl());
                    break;
                }
                case 1: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl());
                    break;
                }
                case 2: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll - 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, 1, this.IlIllllllIIlIIllllIIlIIIl());
                    break;
                }
                case 3: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl - 1, 2, this.IlIllllllIIlIIllllIIlIIIl());
                }
            }
        }
        if (bl && random.nextInt(3) > 0) {
            switch (this.lIllllIIlIIIlIllllllIIIll) {
                case 0: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll - 2, 3, this.IlIllllllIIlIIllllIIlIIIl());
                    break;
                }
                case 1: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl());
                    break;
                }
                case 2: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII + 1, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl, 3, this.IlIllllllIIlIIllllIIlIIIl());
                    break;
                }
                case 3: {
                    class_1979.lllIIIllIIIIlllIlIIllIIll((class_0206)class_10362, list, random, this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII - 2, this.IlIIIIIllllllIIlllIllllll.lllIlIIlIIIlIlIIIllIlllIl, this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll + 1, 0, this.IlIllllllIIlIIllllIIlIIIl());
                }
            }
        }
    }

    public static class_2046 lllIIIllIIIIlllIlIIllIIll(class_0206 class_02062, List list, Random random, int n, int n2, int n3, int n4) {
        for (int i = 7 * MathHelper.lllIIIllIIIIlllIlIIllIIll(random, 3, 5); i >= 7; i -= 7) {
            class_2046 class_20462 = class_2046.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, 0, 0, 0, 3, 3, i, n4);
            if (class_1036.lllIIIllIIIIlllIlIIllIIll(list, class_20462) != null) continue;
            return class_20462;
        }
        return null;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, class_2046 class_20462) {
        Block class_05492 = this.lllIlIIlIIIlIlIIIllIlllIl(Blocks.lllIIlIIIllllllIIIIlIlIlI, 0);
        for (int i = this.IlIIIIIllllllIIlllIllllll.lllIIIllIIIIlllIlIIllIIll; i <= this.IlIIIIIllllllIIlllIllllll.lIlllIlllIIIIlIIlllIllIII; ++i) {
            for (int j = this.IlIIIIIllllllIIlllIllllll.IlIllllllIIlIIllllIIlIIIl; j <= this.IlIIIIIllllllIIlllIllllll.lIllllIIlIIIlIllllllIIIll; ++j) {
                if (!class_20462.lllIlIIlIIIlIlIIIllIlllIl(i, 64, j)) continue;
                int n = class_13342.IIIllIllIIlIlIlIlIllllIIl(i, j) - 1;
                class_13342.lllIIIllIIIIlllIlIIllIIll(i, n, j, class_05492, 0, 2);
            }
        }
        return true;
    }
}

