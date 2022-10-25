package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;

import java.util.Random;

public class class_1512
extends Block {
    public class_1512() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
        this.lllIIIllIIIIlllIlIIllIIll(true);
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
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 29;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 10;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return n4 == 2 && class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (n4 == 3 && class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (n4 == 4 && class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : n4 == 5 && class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()));
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? true : class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = 0;
        if (n4 == 2 && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, true)) {
            n6 = 2;
        }
        if (n4 == 3 && class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, true)) {
            n6 = 0;
        }
        if (n4 == 4 && class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, true)) {
            n6 = 1;
        }
        if (n4 == 5 && class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, true)) {
            n6 = 3;
        }
        return n6;
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3, int n4) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, false, n4, false, -1, 0);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (class_05492 != this && this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            int n5 = n4 & 3;
            boolean bl = false;
            if (!class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && n5 == 3) {
                bl = true;
            }
            if (!class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && n5 == 1) {
                bl = true;
            }
            if (!class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() && n5 == 0) {
                bl = true;
            }
            if (!class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() && n5 == 2) {
                bl = true;
            }
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl, int n4, boolean bl2, int n5, int n6) {
        int n7;
        int n8;
        int n9;
        int n10;
        int n11 = n4 & 3;
        boolean bl3 = (n4 & 4) == 4;
        boolean bl4 = (n4 & 8) == 8;
        boolean bl5 = !bl;
        boolean bl6 = false;
        boolean bl7 = !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3);
        int n12 = class_1632.lllIIIllIIIIlllIlIIllIIll[n11];
        int n13 = class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11];
        int n14 = 0;
        int[] arrn = new int[42];
        for (n10 = 1; n10 < 42; ++n10) {
            n9 = n + n12 * n10;
            n8 = n3 + n13 * n10;
            Block class_05492 = class_13342.a_(n9, n2, n8);
            if (class_05492 == Blocks.IIllllIIlIlIlIlllIIIllIIl) {
                n7 = class_13342.IlIllllllIIlIIllllIIlIIIl(n9, n2, n8);
                if ((n7 & 3) != class_1632.lIllllIIlIIIlIllllllIIIll[n11]) break;
                n14 = n10;
                break;
            }
            if (class_05492 != Blocks.IIIllIIIlIlllllllIIIlllll && n10 != n5) {
                arrn[n10] = -1;
                bl5 = false;
                continue;
            }
            n7 = n10 == n5 ? n6 : class_13342.IlIllllllIIlIIllllIIlIIIl(n9, n2, n8);
            boolean bl8 = (n7 & 8) != 8;
            boolean bl9 = (n7 & 1) == 1;
            boolean bl10 = (n7 & 2) == 2;
            bl5 &= bl10 == bl7;
            bl6 |= bl8 && bl9;
            arrn[n10] = n7;
            if (n10 != n5) continue;
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
            bl5 &= bl8;
        }
        n10 = (bl5 ? 4 : 0) | ((bl6 &= (bl5 &= n14 > 1)) ? 8 : 0);
        n4 = n11 | n10;
        if (n14 > 0) {
            n9 = n + n12 * n14;
            n8 = n3 + n13 * n14;
            int n15 = class_1632.lIllllIIlIIIlIllllllIIIll[n11];
            class_13342.lllIIIllIIIIlllIlIIllIIll(n9, n2, n8, n15 | n10, 3);
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n9, n2, n8, n15);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n9, n2, n8, bl5, bl6, bl3, bl4);
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, bl5, bl6, bl3, bl4);
        if (!bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
            if (bl2) {
                this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n11);
            }
        }
        if (bl3 != bl5) {
            for (n9 = 1; n9 < n14; ++n9) {
                n8 = n + n12 * n9;
                int n16 = n3 + n13 * n9;
                n7 = arrn[n9];
                if (n7 < 0) continue;
                n7 = bl5 ? (n7 |= 4) : (n7 &= 0xFFFFFFFB);
                class_13342.lllIIIllIIIIlllIlIIllIIll(n8, n2, n16, n7, 3);
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, false, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), true, -1, 0);
    }

    private void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl, boolean bl2, boolean bl3, boolean bl4) {
        if (bl2 && !bl4) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.4f, 0.6f);
        } else if (!bl2 && bl4) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.4f, 0.5f);
        } else if (bl && !bl3) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.click", 0.4f, 0.7f);
        } else if (!bl && bl3) {
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.1, (double)n3 + 0.5, "random.bowhit", 0.4f, 1.2f / (class_13342.lllllIlllIIllIlIIlIIIllII.nextFloat() * 0.2f + 0.9f));
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
        if (n4 == 3) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
        } else if (n4 == 1) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
        } else if (n4 == 0) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
        } else if (n4 == 2) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
        }
    }

    private boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return false;
        }
        return true;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 3;
        float f = 0.1875f;
        if (n4 == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.2f, 0.5f - f, f * 2.0f, 0.8f, 0.5f + f);
        } else if (n4 == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f - f * 2.0f, 0.2f, 0.5f - f, 1.0f, 0.8f, 0.5f + f);
        } else if (n4 == 0) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.2f, 0.0f, 0.5f + f, 0.8f, f * 2.0f);
        } else if (n4 == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.2f, 1.0f - f * 2.0f, 0.5f + f, 0.8f, 1.0f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        boolean bl;
        boolean bl2 = (n4 & 4) == 4;
        boolean bl3 = bl = (n4 & 8) == 8;
        if (bl2 || bl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, true, n4, false, -1, 0);
        }
        if (bl) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
            int n5 = n4 & 3;
            if (n5 == 3) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
            } else if (n5 == 1) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
            } else if (n5 == 0) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
            } else if (n5 == 2) {
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
            }
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) == 8 ? 15 : 0;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if ((n5 & 8) != 8) {
            return 0;
        }
        int n6 = n5 & 3;
        return n6 == 2 && n4 == 2 ? 15 : (n6 == 0 && n4 == 3 ? 15 : (n6 == 1 && n4 == 4 ? 15 : (n6 == 3 && n4 == 5 ? 15 : 0)));
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }
}

