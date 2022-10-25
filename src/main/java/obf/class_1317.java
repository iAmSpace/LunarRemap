package obf;/*
 * Decompiled with CFR 0.150.
 */
import net.minecraft.block.Block;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.MathHelper;

import java.util.Random;

public class class_1317
extends class_0003 {
    private final class_0013 lllIIIlllIlllIIlIllllIIlI = new class_0013(new class_1421(this), 2, 1);
    public static final float[][] lIIIlIllllIlllIIIIIllIIIl = new float[][]{{1.0f, 1.0f, 1.0f}, {0.85f, 0.5f, 0.2f}, {0.7f, 0.3f, 0.85f}, {0.4f, 0.6f, 0.85f}, {0.9f, 0.9f, 0.2f}, {0.5f, 0.8f, 0.1f}, {0.95f, 0.5f, 0.65f}, {0.3f, 0.3f, 0.3f}, {0.6f, 0.6f, 0.6f}, {0.3f, 0.5f, 0.6f}, {0.5f, 0.25f, 0.7f}, {0.2f, 0.3f, 0.7f}, {0.4f, 0.3f, 0.2f}, {0.4f, 0.5f, 0.2f}, {0.6f, 0.2f, 0.2f}, {0.1f, 0.1f, 0.1f}};
    private int lIIlIlllIIlllIIlllIIlIlII;
    private class_1799 lIIlIIIlIlIIlllIlIllIllIl = new class_1799(this);

    public class_1317(class_1334 class_13342) {
        super(class_13342);
        this.IlIIIIIllllllIIlllIllllll(0.9f, 1.3f);
        this.IllIIIIllIIllIllIlllIlIIl().lllIIIllIIIIlllIlIIllIIll(true);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(0, new class_0866(this));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(1, new class_0826(this, 1.25));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(2, new class_0303(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(3, new class_1801(this, 1.1, Items.wheat, false));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(4, new class_1954(this, 1.1));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(5, this.lIIlIIIlIlIIlllIlIllIllIl);
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(6, new class_0454(this, 1.0));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(7, new class_0235(this, class_0814.class, 6.0f));
        this.IllIIlllllllIIlIIlIIIIlIl.lllIIIllIIIIlllIlIIllIIll(8, new class_0558(this));
        this.lllIIIlllIlllIIlIllllIIlI.lllIlIIlIIIlIlIIIllIlllIl(0, new ItemStack(Items.dye, 1, 0));
        this.lllIIIlllIlllIIlIllllIIlI.lllIlIIlIIIlIlIIIllIlllIl(1, new ItemStack(Items.dye, 1, 0));
    }

    @Override
    protected boolean IIIIlllIIlIllllllIllIIlll() {
        return true;
    }

    @Override
    protected void IllIIIIlIIlllllllllIlIlII() {
        this.lIIlIlllIIlllIIlllIIlIlII = this.lIIlIIIlIlIIlllIlIllIllIl.IllIIlllllllIIlIIlIIIIlIl();
        super.IllIIIIlIIlllllllllIlIlII();
    }

    @Override
    public void d_() {
        if (this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
            this.lIIlIlllIIlllIIlllIIlIlII = Math.max(0, this.lIIlIlllIIlllIIlllIIlIlII - 1);
        }
        super.d_();
    }

    @Override
    protected void llIIlIllIllllIlIIIIlIIlll() {
        super.llIIlIllIllllIlIIIIlIIlll();
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lllIIIllIIIIlllIlIIllIIll).lllIIIllIIIIlllIlIIllIIll(8.0);
        this.lllIIIllIIIIlllIlIIllIIll(class_1152.lIlllIlllIIIIlIIlllIllIII).lllIIIllIIIIlllIlIIllIIll(0.23f);
    }

    @Override
    protected void lllIlIIlIIIlIlIIIllIlllIl() {
        super.lllIlIIlIIIlIlIIIllIlllIl();
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16, new Byte(0));
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(boolean bl, int n) {
        if (!this.lllIIIIlIIllIIIlIllIlllII()) {
            this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Item.getItemFromBlock(Blocks.llllllIlIllllIlIlIlIIIIlI), 1, this.IIlIlIlIIlllIIIlIIIIlIIIl()), 0.0f);
        }
    }

    @Override
    protected Item llIllllIIIIIlIIlIlllIIlll() {
        return Item.getItemFromBlock(Blocks.llllllIlIllllIlIlIlIIIIlI);
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(byte by) {
        if (by == 10) {
            this.lIIlIlllIIlllIIlllIIlIlII = 40;
        } else {
            super.lllIIIllIIIIlllIlIIllIIll(by);
        }
    }

    public float IlIlIIlIlIllIIlIlIIllIIIl(float f) {
        return this.lIIlIlllIIlllIIlllIIlIlII <= 0 ? 0.0f : (this.lIIlIlllIIlllIIlllIIlIlII >= 4 && this.lIIlIlllIIlllIIlllIIlIlII <= 36 ? 1.0f : (this.lIIlIlllIIlllIIlllIIlIlII < 4 ? ((float)this.lIIlIlllIIlllIIlllIIlIlII - f) / 4.0f : -((float)(this.lIIlIlllIIlllIIlllIIlIlII - 40) - f) / 4.0f));
    }

    public float lllllIlllIIllIlIIlIIIllII(float f) {
        if (this.lIIlIlllIIlllIIlllIIlIlII > 4 && this.lIIlIlllIIlllIIlllIIlIlII <= 36) {
            float f2 = ((float)(this.lIIlIlllIIlllIIlllIIlIlII - 4) - f) / 32.0f;
            return 0.62831855f + 0.2199115f * MathHelper.lllIIIllIIIIlllIlIIllIIll(f2 * 28.7f);
        }
        return this.lIIlIlllIIlllIIlllIIlIlII > 0 ? 0.62831855f : this.IlIlIIlllIllllllllIIIlIlI / 57.295776f;
    }

    @Override
    public boolean lIlllIlllIIIIlIIlllIllIII(class_0814 class_08142) {
        ItemStack class_08972 = class_08142.lllIIlIIIllllllIIIIlIlIlI.lllIIIllIIIIlllIlIIllIIll();
        if (class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.llllIIllllIllIlllllIIlIlI && !this.lllIIIIlIIllIIIlIllIlllII() && !this.g_()) {
            if (!this.lIlIllIIlIIlIIlIIlIIlIIll.IllIIIIllIIllIllIlllIlIIl) {
                this.IIIllIllIIlIlIlIlIllllIIl(true);
                int n = 1 + this.IlllIIlllllllIIllIlIllllI.nextInt(3);
                for (int i = 0; i < n; ++i) {
                    class_1781 class_17812 = this.lllIIIllIIIIlllIlIIllIIll(new ItemStack(Item.getItemFromBlock(Blocks.llllllIlIllllIlIlIlIIIIlI), 1, this.IIlIlIlIIlllIIIlIIIIlIIIl()), 1.0f);
                    class_17812.IIlIIlIlIlIllIIlIlIIIIlll += (double)(this.IlllIIlllllllIIllIlIllllI.nextFloat() * 0.05f);
                    class_17812.IIIIIIIIlIllIIllIIlllIllI += (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.1f);
                    class_17812.llIIIlllIlllIlIllIIIIllIl += (double)((this.IlllIIlllllllIIllIlIllllI.nextFloat() - this.IlllIIlllllllIIllIlIllllI.nextFloat()) * 0.1f);
                }
            }
            class_08972.lllIIIllIIIIlllIlIIllIIll(1, (class_1965)class_08142);
            this.lllIIIllIIIIlllIlIIllIIll("mob.sheep.shear", 1.0f, 1.0f);
        }
        return super.lIlllIlllIIIIlIIlllIllIII(class_08142);
    }

    @Override
    public void lllIlIIlIIIlIlIIIllIlllIl(class_0775 class_07752) {
        super.lllIlIIlIIIlIlIIIllIlllIl(class_07752);
        class_07752.lllIIIllIIIIlllIlIIllIIll("Sheared", this.lllIIIIlIIllIIIlIllIlllII());
        class_07752.lllIIIllIIIIlllIlIIllIIll("Color", (byte)this.IIlIlIlIIlllIIIlIIIIlIIIl());
    }

    @Override
    public void lllIIIllIIIIlllIlIIllIIll(class_0775 class_07752) {
        super.lllIIIllIIIIlllIlIIllIIll(class_07752);
        this.IIIllIllIIlIlIlIlIllllIIl(class_07752.lllIIlIIIllllllIIIIlIlIlI("Sheared"));
        this.lIIlIIIIIlIlllIlIIlIlIlll(class_07752.lIlllIlllIIIIlIIlllIllIII("Color"));
    }

    @Override
    protected String lllllllIlIIlIlIIIlIlIIlll() {
        return "mob.sheep.say";
    }

    @Override
    protected String lIIlIlllIIlllIIlllIIlIlII() {
        return "mob.sheep.say";
    }

    @Override
    protected String lIIlIIIlIlIIlllIlIllIllIl() {
        return "mob.sheep.say";
    }

    @Override
    protected void lllIIIllIIIIlllIlIIllIIll(int n, int n2, int n3, Block class_05492) {
        this.lllIIIllIIIIlllIlIIllIIll("mob.sheep.step", 0.15f, 1.0f);
    }

    public int IIlIlIlIIlllIIIlIIIIlIIIl() {
        return this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 0xF;
    }

    public void lIIlIIIIIlIlllIlIIlIlIlll(int n) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xF0 | n & 0xF));
    }

    public boolean lllIIIIlIIllIIIlIllIlllII() {
        return (this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16) & 0x10) != 0;
    }

    public void IIIllIllIIlIlIlIlIllllIIl(boolean bl) {
        byte by = this.IlIlIllIIlIIIIlllIlIllIlI.lllIIIllIIIIlllIlIIllIIll(16);
        if (bl) {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by | 0x10));
        } else {
            this.IlIlIllIIlIIIIlllIlIllIlI.lllIlIIlIIIlIlIIIllIlllIl(16, (byte)(by & 0xFFFFFFEF));
        }
    }

    public static int lllIIIllIIIIlllIlIIllIIll(Random random) {
        int n = random.nextInt(100);
        return n < 5 ? 15 : (n < 10 ? 7 : (n < 15 ? 8 : (n < 18 ? 12 : (random.nextInt(500) == 0 ? 6 : 0))));
    }

    public class_1317 lllIlIIlIIIlIlIIIllIlllIl(class_0650 class_06502) {
        class_1317 class_13172 = (class_1317)class_06502;
        class_1317 class_13173 = new class_1317(this.lIlIllIIlIIlIIlIIlIIlIIll);
        int n = this.lllIIIllIIIIlllIlIIllIIll(this, class_13172);
        class_13173.lIIlIIIIIlIlllIlIIlIlIlll(15 - n);
        return class_13173;
    }

    @Override
    public void IlIlIIlllIllllllllIIIlIlI() {
        this.IIIllIllIIlIlIlIlIllllIIl(false);
        if (this.g_()) {
            this.lllIIIllIIIIlllIlIIllIIll(60);
        }
    }

    @Override
    public class_2025 lllIIIllIIIIlllIlIIllIIll(class_2025 class_20252) {
        class_20252 = super.lllIIIllIIIIlllIlIIllIIll(class_20252);
        this.lIIlIIIIIlIlllIlIIlIlIlll(class_1317.lllIIIllIIIIlllIlIIllIIll(this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII));
        return class_20252;
    }

    private int lllIIIllIIIIlllIlIIllIIll(class_0003 class_00032, class_0003 class_00033) {
        int n = this.lllIlIIlIIIlIlIIIllIlllIl(class_00032);
        int n2 = this.lllIlIIlIIIlIlIIIllIlllIl(class_00033);
        this.lllIIIlllIlllIIlIllllIIlI.llIIllIllIlIIlIIllIllllll(0).lllIlIIlIIIlIlIIIllIlllIl(n);
        this.lllIIIlllIlllIIlIllllIIlI.llIIllIllIlIIlIIllIllllll(1).lllIlIIlIIIlIlIIIllIlllIl(n2);
        ItemStack class_08972 = class_0172.lllIIIllIIIIlllIlIIllIIll().lllIIIllIIIIlllIlIIllIIll(this.lllIIIlllIlllIIlIllllIIlI, ((class_1317)class_00032).lIlIllIIlIIlIIlIIlIIlIIll);
        int n3 = class_08972 != null && class_08972.lllIIIllIIIIlllIlIIllIIll() == Items.dye ? class_08972.IllIIIllIIIIlIlIlIllIIlll() : (this.lIlIllIIlIIlIIlIIlIIlIIll.lllllIlllIIllIlIIlIIIllII.nextBoolean() ? n : n2);
        return n3;
    }

    private int lllIlIIlIIIlIlIIIllIlllIl(class_0003 class_00032) {
        return 15 - ((class_1317)class_00032).IIlIlIlIIlllIIIlIIIIlIIIl();
    }

    @Override
    public /* synthetic */ class_0650 lllIIIllIIIIlllIlIIllIIll(class_0650 class_06502) {
        return this.lllIlIIlIIIlIlIIIllIlllIl(class_06502);
    }
}

