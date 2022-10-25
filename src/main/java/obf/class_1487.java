package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.stats.StatList;

import java.util.List;
import java.util.Random;

public class class_1487
extends class_0854
implements class_0588 {
    public static final String[] llllllIlIllllIlIlIlIIIIlI = new String[]{"sunflower", "syringa", "grass", "fern", "rose", "paeonia"};
    private IIcon[] llIlllIIllIlllIlIlIlIIIll;
    private IIcon[] IIIIlIIlIIIllIIIIllIIIlII;
    public IIcon[] lIlIIllllIlIIIIllIIIIlIIl;

    public class_1487() {
        super(class_1855.lIIIIlIlIIlllllIIllIIlIII);
        this.IlIllllllIIlIIllllIIlIIIl(0.0f);
        this.lllIIIllIIIIlllIlIIllIIll(lIllllIIlIIIlIllllllIIIll);
        this.lllIlIIlIIIlIlIIIllIlllIl("doublePlant");
    }

    @Override
    public int lIIIIlIlIIlllllIIllIIlIII() {
        return 40;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl(class_1843 class_18432, int n, int n2, int n3) {
        this.lllIIIllIIIIlllIlIIllIIll(0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);
    }

    public int IlIIIIIllllllIIlllIllllll(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return !class_1487.IllIIlllllllIIlIIlIIIIlIl(n4) ? n4 & 7 : class_18432.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3) & 7;
    }

    @Override
    public boolean IlIIIIIllllllIIlllIllllll(class_1334 class_13342, int n, int n2, int n3) {
        return super.IlIIIIIllllllIIlllIllllll(class_13342, n, n2, n3) && class_13342.lIlllIlllIIIIlIIlllIllIII(n, n2 + 1, n3);
    }

    @Override
    protected void IllIIIllIIIIlIlIlIllIIlll(class_1334 class_13342, int n, int n2, int n3) {
        if (!this.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3)) {
            int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
            if (!class_1487.IllIIlllllllIIlIIlIIIIlIl(n4)) {
                this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, 0);
                if (class_13342.a_(n, n2 + 1, n3) == this) {
                    class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2);
                }
            }
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2);
        }
    }

    @Override
    public boolean lIllllIIlIIIlIllllllIIIll(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return class_1487.IllIIlllllllIIlIIlIIIIlIl(n4) ? class_13342.a_(n, n2 - 1, n3) == this : class_13342.a_(n, n2 + 1, n3) == this && super.lIllllIIlIIIlIllllllIIIll(class_13342, n, n2, n3);
    }

    @Override
    public Item lllIIIllIIIIlllIlIIllIIll(int n, Random random, int n2) {
        if (class_1487.IllIIlllllllIIlIIlIIIIlIl(n)) {
            return null;
        }
        int n3 = class_1487.IIIllIllIIlIlIlIlIllllIIl(n);
        return n3 != 3 && n3 != 2 ? Item.getItemFromBlock(this) : null;
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll(int n) {
        return class_1487.IllIIlllllllIIlIIlIIIIlIl(n) ? 0 : n & 7;
    }

    public static boolean IllIIlllllllIIlIIlIIIIlIl(int n) {
        return (n & 8) != 0;
    }

    public static int IIIllIllIIlIlIlIlIllllIIl(int n) {
        return n & 7;
    }

    @Override
    public IIcon lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        return class_1487.IllIIlllllllIIlIIlIIIIlIl(n2) ? this.llIlllIIllIlllIlIlIlIIIll[0] : this.llIlllIIllIlllIlIlIlIIIll[n2 & 7];
    }

    public IIcon lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        return bl ? this.IIIIlIIlIIIllIIIIllIIIlII[n] : this.llIlllIIllIlllIlIlIlIIIll[n];
    }

    @Override
    public int lIlllIlllIIIIlIIlllIllIII(class_1843 class_18432, int n, int n2, int n3) {
        int n4 = this.IlIIIIIllllllIIlllIllllll(class_18432, n, n2, n3);
        return n4 != 2 && n4 != 3 ? 0xFFFFFF : class_18432.a_(n, n3).lllIlIIlIIIlIlIIIllIlllIl(n, n2, n3);
    }

    public void IlIllllllIIlIIllllIIlIIIl(class_1334 class_13342, int n, int n2, int n3, int n4, int n5) {
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2, n3, this, n4, n5);
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, this, 8, n5);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, class_1965 class_19652, ItemStack class_08972) {
        int n4 = ((MathHelper.IlIllllllIIlIIllllIIlIIIl((double)(class_19652.IIIIlIllIlIIlIIlIllIlIlll * 4.0f / 360.0f) + 0.5) & 3) + 2) % 4;
        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, this, 8 | n4, 2);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, class_0814 class_08142, int n, int n2, int n3, int n4) {
        if (class_13342.IllIIIIllIIllIllIlllIlIIl || class_08142.IllIlIlIIIlIllIlIlIIlllII() == null || class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() != Items.llllIIllllIllIlllllIIlIlI || class_1487.IllIIlllllllIIlIIlIIIIlIl(n4) || !this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, n4, class_08142)) {
            super.lllIIIllIIIIlllIlIIllIIll(class_13342, class_08142, n, n2, n3, n4);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        if (class_1487.IllIIlllllllIIlIIlIIIIlIl(n4)) {
            if (class_13342.a_(n, n2 - 1, n3) == this) {
                if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    int n5 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3);
                    int n6 = class_1487.IIIllIllIIlIlIlIlIllllIIl(n5);
                    if (n6 != 3 && n6 != 2) {
                        class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 - 1, n3, true);
                    } else {
                        if (!class_13342.IllIIIIllIIllIllIlllIlIIl && class_08142.IllIlIlIIIlIllIlIlIIlllII() != null && class_08142.IllIlIlIIIlIllIlIlIIlllII().lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI) {
                            this.lllIlIIlIIIlIlIIIllIlllIl(class_13342, n, n2, n3, n5, class_08142);
                        }
                        class_13342.lIllllIIlIIIlIllllllIIIll(n, n2 - 1, n3);
                    }
                } else {
                    class_13342.lIllllIIlIIIlIllllllIIIll(n, n2 - 1, n3);
                }
            }
        } else if (class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII && class_13342.a_(n, n2 + 1, n3) == this) {
            class_13342.lllIIIllIIIIlllIlIIllIIll(n, n2 + 1, n3, Blocks.lllIIIllIIIIlllIlIIllIIll, 0, 2);
        }
        super.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, n4, class_08142);
    }

    private boolean lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, int n, int n2, int n3, int n4, class_0814 class_08142) {
        int n5 = class_1487.IIIllIllIIlIlIlIlIllllIIl(n4);
        if (n5 != 3 && n5 != 2) {
            return false;
        }
        class_08142.lllIIIllIIIIlllIlIIllIIll(StatList.IllIIIIllIIllIllIlllIlIIl[Block.lllIIIllIIIIlllIlIIllIIll(this)], 1);
        int n6 = 1;
        if (n5 == 3) {
            n6 = 2;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(Blocks.IlIlIIlllIllllllllIIIlIlI, 2, n6));
        return true;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0887 class_08872) {
        this.llIlllIIllIlllIlIlIlIIIll = new IIcon[llllllIlIllllIlIlIlIIIIlI.length];
        this.IIIIlIIlIIIllIIIIllIIIlII = new IIcon[llllllIlIllllIlIlIlIIIIlI.length];
        for (int i = 0; i < this.llIlllIIllIlllIlIlIlIIIll.length; ++i) {
            this.llIlllIIllIlllIlIlIlIIIll[i] = class_08872.lllIIIllIIIIlllIlIIllIIll("double_plant_" + llllllIlIllllIlIlIlIIIIlI[i] + "_bottom");
            this.IIIIlIIlIIIllIIIIllIIIlII[i] = class_08872.lllIIIllIIIIlllIlIIllIIll("double_plant_" + llllllIlIllllIlIlIlIIIIlI[i] + "_top");
        }
        this.lIlIIllllIlIIIIllIIIIlIIl = new IIcon[2];
        this.lIlIIllllIlIIIIllIIIIlIIl[0] = class_08872.lllIIIllIIIIlllIlIIllIIll("double_plant_sunflower_front");
        this.lIlIIllllIlIIIIllIIIIlIIl[1] = class_08872.lllIIIllIIIIlllIlIIllIIll("double_plant_sunflower_back");
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, class_0931 class_09312, List list) {
        for (int i = 0; i < this.llIlllIIllIlllIlIlIlIIIll.length; ++i) {
            list.add(new ItemStack(class_06112, 1, i));
        }
    }

    @Override
    public int IllIIlllllllIIlIIlIIIIlIl(class_1334 class_13342, int n, int n2, int n3) {
        int n4 = class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2, n3);
        return class_1487.IllIIlllllllIIlIIlIIIIlIl(n4) ? class_1487.IIIllIllIIlIlIlIlIllllIIl(class_13342.IlIllllllIIlIIllllIIlIIIl(n, n2 - 1, n3)) : class_1487.IIIllIllIIlIlIlIlIllllIIl(n4);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, int n, int n2, int n3, boolean bl) {
        int n4 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3);
        return n4 != 2 && n4 != 3;
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, Random random, int n, int n2, int n3) {
        return true;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, Random random, int n, int n2, int n3) {
        int n4 = this.IlIIIIIllllllIIlllIllllll((class_1843)class_13342, n, n2, n3);
        this.lllIIIllIIIIlllIlIIllIIll(class_13342, n, n2, n3, new ItemStack(this, 1, n4));
    }
}

