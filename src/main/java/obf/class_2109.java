package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

import java.util.List;
import java.util.Random;

public class class_2109
extends Block {
    public class_2109() {
        super(class_1855.lllllIlllIIllIlIIlIIIllII);
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.15625f, 1.0f);
        this.lllIIIllIIIIlllIlIIllIIll(true);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342) {
        return 10;
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
    public int lllllIlllIIllIlIIlIIIllII() {
        return 1;
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 30;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Items.llIIIlllIlllIlIllIIIIllIl;
    }

    @Override
    public Item IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3) {
        return Items.llIIIlllIlllIlIllIIIIllIl;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        boolean bl;
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl2 = (n4 & 2) == 2;
        boolean bl3 = bl = !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3);
        if (bl2 != bl) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        boolean bl;
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl2 = (n4 & 4) == 4;
        boolean bl3 = bl = (n4 & 2) == 2;
        if (!bl) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.09375f, 1.0f);
        } else if (!bl2) {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 0.5f, 1.0f);
        } else {
            this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0625f, 0.0f, 1.0f, 0.15625f, 1.0f);
        }
    }

    @Override
    public void lIlllIlllIIIIlIIlllIllIII(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) ? 0 : 2;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
        this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4 | 1);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_08142.IllIlIlIIIlIllIlIlIIlllII() != null && class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 | 8, 4);
        }
    }

    private void IIIllIIlIIIIIIlIlIIllIIlI(class_1334 class_13342, int n, int n2, int n3, int n4) {
        block0: for (int i = 0; i < 2; ++i) {
            for (int j = 1; j < 42; ++j) {
                int n5 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[i] * j;
                int n6 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[i] * j;
                Block class_05492 = class_13342.a_(n5, n2, n6);
                if (class_05492 == Blocks.IIllllIIlIlIlIlllIIIllIIl) {
                    int n7 = class_13342.IlIllllllIIlIIllllIIlIIIl(n5, n2, n6) & 3;
                    if (n7 != class_1632.lIllllIIlIIIlIllllllIIIll[i]) continue block0;
                    Blocks.IIllllIIlIlIlIlllIIIllIIl.lllIIIllIIIIlllIlIIllIIll(class_13342, n5, n2, n6, false, class_13342.IlIllllllIIlIIllllIIlIIIl(n5, n2, n6), true, j, n4);
                    continue block0;
                }
                if (class_05492 != Blocks.IIIllIIIlIlllllllIIIlllll) continue block0;
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, class_1521 class_15212) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 1) != 1) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3) & 1) == 1) {
            this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
        }
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        boolean bl = (n4 & 1) == 1;
        boolean bl2 = false;
        List list = class_13342.lllIlIIlIIIlIlIIIllIlllIl((class_1521)null, class_1974.lllIIIllIIIIlllIlIIllIIll((double)n + this.lIlllIlllIlIIIIlllIlIlIIl, (double)n2 + this.IlIIlllllIIlIlIlllllIllll, (double)n3 + this.llIIlIlIlllIIllIlIlllIllI, (double)n + this.IllIIIIllIIllIllIlllIlIIl, (double)n2 + this.IIIIIIIIlIllIIllIIlllIllI, (double)n3 + this.IIlIIlIlIlIllIIlIlIIIIlll));
        if (!list.isEmpty()) {
            for (class_1521 class_15212 : list) {
                if (class_15212.IIIIIllIlIllIlIlIIlIllIIl()) continue;
                bl2 = true;
                break;
            }
        }
        if (bl2 && !bl) {
            n4 |= 1;
        }
        if (!bl2 && bl) {
            n4 &= 0xFFFFFFFE;
        }
        if (bl2 != bl) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4, 3);
            this.IIIllIIlIIIIIIlIlIIllIIlI(class_13342, n, n2, n3, n4);
        }
        if (bl2) {
            class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3, this, this.lllIIIllIIIIlllIlIIllIIll(class_13342));
        }
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1843 class_18432, int n, int n2, int n3, int n4, int n5) {
        boolean bl;
        int n6 = n + class_1632.lllIIIllIIIIlllIlIIllIIll[n5];
        int n7 = n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n5];
        Block class_05492 = class_18432.a_(n6, n2, n7);
        boolean bl2 = bl = (n4 & 2) == 2;
        if (class_05492 == Blocks.IIllllIIlIlIlIlllIIIllIIl) {
            int n8 = class_18432.IlIllllllIIlIIllllIIlIIIl(n6, n2, n7);
            int n9 = n8 & 3;
            return n9 == class_1632.lIllllIIlIIIlIllllllIIIll[n5];
        }
        if (class_05492 == Blocks.IIIllIIIlIlllllllIIIlllll) {
            int n10 = class_18432.IlIllllllIIlIIllllIIlIIIl(n6, n2, n7);
            boolean bl3 = (n10 & 2) == 2;
            return bl == bl3;
        }
        return false;
    }
}

