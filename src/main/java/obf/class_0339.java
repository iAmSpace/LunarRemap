package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.network.play.server.S1BPacketEntityAttach;
import net.minecraft.stats.AchievementList;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.List;
import java.util.UUID;

public abstract class class_0339
extends class_1965 {
    public int lIllllIIlIIIlIllllllIIIll;
    protected int IIIllIIlIIIIIIlIlIIllIIlI;
    private class_0432 lllIIIllIIIIlllIlIIllIIll;
    private class_1157 lllIlIIlIIIlIlIIIllIlllIl;
    private class_0618 IlIllllllIIlIIllllIIlIIIl;
    private class_0108 lIlllIlllIIIIlIIlllIllIII;
    private class_1939 IlIIIIIllllllIIlllIllllll;
    protected final class_0772 IllIIlllllllIIlIIlIIIIlIl;
    protected final class_0772 IIIllIllIIlIlIlIlIllllIIl;
    private class_1965 lIIIlIllllIlllIIIIIllIIIl;
    private class_0162 lllIIIlllIlllIIlIllllIIlI;
    private ItemStack[] lIIlIlllIIlllIIlllIIlIlII = new ItemStack[5];
    protected float[] IllIIIllIIIIlIlIlIllIIlll = new float[5];
    private boolean lIIlIIIlIlIIlllIlIllIllIl;
    private boolean lIIlIlIIIIIllIIIIllIlIlII;
    protected float lIIIIlIlIIlllllIIllIIlIII;
    private class_1521 lIIIIlIIIIllIlIIllllIlIII;
    protected int llIIlllIllIllllIIIlIIIIII;
    private boolean lIIIlllllllIlllIIllllllll;
    private class_1521 IIllllIIlIlIlIlllIIIllIIl;
    private class_0775 IIIllIIIlIlllllllIIIlllll;
    public int llIIllIllIlIIlIIllIllllll = 0;
    public class_0672 lllIIlIIIllllllIIIIlIlIlI = null;
    public class_2020 IlIlllIIIIIIlIIllIIllIlll = null;

    public class_0339(class_1334 class_13342) {
        super(class_13342);
        this.IllIIlllllllIIlIIlIIIIlIl = new class_0772(class_13342 != null && class_13342.IlIIlllllIIlIlIlllllIllll != null ? class_13342.IlIIlllllIIlIlIlllllIllll : null);
        this.IIIllIllIIlIlIlIlIllllIIl = new class_0772(class_13342 != null && class_13342.IlIIlllllIIlIlIlllllIllll != null ? class_13342.IlIIlllllIIlIlIlllllIllll : null);
        this.lllIIIllIIIIlllIlIIllIIll = new class_0432(this);
        this.lllIlIIlIIIlIlIIIllIlllIl = new class_1157(this);
        this.IlIllllllIIlIIllllIIlIIIl = new class_0618(this);
        this.lIlllIlllIIIIlIIlllIllIII = new class_0108(this);
        this.IlIIIIIllllllIIlllIllllll = new class_1939(this, class_13342);
        this.lllIIIlllIlllIIlIllllIIlI = new class_0162(this);
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            this.IllIIIllIIIIlIlIlIllIIlll[i] = 0.085f;
        }
        UUID uUID = this.lIIlllIIlIlIlIIIlIlllIIll();
        long l = uUID.getLeastSignificantBits();
        this.llIIllIllIlIIlIIllIllllll = (int)(l & Integer.MAX_VALUE);
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(class_1152.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(16.0);
    }

    public class_0432 llIllllIlIllIIIlIllIIlIlI() {
        return this.lllIIIllIIIIlllIlIIllIIll;
    }

    public class_1157 lIlllIlllIlIIIIlllIlIlIIl() {
        return this.lllIlIIlIIIlIlIIIllIlllIl;
    }

    public class_0618 IlIIlllllIIlIlIlllllIllll() {
        return this.IlIllllllIIlIIllllIIlIIIl;
    }

    public class_1939 IllIIIIllIIllIllIlllIlIIl() {
        return this.IlIIIIIllllllIIlllIllllll;
    }

    public class_0162 IIIIIIIIlIllIIllIIlllIllI() {
        return this.lllIIIlllIlllIIlIllllIIlI;
    }

    public class_1965 IIIIlIllIlIIlIIlIllIlIlll() {
        return this.lIIIlIllllIlllIIIIIllIIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1965 class_19652) {
        this.lIIIlIllllIlllIIIIIllIIIl = class_19652;
    }

    public boolean lllIIIllIIIIlllIlIIllIIll(Class class_) {
        return class_1234.class != class_ && class_1413.class != class_;
    }

    public void IlIlIIlllIllllllllIIIlIlI() {
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(11, (Object)0);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(10, "");
    }

    public int IIllIllIIllIIlllIIIlIlllI() {
        return 80;
    }

    public void lIlIIIllIIllIIlIllllllIll() {
        String string = this.lllllllIlIIlIlIIIlIlIIlll();
        if (string != null) {
            this.lllIIIllIIIIlllIlIIllIIll(string, this.IIlIlIIIIlIlllIlIlIIIIIlI(), this.IlIlIIllIlIlIIIIIlIlllllI());
        }
    }

    @Override
    public void lllIIIIIIlIlllIIlIlIIIllI() {
        super.lllIIIIIIlIlllIIlIlIIIllI();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("mobBaseTick");
        if (this.IlllIIlllllllIIllIlIllllI() && this.IlllIIlllllllIIllIlIllllI.nextInt(1000) < this.lIllllIIlIIIlIllllllIIIll++) {
            this.lIllllIIlIIIlIllllllIIIll = -this.IIllIllIIllIIlllIIIlIlllI();
            this.lIlIIIllIIllIIlIllllllIll();
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    @Override
    protected int IlIIIIIllllllIIlllIllllll(class_0814 class_08142) {
        if (this.IIIllIIlIIIIIIlIlIIllIIlI > 0) {
            int n = this.IIIllIIlIIIIIIlIlIIllIIlI;
            ItemStack[] arrclass_0897 = this.lIIlIIlIllIlIIlIlIIlIlIlI();
            for (int i = 0; i < arrclass_0897.length; ++i) {
                if (arrclass_0897[i] == null || !(this.IllIIIllIIIIlIlIlIllIIlll[i] <= 1.0f)) continue;
                n += 1 + this.IlllIIlllllllIIllIlIllllI.nextInt(3);
            }
            return n;
        }
        return this.IIIllIIlIIIIIIlIlIIllIIlI;
    }

    public void lIlIIlllllIlllllIlIIIllll() {
        for (int i = 0; i < 20; ++i) {
            double d = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d2 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d3 = this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.02;
            double d4 = 10.0;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll("explode", this.IlIIlllllIIlIlIlllllIllll + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII - d * d4, this.llIIlIlIlllIIllIlIlllIllI + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.lllIIIIlIlIIlIIlllIIIIIIl) - d2 * d4, this.IllIIIIllIIllIllIlllIlIIl + (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IIIIlIlIIlIIIIlIlllIlIIII * 2.0f) - (double)this.IIIIlIlIIlIIIIlIlllIlIIII - d3 * d4, d, d2, d3);
        }
    }

    @Override
    public void s_() {
        super.s_();
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIlIllIIlIIlIIlIIlIIlIIll();
        }
    }

    @Override
    protected float lllIlIIlIIIlIlIIIllIlllIl(float f, float f2) {
        if (this.IIIIlllIIlIllllllIllIIlll()) {
            this.lIlllIlllIIIIlIIlllIllIII.lllIIIllIIIIlllIlIIllIIll();
            return f2;
        }
        return super.lllIlIIlIIIlIlIIIllIlllIl(f, f2);
    }

    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return null;
    }

    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Item.lllIIIllIIIIlllIlIIllIIll(0);
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        Item class_06112 = this.llIllllIIIIIlIIlIlllIIlll();
        if (class_06112 != null) {
            int n2 = this.IlllIIlllllllIIllIlIllllI.nextInt(3);
            if (n > 0) {
                n2 += this.IlllIIlllllllIIllIlIllllI.nextInt(n + 1);
            }
            for (int i = 0; i < n2; ++i) {
                this.lllIIIllIIIIlllIlIIllIIll(class_06112, 1);
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_0775 class_07753;
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CanPickUpLoot", this.lIIlIlllIIlIIIIlIlIIIIlll());
        class_07752.lllIIIllIIIIlllIlIIllIIll("PersistenceRequired", this.lIIlIlIIIIIllIIIIllIlIlII);
        class_2145 class_21452 = new class_2145();
        for (int i = 0; i < this.lIIlIlllIIlllIIlllIIlIlII.length; ++i) {
            class_07753 = new class_0775();
            if (this.lIIlIlllIIlllIIlllIIlIlII[i] != null) {
                this.lIIlIlllIIlllIIlllIIlIlII[i].lllIlIIlIIIlIlIIIllIlllIl(class_07753);
            }
            class_21452.lllIIIllIIIIlllIlIIllIIll(class_07753);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("Equipment", class_21452);
        class_2145 class_21453 = new class_2145();
        for (int i = 0; i < this.IllIIIllIIIIlIlIlIllIIlll.length; ++i) {
            class_21453.lllIIIllIIIIlllIlIIllIIll(new class_0112(this.IllIIIllIIIIlIlIlIllIIlll[i]));
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("DropChances", class_21453);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CustomName", this.llllIIllllIllIlllllIIlIlI());
        class_07752.lllIIIllIIIIlllIlIIllIIll("CustomNameVisible", this.lIIIllIlIlIlIIIllIlIlIllI());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Leashed", this.lIIIlllllllIlllIIllllllll);
        if (this.IIllllIIlIlIlIlllIIIllIIl != null) {
            class_07753 = new class_0775();
            if (this.IIllllIIlIlIlIlllIIIllIIl instanceof class_1965) {
                class_07753.lllIIIllIIIIlllIlIIllIIll("UUIDMost", this.IIllllIIlIlIlIlllIIIllIIl.lIIlllIIlIlIlIIIlIlllIIll().getMostSignificantBits());
                class_07753.lllIIIllIIIIlllIlIIllIIll("UUIDLeast", this.IIllllIIlIlIlIlllIIIllIIl.lIIlllIIlIlIlIIIlIlllIIll().getLeastSignificantBits());
            } else if (this.IIllllIIlIlIlIlllIIIllIIl instanceof class_1309) {
                class_1309 class_13092 = (class_1309)this.IIllllIIlIlIlIlllIIIllIIl;
                class_07753.lllIIIllIIIIlllIlIIllIIll("X", class_13092.lllIlIIlIIIlIlIIIllIlllIl);
                class_07753.lllIIIllIIIIlllIlIIllIIll("Y", class_13092.IlIllllllIIlIIllllIIlIIIl);
                class_07753.lllIIIllIIIIlllIlIIllIIll("Z", class_13092.lIlllIlllIIIIlIIlllIllIII);
            }
            class_07752.lllIIIllIIIIlllIlIIllIIll("Leash", class_07753);
        }
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        int n;
        class_2145 class_21452;
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IIIllIIlIIIIIIlIlIIllIIlI(class_07752.lllIIlIIIllllllIIIIlIlIlI("CanPickUpLoot"));
        this.lIIlIlIIIIIllIIIIllIlIlII = class_07752.lllIIlIIIllllllIIIIlIlIlI("PersistenceRequired");
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("CustomName", 8) && class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName").length() > 0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_07752.IllIIIllIIIIlIlIlIllIIlll("CustomName"));
        }
        this.IlIllllllIIlIIllllIIlIIIl(class_07752.lllIIlIIIllllllIIIIlIlIlI("CustomNameVisible"));
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("Equipment", 9)) {
            class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("Equipment", 10);
            for (n = 0; n < this.lIIlIlllIIlllIIlllIIlIlII.length; ++n) {
                this.lIIlIlllIIlllIIlllIIlIlII[n] = ItemStack.lllIIIllIIIIlllIlIIllIIll(class_21452.lllIlIIlIIIlIlIIIllIlllIl(n));
            }
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("DropChances", 9)) {
            class_21452 = class_07752.IlIllllllIIlIIllllIIlIIIl("DropChances", 5);
            for (n = 0; n < class_21452.lIlllIlllIIIIlIIlllIllIII(); ++n) {
                this.IllIIIllIIIIlIlIlIllIIlll[n] = class_21452.IlIIIIIllllllIIlllIllllll(n);
            }
        }
        this.lIIIlllllllIlllIIllllllll = class_07752.lllIIlIIIllllllIIIIlIlIlI("Leashed");
        if (this.lIIIlllllllIlllIIllllllll && class_07752.lllIlIIlIIIlIlIIIllIlllIl("Leash", 10)) {
            this.IIIllIIIlIlllllllIIIlllll = class_07752.llIIllIllIlIIlIIllIllllll("Leash");
        }
    }

    public void IllIIlllllllIIlIIlIIIIlIl(float f) {
        this.llIlIIIlllIIIllIllllIIIll = f;
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(float f) {
        super.IIIllIllIIlIlIlIlIllllIIl(f);
        this.IllIIlllllllIIlIIlIIIIlIl(f);
    }

    @Override
    public void d_() {
        super.d_();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("looting");
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.lIIlIlllIIlIIIIlIlIIIIlll() && !this.IIIlIllIlllIlIIIlIlIIllII && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll().lllIlIIlIIIlIlIIIllIlllIl("mobGriefing")) {
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1781.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(1.0, 0.0, 1.0));
            for (class_1781 class_17812 : list) {
                Object object;
                ItemStack class_08972;
                int n;
                if (class_17812.IllllIIIIlIIlIIIIlllIIIIl || class_17812.lIlllIlllIIIIlIIlllIllIII() == null || (n = class_0339.a_(class_08972 = class_17812.lIlllIlllIIIIlIIlllIllIII())) <= -1) continue;
                boolean bl = true;
                ItemStack class_08973 = this.IlIllllllIIlIIllllIIlIIIl(n);
                if (class_08973 != null) {
                    Item class_06112;
                    if (n == 0) {
                        if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1531 && !(class_08973.lllIIIllIIIIlllIlIIllIIll() instanceof class_1531)) {
                            bl = true;
                        } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof class_1531 && class_08973.lllIIIllIIIIlllIlIIllIIll() instanceof class_1531) {
                            object = (class_1531)class_08972.lllIIIllIIIIlllIlIIllIIll();
                            class_06112 = (class_1531)class_08973.lllIIIllIIIIlllIlIIllIIll();
                            bl = ((class_1531)object).IlIIIlIIIIllIIIllIIIIIIll() == ((class_1531)class_06112).IlIIIlIIIIllIIIllIIIIIIll() ? class_08972.IllIIIllIIIIlIlIlIllIIlll() > class_08973.IllIIIllIIIIlIlIlIllIIlll() || class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && !class_08973.IlIlIIlIlIllIIlIlIIllIIIl() : ((class_1531)object).IlIIIlIIIIllIIIllIIIIIIll() > ((class_1531)class_06112).IlIIIlIIIIllIIIllIIIIIIll();
                        } else {
                            bl = false;
                        }
                    } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor && !(class_08973.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor)) {
                        bl = true;
                    } else if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor && class_08973.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor) {
                        object = (ItemArmor)class_08972.lllIIIllIIIIlllIlIIllIIll();
                        class_06112 = (ItemArmor)class_08973.lllIIIllIIIIlllIlIIllIIll();
                        bl = ((ItemArmor)object).lIIIIlIlIIlllllIIllIIlIII == ((ItemArmor)class_06112).lIIIIlIlIIlllllIIllIIlIII ? class_08972.IllIIIllIIIIlIlIlIllIIlll() > class_08973.IllIIIllIIIIlIlIlIllIIlll() || class_08972.IlIlIIlIlIllIIlIlIIllIIIl() && !class_08973.IlIlIIlIlIllIIlIlIIllIIIl() : ((ItemArmor)object).lIIIIlIlIIlllllIIllIIlIII > ((ItemArmor)class_06112).lIIIIlIlIIlllllIIllIIlIII;
                    } else {
                        bl = false;
                    }
                }
                if (!bl) continue;
                if (class_08973 != null && this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.1f < this.IllIIIllIIIIlIlIlIllIIlll[n]) {
                    this.lllIIIllIIIIlllIlIIllIIll(class_08973, 0.0f);
                }
                if (class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.diamond && class_17812.lIllllIIlIIIlIllllllIIIll() != null && (object = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_17812.lIllllIIlIIIlIllllllIIIll())) != null) {
                    ((class_0814)object).lllIIIllIIIIlllIlIIllIIll(AchievementList.field_150966_x);
                }
                this.lllIIIllIIIIlllIlIIllIIll(n, class_08972);
                this.IllIIIllIIIIlIlIlIllIIlll[n] = 2.0f;
                this.lIIlIlIIIIIllIIIIllIlIlII = true;
                this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_17812, 1);
                class_17812.IIIIlIIlIIIllIIIIllIIIlII();
            }
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    @Override
    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return false;
    }

    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return true;
    }

    public void IllIlllIIIlllllIllIIlIlIl() {
        Object var1_1 = null;
        if (this.lIIlIlIIIIIllIIIIllIlIlII) {
            this.lIIlIlllIIlIIIIlIlIIIIlll = 0;
        } else if ((this.lIIlIlllIIlIIIIlIlIIIIlll & 0x1F) == 31) {
            this.IIIIlIIlIIIllIIIIllIIIlII();
        } else {
            class_0814 class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, -1.0);
            if (class_08142 != null) {
                double d = class_08142.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
                double d2 = class_08142.llIIlIlIlllIIllIlIlllIllI - this.llIIlIlIlllIIllIlIlllIllI;
                double d3 = class_08142.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
                double d4 = d * d + d2 * d2 + d3 * d3;
                if (this.IIIIIIlIIIIIIIIIIlIlIlIlI() && d4 > 16384.0) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                }
                if (this.lIIlIlllIIlIIIIlIlIIIIlll > 600 && this.IlllIIlllllllIIllIlIllllI.nextInt(800) == 0 && d4 > 1024.0 && this.IIIIIIlIIIIIIIIIIlIlIlIlI()) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                } else if (d4 < 1024.0) {
                    this.lIIlIlllIIlIIIIlIlIIIIlll = 0;
                }
            }
        }
    }

    @Override
    protected void IllIIIIlIIlllllllllIlIlII() {
        ++this.lIIlIlllIIlIIIIlIlIIIIlll;
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("checkDespawn");
        this.IllIlllIIIlllllIllIIlIlIl();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("sensing");
        this.lllIIIlllIlllIIlIllllIIlI.lllIIIllIIIIlllIlIIllIIll();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("targetSelector");
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("goalSelector");
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("navigation");
        this.IlIIIIIllllllIIlllIllllll.IlIIIIIllllllIIlllIllllll();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("mob tick");
        this.lIIlIlIlIlIllIIlIIllllIll();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("controls");
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.startSection("move");
        this.lllIlIIlIIIlIlIIIllIlllIl.IlIllllllIIlIIllllIIlIIIl();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endStartSection("look");
        this.lllIIIllIIIIlllIlIIllIIll.lllIIIllIIIIlllIlIIllIIll();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endStartSection("jump");
        this.IlIllllllIIlIIllllIIlIIIl.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
        this.lIlIllIIlIIlIIlIIlIIlIIll.IlIIlllllIIlIlIlllllIllll.endSection();
    }

    @Override
    protected void llIIlIlIlllIIllIlIlllIllI() {
        super.llIIlIlIlllIIllIlIlllIllI();
        this.IlllIIIlIIlIIIIllllIllllI = 0.0f;
        this.llIlIIIlllIIIllIllllIIIll = 0.0f;
        this.IllIlllIIIlllllIllIIlIlIl();
        float f = 8.0f;
        if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.02f) {
            class_0814 class_08142 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (double)f);
            if (class_08142 != null) {
                this.lIIIIlIIIIllIlIIllllIlIII = class_08142;
                this.llIIlllIllIllllIIIlIIIIII = 10 + this.IlllIIlllllllIIllIlIllllI.nextInt(20);
            } else {
                this.lIIlllIIIlIIlIllIIIIIlIlI = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 20.0f;
            }
        }
        if (this.lIIIIlIIIIllIlIIllllIlIII != null) {
            this.lllIIIllIIIIlllIlIIllIIll(this.lIIIIlIIIIllIlIIllllIlIII, 10.0f, (float)this.IIIlllIlIIllIIlIlIllIlIIl());
            if (this.llIIlllIllIllllIIIlIIIIII-- <= 0 || this.lIIIIlIIIIllIlIIllllIlIII.IllllIIIIlIIlIIIIlllIIIIl || this.lIIIIlIIIIllIlIIllllIlIII.IlIIIIIllllllIIlllIllllll(this) > (double)(f * f)) {
                this.lIIIIlIIIIllIlIIllllIlIII = null;
            }
        } else {
            if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.05f) {
                this.lIIlllIIIlIIlIllIIIIIlIlI = (this.IlllIIlllllllIIllIlIllllI.nextFloat() - 0.5f) * 20.0f;
            }
            this.IIIIlIllIlIIlIIlIllIlIlll += this.lIIlllIIIlIIlIllIIIIIlIlI;
            this.IlIlIIlllIllllllllIIIlIlI = this.lIIIIlIlIIlllllIIllIIlIII;
        }
        boolean bl = this.llIlllIlIIllIlIIIIllIIlIl();
        boolean bl2 = this.lIIlIlllIllIlIlllIIIIIIII();
        if (bl || bl2) {
            this.llIllIlllIllIlIIIIlIIlIII = this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.8f;
        }
    }

    public int IIIlllIlIIllIIlIlIllIlIIl() {
        return 40;
    }

    public void lllIIIllIIIIlllIlIIllIIll(class_1521 class_15212, float f, float f2) {
        double d;
        double d2 = class_15212.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
        double d3 = class_15212.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
        if (class_15212 instanceof class_1965) {
            class_1965 class_19652 = (class_1965)class_15212;
            d = class_19652.llIIlIlIlllIIllIlIlllIllI + (double)class_19652.llIIllIllIlIIlIIllIllllll() - (this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll());
        } else {
            d = (class_15212.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + class_15212.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll) / 2.0 - (this.llIIlIlIlllIIllIlIlllIllI + (double)this.llIIllIllIlIIlIIllIllllll());
        }
        double d4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d2 * d2 + d3 * d3);
        float f3 = (float)(Math.atan2(d3, d2) * 180.0 / Math.PI) - 90.0f;
        float f4 = (float)(-(Math.atan2(d, d4) * 180.0 / Math.PI));
        this.IlIlIIlllIllllllllIIIlIlI = this.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI, f4, f2);
        this.IIIIlIllIlIIlIIlIllIlIlll = this.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll, f3, f);
    }

    private float lllIlIIlIIIlIlIIIllIlllIl(float f, float f2, float f3) {
        float f4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(f2 - f);
        if (f4 > f3) {
            f4 = f3;
        }
        if (f4 < -f3) {
            f4 = -f3;
        }
        return f + f4;
    }

    public boolean lllIIlIIIllllllIIIIlIlIlI() {
        return this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this.IIllIllIIllIIlllIIIlIlllI) && this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI).isEmpty() && !this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(this.IIllIllIIllIIlllIIIlIlllI);
    }

    public float llllIIIlIlIlIlIIlIIIIIlIl() {
        return 1.0f;
    }

    public int llIIIlIIllIIllIllIIlIlllI() {
        return 4;
    }

    @Override
    public int IllIIllIlIlllIllIllIlIIIl() {
        if (this.IIIIlIllIlIIlIIlIllIlIlll() == null) {
            return 3;
        }
        int n = (int)(this.lllIIIlllIlllIIlIllllIIlI() - this.IIllllIIlIlIlIlllIIIllIIl() * 0.33f);
        if ((n -= (3 - this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll()) * 4) < 0) {
            n = 0;
        }
        return n + 3;
    }

    @Override
    public ItemStack lIIIIlIlIlIIIlIIllIIlIlIl() {
        return this.lIIlIlllIIlllIIlllIIlIlII[0];
    }

    @Override
    public ItemStack IlIllllllIIlIIllllIIlIIIl(int n) {
        return this.lIIlIlllIIlllIIlllIIlIlII[n];
    }

    public ItemStack lIIIIlIlIIlllllIIllIIlIII(int n) {
        return this.lIIlIlllIIlllIIlllIIlIlII[n + 1];
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(int n, ItemStack class_08972) {
        this.lIIlIlllIIlllIIlllIIlIlII[n] = class_08972;
    }

    @Override
    public ItemStack[] lIIlIIlIllIlIIlIlIIlIlIlI() {
        return this.lIIlIlllIIlllIIlllIIlIlII;
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl(boolean bl, int n) {
        for (int i = 0; i < this.lIIlIIlIllIlIIlIlIIlIlIlI().length; ++i) {
            boolean bl2;
            ItemStack class_08972 = this.IlIllllllIIlIIllllIIlIIIl(i);
            boolean bl3 = bl2 = this.IllIIIllIIIIlIlIlIllIIlll[i] > 1.0f;
            if (class_08972 == null || !bl && !bl2 || !(this.IlllIIlllllllIIllIlIllllI.nextFloat() - (float)n * 0.01f < this.IllIIIllIIIIlIlIlIllIIlll[i])) continue;
            if (!bl2 && class_08972.lIllllIIlIIIlIllllllIIIll()) {
                int n2 = Math.max(class_08972.lIIIIlIlIIlllllIIllIIlIII() - 25, 1);
                int n3 = class_08972.lIIIIlIlIIlllllIIllIIlIII() - this.IlllIIlllllllIIllIlIllllI.nextInt(this.IlllIIlllllllIIllIlIllllI.nextInt(n2) + 1);
                if (n3 > n2) {
                    n3 = n2;
                }
                if (n3 < 1) {
                    n3 = 1;
                }
                class_08972.lllIlIIlIIIlIlIIIllIlllIl(n3);
            }
            this.lllIIIllIIIIlllIlIIllIIll(class_08972, 0.0f);
        }
    }

    protected void lllllIllllIIIIllIIlIlIlII() {
        if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.15f * this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl)) {
            float f;
            int n = this.IlllIIlllllllIIllIlIllllI.nextInt(2);
            float f2 = f = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII ? 0.1f : 0.25f;
            if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.095f) {
                ++n;
            }
            if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.095f) {
                ++n;
            }
            if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.095f) {
                ++n;
            }
            for (int i = 3; i >= 0; --i) {
                Item class_06112;
                ItemStack class_08972 = this.lIIIIlIlIIlllllIIllIIlIII(i);
                if (i < 3 && this.IlllIIlllllllIIllIlIllllI.nextFloat() < f) break;
                if (class_08972 != null || (class_06112 = class_0339.lllIIIllIIIIlllIlIIllIIll(i + 1, n)) == null) continue;
                this.lllIIIllIIIIlllIlIIllIIll(i + 1, new ItemStack(class_06112));
            }
        }
    }

    public static int a_(ItemStack class_08972) {
        if (class_08972.lllIIIllIIIIlllIlIIllIIll() != Item.getItemFromBlock(Blocks.lIlIIlllllIlllllIlIIIllll) && class_08972.lllIIIllIIIIlllIlIIllIIll() != Items.skull) {
            if (class_08972.lllIIIllIIIIlllIlIIllIIll() instanceof ItemArmor) {
                switch (((ItemArmor)class_08972.lllIIIllIIIIlllIlIIllIIll()).IllIIIllIIIIlIlIlIllIIlll) {
                    case 0: {
                        return 4;
                    }
                    case 1: {
                        return 3;
                    }
                    case 2: {
                        return 2;
                    }
                    case 3: {
                        return 1;
                    }
                }
            }
            return 0;
        }
        return 4;
    }

    public static Item lllIIIllIIIIlllIlIIllIIll(int n, int n2) {
        switch (n) {
            case 4: {
                if (n2 == 0) {
                    return Items.llIIlIIllIIllIlIIllIIllII;
                }
                if (n2 == 1) {
                    return Items.llllIIllIlIlllllllIIlIIlI;
                }
                if (n2 == 2) {
                    return Items.IIIIlIlIIlIIIIlIlllIlIIII;
                }
                if (n2 == 3) {
                    return Items.llIlllIlIIllIlIIIIllIIlIl;
                }
                if (n2 == 4) {
                    return Items.IIlIllIIlllllIIlIIllllIIl;
                }
            }
            case 3: {
                if (n2 == 0) {
                    return Items.lIlIlIIIIIIlIIllllIlIIllI;
                }
                if (n2 == 1) {
                    return Items.IlllIIlllllllIIllIlIllllI;
                }
                if (n2 == 2) {
                    return Items.lllIIIIlIlIIlIIlllIIIIIIl;
                }
                if (n2 == 3) {
                    return Items.lIIIllIIIIIllllIlIlIllIll;
                }
                if (n2 == 4) {
                    return Items.IllllIIlIIIllIlllIlllIllI;
                }
            }
            case 2: {
                if (n2 == 0) {
                    return Items.IllllIIIIlIIlIIIIlllIIIIl;
                }
                if (n2 == 1) {
                    return Items.IlllIIIllllIIllIllIlIIlIl;
                }
                if (n2 == 2) {
                    return Items.llIlIIlllIIIIIllIIlIlIIII;
                }
                if (n2 == 3) {
                    return Items.lIIIlIIIlIlllIllIIIlIIIlI;
                }
                if (n2 == 4) {
                    return Items.IllIlIlIIIlllIIllIIIIlIll;
                }
            }
            case 1: {
                if (n2 == 0) {
                    return Items.llllIlIIIIIIIIIlllIIlIIIl;
                }
                if (n2 == 1) {
                    return Items.lllIIIlIIlIlIllIIIIIlIIll;
                }
                if (n2 == 2) {
                    return Items.IllIIIlllllIlIlllIlllllII;
                }
                if (n2 == 3) {
                    return Items.lIIlIlllIllIlIlllIIIIIIII;
                }
                if (n2 != 4) break;
                return Items.diamond_boots;
            }
        }
        return null;
    }

    protected void lIIllIlIllIlIlIIlIlIIIIll() {
        float f = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        if (this.lIIIIlIlIlIIIlIIllIIlIlIl() != null && this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.25f * f) {
            class_1250.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, this.lIIIIlIlIlIIIlIIllIIlIlIl(), (int)(5.0f + f * (float)this.IlllIIlllllllIIllIlIllllI.nextInt(18)));
        }
        for (int i = 0; i < 4; ++i) {
            ItemStack class_08972 = this.lIIIIlIlIIlllllIIllIIlIII(i);
            if (class_08972 == null || !(this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.5f * f)) continue;
            class_1250.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, class_08972, (int)(5.0f + f * (float)this.IlllIIlllllllIIllIlIllllI.nextInt(18)));
        }
    }

    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(new class_1256("Random spawn bonus", this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 0.05, 1));
        return class_20252;
    }

    public boolean lIIllllIllIlllllIIllIllIl() {
        return false;
    }

    @Override
    public String llllIIIIlIIIlIIIIIIlIllll() {
        return this.IllIlIlIIIlIllIlIlIIlllII() ? this.llllIIllllIllIlllllIIlIlI() : super.llllIIIIlIIIlIIIIIIlIllll();
    }

    public void IIIIIlllIIllllIlllIlllIIl() {
        this.lIIlIlIIIIIllIIIIllIlIlII = true;
    }

    public void lllIIIllIIIIlllIlIIllIIll(String string) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(10, string);
    }

    public String llllIIllllIllIlllllIIlIlI() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIIIIIllllllIIlllIllllll(10);
    }

    public boolean IllIlIlIIIlIllIlIlIIlllII() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.IlIIIIIllllllIIlllIllllll(10).length() > 0;
    }

    public void IlIllllllIIlIIllllIIlIIIl(boolean bl) {
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(11, (byte)(bl ? 1 : 0));
    }

    public boolean lIIIllIlIlIlIIIllIlIlIllI() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(11) == 1;
    }

    @Override
    public boolean IIIlIllIlllIlIIIlIlIIllII() {
        return this.lIIIllIlIlIlIIIllIlIlIllI();
    }

    public void lllIIIllIIIIlllIlIIllIIll(int n, float f) {
        this.IllIIIllIIIIlIlIlIllIIlll[n] = f;
    }

    public boolean lIIlIlllIIlIIIIlIlIIIIlll() {
        return this.lIIlIIIlIlIIlllIlIllIllIl;
    }

    public void IIIllIIlIIIIIIlIlIIllIIlI(boolean bl) {
        this.lIIlIIIlIlIIlllIlIllIllIl = bl;
    }

    public boolean IIIlIIllIIlIlIIlIIllIIIIl() {
        return this.lIIlIlIIIIIllIIIIllIlIlII;
    }

    @Override
    public final boolean b_(class_0814 class_08142) {
        if (this.lIIIIIlIllIllIlIlIIllllll() && this.lIIIlllIlIIIlIllIIIlIllll() == class_08142) {
            this.lllIIIllIIIIlllIlIIllIIll(true, !class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII);
            return true;
        }
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IIlIlIIIlIIllIlIlIlIlIIll && this.IIIIlIIIllIIIlIIlIIIIIlll()) {
            if (!(this instanceof class_2094) || !((class_2094)this).lllIIIIlIIllIIIlIllIlllII()) {
                this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)class_08142, true);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                return true;
            }
            if (((class_2094)this).IlIIIIIllllllIIlllIllllll((class_1965)class_08142)) {
                this.lllIlIIlIIIlIlIIIllIlllIl((class_1521)class_08142, true);
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
                return true;
            }
        }
        return this.lIlllIlllIIIIlIIlllIllIII(class_08142) ? true : super.b_(class_08142);
    }

    protected boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        return false;
    }

    protected void lIlIllIIlIIlIIlIIlIIlIIll() {
        if (this.IIIllIIIlIlllllllIIIlllll != null) {
            this.IlIIIIIllllllIIlllIllllll();
        }
        if (this.lIIIlllllllIlllIIllllllll && (this.IIllllIIlIlIlIlllIIIllIIl == null || this.IIllllIIlIlIlIlllIIIllIIl.IllllIIIIlIIlIIIIlllIIIIl)) {
            this.lllIIIllIIIIlllIlIIllIIll(true, true);
        }
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl, boolean bl2) {
        if (this.lIIIlllllllIlllIIllllllll) {
            this.lIIIlllllllIlllIIllllllll = false;
            this.IIllllIIlIlIlIlllIIIllIIl = null;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && bl2) {
                this.lllIIIllIIIIlllIlIIllIIll(Items.IIlIlIIIlIIllIlIlIlIlIIll, 1);
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && bl && this.lIlIllIIlIIlIIlIIlIIlIIll instanceof class_0976) {
                ((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll(this, new S1BPacketEntityAttach(1, this, null));
            }
        }
    }

    public boolean IIIIlIIIllIIIlIIlIIIIIlll() {
        return !this.lIIIIIlIllIllIlIlIIllllll() && !(this instanceof class_1310);
    }

    public boolean lIIIIIlIllIllIlIlIIllllll() {
        return this.lIIIlllllllIlllIIllllllll;
    }

    public class_1521 lIIIlllIlIIIlIllIIIlIllll() {
        return this.IIllllIIlIlIlIlllIIIllIIl;
    }

    public void lllIlIIlIIIlIlIIIllIlllIl(class_1521 class_15212, boolean bl) {
        this.lIIIlllllllIlllIIllllllll = true;
        this.IIllllIIlIlIlIlllIIIllIIl = class_15212;
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && bl && this.lIlIllIIlIIlIIlIIlIIlIIll instanceof class_0976) {
            ((class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll).lIlIlIIIIIIlIIllllIlIIllI().lllIIIllIIIIlllIlIIllIIll(this, new S1BPacketEntityAttach(1, this, this.IIllllIIlIlIlIlllIIIllIIl));
        }
    }

    private void IlIIIIIllllllIIlllIllllll() {
        if (this.lIIIlllllllIlllIIllllllll && this.IIIllIIIlIlllllllIIIlllll != null) {
            if (this.IIIllIIIlIlllllllIIIlllll.lllIlIIlIIIlIlIIIllIlllIl("UUIDMost", 4) && this.IIIllIIIlIlllllllIIIlllll.lllIlIIlIIIlIlIIIllIlllIl("UUIDLeast", 4)) {
                UUID uUID = new UUID(this.IIIllIIIlIlllllllIIIlllll.IIIllIIlIIIIIIlIlIIllIIlI("UUIDMost"), this.IIIllIIIlIlllllllIIIlllll.IIIllIIlIIIIIIlIlIIllIIlI("UUIDLeast"));
                List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1965.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(10.0, 10.0, 10.0));
                for (class_1965 class_19652 : list) {
                    if (!class_19652.lIIlllIIlIlIlIIIlIlllIIll().equals(uUID)) continue;
                    this.IIllllIIlIlIlIlllIIIllIIl = class_19652;
                    break;
                }
            } else if (this.IIIllIIIlIlllllllIIIlllll.lllIlIIlIIIlIlIIIllIlllIl("X", 99) && this.IIIllIIIlIlllllllIIIlllll.lllIlIIlIIIlIlIIIllIlllIl("Y", 99) && this.IIIllIIIlIlllllllIIIlllll.lllIlIIlIIIlIlIIIllIlllIl("Z", 99)) {
                int n;
                int n2;
                int n3 = this.IIIllIIIlIlllllllIIIlllll.lIllllIIlIIIlIllllllIIIll("X");
                class_1215 class_12152 = class_1215.lllIlIIlIIIlIlIIIllIlllIl(this.lIlIllIIlIIlIIlIIlIIlIIll, n3, n2 = this.IIIllIIIlIlllllllIIIlllll.lIllllIIlIIIlIllllllIIIll("Y"), n = this.IIIllIIIlIlllllllIIIlllll.lIllllIIlIIIlIllllllIIIll("Z"));
                if (class_12152 == null) {
                    class_12152 = class_1215.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, n3, n2, n);
                }
                this.IIllllIIlIlIlIlllIIIllIIl = class_12152;
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(false, true);
            }
        }
        this.IIIllIIIlIlllllllIIIlllll = null;
    }
}

