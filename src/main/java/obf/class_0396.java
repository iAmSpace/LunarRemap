package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.ItemStack;

import java.util.List;

public class class_0396
extends class_1774
implements class_0850 {
    public static final class_0700[][] IllIIlllllllIIlIIlIIIIlIl = new class_0700[][]{{class_0700.IlIllllllIIlIIllllIIlIIIl, class_0700.IlIIIIIllllllIIlllIllllll}, {class_0700.llIIllIllIlIIlIIllIllllll, class_0700.IllIIIllIIIIlIlIlIllIIlll}, {class_0700.IIIllIIlIIIIIIlIlIIllIIlI}, {class_0700.llIIlllIllIllllIIIlIIIIII}};
    private long IIIllIllIIlIlIlIlIllllIIl;
    private float IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    private int llIIlllIllIllllIIIlIIIIII = -1;
    private int llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI;
    private ItemStack IlIlllIIIIIIlIIllIIllIlll;
    private String IlIlIIlIlIllIIlIlIIllIIIl;

    @Override
    public void IlIllllllIIlIIllllIIlIIIl() {
        if (this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll() % 80L == 0L) {
            this.IlIlIIlllIIlIllIIIlllllIl();
            this.lllllIlllIIllIlIIlIIIllII();
        }
    }

    private void lllllIlllIIllIlIIlIIIllII() {
        if (this.lIIIIlIlIIlllllIIllIIlIII && this.llIIlllIllIllllIIIlIIIIII > 0 && !this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl && this.llIIllIllIlIIlIIllIllllll > 0) {
            double d = this.llIIlllIllIllllIIIlIIIIII * 10 + 10;
            int n = 0;
            if (this.llIIlllIllIllllIIIlIIIIII >= 4 && this.llIIllIllIlIIlIIllIllllll == this.lllIIlIIIllllllIIIIlIlIlI) {
                n = 1;
            }
            class_1974 class_19742 = class_1974.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.lllIlIIlIIIlIlIIIllIlllIl + 1, this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII + 1).lllIlIIlIIIlIlIIIllIlllIl(d, d, d);
            class_19742.IlIIIIIllllllIIlllIllllll = this.lllIIIllIIIIlllIlIIllIIll.lIlllIlllIIIIlIIlllIllIII();
            List list = this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_0814.class, class_19742);
            for (class_0814 class_08142 : list) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(this.llIIllIllIlIIlIIllIllllll, 180, n, true));
            }
            if (this.llIIlllIllIllllIIIlIIIIII >= 4 && this.llIIllIllIlIIlIIllIllllll != this.lllIIlIIIllllllIIIIlIlIlI && this.lllIIlIIIllllllIIIIlIlIlI > 0) {
                for (class_0814 class_08142 : list) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(new class_1852(this.lllIIlIIIllllllIIIIlIlIlI, 180, 0, true));
                }
            }
        }
    }

    private void IlIlIIlllIIlIllIIIlllllIl() {
        int n = this.llIIlllIllIllllIIIlIIIIII;
        if (!this.lllIIIllIIIIlllIlIIllIIll.IllIIlllllllIIlIIlIIIIlIl(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl + 1, this.lIlllIlllIIIIlIIlllIllIII)) {
            this.lIIIIlIlIIlllllIIllIIlIII = false;
            this.llIIlllIllIllllIIIlIIIIII = 0;
        } else {
            int n2;
            this.lIIIIlIlIIlllllIIllIIlIII = true;
            this.llIIlllIllIllllIIIlIIIIII = 0;
            int n3 = 1;
            while (n3 <= 4 && (n2 = this.IlIllllllIIlIIllllIIlIIIl - n3) >= 0) {
                boolean bl = true;
                block1: for (int i = this.lllIlIIlIIIlIlIIIllIlllIl - n3; i <= this.lllIlIIlIIIlIlIIIllIlllIl + n3 && bl; ++i) {
                    for (int j = this.lIlllIlllIIIIlIIlllIllIII - n3; j <= this.lIlllIlllIIIIlIIlllIllIII + n3; ++j) {
                        Block class_05492 = this.lllIIIllIIIIlllIlIIllIIll.a_(i, n2, j);
                        if (class_05492 == Blocks.lIlIlllIllllIIlllIlllIIIl || class_05492 == Blocks.lIlIlIIIIIIlIIllllIlIIllI || class_05492 == Blocks.IlllIIlllllllIIllIlIllllI || class_05492 == Blocks.IllllIIIIlIIlIIIIlllIIIIl) continue;
                        bl = false;
                        continue block1;
                    }
                }
                if (!bl) break;
                this.llIIlllIllIllllIIIlIIIIII = n3++;
            }
            if (this.llIIlllIllIllllIIIlIIIIII == 0) {
                this.lIIIIlIlIIlllllIIllIIlIII = false;
            }
        }
        if (!this.lllIIIllIIIIlllIlIIllIIll.IllIIIIllIIllIllIlllIlIIl && this.llIIlllIllIllllIIIlIIIIII == 4 && n < this.llIIlllIllIllllIIIlIIIIII) {
            for (class_0814 class_08142 : this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll(class_0814.class, class_1974.lllIIIllIIIIlllIlIIllIIll(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl - 4, this.lIlllIlllIIIIlIIlllIllIII).lllIlIIlIIIlIlIIIllIlllIl(10.0, 5.0, 10.0))) {
                class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150965_K);
            }
        }
    }

    public float lllIIIllIIIIlllIlIIllIIll() {
        if (!this.lIIIIlIlIIlllllIIllIIlIII) {
            return 0.0f;
        }
        int n = (int)(this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll() - this.IIIllIllIIlIlIlIlIllllIIl);
        this.IIIllIllIIlIlIlIlIllllIIl = this.lllIIIllIIIIlllIlIIllIIll.IlIIIlIIIIllIIIllIIIIIIll();
        if (n > 1) {
            this.IllIIIllIIIIlIlIlIllIIlll -= (float)n / 40.0f;
            if (this.IllIIIllIIIIlIlIlIllIIlll < 0.0f) {
                this.IllIIIllIIIIlIlIlIllIIlll = 0.0f;
            }
        }
        this.IllIIIllIIIIlIlIlIllIIlll += 0.025f;
        if (this.IllIIIllIIIIlIlIlIllIIlll > 1.0f) {
            this.IllIIIllIIIIlIlIlIllIIlll = 1.0f;
        }
        return this.IllIIIllIIIIlIlIlIllIIlll;
    }

    public int lllIIlIIIllllllIIIIlIlIlI() {
        return this.llIIllIllIlIIlIIllIllllll;
    }

    public int IlIlllIIIIIIlIIllIIllIlll() {
        return this.lllIIlIIIllllllIIIIlIlIlI;
    }

    public int IlIlIIlIlIllIIlIlIIllIIIl() {
        return this.llIIlllIllIllllIIIlIIIIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.llIIlllIllIllllIIIlIIIIII = n;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(int n) {
        this.llIIllIllIlIIlIIllIllllll = 0;
        for (int i = 0; i < this.llIIlllIllIllllIIIlIIIIII && i < 3; ++i) {
            for (class_0700 class_07002 : IllIIlllllllIIlIIlIIIIlIl[i]) {
                if (class_07002.IlIlIIlllIllllllllIIIlIlI != n) continue;
                this.llIIllIllIlIIlIIllIllllll = n;
                return;
            }
        }
    }

    public void IlIllllllIIlIIllllIIlIIIl(int n) {
        this.lllIIlIIIllllllIIIIlIlIlI = 0;
        if (this.llIIlllIllIllllIIIlIIIIII >= 4) {
            for (int i = 0; i < 4; ++i) {
                for (class_0700 class_07002 : IllIIlllllllIIlIIlIIIIlIl[i]) {
                    if (class_07002.IlIlIIlllIllllllllIIIlIlI != n) continue;
                    this.lllIIlIIIllllllIIIIlIlIlI = n;
                    return;
                }
            }
        }
    }

    @Override
    public class_0703 IllIIlllllllIIlIIlIIIIlIl() {
        class_0775 class_07752 = new class_0775();
        this.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        return new class_1180(this.lllIlIIlIIIlIlIIIllIlllIl, this.IlIllllllIIlIIllllIIlIIIl, this.lIlllIlllIIIIlIIlllIllIII, 3, class_07752);
    }

    @Override
    public double lIllllIIlIIIlIllllllIIIll() {
        return 65536.0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.llIIllIllIlIIlIIllIllllll = class_07752.lIllllIIlIIIlIllllllIIIll("Primary");
        this.lllIIlIIIllllllIIIIlIlIlI = class_07752.lIllllIIlIIIlIllllllIIIll("Secondary");
        this.llIIlllIllIllllIIIlIIIIII = class_07752.lIllllIIlIIIlIllllllIIIll("Levels");
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Primary", this.llIIllIllIlIIlIIllIllllll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Secondary", this.lllIIlIIIllllllIIIIlIlIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Levels", this.llIIlllIllIllllIIIlIIIIII);
    }

    @Override
    public int IlIIIIIllllllIIlllIllllll() {
        return 1;
    }

    @Override
    public ItemStack llIIllIllIlIIlIIllIllllll(int n) {
        return n == 0 ? this.IlIlllIIIIIIlIIllIIllIlll : null;
    }

    @Override
    public ItemStack lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        if (n == 0 && this.IlIlllIIIIIIlIIllIIllIlll != null) {
            if (n2 >= this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl) {
                ItemStack class_08972 = this.IlIlllIIIIIIlIIllIIllIlll;
                this.IlIlllIIIIIIlIIllIIllIlll = null;
                return class_08972;
            }
            this.IlIlllIIIIIIlIIllIIllIlll.lllIlIIlIIIlIlIIIllIlllIl -= n2;
            return new ItemStack(this.IlIlllIIIIIIlIIllIIllIlll.lllIIIllIIIIlllIlIIllIIll(), n2, this.IlIlllIIIIIIlIIllIIllIlll.IllIIIllIIIIlIlIlIllIIlll());
        }
        return null;
    }

    @Override
    public ItemStack lllIIlIIIllllllIIIIlIlIlI(int n) {
        if (n == 0 && this.IlIlllIIIIIIlIIllIIllIlll != null) {
            ItemStack class_08972 = this.IlIlllIIIIIIlIIllIIllIlll;
            this.IlIlllIIIIIIlIIllIIllIlll = null;
            return class_08972;
        }
        return null;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(int n, ItemStack class_08972) {
        if (n == 0) {
            this.IlIlllIIIIIIlIIllIIllIlll = class_08972;
        }
    }

    @Override
    public String IlIIlllllIIlIlIlllllIllll() {
        return this.IIlllIlIlllIllIIIlllIIlIl() ? this.IlIlIIlIlIllIIlIlIIllIIIl : "container.beacon";
    }

    @Override
    public boolean IIlllIlIlllIllIIIlllIIlIl() {
        return this.IlIlIIlIlIllIIlIlIIllIIIl != null && this.IlIlIIlIlIllIIlIlIIllIIIl.length() > 0;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIlIIlIlIllIIlIlIIllIIIl = string;
    }

    @Override
    public int llIIlIlIlllIIllIlIlllIllI() {
        return 1;
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
        return class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IIllllIIlIlIlIlllIIIllIIl || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.diamond || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.lIIIIlIlIIlllllIIllIIlIII || class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.iron_ingot;
    }
}

