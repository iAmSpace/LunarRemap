package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.Random;

public class class_2089
extends Block {
    private class_2102[] llllllIlIllllIlIlIlIIIIlI;
    private class_2102[] lIlIIllllIlIIIIllIIIIlIIl;

    protected class_2089(class_1855 class_18552) {
        super(class_18552);
        float f = 0.5f;
        float f2 = 1.0f;
        this.lllIIIllIIIIlllIlIIllIIll(0.5f - f, 0.0f, 0.5f - f, 0.5f + f, f2, 0.5f + f);
    }

    @Override
    public class_2102 lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return this.lIlIIllllIlIIIIllIIIIlIIl[0];
    }

    @Override
    public class_2102 IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3, int n4) {
        if (n4 != 1 && n4 != 0) {
            boolean bl;
            int n5 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2, n3);
            int n6 = n5 & 3;
            boolean bl2 = (n5 & 4) != 0;
            boolean bl3 = false;
            boolean bl4 = bl = (n5 & 8) != 0;
            if (bl2) {
                if (n6 == 0 && n4 == 2) {
                    bl3 = !bl3;
                } else if (n6 == 1 && n4 == 5) {
                    bl3 = !bl3;
                } else if (n6 == 2 && n4 == 3) {
                    bl3 = !bl3;
                } else if (n6 == 3 && n4 == 4) {
                    bl3 = !bl3;
                }
            } else {
                if (n6 == 0 && n4 == 5) {
                    bl3 = !bl3;
                } else if (n6 == 1 && n4 == 3) {
                    bl3 = !bl3;
                } else if (n6 == 2 && n4 == 4) {
                    bl3 = !bl3;
                } else if (n6 == 3 && n4 == 2) {
                    boolean bl5 = bl3 = !bl3;
                }
                if ((n5 & 0x10) != 0) {
                    boolean bl6 = bl3 = !bl3;
                }
            }
            return bl ? this.llllllIlIllllIlIlIlIIIIlI[bl3 ? 1 : 0] : this.lIlIIllllIlIIIIllIIIIlIIl[bl3 ? 1 : 0];
        }
        return this.lIlIIllllIlIIIIllIIIIlIIl[0];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llllllIlIllllIlIlIlIIIIlI = new class_2102[2];
        this.lIlIIllllIlIIIIllIIIIlIIl = new class_2102[2];
        this.llllllIlIllllIlIlIlIIIIlI[0] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_upper");
        this.lIlIIllllIlIIIIllIIIIlIIl[0] = class_08872.lllIIIllIIIIlllIlIIllIIll(this.llllllIlIllllIlIlIlIIIIlI() + "_lower");
        this.llllllIlIllllIlIlIlIIIIlI[1] = new class_1507(this.llllllIlIllllIlIlIlIIIIlI[0], true, false);
        this.lIlIIllllIlIIIIllIIIIlIIl[1] = new class_1507(this.lIlIIllllIlIIIIllIIIIlIIl[0], true, false);
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return false;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = this.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2, n3);
        return (n4 & 4) != 0;
    }

    @Override
    public boolean IllIIIllIIIIlIlIlIllIIlll() {
        return false;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 7;
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
        this.IllIIlllllllIIlIIlIIIIlIl(this.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2, n3));
    }

    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        return this.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2, n3) & 3;
    }

    public boolean lIllllIIlIIIlIllllllIIIll(class_1843 class_18432, int n, int n2, int n3) {
        return (this.IIIllIIlIIIIIIlIlIIllIIlI(class_18432, n, n2, n3) & 4) != 0;
    }

    private void IllIIlllllllIIlIIlIIIIlIl(int n) {
        boolean bl;
        float f = 0.1875f;
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 2.0f, 1.0f);
        int n2 = n & 3;
        boolean bl2 = (n & 4) != 0;
        boolean bl3 = bl = (n & 0x10) != 0;
        if (n2 == 0) {
            if (bl2) {
                if (!bl) {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
            }
        } else if (n2 == 1) {
            if (bl2) {
                if (!bl) {
                    this.lllIIIllIIIIlllIlIIllIIll(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
            }
        } else if (n2 == 2) {
            if (bl2) {
                if (!bl) {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, f);
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
            }
        } else if (n2 == 3) {
            if (bl2) {
                if (!bl) {
                    this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, f, 1.0f, 1.0f);
                } else {
                    this.lllIIIllIIIIlllIlIIllIIll(1.0f - f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
                }
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 1.0f - f, 1.0f, 1.0f, 1.0f);
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
        int n5 = this.IIIllIIlIIIIIIlIlIIllIIlI((class_1843)class_13342, n, n2, n3);
        int n6 = n5 & 7;
        n6 ^= 4;
        if ((n5 & 8) == 0) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n6, 2);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
        } else {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, n6, 2);
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, n, n2, n3);
        }
        class_13342.lllIIIllIIIIlllIlIIllIIll(class_08142, 1003, n, n2, n3, 0);
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        boolean bl2;
        int n4 = this.IIIllIIlIIIIIIlIlIIllIIlI((class_1843)class_13342, n, n2, n3);
        boolean bl3 = bl2 = (n4 & 4) != 0;
        if (bl2 != bl) {
            int n5 = n4 & 7;
            n5 ^= 4;
            if ((n4 & 8) == 0) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5, 2);
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, n, n2, n3);
            } else {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, n5, 2);
                class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3, n, n2, n3);
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(null, 1003, n, n2, n3, 0);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if ((n4 & 8) == 0) {
            boolean bl = false;
            if (class_13342.a_(n, n2 + 1, n3) != this) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                bl = true;
            }
            if (!class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3)) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
                bl = true;
                if (class_13342.a_(n, n2 + 1, n3) == this) {
                    class_13342.lIllllIIlIIIlIllllllIIIll(n, n2 + 1, n3);
                }
            }
            if (bl) {
                if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
                }
            } else {
                boolean bl2;
                boolean bl3 = bl2 = class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2, n3) || class_13342.lIIlIIIIIlIlllIlIIlIlIlll(n, n2 + 1, n3);
                if ((bl2 || class_05492.llIllllIlIllIIIlIllIIlIlI()) && class_05492 != this) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, bl2);
                }
            }
        } else {
            if (class_13342.a_(n, n2 - 1, n3) != this) {
                class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
            }
            if (class_05492 != this) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3, class_05492);
            }
        }
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return (n & 8) != 0 ? null : (this.IlIlIIlllIllllllllIIIlIlI == class_1855.lIllllIIlIIIlIllllllIIIll ? Items.lIIlIlIIllIIIlIIlIlIIIlII : Items.lIlllIIllIIIIIIlIlIIlIllI);
    }

    @Override
    public class_1112 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_0864 class_08642, class_0864 class_08643) {
        this.IlIllllllIIlIIllllIIlIIIl((class_1843)class_13342, n, n2, n3);
        return super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_08642, class_08643);
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return n2 >= 255 ? false : class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) && super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2 + 1, n3);
    }

    @Override
    public int llIIIlllIlllIlIllIIIIllIl() {
        return 1;
    }

    public int IIIllIIlIIIIIIlIlIIllIIlI(class_1843 class_18432, int n, int n2, int n3) {
        int n4;
        int n5;
        boolean bl;
        int n6 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl2 = bl = (n6 & 8) != 0;
        if (bl) {
            n5 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3);
            n4 = n6;
        } else {
            n5 = n6;
            n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3);
        }
        boolean bl3 = (n4 & 1) != 0;
        return n5 & 7 | (bl ? 8 : 0) | (bl3 ? 16 : 0);
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return this.IlIlIIlllIllllllllIIIlIlI == class_1855.lIllllIIlIIIlIllllllIIIll ? Items.lIIlIlIIllIIIlIIlIlIIIlII : Items.lIlllIIllIIIIIIlIlIIlIllI;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && (n4 & 8) != 0 && class_13342.a_(n, n2 - 1, n3) == this) {
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2 - 1, n3);
        }
    }
}

