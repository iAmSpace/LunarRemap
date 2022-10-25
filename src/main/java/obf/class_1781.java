package obf;/*
 * Decompiled with CFR 0.150.
 * 
 * Could not load the following classes:
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class class_1781
extends class_1521 {
    private static final Logger lIlllIlllIIIIlIIlllIllIII = LogManager.getLogger();
    public int lllIIIllIIIIlllIlIIllIIll;
    public int lllIlIIlIIIlIlIIIllIlllIl;
    private int IlIIIIIllllllIIlllIllllll = 5;
    private String lIllllIIlIIIlIllllllIIIll;
    private String IIIllIIlIIIIIIlIlIIllIIlI;
    public float IlIllllllIIlIIllllIIlIIIl = (float)(Math.random() * Math.PI * 2.0);

    public class_1781(class_1334 class_13342, double d, double d2, double d3) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.random() * 360.0);
        this.IIIIIIIIlIllIIllIIlllIllI = (float)(Math.random() * (double)0.2f - (double)0.1f);
        this.IIlIIlIlIlIllIIlIlIIIIlll = 0.2f;
        this.llIIIlllIlllIlIllIIIIllIl = (float)(Math.random() * (double)0.2f - (double)0.1f);
    }

    public class_1781(class_1334 class_13342, double d, double d2, double d3, ItemStack class_08972) {
        this(class_13342, d, d2, d3);
        this.lllIIIllIIIIlllIlIIllIIll(class_08972);
    }

    @Override
    protected boolean IIIllIIlIIIIIIlIlIIllIIlI() {
        return false;
    }

    public class_1781(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.llllIlIIIIIIIIIlllIIlIIIl = this.lllIIIIlIlIIlIIlllIIIIIIl / 2.0f;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(10, 5);
    }

    @Override
    public void s_() {
        if (this.lIlllIlllIIIIlIIlllIllIII() == null) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        } else {
            boolean bl;
            super.s_();
            if (this.lllIlIIlIIIlIlIIIllIlllIl > 0) {
                --this.lllIlIIlIIIlIlIIIllIlllIl;
            }
            this.llIIlIllIllllIlIIIIlIIlll = this.IlIIlllllIIlIlIlllllIllll;
            this.llIllllIlIllIIIlIllIIlIlI = this.llIIlIlIlllIIllIlIlllIllI;
            this.lIlllIlllIlIIIIlllIlIlIIl = this.IllIIIIllIIllIllIlllIlIIl;
            this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)0.04f;
            this.IlIIIlIllIIIllIIIIlIIlIll = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, (this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll) / 2.0, this.IllIIIIllIIllIllIlllIlIIl);
            this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
            boolean bl2 = bl = (int)this.llIIlIllIllllIlIIIIlIIlll != (int)this.IlIIlllllIIlIlIlllllIllll || (int)this.llIllllIlIllIIIlIllIIlIlI != (int)this.llIIlIlIlllIIllIlIlllIllI || (int)this.lIlllIlllIlIIIIlllIlIlIIl != (int)this.IllIIIIllIIllIllIlllIlIIl;
            if (bl || this.IlllIIIllllIIllIllIlIIlIl % 25 == 0) {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl)).lIllllIIlIIIlIllllllIIIll() == class_1855.IIIllIllIIlIlIlIlIllllIIl) {
                    this.IIlIIlIlIlIllIIlIlIIIIlll = 0.2f;
                    this.IIIIIIIIlIllIIllIIlllIllI = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f;
                    this.llIIIlllIlllIlIllIIIIllIl = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2f;
                    this.lllIIIllIIIIlllIlIIllIIll("random.fizz", 0.4f, 2.0f + this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.4f);
                }
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                    this.IllIIlllllllIIlIIlIIIIlIl();
                }
            }
            float f = 0.98f;
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                f = this.lIlIllIIlIIlIIlIIlIIlIIll.a_((int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IlIIlllllIIlIlIlllllIllll), (int)(MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) - 1), (int) MathHelper.IlIllllllIIlIIllllIIlIIIl((double)this.IllIIIIllIIllIllIlllIlIIl)).llllIIIIlIIIlIIIIIIlIllll * 0.98f;
            }
            this.IIIIIIIIlIllIIllIIlllIllI *= (double)f;
            this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)0.98f;
            this.llIIIlllIlllIlIllIIIIllIl *= (double)f;
            if (this.llllllIlIllllIlIlIlIIIIlI) {
                this.IIlIIlIlIlIllIIlIlIIIIlll *= -0.5;
            }
            ++this.lllIIIllIIIIlllIlIIllIIll;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lllIIIllIIIIlllIlIIllIIll >= 6000) {
                this.IIIIlIIlIIIllIIIIllIIIlII();
            }
        }
    }

    private void IllIIlllllllIIlIIlIIIIlIl() {
        for (class_1781 class_17812 : this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1781.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(0.5, 0.0, 0.5))) {
            this.lllIIIllIIIIlllIlIIllIIll(class_17812);
        }
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(class_1781 class_17812) {
        if (class_17812 == this) {
            return false;
        }
        if (class_17812.IlllIIlllllllIIllIlIllllI() && this.IlllIIlllllllIIllIlIllllI()) {
            ItemStack class_08972 = this.lIlllIlllIIIIlIIlllIllIII();
            ItemStack class_08973 = class_17812.lIlllIlllIIIIlIIlllIllIII();
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() != class_08972.lllIIIllIIIIlllIlIIllIIll()) {
                return false;
            }
            if (class_08973.IlIlIIlIlIllIIlIlIIllIIIl() ^ class_08972.IlIlIIlIlIllIIlIlIIllIIIl()) {
                return false;
            }
            if (class_08973.IlIlIIlIlIllIIlIlIIllIIIl() && !class_08973.lllllIlllIIllIlIIlIIIllII().equals(class_08972.lllllIlllIIllIlIIlIIIllII())) {
                return false;
            }
            if (class_08973.lllIIIllIIIIlllIlIIllIIll() == null) {
                return false;
            }
            if (class_08973.lllIIIllIIIIlllIlIIllIIll().lIlllIlllIIIIlIIlllIllIII() && class_08973.IllIIIllIIIIlIlIlIllIIlll() != class_08972.IllIIIllIIIIlIlIlIllIIlll()) {
                return false;
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl < class_08972.lllIlIIlIIIlIlIIIllIlllIl) {
                return class_17812.lllIIIllIIIIlllIlIIllIIll(this);
            }
            if (class_08973.lllIlIIlIIIlIlIIIllIlllIl + class_08972.lllIlIIlIIIlIlIIIllIlllIl > class_08973.lIlllIlllIIIIlIIlllIllIII()) {
                return false;
            }
            class_08973.lllIlIIlIIIlIlIIIllIlllIl += class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            class_17812.lllIlIIlIIIlIlIIIllIlllIl = Math.max(class_17812.lllIlIIlIIIlIlIIIllIlllIl, this.lllIlIIlIIIlIlIIIllIlllIl);
            class_17812.lllIIIllIIIIlllIlIIllIIll = Math.min(class_17812.lllIIIllIIIIlllIlIIllIIll, this.lllIIIllIIIIlllIlIIllIIll);
            class_17812.lllIIIllIIIIlllIlIIllIIll(class_08973);
            this.IIIIlIIlIIIllIIIIllIIIlII();
            return true;
        }
        return false;
    }

    public void IlIllllllIIlIIllllIIlIIIl() {
        this.lllIIIllIIIIlllIlIIllIIll = 4800;
    }

    @Override
    public boolean lIIIllIIIIIllllIlIlIllIll() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI, class_1855.IllIIlllllllIIlIIlIIIIlIl, (class_1521)this);
    }

    @Override
    protected void lIllllIIlIIIlIllllllIIIll(int n) {
        this.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll, (float)n);
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (this.lIIllIIlIIIlllIlllIIlIIlI()) {
            return false;
        }
        if (this.lIlllIlllIIIIlIIlllIllIII() != null && this.lIlllIlllIIIIlIIlllIllIII().lllIIIllIIIIlllIlIIllIIll() == Items.nether_star && class_00582.IlIllllllIIlIIllllIIlIIIl()) {
            return false;
        }
        this.IIlIllIIlllllIIlIIllllIIl();
        this.IlIIIIIllllllIIlllIllllll = (int)((float)this.IlIIIIIllllllIIlllIllllll - f);
        if (this.IlIIIIIllllllIIlllIllllll <= 0) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
        return false;
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("Health", (short)((byte)this.IlIIIIIllllllIIlllIllllll));
        class_07752.lllIIIllIIIIlllIlIIllIIll("Age", (short)this.lllIIIllIIIIlllIlIIllIIll);
        if (this.lIllllIIlIIIlIllllllIIIll() != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Thrower", this.lIllllIIlIIIlIllllllIIIll);
        }
        if (this.IlIIIIIllllllIIlllIllllll() != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Owner", this.IIIllIIlIIIIIIlIlIIllIIlI);
        }
        if (this.lIlllIlllIIIIlIIlllIllIII() != null) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("Item", this.lIlllIlllIIIIlIIlllIllIII().lllIlIIlIIIlIlIIIllIlllIl(new class_0775()));
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.IlIIIIIllllllIIlllIllllll = class_07752.IlIIIIIllllllIIlllIllllll("Health") & 0xFF;
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.IlIIIIIllllllIIlllIllllll("Age");
        if (class_07752.IlIllllllIIlIIllllIIlIIIl("Owner")) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.IllIIIllIIIIlIlIlIllIIlll("Owner");
        }
        if (class_07752.IlIllllllIIlIIllllIIlIIIl("Thrower")) {
            this.lIllllIIlIIIlIllllllIIIll = class_07752.IllIIIllIIIIlIlIlIllIIlll("Thrower");
        }
        class_0775 class_07753 = class_07752.llIIllIllIlIIlIIllIllllll("Item");
        this.lllIIIllIIIIlllIlIIllIIll(ItemStack.lllIIIllIIIIlllIlIIllIIll(class_07753));
        if (this.lIlllIlllIIIIlIIlllIllIII() == null) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0814 class_08142) {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            ItemStack class_08972 = this.lIlllIlllIIIIlIIlllIllIII();
            int n = class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            if (this.lllIlIIlIIIlIlIIIllIlllIl == 0 && (this.IIIllIIlIIIIIIlIlIIllIIlI == null || 6000 - this.lllIIIllIIIIlllIlIIllIIll <= 200 || this.IIIllIIlIIIIIIlIlIIllIIlI.equals(class_08142.llllIIIIlIIIlIIIIIIlIllll())) && class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll(class_08972)) {
                class_0814 class_08143;
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.log)) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.mineWood);
                }
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Item.getItemFromBlock(Blocks.lIIlIIIIIlIlllIlIIlIlIlll)) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.mineWood);
                }
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.leather) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.killCow);
                }
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.diamond) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.diamonds);
                }
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.blaze_rod) {
                    class_08142.lllIIIllIIIIlllIlIIllIIll(AchievementList.blazeRod);
                }
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.diamond && this.lIllllIIlIIIlIllllllIIIll() != null && (class_08143 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.lIllllIIlIIIlIllllllIIIll())) != null && class_08143 != class_08142) {
                    class_08143.lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150966_x);
                }
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)class_08142, "random.pop", 0.2f, ((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.7f + 1.0f) * 2.0f);
                class_08142.lllIIIllIIIIlllIlIIllIIll((class_1521)this, n);
                if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                }
            }
        }
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return class_1586.lllIIIllIIIIlllIlIIllIIll("item." + this.lIlllIlllIIIIlIIlllIllIII().llIIllIllIlIIlIIllIllllll());
    }

    @Override
    public boolean m_() {
        return false;
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(int n) {
        super.IIIllIllIIlIlIlIlIllllIIl(n);
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.IllIIlllllllIIlIIlIIIIlIl();
        }
    }

    public ItemStack lIlllIlllIIIIlIIlllIllIII() {
        ItemStack class_08972 = this.lIlIIllllIlIIIIllIIIIlIIl().lIllllIIlIIIlIllllllIIIll(10);
        return class_08972 == null ? new ItemStack(Blocks.lllIlIIlIIIlIlIIIllIlllIl) : class_08972;
    }

    public void lllIIIllIIIIlllIlIIllIIll(ItemStack class_08972) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(10, class_08972);
        this.lIlIIllllIlIIIIllIIIIlIIl().IIIllIIlIIIIIIlIlIIllIIlI(10);
    }

    public String IlIIIIIllllllIIlllIllllll() {
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = string;
    }

    public String lIllllIIlIIIlIllllllIIIll() {
        return this.lIllllIIlIIIlIllllllIIIll;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(String string) {
        this.lIllllIIlIIIlIllllllIIIll = string;
    }
}

