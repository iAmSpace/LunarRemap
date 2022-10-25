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

public abstract class class_2259
extends class_0245 {
    int[] llllllIlIllllIlIlIlIIIIlI;
    protected int lIlIIllllIlIIIIllIIIIlIIl;
    protected class_2102[][] llIlllIIllIlllIlIlIlIIIll = new class_2102[2][];

    public class_2259() {
        super(class_1855.IllIIIllIIIIlIlIlIllIIlll, false);
        this.lllIIIllIIIIlllIlIIllIIll(true);
        this.lllIIIllIIIIlllIlIIllIIll(class_0931.IlIllllllIIlIIllllIIlIIIl);
        this.IlIllllllIIlIIllllIIlIIIl(0.2f);
        this.IlIllllllIIlIIllllIIlIIIl(1);
        this.lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
    }

    @Override
    public int llIIlIllIllllIlIIIIlIIlll() {
        double d = 0.5;
        double d2 = 1.0;
        return class_0828.lllIIIllIIIIlllIlIIllIIll(d, d2);
    }

    @Override
    public int lIllllIIlIIIlIllllllIIIll(int n) {
        return class_0828.IlIllllllIIlIIllllIIlIIIl();
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                int n7 = class_18432.a_(n + j, n3 + i).IlIllllllIIlIIllllIIlIIIl(n + j, n2, n3 + i);
                n4 += (n7 & 0xFF0000) >> 16;
                n5 += (n7 & 0xFF00) >> 8;
                n6 += n7 & 0xFF;
            }
        }
        return (n4 / 9 & 0xFF) << 16 | (n5 / 9 & 0xFF) << 8 | n6 / 9 & 0xFF;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Block class_05492, int n4) {
        int n5 = 1;
        int n6 = n5 + 1;
        if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - n6, n2 - n6, n3 - n6, n + n6, n2 + n6, n3 + n6)) {
            for (int i = -n5; i <= n5; ++i) {
                for (int j = -n5; j <= n5; ++j) {
                    for (int k = -n5; k <= n5; ++k) {
                        if (class_13342.a_(n + i, n2 + j, n3 + k).lIllllIIlIIIlIllllllIIIll() != class_1855.IllIIIllIIIIlIlIlIllIIlll) continue;
                        int n7 = class_13342.IlIllllllIIlIIllllIIlIIIl(n + i, n2 + j, n3 + k);
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n + i, n2 + j, n3 + k, n7 | 8, 4);
                    }
                }
            }
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, Random random) {
        int n4;
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && ((n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3)) & 8) != 0 && (n4 & 4) == 0) {
            int n5;
            int n6 = 4;
            int n7 = n6 + 1;
            int n8 = 32;
            int n9 = n8 * n8;
            int n10 = n8 / 2;
            if (this.llllllIlIllllIlIlIlIIIIlI == null) {
                this.llllllIlIllllIlIlIlIIIIlI = new int[n8 * n8 * n8];
            }
            if (class_13342.lllIlIIlIIIlIlIIIllIlllIl(n - n7, n2 - n7, n3 - n7, n + n7, n2 + n7, n3 + n7)) {
                int n11;
                int n12;
                for (n5 = -n6; n5 <= n6; ++n5) {
                    for (n12 = -n6; n12 <= n6; ++n12) {
                        for (n11 = -n6; n11 <= n6; ++n11) {
                            Block class_05492 = class_13342.a_(n + n5, n2 + n12, n3 + n11);
                            if (class_05492 != Blocks.log && class_05492 != Blocks.lIIlIIIIIlIlllIlIIlIlIlll) {
                                if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.IllIIIllIIIIlIlIlIllIIlll) {
                                    this.llllllIlIllllIlIlIlIIIIlI[(n5 + n10) * n9 + (n12 + n10) * n8 + n11 + n10] = -2;
                                    continue;
                                }
                                this.llllllIlIllllIlIlIlIIIIlI[(n5 + n10) * n9 + (n12 + n10) * n8 + n11 + n10] = -1;
                                continue;
                            }
                            this.llllllIlIllllIlIlIlIIIIlI[(n5 + n10) * n9 + (n12 + n10) * n8 + n11 + n10] = 0;
                        }
                    }
                }
                for (n5 = 1; n5 <= 4; ++n5) {
                    for (n12 = -n6; n12 <= n6; ++n12) {
                        for (n11 = -n6; n11 <= n6; ++n11) {
                            for (int i = -n6; i <= n6; ++i) {
                                if (this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10) * n8 + i + n10] != n5 - 1) continue;
                                if (this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10 - 1) * n9 + (n11 + n10) * n8 + i + n10] == -2) {
                                    this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10 - 1) * n9 + (n11 + n10) * n8 + i + n10] = n5;
                                }
                                if (this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10 + 1) * n9 + (n11 + n10) * n8 + i + n10] == -2) {
                                    this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10 + 1) * n9 + (n11 + n10) * n8 + i + n10] = n5;
                                }
                                if (this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10 - 1) * n8 + i + n10] == -2) {
                                    this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10 - 1) * n8 + i + n10] = n5;
                                }
                                if (this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10 + 1) * n8 + i + n10] == -2) {
                                    this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10 + 1) * n8 + i + n10] = n5;
                                }
                                if (this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10) * n8 + (i + n10 - 1)] == -2) {
                                    this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10) * n8 + (i + n10 - 1)] = n5;
                                }
                                if (this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10) * n8 + i + n10 + 1] != -2) continue;
                                this.llllllIlIllllIlIlIlIIIIlI[(n12 + n10) * n9 + (n11 + n10) * n8 + i + n10 + 1] = n5;
                            }
                        }
                    }
                }
            }
            if ((n5 = this.llllllIlIllllIlIlIlIIIIlI[n10 * n9 + n10 * n8 + n10]) >= 0) {
                class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, n4 & 0xFFFFFFF7, 4);
            } else {
                this.IllIIIllIIIIlIlIlIllIIlll(class_13342, n, n2, n3);
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, Random random) {
        if (class_13342.IIlllIlIlllIllIIIlllIIlIl(n, n2 + 1, n3) && !class_1334.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2 - 1, n3) && random.nextInt(15) == 1) {
            double d = (float)n + random.nextFloat();
            double d2 = (double)n2 - 0.05;
            double d3 = (float)n3 + random.nextFloat();
            class_13342.lllIIIllIIIIlllIlIIllIIll("dripWater", d, d2, d3, 0.0, 0.0, 0.0);
        }
    }

    private void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3), 0);
        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2, n3);
    }

    @Override
    public int lllIIIllIIIIlllIlIIllIIll(Random random) {
        return random.nextInt(20) == 0 ? 1 : 0;
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        return Item.getItemFromBlock(Blocks.IIIllIIlIIIIIIlIlIIllIIlI);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, float f, int n5) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl) {
            int n6 = this.IllIIlllllllIIlIIlIIIIlIl(n4);
            if (n5 > 0 && (n6 -= 2 << n5) < 10) {
                n6 = 10;
            }
            if (class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(n6) == 0) {
                Item class_06112 = this.lllIIIllIIIIlllIlIIllIIll(n4, class_13342.lllllIlllIIllIlIIlIIIllII, n5);
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(class_06112, 1, this.IlIIIIIllllllIIlllIllllll(n4)));
            }
            n6 = 200;
            if (n5 > 0 && (n6 -= 10 << n5) < 40) {
                n6 = 40;
            }
            this.IlIllllllIIlIIllllIIlIIIl(class_13342, n, n2, n3, n4, n6);
        }
    }

    protected void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
    }

    protected int IllIIlllllllIIlIIlIIIIlIl(int n) {
        return 20;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_08142.IllIlIlIIIlIllIlIlIIlllII() != null && class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
            this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Item.getItemFromBlock(this), 1, n4 & 3));
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, n, n2, n3, n4);
        }
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return n & 3;
    }

    @Override
    public boolean IlIlllIIIIIIlIIllIIllIlll() {
        return !this.IIIIlIIlIIIllIIIIllIIIlII;
    }

    @Override
    public abstract class_2102 lllIIIllIIIIlllIlIIllIIll(int var1, int var2);

    public void lllIlIIlIIIlIlIIIllIlllIl(boolean bl) {
        this.IIIIlIIlIIIllIIIIllIIIlII = bl;
        this.lIlIIllllIlIIIIllIIIIlIIl = bl ? 0 : 1;
    }

    @Override
    protected ItemStack IIIllIIlIIIIIIlIlIIllIIlI(int n) {
        return new ItemStack(Item.getItemFromBlock(this), 1, n & 3);
    }

    public abstract String[] llIlllIIllIlllIlIlIlIIIll();
}

