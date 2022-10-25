package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.Random;

public abstract class class_0313
extends Block {
    private String llllllIlIllllIlIlIlIIIIlI;

    protected class_0313(String string, class_1855 class_18552) {
        super(class_18552);
        this.llllllIlIllllIlIlIlIIIIlI = string;
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl(this.IllIIIllIIIIlIlIlIllIIlll(15));
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.IllIIlllllllIIlIIlIIIIlIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    protected void IllIIlllllllIIlIIlIIIIlIl(int n) {
        boolean bl = this.IIIllIllIIlIlIlIlIllllIIl(n) > 0;
        float f = 0.0625f;
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f, 1.0f - f, 0.03125f, 1.0f - f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(f, 0.0f, f, 1.0f - f, 0.0625f, 1.0f - f);
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 20;
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        return true;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) || class_1417.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 - 1, n3));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        boolean bl = false;
        if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && !class_1417.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 - 1, n3))) {
            bl = true;
        }
        if (bl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (n4 = this.IIIllIllIIlIlIlIlIllllIIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3))) > 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        int n4;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (n4 = this.IIIllIllIIlIlIlIlIllllIIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3))) == 0) {
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
        }
    }

    protected void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        boolean bl;
        int n5 = this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3);
        boolean bl2 = n4 > 0;
        boolean bl3 = bl = n5 > 0;
        if (n4 != n5) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this.IllIIIllIIIIlIlIlIllIIlll(n5), 2);
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
        }
        if (!bl && bl2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.3f, 0.5f);
        } else if (bl && !bl2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (bl) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
        }
    }

    protected class_1974 lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3) {
        float f = 0.125f;
        return class_1974.lllIIIllIIIIlllIlIIllIIll((float)n + f, n2, (float)n3 + f, (float)(n + 1) - f, (double)n2 + 0.25, (float)(n3 + 1) - f);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        if (this.IIIllIllIIlIlIlIlIllllIIl(n4) > 0) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    protected void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return this.IIIllIllIIlIlIlIlIllllIIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return n4 == 1 ? this.IIIllIllIIlIlIlIlIllllIIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) : 0;
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        float f = 0.5f;
        float f2 = 0.125f;
        float f3 = 0.5f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.5f - f2, 0.5f - f3, 0.5f + f, 0.5f + f2, 0.5f + f3);
    }

    @Override
    public int llIIIlllIlllIlIllIIIIllIl() {
        return 1;
    }

    protected abstract int lIIIIlIlIIlllllIIllIIlIII(class_1334 var1, int var2, int var3, int var4);

    protected abstract int IIIllIllIIlIlIlIlIllllIIl(int var1);

    protected abstract int IllIIIllIIIIlIlIlIllIIlll(int var1);

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIIIIllIIIIIIIlIIIlIIIIl = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI);
    }
}

