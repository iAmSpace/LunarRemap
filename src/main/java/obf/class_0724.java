package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Calendar;
import java.util.List;
import java.util.UUID;

public class class_0724
extends class_1168 {
    protected static final class_2191 lIIIlIllllIlllIIIIIllIIIl = new class_1904("zombie.spawnReinforcements", 0.0, 0.0, 1.0).lllIIIllIIIIlllIlIIllIIll("Spawn Reinforcements Chance");
    private static final UUID lllIIIlllIlllIIlIllllIIlI = UUID.fromString("B9766B59-9566-4402-BC1F-2EE2A276D836");
    private static final class_1256 lIIlIlllIIlllIIlllIIlIlII = new class_1256(lllIIIlllIlllIIlIllllIIlI, "Baby speed boost", 0.5, 1);
    private final class_0811 lIIlIIIlIlIIlllIlIllIllIl = new class_0811(this);
    private int lIIlIlIIIIIllIIIIllIlIlII;
    private boolean lIIIIlIIIIllIlIIllllIlIII = false;
    private float lIIIlllllllIlllIIllllllll = -1.0f;
    private float IIllllIIlIlIlIlllIIIllIIl;

    public class_0724(class_1334 class_13342) {
        super(class_13342);
        this.IllIIIIllIIllIllIlllIlIIl().lllIlIIlIIIlIlIIIllIlllIl(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1778(this, class_0814.class, 1.0, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1778(this, class_1817.class, 1.0, true));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, new class_0649(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0419(this, 1.0, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0235(this, class_0814.class, 8.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0558(this));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0366(this, true));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1524(this, class_0814.class, 0, true));
        this.IIIllIllIIlIlIlIlIllllIIl.lllIIIllIIIIlllIlIIllIIll(2, new class_1524(this, class_1817.class, 0, false));
        this.IlIIIIIllllllIIlllIllllll(0.6f, 1.8f);
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(40.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.23f);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIIIIIllllllIIlllIllllll).lllIIIllIIIIlllIlIIllIIll(3.0);
        this.lIlIllllIlIIIIIllIIIIlIlI().lllIlIIlIIIlIlIIIllIlllIl(lIIIlIllllIlllIIIIIllIIIl).lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI.nextDouble() * (double)0.1f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(12, (Object)0);
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(13, (Object)0);
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(14, (Object)0);
    }

    @Override
    public int lIIlIlIIIIIllIIIIllIlIlII() {
        int n = super.lIIlIlIIIIIllIIIIllIlIlII() + 2;
        if (n > 20) {
            n = 20;
        }
        return n;
    }

    @Override
    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    public boolean lllIIIlIllIlllIlIIllIllIl() {
        return this.lIIIIlIIIIllIlIIllllIlIII;
    }

    public void lllIIIllIIIIlllIlIIllIIll(boolean bl) {
        if (this.lIIIIlIIIIllIlIIllllIlIII != bl) {
            this.lIIIIlIIIIllIlIIllllIlIII = bl;
            if (bl) {
                this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, this.lIIlIIIlIlIIlllIlIllIllIl);
            } else {
                this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(this.lIIlIIIlIlIIlllIlIllIllIl);
            }
        }
    }

    @Override
    public boolean g_() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(12) == 1;
    }

    @Override
    protected int IlIIIIIllllllIIlllIllllll(class_0814 class_08142) {
        if (this.g_()) {
            this.IIIllIIlIIIIIIlIlIIllIIlI = (int)((float)this.IIIllIIlIIIIIIlIlIIllIIlI * 2.5f);
        }
        return super.IlIIIIIllllllIIlllIllllll(class_08142);
    }

    public void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(12, (byte)(bl ? 1 : 0));
        if (this.lIlIllIIlIIlIIlIIlIIlIIll != null && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            class_1685 class_16852 = this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII);
            class_16852.lllIlIIlIIIlIlIIIllIlllIl(lIIlIlllIIlllIIlllIIlIlII);
            if (bl) {
                class_16852.lllIIIllIIIIlllIlIIllIIll(lIIlIlllIIlllIIlllIIlIlII);
            }
        }
        this.lIIIIlIlIIlllllIIllIIlIII(bl);
    }

    public boolean lIllIIlllIIIlIlIIIlllIlIl() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(13) == 1;
    }

    public void IllIIIllIIIIlIlIlIllIIlll(boolean bl) {
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(13, (byte)(bl ? 1 : 0));
    }

    @Override
    public void d_() {
        float f;
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.lIIIIlIlIIlllllIIllIIlIII() && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && !this.g_() && (f = this.lllIlIIlIIIlIlIIIllIlllIl(1.0f)) > 0.5f && this.IlllIIlllllllIIllIlIllllI.nextFloat() * 30.0f < (f - 0.4f) * 2.0f && this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIlllllllIIlIIlIIIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
            boolean bl = true;
            ItemStack class_08972 = this.IlIllllllIIlIIllllIIlIIIl(4);
            if (class_08972 != null) {
                if (class_08972.lIllllIIlIIIlIllllllIIIll()) {
                    class_08972.lllIlIIlIIIlIlIIIllIlllIl(class_08972.IIIllIllIIlIlIlIlIllllIIl() + this.IlllIIlllllllIIllIlIllllI.nextInt(2));
                    if (class_08972.IIIllIllIIlIlIlIlIllllIIl() >= class_08972.lIIIIlIlIIlllllIIllIIlIII()) {
                        this.lllIlIIlIIIlIlIIIllIlllIl(class_08972);
                        this.lllIIIllIIIIlllIlIIllIIll(4, null);
                    }
                }
                bl = false;
            }
            if (bl) {
                this.IlIIIIIllllllIIlllIllllll(8);
            }
        }
        if (this.lIlIlIIllIIIlllIllIIlIllI() && this.IIIIlIllIlIIlIIlIllIlIlll() != null && this.IlIIIlIIIIllIIIllIIIIIIll instanceof class_1554) {
            ((class_0339)this.IlIIIlIIIIllIIIllIIIIIIll).IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(this.IllIIIIllIIllIllIlllIlIIl().lIlllIlllIIIIlIIlllIllIII(), 1.5);
        }
        super.d_();
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(class_0058 class_00582, float f) {
        if (!super.lllIIIllIIIIlllIlIIllIIll(class_00582, f)) {
            return false;
        }
        class_1965 class_19652 = this.IIIIlIllIlIIlIIlIllIlIlll();
        if (class_19652 == null && this.IlIlIIlIlIllIIlIlIIllIIIl() instanceof class_1965) {
            class_19652 = (class_1965)this.IlIlIIlIlIllIIlIlIIllIIIl();
        }
        if (class_19652 == null && class_00582.IllIIIllIIIIlIlIlIllIIlll() instanceof class_1965) {
            class_19652 = (class_1965)class_00582.IllIIIllIIIIlIlIlIllIIlll();
        }
        if (class_19652 != null && this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII && (double)this.IlllIIlllllllIIllIlIllllI.nextFloat() < this.lllIIIllIIIIlllIlIIllIIll(lIIIlIllllIlllIIIIIllIIIl).IlIIIIIllllllIIlllIllllll()) {
            int n = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll);
            int n2 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI);
            int n3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl);
            class_0724 class_07242 = new class_0724(this.lIlIllIIlIIlIIlIIlIIlIIll);
            for (int i = 0; i < 50; ++i) {
                int n4;
                int n5;
                int n6 = n + MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 7, 40) * MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, -1, 1);
                if (!class_1334.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll, n6, (n5 = n2 + MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 7, 40) * MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, -1, 1)) - 1, n4 = n3 + MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 7, 40) * MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, -1, 1)) || this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIllIIIIlIlIlIllIIlll(n6, n5, n4) >= 10) continue;
                class_07242.IlIllllllIIlIIllllIIlIIIl(n6, n5, n4);
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_07242.IIllIllIIllIIlllIIIlIlllI) || !this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)class_07242, class_07242.IIllIllIIllIIlllIIIlIlllI).isEmpty() || this.lIlIllIIlIIlIIlIIlIIlIIll.lIlllIlllIIIIlIIlllIllIII(class_07242.IIllIllIIllIIlllIIIlIlllI)) continue;
                this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_07242);
                class_07242.lllIlIIlIIIlIlIIIllIlllIl(class_19652);
                class_07242.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
                this.lllIIIllIIIIlllIlIIllIIll(lIIIlIllllIlllIIIIIllIIIl).lllIIIllIIIIlllIlIIllIIll(new class_1256("Zombie reinforcement caller charge", -0.05f, 0));
                class_07242.lllIIIllIIIIlllIlIIllIIll(lIIIlIllllIlllIIIIIllIIIl).lllIIIllIIIIlllIlIIllIIll(new class_1256("Zombie reinforcement callee charge", -0.05f, 0));
                break;
            }
        }
        return true;
    }

    @Override
    public void s_() {
        if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && this.IIlIlIlIIlllIIIlIIIIlIIIl()) {
            int n = this.IlIllIIIIllllIIllIllIIIIl();
            this.lIIlIlIIIIIllIIIIllIlIlII -= n;
            if (this.lIIlIlIIIIIllIIIIllIlIlII <= 0) {
                this.lllIIIIlIIllIIIlIllIlllII();
            }
        }
        super.s_();
    }

    @Override
    public boolean llIIllIllIlIIlIIllIllllll(class_1521 class_15212) {
        boolean bl = super.llIIllIllIlIIlIIllIllllll(class_15212);
        if (bl) {
            int n = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll();
            if (this.lIIIIlIlIlIIIlIIllIIlIlIl() == null && this.llIIIIIlIIlIIIIllIIIlIIII() && this.IlllIIlllllllIIllIlIllllI.nextFloat() < (float)n * 0.3f) {
                class_15212.IlIIIIIllllllIIlllIllllll(2 * n);
            }
        }
        return bl;
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.zombie.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.zombie.hurt";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.zombie.death";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.zombie.step", 0.15f, 1.0f);
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Items.lIIIlllIlIIIlIllIIIlIllll;
    }

    @Override
    public class_0529 IIlllllIIlIIlIlIIlIIlIlII() {
        return class_0529.lllIlIIlIIIlIlIIIllIlllIl;
    }

    @Override
    protected void IlIlIIlIlIllIIlIlIIllIIIl(int n) {
        switch (this.IlllIIlllllllIIllIlIllllI.nextInt(3)) {
            case 0: {
                this.lllIIIllIIIIlllIlIIllIIll(Items.iron_ingot, 1);
                break;
            }
            case 1: {
                this.lllIIIllIIIIlllIlIIllIIll(Items.lIlIllllIlIIIIIllIIIIlIlI, 1);
                break;
            }
            case 2: {
                this.lllIIIllIIIIlllIlIIllIIll(Items.IIlllllIIlIIlIlIIlIIlIlII, 1);
            }
        }
    }

    @Override
    protected void lllllIllllIIIIllIIlIlIlII() {
        super.lllllIllllIIIIllIIlIlIlII();
        float f = this.IlllIIlllllllIIllIlIllllI.nextFloat();
        float f2 = this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII ? 0.05f : 0.01f;
        if (f < f2) {
            int n = this.IlllIIlllllllIIllIlIllllI.nextInt(3);
            if (n == 0) {
                this.lllIIIllIIIIlllIlIIllIIll(0, new ItemStack(Items.llIIlllIllIllllIIIlIIIIII));
            } else {
                this.lllIIIllIIIIlllIlIIllIIll(0, new ItemStack(Items.lllIIIllIIIIlllIlIIllIIll));
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        if (this.g_()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("IsBaby", true);
        }
        if (this.lIllIIlllIIIlIlIIIlllIlIl()) {
            class_07752.lllIIIllIIIIlllIlIIllIIll("IsVillager", true);
        }
        class_07752.lllIIIllIIIIlllIlIIllIIll("ConversionTime", this.IIlIlIlIIlllIIIlIIIIlIIIl() ? this.lIIlIlIIIIIllIIIIllIlIlII : -1);
        class_07752.lllIIIllIIIIlllIlIIllIIll("CanBreakDoors", this.lllIIIlIllIlllIlIIllIllIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        if (class_07752.lllIIlIIIllllllIIIIlIlIlI("IsBaby")) {
            this.IIIllIllIIlIlIlIlIllllIIl(true);
        }
        if (class_07752.lllIIlIIIllllllIIIIlIlIlI("IsVillager")) {
            this.IllIIIllIIIIlIlIlIllIIlll(true);
        }
        if (class_07752.lllIlIIlIIIlIlIIIllIlllIl("ConversionTime", 99) && class_07752.lIllllIIlIIIlIllllllIIIll("ConversionTime") > -1) {
            this.lllIIIllIIIIlllIlIIllIIll(class_07752.lIllllIIlIIIlIllllllIIIll("ConversionTime"));
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_07752.lllIIlIIIllllllIIIIlIlIlI("CanBreakDoors"));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_1965 class_19652) {
        super.lllIIIllIIIIlllIlIIllIIll(class_19652);
        if ((this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.IlIllllllIIlIIllllIIlIIIl || this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl == class_1999.lIlllIlllIIIIlIIlllIllIII) && class_19652 instanceof class_1817) {
            if (this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl != class_1999.lIlllIlllIIIIlIIlllIllIII && this.IlllIIlllllllIIllIlIllllI.nextBoolean()) {
                return;
            }
            class_0724 class_07242 = new class_0724(this.lIlIllIIlIIlIIlIIlIIlIIll);
            class_07242.IllIIIllIIIIlIlIlIllIIlll(class_19652);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_19652);
            class_07242.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
            class_07242.IllIIIllIIIIlIlIlIllIIlll(true);
            if (class_19652.g_()) {
                class_07242.IIIllIllIIlIlIlIlIllllIIl(true);
            }
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_07242);
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1016, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
        }
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        Object object;
        class_2025 class_20253 = super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        float f = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.IIIllIIlIIIIIIlIlIIllIIlI(this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.55f * f);
        if (class_20253 == null) {
            class_20253 = new class_1483(this, this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() < 0.05f, this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() < 0.05f, null);
        }
        if (class_20253 instanceof class_1483) {
            object = (class_1483)class_20253;
            if (((class_1483)object).lllIlIIlIIIlIlIIIllIlllIl) {
                this.IllIIIllIIIIlIlIlIllIIlll(true);
            }
            if (((class_1483)object).lllIIIllIIIIlllIlIIllIIll) {
                this.IIIllIllIIlIlIlIlIllllIIl(true);
                if ((double)this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() < 0.05) {
                    List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_1554.class, this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(5.0, 3.0, 5.0), class_0830.lllIlIIlIIIlIlIIIllIlllIl);
                    if (!list.isEmpty()) {
                        class_1554 class_15542 = (class_1554)list.get(0);
                        class_15542.IIIllIllIIlIlIlIlIllllIIl(true);
                        this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_15542);
                    }
                } else if ((double)this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat() < 0.05) {
                    class_1554 class_15543 = new class_1554(this.lIlIllIIlIIlIIlIIlIIlIIll);
                    class_15543.lllIlIIlIIIlIlIIIllIlllIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.IIIIlIllIlIIlIIlIllIlIlll, 0.0f);
                    class_15543.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
                    class_15543.IIIllIllIIlIlIlIlIllllIIl(true);
                    this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_15543);
                    this.lllIIIllIIIIlllIlIIllIIll((class_1521)class_15543);
                }
            }
        }
        this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI.nextFloat() < f * 0.1f);
        this.lllllIllllIIIIllIIlIlIlII();
        this.lIIllIlIllIlIlIIlIlIIIIll();
        if (this.IlIllllllIIlIIllllIIlIIIl(4) == null && ((Calendar)(object = this.lIlIllIIlIIlIIlIIlIIlIIll.IIIIlIllIlIIlIIlIllIlIlll())).get(2) + 1 == 10 && ((Calendar)object).get(5) == 31 && this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.25f) {
            this.lllIIIllIIIIlllIlIIllIIll(4, new ItemStack(this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.1f ? Blocks.IllIlllIIIlllllIllIIlIlIl : Blocks.lIlIIlllllIlllllIlIIIllll));
            this.IllIIIllIIIIlIlIlIllIIlll[4] = 0.0f;
        }
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.IlIllllllIIlIIllllIIlIIIl).lllIIIllIIIIlllIlIIllIIll(new class_1256("Random spawn bonus", this.IlllIIlllllllIIllIlIllllI.nextDouble() * (double)0.05f, 0));
        double d = this.IlllIIlllllllIIllIlIllllI.nextDouble() * 1.5 * (double)this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        if (d > 1.0) {
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIlIIlIIIlIlIIIllIlllIl).lllIIIllIIIIlllIlIIllIIll(new class_1256("Random zombie-spawn bonus", d, 2));
        }
        if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < f * 0.05f) {
            this.lllIIIllIIIIlllIlIIllIIll(lIIIlIllllIlllIIIIIllIIIl).lllIIIllIIIIlllIlIIllIIll(new class_1256("Leader zombie bonus", this.IlllIIlllllllIIllIlIllllI.nextDouble() * 0.25 + 0.5, 0));
            this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(new class_1256("Leader zombie bonus", this.IlllIIlllllllIIllIlIllllI.nextDouble() * 3.0 + 1.0, 2));
            this.lllIIIllIIIIlllIlIIllIIll(true);
        }
        return class_20253;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.IllIlIlIIIlIllIlIlIIlllII();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.IlIIllIlIlIllIIIlIIlIlIIl && class_08972.IllIIIllIIIIlIlIlIllIIlll() == 0 && this.lIllIIlllIIIlIlIIIlllIlIl() && this.lllIIIllIIIIlllIlIIllIIll(class_0700.lIlIlIIlIIIIlIIIIIlllIIII)) {
            if (!class_08142.lIIlIlIlIlIllIIlIIllllIll.lIlllIlllIIIIlIIlllIllIII) {
                --class_08972.lllIlIIlIIIlIlIIIllIlllIl;
            }
            if (class_08972.lllIlIIlIIIlIlIIIllIlllIl <= 0) {
                class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIlIIlIIIlIlIIIllIlllIl(class_08142.lllIIlIIIllllllIIIIlIlIlI.IlIllllllIIlIIllllIIlIIIl, null);
            }
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI.nextInt(2401) + 3600);
            }
            return true;
        }
        return false;
    }

    protected void lllIIIllIIIIlllIlIIllIIll(int n) {
        this.lIIlIlIIIIIllIIIIllIlIlII = n;
        this.lIlIIllllIlIIIIllIIIIlIIl().lllIlIIlIIIlIlIIIllIlllIl(14, (byte)1);
        this.IlIlllIIIIIIlIIllIIllIlll(class_0700.lIlIlIIlIIIIlIIIIIlllIIII.IlIlIIlllIllllllllIIIlIlI);
        this.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.IIIllIIlIIIIIIlIlIIllIIlI.IlIlIIlllIllllllllIIIlIlI, n, Math.min(this.lIlIllIIlIIlIIlIIlIIlIIll.IlIlIIlIlIllIIlIlIIllIIIl.lllIIIllIIIIlllIlIIllIIll() - 1, 0)));
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_1521)this, (byte)16);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 16) {
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + 0.5, this.llIIlIlIlllIIllIlIlllIllI + 0.5, this.IllIIIIllIIllIllIlllIlIIl + 0.5, "mob.zombie.remedy", 1.0f + this.IlllIIlllllllIIllIlIllllI.nextFloat(), this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.7f + 0.3f, false);
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    @Override
    protected boolean IIIIIIlIIIIIIIIIIlIlIlIlI() {
        return !this.IIlIlIlIIlllIIIlIIIIlIIIl();
    }

    public boolean IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.lIlIIllllIlIIIIllIIIIlIIl().lllIIIllIIIIlllIlIIllIIll(14) == 1;
    }

    protected void lllIIIIlIIllIIIlIllIlllII() {
        class_1817 class_18172 = new class_1817(this.lIlIllIIlIIlIIlIIlIIlIIll);
        class_18172.IllIIIllIIIIlIlIlIllIIlll(this);
        class_18172.lllIIIllIIIIlllIlIIllIIll((class_2025)null);
        class_18172.lllIIIIlIIllIIIlIllIlllII();
        if (this.g_()) {
            class_18172.lllIlIIlIIIlIlIIIllIlllIl(-24000);
        }
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(this);
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_18172);
        class_18172.lllIIIllIIIIlllIlIIllIIll(new class_1852(class_0700.lIIIIlIlIIlllllIIllIIlIII.IlIlIIlllIllllllllIIIlIlI, 200, 0));
        this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(null, 1017, (int)this.IlIIlllllIIlIlIlllllIllll, (int)this.llIIlIlIlllIIllIlIlllIllI, (int)this.IllIIIIllIIllIllIlllIlIIl, 0);
    }

    protected int IlIllIIIIllllIIllIllIIIIl() {
        int n = 1;
        if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.01f) {
            int n2 = 0;
            for (int i = (int)this.IlIIlllllIIlIlIlllllIllll - 4; i < (int)this.IlIIlllllIIlIlIlllllIllll + 4 && n2 < 14; ++i) {
                for (int j = (int)this.llIIlIlIlllIIllIlIlllIllI - 4; j < (int)this.llIIlIlIlllIIllIlIlllIllI + 4 && n2 < 14; ++j) {
                    for (int k = (int)this.IllIIIIllIIllIllIlllIlIIl - 4; k < (int)this.IllIIIIllIIllIllIlllIlIIl + 4 && n2 < 14; ++k) {
                        Block class_05492 = this.lIlIllIIlIIlIIlIIlIIlIIll.a_(i, j, k);
                        if (class_05492 != Blocks.IIIIIlllIIllllIlllIlllIIl && class_05492 != Blocks.IllIIIIllIIllIllIlllIlIIl) continue;
                        if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.3f) {
                            ++n;
                        }
                        ++n2;
                    }
                }
            }
        }
        return n;
    }

    public void lIIIIlIlIIlllllIIllIIlIII(boolean bl) {
        this.lIlllIlllIIIIlIIlllIllIII(bl ? 0.5f : 1.0f);
    }

    @Override
    protected final void IlIIIIIllllllIIlllIllllll(float f, float f2) {
        boolean bl = this.lIIIlllllllIlllIIllllllll > 0.0f && this.IIllllIIlIlIlIlllIIIllIIl > 0.0f;
        this.lIIIlllllllIlllIIllllllll = f;
        this.IIllllIIlIlIlIlllIIIllIIl = f2;
        if (!bl) {
            this.lIlllIlllIIIIlIIlllIllIII(1.0f);
        }
    }

    protected final void lIlllIlllIIIIlIIlllIllIII(float f) {
        super.IlIIIIIllllllIIlllIllllll(this.lIIIlllllllIlllIIllllllll * f, this.IIllllIIlIlIlIlllIIIllIIl * f);
    }
}

