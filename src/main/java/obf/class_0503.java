package obf;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.crash.CrashReport;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;

/*
 * Decompiled with CFR 0.150.
 */
public class class_0503
implements class_0850 {
    public ItemStack[] lllIIIllIIIIlllIlIIllIIll = new ItemStack[36];
    public ItemStack[] lllIlIIlIIIlIlIIIllIlllIl = new ItemStack[4];
    public int IlIllllllIIlIIllllIIlIIIl;
    private ItemStack lIllllIIlIIIlIllllllIIIll;
    public class_0814 lIlllIlllIIIIlIIlllIllIII;
    private ItemStack IIIllIIlIIIIIIlIlIIllIIlI;
    public boolean IlIIIIIllllllIIlllIllllll;

    public class_0503(class_0814 class_08142) {
        this.lIlllIlllIIIIlIIlllIllIII = class_08142;
    }

    public ItemStack lllIIIllIIIIlllIlIIllIIll() {
        return this.IlIllllllIIlIIllllIIlIIIl < 9 && this.IlIllllllIIlIIllllIIlIIIl >= 0 ? this.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl] : null;
    }

    public static int lllIlIIlIIIlIlIIIllIlllIl() {
        return 9;
    }

    private int IlIllllllIIlIIllllIIlIIIl(Item class_06112) {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i] == null || this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll() != class_06112) continue;
            return i;
        }
        return -1;
    }

    private int IlIllllllIIlIIllllIIlIIIl(Item class_06112, int n) {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i] == null || this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll() != class_06112 || this.lllIIIllIIIIlllIlIIllIIll[i].IllIIIllIIIIlIlIlIllIIlll() != n) continue;
            return i;
        }
        return -1;
    }

    private int lIlllIlllIIIIlIIlllIllIII(ItemStack class_08972) {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i] == null || this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll() != class_08972.lllIIIllIIIIlllIlIIllIIll() || !this.lllIIIllIIIIlllIlIIllIIll[i].IlIIIIIllllllIIlllIllllll() || this.lllIIIllIIIIlllIlIIllIIll[i].lllIlIIlIIIlIlIIIllIlllIl >= this.lllIIIllIIIIlllIlIIllIIll[i].lIlllIlllIIIIlIIlllIllIII() || this.lllIIIllIIIIlllIlIIllIIll[i].lllIlIIlIIIlIlIIIllIlllIl >= this.llIIlIlIlllIIllIlIlllIllI() || this.lllIIIllIIIIlllIlIIllIIll[i].IIIllIIlIIIIIIlIlIIllIIlI() && this.lllIIIllIIIIlllIlIIllIIll[i].IllIIIllIIIIlIlIlIllIIlll() != class_08972.IllIIIllIIIIlIlIlIllIIlll() || !ItemStack.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll[i], class_08972)) continue;
            return i;
        }
        return -1;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i] != null) continue;
            return i;
        }
        return -1;
    }

    public void lllIIIllIIIIlllIlIIllIIll(Item class_06112, int n, boolean bl, boolean bl2) {
        boolean bl3 = true;
        this.lIllllIIlIIIlIllllllIIIll = this.lllIIIllIIIIlllIlIIllIIll();
        int n2 = bl ? this.IlIllllllIIlIIllllIIlIIIl(class_06112, n) : this.IlIllllllIIlIIllllIIlIIIl(class_06112);
        if (n2 >= 0 && n2 < 9) {
            this.IlIllllllIIlIIllllIIlIIIl = n2;
        } else if (bl2 && class_06112 != null) {
            int n3 = this.IlIllllllIIlIIllllIIlIIIl();
            if (n3 >= 0 && n3 < 9) {
                this.IlIllllllIIlIIllllIIlIIIl = n3;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(class_06112, n);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        if (n > 0) {
            n = 1;
        }
        if (n < 0) {
            n = -1;
        }
        this.IlIllllllIIlIIllllIIlIIIl -= n;
        while (this.IlIllllllIIlIIllllIIlIIIl < 0) {
            this.IlIllllllIIlIIllllIIlIIIl += 9;
        }
        while (this.IlIllllllIIlIIllllIIlIIIl >= 9) {
            this.IlIllllllIIlIIllllIIlIIIl -= 9;
        }
    }

    public int lllIIIllIIIIlllIlIIllIIll(Item class_06112, int n) {
        ItemStack class_08972;
        int n2;
        int n3 = 0;
        for (n2 = 0; n2 < this.lllIIIllIIIIlllIlIIllIIll.length; ++n2) {
            class_08972 = this.lllIIIllIIIIlllIlIIllIIll[n2];
            if (class_08972 == null || class_06112 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() != class_06112 || n > -1 && class_08972.IllIIIllIIIIlIlIlIllIIlll() != n) continue;
            n3 += class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            this.lllIIIllIIIIlllIlIIllIIll[n2] = null;
        }
        for (n2 = 0; n2 < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++n2) {
            class_08972 = this.lllIlIIlIIIlIlIIIllIlllIl[n2];
            if (class_08972 == null || class_06112 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() != class_06112 || n > -1 && class_08972.IllIIIllIIIIlIlIlIllIIlll() != n) continue;
            n3 += class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            this.lllIlIIlIIIlIlIIIllIlllIl[n2] = null;
        }
        if (this.IIIllIIlIIIIIIlIlIIllIIlI != null) {
            if (class_06112 != null && this.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll() != class_06112) {
                return n3;
            }
            if (n > -1 && this.IIIllIIlIIIIIIlIlIIllIIlI.IllIIIllIIIIlIlIlIllIIlll() != n) {
                return n3;
            }
            n3 += this.IIIllIIlIIIIIIlIlIIllIIlI.lllIlIIlIIIlIlIIIllIlllIl;
            this.lllIlIIlIIIlIlIIIllIlllIl((ItemStack)null);
        }
        return n3;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(Item class_06112, int n) {
        if (class_06112 != null) {
            if (this.lIllllIIlIIIlIllllllIIIll != null && this.lIllllIIlIIIlIllllllIIIll.llIIlIllIllllIlIIIIlIIlll() && this.IlIllllllIIlIIllllIIlIIIl(this.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll(), this.lIllllIIlIIIlIllllllIIIll.IIIllIllIIlIlIlIlIllllIIl()) == this.IlIllllllIIlIIllllIIlIIIl) {
                return;
            }
            int n2 = this.IlIllllllIIlIIllllIIlIIIl(class_06112, n);
            if (n2 >= 0) {
                int n3 = this.lllIIIllIIIIlllIlIIllIIll[n2].lllIlIIlIIIlIlIIIllIlllIl;
                this.lllIIIllIIIIlllIlIIllIIll[n2] = this.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl];
                this.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl] = new ItemStack(class_06112, n3, n);
            } else {
                this.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl] = new ItemStack(class_06112, 1, n);
            }
        }
    }

    private int IlIIIIIllllllIIlllIllllll(ItemStack class_08972) {
        Item class_06112 = class_08972.lllIIIllIIIIlllIlIIllIIll();
        int n = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
        if (class_08972.lIlllIlllIIIIlIIlllIllIII() == 1) {
            int n2 = this.IlIllllllIIlIIllllIIlIIIl();
            if (n2 < 0) {
                return n;
            }
            if (this.lllIIIllIIIIlllIlIIllIIll[n2] == null) {
                this.lllIIIllIIIIlllIlIIllIIll[n2] = ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_08972);
            }
            return 0;
        }
        int n3 = this.lIlllIlllIIIIlIIlllIllIII(class_08972);
        if (n3 < 0) {
            n3 = this.IlIllllllIIlIIllllIIlIIIl();
        }
        if (n3 < 0) {
            return n;
        }
        if (this.lllIIIllIIIIlllIlIIllIIll[n3] == null) {
            this.lllIIIllIIIIlllIlIIllIIll[n3] = new ItemStack(class_06112, 0, class_08972.IllIIIllIIIIlIlIlIllIIlll());
            if (class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                this.lllIIIllIIIIlllIlIIllIIll[n3].lIlllIlllIIIIlIIlllIllIII((class_0775)class_08972.lllllIlllIIllIlIIlIIIllII().lllIlIIlIIIlIlIIIllIlllIl());
            }
        }
        int n4 = n;
        if (n > this.lllIIIllIIIIlllIlIIllIIll[n3].lIlllIlllIIIIlIIlllIllIII() - this.lllIIIllIIIIlllIlIIllIIll[n3].lllIlIIlIIIlIlIIIllIlllIl) {
            n4 = this.lllIIIllIIIIlllIlIIllIIll[n3].lIlllIlllIIIIlIIlllIllIII() - this.lllIIIllIIIIlllIlIIllIIll[n3].lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (n4 > this.llIIlIlIlllIIllIlIlllIllI() - this.lllIIIllIIIIlllIlIIllIIll[n3].lllIlIIlIIIlIlIIIllIlllIl) {
            n4 = this.llIIlIlIlllIIllIlIlllIllI() - this.lllIIIllIIIIlllIlIIllIIll[n3].lllIlIIlIIIlIlIIIllIlllIl;
        }
        if (n4 == 0) {
            return n;
        }
        this.lllIIIllIIIIlllIlIIllIIll[n3].lllIlIIlIIIlIlIIIllIlllIl += n4;
        this.lllIIIllIIIIlllIlIIllIIll[n3].IlIllllllIIlIIllllIIlIIIl = 5;
        return n -= n4;
    }

    public void lIlllIlllIIIIlIIlllIllIII() {
        for (int i = 0; i < this.lllIIIllIIIIlllIlIIllIIll.length; ++i) {
            if (this.lllIIIllIIIIlllIlIIllIIll[i] == null) continue;
            this.lllIIIllIIIIlllIlIIllIIll[i].lllIIIllIIIIlllIlIIllIIll(this.lIlllIlllIIIIlIIlllIllIII.lIlIllIIlIIlIIlIIlIIlIIll, this.lIlllIlllIIIIlIIlllIllIII, i, this.IlIllllllIIlIIllllIIlIIIl == i);
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(Item class_06112) {
        int n = this.IlIllllllIIlIIllllIIlIIIl(class_06112);
        if (n < 0) {
            return false;
        }
        if (--this.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl <= 0) {
            this.lllIIIllIIIIlllIlIIllIIll[n] = null;
        }
        return true;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Item class_06112) {
        int n = this.IlIllllllIIlIIllllIIlIIIl(class_06112);
        return n >= 0;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl != 0 && class_08972.lllIIIllIIIIlllIlIIllIIll() != null) {
            try {
                int n;
                if (class_08972.IllIIlllllllIIlIIlIIIIlIl()) {
                    int n2 = this.IlIllllllIIlIIllllIIlIIIl();
                    if (n2 >= 0) {
                        this.lllIIIllIIIIlllIlIIllIIll[n2] = ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_08972);
                        this.lllIIIllIIIIlllIlIIllIIll[n2].IlIllllllIIlIIllllIIlIIIl = 5;
                        class_08972.lllIlIIlIIIlIlIIIllIlllIl = 0;
                        return true;
                    }
                    if (this.lIlllIlllIIIIlIIlllIllIII.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                        class_08972.lllIlIIlIIIlIlIIIllIlllIl = 0;
                        return true;
                    }
                    return false;
                }
                do {
                    n = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.IlIIIIIllllllIIlllIllllll(class_08972);
                } while (class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0 && class_08972.lllIlIIlIIIlIlIIIllIlllIl < n);
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl == n && this.lIlllIlllIIIIlIIlllIllIII.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl = 0;
                    return true;
                }
                return class_08972.lllIlIIlIIIlIlIIIllIlllIl < n;
            }
            catch (Throwable throwable) {
                CrashReport class_02232 = CrashReport.lllIIIllIIIIlllIlIIllIIll(throwable, "Adding item to inventory");
                class_0799 class_07992 = class_02232.lllIIIllIIIIlllIlIIllIIll("Item being added");
                class_07992.lllIIIllIIIIlllIlIIllIIll("Item ID", Item.lllIIIllIIIIlllIlIIllIIll(class_08972.lllIIIllIIIIlllIlIIllIIll()));
                class_07992.lllIIIllIIIIlllIlIIllIIll("Item data", class_08972.IllIIIllIIIIlIlIlIllIIlll());
                class_07992.addCrashSectionCallable("Item name", new class_0970(this, class_08972));
                throw new class_0892(class_02232);
            }
        }
        return false;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        ItemStack[] arrclass_0897 = this.lllIIIllIIIIlllIlIIllIIll;
        if (n >= this.lllIIIllIIIIlllIlIIllIIll.length) {
            arrclass_0897 = this.lllIlIIlIIIlIlIIIllIlllIl;
            n -= this.lllIIIllIIIIlllIlIIllIIll.length;
        }
        if (arrclass_0897[n] != null) {
            if (arrclass_0897[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = arrclass_0897[n];
                arrclass_0897[n] = null;
                return class_08972;
            }
            ItemStack class_08973 = arrclass_0897[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (arrclass_0897[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                arrclass_0897[n] = null;
            }
            return class_08973;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        ItemStack[] arrclass_0897 = this.lllIIIllIIIIlllIlIIllIIll;
        if (n >= this.lllIIIllIIIIlllIlIIllIIll.length) {
            arrclass_0897 = this.lllIlIIlIIIlIlIIIllIlllIl;
            n -= this.lllIIIllIIIIlllIlIIllIIll.length;
        }
        if (arrclass_0897[n] != null) {
            ItemStack class_08972 = arrclass_0897[n];
            arrclass_0897[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        ItemStack[] arrclass_0897 = this.lllIIIllIIIIlllIlIIllIIll;
        if (n >= arrclass_0897.length) {
            n -= arrclass_0897.length;
            arrclass_0897 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        arrclass_0897[n] = class_08972;
    }

    public float lllIIIllIIIIlllIlIIllIIll(Block class_05492) {
        float f = 1.0f;
        if (this.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl] != null) {
            f *= this.lllIIIllIIIIlllIlIIllIIll[this.IlIllllllIIlIIllllIIlIIIl].lllIIIllIIIIlllIlIIllIIll(class_05492);
        }
        return f;
    }

    public class_2145 lllIIIllIIIIlllIlIIllIIll(class_2145 class_21452) {
        class_0775 class_07752;
        int n;
        for (n = 0; n < this.lllIIIllIIIIlllIlIIllIIll.length; ++n) {
            if (this.lllIIIllIIIIlllIlIIllIIll[n] == null) continue;
            class_07752 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)n);
            this.lllIIIllIIIIlllIlIIllIIll[n].lllIlIIlIIIlIlIIIllIlllIl(class_07752);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
        }
        for (n = 0; n < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++n) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl[n] == null) continue;
            class_07752 = new class_0775();
            class_07752.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)(n + 100));
            this.lllIlIIlIIIlIlIIIllIlllIl[n].lllIlIIlIIIlIlIIIllIlllIl(class_07752);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07752);
        }
        return class_21452;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_2145 class_21452) {
        this.lllIIIllIIIIlllIlIIllIIll = new ItemStack[36];
        this.lllIlIIlIIIlIlIIIllIlllIl = new ItemStack[4];
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07752 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            int n = class_07752.lIlllIlllIIIIlIIlllIllIII("Slot") & 0xFF;
            ItemStack class_08972 = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07752);
            if (class_08972 == null) continue;
            if (n >= 0 && n < this.lllIIIllIIIIlllIlIIllIIll.length) {
                this.lllIIIllIIIIlllIlIIllIIll[n] = class_08972;
            }
            if (n < 100 || n >= this.lllIlIIlIIIlIlIIIllIlllIl.length + 100) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl[n - 100] = class_08972;
        }
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.lllIIIllIIIIlllIlIIllIIll.length + 4;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        ItemStack[] arrclass_0897 = this.lllIIIllIIIIlllIlIIllIIll;
        if (n >= arrclass_0897.length) {
            n -= arrclass_0897.length;
            arrclass_0897 = this.lllIlIIlIIIlIlIIIllIlllIl;
        }
        return arrclass_0897[n];
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return "container.inventory";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return false;
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
    }

    public boolean lllIlIIlIIIlIlIIIllIlllIl(Block class_05492) {
        if (class_05492.lIllllIIlIIIlIllllllIIIll().lIIIIlIlIIlllllIIllIIlIII()) {
            return true;
        }
        ItemStack class_08972 = this.llIIllIllIlIIlIIllIllllll(this.IlIllllllIIlIIllllIIlIIIl);
        return class_08972 != null ? class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_05492) : false;
    }

    public ItemStack lllIlIIlIIIlIlIIIllIlllIl(int n) {
        return this.lllIlIIlIIIlIlIIIllIlllIl[n];
    }

    public int lIllllIIlIIIlIllllllIIIll() {
        int n = 0;
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl[i] == null || !(this.lllIlIIlIIIlIlIIIllIlllIl[i].lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor)) continue;
            int n2 = ((ItemArmor)this.lllIlIIlIIIlIlIIIllIlllIl[i].lllIIIllIIIIlllIlIIllIIll()).lIIIIlIlIIlllllIIllIIlIII;
            n += n2;
        }
        return n;
    }

    public void lllIIIllIIIIlllIlIIllIIll(float f) {
        if ((f /= 4.0f) < 1.0f) {
            f = 1.0f;
        }
        for (int i = 0; i < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++i) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl[i] == null || !(this.lllIlIIlIIIlIlIIIllIlllIl[i].lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor)) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl[i].lllIIIllIIIIlllIlIIllIIll((int)f, (class_1965)this.lIlllIlllIIIIlIIlllIllIII);
            if (this.lllIlIIlIIIlIlIIIllIlllIl[i].lllIlIIlIIIlIlIIIllIlllIl != 0) continue;
            this.lllIlIIlIIIlIlIIIllIlllIl[i] = null;
        }
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI() {
        if (Minecraft.getMinecraft().isIntegratedServerRunning()) {
            int n;
            for (n = 0; n < this.lllIIIllIIIIlllIlIIllIIll.length; ++n) {
                if (this.lllIIIllIIIIlllIlIIllIIll[n] == null) continue;
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIIIllIIIIlllIlIIllIIll[n], true, false);
                this.lllIIIllIIIIlllIlIIllIIll[n] = null;
            }
            for (n = 0; n < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++n) {
                if (this.lllIlIIlIIIlIlIIIllIlllIl[n] == null) continue;
                this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl[n], true, false);
                this.lllIlIIlIIIlIlIIIllIlllIl[n] = null;
            }
        }
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
        this.IlIIIIIllllllIIlllIllllll = true;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(ItemStack class_08972) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_08972;
    }

    public ItemStack IllIIlllllllIIlIIlIIIIlIl() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return this.lIlllIlllIIIIlIIlllIllIII.IllllIIIIlIIlIIIIlllIIIIl ? false : class_08142.IlIIIIIllllllIIlllIllllll((class_1521)this.lIlllIlllIIIIlIIlllIllIII) <= 64.0;
    }

    public boolean IlIllllllIIlIIllllIIlIIIl(ItemStack class_08972) {
        int n;
        for (n = 0; n < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++n) {
            if (this.lllIlIIlIIIlIlIIIllIlllIl[n] == null || !this.lllIlIIlIIIlIlIIIllIlllIl[n].lllIIIllIIIIlllIlIIllIIll(class_08972)) continue;
            return true;
        }
        for (n = 0; n < this.lllIIIllIIIIlllIlIIllIIll.length; ++n) {
            if (this.lllIIIllIIIIlllIlIIllIIll[n] == null || !this.lllIIIllIIIIlllIlIIllIIll[n].lllIIIllIIIIlllIlIIllIIll(class_08972)) continue;
            return true;
        }
        return false;
    }

    @Override
    public void llIllllIlIllIIIlIllIIlIlI() {
    }

    @Override
    public void lIlllIlllIlIIIIlllIlIlIIl() {
    }

    @Override
    public boolean IlIllllllIIlIIllllIIlIIIl(int n, ItemStack class_08972) {
        return true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_0503 class_05032) {
        int n;
        for (n = 0; n < this.lllIIIllIIIIlllIlIIllIIll.length; ++n) {
            this.lllIIIllIIIIlllIlIIllIIll[n] = ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_05032.lllIIIllIIIIlllIlIIllIIll[n]);
        }
        for (n = 0; n < this.lllIlIIlIIIlIlIIIllIlllIl.length; ++n) {
            this.lllIlIIlIIIlIlIIIllIlllIl[n] = ItemStack.lllIlIIlIIIlIlIIIllIlllIl(class_05032.lllIlIIlIIIlIlIIIllIlllIl[n]);
        }
        this.IlIllllllIIlIIllllIIlIIIl = class_05032.IlIllllllIIlIIllllIIlIIIl;
    }
}

