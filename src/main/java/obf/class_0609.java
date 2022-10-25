package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public abstract class class_0609
extends Block {
    protected final boolean llllllIlIllllIlIlIlIIIIlI;

    public static final boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        return class_0609.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2, n3));
    }

    public static final boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492 == Blocks.rail || class_05492 == Blocks.IIIIIIIIlIllIIllIIlllIllI || class_05492 == Blocks.IIlIIlIlIlIllIIlIlIIIIlll || class_05492 == Blocks.IlIlIIlllIIlIlllllIlIIIIl;
    }

    protected class_0609(boolean bl) {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIIIIIllllllIIlllIllllll);
    }

    public boolean llIlllIIllIlllIlIlIlIIIll() {
        return this.llllllIlIllllIlIlIlIIIIlI;
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
    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0864 class_08642, class_0864 class_08643) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08642, class_08643);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 >= 2 && n4 <= 5) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.625f, 1.0f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.125f, 1.0f);
        }
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 9;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 1;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3);
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, true);
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, this);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            int n4;
            int n5 = n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                n5 = n4 & 7;
            }
            boolean bl = false;
            if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3)) {
                bl = true;
            }
            if (n5 == 2 && !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n + 1, n2, n3)) {
                bl = true;
            }
            if (n5 == 3 && !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n - 1, n2, n3)) {
                bl = true;
            }
            if (n5 == 4 && !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3 - 1)) {
                bl = true;
            }
            if (n5 == 5 && !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3 + 1)) {
                bl = true;
            }
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, n5, class_05492);
            }
        }
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, int n5, Block class_05492) {
    }

    protected void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            new class_0818(this, class_13342, n, n2, n3).lllIIIllIIIIlllIlIIllIIll(class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3), bl);
        }
    }

    @Override
    public int llIIIlllIlllIlIllIIIIllIl() {
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        int n5 = n4;
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            n5 = n4 & 7;
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
        if (n5 == 2 || n5 == 3 || n5 == 4 || n5 == 5) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3, class_05492);
        }
        if (this.llllllIlIllllIlIlIlIIIIlI) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, class_05492);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, class_05492);
        }
    }
}

