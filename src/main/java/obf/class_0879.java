package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;

public class class_0879
extends class_1774
implements class_1212 {
    private ItemStack[] IllIIlllllllIIlIIlIIIIlIl = new ItemStack[5];
    private String IIIllIllIIlIlIlIlIllllIIl;
    private int IllIIIllIIIIlIlIlIllIIlll = -1;

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        class_2145 class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("net.minecraft.init.Items", 10);
        this.IllIIlllllllIIlIIlIIIIlIl = new ItemStack[this.IlIIIIIllllllIIlllIllllll()];
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8)) {
            this.IIIllIllIIlIlIlIlIllllIIl = class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName");
        }
        this.IllIIIllIIIIlIlIlIllIIlll = class_07752.lIllllIIlIIIlIllllllIIIll("TransferCooldown");
        for (int i = 0; i < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++i) {
            class_0775 class_07753 = class_21452.lllIlIIlIIIlIlIIIllIlllIl(i);
            byte by = class_07753.lIlllIlllIIIIlIIlllIllIII("Slot");
            if (by < 0 || by >= this.IllIIlllllllIIlIIlIIIIlIl.length) continue;
            this.IllIIlllllllIIlIIlIIIIlIl[by] = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.IllIIlllllllIIlIIlIIIIlIl.length; ++i) {
            if (this.IllIIlllllllIIlIIlIIIIlIl[i] == null) continue;
            class_0775 class_07753 = new class_0775();
            class_07753.lllIIIllIIIIlllIlIIllIIll("Slot", (byte)i);
            this.IllIIlllllllIIlIIlIIIIlIl[i].lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("net.minecraft.init.Items", class_21452);
        class_07752.lllIIIllIIIIlllIlIIllIIll("TransferCooldown", this.IllIIIllIIIIlIlIlIllIIlll);
        if (this.IIlllIlIlllIllIIIlllIIlIl()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.IIIllIllIIlIlIlIlIllllIIl);
        }
    }

    @Override
    public void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return this.IllIIlllllllIIlIIlIIIIlIl.length;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return this.IllIIlllllllIIlIIlIIIIlIl[n];
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (this.IllIIlllllllIIlIIlIIIIlIl[n] != null) {
            if (this.IllIIlllllllIIlIIlIIIIlIl[n].lllIlIIlIIIlIlIIIllIlllIl <= n2) {
                ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl[n];
                this.IllIIlllllllIIlIIlIIIIlIl[n] = null;
                return class_08972;
            }
            ItemStack class_08973 = this.IllIIlllllllIIlIIlIIIIlIl[n].lllIIIllIIIIlllIlIIllIIll(n2);
            if (this.IllIIlllllllIIlIIlIIIIlIl[n].lllIlIIlIIIlIlIIIllIlllIl == 0) {
                this.IllIIlllllllIIlIIlIIIIlIl[n] = null;
            }
            return class_08973;
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (this.IllIIlllllllIIlIIlIIIIlIl[n] != null) {
            ItemStack class_08972 = this.IllIIlllllllIIlIIlIIIIlIl[n];
            this.IllIIlllllllIIlIIlIIIIlIl[n] = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        this.IllIIlllllllIIlIIlIIIIlIl[n] = class_08972;
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > this.llIIlIlIlllIIllIlIlllIllI()) {
            class_08972.lllIlIIlIIIlIlIIIllIlllIl = this.llIIlIlIlllIIllIlIlllIllI();
        }
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl() ? this.IIIllIllIIlIlIlIlIllllIIl : "container.hopper";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IIIllIllIIlIlIlIlIllllIIl != null && this.IIIllIllIIlIlIlIlIllllIIl.length() > 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IIIllIllIIlIlIlIlIllllIIl = string;
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 64;
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
        return true;
    }

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl) {
            --this.IllIIIllIIIIlIlIlIllIIlll;
            if (!this.lllIIlIIIllllllIIIIlIlIlI()) {
                this.lllIIIllIIIIlllIlIIllIIll(0);
                this.lllIIIllIIIIlllIlIIllIIll();
            }
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll() {
        if (this.lllIIIllIIIIlllIlIIllIIll != null && !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl) {
            if (!this.lllIIlIIIllllllIIIIlIlIlI() && class_1700.IIIllIllIIlIlIlIlIllllIIl(this.lIlllIlllIIIIlIIlllIllIII())) {
                boolean bl = false;
                if (!this.IlIlllIIIIIIlIIllIIllIlll()) {
                    bl = this.lllllIlllIIllIlIIlIIIllII();
                }
                if (!this.IlIlIIlIlIllIIlIlIIllIIIl()) {
                    boolean bl2 = bl = class_0879.lllIIIllIIIIlllIlIIllIIll(this) || bl;
                }
                if (bl) {
                    this.lllIIIllIIIIlllIlIIllIIll(8);
                    this.llIIlIllIllllIlIIIIlIIlll();
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    private boolean IlIlllIIIIIIlIIllIIllIlll() {
        for (ItemStack class_08972 : this.IllIIlllllllIIlIIlIIIIlIl) {
            if (class_08972 == null) continue;
            return false;
        }
        return true;
    }

    private boolean IlIlIIlIlIllIIlIlIIllIIIl() {
        for (ItemStack class_08972 : this.IllIIlllllllIIlIIlIIIIlIl) {
            if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl == class_08972.lIlllIlllIIIIlIIlllIllIII()) continue;
            return false;
        }
        return true;
    }

    private boolean lllllIlllIIllIlIIlIIIllII() {
        class_0850 class_08502 = this.IlIlIIlllIIlIllIIIlllllIl();
        if (class_08502 == null) {
            return false;
        }
        int n = class_0573.lllIIIllIIIIlllIlIIllIIll[class_1700.IllIIlllllllIIlIIlIIIIlIl(this.lIlllIlllIIIIlIIlllIllIII())];
        if (this.lllIIIllIIIIlllIlIIllIIll(class_08502, n)) {
            return false;
        }
        for (int i = 0; i < this.IlIIIIIllllllIIlllIllllll(); ++i) {
            if (this.llIIllIllIlIIlIIllIllllll(i) == null) continue;
            ItemStack class_08972 = this.llIIllIllIlIIlIIllIllllll(i).llIIlllIllIllllIIIlIIIIII();
            ItemStack class_08973 = class_0879.lllIIIllIIIIlllIlIIllIIll(class_08502, this.lllIIIllIIIIlllIlIIllIIll(i, 1), n);
            if (class_08973 == null || class_08973.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_08502.llIIlIllIllllIlIIIIlIIlll();
                return true;
            }
            this.lllIlIIlIIIlIlIIIllIlllIl(i, class_08972);
        }
        return false;
    }

    private boolean lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502, int n) {
        if (class_08502 instanceof class_0147 && n > -1) {
            class_0147 class_01472 = (class_0147)class_08502;
            int[] arrn = class_01472.lllIIIllIIIIlllIlIIllIIll(n);
            for (int i = 0; i < arrn.length; ++i) {
                ItemStack class_08972 = class_01472.llIIllIllIlIIlIIllIllllll(arrn[i]);
                if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl == class_08972.lIlllIlllIIIIlIIlllIllIII()) continue;
                return false;
            }
        } else {
            int n2 = class_08502.IlIIIIIllllllIIlllIllllll();
            for (int i = 0; i < n2; ++i) {
                ItemStack class_08973 = class_08502.llIIllIllIlIIlIIllIllllll(i);
                if (class_08973 != null && class_08973.lllIlIIlIIIlIlIIIllIlllIl == class_08973.lIlllIlllIIIIlIIlllIllIII()) continue;
                return false;
            }
        }
        return true;
    }

    private static boolean lllIlIIlIIIlIlIIIllIlllIl(class_0850 class_08502, int n) {
        if (class_08502 instanceof class_0147 && n > -1) {
            class_0147 class_01472 = (class_0147)class_08502;
            int[] arrn = class_01472.lllIIIllIIIIlllIlIIllIIll(n);
            for (int i = 0; i < arrn.length; ++i) {
                if (class_01472.llIIllIllIlIIlIIllIllllll(arrn[i]) == null) continue;
                return false;
            }
        } else {
            int n2 = class_08502.IlIIIIIllllllIIlllIllllll();
            for (int i = 0; i < n2; ++i) {
                if (class_08502.llIIllIllIlIIlIIllIllllll(i) == null) continue;
                return false;
            }
        }
        return true;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_1212 class_12122) {
        class_0850 class_08502 = class_0879.lllIlIIlIIIlIlIIIllIlllIl(class_12122);
        if (class_08502 != null) {
            int n = 0;
            if (class_0879.lllIlIIlIIIlIlIIIllIlllIl(class_08502, n)) {
                return false;
            }
            if (class_08502 instanceof class_0147 && n > -1) {
                class_0147 class_01472 = (class_0147)class_08502;
                int[] arrn = class_01472.lllIIIllIIIIlllIlIIllIIll(n);
                for (int i = 0; i < arrn.length; ++i) {
                    if (!class_0879.lllIIIllIIIIlllIlIIllIIll(class_12122, class_08502, arrn[i], n)) continue;
                    return true;
                }
            } else {
                int n2 = class_08502.IlIIIIIllllllIIlllIllllll();
                for (int i = 0; i < n2; ++i) {
                    if (!class_0879.lllIIIllIIIIlllIlIIllIIll(class_12122, class_08502, i, n)) continue;
                    return true;
                }
            }
        } else {
            class_1781 class_17812 = class_0879.lllIIIllIIIIlllIlIIllIIll(class_12122.IIIIIIIIlIllIIllIIlllIllI(), class_12122.llIIIlllIlllIlIllIIIIllIl(), class_12122.IIIIlIllIlIIlIIlIllIlIlll() + 1.0, class_12122.IlIlIIlllIllllllllIIIlIlI());
            if (class_17812 != null) {
                return class_0879.lllIIIllIIIIlllIlIIllIIll(class_12122, class_17812);
            }
        }
        return false;
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll(class_1212 class_12122, class_0850 class_08502, int n, int n2) {
        ItemStack class_08972 = class_08502.llIIllIllIlIIlIIllIllllll(n);
        if (class_08972 != null && class_0879.lllIlIIlIIIlIlIIIllIlllIl(class_08502, class_08972, n, n2)) {
            ItemStack class_08973 = class_08972.llIIlllIllIllllIIIlIIIIII();
            ItemStack class_08974 = class_0879.lllIIIllIIIIlllIlIIllIIll(class_12122, class_08502.lllIIIllIIIIlllIlIIllIIll(n, 1), -1);
            if (class_08974 == null || class_08974.lllIlIIlIIIlIlIIIllIlllIl == 0) {
                class_08502.llIIlIllIllllIlIIIIlIIlll();
                return true;
            }
            class_08502.lllIlIIlIIIlIlIIIllIlllIl(n, class_08973);
        }
        return false;
    }

    public static boolean lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502, class_1781 class_17812) {
        boolean bl = false;
        if (class_17812 == null) {
            return false;
        }
        ItemStack class_08972 = class_17812.lIlllIlllIIIIlIIlllIllIII().llIIlllIllIllllIIIlIIIIII();
        ItemStack class_08973 = class_0879.lllIIIllIIIIlllIlIIllIIll(class_08502, class_08972, -1);
        if (class_08973 != null && class_08973.lllIlIIlIIIlIlIIIllIlllIl != 0) {
            class_17812.lllIIIllIIIIlllIlIIllIIll(class_08973);
        } else {
            bl = true;
            class_17812.IIIIlIIlIIIllIIIIllIIIlII();
        }
        return bl;
    }

    public static ItemStack lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502, ItemStack class_08972, int n) {
        if (class_08502 instanceof class_0147 && n > -1) {
            class_0147 class_01472 = (class_0147)class_08502;
            int[] arrn = class_01472.lllIIIllIIIIlllIlIIllIIll(n);
            for (int i = 0; i < arrn.length && class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0; ++i) {
                class_08972 = class_0879.IlIllllllIIlIIllllIIlIIIl(class_08502, class_08972, arrn[i], n);
            }
        } else {
            int n2 = class_08502.IlIIIIIllllllIIlllIllllll();
            for (int i = 0; i < n2 && class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl > 0; ++i) {
                class_08972 = class_0879.IlIllllllIIlIIllllIIlIIIl(class_08502, class_08972, i, n);
            }
        }
        if (class_08972 != null && class_08972.lllIlIIlIIIlIlIIIllIlllIl == 0) {
            class_08972 = null;
        }
        return class_08972;
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll(class_0850 class_08502, ItemStack class_08972, int n, int n2) {
        return !class_08502.IlIllllllIIlIIllllIIlIIIl(n, class_08972) ? false : !(class_08502 instanceof class_0147) || ((class_0147)class_08502).lllIIIllIIIIlllIlIIllIIll(n, class_08972, n2);
    }

    private static boolean lllIlIIlIIIlIlIIIllIlllIl(class_0850 class_08502, ItemStack class_08972, int n, int n2) {
        return !(class_08502 instanceof class_0147) || ((class_0147)class_08502).lllIlIIlIIIlIlIIIllIlllIl(n, class_08972, n2);
    }

    private static ItemStack IlIllllllIIlIIllllIIlIIIl(class_0850 class_08502, ItemStack class_08972, int n, int n2) {
        ItemStack class_08973 = class_08502.llIIllIllIlIIlIIllIllllll(n);
        if (class_0879.lllIIIllIIIIlllIlIIllIIll(class_08502, class_08972, n, n2)) {
            boolean bl = false;
            if (class_08973 == null) {
                class_08502.lllIlIIlIIIlIlIIIllIlllIl(n, class_08972);
                class_08972 = null;
                bl = true;
            } else if (class_0879.lllIIIllIIIIlllIlIIllIIll(class_08973, class_08972)) {
                int n3 = class_08972.lIlllIlllIIIIlIIlllIllIII() - class_08973.lllIlIIlIIIlIlIIIllIlllIl;
                int n4 = Math.min(class_08972.lllIlIIlIIIlIlIIIllIlllIl, n3);
                class_08972.lllIlIIlIIIlIlIIIllIlllIl -= n4;
                class_08973.lllIlIIlIIIlIlIIIllIlllIl += n4;
                boolean bl2 = bl = n4 > 0;
            }
            if (bl) {
                if (class_08502 instanceof class_0879) {
                    ((class_0879)class_08502).lllIIIllIIIIlllIlIIllIIll(8);
                    class_08502.llIIlIllIllllIlIIIIlIIlll();
                }
                class_08502.llIIlIllIllllIlIIIIlIIlll();
            }
        }
        return class_08972;
    }

    private class_0850 IlIlIIlllIIlIllIIIlllllIl() {
        int n = class_1700.IllIIlllllllIIlIIlIIIIlIl(this.lIlllIlllIIIIlIIlllIllIII());
        return class_0879.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIIIIIlIllIIllIIlllIllI(), this.lllIlIIlIIIlIlIIIllIlllIl + class_0573.lllIlIIlIIIlIlIIIllIlllIl[n], (double)(this.IlIllllllIIlIIllllIIlIIIl + class_0573.IlIllllllIIlIIllllIIlIIIl[n]), (double)(this.lIlllIlllIIIIlIIlllIllIII + class_0573.lIlllIlllIIIIlIIlllIllIII[n]));
    }

    public static class_0850 lllIlIIlIIIlIlIIIllIlllIl(class_1212 class_12122) {
        return class_0879.lllIlIIlIIIlIlIIIllIlllIl(class_12122.IIIIIIIIlIllIIllIIlllIllI(), class_12122.llIIIlllIlllIlIllIIIIllIl(), class_12122.IIIIlIllIlIIlIIlIllIlIlll() + 1.0, class_12122.IlIlIIlllIllllllllIIIlIlI());
    }

    public static class_1781 lllIIIllIIIIlllIlIIllIIll(class_1334 class_13342, double d, double d2, double d3) {
        List list = class_13342.lllIIIllIIIIlllIlIIllIIll(class_1781.class, class_1974.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), class_0830.lllIIIllIIIIlllIlIIllIIll);
        return list.size() > 0 ? (class_1781)list.get(0) : null;
    }

    public static class_0850 lllIlIIlIIIlIlIIIllIlllIl(class_1334 class_13342, double d, double d2, double d3) {
        Object object;
        int n;
        int n2;
        class_0850 class_08502 = null;
        int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d);
        class_1774 class_17742 = class_13342.lllIlIIlIIIlIlIIIllIlllIl(n3, n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(d2), n = MathHelper.IlIllllllIIlIIllllIIlIIIl(d3));
        if (class_17742 != null && class_17742 instanceof class_0850 && (class_08502 = (class_0850)((Object)class_17742)) instanceof class_0071 && (object = class_13342.a_(n3, n2, n)) instanceof class_1041) {
            class_08502 = ((class_1041)object).lIIIIlIlIIlllllIIllIIlIII(class_13342, n3, n2, n);
        }
        if (class_08502 == null && (object = class_13342.lllIIIllIIIIlllIlIIllIIll((class_1521)null, class_1974.lllIIIllIIIIlllIlIIllIIll(d, d2, d3, d + 1.0, d2 + 1.0, d3 + 1.0), class_0830.IlIllllllIIlIIllllIIlIIIl)) != null && object.size() > 0) {
            class_08502 = (class_0850)object.get(class_13342.lllllIlllIIllIlIIlIIIllII.nextInt(object.size()));
        }
        return class_08502;
    }

    private static boolean lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972, ItemStack class_08973) {
        return class_08972.lllIIIllIIIIlllIlIIllIIll() != class_08973.lllIIIllIIIIlllIlIIllIIll() ? false : (class_08972.IllIIIllIIIIlIlIlIllIIlll() != class_08973.IllIIIllIIIIlIlIlIllIIlll() ? false : (class_08972.lllIlIIlIIIlIlIIIllIlllIl > class_08972.lIlllIlllIIIIlIIlllIllIII() ? false : ItemStack.lllIIIllIIIIlllIlIIllIIll(class_08972, class_08973)));
    }

    @Override
    public double llIIIlllIlllIlIllIIIIllIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    public double IIIIlIllIlIIlIIlIllIlIlll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    @Override
    public double IlIlIIlllIllllllllIIIlIlI() {
        return this.lIlllIlllIIIIlIIlllIllIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.IllIIIllIIIIlIlIlIllIIlll = n;
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.IllIIIllIIIIlIlIlIllIIlll > 0;
    }
}

