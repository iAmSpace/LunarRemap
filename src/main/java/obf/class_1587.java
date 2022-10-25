package obf;

import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_1587
extends class_1774
implements class_0147 {
    private static final int[] lIIIIlIlIIlllllIIllIIlIII = new int[]{0};
    private static final int[] llIIlllIllIllllIIIlIIIIII = new int[]{2, 1};
    private static final int[] llIIllIllIlIIlIIllIllllll = new int[]{1};
    private ItemStack[] lllIIlIIIllllllIIIIlIlIlI = new ItemStack[3];
    public int IllIIlllllllIIlIIlIIIIlIl;
    public int IIIllIllIIlIlIlIlIllllIIl;
    public int IllIIIllIIIIlIlIlIllIIlll;
    private String IlIlllIIIIIIlIIllIIllIlll;

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIIlIIIllllllIIIIlIlIlI.length;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return this.lllIIlIIIllllllIIIIlIlIlI[n];
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.lllIIlIIIllllllIIIIlIlIlI[n] != null) {
            if (this.lllIIlIIIllllllIIIIlIlIlI[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = this.lllIIlIIIllllllIIIIlIlIlI[n];
                this.lllIIlIIIllllllIIIIlIlIlI[n] = null;
                return class_08972;
            }
            ItemStack class_08973 = this.lllIIlIIIllllllIIIIlIlIlI[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.lllIIlIIIllllllIIIIlIlIlI[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.lllIIlIIIllllllIIIIlIlIlI[n] = null;
            }
            return class_08973;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.lllIIlIIIllllllIIIIlIlIlI[n] != null) {
            ItemStack class_08972 = this.lllIIlIIIllllllIIIIlIlIlI[n];
            this.lllIIlIIIllllllIIIIlIlIlI[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.lllIIlIIIllllllIIIIlIlIlI[n] = class_08972;
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.llIIlIlIlllIIllIlIlllIllI()) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI();
        }
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl() ? this.IlIlllIIIIIIlIIllIIllIlll : "container.furnace";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IlIlllIIIIIIlIIllIIllIlll != null && this.IlIlllIIIIIIlIIllIIllIlll.length() > 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIlllIIIIIIlIIllIIllIlll = string;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("net.minecraft.init.Items", 10);
        this.lllIIlIIIllllllIIIIlIlIlI = new ItemStack[this.IlIIIIIllllllIIlllIllllll()];
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            byte by = class_07753.lIlllIlllIIIIlIIlllIllIII("Slot");
            if (by < 0 || by >= this.lllIIlIIIllllllIIIIlIlIlI.length) continue;
            this.lllIIlIIIllllllIIIIlIlIlI[by] = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.IlIIIIIllllllIIlllIllllll("BurnTime");
        this.IllIIIllIIIIlIlIlIllIIlll = class_07752.IlIIIIIllllllIIlllIllllll("CookTime");
        this.IIIllIllIIlIlIlIlIllllIIl = class_1587.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI[1]);
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8)) {
            this.IlIlllIIIIIIlIIllIIllIlll = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("BurnTime", (short)this.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CookTime", (short)this.IllIIIllIIIIlIlIlIllIIlll);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.lllIIlIIIllllllIIIIlIlIlI.length; ++i) {
            if (this.lllIIlIIIllllllIIIIlIlIlI[i] == null) continue;
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
            this.lllIIlIIIllllllIIIIlIlIlI[i].lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items", class_21452);
        if (this.IIlllIlIlllIllIIIlllIIlIl()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.IlIlllIIIIIIlIIllIIllIlll);
        }
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    public int lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.IllIIIllIIIIlIlIlIllIIlll * n / 200;
    }

    public int IlIllllllIIlIIllllIIlIIIl(int n) {
        if (this.IIIllIllIIlIlIlIlIllllIIl == 0) {
            this.IIIllIllIIlIlIlIlIllllIIl = 200;
        }
        return this.IllIIlllllllIIlIIlIIIIlIl * n / this.IIIllIllIIlIlIlIlIllllIIl;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        return this.IllIIlllllllIIlIIlIIIIlIl > 0;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        boolean bl = this.IllIIlllllllIIlIIlIIIIlIl > 0;
        boolean bl2 = false;
        if (this.IllIIlllllllIIlIIlIIIIlIl > 0) {
            --this.IllIIlllllllIIlIIlIIIIlIl;
        }
        if (!this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (this.IllIIlllllllIIlIIlIIIIlIl != 0 || this.lllIIlIIIllllllIIIIlIlIlI[1] != null && this.lllIIlIIIllllllIIIIlIlIlI[0] != null) {
                if (this.IllIIlllllllIIlIIlIIIIlIl == 0 && this.IlIlllIIIIIIlIIllIIllIlll()) {
                    this.IIIllIllIIlIlIlIlIllllIIl = this.IllIIlllllllIIlIIlIIIIlIl = class_1587.lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI[1]);
                    if (this.IllIIlllllllIIlIIlIIIIlIl > 0) {
                        bl2 = true;
                        if (this.lllIIlIIIllllllIIIIlIlIlI[1] != null) {
                            --this.lllIIlIIIllllllIIIIlIlIlI[1].lllIlIIlIIIlIlIIIllIlllIl;
                            if (this.lllIIlIIIllllllIIIIlIlIlI[1].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                                Item class_06112 = this.lllIIlIIIllllllIIIIlIlIlI[1].lllIIIllIIIIlllIlIIllIIll().llIIlllIllIllllIIIlIIIIII();
                                ItemStack class_08972 = this.lllIIlIIIllllllIIIIlIlIlI[1] = class_06112 != null ? new ItemStack(class_06112) : null;
                            }
                        }
                    }
                }
                if (this.lllIIIllIIIIlllIlIIllIIll() && this.IlIlllIIIIIIlIIllIIllIlll()) {
                    ++this.IllIIIllIIIIlIlIlIllIIlll;
                    if (this.IllIIIllIIIIlIlIlIllIIlll == 200) {
                        this.IllIIIllIIIIlIlIlIllIIlll = 0;
                        this.lllIIlIIIllllllIIIIlIlIlI();
                        bl2 = true;
                    }
                } else {
                    this.IllIIIllIIIIlIlIlIllIIlll = 0;
                }
            }
            if (bl != this.IllIIlllllllIIlIIlIIIIlIl > 0) {
                bl2 = true;
                class_1608.lllIIIllIIIIlllIlIIllIIll(this.IllIIlllllllIIlIIlIIIIlIl > 0, this.lllIIIllIIIIlllIlIIllIIll, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII);
            }
        }
        if (bl2) {
            this.llIIlIllIllllIlIIIIlIIlll();
        }
    }

    private boolean IlIlllIIIIIIlIIllIIllIlll() {
        if (this.lllIIlIIIllllllIIIIlIlIlI[0] == null) {
            return false;
        }
        ItemStack class_08972 = class_0400.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI[0]);
        return class_08972 == null ? false : (this.lllIIlIIIllllllIIIIlIlIlI[2] == null ? true : (!this.lllIIlIIIllllllIIIIlIlIlI[2].lllIIIllIIIIlllIlIIllIIll(class_08972) ? false : (this.lllIIlIIIllllllIIIIlIlIlI[2].lllIlIIlIIIlIlIIIllIlllIl < this.llIIlIlIlllIIllIlIlllIllI() && this.lllIIlIIIllllllIIIIlIlIlI[2].lllIlIIlIIIlIlIIIllIlllIl < this.lllIIlIIIllllllIIIIlIlIlI[2].lIlllIlllIIIIlIIlllIllIII() ? true : this.lllIIlIIIllllllIIIIlIlIlI[2].lllIlIIlIIIlIlIIIllIlllIl < class_08972.lIlllIlllIIIIlIIlllIllIII())));
    }

    public void lllIIlIIIllllllIIIIlIlIlI() {
        if (this.IlIlllIIIIIIlIIllIIllIlll()) {
            ItemStack class_08972 = class_0400.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIlIIIllllllIIIIlIlIlI[0]);
            if (this.lllIIlIIIllllllIIIIlIlIlI[2] == null) {
                this.lllIIlIIIllllllIIIIlIlIlI[2] = class_08972.llIIlllIllIllllIIIlIIIIII();
            } else if (this.lllIIlIIIllllllIIIIlIlIlI[2].lllIIIllIIIIlllIlIIllIIll() == class_08972.lllIIIllIIIIlllIlIIllIIll()) {
                ++this.lllIIlIIIllllllIIIIlIlIlI[2].lllIlIIlIIIlIlIIIllIlllIl;
            }
            --this.lllIIlIIIllllllIIIIlIlIlI[0].lllIlIIlIIIlIlIIIllIlllIl;
            if (this.lllIIlIIIllllllIIIIlIlIlI[0].lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                this.lllIIlIIIllllllIIIIlIlIlI[0] = null;
            }
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        if (class_08972 == null) {
            return 0;
        }
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        if (class_06112 instanceof class_1272 && Block.lllIIIllIIIIlllIlIIllIIll(class_06112) != Blocks.lllIIIllIIIIlllIlIIllIIll) {
            Block class_05492 = Block.lllIIIllIIIIlllIlIIllIIll(class_06112);
            if (class_05492 == Blocks.lIIlIlllIIlllIIlllIIlIlII) {
                return 150;
            }
            if (class_05492.lIllllIIlIIIlIllllllIIIll() == class_1855.lIlllIlllIIIIlIIlllIllIII) {
                return 300;
            }
            if (class_05492 == Blocks.IllIIlIIlIIIIlIlIlIIlIlIl) {
                return 16000;
            }
        }
        return class_06112 instanceof class_1578 && ((class_1578)class_06112).IIlllIlIlllIllIIIlllIIlIl().equals("WOOD") ? 200 : (class_06112 instanceof class_1531 && ((class_1531)class_06112).IIlllIlIlllIllIIIlllIIlIl().equals("WOOD") ? 200 : (class_06112 instanceof class_1079 && ((class_1079)class_06112).IlIIIlIIIIllIIIllIIIIIIll().equals("WOOD") ? 200 : (class_06112 == Items.llIllllIlIllIIIlIllIIlIlI ? 100 : (class_06112 == Items.IllIIlllllllIIlIIlIIIIlIl ? 1600 : (class_06112 == Items.lava_bucket ? 20000 : (class_06112 == Item.getItemFromBlock(Blocks.IIIllIIlIIIIIIlIlIIllIIlI) ? 100 : (class_06112 == Items.blaze_rod ? 2400 : 0)))))));
    }

    public static boolean lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        return class_1587.lllIIIllIIIIlllIlIIllIIll(class_08972) > 0;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.lllIIIllIIIIlllIlIIllIIll.lllIlIIlIIIlIlIIIllIlllIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII) != this ? false : class_08142.lIllllIIlIIIlIllllllIIIll((double)this.lllIlIIlIIIlIlIIIllIlllIl + 0.5, (double)this.IlIllllllIIlIIllllIIlIIIl + 0.5, (double)this.lIlllIlllIIIIlIIlllIllIII + 0.5) <= 64.0;
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return n == 2 ? false : (n == 1 ? class_1587.lllIlIIlIIIlIlIIIllIlllIl(class_08972) : true);
    }

    @Override
    public int[] lllIIIllIIIIlllIlIIllIIll(int n) {
        return n == 0 ? llIIlllIllIllllIIIlIIIIII : (n == 1 ? lIIIIlIlIIlllllIIllIIlIII : llIIllIllIlIIlIIllIllllll);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972, int n2) {
        return this.IlIllllllIIlIIllllIIlIIIl(n, class_08972);
    }

    @Override
    public boolean lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972, int n2) {
        return n2 != 0 || n != 1 || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.bucket;
    }
}

