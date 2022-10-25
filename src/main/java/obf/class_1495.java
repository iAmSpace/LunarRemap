package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;

import java.util.List;
import java.util.Random;

public class class_1495
extends class_1071 {
    public class_0850 lllIIIllIIIIlllIlIIllIIll = new class_0659(this, "Enchant", true, 1);
    private class_1334 IllIIlllllllIIlIIlIIIIlIl;
    private int IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll;
    private int lIIIIlIlIIlllllIIllIIlIII;
    private Random llIIlllIllIllllIIIlIIIIII = new Random();
    public long lIllllIIlIIIlIllllllIIIll;
    public int[] IIIllIIlIIIIIIlIlIIllIIlI = new int[3];

    public class_1495(class_0503 class_05032, class_1334 class_13342, int n, int n2, int n3) {
        int n4;
        this.IllIIlllllllIIlIIlIIIIlIl = class_13342;
        this.IIIllIllIIlIlIlIlIllllIIl = n;
        this.IllIIIllIIIIlIlIlIllIIlll = n2;
        this.lIIIIlIlIIlllllIIllIIlIII = n3;
        this.lllIlIIlIIIlIlIIIllIlllIl(new class_0571(this, this.lllIIIllIIIIlllIlIIllIIll, 0, 25, 47));
        for (n4 = 0; n4 < 3; ++n4) {
            for (int i = 0; i < 9; ++i) {
                this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, i + n4 * 9 + 9, 8 + i * 18, 84 + n4 * 18));
            }
        }
        for (n4 = 0; n4 < 9; ++n4) {
            this.lllIlIIlIIIlIlIIIllIlllIl(new class_1291(class_05032, n4, 8 + n4 * 18, 142));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1283 class_12832) {
        super.lllIIIllIIIIlllIlIIllIIll(class_12832);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.IIIllIIlIIIIIIlIlIIllIIlI[0]);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 1, this.IIIllIIlIIIIIIlIlIIllIIlI[1]);
        class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 2, this.IIIllIIlIIIIIIlIlIIllIIlI[2]);
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        super.IlIllllllIIlIIllllIIlIIIl();
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll.size(); ++i) {
            class_1283 class_12832 = (class_1283)this.IlIIIIIllllllIIlllIllllll.get(i);
            class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 0, this.IIIllIIlIIIIIIlIlIIllIIlI[0]);
            class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 1, this.IIIllIIlIIIIIIlIlIIllIIlI[1]);
            class_12832.lllIIIllIIIIlllIlIIllIIll((class_1071)this, 2, this.IIIllIIlIIIIIIlIlIIllIIlI[2]);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n >= 0 && n <= 2) {
            this.IIIllIIlIIIIIIlIlIIllIIlI[n] = n2;
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(n, n2);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502) {
        if (class_08502 == this.lllIIIllIIIIlllIlIIllIIll) {
            ItemStack class_08972 = class_08502.llIIllIllIlIIlIIllIllllll(0);
            if (class_08972 != null && class_08972.llIIlIllIllllIlIIIIlIIlll()) {
                this.lIllllIIlIIIlIllllllIIIll = this.llIIlllIllIllllIIIlIIIIII.nextLong();
                if (!this.IllIIlllllllIIlIIlIIIIlIl.IllIIIIllIIllIllIlllIlIIl) {
                    int n;
                    int n2 = 0;
                    for (n = -1; n <= 1; ++n) {
                        for (int i = -1; i <= 1; ++i) {
                            if (n == 0 && i == 0 || !this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII(this.IIIllIllIIlIlIlIlIllllIIl + i, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII + n) || !this.IllIIlllllllIIlIIlIIIIlIl.lIlllIlllIIIIlIIlllIllIII(this.IIIllIllIIlIlIlIlIllllIIl + i, this.IllIIIllIIIIlIlIlIllIIlll + 1, this.lIIIIlIlIIlllllIIllIIlIII + n)) continue;
                            if (this.IllIIlllllllIIlIIlIIIIlIl.a_(this.IIIllIllIIlIlIlIlIllllIIl + i * 2, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII + n * 2) == Blocks.bookshelf) {
                                ++n2;
                            }
                            if (this.IllIIlllllllIIlIIlIIIIlIl.a_(this.IIIllIllIIlIlIlIlIllllIIl + i * 2, this.IllIIIllIIIIlIlIlIllIIlll + 1, this.lIIIIlIlIIlllllIIllIIlIII + n * 2) == Blocks.bookshelf) {
                                ++n2;
                            }
                            if (i == 0 || n == 0) continue;
                            if (this.IllIIlllllllIIlIIlIIIIlIl.a_(this.IIIllIllIIlIlIlIlIllllIIl + i * 2, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII + n) == Blocks.bookshelf) {
                                ++n2;
                            }
                            if (this.IllIIlllllllIIlIIlIIIIlIl.a_(this.IIIllIllIIlIlIlIlIllllIIl + i * 2, this.IllIIIllIIIIlIlIlIllIIlll + 1, this.lIIIIlIlIIlllllIIllIIlIII + n) == Blocks.bookshelf) {
                                ++n2;
                            }
                            if (this.IllIIlllllllIIlIIlIIIIlIl.a_(this.IIIllIllIIlIlIlIlIllllIIl + i, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII + n * 2) == Blocks.bookshelf) {
                                ++n2;
                            }
                            if (this.IllIIlllllllIIlIIlIIIIlIl.a_(this.IIIllIllIIlIlIlIlIllllIIl + i, this.IllIIIllIIIIlIlIlIllIIlll + 1, this.lIIIIlIlIIlllllIIllIIlIII + n * 2) != Blocks.bookshelf) continue;
                            ++n2;
                        }
                    }
                    for (n = 0; n < 3; ++n) {
                        this.IIIllIIlIIIIIIlIlIIllIIlI[n] = class_1250.lllIIIllIIIIlllIlIIllIIll(this.llIIlllIllIllllIIIlIIIIII, n, n2, class_08972);
                    }
                    this.IlIllllllIIlIIllllIIlIIIl();
                }
            } else {
                for (int i = 0; i < 3; ++i) {
                    this.IIIllIIlIIIIIIlIlIIllIIlI[i] = 0;
                }
            }
        }
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142, int n) {
        ItemStack class_08972 = this.lllIIIllIIIIlllIlIIllIIll.llIIllIllIlIIlIIllIllllll(0);
        if (this.IIIllIIlIIIIIIlIlIIllIIlI[n] > 0 && class_08972 != null && (class_08142.lllIlllllIllIlIIlIlIIIlll >= this.IIIllIIlIIIIIIlIlIIllIIlI[n] || class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII)) {
            if (!this.IllIIlllllllIIlIIlIIIIlIl.IllIIIIllIIllIllIlllIlIIl) {
                boolean bl;
                List list = class_1250.lllIlIIlIIIlIlIIIllIlllIl(this.llIIlllIllIllllIIIlIIIIII, class_08972, this.IIIllIIlIIIIIIlIlIIllIIlI[n]);
                boolean bl2 = bl = class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.book;
                if (list != null) {
                    class_08142.IlIIIlIIIIllIIIllIIIIIIll(-this.IIIllIIlIIIIIIlIlIIllIIlI[n]);
                    if (bl) {
                        class_08972.lllIIIllIIIIlllIlIIllIIll(Items.lIllIlIlIIIIlIlIIlIlIlllI);
                    }
                    int n2 = bl && list.size() > 1 ? this.llIIlllIllIllllIIIlIIIIII.nextInt(list.size()) : -1;
                    for (int i = 0; i < list.size(); ++i) {
                        class_1129 class_11292 = (class_1129)list.get(i);
                        if (bl && i == n2) continue;
                        if (bl) {
                            Items.lIllIlIlIIIIlIlIIlIlIlllI.lllIIIllIIIIlllIlIIllIIll(class_08972, class_11292);
                            continue;
                        }
                        class_08972.lllIIIllIIIIlllIlIIllIIll(class_11292.lllIIIllIIIIlllIlIIllIIll, class_11292.lllIlIIlIIIlIlIIIllIlllIl);
                    }
                    this.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll);
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0814 class_08142) {
        ItemStack class_08972;
        super.lllIlIIlIIIlIlIIIllIlllIl(class_08142);
        if (!this.IllIIlllllllIIlIIlIIIIlIl.IllIIIIllIIllIllIlllIlIIl && (class_08972 = this.lllIIIllIIIIlllIlIIllIIll.lllIIlIIIllllllIIIIlIlIlI(0)) != null) {
            class_08142.lllIIIllIIIIlllIlIIllIIll(class_08972, false);
        }
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        return this.IllIIlllllllIIlIIlIIIIlIl.a_(this.IIIllIllIIlIlIlIlIllllIIl, this.IllIIIllIIIIlIlIlIllIIlll, this.lIIIIlIlIIlllllIIllIIlIII) != Blocks.enchanting_table ? false : class_08142.lIllllIIlIIIlIllllllIIIll((double)this.IIIllIllIIlIlIlIlIllllIIl + 0.5, (double)this.IllIIIllIIIIlIlIlIllIIlll + 0.5, (double)this.lIIIIlIlIIlllllIIllIIlIII + 0.5) <= 64.0;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142, int n) {
        ItemStack class_08972 = null;
        class_1291 class_12912 = (class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(n);
        if (class_12912 != null && class_12912.lllIlIIlIIIlIlIIIllIlllIl()) {
            ItemStack class_08973 = class_12912.lllIIIllIIIIlllIlIIllIIll();
            class_08972 = class_08973.llIIlllIllIllllIIIlIIIIII();
            if (n == 0) {
                if (!this.lllIIIllIIIIlllIlIIllIIll(class_08973, 1, 37, true)) {
                    return null;
                }
            } else {
                if (((class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(0)).lllIlIIlIIIlIlIIIllIlllIl() || !((class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(0)).lllIIIllIIIIlllIlIIllIIll(class_08973)) {
                    return null;
                }
                if (class_08973.IlIlIIlIlIllIIlIlIIllIIIl() && class_08973.lllIlIIlIIIlIlIIIllIlllIl == 1) {
                    ((class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(0)).lllIlIIlIIIlIlIIIllIlllIl(class_08973.llIIlllIllIllllIIIlIIIIII());
                    class_08973.lllIlIIlIIIlIlIIIllIlllIl = 0;
                } else if (class_08973.lllIlIIlIIIlIlIIIllIlllIl >= 1) {
                    ((class_1291)this.IlIllllllIIlIIllllIIlIIIl.get(0)).lllIlIIlIIIlIlIIIllIlllIl(new ItemStack(class_08973.lllIIIllIIIIlllIlIIllIIll(), 1, class_08973.IllIIIllIIIIlIlIlIllIIlll()));
                    --class_08973.lllIlIIlIIIlIlIIIllIlllIl;
                }
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_12912.lllIlIIlIIIlIlIIIllIlllIl(null);
            } else {
                class_12912.IlIllllllIIlIIllllIIlIIIl();
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl == class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                return null;
            }
            class_12912.lllIIIllIIIIlllIlIIllIIll(class_08142, class_08973);
        }
        return class_08972;
    }
}

