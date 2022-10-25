package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0539
extends Block {
    protected class_0539(class_1855 class_18552) {
        super(class_18552);
        float f = 0.5f;
        float f2 = 1.0f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
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
        return !class_0539.IIIllIllIIlIlIlIlIllllIIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 0;
    }

    @Override
    public class_1974 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.IllIIlllllllIIlIIlIIIIlIl(class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3));
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        float f = 0.1875f;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.5f - f / 2.0f, 0.0f, 1.0f, 0.5f + f / 2.0f, 1.0f);
    }

    public void IllIIlllllllIIlIIlIIIIlIl(int n) {
        float f = 0.1875f;
        if ((n & 8) != 0) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 1.0f - f, 0.0f, 1.0f, 1.0f, 1.0f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, f, 1.0f);
        }
        if (class_0539.IIIllIllIIlIlIlIlIllllIIl(n)) {
            if ((n & 3) == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
            }
            if ((n & 3) == 1) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
            }
            if ((n & 3) == 2) {
                this.lllIIIllIIIIlllIlIIllIIll(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
            if ((n & 3) == 3) {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        if (this.IlIlIIlllIllllllllIIIlIlI == class_1855.lIllllIIlIIIlIllllllIIIll) {
            return true;
        }
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 ^ 4, 2);
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_08142, 1003, n, n2, n3, 0);
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        boolean bl2;
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl3 = bl2 = (n4 & 4) > 0;
        if (bl2 != bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 ^ 4, 2);
            class_13342.lllIIIllIIIIlllIlIIllIIll(null, 1003, n, n2, n3, 0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            boolean bl;
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            int n5 = n;
            int n6 = n3;
            if ((n4 & 3) == 0) {
                n6 = n3 + 1;
            }
            if ((n4 & 3) == 1) {
                --n6;
            }
            if ((n4 & 3) == 2) {
                n5 = n + 1;
            }
            if ((n4 & 3) == 3) {
                --n5;
            }
            if (!class_0539.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n5, n2, n6))) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
            }
            if ((bl = class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3)) || class_05492.llIllllIlIllIIIlIllIIlIlI()) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, bl);
            }
        }
    }

    @Override
    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0864 class_08642, class_0864 class_08643) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08642, class_08643);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = 0;
        if (n4 == 2) {
            n6 = 0;
        }
        if (n4 == 3) {
            n6 = 1;
        }
        if (n4 == 4) {
            n6 = 2;
        }
        if (n4 == 5) {
            n6 = 3;
        }
        if (n4 != 1 && n4 != 0 && f2 > 0.5f) {
            n6 |= 8;
        }
        return n6;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        if (n4 == 0) {
            return false;
        }
        if (n4 == 1) {
            return false;
        }
        if (n4 == 2) {
            ++n3;
        }
        if (n4 == 3) {
            --n3;
        }
        if (n4 == 4) {
            ++n;
        }
        if (n4 == 5) {
            --n;
        }
        return class_0539.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2, n3));
    }

    public static boolean IIIllIllIIlIlIlIlIllllIIl(int n) {
        return (n & 4) != 0;
    }

    private static boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492.IlIlIIlllIllllllllIIIlIlI.IllIIIllIIIIlIlIlIllIIlll() && class_05492.IllIIIllIIIIlIlIlIllIIlll() || class_05492 == Blocks.IIIIlllIIlIllllllIllIIlll || class_05492 instanceof class_2209 || class_05492 instanceof class_1254;
    }
}

