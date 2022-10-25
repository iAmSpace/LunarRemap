package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.stats.StatList;

import java.util.Random;

public class class_0001
extends Block {
    public class_0001() {
        super(class_1855.llIIlllIllIllllIIIlIIIIII);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 20;
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
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        boolean bl;
        float f = 0.0625f;
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        float f2 = 1.0f;
        float f3 = 1.0f;
        float f4 = 1.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        float f7 = 0.0f;
        boolean bl2 = bl = n4 > 0;
        if ((n4 & 2) != 0) {
            f5 = Math.max(f5, 0.0625f);
            f2 = 0.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            bl = true;
        }
        if ((n4 & 8) != 0) {
            f2 = Math.min(f2, 0.9375f);
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
            bl = true;
        }
        if ((n4 & 4) != 0) {
            f7 = Math.max(f7, 0.0625f);
            f4 = 0.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            bl = true;
        }
        if ((n4 & 1) != 0) {
            f4 = Math.min(f4, 0.9375f);
            f7 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f3 = 0.0f;
            f6 = 1.0f;
            bl = true;
        }
        if (!bl && this.IlIllllllIIlIIllllIIlIIIl(class_18432.a_(n, n2 + 1, n3))) {
            f3 = Math.min(f3, 0.9375f);
            f6 = 1.0f;
            f2 = 0.0f;
            f5 = 1.0f;
            f4 = 0.0f;
            f7 = 1.0f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(f2, f3, f4, f5, f6, f7);
    }

    @Override
    public class_1974 IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3) {
        return null;
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4) {
        switch (n4) {
            case 1: {
                return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 + 1, n3));
            }
            case 2: {
                return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2, n3 + 1));
            }
            case 3: {
                return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2, n3 - 1));
            }
            case 4: {
                return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + 1, n2, n3));
            }
            case 5: {
                return this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n - 1, n2, n3));
            }
        }
        return false;
    }

    private boolean IlIllllllIIlIIllllIIlIIIl(Block class_05492) {
        return class_05492.IllIIIllIIIIlIlIlIllIIlll() && class_05492.IlIlIIlllIllllllllIIIlIlI.lIlllIlllIIIIlIIlllIllIII();
    }

    private boolean IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        int n4;
        int n5 = n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        if (n4 > 0) {
            for (int i = 0; i <= 3; ++i) {
                int n6 = 1 << i;
                if ((n4 & n6) == 0 || this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[i], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[i])) || class_13342.a_(n, n2 + 1, n3) == this && (class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 + 1, n3) & n6) != 0) continue;
                n5 &= ~n6;
            }
        }
        if (n5 == 0 && !this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n, n2 + 1, n3))) {
            return false;
        }
        if (n5 != n4) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n5, 2);
        }
        return true;
    }

    @Override
    public int llIIlIllIllllIlIIIIlIIlll() {
        return class_0828.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(int n) {
        return class_0828.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        return class_18432.a_(n, n3).IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && !this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3)) {
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
            class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(4) == 0) {
            int n4;
            int n5;
            int n6;
            int n7 = 4;
            int n8 = 5;
            boolean bl = false;
            block0: for (n6 = n - n7; n6 <= n + n7; ++n6) {
                for (n5 = n3 - n7; n5 <= n3 + n7; ++n5) {
                    for (n4 = n2 - 1; n4 <= n2 + 1; ++n4) {
                        if (class_13342.a_(n6, n4, n5) != this || --n8 > 0) continue;
                        bl = true;
                        break block0;
                    }
                }
            }
            n6 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            n5 = class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(6);
            n4 = class_1632.IlIIIIIllllllIIlllIllllll[n5];
            if (n5 == 1 && n2 < 255 && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3)) {
                if (bl) {
                    return;
                }
                int n9 = class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16) & n6;
                if (n9 > 0) {
                    for (int i = 0; i <= 3; ++i) {
                        if (this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[i], n2 + 1, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[i]))) continue;
                        n9 &= ~(1 << i);
                    }
                    if (n9 > 0) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, this, n9, 2);
                    }
                }
            } else if (n5 >= 2 && n5 <= 5 && (n6 & 1 << n4) == 0) {
                if (bl) {
                    return;
                }
                Block class_05492 = class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4]);
                if (class_05492.IlIlIIlllIllllllllIIIlIlI == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    int n10 = n4 + 1 & 3;
                    int n11 = n4 + 3 & 3;
                    if ((n6 & 1 << n10) != 0 && this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4] + class_1632.lllIIIllIIIIlllIlIIllIIll[n10], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4] + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n10]))) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4], this, 1 << n10, 2);
                    } else if ((n6 & 1 << n11) != 0 && this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4] + class_1632.lllIIIllIIIIlllIlIIllIIll[n11], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4] + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11]))) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4], this, 1 << n11, 2);
                    } else if ((n6 & 1 << n10) != 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4] + class_1632.lllIIIllIIIIlllIlIIllIIll[n10], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4] + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n10]) && this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n10], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n10]))) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4] + class_1632.lllIIIllIIIIlllIlIIllIIll[n10], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4] + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n10], this, 1 << (n4 + 2 & 3), 2);
                    } else if ((n6 & 1 << n11) != 0 && class_13342.lIlllIlllIIIIlIIlllIllIII(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4] + class_1632.lllIIIllIIIIlllIlIIllIIll[n11], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4] + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11]) && this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n11], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11]))) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4] + class_1632.lllIIIllIIIIlllIlIIllIIll[n11], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4] + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n11], this, 1 << (n4 + 2 & 3), 2);
                    } else if (this.IlIllllllIIlIIllllIIlIIIl(class_13342.a_(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4], n2 + 1, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4]))) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + class_1632.lllIIIllIIIIlllIlIIllIIll[n4], n2, n3 + class_1632.lllIlIIlIIIlIlIIIllIlllIl[n4], this, 0, 2);
                    }
                } else if (class_05492.IlIlIIlllIllllllllIIIlIlI.IllIIIllIIIIlIlIlIllIIlll() && class_05492.IllIIIllIIIIlIlIlIllIIlll()) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n6 | 1 << n4, 2);
                }
            } else if (n2 > 1) {
                Block class_05493 = class_13342.a_(n, n2 - 1, n3);
                if (class_05493.IlIlIIlllIllllllllIIIlIlI == class_1855.lllIIIllIIIIlllIlIIllIIll) {
                    int n12 = class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16) & n6;
                    if (n12 > 0) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, this, n12, 2);
                    }
                } else if (class_05493 == this) {
                    int n13 = class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(16) & n6;
                    int n14 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3);
                    if (n14 != (n14 | n13)) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, n14 | n13, 2);
                    }
                }
            }
        }
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, float f2, float f3, int n5) {
        int n6 = 0;
        switch (n4) {
            case 2: {
                n6 = 1;
                break;
            }
            case 3: {
                n6 = 4;
                break;
            }
            case 4: {
                n6 = 8;
                break;
            }
            case 5: {
                n6 = 2;
            }
        }
        return n6 != 0 ? n6 : n5;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return null;
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_08142.IllIlIlIIIlIllIlIlIIlllII() != null && class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Blocks.lIIlIlllIIlIIIIlIlIIIIlll, 1, 0));
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, n, n2, n3, n4);
        }
    }
}

