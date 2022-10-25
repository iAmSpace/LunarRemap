package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;

import java.util.Random;

public class class_2244
extends Block {
    private IIcon llllllIlIllllIlIlIlIIIIlI;
    private IIcon lIlIIllllIlIIIIllIIIIlIIl;

    public class_2244() {
        super(class_1855.IlIIIlIIIIllIIIllIIIIIIll);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return n == 0 ? this.lIlIIllllIlIIIIllIIIIlIIl : (n == 1 ? this.llllllIlIllllIlIlIlIIIIlI : this.llIIIIllIIIIIIIlIIIlIIIIl);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        super.lIlllIlllIIIIlIIlllIllIII(class_13342, n, n2, n3);
        if (class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, 1);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, 1);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 1;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1013 class_10132) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            class_0034 class_00342 = new class_0034(class_13342, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, class_10132.IlIllllllIIlIIllllIIlIIIl());
            class_00342.lllIIIllIIIIlllIlIIllIIll = class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(class_00342.lllIIIllIIIIlllIlIIllIIll / 4) + class_00342.lllIIIllIIIIlllIlIIllIIll / 8;
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_00342);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, (class_1965)null);
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_1965 class_19652) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (n4 & 1) == 1) {
            class_0034 class_00342 = new class_0034(class_13342, (float)n + 0.5f, (float)n2 + 0.5f, (float)n3 + 0.5f, class_19652);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_00342);
            class_13342.lllIIIllIIIIlllIlIIllIIll(class_00342, "game.tnt.primed", 1.0f, 1.0f);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (class_08142.IllIlIlIIIlIllIlIlIIlllII() != null && class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() == Items.flint_and_steel) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, 1, (class_1965)class_08142);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll(1, (class_1965)class_08142);
            return true;
        }
        return super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08142, n4, f, f2, f3);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        class_0369 class_03692;
        if (class_15212 instanceof class_0369 && !class_13342.IllIIIIllIIllIllIlllIlIIl && (class_03692 = (class_0369)class_15212).llIIIIIlIIlIIIIllIIIlIIII()) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, 1, class_03692.IlIllllllIIlIIllllIIlIIIl instanceof class_1965 ? (class_1965)class_03692.IlIllllllIIlIIllllIIlIIIl : null);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1013 class_10132) {
        return false;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_side");
        this.llllllIlIllllIlIlIlIIIIlI = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_top");
        this.lIlIIllllIlIIIIllIIIIlIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_bottom");
    }
}

