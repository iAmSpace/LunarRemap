package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;
import net.minecraft.stats.StatList;

import java.util.Arrays;
import java.util.List;

public class class_2050
extends class_1521 {
    private static final List lIlllIlllIIIIlIIlllIllIII = Arrays.asList(new class_1260(new ItemStack(Items.llllIlIIIIIIIIIlllIIlIIIl), 10).lllIIIllIIIIlllIlIIllIIll(0.9f), new class_1260(new ItemStack(Items.leather), 10), new class_1260(new ItemStack(Items.bone), 10), new class_1260(new ItemStack(Items.potionitem), 10), new class_1260(new ItemStack(Items.llIIIlllIlllIlIllIIIIllIl), 5), new class_1260(new ItemStack(Items.llIllllIIIIIlIIlIlllIIlll), 2).lllIIIllIIIIlllIlIIllIIll(0.9f), new class_1260(new ItemStack(Items.lIlllIlllIlIIIIlllIlIlIIl), 10), new class_1260(new ItemStack(Items.llIllllIlIllIIIlIllIIlIlI), 5), new class_1260(new ItemStack(Items.dye, 10, 0), 1), new class_1260(new ItemStack(Blocks.IIllllIIlIlIlIlllIIIllIIl), 10), new class_1260(new ItemStack(Items.lIIIlllIlIIIlIllIIIlIllll), 10));
    private static final List IlIIIIIllllllIIlllIllllll = Arrays.asList(new class_1260(new ItemStack(Blocks.IlIIIIIIIIIIlIIlllIIIlIlI), 1), new class_1260(new ItemStack(Items.IIIIlllllIlllIIllIIIlIllI), 1), new class_1260(new ItemStack(Items.saddle), 1), new class_1260(new ItemStack(Items.bow), 1).lllIIIllIIIIlllIlIIllIIll(0.25f).lllIIIllIIIIlllIlIIllIIll(), new class_1260(new ItemStack(Items.llIllllIIIIIlIIlIlllIIlll), 1).lllIIIllIIIIlllIlIIllIIll(0.25f).lllIIIllIIIIlllIlIIllIIll(), new class_1260(new ItemStack(Items.book), 1).lllIIIllIIIIlllIlIIllIIll());
    private static final List lIllllIIlIIIlIllllllIIIll = Arrays.asList(new class_1260(new ItemStack(Items.IllIlllIIIlllllIllIIlIlIl, 1, FishType.COD.lllIIIllIIIIlllIlIIllIIll()), 60), new class_1260(new ItemStack(Items.IllIlllIIIlllllIllIIlIlIl, 1, FishType.SALMON.lllIIIllIIIIlllIlIIllIIll()), 25), new class_1260(new ItemStack(Items.IllIlllIIIlllllIllIIlIlIl, 1, FishType.CLOWNFISH.lllIIIllIIIIlllIlIIllIIll()), 2), new class_1260(new ItemStack(Items.IllIlllIIIlllllIllIIlIlIl, 1, FishType.PUFFERFISH.lllIIIllIIIIlllIlIIllIIll()), 13));
    private int IIIllIIlIIIIIIlIlIIllIIlI = -1;
    private int IllIIlllllllIIlIIlIIIIlIl = -1;
    private int IIIllIllIIlIlIlIlIllllIIl = -1;
    private Block IllIIIllIIIIlIlIlIllIIlll;
    private boolean lIIIIlIlIIlllllIIllIIlIII;
    public int lllIIIllIIIIlllIlIIllIIll;
    public class_0814 lllIlIIlIIIlIlIIIllIlllIl;
    private int llIIlllIllIllllIIIlIIIIII;
    private int llIIllIllIlIIlIIllIllllll;
    private int lllIIlIIIllllllIIIIlIlIlI;
    private int IlIlllIIIIIIlIIllIIllIlll;
    private int IlIlIIlIlIllIIlIlIIllIIIl;
    private float lllllIlllIIllIlIIlIIIllII;
    public class_1521 IlIllllllIIlIIllllIIlIIIl;
    private int IIIlIllllIIIlllllIllIlIII;
    private double IIIIIllIlIllIlIlIIlIllIIl;
    private double lIIllIlIIlIIlllllIlIIllIl;
    private double lIIlllIIlIlIlIIIlIlllIIll;
    private double IlIIlIIlllllIlIIlIlIlIlIl;
    private double lIlIIIllIIllIIlIllllllIll;
    private double lIlIIlllllIlllllIlIIIllll;
    private double lllllllIlIIlIlIIIlIlIIlll;
    private double llIllllIIIIIlIIlIlllIIlll;

    public class_2050(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.IlIIIIIllIlllIIIIlIIIllIl = true;
    }

    public class_2050(class_1334 class_13342, double d, double d2, double d3, class_0814 class_08142) {
        this(class_13342);
        this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
        this.IlIIIIIllIlllIIIIlIIIllIl = true;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08142;
        class_08142.IIlIlIIIIlIlllIIlIIlIIIII = this;
    }

    public class_2050(class_1334 class_13342, class_0814 class_08142) {
        super(class_13342);
        this.IlIIIIIllIlllIIIIlIIIllIl = true;
        this.lllIlIIlIIIlIlIIIllIlllIl = class_08142;
        this.lllIlIIlIIIlIlIIIllIlllIl.IIlIlIIIIlIlllIIlIIlIIIII = this;
        this.IlIIIIIllllllIIlllIllllll(0.25f, 0.25f);
        this.lllIlIIlIIIlIlIIIllIlllIl(class_08142.IlIIlllllIIlIlIlllllIllll, class_08142.llIIlIlIlllIIllIlIlllIllI + 1.62 - (double)class_08142.llllIlIIIIIIIIIlllIIlIIIl, class_08142.IllIIIIllIIllIllIlllIlIIl, class_08142.IIIIlIllIlIIlIIlIllIlIlll, class_08142.IlIlIIlllIllllllllIIIlIlI);
        this.IlIIlllllIIlIlIlllllIllll -= (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * 0.16f);
        this.llIIlIlIlllIIllIlIlllIllI -= (double)0.1f;
        this.IllIIIIllIIllIllIlllIlIIl -= (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * 0.16f);
        this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
        this.llllIlIIIIIIIIIlllIIlIIIl = 0.0f;
        float f = 0.4f;
        this.IIIIIIIIlIllIIllIIlllIllI = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f;
        this.llIIIlllIlllIlIllIIIIllIl = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IIIIlIllIlIIlIIlIllIlIlll / 180.0f * (float)Math.PI) * MathHelper.lllIlIIlIIIlIlIIIllIlllIl(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = -MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlIlIIlllIllllllllIIIlIlI / 180.0f * (float)Math.PI) * f;
        this.IlIllllllIIlIIllllIIlIIIl(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl, 1.5f, 1.0f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
    }

    @Override
    public boolean lllIIIllIIIIlllIlIIllIIll(double d) {
        double d2 = this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll() * 4.0;
        return d < (d2 *= 64.0) * d2;
    }

    public void IlIllllllIIlIIllllIIlIIIl(double d, double d2, double d3, float f, float f2) {
        float f3 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2 + d3 * d3);
        d /= (double)f3;
        d2 /= (double)f3;
        d3 /= (double)f3;
        d += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.0075f * (double)f2;
        d2 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.0075f * (double)f2;
        d3 += this.IlllIIlllllllIIllIlIllllI.nextGaussian() * (double)0.0075f * (double)f2;
        this.IIIIIIIIlIllIIllIIlllIllI = d *= (double)f;
        this.IIlIIlIlIlIllIIlIlIIIIlll = d2 *= (double)f;
        this.llIIIlllIlllIlIllIIIIllIl = d3 *= (double)f;
        float f4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d3 * d3);
        this.llllIIIIlIIIlIIIIIIlIllll = this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(d, d3) * 180.0 / Math.PI);
        this.llIIIIllIIIIIIIlIIIlIIIIl = this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(d2, f4) * 180.0 / Math.PI);
        this.llIIlllIllIllllIIIlIIIIII = 0;
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(double d, double d2, double d3, float f, float f2, int n) {
        this.IIIIIllIlIllIlIlIIlIllIIl = d;
        this.lIIllIlIIlIIlllllIlIIllIl = d2;
        this.lIIlllIIlIlIlIIIlIlllIIll = d3;
        this.IlIIlIIlllllIlIIlIlIlIlIl = f;
        this.lIlIIIllIIllIIlIllllllIll = f2;
        this.IIIlIllllIIIlllllIllIlIII = n;
        this.IIIIIIIIlIllIIllIIlllIllI = this.lIlIIlllllIlllllIlIIIllll;
        this.IIlIIlIlIlIllIIlIlIIIIlll = this.lllllllIlIIlIlIIIlIlIIlll;
        this.llIIIlllIlllIlIllIIIIllIl = this.llIllllIIIIIlIIlIlllIIlll;
    }

    @Override
    public void IIIllIllIIlIlIlIlIllllIIl(double d, double d2, double d3) {
        this.lIlIIlllllIlllllIlIIIllll = this.IIIIIIIIlIllIIllIIlllIllI = d;
        this.lllllllIlIIlIlIIIlIlIIlll = this.IIlIIlIlIlIllIIlIlIIIIlll = d2;
        this.llIllllIIIIIlIIlIlllIIlll = this.llIIIlllIlllIlIllIIIIllIl = d3;
    }

    @Override
    public void s_() {
        super.s_();
        if (this.IIIlIllllIIIlllllIllIlIII > 0) {
            double d = this.IlIIlllllIIlIlIlllllIllll + (this.IIIIIllIlIllIlIlIIlIllIIl - this.IlIIlllllIIlIlIlllllIllll) / (double)this.IIIlIllllIIIlllllIllIlIII;
            double d2 = this.llIIlIlIlllIIllIlIlllIllI + (this.lIIllIlIIlIIlllllIlIIllIl - this.llIIlIlIlllIIllIlIlllIllI) / (double)this.IIIlIllllIIIlllllIllIlIII;
            double d3 = this.IllIIIIllIIllIllIlllIlIIl + (this.lIIlllIIlIlIlIIIlIlllIIll - this.IllIIIIllIIllIllIlllIlIIl) / (double)this.IIIlIllllIIIlllllIllIlIII;
            double d4 = MathHelper.IIIllIIlIIIIIIlIlIIllIIlI(this.IlIIlIIlllllIlIIlIlIlIlIl - (double)this.IIIIlIllIlIIlIIlIllIlIlll);
            this.IIIIlIllIlIIlIIlIllIlIlll = (float)((double)this.IIIIlIllIlIIlIIlIllIlIlll + d4 / (double)this.IIIlIllllIIIlllllIllIlIII);
            this.IlIlIIlllIllllllllIIIlIlI = (float)((double)this.IlIlIIlllIllllllllIIIlIlI + (this.lIlIIIllIIllIIlIllllllIll - (double)this.IlIlIIlllIllllllllIIIlIlI) / (double)this.IIIlIllllIIIlllllIllIlIII);
            --this.IIIlIllllIIIlllllIllIlIII;
            this.IlIllllllIIlIIllllIIlIIIl(d, d2, d3);
            this.lIllllIIlIIIlIllllllIIIll(this.IIIIlIllIlIIlIIlIllIlIlll, this.IlIlIIlllIllllllllIIIlIlI);
        } else {
            double d;
            Object object;
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                object = this.lllIlIIlIIIlIlIIIllIlllIl.IllIlIlIIIlIllIlIlIIlllII();
                if (this.lllIlIIlIIIlIlIIIllIlllIl.IllllIIIIlIIlIIIIlllIIIIl || !this.lllIlIIlIIIlIlIIIllIlllIl.IlllIIlllllllIIllIlIllllI() || object == null || ((ItemStack)object).lllIIIllIIIIlllIlIIllIIll() != Items.llIllllIIIIIlIIlIlllIIlll || this.IlIIIIIllllllIIlllIllllll(this.lllIlIIlIIIlIlIIIllIlllIl) > 1024.0) {
                    this.IIIIlIIlIIIllIIIIllIIIlII();
                    this.lllIlIIlIIIlIlIIIllIlllIl.IIlIlIIIIlIlllIIlIIlIIIII = null;
                    return;
                }
                if (this.IlIllllllIIlIIllllIIlIIIl != null) {
                    if (!this.IlIllllllIIlIIllllIIlIIIl.IllllIIIIlIIlIIIIlllIIIIl) {
                        this.IlIIlllllIIlIlIlllllIllll = this.IlIllllllIIlIIllllIIlIIIl.IlIIlllllIIlIlIlllllIllll;
                        this.llIIlIlIlllIIllIlIlllIllI = this.IlIllllllIIlIIllllIIlIIIl.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (double)this.IlIllllllIIlIIllllIIlIIIl.lllIIIIlIlIIlIIlllIIIIIIl * 0.8;
                        this.IllIIIIllIIllIllIlllIlIIl = this.IlIllllllIIlIIllllIIlIIIl.IllIIIIllIIllIllIlllIlIIl;
                        return;
                    }
                    this.IlIllllllIIlIIllllIIlIIIl = null;
                }
            }
            if (this.lllIIIllIIIIlllIlIIllIIll > 0) {
                --this.lllIIIllIIIIlllIlIIllIIll;
            }
            if (this.lIIIIlIlIIlllllIIllIIlIII) {
                if (this.lIlIllIIlIIlIIlIIlIIlIIll.a_(this.IIIllIIlIIIIIIlIlIIllIIlI, this.IllIIlllllllIIlIIlIIIIlIl, this.IIIllIllIIlIlIlIlIllllIIl) == this.IllIIIllIIIIlIlIlIllIIlll) {
                    ++this.llIIlllIllIllllIIIlIIIIII;
                    if (this.llIIlllIllIllllIIIlIIIIII == 1200) {
                        this.IIIIlIIlIIIllIIIIllIIIlII();
                    }
                    return;
                }
                this.lIIIIlIlIIlllllIIllIIlIII = false;
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.llIIIlllIlllIlIllIIIIllIl *= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.2f);
                this.llIIlllIllIllllIIIlIIIIII = 0;
                this.llIIllIllIlIIlIIllIllllll = 0;
            } else {
                ++this.llIIllIllIlIIlIIllIllllll;
            }
            object = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            class_0864 class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
            class_1112 class_11122 = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll((class_0864)object, class_08642);
            object = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(this.IlIIlllllIIlIlIlllllIllll + this.IIIIIIIIlIllIIllIIlllIllI, this.llIIlIlIlllIIllIlIlllIllI + this.IIlIIlIlIlIllIIlIlIIIIlll, this.IllIIIIllIIllIllIlllIlIIl + this.llIIIlllIlllIlIllIIIIllIl);
            if (class_11122 != null) {
                class_08642 = class_0864.lllIIIllIIIIlllIlIIllIIll(class_11122.lIllllIIlIIIlIllllllIIIll.lllIIIllIIIIlllIlIIllIIll, class_11122.lIllllIIlIIIlIllllllIIIll.lllIlIIlIIIlIlIIIllIlllIl, class_11122.lIllllIIlIIIlIllllllIIIll.IlIllllllIIlIIllllIIlIIIl);
            }
            class_1521 class_15212 = null;
            List list = this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl((class_1521)this, this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl).lllIlIIlIIIlIlIIIllIlllIl(1.0, 1.0, 1.0));
            double d5 = 0.0;
            for (int i = 0; i < list.size(); ++i) {
                float f;
                class_1974 class_19742;
                class_1112 class_11123;
                class_1521 class_15213 = (class_1521)list.get(i);
                if (!class_15213.IllllIIlIIIllIlllIlllIllI() || class_15213 == this.lllIlIIlIIIlIlIIIllIlllIl && this.llIIllIllIlIIlIIllIllllll < 5 || (class_11123 = (class_19742 = class_15213.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl(f = 0.3f, f, f)).lllIIIllIIIIlllIlIIllIIll((class_0864)object, class_08642)) == null || !((d = ((class_0864)object).lIlllIlllIIIIlIIlllIllIII(class_11123.lIllllIIlIIIlIllllllIIIll)) < d5) && d5 != 0.0) continue;
                class_15212 = class_15213;
                d5 = d;
            }
            if (class_15212 != null) {
                class_11122 = new class_1112(class_15212);
            }
            if (class_11122 != null) {
                if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI != null) {
                    if (class_11122.IIIllIIlIIIIIIlIlIIllIIlI.lllIIIllIIIIlllIlIIllIIll(class_0058.lllIIIllIIIIlllIlIIllIIll(this, (class_1521)this.lllIlIIlIIIlIlIIIllIlllIl), 0.0f)) {
                        this.IlIllllllIIlIIllllIIlIIIl = class_11122.IIIllIIlIIIIIIlIlIIllIIlI;
                    }
                } else {
                    this.lIIIIlIlIIlllllIIllIIlIII = true;
                }
            }
            if (!this.lIIIIlIlIIlllllIIllIIlIII) {
                this.IlIIIIIllllllIIlllIllllll(this.IIIIIIIIlIllIIllIIlllIllI, this.IIlIIlIlIlIllIIlIlIIIIlll, this.llIIIlllIlllIlIllIIIIllIl);
                float f = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IIIIIIIIlIllIIllIIlllIllI * this.IIIIIIIIlIllIIllIIlllIllI + this.llIIIlllIlllIlIllIIIIllIl * this.llIIIlllIlllIlIllIIIIllIl);
                this.IIIIlIllIlIIlIIlIllIlIlll = (float)(Math.atan2(this.IIIIIIIIlIllIIllIIlllIllI, this.llIIIlllIlllIlIllIIIIllIl) * 180.0 / Math.PI);
                this.IlIlIIlllIllllllllIIIlIlI = (float)(Math.atan2(this.IIlIIlIlIlIllIIlIlIIIIlll, f) * 180.0 / Math.PI);
                while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl < -180.0f) {
                    this.llIIIIllIIIIIIIlIIIlIIIIl -= 360.0f;
                }
                while (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl >= 180.0f) {
                    this.llIIIIllIIIIIIIlIIIlIIIIl += 360.0f;
                }
                while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll < -180.0f) {
                    this.llllIIIIlIIIlIIIIIIlIllll -= 360.0f;
                }
                while (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll >= 180.0f) {
                    this.llllIIIIlIIIlIIIIIIlIllll += 360.0f;
                }
                this.IlIlIIlllIllllllllIIIlIlI = this.llIIIIllIIIIIIIlIIIlIIIIl + (this.IlIlIIlllIllllllllIIIlIlI - this.llIIIIllIIIIIIIlIIIlIIIIl) * 0.2f;
                this.IIIIlIllIlIIlIIlIllIlIlll = this.llllIIIIlIIIlIIIIIIlIllll + (this.IIIIlIllIlIIlIIlIllIlIlll - this.llllIIIIlIIIlIIIIIIlIllll) * 0.2f;
                float f2 = 0.92f;
                if (this.llllllIlIllllIlIlIlIIIIlI || this.lIlIIllllIlIIIIllIIIIlIIl) {
                    f2 = 0.5f;
                }
                int n = 5;
                double d6 = 0.0;
                for (int i = 0; i < n; ++i) {
                    double d7 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll - this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) * (double)(i + 0) / (double)n - 0.125 + 0.125;
                    double d8 = this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl + (this.IIllIllIIllIIlllIIIlIlllI.IlIIIIIllllllIIlllIllllll - this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) * (double)(i + 1) / (double)n - 0.125 + 0.125;
                    class_1974 class_19743 = class_1974.lllIIIllIIIIlllIlIIllIIll(this.IIllIllIIllIIlllIIIlIlllI.lllIIIllIIIIlllIlIIllIIll, d7, this.IIllIllIIllIIlllIIIlIlllI.IlIllllllIIlIIllllIIlIIIl, this.IIllIllIIllIIlllIIIlIlllI.lIlllIlllIIIIlIIlllIllIII, d8, this.IIllIllIIllIIlllIIIlIlllI.lIllllIIlIIIlIllllllIIIll);
                    if (!this.lIlIllIIlIIlIIlIIlIIlIIll.lllIlIIlIIIlIlIIIllIlllIl(class_19743, class_1855.IllIIlllllllIIlIIlIIIIlIl)) continue;
                    d6 += 1.0 / (double)n;
                }
                if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl && d6 > 0.0) {
                    class_0976 class_09762 = (class_0976)this.lIlIllIIlIIlIIlIIlIIlIIll;
                    int n2 = 1;
                    if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.25f && this.lIlIllIIlIIlIIlIIlIIlIIll.IIlllIlIlllIllIIIlllIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI) + 1, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
                        n2 = 2;
                    }
                    if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.5f && !this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIlllllllIIlIIlIIIIlIl(MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll), MathHelper.IlIllllllIIlIIllllIIlIIIl(this.llIIlIlIlllIIllIlIlllIllI) + 1, MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IllIIIIllIIllIllIlllIlIIl))) {
                        --n2;
                    }
                    if (this.lllIIlIIIllllllIIIIlIlIlI > 0) {
                        --this.lllIIlIIIllllllIIIIlIlIlI;
                        if (this.lllIIlIIIllllllIIIIlIlIlI <= 0) {
                            this.IlIlllIIIIIIlIIllIIllIlll = 0;
                            this.IlIlIIlIlIllIIlIlIIllIIIl = 0;
                        }
                    } else if (this.IlIlIIlIlIllIIlIlIIllIIIl > 0) {
                        this.IlIlIIlIlIllIIlIlIIllIIIl -= n2;
                        if (this.IlIlIIlIlIllIIlIlIIllIIIl <= 0) {
                            this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)0.2f;
                            this.lllIIIllIIIIlllIlIIllIIll("random.splash", 0.25f, 1.0f + (this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.4f);
                            float f3 = MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl);
                            class_09762.lllIIIllIIIIlllIlIIllIIll("bubble", this.IlIIlllllIIlIlIlllllIllll, f3 + 1.0f, this.IllIIIIllIIllIllIlllIlIIl, (int)(1.0f + this.IIIIlIlIIlIIIIlIlllIlIIII * 20.0f), this.IIIIlIlIIlIIIIlIlllIlIIII, 0.0, this.IIIIlIlIIlIIIIlIlllIlIIII, 0.2f);
                            class_09762.lllIIIllIIIIlllIlIIllIIll("wake", this.IlIIlllllIIlIlIlllllIllll, f3 + 1.0f, this.IllIIIIllIIllIllIlllIlIIl, (int)(1.0f + this.IIIIlIlIIlIIIIlIlllIlIIII * 20.0f), this.IIIIlIlIIlIIIIlIlllIlIIII, 0.0, this.IIIIlIlIIlIIIIlIlllIlIIII, 0.2f);
                            this.lllIIlIIIllllllIIIIlIlIlI = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 10, 30);
                        } else {
                            this.lllllIlllIIllIlIIlIIIllII = (float)((double)this.lllllIlllIIllIlIIlIIIllII + this.IlllIIlllllllIIllIlIllllI.nextGaussian() * 4.0);
                            float f4 = this.lllllIlllIIllIlIIlIIIllII * ((float)Math.PI / 180);
                            float f5 = MathHelper.lllIIIllIIIIlllIlIIllIIll(f4);
                            float f6 = MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f4);
                            double d9 = this.IlIIlllllIIlIlIlllllIllll + (double)(f5 * (float)this.IlIlIIlIlIllIIlIlIIllIIIl * 0.1f);
                            double d10 = (float) MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) + 1.0f;
                            double d11 = this.IllIIIIllIIllIllIlllIlIIl + (double)(f6 * (float)this.IlIlIIlIlIllIIlIlIIllIIIl * 0.1f);
                            if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < 0.15f) {
                                class_09762.lllIIIllIIIIlllIlIIllIIll("bubble", d9, d10 - (double)0.1f, d11, 1, f5, 0.1, f6, 0.0);
                            }
                            float f7 = f5 * 0.04f;
                            float f8 = f6 * 0.04f;
                            class_09762.lllIIIllIIIIlllIlIIllIIll("wake", d9, d10, d11, 0, f8, 0.01, -f7, 1.0);
                            class_09762.lllIIIllIIIIlllIlIIllIIll("wake", d9, d10, d11, 0, -f8, 0.01, f7, 1.0);
                        }
                    } else if (this.IlIlllIIIIIIlIIllIIllIlll > 0) {
                        this.IlIlllIIIIIIlIIllIIllIlll -= n2;
                        float f9 = 0.15f;
                        if (this.IlIlllIIIIIIlIIllIIllIlll < 20) {
                            f9 = (float)((double)f9 + (double)(20 - this.IlIlllIIIIIIlIIllIIllIlll) * 0.05);
                        } else if (this.IlIlllIIIIIIlIIllIIllIlll < 40) {
                            f9 = (float)((double)f9 + (double)(40 - this.IlIlllIIIIIIlIIllIIllIlll) * 0.02);
                        } else if (this.IlIlllIIIIIIlIIllIIllIlll < 60) {
                            f9 = (float)((double)f9 + (double)(60 - this.IlIlllIIIIIIlIIllIIllIlll) * 0.01);
                        }
                        if (this.IlllIIlllllllIIllIlIllllI.nextFloat() < f9) {
                            float f10 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 0.0f, 360.0f) * ((float)Math.PI / 180);
                            float f11 = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 25.0f, 60.0f);
                            double d12 = this.IlIIlllllIIlIlIlllllIllll + (double)(MathHelper.lllIIIllIIIIlllIlIIllIIll(f10) * f11 * 0.1f);
                            double d13 = (float) MathHelper.IlIllllllIIlIIllllIIlIIIl(this.IIllIllIIllIIlllIIIlIlllI.lllIlIIlIIIlIlIIIllIlllIl) + 1.0f;
                            double d14 = this.IllIIIIllIIllIllIlllIlIIl + (double)(MathHelper.lllIlIIlIIIlIlIIIllIlllIl(f10) * f11 * 0.1f);
                            class_09762.lllIIIllIIIIlllIlIIllIIll("splash", d12, d13, d14, 2 + this.IlllIIlllllllIIllIlIllllI.nextInt(2), 0.1f, 0.0, 0.1f, 0.0);
                        }
                        if (this.IlIlllIIIIIIlIIllIIllIlll <= 0) {
                            this.lllllIlllIIllIlIIlIIIllII = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 0.0f, 360.0f);
                            this.IlIlIIlIlIllIIlIlIIllIIIl = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 20, 80);
                        }
                    } else {
                        this.IlIlllIIIIIIlIIllIIllIlll = MathHelper.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, 100, 900);
                        this.IlIlllIIIIIIlIIllIIllIlll -= class_1250.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIlIIlIIIlIlIIIllIlllIl) * 20 * 5;
                    }
                    if (this.lllIIlIIIllllllIIIIlIlIlI > 0) {
                        this.IIlIIlIlIlIllIIlIlIIIIlll -= (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IlllIIlllllllIIllIlIllllI.nextFloat() * this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.2;
                    }
                }
                d = d6 * 2.0 - 1.0;
                this.IIlIIlIlIlIllIIlIlIIIIlll += (double)0.04f * d;
                if (d6 > 0.0) {
                    f2 = (float)((double)f2 * 0.9);
                    this.IIlIIlIlIlIllIIlIlIIIIlll *= 0.8;
                }
                this.IIIIIIIIlIllIIllIIlllIllI *= (double)f2;
                this.IIlIIlIlIlIllIIlIlIIIIlll *= (double)f2;
                this.llIIIlllIlllIlIllIIIIllIl *= (double)f2;
                this.IlIllllllIIlIIllllIIlIIIl(this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl);
            }
        }
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        class_07752.lllIIIllIIIIlllIlIIllIIll("xTile", (short)this.IIIllIIlIIIIIIlIlIIllIIlI);
        class_07752.lllIIIllIIIIlllIlIIllIIll("yTile", (short)this.IllIIlllllllIIlIIlIIIIlIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("zTile", (short)this.IIIllIllIIlIlIlIlIllllIIl);
        class_07752.lllIIIllIIIIlllIlIIllIIll("inTile", (byte) Block.lllIIIllIIIIlllIlIIllIIll(this.IllIIIllIIIIlIlIlIllIIlll));
        class_07752.lllIIIllIIIIlllIlIIllIIll("shake", (byte)this.lllIIIllIIIIlllIlIIllIIll);
        class_07752.lllIIIllIIIIlllIlIIllIIll("inGround", (byte)(this.lIIIIlIlIIlllllIIllIIlIII ? 1 : 0));
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        this.IIIllIIlIIIIIIlIlIIllIIlI = class_07752.IlIIIIIllllllIIlllIllllll("xTile");
        this.IllIIlllllllIIlIIlIIIIlIl = class_07752.IlIIIIIllllllIIlllIllllll("yTile");
        this.IIIllIllIIlIlIlIlIllllIIl = class_07752.IlIIIIIllllllIIlllIllllll("zTile");
        this.IllIIIllIIIIlIlIlIllIIlll = Block.lllIIIllIIIIlllIlIIllIIll(class_07752.lIlllIlllIIIIlIIlllIllIII("inTile") & 0xFF);
        this.lllIIIllIIIIlllIlIIllIIll = class_07752.lIlllIlllIIIIlIIlllIllIII("shake") & 0xFF;
        this.lIIIIlIlIIlllllIIllIIlIII = class_07752.lIlllIlllIIIIlIIlllIllIII("inGround") == 1;
    }

    @Override
    public float llIIlllIllIllllIIIlIIIIII() {
        return 0.0f;
    }

    public int IlIllllllIIlIIllllIIlIIIl() {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            return 0;
        }
        int n = 0;
        if (this.IlIllllllIIlIIllllIIlIIIl != null) {
            double d = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
            double d2 = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI - this.llIIlIlIlllIIllIlIlllIllI;
            double d3 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            double d4 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d2 * d2 + d3 * d3);
            double d5 = 0.1;
            this.IlIllllllIIlIIllllIIlIIIl.IIIIIIIIlIllIIllIIlllIllI += d * d5;
            this.IlIllllllIIlIIllllIIlIIIl.IIlIIlIlIlIllIIlIlIIIIlll += d2 * d5 + (double) MathHelper.lllIIIllIIIIlllIlIIllIIll(d4) * 0.08;
            this.IlIllllllIIlIIllllIIlIIIl.llIIIlllIlllIlIllIIIIllIl += d3 * d5;
            n = 3;
        } else if (this.lllIIlIIIllllllIIIIlIlIlI > 0) {
            class_1781 class_17812 = new class_1781(this.lIlIllIIlIIlIIlIIlIIlIIll, this.IlIIlllllIIlIlIlllllIllll, this.llIIlIlIlllIIllIlIlllIllI, this.IllIIIIllIIllIllIlllIlIIl, this.lIlllIlllIIIIlIIlllIllIII());
            double d = this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll - this.IlIIlllllIIlIlIlllllIllll;
            double d6 = this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI - this.llIIlIlIlllIIllIlIlllIllI;
            double d7 = this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl - this.IllIIIIllIIllIllIlllIlIIl;
            double d8 = MathHelper.lllIIIllIIIIlllIlIIllIIll(d * d + d6 * d6 + d7 * d7);
            double d9 = 0.1;
            class_17812.IIIIIIIIlIllIIllIIlllIllI = d * d9;
            class_17812.IIlIIlIlIlIllIIlIlIIIIlll = d6 * d9 + (double) MathHelper.lllIIIllIIIIlllIlIIllIIll(d8) * 0.08;
            class_17812.llIIIlllIlllIlIllIIIIllIl = d7 * d9;
            this.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(class_17812);
            this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll.lllIIIllIIIIlllIlIIllIIll(new class_1138(this.lllIlIIlIIIlIlIIIllIlllIl.lIlIllIIlIIlIIlIIlIIlIIll, this.lllIlIIlIIIlIlIIIllIlllIl.IlIIlllllIIlIlIlllllIllll, this.lllIlIIlIIIlIlIIIllIlllIl.llIIlIlIlllIIllIlIlllIllI + 0.5, this.lllIlIIlIIIlIlIIIllIlllIl.IllIIIIllIIllIllIlllIlIIl + 0.5, this.IlllIIlllllllIIllIlIllllI.nextInt(6) + 1));
            n = 1;
        }
        if (this.lIIIIlIlIIlllllIIllIIlIII) {
            n = 2;
        }
        this.IIIIlIIlIIIllIIIIllIIIlII();
        this.lllIlIIlIIIlIlIIIllIlllIl.IIlIlIIIIlIlllIIlIIlIIIII = null;
        return n;
    }

    private ItemStack lIlllIlllIIIIlIIlllIllIII() {
        float f = this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextFloat();
        int n = class_1250.lIllllIIlIIIlIllllllIIIll(this.lllIlIIlIIIlIlIIIllIlllIl);
        int n2 = class_1250.IIIllIIlIIIIIIlIlIIllIIlI(this.lllIlIIlIIIlIlIIIllIlllIl);
        float f2 = 0.1f - (float)n * 0.025f - (float)n2 * 0.01f;
        float f3 = 0.05f + (float)n * 0.01f - (float)n2 * 0.01f;
        f2 = MathHelper.clamp_float(f2, 0.0f, 1.0f);
        f3 = MathHelper.clamp_float(f3, 0.0f, 1.0f);
        if (f < f2) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(StatList.IlIIlllllIIlIlIlllllIllll, 1);
            return ((class_1260)class_0242.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, lIlllIlllIIIIlIIlllIllIII)).lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI);
        }
        if ((f -= f2) < f3) {
            this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(StatList.llIIlIlIlllIIllIlIlllIllI, 1);
            return ((class_1260)class_0242.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, IlIIIIIllllllIIlllIllllll)).lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI);
        }
        float f4 = f - f3;
        this.lllIlIIlIIIlIlIIIllIlllIl.lllIIIllIIIIlllIlIIllIIll(StatList.lIlllIlllIlIIIIlllIlIlIIl, 1);
        return ((class_1260)class_0242.lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI, lIllllIIlIIIlIllllllIIIll)).lllIIIllIIIIlllIlIIllIIll(this.IlllIIlllllllIIllIlIllllI);
    }

    @Override
    public void IIIIlIIlIIIllIIIIllIIIlII() {
        super.IIIIlIIlIIIllIIIIllIIIlII();
        if (this.lllIlIIlIIIlIlIIIllIlllIl != null) {
            this.lllIlIIlIIIlIlIIIllIlllIl.IIlIlIIIIlIlllIIlIIlIIIII = null;
        }
    }
}

