package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;

import java.util.List;
import java.util.Random;

public abstract class class_2152
extends Block {
    private final boolean llllllIlIllllIlIlIlIIIIlI;

    protected class_2152(boolean bl) {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.lIlllIlllIIIIlIIlllIllIII);
        this.llllllIlIllllIlIlIlIIIIlI = bl;
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return this.llllllIlIllllIlIlIlIIIIlI ? 30 : 20;
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
    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        return n4 == 2 && class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (n4 == 3 && class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? true : (n4 == 4 && class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : n4 == 5 && class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl()));
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? true : (class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? true : class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl()));
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n7 = n6 & 8;
        n6 &= 7;
        n6 = n4 == 2 && class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() ? 4 : (n4 == 3 && class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? 3 : (n4 == 4 && class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? 2 : (n4 == 5 && class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? 1 : this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3))));
        return n6 + n7;
    }

    private int IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        return class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? 1 : (class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() ? 2 : (class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() ? 3 : (class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() ? 4 : 1)));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (this.lIIIIlIlIIlllllIIllIIlIII(class_13342, n, n2, n3)) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 7;
            boolean bl = false;
            if (!class_13342.a_(n - 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && n4 == 1) {
                bl = true;
            }
            if (!class_13342.a_(n + 1, n2, n3).IIIllIllIIlIlIlIlIllllIIl() && n4 == 2) {
                bl = true;
            }
            if (!class_13342.a_(n, n2, n3 - 1).IIIllIllIIlIlIlIlIllllIIl() && n4 == 3) {
                bl = true;
            }
            if (!class_13342.a_(n, n2, n3 + 1).IIIllIllIIlIlIlIlIllllIIl() && n4 == 4) {
                bl = true;
            }
            if (bl) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
        }
    }

    private boolean lIIIIlIlIIlllllIIllIIlIII(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            return false;
        }
        return true;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        this.IllIIlllllllIIlIIlIIIIlIl(n4);
    }

    private void IllIIlllllllIIlIIlIIIIlIl(int n) {
        int n2 = n & 7;
        boolean bl = (n & 8) > 0;
        float f = 0.375f;
        float f2 = 0.625f;
        float f3 = 0.1875f;
        float f4 = 0.125f;
        if (bl) {
            f4 = 0.0625f;
        }
        if (n2 == 1) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, f, 0.5f - f3, f4, f2, 0.5f + f3);
        } else if (n2 == 2) {
            this.lllIIIllIIIIlllIlIIllIIll(1.0f - f4, f, 0.5f - f3, 1.0f, f2, 0.5f + f3);
        } else if (n2 == 3) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, f, 0.0f, 0.5f + f3, f2, f4);
        } else if (n2 == 4) {
            this.lllIIIllIIIIlllIlIIllIIll(0.5f - f3, f, 1.0f - f4, 0.5f + f3, f2, 1.0f);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142) {
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0814 class_08142, int n4, float f, float f2, float f3) {
        int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n6 = n5 & 7;
        int n7 = 8 - (n5 & 8);
        if (n7 == 0) {
            return true;
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n6 + n7, 3);
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
        class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.6f);
        this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n6);
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        if ((n4 & 8) > 0) {
            int n5 = n4 & 7;
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n5);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_05492, n4);
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3, int n4) {
        return (class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) > 0 ? 15 : 0;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3, int n4) {
        int n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if ((n5 & 8) == 0) {
            return 0;
        }
        int n6 = n5 & 7;
        return n6 == 5 && n4 == 1 ? 15 : (n6 == 4 && n4 == 2 ? 15 : (n6 == 3 && n4 == 3 ? 15 : (n6 == 2 && n4 == 4 ? 15 : (n6 == 1 && n4 == 5 ? 15 : 0))));
    }

    @Override
    public boolean llIllllIlIllIIIlIllIIlIlI() {
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && ((n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) & 8) != 0) {
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 & 7, 3);
                int n5 = n4 & 7;
                this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n5);
                class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.5f);
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
            }
        }
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        float f = 0.1875f;
        float f2 = 0.125f;
        float f3 = 0.125f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.5f - f2, 0.5f - f3, 0.5f + f, 0.5f + f2, 0.5f + f3);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && this.llllllIlIllllIlIlIlIIIIlI && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 8) == 0) {
            this.llIIlllIllIllllIIIlIIIIII(class_13342, n, n2, n3);
        }
    }

    private void llIIlllIllIllllIIIlIIIIII(class_1334 class_13342, int n, int n2, int n3) {
        boolean bl;
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        int n5 = n4 & 7;
        boolean bl2 = (n4 & 8) != 0;
        this.IllIIlllllllIIlIIlIIIIlIl(n4);
        List list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_0369.class, class_1974.lllIIIllIIIIlllIlIIllIIll((double)n + this.lIlllIlllIlIIIIlllIlIlIIl, (double)n2 + this.IlIIlllllIIlIlIlllllIllll, (double)n3 + this.llIIlIlIlllIIllIlIlllIllI, (double)n + this.IllIIIIllIIllIllIlllIlIIl, (double)n2 + this.IIIIIIIIlIllIIllIIlllIllI, (double)n3 + this.IIlIIlIlIlIllIIlIlIIIIlll));
        boolean bl3 = bl = !list.isEmpty();
        if (bl && !bl2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5 | 8, 3);
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n5);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.6f);
        }
        if (!bl && bl2) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5, 3);
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n5);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
            class_13342.lllIIIllIIIIlllIlIIllIIll((double)n + 0.5, (double)n2 + 0.5, (double)n3 + 0.5, "random.click", 0.3f, 0.5f);
        }
        if (bl) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this);
        if (n4 == 1) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n - 1, n2, n3, this);
        } else if (n4 == 2) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n + 1, n2, n3, this);
        } else if (n4 == 3) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 - 1, this);
        } else if (n4 == 4) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3 + 1, this);
        } else {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, this);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
    }
}

